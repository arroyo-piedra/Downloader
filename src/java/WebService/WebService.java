/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Andre
 */
public class WebService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client client = ClientBuilder.newClient();
        
        WebTarget target = client.target("http://webservice.catalogueoflife.org/col/webservice?id=4fdb38d6220462049eab9e3f285144e0&format=json&response=full");
        
        System.out.println(
                
                target.request(MediaType.APPLICATION_JSON).get(String.class)
                
                );
        
    }
    
}
