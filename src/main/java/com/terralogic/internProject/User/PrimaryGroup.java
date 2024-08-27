package com.terralogic.internProject.User;


public class PrimaryGroup {

    String name ;


    public PrimaryGroup(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrimaryGroup{" +
                "name='" + name + '\'' +
                '}';
    }




}
