import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CookieClickerShopOne {

    public CookieClickerShopOne(CookieClicker CookieGame) {
        this.CookieGame = CookieGame;
    }

    CookieClicker CookieGame;
    JFrame frame; // giving access to frame

    // Shop one buttons
    // multiplier buttons
    JButton X2Multiplier = new JButton("2X Multiplier");
    JButton X5Multiplier = new JButton("5X Multiplier");
    JButton X10Multiplier = new JButton("10X Multiplier");
    JButton X20Multiplier = new JButton("20X Multiplier");
    JButton X50Multiplier = new JButton("50X Multiplier");

    // auto click buttons
    JButton auto1 = new JButton("Auto 1");
    JButton auto2 = new JButton("Auto 2");
    JButton auto3 = new JButton("Auto 3");
    JButton auto4 = new JButton("Auto 4");
    JButton auto5 = new JButton("Auto 5");

    // click boosts
    JButton clickBoost1 = new JButton("+1 Click");
    JButton clickBoost2 = new JButton("+5 Click");
    JButton clickBoost3 = new JButton("+10 Click");
    JButton clickBoost4 = new JButton("+25 Click");
    JButton clickBoost5 = new JButton("+50 Click");

    // Buffs
    JButton frenzy = new JButton("Frenzy");
    JButton mega = new JButton("Mega");
    JButton lucky = new JButton("Lucky");
    JButton Warp = new JButton("Warp");
    JButton Rain = new JButton("Rain");

    // specials
    JButton grandma = new JButton("Grandma");
    JButton farm = new JButton("Farm");
    JButton Mine = new JButton("Mine");
    JButton bank = new JButton("Bank");
    JButton empire = new JButton("Empire");

    JButton backButton = new JButton("Back");

    JLabel multiplierLabel = new JLabel("Multipliers");
    JLabel autoLabel = new JLabel("Auto Clickers");
    JLabel boostLabel = new JLabel("Click Boosts");
    JLabel buffLabel = new JLabel("Buffs");
    JLabel specialLabel = new JLabel("Specials");

    // add labels above buttons for price of powerups

    public void shopOneLabels() {
        multiplierLabel.setBounds(20, 100, 120, 30);
        autoLabel.setBounds(170, 100, 120, 30);
        boostLabel.setBounds(320, 100, 120, 30);
        buffLabel.setBounds(470, 100, 120, 30);
        specialLabel.setBounds(620, 100, 120, 30);

        frame.add(multiplierLabel);
        frame.add(autoLabel);
        frame.add(boostLabel);
        frame.add(buffLabel);
        frame.add(specialLabel);

        multiplierLabel.setVisible(true);
        autoLabel.setVisible(true);
        boostLabel.setVisible(true);
        buffLabel.setVisible(true);
        specialLabel.setVisible(true);

        frame.repaint();
    }

    public void setUpShopButtons() { // shop buttons function

        // multiplier buttons
        X2Multiplier.setBounds(20, 150, 120, 50);
        X5Multiplier.setBounds(20, 250, 120, 50);
        X10Multiplier.setBounds(20, 350, 120, 50);
        X20Multiplier.setBounds(20, 450, 120, 50);
        X50Multiplier.setBounds(20, 550, 120, 50);

        backButton.setBounds(20, 700, 100, 40); // back button

        // add multiplier buttons and back button
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

                // Shop one labels visibility set to false
                multiplierLabel.setVisible(false);
                autoLabel.setVisible(false);
                boostLabel.setVisible(false);
                buffLabel.setVisible(false);
                specialLabel.setVisible(false);

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
