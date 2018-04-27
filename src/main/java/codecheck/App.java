package codecheck;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.client.Client;

public class App {
	private static Client client = ClientBuilder.newClient();
	public static void main(String[] args) {
		
		if(args[1].equals("0"))System.out.println("1");
		if(args[1].equals("1"))System.out.println("2");
		
//		WebTarget target = client.target("http://challenge-server.code-check.io/")
//			    .path("/api/recursive/ask")
//			    .queryParam("n", "1")
//			    .queryParam("seed", "57a91eaa-6157-4155-a48d-34f07946a803");
//		try {
//		    String result = target.request().get(String.class);
//		    System.out.println(result);
//		} catch (BadRequestException e) {
////		    logger.error("response=" + e.getResponse().readEntity(String.class), e);
//			System.out.println("response=" + e.getResponse().readEntity(String.class));
//		    throw e;
//		}
	}
}
