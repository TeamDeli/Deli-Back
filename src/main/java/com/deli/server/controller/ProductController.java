package com.deli.server.controller;

import com.deli.server.dto.ProductListDto;
import com.deli.server.dto.ProductSearchCondition;
import com.deli.server.model.Product;
import com.deli.server.repository.ProductRepository;
import com.deli.server.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductRepository productRepository;
    private final ProductService productService;

    @CrossOrigin(origins = "*")
    @GetMapping("/getProducts")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK); // 200
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/getProducts")
    public ResponseEntity<?> searchMember(@RequestBody ProductSearchCondition condition){
        System.out.println(condition.getGender());
        System.out.println(condition.getAge());
        System.out.println(condition.getPrice());
        System.out.println(condition.getPrice().get(0));
        System.out.println(condition.getPrice().get(1));
        List<ProductListDto> result = productRepository.search(condition);
        System.out.println(result);
        return new ResponseEntity<List<ProductListDto>>(result, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<?> productById(@PathVariable int id){
        Product p = productService.getProductById(id);
        System.out.println(p);
        return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/search")
    public ResponseEntity<?> searchKeywords(@RequestParam(value="keyword") String keyword) {
        List<ProductListDto> searchResult = productService.searchPosts(keyword);
        return new ResponseEntity<List<ProductListDto>>(searchResult, HttpStatus.OK);
    }

}
