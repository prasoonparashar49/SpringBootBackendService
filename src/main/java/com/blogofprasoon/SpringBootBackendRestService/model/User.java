package com.blogofprasoon.SpringBootBackendRestService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class User {

    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;

/*
   @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }*/

    public static void main(String[] args) {
        User user1=  new User((long) 1,"Prasoon","Parashar");
        System.out.println(user1);

    }
}
