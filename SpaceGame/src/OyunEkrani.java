
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkrani extends JFrame {

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        
        OyunEkrani ekran=new OyunEkrani("Uzay Oyunu");
        ekran.setResizable(false);
        ekran.setFocusable(false); //bir tusa bastıgmız zaman islemlerin JFrame ustunde olmasini istemedigmiz icin false dedik.
        
        ekran.setSize(800, 600);
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun=new Oyun();
        
        oyun.requestFocus(); // klavyeden olan islemleri bu JPanelin almasi icin focusu bu panele verecek
        
        oyun.addKeyListener(oyun); //klavyeden islemleri almamizi sagliyor
        
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        
        ekran.add(oyun);
        
        ekran.setVisible(true);
        
        
    }
}
