package model;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private byte status;
    @ManyToOne
    private Company company;
    private LocalDate registrDate;
    private String phoneNumber;
    private LocalDate lastLogin;
    private String email;
    private Role role;
    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public byte getStatus() {
        return status;
    }

    public Company getCompany_id() {
        return company;
    }

    public LocalDate getRegistrDate() {
        return registrDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }
}
