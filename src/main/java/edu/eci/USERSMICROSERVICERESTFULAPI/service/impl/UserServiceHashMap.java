package edu.eci.USERSMICROSERVICERESTFULAPI.service.impl;

import edu.eci.USERSMICROSERVICERESTFULAPI.data.User;
import edu.eci.USERSMICROSERVICERESTFULAPI.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {

    private HashMap<String, User> users = new HashMap();

    @Override
    public User create(User user) {
        if ( users.containsKey( user.getId() ) ){ throw new RuntimeException( "User already exists" ); }
        users.put( user.getId(), user );
        return users.get( user.getId() );
    }

    @Override
    public User findById(String id) {
        return users.get( id );
    }

    @Override
    public List<User> all() {
        return new ArrayList<>( users.values() );
    }

    @Override
    public void deleteById(String id) {
        if( users.containsKey( id ) ){ users.remove( id ); }
        else{ throw new RuntimeException("User does not exist"); }
    }

    @Override
    public User update(User user, String userId) {
        if( !users.containsKey( userId ) ){ throw new RuntimeException("User does not exist"); }
        deleteById( userId );
        return create( user );
    }
}
