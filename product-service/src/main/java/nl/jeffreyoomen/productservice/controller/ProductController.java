package nl.jeffreyoomen.productservice.controller;

import lombok.RequiredArgsConstructor;
import nl.jeffreyoomen.productservice.dto.ProductRequest;
import nl.jeffreyoomen.productservice.dto.ProductResponse;
import nl.jeffreyoomen.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

}
