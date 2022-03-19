package by.parakhnevich.likon.model;

import lombok.Data;

@Data
public class CommentRatingClientModel implements ClientModel {
    private long id;
    private boolean isPositive;
    private UserClientModel user;
}
