import java.util.Scanner;
import java.util.ArrayList;

public class StreamObject {
    String nomeUsuario;
    String senhaUsuario;
    int iniciarStream;
    int tabelaPricePlanos;
    int tipoDePlano;
    int assinarStreamPro;
    int tiposPadrao;
    int tiposPremium;
    int tiposVIP;
    int planoAssinado;
    int planoEscolhido;
    int criacaoUsuario;
    Scanner sc = new Scanner(System.in);

    ArrayList<String> criarUsuario = new ArrayList<>();

    int usuPlanoPadrao() {
        return criarUsuario.size();
    }

    void criarUsuariosPadrao() {
        while (true) {
            System.out.println("Criar perfis ");
            System.out.println("1- Confirmar");
            criacaoUsuario = sc.nextInt();
            sc.nextLine();

            if (criacaoUsuario == 1) {
                System.out.println("Digite o nome do usuario que deseja criar: ");
                String nome = sc.nextLine();
                criarUsuario.add(nome);

                System.out.println("Deseja criar mais usuarios? ");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                int criarMaisUsu = sc.nextInt();
                sc.nextLine();

                if (criarMaisUsu == 1) {
                    System.out.println("Digite nome de usuario que deseja criar: ");
                    nome = sc.nextLine();
                    criarUsuario.add(nome);
                } else {
                    System.out.println("Total: " + usuPlanoPadrao());
                    System.out.println("Usuarios existentes: " + criarUsuario);
                    break;
                }
            }
        }
        if (criacaoUsuario > 1) {
            System.out.println("Número inválido... Digite novamente");
            criacaoUsuario = sc.nextInt();
        }

        //selecionar plano assinado para o perfil criado...
        while (true) {
            System.out.println("Escolha o plano que assinou para que consiga ultilizar o StreamingPro ");
            System.out.println("1- Padrão");
            System.out.println("2- Premium");
            System.out.println("3- VIP");
            planoEscolhido = sc.nextInt();
            planoAssinado = planoEscolhido;

            if (planoAssinado == tipoDePlano) {
                System.out.println("Acesso liberado " + nomeUsuario + "!");
                break;
            } else {
                System.out.println("\nColoque o plano assinado...");
            }
        }
    }

    void mostrarUsuarios() {
        System.out.println("\nSELECIONE USUÁRIO:");
        for (int i = 0; i < criarUsuario.size(); i++) {
            System.out.println((i + 1) + "- " + criarUsuario.get(i));
        }
    }

    void selecionarUsuario() {
        mostrarUsuarios();
        System.out.print("Digite número: ");
        int escolha = sc.nextInt();
        sc.nextLine();

        String usuarioEscolhido = criarUsuario.get(escolha - 1);
        System.out.println("Bem-vindo " + usuarioEscolhido + "!");
        mostrarTop10();
    }

    void mostrarTop10() {
        System.out.println("\n=========- Top 10 Filmes -=========");
        System.out.println("O Agente Secreto");
        System.out.println("Uma Batalha Após a Outra");
        System.out.println("Foi Apenas um Acidente");
        System.out.println("Pecadores");
        System.out.println("The Mastermind");
        System.out.println("Conclave");
        System.out.println("Anora");
        System.out.println("Valor Sentimental");
        System.out.println("Titanic");
        System.out.println("Spider-Man 2\n");
    }
    void Planos() {
        System.out.println("-Padrão");
        System.out.println("-Premium");
        System.out.println("-VIP");
    }
    void tabelaPlanos() {
        System.out.println("\n======-Planos Tabela-======");
        System.out.println("1- Padrão");
        System.out.println("2- Premium");
        System.out.println("3- VIP\n");
    }
    void padraoPrice() {
        System.out.println("==-Padrão-==");
        System.out.println("Mensal: R$ 12.69 ");
        System.out.println("=================");
        System.out.println("Anual: R$ 145.59");
        System.out.println("=================");
        System.out.println("Plano 6 meses: R$ 34.79");
        System.out.println("=======================");
        System.out.println("Plano 20 meses: R$ 205.99");
    }
    void premiumPrice() {
        System.out.println("===-Premium-===");
        System.out.println("Mensal: R$ 15.69 ");
        System.out.println("=================");
        System.out.println("Anual: R$ 165.59");
        System.out.println("=================");
        System.out.println("Plano 6 meses: R$ 44.79");
        System.out.println("=======================");
        System.out.println("Plano 20 meses: R$ 225.99");
    }
    void vipPrice() {
        System.out.println("====-VIP-====");
        System.out.println("Mensal: R$ 17.69 ");
        System.out.println("=================");
        System.out.println("Anual: R$ 185.59");
        System.out.println("=================");
        System.out.println("Plano 6 meses: R$ 54.79");
        System.out.println("=======================");
        System.out.println("Plano 20 meses: R$ 245.99");
    }
    void beneficios() {
        System.out.println("==-Padrão-==");
        System.out.println("* Você terá acesso a todos os filmes e series no catálogo, mas possuirá anúncios de até 15s");
        System.out.println("* Apenas 1080p");
        System.out.println("* Variedade de dublagens limitada");
        System.out.println("* Apenas 2 Dipositivos ao mesmo tempo");
        System.out.println("* Atraso em receber lançamentos\n");

        System.out.println("===-Premium-===");
        System.out.println("* Menos anúncios");
        System.out.println("* Disponível 2k");
        System.out.println("* Variedade de dublagem 1,5x Maior");
        System.out.println("* Apenas 4 Dispositivos ao mesmo tempo");
        System.out.println("* Lançamentos rápidos em 720p\n");

        System.out.println("====-VIP-====");
        System.out.println("* Zero anúncios");
        System.out.println("* 1080p, 2k, 4k");
        System.out.println("* Dublagem de tudo no catálogo de no minimo 10 idiomas");
        System.out.println("* Dispositivos ilimitados conectados ao mesmo tempo");
        System.out.println("* Lançamento em qualidade máxima imediatamente");
    }
    void iniciarAssinatura() {
        System.out.println("Deseja assinar o StreamingPro?");
        System.out.println("1- SIM");
        System.out.println("2- NÃO");
    }
    void opcaoPlanos(){
        System.out.println("1- ==-Padrão-==");
        System.out.println("2- ===-Premium-===");
        System.out.println("3- ====-VIP-====");
        System.out.println("4- Beneficios Planos...");

    }
    void assinarPadrao(){
        System.out.println("===-Padrão-===");
        System.out.println("1- Mensal: R$ 12.69 ");
        System.out.println("=================");
        System.out.println("2- Anual: R$ 145.59");
        System.out.println("=================");
        System.out.println("3- Plano 6 meses: R$ 34.79");
        System.out.println("=======================");
        System.out.println("4- Plano 20 meses: R$ 205.99");

        System.out.println("\nQual deseja selecionar?");
    }
    void assinarPremium() {
        System.out.println("===-Premium-===");
        System.out.println("1- Mensal: R$ 15.69 ");
        System.out.println("=================");
        System.out.println("2- Anual: R$ 165.59");
        System.out.println("=================");
        System.out.println("3- Plano 6 meses: R$ 44.79");
        System.out.println("=======================");
        System.out.println("4- Plano 20 meses: R$ 225.99");
    }
    void assinarVIP() {
        System.out.println("====-VIP-====");
        System.out.println("1- Mensal: R$ 17.69 ");
        System.out.println("=================");
        System.out.println("2- Anual: R$ 185.59");
        System.out.println("=================");
        System.out.println("3- Plano 6 meses: R$ 54.79");
        System.out.println("=======================");
        System.out.println("4- Plano 20 meses: R$ 245.99");
    }

    double saldo = 0.0;

    double pedirSaldoInicial() {
        System.out.println("Digite seu saldo inicial R$: ");
        saldo = sc.nextDouble();
        return saldo;
    }

    int qntdMeses = 0; //Quantidade de Meses
    boolean assinaturaAtiva = false;

    int pedirQuantidadeMeses() {
        System.out.println("Por quantos meses deseja assinar? ");
        qntdMeses = sc.nextInt();
        double custo = 12.69 * qntdMeses;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return qntdMeses;
    }

    int qntdAnos = 0; //Quantidade de Anos

    int pedirQuantidadeAnos() {
        System.out.println("Por quantos anos deseja assinar? (MAX 2A)");
        qntdAnos = sc.nextInt();
        if(qntdAnos > 3) {
            System.out.println("Apenas por 2 anos...");
            qntdAnos = sc.nextInt();
        }
        double custo = 145.59 * qntdAnos;
        if (saldo > custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return qntdAnos;
    }

    int planoDe6Meses = 0;

    int pedirPlano6meses() {
        System.out.println("Quantas vezes deseja assinar o plano 6 meses (MAX 3M)");
        planoDe6Meses = sc.nextInt();
        if (planoDe6Meses > 3) {
            System.out.println("Pode assinar apenas 3 vezes...");
            planoDe6Meses = sc.nextInt();
        }
        double custo = 34.79 * planoDe6Meses;
        int quantidadeMeses = 6 * planoDe6Meses;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
            System.out.println("Você assinou por " + quantidadeMeses + " meses");
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return planoDe6Meses;
    }

    int planoDe20Meses = 0;

    int pedirPlano20meses() {
        System.out.println("Quantas vezes deseja assinar o plano 20 meses (MAX 2M)");
        planoDe20Meses = sc.nextInt();

        if (planoDe20Meses > 2) {
            System.out.println("Pode assinar apenas 2 vezes...");
            planoDe20Meses = sc.nextInt();
        }
        int quantidadeMeses = 20 * planoDe20Meses;
        double custo = 205.99 * planoDe20Meses;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
            System.out.println("Você assinou por " + quantidadeMeses + " meses");
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return planoDe20Meses;
    }

    int qntdMesesPremium = 0;

    int mesesPremium() {
        planoAssinado = 2;
        System.out.println("Por quantos meses deseja Assinar? ");
        qntdMesesPremium = sc.nextInt();
        double custo = 15.69 * qntdMesesPremium;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return qntdMesesPremium;
    }

    int qntdAnual = 0;

    int anualPremium() {
        planoAssinado = 2;
        System.out.println("Por quantos anos deseja Assinar (MAX 2A)");
        qntdAnual = sc.nextInt();
        if(qntdAnual > 3) {
            System.out.println("Apenas por 2 anos...");
            qntdAnual = sc.nextInt();
        }
        double custo = 145.59 * qntdAnual;
        if (saldo > custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return qntdAnual;
    }

    int plano6mesesPremium = 0;

    int plano6MesesDoPremium() {
        planoAssinado = 2;
        System.out.println("Quantas vezes deseja assinar o plano 6 meses (MAX 3M)");
        plano6mesesPremium = sc.nextInt();
        if (plano6mesesPremium > 3) {
            System.out.println("Pode assinar apenas 3 vezes...");
            plano6mesesPremium = sc.nextInt();
        }
        double custo = 34.79 * plano6mesesPremium;
        int quantidadeMeses = 6 * plano6mesesPremium;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
            System.out.println("Você assinou por " + quantidadeMeses + " meses");
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return plano6mesesPremium;
    }

    int plano20mesesPremium = 0;

    int plano20MesesDoPremium() {
        planoAssinado = 2;
        System.out.println("Quantas vezes deseja assinar o plano 20 meses (MAX 2M)");
        plano20mesesPremium = sc.nextInt();

        if (plano20mesesPremium > 2) {
            System.out.println("Pode assinar apenas 2 vezes...");
            plano20mesesPremium = sc.nextInt();
        }
        int quantidadeMeses = 20 * plano20mesesPremium;
        double custo = 205.99 * plano20mesesPremium;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
            System.out.println("Você assinou por " + quantidadeMeses + " meses");
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return plano20mesesPremium;
    }

    int mesesVip = 0; //Quantidade de Meses

    int pedirQuantidadeMesesVip() {
        System.out.println("Por quantos meses deseja assinar? ");
        mesesVip = sc.nextInt();
        double custo = 17.69 * mesesVip;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return mesesVip;
    }

    int anosVip = 0; //Quantidade de Anos

    int pedirQuantidadeAnosVip() {
        System.out.println("Por quantos anos deseja assinar? (MAX 2A)");
        anosVip = sc.nextInt();
        if(anosVip > 3) {
            System.out.println("Apenas por 2 anos...");
            anosVip = sc.nextInt();
        }
        double custo = 145.59 * anosVip;
        if (saldo > custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return anosVip;
    }

    int planoDe6MesesVip = 0;

    int pedirPlano6mesesVip() {
        System.out.println("Quantas vezes deseja assinar o plano 6 meses (MAX 3M)");
        planoDe6MesesVip = sc.nextInt();
        if (planoDe6MesesVip > 3) {
            System.out.println("Pode assinar apenas 3 vezes...");
            planoDe6MesesVip = sc.nextInt();
        }
        double custo = 34.79 * planoDe6MesesVip;
        int quantidadeMeses = 6 * planoDe6MesesVip;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
            System.out.println("Você assinou por " + quantidadeMeses + " meses");
        } else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return planoDe6MesesVip;
    }

    int planoDe20MesesVip = 0;

    int pedirPlano20mesesVip() {
        System.out.println("Quantas vezes deseja assinar o plano 20 meses (MAX 2M)");
        planoDe20MesesVip = sc.nextInt();

        if (planoDe20MesesVip > 2) {
            System.out.println("Pode assinar apenas 2 vezes...");
            planoDe20MesesVip = sc.nextInt();
        }
        int quantidadeMeses = 20 * planoDe20MesesVip;
        double custo = 205.99 * planoDe20MesesVip;
        if (saldo >= custo) {
            saldo -= custo;
            assinaturaAtiva = true;
            System.out.printf("Novo saldo após assinatura R$ %.2f%n", saldo);
            System.out.printf("Custo assinatura R$ %.2f%n", custo);
            System.out.println("Você assinou por " + quantidadeMeses + " meses");
        }else {
            System.out.println("Saldo insuficiente...");
            assinaturaAtiva = false;
        }
        return planoDe20MesesVip;
    }


    int loopOne;

   int loopop3() {
        while (true) {
            System.out.println("\nDeseja conhecer os Preços dos planos? ");
            System.out.println("1- SIM");
            System.out.println("2- NÃO");
            System.out.println("3- Beneficíos");
            System.out.println("4- SAIR");
            loopOne = sc.nextInt();
            sc.nextLine();

            if (loopOne == 1) {
                tabelaPlanos();
                tabelaPricePlanos = sc.nextInt();
                sc.nextLine();
                if (tabelaPricePlanos == 1) {
                    padraoPrice();
                }
                if (tabelaPricePlanos == 2) {
                    premiumPrice();
                }
                if (tabelaPricePlanos == 3) {
                    vipPrice();
                }
                if (tabelaPricePlanos > 3) {
                    System.out.println("Número inválido... Digite novamente");
                    tabelaPricePlanos = sc.nextInt();
                }
            }
            if (loopOne == 2) {
                System.out.println("Fim do cadastro");
                break;
            }
            if (loopOne == 3) {
                beneficios();
            }
            if (loopOne == 4) {
                break;
            }
        }
            while (true) {
                if (loopOne > 4) {
                    System.out.println("Numero invalido");
                    loopOne = sc.nextInt();
                }
                break;
            }
        return loopOne;
    }

   int tipoPlanoPadrao() {
       assinarPadrao();
       tiposPadrao = sc.nextInt();
       sc.nextLine();
       return tiposPadrao;
   }

   int tipoPlanoPremium() {
       assinarPremium();
       tiposPremium = sc.nextInt();
       sc.nextLine();
       return tiposPremium;
   }
   int tipoPlanoVip() {
       assinarVIP();
       tiposVIP = sc.nextInt();
       sc.nextLine();
       return tiposVIP;
   }
   void relatorioFinal() {
       System.out.println("\n===== COMPROVANTE STREAMING PRO =====");
       System.out.println("Cliente: " + nomeUsuario);
       System.out.printf("Saldo Restante: R$ %.2f%n", saldo);
       System.out.println("Assinatura Ativa: [SIM]");
       System.out.println("======================================");
   }
}
