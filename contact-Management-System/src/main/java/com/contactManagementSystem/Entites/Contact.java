/* Author @ Nishant Suresh Sonar 
created on 25/06/24 
inside the package - com.contactManagementSystem.Entites */
package com.contactManagementSystem.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter@Setter@Data@NoArgsConstructor@AllArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
}
