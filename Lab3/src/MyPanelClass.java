import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.MAGENTA);
                        g.fillRect(x1, y1, width+1, height+1);
                        //Draw a border
//                        g.setColor(Color.GREEN);
//                        g.drawRect(x1, y1, width , height );
//                        //Another square
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1+10, y1+10, width-20 , height-20 );
                        //draw lines	
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
//                        g.setColor(Color.YELLOW);
//                        g.fillRoundRect((width/2) -27, (height/2) -27, 55, 55, getWidth(), getHeight());
                      
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
                        g.fillPolygon(p);
                        
                                    }
}