import java.awt.*;
import java.applet.*;
public class LifeCycleApplet extends Applet{
String msg;
// set the foreground and background colors.

public void init() {
//Color c1=new Color(120,255,240);
setBackground(Color.cyan);
setForeground(Color.red);
msg = "Inside init( ) --";
}

public void start() {
msg += " Inside start( ) --";
}
public void stop() {
msg += " Inside stop( ) --";	
System.out.println("Applet Stopped");
}

public void destroy() {
System.out.println("Applet Destroyed");
}

// Display msg in applet window.
public void paint(Graphics g) {
g.setColor(Color.red);
msg += " Inside paint( ).";
g.drawString(msg, 10, 30);
}
} //end of class
