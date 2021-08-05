package com.example.contact_service.service;

import com.example.contact_service.entity.Contact;

import java.util.List;
import java.util.stream.Collectors;

public interface ContactService {
    public List<Contact> getContactsOfUser(Long userId);
}
