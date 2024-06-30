/* Author @ Nishant Suresh Sonar 
created on 25/06/24 
inside the package - com.contactManagementSystem.Controller */
package com.contactManagementSystem.Controller;

import com.contactManagementSystem.Entites.Contact;
import com.contactManagementSystem.Service.ContactInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactInterface contactService;

    @PostMapping()
    public String  saveContact(@RequestBody Contact contact) {
         contactService.save(contact);
         return "Contact Details Saved Successfully.";
    }
    @PutMapping()
    public Contact  updateContact(@RequestBody Contact contact) {
       return contactService.update(contact);
//        return "Contact Details Saved Successfully.";
    }
    @DeleteMapping()
    public String  deleteContact(@RequestParam("id") Integer contactId) {
         contactService.delete(contactId);
        return "Contact Details Deleted Successfully.";
    }
    @GetMapping()
    public List<Contact> getAllContact() {
        return contactService.findAll();
    }
}
