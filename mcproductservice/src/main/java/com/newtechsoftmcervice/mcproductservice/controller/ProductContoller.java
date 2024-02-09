package com.newtechsoftmcervice.mcproductservice.controller;

import com.newtechsoftmcervice.mcproductservice.productdto.ProductRequest;
import com.newtechsoftmcervice.mcproductservice.productdto.ProductResponce;
import com.newtechsoftmcervice.mcproductservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductContoller {

    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  void cretateProduct(@RequestBody ProductRequest productRequest){
          productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponce> getAllProducts(){


        return productService.getAllProducts();
    }
}
