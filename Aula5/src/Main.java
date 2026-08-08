import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.println("===== CADASTRO DE USUÁRIO =====");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.print("ID: ");
        long id = sc.nextLong();

        System.out.println("\nEscolha o tipo de usuário:");
        System.out.println("1 - Usuário Comum");
        System.out.println("2 - Usuário Premium");
        System.out.println("3 - Criador de Conteúdo");
        System.out.println("4 - Influenciador");
        System.out.println("5 - Streamer");
        System.out.println("6 - Fotógrafo");
        System.out.println("7 - Empresa");
        System.out.println("8 - Empresa Verificada");

        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        TipoUsuario tipo;

        switch (opcao) {
            case 1:
                tipo = TipoUsuario.COMUM;
                break;
            case 2:
                tipo = TipoUsuario.PREMIUM;
                break;
            case 3:
                tipo = TipoUsuario.CRIADOR_CONTEUDO;
                break;
            case 4:
                tipo = TipoUsuario.INFLUENCIADOR;
                break;
            case 5:
                tipo = TipoUsuario.STREAMER;
                break;
            case 6:
                tipo = TipoUsuario.FOTOGRAFO;
                break;
            case 7:
                tipo = TipoUsuario.EMPRESA;
                break;
            case 8:
                tipo = TipoUsuario.EMPRESA_VERIFICADA;
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        Usuario usuario;

        switch (tipo) {

            case COMUM:
                usuario = new UsuarioComum() {

                    @Override
                    public void visualizarContaudos() {
                        System.out.println("Visualizando conteúdos...");
                    }
                };
                break;

            case PREMIUM:
                usuario = new UsuarioPremium() {
                    @Override
                    public void ativarPremium() {

                    }

                    @Override
                    public void cancelarPremium() {

                    }
                };
                break;

            case CRIADOR_CONTEUDO:
                usuario = new CriadorConteudo() {
                    @Override
                    public void criarConteudo() {

                    }

                    @Override
                    public void gerenciarConteudo() {

                    }
                };
                break;

            case INFLUENCIADOR:
                usuario = new Influenciador();
                break;

            case STREAMER:
                usuario = new Streamer();
                break;

            case FOTOGRAFO:
                usuario = new Fotografo();
                break;

            case EMPRESA:
                usuario = new Empresa() {
                    @Override
                    public void exibirInformacoes() {

                    }
                };
                break;

            case EMPRESA_VERIFICADA:
                usuario = new EmpresaVerificada();
                break;

            default:
                sc.close();
                return;
        }

        // Cadastrando os dados
        usuario.setName(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setId(id);

        usuarios.add(usuario);

        System.out.println("\n===== CADASTRO REALIZADO =====");
        System.out.println("Nome: " + usuario.getName());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("ID: " + usuario.getId());
        System.out.println("Tipo: " + tipo);

        sc.close();
    }
}