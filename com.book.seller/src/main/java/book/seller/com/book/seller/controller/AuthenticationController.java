package book.seller.com.book.seller.controller;

import book.seller.com.book.seller.model.User;
import book.seller.com.book.seller.service.IAuthenticationService;
import book.seller.com.book.seller.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthenticationController
{
    @Autowired
    private IAuthenticationService iAuthenticationService;

    @Autowired
    private IUserService iUserService;

    @PostMapping ( "sign-up" )
    public ResponseEntity<?> signUp(@RequestBody User user) {

    if(iUserService.findByUsername(user.getUsername()).isPresent()){
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
    return new ResponseEntity<>(iUserService.saveUser(user),HttpStatus.CREATED);
    }

    @PostMapping ( "sign-in" )
    public ResponseEntity<?> signIn(@RequestBody User user) {

        return new ResponseEntity<>(iAuthenticationService.signInAndReturnJWT(user),HttpStatus.OK);
    }
}
