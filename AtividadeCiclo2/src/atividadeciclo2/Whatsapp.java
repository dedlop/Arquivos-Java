package atividadeciclo2;

import java.util.List;

public class Whatsapp {
    private List<Contato> contatos;
    private List<Mensagem> mensagens;

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Celular: " + contato.getCelular());
            System.out.println("-------------------------");
        }
    }

    public void listarMensagens() {
        for (Mensagem mensagem : mensagens) {
            System.out.println("Destinatário: " + mensagem.getDestinatario().getNome());
            System.out.println("Hora de Envio: " + mensagem.getHoraEnvio());
            System.out.println("Conteúdo: " + mensagem.getConteudo());
            System.out.println("-------------------------");
        }
    }
}