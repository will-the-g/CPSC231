/** A representation of a pizza order in which pizzas can be put in the order.
Each order has a certain number of pizzas. */
public class PizzaOrder{
    private Pizza[] m_order;
    private int m_numPizzas;
    private int remainingSlots;

    /** Default constructor creates an object of a single medium cheese pizza 
    The pizza is put in the first or only slot of the order*/
    public PizzaOrder(){
        m_order = new Pizza[1];
        Pizza pizza = new Pizza("medium", 1, 0, 0);
        m_order[0] = pizza;
        m_numPizzas = 1;
        remainingSlots = 0;
    }
    /** Overloaded Constructor accepts the values of number of pizzas
    @param m_numPizzas the number of pizzas in the order */
    public PizzaOrder(int m_numPizzas){
        this.m_order = new Pizza[m_numPizzas];
        this.m_numPizzas = m_numPizzas;
        this.remainingSlots = m_numPizzas;

    }
    /** Method adds a pizza to the order by "appending" it to the array
    @param pizza the pizza that is added
    @return 1 if the pizza is successfully added, and -1 if the order is full*/
    public int addPizza(Pizza pizza){
        if (this.remainingSlots == 0){
            return -1;
        }else{
            this.m_order[this.m_numPizzas - this.remainingSlots] = pizza;
            this.remainingSlots -= 1;
            return 1;
        }
    }
    /** caculates the total prices of the order by adding up the cost of each pizza in the order
    @return the total price of type double*/
    public double calcTotal(){
        double total = 0.0;
        for (int i = 0; i < this.m_order.length; i++){
            if (this.m_order[i] != null){
            total += this.m_order[i].calcCost();
            }
        }
        return total;
    }
    /** @return the String representation of the pizza order */
    public String toString(){
        String order = "Order \n----------------------\n";
        for (int i = 0; i < m_order.length; i++){
            order += this.m_order[i].getSize() + " pizza with " + this.m_order[i].getCheese() + " cheese, " + this.m_order[i].getPepperoni() + " pepperoni, and " + this.m_order[i].getVeggie() + " veggie toppings. Cost: $" + this.m_order[i].calcCost() + "\n";
        }
        order += "Total Cost = " + this.calcTotal();
        return order;
    }
}