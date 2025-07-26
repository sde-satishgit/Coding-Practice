package book.seller.com.book.seller.service;

import book.seller.com.book.seller.model.Role;
import book.seller.com.book.seller.model.User;
import book.seller.com.book.seller.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository iUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return iUserRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username){
        return iUserRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public void makeAdmin(String username){
        iUserRepository.updateUserRole(username,Role.ADMIN);
    }
}
