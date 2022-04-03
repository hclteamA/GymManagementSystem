package com.springjdbc;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Entity
public class Report {
    private String id;
    private Date date;
    private Time time;
    private String cashier;
    private Double total;
    private Double balance;
    private List<Reportitem> reportitemsById;

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

   
    @Column(name = "balance", nullable = true, precision = 0)
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(id, report.id) && Objects.equals(date, report.date) && Objects.equals(time, report.time) && Objects.equals(cashier, report.cashier) && Objects.equals(total, report.total) && Objects.equals(balance, report.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, time, cashier, total, balance);
    }

    @OneToMany(mappedBy = "reportByReportId")
    public List<Reportitem> getReportitemsById() {
        return reportitemsById;
    }

    public void setReportitemsById(List<Reportitem> reportitemsById) {
        this.reportitemsById = reportitemsById;
    }
}
