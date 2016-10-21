public class TrainStation   //Creo una clase de tren estaci�n, no lo traducto porque usa el nombre en ingl�s durante la pr�ctica 
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
