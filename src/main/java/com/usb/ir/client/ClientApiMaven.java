/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usb.ir.client;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 * Jersey REST client generated for REST resource:WSCc [/catastro]<br>
 * USAGE:
 * <pre>
 *        ClientApiMaven client = new ClientApiMaven();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author SONY
 */
public class ClientApiMaven {

    private javax.ws.rs.client.WebTarget webTarget;
    private javax.ws.rs.client.Client client;
    private static final String BASE_URI = "http://search.maven.org/";

    public ClientApiMaven() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("/solrsearch/select");
        
    }
    
    //
    
     public String findApiMaven(String q,String rows,String wt) {
      
        Response res = webTarget
                .queryParam("q", q)
                .queryParam("rows", rows)
                .queryParam("wt", wt)
                .request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get();
        return res.readEntity(String.class);
    }
    
    
    public void close() {
        client.close();
    }
    
}
