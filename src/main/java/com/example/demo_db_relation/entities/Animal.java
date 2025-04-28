package com.example.demo_db_relation.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Animal {

    @Id
    @Column(name = "Animal_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer animalId;

    @Column(name = "Animal_Type")
    private String type;

    @Column(name = "Total_Number")
    private int totalNumber;

    @OneToOne(mappedBy = "animal",cascade = CascadeType.PERSIST)
    private Cage cage;

    @ManyToOne
    @JoinColumn(name = "Category_Id")
    private Category category;

    @ManyToMany
    private List<FoodItem> foodItem = new ArrayList<>();

    public Animal() {
    }

    public Animal(String type, int totalNumber) {
        this.type = type;
        this.totalNumber = totalNumber;
    }

    public void addFoodItem(FoodItem foodItem){
        foodItem.getAnimal().add(this);
        this.foodItem.add(foodItem);
    }

    public void addCage(Cage cage){
        cage.setAnimal(this);
        this.cage = cage;
    }


    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", type='" + type + '\'' +
                ", totalNumber=" + totalNumber +
                ", cage=" + cage +
                ", foodItem=" + foodItem +
                '}';
    }
}
