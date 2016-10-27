/**

* Los modelos TicketMachine una máquina expendedora de billetes ingenua que las cuestiones
 * Boletos de tarifa plana.
 * El precio de un billete se especifica mediante el constructor.
 * Es una máquina ingenua en el sentido de que confía en sus usuarios
 * Para insertar dinero suficiente antes de intentar imprimir un boleto.
 * También se supone que los usuarios entran en cantidades razonables.
 *
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // El precio del ticket
    private int precio;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine()
    {
        precio = 800;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int damePrecio()
    {
        return precio;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int dameBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void introducirDinero (int cantidad)
    {
        balance = balance + cantidad;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void imprimirTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + precio + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
    public int obtenerTotal()
    {
        return total;
    }
    
    
    /*ACTIVIDAD 0233 Me manda hacer:
       
       Codifica en BlueJ el método setter llamado setPrice, comprueba que funciona y haz un commit describiendo los cambios.*/
        public void introducirPreciol(int nuevoPrecio)
    {
        precio = nuevoPrecio;
    }
    
    public void imprimirError()
    {
              System.out.println("Por favor, inserta la cantidad de dinero correcta");
    }
    
    public void mostrarPrecio()
    {
        System.out.println("El precio del ticket son " + precio + " €.");    }
}
