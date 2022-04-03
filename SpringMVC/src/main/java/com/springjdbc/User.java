package com.springjdbc;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {
    private String username;
    private String password;
    private int usertypeid;
    private int id;
    private Integer approve;
    private Usertype usertypeByUsertypeid;
    private Userdata userdataById;

    @Id
    @Column(name = "username", nullable = false, length = 30)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    @Column(name = "password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name = "usertypeid", nullable = false)
    public int getUsertypeid() {
        return usertypeid;
    }

    public void setUsertypeid(int usertypeid) {
        this.usertypeid = usertypeid;
    }

   
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    @Column(name = "approve", nullable = true)
    public Integer getApprove() {
        return approve;
    }

    public void setApprove(Integer approve) {
        this.approve = approve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return usertypeid == user.usertypeid && id == user.id && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(approve, user.approve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, usertypeid, id, approve);
    }

    @ManyToOne
    @JoinColumn(name = "usertypeid", referencedColumnName = "usertypeid", nullable = false)
    public Usertype getUsertypeByUsertypeid() {
        return usertypeByUsertypeid;
    }

    public void setUsertypeByUsertypeid(Usertype usertypeByUsertypeid) {
        this.usertypeByUsertypeid = usertypeByUsertypeid;
    }

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Userdata getUserdataById() {
        return userdataById;
    }

    public void setUserdataById(Userdata userdataById) {
        this.userdataById = userdataById;
    }
}
