package com.springjdbc;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Reportitem {
    private int reportitemid;
    private String invoiceid;
    private String memberid;
    private Date date1;
    private Time time1;
    private Double tot;
    private Double balance1;
    private String reportId;
    private String type;
    private String remarks;
    private Report reportByReportId;

    @Override
	public String toString() {
		return "Reportitem [reportitemid=" + reportitemid + ", invoiceid=" + invoiceid + ", memberid=" + memberid
				+ ", date1=" + date1 + ", time1=" + time1 + ", tot=" + tot + ", balance1=" + balance1 + ", reportId="
				+ reportId + ", type=" + type + ", remarks=" + remarks + ", reportByReportId=" + reportByReportId + "]";
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "reportitemid", nullable = false)
    public int getReportitemid() {
        return reportitemid;
    }

    public void setReportitemid(int reportitemid) {
        this.reportitemid = reportitemid;
    }

   
    @Column(name = "invoiceid", nullable = true, length = 25)
    public String getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

   
    @Column(name = "memberid", nullable = true, length = 20)
    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

  
    @Column(name = "date1", nullable = true)
    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

   
    @Column(name = "time1", nullable = true)
    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

   
    @Column(name = "tot", nullable = true, precision = 0)
    public Double getTot() {
        return tot;
    }

    public void setTot(Double tot) {
        this.tot = tot;
    }

   
    @Column(name = "balance1", nullable = true, precision = 0)
    public Double getBalance1() {
        return balance1;
    }

    public void setBalance1(Double balance1) {
        this.balance1 = balance1;
    }

   
    @Column(name = "report_id", nullable = false, length = 20)
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reportitem that = (Reportitem) o;
        return reportitemid == that.reportitemid && Objects.equals(invoiceid, that.invoiceid) && Objects.equals(memberid, that.memberid) && Objects.equals(date1, that.date1) && Objects.equals(time1, that.time1) && Objects.equals(tot, that.tot) && Objects.equals(balance1, that.balance1) && Objects.equals(reportId, that.reportId) && Objects.equals(type, that.type) && Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportitemid, invoiceid, memberid, date1, time1, tot, balance1, reportId, type, remarks);
    }

    @ManyToOne
    @JoinColumn(name = "report_id", referencedColumnName = "id", nullable = false)
    public Report getReportByReportId() {
        return reportByReportId;
    }

    public void setReportByReportId(Report reportByReportId) {
        this.reportByReportId = reportByReportId;
    }
}
