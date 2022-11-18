package EL_MAIA;
import java.util.Scanner;

public class Menu 
{
    // Variáveis
    Scanner esc = new Scanner(System.in);
    Restaurante restaurante = new Restaurante();

    // Funções
    public void menu_reservar ()
    {
        Mesa mesa = new Mesa();
        System.out.printf("Deseja fazer uma reserva? \n[0] Não\t[1] Sim\t: ");
        int res = esc.nextInt();
        mesa.reservar(res);
    }
    public void menu_Cardapio()
    {
        System.out.printf("Deseja fazer uma pedido? \n[0] Não\t[1] Sim\t: ");
        int res = esc.nextInt();
        
        if (res == 1)
        {
            System.out.printf("\n- - - - CARDÁPIO - - - -\n");
            System.out.printf("\nBebidas");
            System.out.printf("\n[1] Água Atômica 500ml................................R$ 2,00\n[2] Limonada Suína....................................R$ 4,50");
            System.out.printf("\n[3] Garrafa Bete de Coca-Cola.........................R$ 5,50\n[4] Leite com Polvo Maltino...........................R$ 4,90");
            System.out.printf("\n[5] Suco de Abaxaqui..................................R$ 3,00\n[6] Suco de Frutas Críticas 300ml.....................R$ 4,50");
            System.out.printf("\n[7] Leite de Amnésia..................................R$ 16,00\n");

            System.out.printf("\nPratos");
            System.out.printf("\n[8] Filé Miau.........................................R$ 28,00\n[9] Batata com molho Barbie Kill.....................R$ 11,50");
            System.out.printf("\n[10] Bife alí namesa..................................R$ 27,00\n[11] Macarrão ao alho e ódio.........................R$ 15,50");
            System.out.printf("\n[12] Feijão Torpedo...................................R$ 10,00\n[13] Arroz com carne morrida.........................R$ 10,00\n");

            System.out.printf("\nSobremesas");
            System.out.printf("\n[14] X & Queique......................................R$ 8,00\n[15] Tiramisu da Engenharia (esgotado)................R$ 6,50");
            System.out.printf("\n[16] Pudim de Leite Condenado.........................R$ 8,00\n[17] Pácomê...........................................R$ 6,50");
            System.out.printf("\n[18] Sonho de Falsa...................................R$ 8,00\n[*] Especialidade do Chef.............................R$ 34,69\n[0] Fim do Pedido\n");

            fazer_pedido(0);
        }
    }
    public void fazer_pedido(int n_mesa)
    {
        String pedido = esc.next(); int i = 0;
        while(i < this.restaurante.mesa.size())
        {
            if (this.restaurante.mesa.get(i).getNumero_mesa() == n_mesa)
            {
                break;
            }
            i++;
        }
        if (i == this.restaurante.mesa.size() == true)
        {
            System.out.println("Mesa Inexistente");
            return;
        }
        

        while (pedido != "0")
        {
            switch(pedido)
            {
                case "1":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "2":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "3":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "4":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "5":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "6":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "7":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "8":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "9":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "10":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "11":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "12":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "13":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "14":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "15":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "16":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                case "17":
                restaurante.mesa.get(i).getComanda().valor += 2.00;
                restaurante.mesa.get(i).getComanda().consumo.add("Água Atômica 500ml");
                break;

                default:
                

            }
            pedido = esc.next();
            
        }
        System.out.println("Obrigada por comprar no Buchinho Cheio");
    }
}
