package com.three.email.Client;

import com.three.email.Model.Userp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "rest", url = "http://localhost:8080")
public interface UserDemoClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/id/{id}")
    public Userp findById(@PathVariable(value = "id") int id);


}
