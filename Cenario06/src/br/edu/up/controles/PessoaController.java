package br.edu.up.controles;

import br.edu.up.modelos.*;

import java.util.ArrayList;
import java.util.List;

public class PessoaController {
    private List<Pessoa> pessoas;

    public PessoaController() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return pessoas;
    }
}
