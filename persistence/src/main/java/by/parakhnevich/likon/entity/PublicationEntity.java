package by.parakhnevich.likon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "publication")
public class PublicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String head;
    private String body;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    //@OneToMany(mappedBy = "publicationEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<RatingEntity> ratings;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
