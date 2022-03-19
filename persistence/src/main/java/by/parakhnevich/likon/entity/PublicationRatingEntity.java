package by.parakhnevich.likon.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "publication_rating")
@Entity
public class PublicationRatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "value")
    private boolean isPositive;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private UserEntity user;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_publication", nullable = false)
    private PublicationEntity publication;
}
