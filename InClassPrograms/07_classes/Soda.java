public class Soda {
    private String flavor;
    private String company;
    private String name;
    private int size;

    public Soda(){
        name = null;
        flavor = null;
        company = null;
        size = 12;
    }
    public Soda(String name, String flavor, String company, int size){
        this.flavor = flavor;
        this.company = company;
        this.name = name;
        this.size = size;
    }
    public Soda(Soda sodaToCopy){
        this.flavor = sodaToCopy.flavor;
        this.company = sodaToCopy.company;
        this.name = sodaToCopy.name;
        this.size = sodaToCopy.size;
    }
    public String getFlavor(){
        return this.flavor;
    }
    public void setFlavor(String newFlavor){
        this.flavor = newFlavor; 
    }
    public String getCompany(){
        return this.company;
    }
    public void setCompany(String newCompany){
        this.company = newCompany;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getSize(){
        return this.size;
    }
    public void setSize(int newSize){
        this.size = newSize;
    }

    public String toString(){
        return "Soda: " + this.name 
        + "\n~~~~~~~~~~~~~~~~~\n" 
        + "Flavor: " + this.flavor
        + "\nCompany: " + this.company
        + "\nSize: " + this.size + " fl OZ";
    }

    public boolean equals(Object o){
        if (!(o instanceof Soda)){
            return false;
        }else{
            Soda other = (Soda)o;
            return other.name.equals(this.name) 
            && other.flavor.equals(this.flavor)
            && other.company.equals(this.company);
        }
    }
    public static void main(String[] args){
        Soda drPepper = new Soda("Dr. Pepper", "normal", "Pepsi", 12);
        System.out.println(drPepper);
    }
}   
