//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setXS(3);
		setYS(1);
	}

	public Ball(int x, int y){
		super(x,y);
		setXS(3);
		setYS(1);
	}
	public Ball(int x, int y, int w, int h){
		super(x,y, w, h);
		setXS(3);
		setYS(1);
	}
	public Ball(int x, int y, int w, int h, Color c){
		super(x,y, w, h, c);
		setXS(3);
		setYS(1);
	}
	public Ball(int x, int y, int w, int h, Color c, int xs, int ys){
		super(x,y, w, h, c);
		setXS(xs);
		setYS(ys);
	}
	//add the other Ball constructors
	
	
	
	
	
	
	public void setXS(int x){
		xSpeed = x;
	}
	public void setYS(int y){
		ySpeed = y;
	}
	
	public int getXS(){
		return xSpeed;
	}
	public int getYS(){
		return ySpeed;
	}
	
	
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.WHITE);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);

		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		return false;
	}   

   //add the get methods
	public String toString(){
		return super.toString() + " || xSpeed - " + getXS() + " || ySpeed - " + getYS();
	}
   //add a toString() method
}