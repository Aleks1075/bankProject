public class Konto
{

    private String navn;
    private int saldo;

    public Konto(String navn)
    {
        this.navn = navn;
        this.saldo = 0;
    }

    public String getNavn()
    {
        return navn;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public void indsætPenge(int beløb)
    {
        saldo += beløb;
    }

    public void fjernPenge(int beløb)
    {
        saldo -= beløb;
    }

    public String toString()
    {
        return "Konto: " + navn + " Saldo: " + saldo;
    }
}