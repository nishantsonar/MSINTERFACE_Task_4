/* Author @ Nishant Suresh Sonar 
created on 25/06/24 
inside the package - com.contactManagementSystem.Service */
package com.contactManagementSystem.Service;

import com.contactManagementSystem.Entites.Contact;

import java.util.List;

public interface ContactInterface {
    void save(Contact contact);
    Contact update(Contact contact);
    void delete(Integer contactId);
    Contact findById(Integer contactId);
    List<Contact> findAll();

}
