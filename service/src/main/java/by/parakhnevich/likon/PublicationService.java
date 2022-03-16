package by.parakhnevich.likon;

import by.parakhnevich.likon.model.PublicationClientModel;

import java.util.List;
import java.util.Map;

public interface PublicationService {
    List<PublicationClientModel> readAllBetween(Map<String, String> parameters);
    long readCountOfPages();
}
