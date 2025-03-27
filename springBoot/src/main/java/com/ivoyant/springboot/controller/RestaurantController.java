package com.ivoyant.springboot.controller;

import com.ivoyant.springboot.dto.Restaurant;
import com.ivoyant.springboot.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestaurantController {
    @Autowired
    RestService restService;

    @PostMapping("/food")
    public ResponseEntity<Object> postFood(@RequestBody Restaurant restaurant){
         return restService.save(restaurant);
    }

    @GetMapping("/food")
    public ResponseEntity<Object> getFood(){
        return restService.getFood();
    }
//
    @GetMapping("/getFoodById/{id}")
    public ResponseEntity<Object> getFoodById(@PathVariable int id){
        return restService.getFoodById(id);
    }
//
    @GetMapping("/getFoodByName/{name}")
    public ResponseEntity<Object> getFoodByName(@PathVariable String name){
        return restService.getFoodByName(name);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable int id){
        return restService.deleteById(id);
    }


}
