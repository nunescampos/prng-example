package org.acme;

import java.text.NumberFormat;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/texto")
public class Exemplo1 {
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String texto() {
	/*	NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH,
		        NumberFormat.Style.SHORT);
		return fmt.format(1000);
		*/
	/*	NumberFormat fmt1 = NumberFormat.getCompactNumberInstance(Locale.ENGLISH,
		        NumberFormat.Style.LONG);
		return fmt1.format(1000);
		*/
		NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.forLanguageTag("pt-BR"),
		        NumberFormat.Style.LONG);
		return fmt.format(1000);
		
		
    }

}
