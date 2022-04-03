package com.springjdbc;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Client {
    private String cid;
    private String name;
    private String gender;
    private String address;
    private String telephone;
    private String mobile;
    private Date dateOfBirth;
    private String emergencyContactp;
    private String emobile;
    private String medicalCondition;
    private Integer workouttypeid;
    private Date date;
    private String imgurl;
    private List<Attendance> attendancesByCid;
    private Workouttype workouttypeByWorkouttypeid;
    private List<Invoice> invoicesByCid;

    @Id
    @Column(name = "cid", nullable = false, length = 20)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

  
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 10)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name = "telephone", nullable = true, length = 10)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

   
    @Column(name = "mobile", nullable = true, length = 10)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

   
    @Column(name = "date_of_birth", nullable = true)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

   
    @Column(name = "emergency_contactp", nullable = true, length = 45)
    public String getEmergencyContactp() {
        return emergencyContactp;
    }

    public void setEmergencyContactp(String emergencyContactp) {
        this.emergencyContactp = emergencyContactp;
    }

   
    @Column(name = "emobile", nullable = true, length = 10)
    public String getEmobile() {
        return emobile;
    }

    public void setEmobile(String emobile) {
        this.emobile = emobile;
    }

   
    @Column(name = "medical_condition", nullable = true, length = 1000)
    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

   
    @Column(name = "workouttypeid", nullable = true)
    public Integer getWorkouttypeid() {
        return workouttypeid;
    }

    public void setWorkouttypeid(Integer workouttypeid) {
        this.workouttypeid = workouttypeid;
    }

    
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   
    @Column(name = "imgurl", nullable = true, length = 256)
    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(cid, client.cid) && Objects.equals(name, client.name) && Objects.equals(gender, client.gender) && Objects.equals(address, client.address) && Objects.equals(telephone, client.telephone) && Objects.equals(mobile, client.mobile) && Objects.equals(dateOfBirth, client.dateOfBirth) && Objects.equals(emergencyContactp, client.emergencyContactp) && Objects.equals(emobile, client.emobile) && Objects.equals(medicalCondition, client.medicalCondition) && Objects.equals(workouttypeid, client.workouttypeid) && Objects.equals(date, client.date) && Objects.equals(imgurl, client.imgurl);
    }
@Override
public String toString() {
	// TODO Auto-generated method stub
	return getCid()+" "+getName()+" "+getGender()+" "+ getAddress()+" "+ getTelephone()+" "+getMobile()+" "+getDateOfBirth()+" "+getEmergencyContactp()+" "+ getEmobile()+" "+ getMedicalCondition()+" "+getWorkouttypeid()+" "+getDate()+" "+getImgurl();
}
    @Override
    public int hashCode() {
        return Objects.hash(cid, name, gender, address, telephone, mobile, dateOfBirth, emergencyContactp, emobile, medicalCondition, workouttypeid, date, imgurl);
    }

  @OneToMany(mappedBy = "clientByCid")
    public List<Attendance> getAttendancesByCid() {
        return attendancesByCid;
    }

    public void setAttendancesByCid(List<Attendance> attendancesByCid) {
        this.attendancesByCid = attendancesByCid;
    }

    @ManyToOne
    @JoinColumn(name = "workouttypeid", referencedColumnName = "workouttypeid")
    public Workouttype getWorkouttypeByWorkouttypeid() {
        return workouttypeByWorkouttypeid;
    }

    public void setWorkouttypeByWorkouttypeid(Workouttype workouttypeByWorkouttypeid) {
        this.workouttypeByWorkouttypeid = workouttypeByWorkouttypeid;
    }

    @OneToMany(mappedBy = "clientByCid")
    public List<Invoice> getInvoicesByCid() {
        return invoicesByCid;
    }

    public void setInvoicesByCid(List<Invoice> invoicesByCid) {
        this.invoicesByCid = invoicesByCid;
    }
}
