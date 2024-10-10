package com.github.alvescee.washere.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.alvescee.washere.Model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, UUID> {}