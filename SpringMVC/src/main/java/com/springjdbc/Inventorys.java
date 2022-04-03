package com.springjdbc;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Inventorys {
    private int id;
    private Double price;
    private Double qty;
    private Integer inventorypId;
    private Date exp;
    private Inventoryp inventorypByInventorypId;
    private List<Invoices> invoicesById;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
    @Column(name = "qty", nullable = true, precision = 0)
    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    
    @Column(name = "inventoryp_id", nullable = true)
    public Integer getInventorypId() {
        return inventorypId;
    }

    public void setInventorypId(Integer inventorypId) {
        this.inventorypId = inventorypId;
    }

    
    @Column(name = "exp", nullable = true)
    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventorys that = (Inventorys) o;
        return id == that.id && Objects.equals(price, that.price) && Objects.equals(qty, that.qty) && Objects.equals(inventorypId, that.inventorypId) && Objects.equals(exp, that.exp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, qty, inventorypId, exp);
    }

    @ManyToOne
    @JoinColumn(name = "inventoryp_id", referencedColumnName = "id")
    public Inventoryp getInventorypByInventorypId() {
        return inventorypByInventorypId;
    }

    public void setInventorypByInventorypId(Inventoryp inventorypByInventorypId) {
        this.inventorypByInventorypId = inventorypByInventorypId;
    }

    @OneToMany(mappedBy = "inventorysByInventorysId")
    public List<Invoices> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(List<Invoices> invoicesById) {
        this.invoicesById = invoicesById;
    }
}
