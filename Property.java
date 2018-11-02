
public class Property {
	
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	
	/**
	 * A no arg constructor. With a default plot.
	 */
	
	public  Property(){
		this.city = "";
		this.owner = "";
		this.propertyName = "";
		this.rentAmount = 0.0;
		plot = new Plot(0,0,1,1);
	}
	
	/**
	 * A copy constructor, that creates a new object from the object passed to it. 
	 * @param p an instance of class property.
	 */
	
	public Property(Property p) {
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
		this.plot = p.plot;
	}
	
	/**
	 * A constructor that takes property name, city, rentAmount and owner of the property with default plot. 
	 * @param propertyName name of the property
	 * @param city where the property is found
	 * @param rentAmount the rent amount to be paid
	 * @param owner of the property
	 */
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(0,0,1,1);
	}
	
	/**
	 * Parameterized constructor
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);
	}
	 
	/**
	 * A set method sets property Name
	 * @param propetyName
	 * @param propertyName 
	 */
	
	public void  setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	/**
	 * A get method that returns the Property.
	 * @return
	 */
	public String getPropertyName() {
		return propertyName;
	}
	
	/**
	 * A set method that sets the city. 
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * A method that returns the city.
	 * @return city where the company is located.
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * A set method to set the owner
	 * @param owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * A get method to return the owner.
	 * @return
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * A set method that sets the amount of rent.
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	/**
	 * A get method that returns the rent amount.
	 * @return
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	
	/**
	 * A set method that sets the x, y, width, depth.
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public Plot setPlot(int x, int y, int width, int depth) {
		Plot plot = new Plot(x,y,width,depth);
		return plot;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public String toString() {
		String str = "Property Name: " + getPropertyName() + "\nLocated in city: " +
				getCity() + "\nBelonging to: " + getOwner() + "\nRent Amount: " + getRentAmount();
		return str;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
