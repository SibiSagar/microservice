package com.microservice.UserService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;

@Entity
@Table(name = "user_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String fullName;
 private String password;
 private Instant createdTime;
 private String role;

}
