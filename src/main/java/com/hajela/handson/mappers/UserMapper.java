package com.hajela.handson.mappers;

import com.hajela.handson.model.User;
import com.hajela.handson.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
