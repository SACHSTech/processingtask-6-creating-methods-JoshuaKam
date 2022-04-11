import processing.core.PApplet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    
    
  }


  public void draw(){}
  
	
    //ground
    public class drawingComponent extends JComponent{
    public void paintComponent(Graphics g){
Graphics2D g2 = (Graphics2D) g;
  
    Ellipse2D.Double ellipse1 = new Ellipse2D.Double(width/2,height/40*32,width/40*55,height/40*28);
    g2.fill(ellipse1);
  
    
    //Building
   
    Rectangle rect1 = new Rectangle(width/40*5,height/40*15,width/40*30,height/40*15); 
    g2.fill(rect1);

    //flag pole
    
    Rectangle rect2 = new Rectangle(width/40*20,height/40*5,width/width*5,height/40* 10);  
    g2.fill(rect2);

    //flag
    
    triangle(width/40*20,height/40*5,width/40*20,height/80*19,width/40*13,height/40*8);
    fill(244,0,0);

    //door
     
    Rectangle rect3 = new Rectangle(width/80*35,height/40*23,width/200*16,height/200*34);
   g2.fill(rect3);
    

  
    Ellipse2D.Double ellipse2 = new Ellipse2D.Double(width/40*2,height/40*2,width/80*15,height/80*15);
  g2.fill(ellipse2);
    //Windows
   
    Rectangle rect4 = new Rectangle(width/40*9,height/40*20,width/40*4,height/40*4);
    Rectangle rect5 = new Rectangle(width/40*25,height/40*20,width/40*4,height/40*4);
     g2.fill(rect4);
     g2.fill(rect5);
    }
    }
}

  
  // define other methods down here.
