package com.example.karanu.restaurantapplication;

/**
 * Created by Karanu on 1/4/2018.
 */

import java.util.ArrayList;

public class ModelClass {
    //used to save app data

    static String name = null;
    static String email= null;
    static String phone= null;
    static String address = null;
    public static ArrayList<String> al;


/*	public ModelClass(String name,String phone,String email,String address){
		ModelClass.name = name;
		ModelClass.phone = phone;
		ModelClass.email = email;
		ModelClass.address = address;
	}*/





    public static void createList() {
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
