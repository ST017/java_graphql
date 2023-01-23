package com.example.demo.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entities.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.portal.pcm.*;
import com.portal.pcm.fields.FldPoid;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class MyService implements GraphQLQueryResolver {
    private static Object e;
    private static String j;
    public List g;
    private  String  c;
    @Autowired
    public static MyService myService;

    public static List<Root> Account( int z) throws EBufException, JsonProcessingException {
        FList sFlist = new FList();
//        int y= z;
        Poid sPoid = new Poid(1, z, "/account");
        sPoid.getDb();

        sFlist.set(FldPoid.getInst(), sPoid);
        System.out.println("Input flist:");
        sFlist.dump();
        PortalContext ctx = new PortalContext();
        ctx.connect();
        // Call the opcode
        FList searchoutflist = ctx.opcode(PortalOp.READ_OBJ, sFlist);
        // Close PCM connection
        boolean logout = true;
        ctx.close(logout);
        System.out.println("Output flist:");
        searchoutflist.dump(); // this is an alternate way to print out an flist
        String xml= searchoutflist.toXMLString();
        JSONObject json1 = XML.toJSONObject(xml);

        System.out.println(json1);
        String jsonString = json1.toString(5);
        System.out.println(jsonString);
        ArrayList a= new ArrayList();
        a.add(jsonString);
        String[] answer = Arrays.copyOf(
                a.toArray(), a.size(), String[].class);
        String c=Arrays.toString(answer);
        j=c;
        System.out.println(c);
        ObjectMapper obj = new ObjectMapper();
        TypeReference<List<Root>> typeReference = new TypeReference<List<Root>>(){};
        List<Root> rootlist = obj.readValue(c , typeReference);
//         String d = rootlist.toString();
//         e=d;
        System.out.println(rootlist);
//        myRepo.saveAll(rootlist);
//        myService.save( rootlist);
        System.out.println("Success!");
        return rootlist;
    }

    private void save(List<Root> rootlist) {
    }


    public static List<Root> getD() throws JsonProcessingException {
//        System.out.println(e);
//
//        List f= new ArrayList<>();
//        f.add(e);
        ObjectMapper obj = new ObjectMapper();
        TypeReference<List<Root>> typeReference = new TypeReference<List<Root>>(){};
        List<Root> rootlist = obj.readValue( j, typeReference);

        return rootlist;
    }
}
