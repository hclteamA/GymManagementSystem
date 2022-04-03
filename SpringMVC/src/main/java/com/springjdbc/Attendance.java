package com.springjdbc;


import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Attendance {
    private Date date;
    private Time intime;
    private Integer status;
    private String cid;
    private Client clientByCid;

    @Id
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name = "intime", nullable = true)
    public Time getIntime() {
        return intime;
    }

    public void setIntime(Time intime) {
        this.intime = intime;
    }

    
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Id
    @Column(name = "cid", nullable = false, length = 20)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendance that = (Attendance) o;
        return Objects.equals(date, that.date) && Objects.equals(intime, that.intime) && Objects.equals(status, that.status) && Objects.equals(cid, that.cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, intime, status, cid);
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid", nullable = false)
    public Client getClientByCid() {
        return clientByCid;
    }

    public void setClientByCid(Client clientByCid) {
        this.clientByCid = clientByCid;
    }
}
