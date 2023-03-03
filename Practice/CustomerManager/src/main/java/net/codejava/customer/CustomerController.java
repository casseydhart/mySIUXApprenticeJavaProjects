package net.codejava.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class CustomerController {

   @Autowired
   private CustomerService customerService;

   // handler methods will go here...
   @RequestMapping("/")
   public ModelAndView home() {
       List<Customer> listCustomer = customerService.listAll();
       ModelAndView mav = new ModelAndView("index");
       mav.addObject("listCustomer", listCustomer);
       return mav;
   }

}
