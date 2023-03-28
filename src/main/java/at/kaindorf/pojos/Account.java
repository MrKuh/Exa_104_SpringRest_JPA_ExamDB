package at.kaindorf.pojos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(unique = true)
    private String email;
    private String password;

}
