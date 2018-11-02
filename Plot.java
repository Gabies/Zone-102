
public class Plot {
	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	
	/**
	 * A no arg constructor.
	 */
	public Plot() {
		
		this.x =0;
		this.y= 0;
		this.width = 1;
		this.depth = 1;
		
	}
	
	/**
	 * A copy constructor.
	 * @param p
	 */
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}

	/**
	 * A parametrized constructor
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	
	
	//Doesn't work for none overlapping plots( test P3 and P4)
	
	//-----------------------------------------------------------------------------------------------
	public boolean overlaps(Plot plot) {
		
		return ((this.x < (plot.x + plot.width)) && ((this.x + this.width) > plot.x) && (this.y < (plot.y + plot.depth)) && ((this.y + this.depth)> plot.y));
		
	}
	
	public boolean encompasses(Plot plot) {
		
		return ((this.x <= plot.x) && (this.y <= plot.y) && ((this.y + this.depth) >= (plot.y + plot.depth)) && ((this.x+ this.width)>= (plot.x + plot.width)));
		
		 
	}
		
	
	/**
	 * A set method to set the value for x
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * A get method that returns the value of x. 
	 * @return
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * sets the value of y.
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * A get method to return the value of y. 
	 * @param y
	 * @return
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * A set method that sets width of the plot. 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * A get method that returns the width.
	 * @return
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * A set method that sets the value of depth of the property. 
	 * @param depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	/**
	 * A get method that returns depth.
	 * @return
	 */
	public int getDepth() {
		return depth;
	}
	
	/**
	 *  A toString that prints out x, y, width and depth of the plot. 
	 */
	public String toString() {
		String str = " Upper left: (" + getX() + ", " +  getY() +"); Width: " + getWidth() +
						"Depth: " + getDepth();
		
		return str;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
