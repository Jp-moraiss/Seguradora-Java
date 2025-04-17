package br.edu.cs.poo.ac.seguro.mediators;

import br.edu.cs.poo.ac.seguro.daos.SeguradoPessoaDAO;
import br.edu.cs.poo.ac.seguro.entidades.SeguradoPessoa;

public class SeguradoPessoaMediator {

	private SeguradoMediator seguradoMediator;
	private SeguradoPessoaDAO dao;

	private static SeguradoPessoaMediator instancia = new SeguradoPessoaMediator();

	private SeguradoPessoaMediator() {
	}

	public static SeguradoPessoaMediator getInstancia() {
		return instancia;
	}

	public String validarCpf(String cpf) {
		if (StringUtils.ehNuloOuBranco(cpf))
			return "CPF deve ser informado";
		if (cpf.length() != 11)
			return "CPF deve ter 11 caracteres";
		if (!ValidadorCpfCnpj.ehCpfValido(cpf))
			return "CPF com dígito inválido";

		return null;
	}

	public String validarRenda(double renda) {
		if (renda < 0)
			return "Renda deve ser maior ou igual à zero";
		
		return null;
	}

	public String incluirSeguradoPessoa(SeguradoPessoa seg) {
		return null;
	}

	public String alterarSeguradoPessoa(SeguradoPessoa seg) {
		return null;
	}

	public String excluirSeguradoPessoa(String cpf) {
		return null;
	}

	public SeguradoPessoa buscarSeguradoPessoa(String cpf) {
		return null;
	}

	public String validarSeguradoPessoa(SeguradoPessoa seg) {
		return null;
	}
}
