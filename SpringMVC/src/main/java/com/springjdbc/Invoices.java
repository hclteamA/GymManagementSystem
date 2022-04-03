package com.springjdbc;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Invoices {
    private int id;
    private Date date;
    private String cashier;
    private double total;
    private int inventorysId;
    private double qty;
    private String memberid;
    private Inventorys inventorysByInventorysId;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name = "cashier", nullable = false, length = 15)
    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    
    @Column(name = "total", nullable = false, precision = 0)
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    @Column(name = "inventorys_id", nullable = false)
    public int getInventorysId() {
        return inventorysId;
    }

    public void setInventorysId(int inventorysId) {
        this.inventorysId = inventorysId;
    }

    
    @Column(name = "qty", nullable = false, precision = 0)
    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "memberid", nullable = true, length = 10)
    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoices invoices = (Invoices) o;
        return id == invoices.id && Double.compare(invoices.total, total) == 0 && inventorysId == invoices.inventorysId && Double.compare(invoices.qty, qty) == 0 && Objects.equals(date, invoices.date) && Objects.equals(cashier, invoices.cashier) && Objects.equals(memberid, invoices.memberid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, cashier, total, inventorysId, qty, memberid);
    }

    @ManyToOne
    @JoinColumn(name = "inventorys_id", referencedColumnName = "id", nullable = false)
    public Inventorys getInventorysByInventorysId() {
        return inventorysByInventorysId;
    }

    public void setInventorysByInventorysId(Inventorys inventorysByInventorysId) {
        this.inventorysByInventorysId = inventorysByInventorysId;
    }
}
