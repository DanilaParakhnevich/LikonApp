package by.parakhnevich.likon.impl;

import by.parakhnevich.likon.entity.RoleEntity;
import by.parakhnevich.likon.mapper.UserModelMapper;
import by.parakhnevich.likon.model.UserClientModel;
import by.parakhnevich.likon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepository userRepository;
    private UserModelMapper mapper;
    private final String USER_NOT_FOUND = "user.not.found";

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserClientModel user = mapper.toClientModel(userRepository.findByNickname(username));
        if (user == null) {
            throw new UsernameNotFoundException(USER_NOT_FOUND + "/nickname=" + username);
        }
        GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().getName());
        return new User(user.getNickname(), user.getPassword(), Collections.singleton(authority));
    }

    @Autowired
    public void setMapper(UserModelMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
