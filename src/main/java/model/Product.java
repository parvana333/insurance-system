package model;
import javax.persistence.*;
import java.math.BigDecimal;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private BigDecimal firstAmount;
    private BigDecimal secondAmount;
    private BigDecimal thirdAmount;
    private float comissionCost;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "company_id")
    private Company company;
    @OneToOne(mappedBy = "product",fetch = FetchType.LAZY)
    private Insurance insurance;
    public Product() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public BigDecimal getFirstAmount() {
        return firstAmount;
    }
    public void setFirstAmount(BigDecimal firstAmount) {
        this.firstAmount = firstAmount;
    }
    public BigDecimal getSecondAmount() {
        return secondAmount;
    }
    public void setSecondAmount(BigDecimal secondAmount) {
        this.secondAmount = secondAmount;
    }

    public BigDecimal getThirdAmount() {
        return thirdAmount;
    }

    public void setThirdAmount(BigDecimal thirdAmount) {
        this.thirdAmount = thirdAmount;
    }

    public float getComissionCost() {
        return comissionCost;
    }

    public void setComissionCost(float comissionCost) {
        this.comissionCost = comissionCost;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
