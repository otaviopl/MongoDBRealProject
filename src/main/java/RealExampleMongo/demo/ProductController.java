package RealExampleMongo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductController {
    @PostMapping("/products")
    public List<Produto> addProduct(@RequestBody final List<Produto> produtos){

    }
    @GetMapping
}
