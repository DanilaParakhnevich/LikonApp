package by.parakhnevich.likon;

public interface SecurityService {

    void autoLogin(String username, String password);

    String findLoggedInUsername();

}
