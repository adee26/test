package com.test.demo.repository;

import com.test.demo.entity.Grandchild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrandchildRepository extends JpaRepository<Grandchild, Integer> {
}
