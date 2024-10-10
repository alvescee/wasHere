package com.github.alvescee.washere.Model;

import java.io.Serializable;
import java.util.Calendar;
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
public class Lesson implements Serializable {
    
    private static final long serialVersionUID = 1L;

    // Atríbutos

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String about;

    private Calendar start;
    private Calendar finish;

    @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Presence> presences;

    // Construtores

    public Lesson() {}

    public Lesson(String about, Calendar start, Calendar finish) {
        this.about = about;
        this.start = start;
        this.finish = finish;
    }

    // Getter

    public UUID getId() {
        return id;
    }

    public String getAbout() {
        return about;
    }

    public Calendar getStart() {
        return start;
    }

    public Calendar getFinish() {
        return finish;
    }

    public List<Presence> getPresences() {
        return presences;
    }

    // Setter

    public void setAbout(String about) {
        this.about = about;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public void setFinish(Calendar finish) {
        this.finish = finish;
    }

    // Hashcode and equals

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((start == null) ? 0 : start.hashCode());
        result = prime * result + ((finish == null) ? 0 : finish.hashCode());
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
        Lesson other = (Lesson) obj;
        if (start == null) {
            if (other.start != null)
                return false;
        } else if (!start.equals(other.start))
            return false;
        if (finish == null) {
            if (other.finish != null)
                return false;
        } else if (!finish.equals(other.finish))
            return false;
        return true;
    }

}