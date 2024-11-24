package com.example.restaurant.service;

import com.example.restaurant.model.Menu;
import com.example.restaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    public Menu save(Menu menu) {
        return menuRepository.save(menu);
    }

    public void deleteById(Long id) {
        menuRepository.deleteById(id);
    }
}