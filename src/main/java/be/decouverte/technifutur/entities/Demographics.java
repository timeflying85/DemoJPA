package be.decouverte.technifutur.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "customers_demographics")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDemographics {

    @Id
    @Column(name = "customer_id")
    private String id;

    @Column(name = "customer_type_id")
    private String typeID;

    @ManyToMany
    private List<Customer> customers;
}
