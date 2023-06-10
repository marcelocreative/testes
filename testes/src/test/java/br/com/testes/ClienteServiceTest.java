package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.testes.dao.ClienteDao;
import br.com.testes.dao.ClienteDaoMock;
import br.com.testes.dao.IClienteDao;
import br.com.testes.service.ClienteService;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
