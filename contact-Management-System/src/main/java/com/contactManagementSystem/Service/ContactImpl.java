/* Author @ Nishant Suresh Sonar 
created on 25/06/24 
inside the package - com.contactManagementSystem.Service */
package com.contactManagementSystem.Service;

import com.contactManagementSystem.Entites.Contact;
import com.contactManagementSystem.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContactImpl implements ContactInterface{

@Autowired
private ContactRepository contactRepository;
    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public Contact update(Contact contact) {
        Optional<Contact> oldContactDetails = contactRepository.findById(contact.getId());
        Contact updatedContact = oldContactDetails.get();
        if (oldContactDetails.isPresent()) {
            updatedContact.setName(contact.getName());
            updatedContact.setEmailAddress(contact.getEmailAddress());
            updatedContact.setPhoneNumber(contact.getPhoneNumber());

        }
        return contactRepository.save(updatedContact);
    }

    @Override
    public void delete(Integer contactId) {
            contactRepository.deleteById(contactId);
    }

    @Override
    public Contact findById(Integer contactId) {
        return contactRepository.findById(contactId).get();
    }

    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }
}
