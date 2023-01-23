package com.example.demo.contoller;

import com.example.demo.entities.Root;
import com.example.demo.service.MyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.portal.pcm.EBufException;
//import com.saralam.graphql.entities.Root;
//import com.saralam.graphql.service.MyService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController
public class MyContoller {


//@QueryMapping("robj")
//@GetMapping( "qwe/{z}")
//@QueryMapping("robj")
@QueryMapping("Account")
    public List<Root> Account( @Argument int z) throws EBufException, JsonProcessingException{

        return MyService.Account(z);
    }

  //  @QueryMapping("Account")
    public static List<Root> getD() throws JsonProcessingException {

        return MyService.getD();
    }
}
