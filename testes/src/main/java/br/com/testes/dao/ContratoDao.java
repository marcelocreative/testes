package br.com.testes.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Inser��o n�o funciona com o banco");
    }

	@Override
	public void buscar() {
		
		throw new UnsupportedOperationException("Busca n�o funciona com o banco");
		
	}

	@Override
	public void excluir() {
		throw new UnsupportedOperationException("Exclus�o n�o funciona com o banco");
		
	}

	@Override
	public void atualizar() {
		
		throw new UnsupportedOperationException("Atualiza��o n�o funciona com o banco");
		
	}
}
