package br.com.testes.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Inserção não funciona com o banco");
    }

	@Override
	public void buscar() {
		
		throw new UnsupportedOperationException("Busca não funciona com o banco");
		
	}

	@Override
	public void excluir() {
		throw new UnsupportedOperationException("Exclusão não funciona com o banco");
		
	}

	@Override
	public void atualizar() {
		
		throw new UnsupportedOperationException("Atualização não funciona com o banco");
		
	}
}
