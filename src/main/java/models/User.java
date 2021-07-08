package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tbl_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name", nullable = false, length = 250)
    private String name;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name="tblUserRoles",
            joinColumns = {@JoinColumn(name="userId", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name="roleId", referencedColumnName = "id")}
    )
    private List<Role> roles;

    public User() {
        roles = new ArrayList<Role>();
    }

    public User(String name) {
        this.name = name;
        roles = new ArrayList<Role>();
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
