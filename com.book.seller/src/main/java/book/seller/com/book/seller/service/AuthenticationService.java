package book.seller.com.book.seller.service;

import book.seller.com.book.seller.model.User;
import book.seller.com.book.seller.security.UserPrinciple;
import book.seller.com.book.seller.security.jwt.IJWTProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthenticationService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private IJWTProvider ijwtProvider;

    @Override
    public User signInAndReturnJWT(User signInRequest){

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInRequest.getUsername(),signInRequest.getPassword()));

        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();

        String jwt = ijwtProvider.generateToken(userPrinciple);

        User signInUser = userPrinciple.getUser();

        signInUser.setToken(jwt);
        return  signInUser;
    }
}
