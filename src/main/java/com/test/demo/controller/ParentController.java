package com.test.demo.controller;

import com.test.demo.entity.Parent;
import com.test.demo.service.ParentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
@RequiredArgsConstructor
public class ParentController {

    private final ParentService parentService;

    @PostMapping
    public ResponseEntity<Parent> createParent(@RequestBody Parent parent) {
        return ResponseEntity.ok().body(parentService.createParent(parent));
    }

    @DeleteMapping("/{id}")
    public void deleteParent(@PathVariable Integer id) {
        parentService.deleteParent(id);
    }
}
