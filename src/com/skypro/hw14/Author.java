package com.skypro.hw14;

public class Author {
    public String name;
    public String lastName;

    public Author (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public String fullNameAuthor (){
        return name + " " + lastName;

    }
}
