package by.parakhnevich.likon.model;

import by.parakhnevich.likon.entity.CommentRatingEntity;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CommentClientModel implements ClientModel {
    private long id;
    private String body;
    private List<CommentRatingEntity> ratings;
    private UserClientModel user;
    private LocalDateTime createDate;
}
