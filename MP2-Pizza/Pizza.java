/**  A representation of pizza in a pizza order.
Each pizza has a size of small, medium, or large.
There are a number of toppings that include cheese, pepperoni, and veggie.
 */
public class Pizza{
    private String m_size;
    private int m_cheese;
    private int m_pepperoni;
    private int m_veggie;

    /** Default constructor creates an object of a medium 
    cheese pizza
     */
    public Pizza(){
        m_size = "medium";
        m_cheese = 1;
    }
    /** Overloaded Constructor accepts values for size, cheese, pepperoni, and veggies
    @param m_size the size of the pizza
    @param m_cheese the number of cheese toppings on the pizza
    @param m_pepperoni the number of pepperoni toppings on the pizza
    @param m_veggie the number of veggie topppings on the pizza */
    public Pizza(String m_size, int m_cheese, int m_pepperoni, int m_veggie){
        this.m_size = m_size;
        this.m_cheese = m_cheese;
        this.m_pepperoni = m_pepperoni;
        this.m_veggie = m_veggie;
    }
    /** Copy Constructor creates a duplicate object for the given pizza
    @param pizzaToCopy the pizza object you'd like to duplicate */
    public Pizza(Pizza pizzaToCopy){
        this.m_size = pizzaToCopy.m_size;
        this.m_cheese = pizzaToCopy.m_cheese;
        this.m_pepperoni = pizzaToCopy.m_pepperoni;
        this.m_veggie = pizzaToCopy.m_veggie;
    }
    /** Accessor for the size of the pizza
    @return string */
    public String getSize(){
        return this.m_size;
    }
    /** The mutator for the size of the pizza
    @param m_size the new value for the string representation of the size of the pizza */
    public void setSize(String m_size){
        this.m_size = m_size;
    }
    /** Accessor for the number of cheese toppings on the pizza
    @return the number of toppings */
    public int getCheese(){
        return this.m_cheese;
    }
    /** The mutator for the number of cheese toppings
    @param m_cheese the new value for the number of cheese toppings */
    public void setCheese(int m_cheese){
        this.m_cheese = m_cheese;
    }
    /** Accessor for the number of pepperoni toppings
    @return the number of toppings */
    public int getPepperoni(){
        return this.m_pepperoni;
    }
    /** The mutator for the number of pepperoni toppings
    @param m_pepperoni the new value for the number of pepperoni toppings */
    public void setPepperoni(int m_pepperoni){
        this.m_pepperoni = m_pepperoni;
    }
    /** The Accessor for the number of veggie toppings
    @return the number of toppings */
    public int getVeggie(){
        return this.m_veggie;
    }
    /** The mutator for the number of veggie toppings
    @param m_veggie the new value for the number of veggie topppings */
    public void setVeggie(int m_veggie){
        this.m_veggie = m_veggie;
    }
    /** Caclulates the the cost of the pizza based off the size and the number of toppings. 10$ for small, 12$ for medium,
    14$ for large, and 2$ for each topping.
    @return the cost of the pizza in type double*/
    public double calcCost(){
        if (this.m_size.equals("small")){
            return 10.0 + 2.0 * (this.m_cheese + this.m_pepperoni + this.m_veggie);
        }
        if (this.m_size.equals("medium")){
            return 12.0 + 2.0 * (this.m_cheese + this.m_pepperoni + this.m_veggie);
        }
        if (this.m_size.equals("large")){
            return 14.0 + 2.0 * (this.m_cheese + this.m_pepperoni + this.m_veggie);
        }else {
            return 0.0;
        }
    }
    /** @return the String representation of the pizza */
    public String toString(){
        return "Size: " + this.m_size
        + "\n Toppings: " + this.m_cheese + " Cheese " + this.m_pepperoni + " Pepperoni: " + this.m_veggie + " Veggie: " 
        + "\n Cost: " + this.calcCost();
    }
    /** Two pizzas are equal if they share the same size, number of cheese, number of pepperoni, and number of veggie toppings 
    @param o the object that is compared to the pizza
    @return true if the object is equal and false if it isn't*/
    public boolean equals(Object o){
        if (!(o instanceof Pizza)){
            return false;
        }else{
            Pizza pizza = (Pizza)o;
            return pizza.m_size.equals(this.m_size)
            && pizza.m_cheese == this.m_cheese
            && pizza.m_pepperoni == this.m_pepperoni
            && pizza.m_veggie == this.m_veggie;

        }
    }
    
}