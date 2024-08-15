package facade;

import subsistema.Service;
import subsistema2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        Service.gravarCliente(nome,cep,cidade,estado);
    }
}
