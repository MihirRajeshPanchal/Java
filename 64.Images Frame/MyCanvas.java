import java.awt.*;  
import javax.swing.JFrame; 
import javax.swing.*; 
  
public class MyCanvas extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image k=t.getImage("6.jpg");  
        g.drawImage(k, 1920,960,this);
        Image i=t.getImage("Captain America.png");  
        g.drawImage(i, 0,100,this);  
        Image j=t.getImage("Loki.png");  
        g.drawImage(j, 800,100,this); 
 
        /*Image l=t.getImage("Captain America.png");  
        g.drawImage(l, 360,100,this);*/
          
    }  
        public static void main(String[] args) {  
        MyCanvas m=new MyCanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(1920,960);  
        f.setVisible(true);  
    }  
}  