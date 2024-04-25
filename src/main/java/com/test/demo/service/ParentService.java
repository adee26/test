package com.test.demo.service;

import com.test.demo.entity.Parent;
import com.test.demo.repository.ParentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParentService {

    private final ParentRepository parentRepository;

    public Parent createParent(Parent parent) {
        return parentRepository.save(parent);
    }

    public void deleteParent(Integer id) {
        parentRepository.deleteById(id);
    }
}
