package com.hajela.convertors;

import com.hajela.domain.UserCommand;
import com.hajela.entities.User;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-16T14:27:01+0000",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}
