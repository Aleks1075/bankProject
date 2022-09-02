import java.util.Map;
import java.util.TreeMap;

public class Bank
{
    private Map<String, Konto> bankMap = new TreeMap<>();

    public boolean opretKonto(Konto konto)
    {
        if (bankMap.containsKey(konto.getNavn()))
        {
            return false;
        }
        else
        {
            bankMap.put(konto.getNavn(), konto);
            return true;
        }
    }
    public Map<String, Konto> getBankMap()
    {
        return bankMap;
    }

    public void indsætPenge(String navn, int beløb)
    {
        bankMap.get(navn).indsætPenge(beløb);
    }

    public void fjernKonto(String navn)
    {
        bankMap.remove(navn);
    }

    public Konto getKonto(String navn)
    {
        return bankMap.get(navn);
    }

    public void fjernPenge(String navn, int beløb)
    {
        bankMap.get(navn).fjernPenge(beløb);
    }

}