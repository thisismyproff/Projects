package com.cafe.com.cafe.restImpl;

import com.cafe.com.cafe.constants.CafeConstants;
import com.cafe.com.cafe.rest.UserRest;
import com.cafe.com.cafe.service.UserService;
import com.cafe.com.cafe.utils.CafeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    public static final Logger log = LoggerFactory.getLogger(UserRestImpl.class);
    @Autowired
    UserService userService ;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {

            return userService.signUp(requestMap);
        }catch (Exception e) {
            log.error(String.valueOf(e));
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
