import java.util.Scanner;

public class StreamPro {
    public static void main(String[] args) {
        Scanner loginUsuario = new Scanner(System.in);
        StreamObject StreamingPro = new StreamObject();

        System.out.println("Seja bem vindo ao StreamingPro!");
        System.out.println("Nós temos os melhores filmes!");
        System.out.println("\n======-Proximo-======");
        System.out.println("\nPrecione ENTER");
        loginUsuario.nextLine();

        double saldoUsuario = StreamingPro.pedirSaldoInicial();
        System.out.printf("Saldo registrado: R$ %.2f%n", saldoUsuario);

        System.out.println("Você deseja Fazer o cadastro no StreamingPro? ");
        System.out.println("1- SIM ");
        System.out.println("2- NÃO ");
        System.out.println("3- CONHECER PLANOS ");

        StreamingPro.iniciarStream = loginUsuario.nextInt();
        loginUsuario.nextLine();

        if (StreamingPro.iniciarStream == 1) {
            System.out.println("Digite seu nome completo: ");
            StreamingPro.nomeUsuario = loginUsuario.nextLine();

            while (StreamingPro.nomeUsuario.length() < 10) {
                System.out.println("Apenas o nome completo ");
                StreamingPro.nomeUsuario = loginUsuario.nextLine();
            }

            System.out.println("Crie sua senha (5+ caracteres):");
            StreamingPro.senhaUsuario = loginUsuario.nextLine();

            while (StreamingPro.senhaUsuario.length() < 5) {
                System.out.println("Senha fraca! Digite Novamente ");
                StreamingPro.senhaUsuario = loginUsuario.nextLine();
            }
            System.out.println("Cadastro concluído, Seja bem-vindo " + StreamingPro.nomeUsuario + "!");
        }
        if (StreamingPro.iniciarStream == 2) {
            System.out.println("FIM CADASTRO");
            return;
        }

        if (StreamingPro.iniciarStream == 3) {
            StreamingPro.Planos();
            StreamingPro.loopop3();
        }

        StreamingPro.iniciarAssinatura();
        StreamingPro.assinarStreamPro = loginUsuario.nextInt();
        loginUsuario.nextLine();

        if (StreamingPro.assinarStreamPro == 1) {
            StreamingPro.opcaoPlanos();
        }
        if (StreamingPro.assinarStreamPro == 2) {
            System.out.println("Fim Assinatura...");
            return;
        }
        if (StreamingPro.assinarStreamPro > 2) {
            System.out.println("Número inválido... Digite novamente");
            StreamingPro.assinarStreamPro = loginUsuario.nextInt();
        }
        System.out.println("Qual Plano deseja assinar? ");
        StreamingPro.tipoDePlano = loginUsuario.nextInt();
        loginUsuario.nextLine();

        if (StreamingPro.tipoDePlano == 1) {
            StreamingPro.tipoPlanoPadrao();
            while (true) {

                if (StreamingPro.tiposPadrao == 1) {
                    System.out.println("====-Mensal-====");
                    StreamingPro.pedirQuantidadeMeses();
                    break;
                }
                if (StreamingPro.tiposPadrao == 2) {
                    System.out.println("====-Anual-====");
                    StreamingPro.pedirQuantidadeAnos();
                    break;
                }
                if (StreamingPro.tiposPadrao == 3) {
                    System.out.println("====-Plano 6 meses-====");
                    StreamingPro.pedirPlano6meses();
                    break;
                }
                if (StreamingPro.tiposPadrao == 4) {
                    System.out.println("====-Plano 20 meses-====");
                    StreamingPro.pedirPlano20meses();
                    break;
                }
                if (StreamingPro.tiposPadrao > 4) {
                    System.out.println("Número inválido... DIgite novamente");
                    StreamingPro.tiposPadrao = loginUsuario.nextInt();
                }
            }
        }
        if (StreamingPro.tipoDePlano == 2) {
            StreamingPro.tipoPlanoPremium();
            while (true) {

                if (StreamingPro.tiposPremium == 1) {
                    System.out.println("====-Mensal-====");
                    StreamingPro.mesesPremium();
                    break;
                }
                if (StreamingPro.tiposPremium == 2) {
                    System.out.println("====-Anual-====");
                    StreamingPro.anualPremium();
                    break;
                }
                if (StreamingPro.tiposPremium == 3) {
                    System.out.println("====-Plano 6 meses-====");
                    StreamingPro.plano6MesesDoPremium();
                    break;
                }
                if (StreamingPro.tiposPremium == 4) {
                    System.out.println("====-Plano 20 meses-====");
                    StreamingPro.plano20MesesDoPremium();
                    break;
                }
                if (StreamingPro.tiposPremium > 4) {
                    System.out.println("Número inválido... DIgite novamente");
                    StreamingPro.tiposPremium = loginUsuario.nextInt();
                }
            }
        }
        if (StreamingPro.tipoDePlano == 3) {
            StreamingPro.tipoPlanoVip();
            while (true) {

                if (StreamingPro.tiposVIP == 1) {
                    System.out.println("====-Mensal-====");
                    StreamingPro.pedirQuantidadeMesesVip();
                    break;
                }
                if (StreamingPro.tiposVIP == 2) {
                    System.out.println("====-Anual=-====");
                    StreamingPro.pedirQuantidadeAnosVip();
                    break;
                }
                if (StreamingPro.tiposVIP == 3) {
                    System.out.println("====-Plano 6 meses-====");
                    StreamingPro.pedirPlano6mesesVip();
                    break;
                }
                if (StreamingPro.tiposVIP == 4) {
                    System.out.println("====-Plano 20 meses-====");
                    StreamingPro.pedirPlano20mesesVip();
                    break;
                }
                if (StreamingPro.tiposVIP > 4) {
                    System.out.println("Número inválido... DIgite novamente");
                    StreamingPro.tiposVIP = loginUsuario.nextInt();
                }
            }
        }
        if (StreamingPro.tipoDePlano == 4) {
            StreamingPro.beneficios();
        }
        if (StreamingPro.tipoDePlano > 4) {
            System.out.println("Número inválido... DIgite novamente");
            StreamingPro.tipoDePlano = loginUsuario.nextInt();
        }
            if (StreamingPro.assinaturaAtiva == true) {
                StreamingPro.criarUsuariosPadrao();
                StreamingPro.selecionarUsuario();
            } else {
                System.out.println("\n[ACESSO NEGADO]");
                System.out.println("Sua assinatura não foi ativa...");
                return;
            }
        StreamingPro.relatorioFinal();
    }
}