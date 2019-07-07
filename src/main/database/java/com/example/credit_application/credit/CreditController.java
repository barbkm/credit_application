package com.example.credit_application.credit;

import com.example.credit_application.customer.Customer;
import com.example.credit_application.product.Product;
import com.example.credit_application.customer.CustomerRepository;
import com.example.credit_application.product.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class CreditController {

    private CreditRepository creditRepository;
    private CustomerRepository customerRepository;
    private ProductRepository productRepository;

    public CreditController(CreditRepository creditRepository, CustomerRepository customerRepository, ProductRepository productRepository) {
        this.creditRepository = creditRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/createCredit")
    public String createCredit()
    {
        return "createCreidt";
    }


    @PostMapping ("/create")
    public String createCredit(@RequestParam String firstName,
                      @RequestParam String lastName,
                      @RequestParam String pesel,
                      @RequestParam String productName,
                      @RequestParam int productVelue,
                      @RequestParam String creditName) {

       Credit credit = new Credit();
       credit.setCreditName(creditName);
       creditRepository.save(credit);

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setSurname(lastName);
        customer.setPesel(pesel);
        customer.setCreditId(credit.getId());
        customerRepository.save(customer);


        Product product = new Product();
        product.setProductName(productName);
        product.setCreditId(credit.getId());
        product.setProductValue(productVelue);
        productRepository.save(product);

        return "redirect:" + ("/creditID?id=" + credit.getId());

        //return "";
    }

    @RequestMapping("/creditID")
    String creditID(@RequestParam int id, Model model)
    {
        Credit credit = creditRepository.findById(id);
        model.addAttribute("credit",credit);
        return "creditID";
    }


    @RequestMapping("/creditInfo")
    public String credtisList(Model model)
    {
        List<Credit> credits= creditRepository.findAll();
        List<Customer> customers = customerRepository.findAll();
        List<Product> products = productRepository.findAll();
        List<CreditInfo> creditInfos = new ArrayList<>();

        for (Credit credit :credits) {

            for(Customer customer:customers) {
                    for(Product product:products) {
                        if (credit.getId() == customer.getCreditId() && credit.getId() == product.getCreditId()) {
                            creditInfos.add(new CreditInfo(credit,customer,product));
                        }
                    }
            }

        }

        model.addAttribute("creditInfos",creditInfos);
        return "creditInfromation";
    }

}
