package com.company;

import java.util.ArrayList;

public class Invoice {


    private ArrayList<Item> items;
    private String customerName;
    private String email;

    public Invoice(){

    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
