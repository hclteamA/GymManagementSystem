package com.springjdbc;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Invoiceitem {
    private int invoiceitemid;
    private Double total;
    private Double discount;
    private String invoiceid;
    private Integer workouttypeid;
    private Invoice invoiceByInvoiceid;
    private Workouttype workouttypeByWorkouttypeid;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "invoiceitemid", nullable = false)
    public int getInvoiceitemid() {
        return invoiceitemid;
    }

    public void setInvoiceitemid(int invoiceitemid) {
        this.invoiceitemid = invoiceitemid;
    }

  
    @Column(name = "total", nullable = true, precision = 0)
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

  
    @Column(name = "discount", nullable = true, precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

   
    @Column(name = "invoiceid", nullable = false, length = 25)
    public String getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

   
    @Column(name = "workouttypeid", nullable = true)
    public Integer getWorkouttypeid() {
        return workouttypeid;
    }

    public void setWorkouttypeid(Integer workouttypeid) {
        this.workouttypeid = workouttypeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoiceitem that = (Invoiceitem) o;
        return invoiceitemid == that.invoiceitemid && Objects.equals(total, that.total) && Objects.equals(discount, that.discount) && Objects.equals(invoiceid, that.invoiceid) && Objects.equals(workouttypeid, that.workouttypeid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceitemid, total, discount, invoiceid, workouttypeid);
    }

    @ManyToOne
    @JoinColumn(name = "invoiceid", referencedColumnName = "invoiceid", nullable = false)
    public Invoice getInvoiceByInvoiceid() {
        return invoiceByInvoiceid;
    }

    public void setInvoiceByInvoiceid(Invoice invoiceByInvoiceid) {
        this.invoiceByInvoiceid = invoiceByInvoiceid;
    }

    @ManyToOne
    @JoinColumn(name = "workouttypeid", referencedColumnName = "workouttypeid")
    public Workouttype getWorkouttypeByWorkouttypeid() {
        return workouttypeByWorkouttypeid;
    }

    public void setWorkouttypeByWorkouttypeid(Workouttype workouttypeByWorkouttypeid) {
        this.workouttypeByWorkouttypeid = workouttypeByWorkouttypeid;
    }
}
