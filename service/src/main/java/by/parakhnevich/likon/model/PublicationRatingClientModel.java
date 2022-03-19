package by.parakhnevich.likon.model;

import lombok.Data;

@Data
public class PublicationRatingClientModel {
    private long id;
    private boolean isPositive;
    private UserClientModel user;
}
