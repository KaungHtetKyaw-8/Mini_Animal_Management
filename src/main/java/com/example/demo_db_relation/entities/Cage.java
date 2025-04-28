package com.example.demo_db_relation.entities;

import jakarta.persistence.*;

@Entity
public class Cage {

    @Id
    @Column(name = "Cage_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cageId;

    @Column(name = "Cage_No")
    private int cageNo;

    @Column(name = "Location")
    private String location;

    @OneToOne
    @JoinColumn(name = "Animal_Id")
    private Animal animal;

    public Cage() {
    }

    public Cage(int cageNo, String location) {
        this.cageNo = cageNo;
        this.location = location;
    }

    public void addAnimal(Animal animal){
        animal.setCage(this);
        this.animal = animal;
    }

    public Integer getCageId() {
        return cageId;
    }

    public void setCageId(Integer cageId) {
        this.cageId = cageId;
    }

    public int getCageNo() {
        return cageNo;
    }

    public void setCageNo(int cageNo) {
        this.cageNo = cageNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Cage{" +
                "cageId=" + cageId +
                ", cageNo=" + cageNo +
                ", location='" + location + '\'' +
                '}';
    }
}
