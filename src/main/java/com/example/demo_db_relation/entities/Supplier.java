package com.example.demo_db_relation.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Supplier {

    @Id
    @Column(name = "Supplier_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierId;

    @Column(name = "Supplier_Name")
    private String supplierName;

    @Column(name = "Contact_No")
    private String contactNo;

    @Column(name = "Address")
    private String address;

    @OneToMany(mappedBy = "supplier",cascade = CascadeType.PERSIST)
    private List<FoodItem> foodItem = new ArrayList<>();

    public Supplier() {
    }

    public Supplier(String supplierName, String contactNo, String address) {
        this.supplierName = supplierName;
        this.contactNo = contactNo;
        this.address = address;
    }

    public void addFoodItem(FoodItem foodItem){
        foodItem.setSupplier(this);
        this.foodItem.add(foodItem);
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<FoodItem> getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(List<FoodItem> foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
