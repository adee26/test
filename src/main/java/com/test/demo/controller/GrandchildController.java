package com.test.demo.controller;

import com.test.demo.entity.Grandchild;
import com.test.demo.service.GrandchildService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/grandchild")
public class GrandchildController {

    private final GrandchildService grandchildService;

    @PostMapping
    public ResponseEntity<Grandchild> createGrandchild(Grandchild grandchild) {
        return ResponseEntity.ok(grandchildService.createGrandchild(grandchild));
    }
}
