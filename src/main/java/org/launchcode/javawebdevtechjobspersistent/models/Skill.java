package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> job = new ArrayList<>();

    public Skill(String description) {
        super();
        this.description = description;

    }
    public Skill (){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}