/* Author @ Nishant Suresh Sonar 
created on 25/06/24 
inside the package - com.contactManagementSystem.Repository */
package com.contactManagementSystem.Repository;

import com.contactManagementSystem.Entites.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
