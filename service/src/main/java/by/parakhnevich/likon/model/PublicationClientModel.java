package by.parakhnevich.likon.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PublicationClientModel implements ClientModel {
    private long id;
    private String head;
    private String body;
    private List<PublicationRatingClientModel> ratings;
    private LocalDateTime createDate;
}
