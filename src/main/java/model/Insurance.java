package model;
import javax.annotation.Generated;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate fromDate;
    @Column(unique = true)
    private String policyNumber;
    private BigDecimal InsuranceCost;
    private int numOfDays;
    private String statusCode;
    private String paymentStatus;
    private LocalDate registrDate;
    @ManyToMany(mappedBy = "insurance")
    private List<Client> client;
    @OneToOne
    private Product product;

    public Insurance() {
    }
}
