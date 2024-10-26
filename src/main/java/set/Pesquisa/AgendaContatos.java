package main.java.set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        contatosSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Paulo", 912345678);
        agendaContatos.adicionarContato("Isabelle", 987654321);
        agendaContatos.adicionarContato("Thiene", 954321879);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.contatosSet);
    }
}
