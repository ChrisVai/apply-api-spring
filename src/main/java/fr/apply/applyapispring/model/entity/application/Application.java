package fr.apply.applyapispring.model.entity.application;

import fr.apply.applyapispring.enums.ApplicationStatus;
import fr.apply.applyapispring.enums.RecruiterResponse;
import fr.apply.applyapispring.model.entity.company.Company;
import fr.apply.applyapispring.model.entity.sector.Sector;
import fr.apply.applyapispring.model.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate
@Table(name= "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String title;

    private String offerUrl;

    @Column(
            name = "applied",
            columnDefinition = "boolean default false"

    )
    private Boolean applied;

    private Date appliedOn;

    @Enumerated(EnumType.STRING)
    private RecruiterResponse recruiterResponse;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private String comments;

    @ManyToOne(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "sector_id")
    private Sector sector;

    @ManyToOne(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "user_id")
    private User user;
}
