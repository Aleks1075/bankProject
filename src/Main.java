import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Bank bank = new Bank();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 5)
        {
            System.out.println("1. Opret konto");
            System.out.println("2. Indsæt penge på en konto");
            System.out.println("3. Træk penge ud af en konto");
            System.out.println("4. Se saldo på en konto");
            System.out.println("5. Fjern konto fra banken");
            System.out.println("6. Se alle konti");
            System.out.println("7. Afslut programmet");
            System.out.println("Vælg en handling: ");
            choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    // Opret konto
                    System.out.println("Indtast navn på konto: ");
                    String navn = input.next();
                    bank.opretKonto(new Konto(navn));
                    break;
                case 2:
                    // Indsæt penge på en konto
                    System.out.println("Indtast navn på konto: ");
                    String navn2 = input.next();
                    System.out.println("Indtast beløb: ");
                    int beløb = input.nextInt();
                    bank.indsætPenge(navn2, beløb);
                    break;
                case 3:
                    // Træk penge ud af en konto
                    System.out.println("Indtast navn på konto: ");
                    String navn3 = input.next();
                    System.out.println("Indtast beløb: ");
                    int beløb2 = input.nextInt();
                    bank.fjernPenge(navn3, beløb2);
                    break;
                case 4:
                    // Se saldo på en konto
                    System.out.println("Indtast navn på konto: ");
                    String navn4 = input.next();
                    System.out.println(bank.getKonto(navn4).toString());
                    break;
                case 5:
                    // Fjern konto fra banken
                    System.out.println("Indtast navn på konto: ");
                    String navn5 = input.next();
                    bank.fjernKonto(navn5);
                    break;
                case 6:
                    //Se alle konti
                    System.out.println(bank.getBankMap());
                    break;
                case 7:
                    // Afslut programmet
                    System.out.println("Programmet afsluttes...");
                    System.exit(0);
                default:
                    System.out.println("Ugyldigt valg");
                    break;
            }
        }

    }
}