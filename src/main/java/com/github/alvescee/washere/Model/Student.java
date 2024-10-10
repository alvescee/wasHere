package com.github.alvescee.washere.Model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    // Atríbutos
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String chipId;
    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Presence> presences;

    // Construtores

    public Student() {}

    public Student(String chipId, String name) {
        this.chipId = chipId;
        this.name = name;
    }

    // Getter

    public UUID getId() {
        return id;
    }

    public String getChipId() {
        return chipId;
    }

    public String getName() {
        return name;
    }

    public List<Presence> getPresences() {
        return presences;
    }
    
    // Setter

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Hashcode and equals

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((chipId == null) ? 0 : chipId.hashCode());
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
        Student other = (Student) obj;
        if (chipId == null) {
            if (other.chipId != null)
                return false;
        } else if (!chipId.equals(other.chipId))
            return false;
        return true;
    }

}