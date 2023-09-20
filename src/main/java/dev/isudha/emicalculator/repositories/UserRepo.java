package dev.isudha.emicalculator.repositories;

import java.util.HashMap;
import java.util.Map;
import dev.isudha.emicalculator.models.Loan;
import dev.isudha.emicalculator.models.User;

public class UserRepo {

    private Map<Long, User> users = new HashMap<>();
    private long count = 0l;

    public User save(User user){
        count++;
        user.setId(count);
        users.put(count, user);
        return user;
    }

    public User get(Long id){
        return users.get(id);
    }

}
