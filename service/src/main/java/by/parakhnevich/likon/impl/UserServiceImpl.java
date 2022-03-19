package by.parakhnevich.likon.impl;

import by.parakhnevich.likon.UserService;
import by.parakhnevich.likon.entity.UserEntity;
import by.parakhnevich.likon.exception.BadParameterException;
import by.parakhnevich.likon.exception.UserNotFoundException;
import by.parakhnevich.likon.mapper.UserModelMapper;
import by.parakhnevich.likon.model.UserClientModel;
import by.parakhnevich.likon.repository.RoleRepository;
import by.parakhnevich.likon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final String USER_NOT_FOUND = "user.not.found";
    private final String BAD_PARAM = "bad.param";
    UserRepository userRepository;
    RoleRepository roleRepository;
    UserModelMapper userMapper;

    @Override
    public UserClientModel create(UserClientModel user) {
        user.setRole(roleRepository.findByName("USER"));
        user.setCreateDate(LocalDateTime.now());
        userRepository.save(userMapper.toEntity(user));
        UserEntity userEntity = userRepository.findByNickname(user.getNickname());
        if (userEntity != null) {
            return userMapper.toClientModel(userEntity);
        }
        throw new UserNotFoundException(USER_NOT_FOUND + "/nickname=" + user.getNickname());
    }

    @Override
    public List<UserClientModel> readAll() {
        return userRepository.findAll()
                .stream()
                .map(a -> userMapper.toClientModel(a))
                .collect(Collectors.toList());
    }

    @Override
    public UserClientModel readById(Map<String, String> parameters) {
        if (!parameters.containsKey("id")) {
            throw new BadParameterException(BAD_PARAM);
        }
        long id = Long.parseLong(parameters.get("id"));
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isPresent()) {
            return userMapper.toClientModel(user.get());
        }
        throw new UserNotFoundException(USER_NOT_FOUND + "/id=" + id);
    }

    @Override
    public UserClientModel update(UserClientModel user) {
        userRepository.update(user.getMail(), user.getPassword(), user.getRole().toString(), user.getId());
        return readById(Collections.singletonMap("id", String.valueOf(user.getId())));
    }

    @Override
    public UserClientModel delete(Map<String, String> parameters) {
        if (!parameters.containsKey("id")) {
            throw new BadParameterException(BAD_PARAM);
        }
        long id = Long.parseLong(parameters.get("id"));
        Optional<UserEntity> user =
                userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.deleteById(id);
            return userMapper.toClientModel(user.get());
        }
        throw new UserNotFoundException(USER_NOT_FOUND + "/id=" + id);
    }

    @Autowired
    public void setUserMapper(UserModelMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
