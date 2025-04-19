package com.example.demo_db_relation.entities;

import jakarta.persistence.*;

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

    @OneToOne(mappedBy = "animal")
    private Cage cage;

    @ManyToOne
    private Category category;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private FoodItem foodItem;

    public Animal() {
    }

    public Animal(String type, int totalNumber) {
        this.type = type;
        this.totalNumber = totalNumber;
    }

    public void addCategory(Category category){
        category.setAnimal(this);
        this.category = category;
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
}
