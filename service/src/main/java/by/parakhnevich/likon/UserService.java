package by.parakhnevich.likon;

import by.parakhnevich.likon.model.UserClientModel;

import java.util.List;
import java.util.Map;

public interface UserService {
    UserClientModel create(UserClientModel user);
    List<UserClientModel> readAll();
    UserClientModel readById(Map<String, String> parameters);
    UserClientModel update(UserClientModel user);
    UserClientModel delete(Map<String, String> parameters);
}
