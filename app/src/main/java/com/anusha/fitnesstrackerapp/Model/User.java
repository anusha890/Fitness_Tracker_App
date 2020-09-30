package com.anusha.fitnesstrackerapp.Model;

public class User {
    String id;
    String fullname;
    String phoneNumber;
    String work;
    String country;
    String email;
    String password;
    String profileImage;
    String status;
    public User(){

    }
    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public User(String id, String fullname, String phoneNumber, String work, String country, String email, String password, String profileImage, String status) {
        this.id = id;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.work = work;
        this.country = country;
        this.email = email;
        this.password = password;
        this.profileImage = profileImage;
        this.status = status;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
