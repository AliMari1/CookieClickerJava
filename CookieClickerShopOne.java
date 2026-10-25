import javax.swing.JButton;
import javax.swing.JFrame;

public class CookieClickerShopOne {

    JFrame frame; // giving access to frame

    // Shop one buttons
    JButton X2Multiplier = new JButton("2X Multiplier"); 
    JButton X5Multiplier = new JButton("5X Multiplier");
    JButton X10Multiplier = new JButton("10X Multiplier");
    JButton X20Multiplier = new JButton("20X Multiplier");
    JButton X50Multiplier = new JButton("50X Multiplier");
    JButton X100Multiplier = new JButton("100X Multiplier");

    public void setUpShopButtons() { // shop buttons function

        X2Multiplier.setBounds(40, 150, 130, 50);
        X5Multiplier.setBounds(190, 150, 130, 50);
        X10Multiplier.setBounds(340, 150, 130, 50);
        X20Multiplier.setBounds(490, 150, 130, 50);
        X50Multiplier.setBounds(640, 150, 130, 50);     

        frame.add(X2Multiplier);
        frame.add(X5Multiplier);
        frame.add(X10Multiplier);
        frame.add(X20Multiplier);
        frame.add(X50Multiplier);


    }

    public void cookieMultiplierButtons(){ // 2x multiplier for cookies 
        // 
    }
}
