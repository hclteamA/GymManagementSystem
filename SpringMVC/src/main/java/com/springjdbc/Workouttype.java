package com.springjdbc;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Workouttype {
    private int workouttypeid;
    private String type;
    private Double price;
  //  private List<Client> clientsByWorkouttypeid;
//    private Collection<Invoiceitem> invoiceitemsByWorkouttypeid;

    @Id
    @Column(name = "workouttypeid", nullable = false)
    public int getWorkouttypeid() {
        return workouttypeid;
    }

    public void setWorkouttypeid(int workouttypeid) {
        this.workouttypeid = workouttypeid;
    }

   
    @Column(name = "type", nullable = true, length = 25)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workouttype that = (Workouttype) o;
        return workouttypeid == that.workouttypeid && Objects.equals(type, that.type) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workouttypeid, type, price);
    }

//    @OneToMany(mappedBy = "workouttypeByWorkouttypeid")
//    public Collection<Client> getClientsByWorkouttypeid() {
//        return clientsByWorkouttypeid;
//    }
//
//    public void setClientsByWorkouttypeid(List<Client> clientsByWorkouttypeid) {
//        this.clientsByWorkouttypeid = clientsByWorkouttypeid;
//    }
//
//    @OneToMany(mappedBy = "workouttypeByWorkouttypeid")
//    public Collection<Invoiceitem> getInvoiceitemsByWorkouttypeid() {
//        return invoiceitemsByWorkouttypeid;
//    }
//
//    public void setInvoiceitemsByWorkouttypeid(Collection<Invoiceitem> invoiceitemsByWorkouttypeid) {
//        this.invoiceitemsByWorkouttypeid = invoiceitemsByWorkouttypeid;
//    }
}
