package com.test.demo.service;

import com.test.demo.entity.Child;
import com.test.demo.repository.ChildRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChildService {

    private final ChildRepository childRepository;

    public Child createChild(Child child) {
        return childRepository.save(child);
    }

}
