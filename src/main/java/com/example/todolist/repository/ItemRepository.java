package com.example.todolist.repository;

import com.example.todolist.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,String> {
}
