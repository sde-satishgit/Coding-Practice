package book.seller.com.book.seller.service;

import book.seller.com.book.seller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
