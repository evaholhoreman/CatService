package com.eva.catProject.domain.domainobject;

import javax.persistence.*;

@Entity
@Table(name = "cats")
public class Cat {

    @Id
    @GeneratedValue
    private Long id;
    private String breed;
    private String color;
    private String name;
    private Integer age;
    @Column(name = "number_of_siblings")
    private Integer numberOfSiblings;
    @Column(name = "living_with_sibling")
    private Boolean livingWithSibling;
    private Boolean happy;
    private Boolean hungry;

    public Cat() {

    }

    public Cat(String breed, String color, String name, int numberOfSiblings) {
        this.breed = breed;
        this.color = color;
        this.name = name;
        this.numberOfSiblings = numberOfSiblings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfSiblings() {
        return numberOfSiblings;
    }

    public void setNumberOfSiblings(Integer numberOfSiblings) {
        this.numberOfSiblings = numberOfSiblings;
    }

    public Boolean isLivingWithSibling() {
        return livingWithSibling;
    }

    public void setLivingWithSibling(Boolean livingWithSibling) {
        this.livingWithSibling = livingWithSibling;
    }

    public Boolean isHappy() {
        return happy;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public Boolean isHungry() {
        return hungry;
    }

    public void setHungry(Boolean hungry) {
        this.hungry = hungry;
    }
}
