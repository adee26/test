package com.test.demo.service;

import com.test.demo.entity.Grandchild;
import com.test.demo.repository.GrandchildRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GrandchildService {

    private final GrandchildRepository grandchildRepository;

    public Grandchild createGrandchild(Grandchild grandchild) {
        return grandchildRepository.save(grandchild);
    }

}
