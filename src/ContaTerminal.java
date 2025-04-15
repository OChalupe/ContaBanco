import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite o número de sua agencia, sem o dígito");
            int agencia = scanner.nextInt();
            scanner.nextLine();
    
            System.out.println("Digite o número de sua conta com dígito");
            String conta = scanner.next();
            scanner.nextLine();
            
            System.out.println("Digite seu nome completo");
            String nomeCompleto = scanner.next();
            scanner.nextLine();
    
            System.out.println("Digite seu saldo:");
            float saldo = scanner.nextFloat();
    
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + String.format("%.2f", saldo) + " já está disponível para saque.");       
            
        }
            
        }
