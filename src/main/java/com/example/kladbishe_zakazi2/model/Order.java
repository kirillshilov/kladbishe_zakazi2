package com.example.kladbishe_zakazi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity

public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private String numberOfDistrict;

    private String nameOfCustomer;

    private String nameOfDeadMan;

    private String telephoneNumber;

    private String ListOfWorks;

    private Integer sum;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberOfDistrict() {
        return numberOfDistrict;
    }

    public void setNumberOfDistrict(String numberOfDistrict) {
        this.numberOfDistrict = numberOfDistrict;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getNameOfDeadMan() {
        return nameOfDeadMan;
    }

    public void setNameOfDeadMan(String nameOfDeadMan) {
        this.nameOfDeadMan = nameOfDeadMan;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getListOfWorks() {
        return ListOfWorks;
    }

    public void setListOfWorks(String listOfWorks) {
        ListOfWorks = listOfWorks;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", numberOfDistrict='" + numberOfDistrict + '\'' +
                ", nameOfCustomer='" + nameOfCustomer + '\'' +
                ", nameOfDeadMan='" + nameOfDeadMan + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", ListOfWorks='" + ListOfWorks + '\'' +
                ", sum=" + sum +
                '}';
    }
}
