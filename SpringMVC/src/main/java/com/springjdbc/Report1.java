package com.springjdbc;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Report1 {
    private String id;
    private Date date;
    private Time time;
    private String cashier;
    private Double total;
    private List<Exp> expsById;

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

   
    @Column(name = "cashier", nullable = true, length = 20)
    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

   
    @Column(name = "total", nullable = true, precision = 0)
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report1 report1 = (Report1) o;
        return Objects.equals(id, report1.id) && Objects.equals(date, report1.date) && Objects.equals(time, report1.time) && Objects.equals(cashier, report1.cashier) && Objects.equals(total, report1.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, time, cashier, total);
    }

    @OneToMany(mappedBy = "report1ByReport1Id")
    public Collection<Exp> getExpsById() {
        return expsById;
    }

    public void setExpsById(List<Exp> expsById) {
        this.expsById = expsById;
    }
}
