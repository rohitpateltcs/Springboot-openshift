package springboot.practice.springboot.practice.silent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/")
    public String TestController(){
        return "Welcome to my first Application on page";
    }
}
