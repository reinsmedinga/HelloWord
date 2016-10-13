
import java.awt.*;
import javax.swing.* ;

public class HelloWorld extends JFrame
{

   private static final long serialVersionUID = -1763277548232807371L;

   public HelloWorld () {
     setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
     this.setSize (250,80);
     this.setTitle ("Hello World");
     this.getContentPane().add (new JLabel ("Hello World"));
     this.setVisible(true) ;
   }


  public static void main (String[] argv) {
  	  	new HelloWorld () ; 
  	  }
}
