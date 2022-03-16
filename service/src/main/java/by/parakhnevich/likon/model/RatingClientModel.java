package by.parakhnevich.likon.model;

import lombok.Data;


@Data
public class RatingClientModel implements ClientModel {
    private long id;
    private boolean isPositive;
}
