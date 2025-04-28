package com.example.demo_db_relation.component;

import com.example.demo_db_relation.entities.Category;
import org.springframework.stereotype.Component;

@Component
public class AnimalData {
    private String animalName;
    private int animalCount;
    private int cageNumber;
    private String cageLocation;

    public void setData(Category category){
        this.animalName = category.getAnimal().get(0).getType();
        this.animalCount = category.getAnimal().get(0).getTotalNumber();
        this.cageNumber = category.getAnimal().get(0).getCage().getCageNo();
        this.cageLocation = category.getAnimal().get(0).getCage().getLocation();
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public int getCageNumber() {
        return cageNumber;
    }

    public void setCageNumber(int cageNumber) {
        this.cageNumber = cageNumber;
    }

    public String getCageLocation() {
        return cageLocation;
    }

    public void setCageLocation(String cageLocation) {
        this.cageLocation = cageLocation;
    }

    @Override
    public String toString() {
        return "AnimalData{" +
                "animalName='" + animalName + '\'' +
                ", animalCount=" + animalCount +
                ", cageNumber=" + cageNumber +
                ", cageLocation='" + cageLocation + '\'' +
                '}';
    }
}
