package com.example.todolist.controller;

import com.example.todolist.entity.Item;
import com.example.todolist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(value = "*")
@RestController
@RequestMapping("/todos")
public class ItemController {

    @PostMapping(produces = {"application/json"})
    public ResponseEntity addItem(@RequestBody Item newItem){
        itemService.addNewItem(newItem);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity getAllItem(){
        List<Item> allItem=itemService.getAllItem();
        return ResponseEntity.ok().body(allItem);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id){
        itemService.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
