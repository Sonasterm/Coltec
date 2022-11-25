import java.util.ArrayList;

public class Comanda {

    public double valor;

    // Lista de consumo
    ArrayList<String> consumo = new ArrayList<String>();

    // Funções
    void listarConsumo()
    {
        int i = 0;
        while (i < this.consumo.size())
        {
            System.out.println(i+1 + "° - " + this.consumo.get(i));
            i++;
        }
    }

    double calcular10Porcento()
    {
        return(this.valor*0.10);
    }

    double dividirConta(int nPessoas)
    {
        return(this.valor/nPessoas);
    }

    //Getters & Setters
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void addItem(String Item){
        this.consumo.add(Item);
    }

}
