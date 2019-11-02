package com.test.project.repositories;

import com.test.project.entities.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface TestRepository extends JpaRepository<Name, Long> {
}
