package by.parakhnevich.likon.model;

import lombok.Data;

@Data
public class RoleClientModel implements ClientModel {
    private long id;
    private String name;
}
