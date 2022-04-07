package com.springjdbc;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Invoice {
    private String invoiceid;
    private Date date;
    private Date duedate;
    private Time time;
    private Double nettotal;
    private Double payment;
    private Double balance;
    private String cashier;
    private String cid;
    private Double dueamount;
    private String type;
    private String remarks;
    private String inv;
    private Client clientByCid;
    private List<Invoiceitem> invoiceitemsByInvoiceid;

    @Id
    @Column(name = "invoiceid", nullable = false, length = 25)
    public String getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

  
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   
    @Column(name = "duedate", nullable = true)
    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

   
    @Column(name = "time", nullable = true)
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

   
    @Column(name = "nettotal", nullable = true, precision = 0)
    public Double getNettotal() {
        return nettotal;
    }

    public void setNettotal(Double nettotal) {
        this.nettotal = nettotal;
    }

    
    @Column(name = "payment", nullable = true, precision = 0)
    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

   
    @Column(name = "balance", nullable = true, precision = 0)
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    
    @Column(name = "cashier", nullable = true, length = 20)
    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    
    @Column(name = "cid", nullable = false, length = 20)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    
    @Column(name = "dueamount", nullable = true, precision = 0)
    public Double getDueamount() {
        return dueamount;
    }

    public void setDueamount(Double dueamount) {
        this.dueamount = dueamount;
    }

    
    @Column(name = "type", nullable = true, length = 15)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name = "remarks", nullable = true, length = 80)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    
    @Column(name = "inv", nullable = true, length = 25)
    public String getInv() {
        return inv;
    }

    public void setInv(String inv) {
        this.inv = inv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(invoiceid, invoice.invoiceid) && Objects.equals(date, invoice.date) && Objects.equals(duedate, invoice.duedate) && Objects.equals(time, invoice.time) && Objects.equals(nettotal, invoice.nettotal) && Objects.equals(payment, invoice.payment) && Objects.equals(balance, invoice.balance) && Objects.equals(cashier, invoice.cashier) && Objects.equals(cid, invoice.cid) && Objects.equals(dueamount, invoice.dueamount) && Objects.equals(type, invoice.type) && Objects.equals(remarks, invoice.remarks) && Objects.equals(inv, invoice.inv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceid, date, duedate, time, nettotal, payment, balance, cashier, cid, dueamount, type, remarks, inv);
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid", nullable = false)
    public Client getClientByCid() {
        return clientByCid;
    }

    @Override
	public String toString() {
		return "Invoice [invoiceid=" + invoiceid + ", date=" + date + ", duedate=" + duedate + ", time=" + time
				+ ", nettotal=" + nettotal + ", payment=" + payment + ", balance=" + balance + ", cashier=" + cashier
				+ ", cid=" + cid + ", dueamount=" + dueamount + ", type=" + type + ", remarks=" + remarks + ", inv="
				+ inv + ", clientByCid=" + clientByCid + ", invoiceitemsByInvoiceid=" + invoiceitemsByInvoiceid + "]";
	}

	public void setClientByCid(Client clientByCid) {
        this.clientByCid = clientByCid;
    }

    @OneToMany(mappedBy = "invoiceByInvoiceid")
    public Collection<Invoiceitem> getInvoiceitemsByInvoiceid() {
        return invoiceitemsByInvoiceid;
    }

    public void setInvoiceitemsByInvoiceid(List<Invoiceitem> invoiceitemsByInvoiceid) {
        this.invoiceitemsByInvoiceid = invoiceitemsByInvoiceid;
    }
}
