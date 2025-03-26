package com.ivoyant.springboot.service;

import com.ivoyant.springboot.dto.Restaurant;
import com.ivoyant.springboot.repository.RestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class RestService {
    @Autowired
    RestRepo restRepo;

    public ResponseEntity<Object> save(Restaurant restaurant) {
//       HashMap<String,Object> hashMap=new HashMap<>();
         Restaurant savedRestaurant=restRepo.save(restaurant);

//        hashMap.put("Menu", "Saved");
//        hashMap.put("Food",restaurant);
        return new ResponseEntity<>(savedRestaurant,HttpStatus.CREATED);
    }

    public ResponseEntity<Object> getFood() {
//      HashMap<String,Object> hashMap=new HashMap<>();
        List<Restaurant> lst=restRepo.findAll();
        if(lst.isEmpty()){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(lst, HttpStatus.CREATED);
        }

    }

    public ResponseEntity<Object> getFoodById(int id) {
        Optional<Restaurant> food = restRepo.findById(id);
        if (food.isEmpty()) {
            System.out.println("Food Not Found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(food, HttpStatus.CREATED);

        }

    }

    public ResponseEntity<Object> getFoodByName(String name) {
        Optional<Restaurant> food = restRepo.findByFood(name);
        if (food.isEmpty()) {
            System.out.println("Food Not Found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
        else{
            return new ResponseEntity<>(food, HttpStatus.CREATED);

        }
    }
}
