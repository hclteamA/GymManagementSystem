package com.springjdbc;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Userdata {
    private int id;
    private String name;
    private String img;
    private List<User> usersById;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    @Column(name = "name", nullable = true, length = 25)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name = "img", nullable = true, length = 255)
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userdata userdata = (Userdata) o;
        return id == userdata.id && Objects.equals(name, userdata.name) && Objects.equals(img, userdata.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, img);
    }

    @OneToMany(mappedBy = "userdataById")
    public Collection<User> getUsersById() {
        return usersById;
    }

    public void setUsersById(List<User> usersById) {
        this.usersById = usersById;
    }
}
