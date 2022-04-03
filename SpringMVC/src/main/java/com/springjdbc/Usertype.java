package com.springjdbc;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Usertype {
    private int usertypeid;
    private String usertype;
    private List<User> usersByUsertypeid;

    @Id
    @Column(name = "usertypeid", nullable = false)
    public int getUsertypeid() {
        return usertypeid;
    }

    public void setUsertypeid(int usertypeid) {
        this.usertypeid = usertypeid;
    }

    
    @Column(name = "usertype", nullable = true, length = 25)
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usertype usertype1 = (Usertype) o;
        return usertypeid == usertype1.usertypeid && Objects.equals(usertype, usertype1.usertype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usertypeid, usertype);
    }

    @OneToMany(mappedBy = "usertypeByUsertypeid")
    public Collection<User> getUsersByUsertypeid() {
        return usersByUsertypeid;
    }

    public void setUsersByUsertypeid(List<User> usersByUsertypeid) {
        this.usersByUsertypeid = usersByUsertypeid;
    }
}
