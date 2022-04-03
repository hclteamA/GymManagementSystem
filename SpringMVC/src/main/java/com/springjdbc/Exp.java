package com.springjdbc;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Exp {
    private int id;
    private String name;
    private Double paidamount;
    private String grnid;
    private String report1Id;
    private Report1 report1ByReport1Id;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "paidamount", nullable = true, precision = 0)
    public Double getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(Double paidamount) {
        this.paidamount = paidamount;
    }

    @Basic
    @Column(name = "grnid", nullable = true, length = 20)
    public String getGrnid() {
        return grnid;
    }

    public void setGrnid(String grnid) {
        this.grnid = grnid;
    }

    @Basic
    @Column(name = "report1_id", nullable = false, length = 20)
    public String getReport1Id() {
        return report1Id;
    }

    public void setReport1Id(String report1Id) {
        this.report1Id = report1Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exp exp = (Exp) o;
        return id == exp.id && Objects.equals(name, exp.name) && Objects.equals(paidamount, exp.paidamount) && Objects.equals(grnid, exp.grnid) && Objects.equals(report1Id, exp.report1Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, paidamount, grnid, report1Id);
    }

    @ManyToOne
    @JoinColumn(name = "report1_id", referencedColumnName = "id", nullable = false)
    public Report1 getReport1ByReport1Id() {
        return report1ByReport1Id;
    }

    public void setReport1ByReport1Id(Report1 report1ByReport1Id) {
        this.report1ByReport1Id = report1ByReport1Id;
    }
}
