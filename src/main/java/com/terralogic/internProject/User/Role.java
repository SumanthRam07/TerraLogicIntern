package com.terralogic.internProject.User;


import jakarta.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long roleId;

    @Column(nullable = false, unique = true)
    private String name;



     @ManyToOne
     private User user ;


    public Role() {
    }


    public Role(Long roleId, String name, User user) {
        this.roleId = roleId;
        this.name = name;
        this.user = user;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
