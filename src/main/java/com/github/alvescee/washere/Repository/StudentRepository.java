package com.github.alvescee.washere.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.alvescee.washere.Model.Student;

public interface StudentRepository extends JpaRepository<Student, UUID> {}