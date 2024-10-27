package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        contatoSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtuaizado = null;
        for(Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtuaizado = c;
                break;
            }
        }
        return contatoAtuaizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Paulo", 912345678);
        agendaContatos.adicionarContato("Paulo Alves", 912345679);
        agendaContatos.adicionarContato("Paulo", 912345678);
        agendaContatos.adicionarContato("Isabelle", 987654321);
        agendaContatos.adicionarContato("Thiene", 954321879);


        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.contatoSet.size());
        System.out.println("-----------------------");
        System.out.println(agendaContatos.pesquisarPorNome("Thiene"));
        System.out.println("-----------------------");
        System.out.println(agendaContatos.atualizarNumeroContato("Paulo Alves", 111125));
        System.out.println("-----------------------");

        agendaContatos.pesquisarPorNome("Paulo");
        System.out.println(agendaContatos.contatoSet);
    }
}
