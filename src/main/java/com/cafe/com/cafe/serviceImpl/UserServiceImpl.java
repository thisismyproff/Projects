package com.cafe.com.cafe.serviceImpl;

import com.cafe.com.cafe.constants.CafeConstants;
import com.cafe.com.cafe.dao.UserDao;
import com.cafe.com.cafe.pojo.User;
import com.cafe.com.cafe.service.UserService;
import com.cafe.com.cafe.utils.CafeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    public static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserDao userDao;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
            log.info("Inside signUp {}", requestMap);
            if (validateSignUpMap(requestMap)) {
                User user = userDao.findByEmail(requestMap.get("email"));
                if (Objects.isNull(user)) {
                    userDao.save(getUserFromRequestMap(requestMap));
                    log.info("User saved sucessfully");
                    return CafeUtils.getResponseEntity("User added!", HttpStatus.OK);
                } else {
                    return CafeUtils.getResponseEntity("Email already exists", HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                return CafeUtils.getResponseEntity(CafeConstants.INVALID_DATA, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            log.error(String.valueOf(e));
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private boolean validateSignUpMap (Map<String, String>requestMap ) {
         return (requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
                && requestMap.containsKey("email") && requestMap.containsKey("password"));
    }

    private User getUserFromRequestMap (Map<String,String> requestMap) {
        User user = new User();
        user.setName(requestMap.get("name"));
        user.setEmail(requestMap.get("email"));
        user.setContactNumber(requestMap.get("contactNumber"));
        user.setPassword(requestMap.get("password"));
        user.setStatus("false");
        user.setRole("user");
        return user;
    }
}
