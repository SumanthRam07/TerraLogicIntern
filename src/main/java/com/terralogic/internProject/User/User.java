package com.terralogic.internProject.User;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.TimeZone;

@Entity
@Table(name = "students")
public class User {

    @Id
    @GeneratedValue()
    int id ;

     @Column(nullable = false , unique = true)
    String username ;

     String firstname ;

     String middlename ;

     String lastname ;

     String password ;

    @Column(nullable = false , unique = true)
     String email ;

    @Column(nullable = false , unique = true)
     String contact ;


     LocalDate ExpirationDate ;

     String Description ;

     LocalTime Timeout ;

     LocalDateTime format ;


     String Role ;

    String scope  ;

   String groupName ;

 String  language ;

    String  organization  ;

     TimeZone timeZone ;

     String memo ;


     public User()
     {

     }


    public User(int id, String username, String firstname, String middlename, String lastname, String password, String email, String contact, LocalDate expirationDate, String description, LocalTime timeout, LocalDateTime format, String role, String scope, String groupName, String language, String organization, TimeZone timeZone, String memo) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.contact = contact;
        ExpirationDate = expirationDate;
        Description = description;
        Timeout = timeout;
        this.format = format;
        Role = role;
        this.scope = scope;
        this.groupName = groupName;
        this.language = language;
        this.organization = organization;
        this.timeZone = timeZone;
        this.memo = memo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public LocalDate getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalTime getTimeout() {
        return Timeout;
    }

    public void setTimeout(LocalTime timeout) {
        Timeout = timeout;
    }

    public LocalDateTime getFormat() {
        return format;
    }

    public void setFormat(LocalDateTime format) {
        this.format = format;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
