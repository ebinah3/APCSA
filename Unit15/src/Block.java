//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(0);
		setY(0);
		setW(10);
		setH(10);
		setColor(Color.WHITE);
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y){
		setX(x);
		setY(y);
		setW(10);
		setH(10);
		setColor(Color.WHITE);
	}
	public Block(int x, int y, int w, int h){
		setX(x);
		setY(y);
		setW(w);
		setH(h);
		setColor(Color.WHITE);
	}
	public Block(int x, int y, int w, int h, Color c){
		setX(x);
		setY(y);
		setW(w);
		setH(h);
		setColor(c);
	}
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   public void setX(int x){
	   xPos = x;
   }
   
   public void setY(int y){
	   yPos = y;
   }
   
   public void setW(int w){
	   width = w;
   }
   
   public void setH(int h ){
	   height = h;
   }

   public void setColor(Color col)
   {
	   color = col;

   }
   public void setPos(int x, int y){
	   setX(x);
	   setY(y);
   }

   public int getX(){
	   return xPos;
   }
   public int getY(){
	   return yPos;
   }
   public int getWidth(){
	   return width;
   }
   public int getHeight(){
	   return height;
   }
   public Color getColor(){
	   return color;
   }
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;



		return false;
	}   

	public String toString(){
		return "x - " + getX() + " || y - " + getY() + " || width - " + getWidth() + " || height - " + getHeight() + " || color - " + getColor();
	}
    

}