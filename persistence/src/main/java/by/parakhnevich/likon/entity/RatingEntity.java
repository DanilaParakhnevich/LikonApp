package by.parakhnevich.likon.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rating")
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "value")
    private boolean isPositive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_publication", nullable = false)
    private PublicationEntity publicationEntity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private UserEntity userEntity;
}
