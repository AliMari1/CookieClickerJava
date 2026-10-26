import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CookieClickerShopOne {

    public CookieClickerShopOne(CookieClicker CookieGame) {
        this.CookieGame = CookieGame;
    }

    CookieClicker CookieGame;
    JFrame frame; // giving access to frame

    // Shop one buttons
    JButton X2Multiplier = new JButton("2X Multiplier");
    JButton X5Multiplier = new JButton("5X Multiplier");
    JButton X10Multiplier = new JButton("10X Multiplier");
    JButton X20Multiplier = new JButton("20X Multiplier");
    JButton X50Multiplier = new JButton("50X Multiplier");
    JButton backButton = new JButton("Back");

    // add labels above buttons for price of powerups

    public void setUpShopButtons() { // shop buttons function

        X2Multiplier.setBounds(40, 150, 130, 50);
        X5Multiplier.setBounds(190, 150, 130, 50);
        X10Multiplier.setBounds(340, 150, 130, 50);
        X20Multiplier.setBounds(490, 150, 130, 50);
        X50Multiplier.setBounds(640, 150, 130, 50);
        backButton.setBounds(20, 650, 100, 40);

        frame.add(X2Multiplier);
        frame.add(X5Multiplier);
        frame.add(X10Multiplier);
        frame.add(X20Multiplier);
        frame.add(X50Multiplier);
        frame.add(backButton);

        X2Multiplier.setVisible(true);
        X5Multiplier.setVisible(true);
        X10Multiplier.setVisible(true);
        X20Multiplier.setVisible(true);
        X50Multiplier.setVisible(true);

        backButton.setVisible(true);

        frame.repaint(); /*
                          * added because back button wouldnt show without it,
                          * and multiplier button was glitched
                          */

    }

    public void back() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // CookieClickerClass Buttons visibility set to true
                CookieGame.shopButton.setVisible(true);
                CookieGame.pauseButton.setVisible(true);
                CookieGame.shopTwoButton.setVisible(true);
                CookieGame.cookieClickerButton.setVisible(true);
                CookieGame.restart.setVisible(true);
                CookieGame.sell.setVisible(true);
                CookieGame.continueGameButton.setVisible(true);
                CookieGame.autoClickerButton.setVisible(true);

                // Shop One Buttons visibility set to false
                X2Multiplier.setVisible(false);
                X5Multiplier.setVisible(false);
                X10Multiplier.setVisible(false);
                X20Multiplier.setVisible(false);
                X50Multiplier.setVisible(false);

                backButton.setVisible(false);

                // works only once need to update
                frame.repaint();
            }
        });
    }

    public void cookieMultiplierButtons() { // Buttons that each have their own multiplier
        X2Multiplier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CookieGame.clickMultiplier *= 2;
            }
        });
    }
}
