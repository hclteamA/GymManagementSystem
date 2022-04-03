package com.springjdbc;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Entity
public class Grn {
    private String id;
    private Date date;
    private Time time;
    private Double pAmount;
    private String shopname;
    private String cashier;
    private List<Grnitem> grnitemsById;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name = "time", nullable = true)
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

  
    @Column(name = "p_amount", nullable = true, precision = 0)
    public Double getpAmount() {
        return pAmount;
    }

    public void setpAmount(Double pAmount) {
        this.pAmount = pAmount;
    }

  
    @Column(name = "shopname", nullable = true, length = 20)
    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    
    @Column(name = "cashier", nullable = false, length = 20)
    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grn grn = (Grn) o;
        return Objects.equals(id, grn.id) && Objects.equals(date, grn.date) && Objects.equals(time, grn.time) && Objects.equals(pAmount, grn.pAmount) && Objects.equals(shopname, grn.shopname) && Objects.equals(cashier, grn.cashier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, time, pAmount, shopname, cashier);
    }

    @OneToMany(mappedBy = "grnByGrnId")
    public List<Grnitem> getGrnitemsById() {
        return grnitemsById;
    }

    public void setGrnitemsById(List<Grnitem> grnitemsById) {
        this.grnitemsById = grnitemsById;
    }
}
