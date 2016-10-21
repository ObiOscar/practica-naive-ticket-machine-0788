public class TrainStation   //Creo una clase de tren estación, no lo traducto porque usa el nombre en inglés durante la práctica 
{
    private TicketMachine maquina1; // Dejo el nombre de TicketMachine porque es nombre del programa
    private TicketMachine maquina2;
    private int dineroTotal;

    public TrainStation()
    {
        maquina1 = new TicketMachine(300);
        maquina2 = new TicketMachine(200);
        dineroTotal = 0;
  }
  
  public void printTotalMoney()
    {
        dineroTotal = maquina1.obtenerTotal();
        dineroTotal = dineroTotal + maquina2.obtenerTotal();
    System.out.println(dineroTotal);
    }
}
