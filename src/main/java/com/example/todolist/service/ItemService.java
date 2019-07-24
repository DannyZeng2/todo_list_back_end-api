package com.example.todolist.service;

import com.example.todolist.entity.Item;
import com.example.todolist.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;


    public List<Item> getAllItem(){
        return itemRepository.findAll();
    }

    public void deleteById(String id) {
        itemRepository.deleteById(id);
    }

    public void addNewItem(Item newItem) {
        itemRepository.saveAndFlush(newItem);
    }

}
