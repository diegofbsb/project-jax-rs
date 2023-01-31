package br.com.resource;

import br.com.persitence.PessoaInterface;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api")
public class RestApplication {
    PessoaInterface pessoaInterface;

    @GET
    @Path("/")
    public Response getAllPessoa() {
        return Response.ok(pessoaInterface.getAll()).build();
    }
}
