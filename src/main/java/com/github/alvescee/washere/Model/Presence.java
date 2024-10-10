package com.github.alvescee.washere.Model;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Presence implements Serializable {
    
    private static final long serialVersionUID = 1L;

    // Atríbutos

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private boolean isPresent;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    // Construtores

    public Presence() {}

    public Presence(boolean isPresent, Student student, Lesson lesson) {
        this.isPresent = isPresent;
        this.student = student;
        this.lesson = lesson;
    }

    // Getter

    public UUID getId() {
        return id;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public Student getStudent() {
        return student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    // Setter

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    // Hashcode and equals

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((student == null) ? 0 : student.hashCode());
        result = prime * result + ((lesson == null) ? 0 : lesson.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Presence other = (Presence) obj;
        if (student == null) {
            if (other.student != null)
                return false;
        } else if (!student.equals(other.student))
            return false;
        if (lesson == null) {
            if (other.lesson != null)
                return false;
        } else if (!lesson.equals(other.lesson))
            return false;
        return true;
    }

}