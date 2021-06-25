package com.three.email.Service;

import com.three.email.Client.UserDemoClient;
import com.three.email.Model.Userp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    UserDemoClient userDemoClient;

    public String getUserEmail(int id) {
        String email = null;
        Userp user = userDemoClient.findById(id);
        if (null != user) {
            email  = user.getId() + "@rest.local";
        }
        return email;
    }
}
