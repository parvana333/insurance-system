package model;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String mobileNumber;
    private String officeNumber;
    private LocalDate createdDate;
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] logo;
    private byte status;
    @OneToMany(mappedBy = "company")
    private List<User> user;
    @OneToMany(mappedBy = "company")
    private List<Product> product;

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte [] logo) {
        this.logo = logo;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
