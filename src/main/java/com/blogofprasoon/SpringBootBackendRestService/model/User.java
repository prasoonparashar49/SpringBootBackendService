package com.blogofprasoon.SpringBootBackendRestService.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;


    public static void main(String[] args) {
        User user1=  new User((long) 1,"Prasoon","Parashar");
        System.out.println(user1);

    }
}
