package com.example.contact_service.service;

import com.example.contact_service.entity.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> listOfContact = List.of(
            new Contact(1L, "adam.smith@gmail.com", "Adam Smith", 1311L),
            new Contact(2L, "helena.jonson@gmail.com", "Helena Johnson", 1311L),
            new Contact(3L, "maria@gorge.com", "Maria Jorge", 1311L),
            new Contact(4L, "anil.singh@gmail.com", "Anil Singh", 1312L),
            new Contact(5L, "viany.singh@gmail.com", "Vinay Singh", 1312L),
            new Contact(6L, "vivek.singh@gmail.com", "Vivek Singh", 1312L),
            new Contact(7L, "dummy.abc@gmail.com", "ABC Dummy", 1313L),
            new Contact(8L, "dummy.pqr@gmail.com", "PQR Dummy", 1313L),
            new Contact(9L, "dummy.xyz@gmail.com", "XYZ Dummy", 1313L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return listOfContact.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
    }
}
