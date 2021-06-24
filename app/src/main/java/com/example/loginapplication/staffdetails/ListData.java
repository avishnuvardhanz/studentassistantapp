package com.example.loginapplication.staffdetails;

public class ListData {
    private String id;
    private String name;
    private String designation;
    private String ImageUrl;
    private String Email;
    private String number;

    public ListData(){


    }

    public ListData(String id, String name, String ImageUrl, String designation, String Email, String number) {
        this.id = id;
        this.name = name;
        this.ImageUrl=ImageUrl;
        this.designation=designation;
        this.Email=Email;
        this.number=number;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmail() {
        return Email;
    }

    public String getNumber() {
        return number;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getImageUrl() {
        return ImageUrl;
    }
}