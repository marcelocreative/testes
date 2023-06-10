package br.com.testes.service;

import br.com.testes.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

	@Override
	public String buscar() {
		contratoDao.buscar();
		return "Clientes retorndos com sucesso";
	}

	@Override
	public String excluir() {
		
		contratoDao.excluir();
		return "Cliente excluído com sucesso";
	}

	@Override
	public String atualizar() {
		
		contratoDao.atualizar();
		
		return "Cliente atualizado com sucesso";
	}
}
