package com.cafe.com.cafe.serviceImpl;

import com.cafe.com.cafe.constants.CafeConstants;
import com.cafe.com.cafe.service.UserService;
import com.cafe.com.cafe.utils.CafeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService {
    public static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        log.info("Inside signUp {}", requestMap);
        if (validateSignUpMap(requestMap)) {

        } else {
            return CafeUtils.getResponseEntity(CafeConstants.INVALID_DATA, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;
    }

    private boolean validateSignUpMap (Map<String, String>requestMap ) {
         return (requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
                && requestMap.containsKey("email") && requestMap.containsKey("password"));
    }
}
