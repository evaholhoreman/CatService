package com.eva.catProject.controller.dto;

public class CatDTO {

    private String breed;
    private String color;
    private String name;
    private Integer age;
    private Integer numberOfSiblings;
    private Boolean livingWithSibling;
    private Boolean happy;
    private Boolean hungry;

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
