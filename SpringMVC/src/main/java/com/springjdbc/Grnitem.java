package com.springjdbc;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Grnitem {
    private int id;
    private String product;
    private Double qty;
    private double price;
    private String grnId;
    private Grn grnByGrnId;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "product", nullable = true, length = 25)
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

   
    @Column(name = "qty", nullable = true, precision = 0)
    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

   
    @Column(name = "price", nullable = false, precision = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    @Column(name = "grn_id", nullable = false, length = 20)
    public String getGrnId() {
        return grnId;
    }

    public void setGrnId(String grnId) {
        this.grnId = grnId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grnitem grnitem = (Grnitem) o;
        return id == grnitem.id && Double.compare(grnitem.price, price) == 0 && Objects.equals(product, grnitem.product) && Objects.equals(qty, grnitem.qty) && Objects.equals(grnId, grnitem.grnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, qty, price, grnId);
    }

    @ManyToOne
    @JoinColumn(name = "grn_id", referencedColumnName = "id", nullable = false)
    public Grn getGrnByGrnId() {
        return grnByGrnId;
    }

    public void setGrnByGrnId(Grn grnByGrnId) {
        this.grnByGrnId = grnByGrnId;
    }
}
