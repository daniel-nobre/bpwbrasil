package br.com.BPWBrasil.restful;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.BPWBrasil.model.Membro;

@Path("/membro")
public class MembroService {

	static private Map<Integer, Membro> membrosMap;
	
	static{
		membrosMap = new HashMap<Integer, Membro>();
		membrosMap.put(1, new Membro(1, "Maria"));
		membrosMap.put(2, new Membro(2, "Narina"));
	}
	
	@GET
	@Produces("text/xml")
	public List<Membro> getMembros(){
		return new ArrayList<Membro>(membrosMap.values());
	}
	
	@GET
	@Path("{nome}")
	@Produces("text/xml")
	public Membro addMembro(@PathParam("nome") String nome){
		Membro novoMembro = new Membro(membrosMap.size() + 1,nome);
		membrosMap.put(novoMembro.getId(), novoMembro);
		return (novoMembro);
	}
}
