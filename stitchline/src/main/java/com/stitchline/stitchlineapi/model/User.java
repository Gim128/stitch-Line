package com.stitchline.stitchlineapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Document("user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private  String id;
    @Field(name = "name")
    @Indexed(unique = true)
    private String name;
    @Field(name = "email")
    @Indexed(unique = true)
    private  String email;
    @Field(name = "mobile")
    @Indexed(unique = true)
    private String mobile;
    @Field(name = "username")
    @Indexed(unique = true)
    private String username;
    @Field(name = "password")
    @Indexed(unique = true)
    private String password;
    @Field(name = "role")
    @Indexed(unique = true)
    private String role;
    @Field(name = "data")
    @Indexed(unique = true)
    private ArrayList data = new ArrayList();


}
