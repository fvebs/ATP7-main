import java.util.Scanner;

public class ATP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*------------------Bem vindo ao menu de opções------------------*");
        System.out.println("\n 1-Números pares \n 2-Números Ìmpares \n 3-Números Primos \n 4-Juros Compostos \n 5-Sair ");
        int opcao = sc.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("--------------Cálculo de Números Pares-----------");

                int numeroPar = 0;
                do {
                    System.out.println("Informe um número: ");
                    numeroPar = sc.nextInt();

                } while(!validaNumero(numeroPar));

                System.out.println("Os números pares são: ");

                for (int i = 0; i <= numeroPar; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                System.out.println("---------------Cálculo de Números Ìmpares----------------");

                int numeroImpar = 0;
                do {
                    System.out.println("Informe um número: ");
                    numeroImpar = sc.nextInt();

                }while(!validaNumero(numeroImpar));

                System.out.println("Os números ímpares são: ");

                for (int i = 0; i <= numeroImpar; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 3:
                System.out.println("---------------Cálculo de Números Primos----------------");

                int numeroPrimo = 0;
                do {
                    System.out.println("Informe um número: ");
                    numeroPrimo = sc.nextInt();

                }while(!validaNumero(numeroPrimo));

                System.out.println("Os números primos são: ");

                for (int i = 0; i <= numeroPrimo; i++) {
                    //inicia validacao do numero primo
                    boolean valido = true;
                    while (valido) {
                        //numeros menores que dois não são primos
                        if (i < 2) {
                            valido = false;
                            //o dois é o primeiro numero primo
                        } else if (i == 2) {
                            System.out.println(i);
                            valido = false;
                        } else {
                            //variavel que indica o numero primo e que permite a impressao do numero em tela
                            boolean primo = true;
                            //varredura de todos os numeros a partir de 2 ate o numero anterior ao numero testado
                            for (int cont = 2; cont < i; cont++) {
                                // se o numero for divisivel por qualquer numero, ele deixa de ser primo
                                // nega a variavel primo(que permite a impressao na tela, sai do laco for
                                // e nega a validade do numero quebrando o laco de validacao do numero
                                if (i % cont == 0) {
                                    valido = false;
                                    primo = false;
                                    break;
                                }
                            }

                            //se apos a leitura do laco 'for' nao for encontrado nenhum divisor para o numero, entao ele e primo
                            if (primo) {
                                System.out.println(i);
                                valido = false;
                            }
                        }
                    }
                }
                break;
            case 4:
                System.out.println("---------------Cálculo de Retorno de Investimento ----------------");
                double investimento =0.0;
                do {
                    System.out.println("Informe o investimento: ");
                    investimento = sc.nextDouble();
                    sc.nextLine();

                } while(!validaNumero(investimento));

                double juros =0.0;
                do {
                    System.out.println("Informe a taxa de juros: ");
                    juros = sc.nextDouble();
                    sc.nextLine();

                } while(!validaNumero(juros));

                int prazo =0;
                do {
                    System.out.println("Informe o prazo : ");
                    prazo = sc.nextInt();
                    sc.nextLine();

                }while(!validaNumero(prazo));

                double montante = investimento;

                System.out.printf("\tO investimento inicial é: %.2f \n", investimento);

                for (int i = 1; i <= prazo ; i++) {
                    montante += montante*juros;
                    System.out.printf("\tO retorno do %dº mês é de %.2f \n", i, montante);
                }

                System.out.printf("\n\tO retorno total é %.2f ", montante);
                break;
            case 5:
                System.out.println("\n\n\t---------------Saindo do menu! ----------------");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }

    //função que verifica se um número do int é positivo
    public static boolean validaNumero(int numero) {
        boolean valida = true;

        if (numero < 0) {
            System.out.println("O valor deve ser positivo!");
            valida = false;
        } else {
            valida = true;
        }
        return valida;
    }

    //função que verifica se um número do double é positivo
    public static boolean validaNumero(double numero) {
        boolean valida = true;

        if (numero < 0) {
            System.out.println("O valor deve ser positivo!");
            valida = false;
        } else {
            valida = true;
        }
        return valida;
    }
}
