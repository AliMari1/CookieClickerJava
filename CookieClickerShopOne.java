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
    JButton plus2Button = new JButton("+2 cookies ($100)");
    JButton plus5Button = new JButton("+5 cookies");
    JButton plus10Button = new JButton("+10 cookies");
    JButton plus20Button = new JButton("+20 cookies");
    JButton plus50Button = new JButton("+50 cookies");

    // auto click buttons
    JButton auto1 = new JButton("Auto 1");
    JButton auto2 = new JButton("Auto 2");
    JButton auto3 = new JButton("Auto 3");
    JButton auto4 = new JButton("Auto 4");
    JButton auto5 = new JButton("Auto 5");

    // click boosts // temporary multipliers
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

    JLabel moreCookiesLabel = new JLabel("More Cookies");
    JLabel autoLabel = new JLabel("Auto Clickers");
    JLabel boostLabel = new JLabel("Click Boosts");
    JLabel buffLabel = new JLabel("Buffs");
    JLabel specialLabel = new JLabel("Specials");

    // add labels above buttons for price of powerups

    public void shopOneLabels() {
        moreCookiesLabel.setBounds(20, 100, 120, 30);
        autoLabel.setBounds(170, 100, 120, 30);
        boostLabel.setBounds(320, 100, 120, 30);
        buffLabel.setBounds(470, 100, 120, 30);
        specialLabel.setBounds(620, 100, 120, 30);

        frame.add(moreCookiesLabel);
        frame.add(autoLabel);
        frame.add(boostLabel);
        frame.add(buffLabel);
        frame.add(specialLabel);

        moreCookiesLabel.setVisible(true);
        autoLabel.setVisible(true);
        boostLabel.setVisible(true);
        buffLabel.setVisible(true);
        specialLabel.setVisible(true);

        frame.repaint();
    }

    public void setUpShopButtons() { // shop buttons function

        // multiplier buttons
        plus2Button.setBounds(20, 150, 120, 50);
        plus5Button.setBounds(20, 250, 120, 50);
        plus10Button.setBounds(20, 350, 120, 50);
        plus20Button.setBounds(20, 450, 120, 50);
        plus50Button.setBounds(20, 550, 120, 50);

        backButton.setBounds(20, 700, 100, 40); // back button

        // add multiplier buttons and back button
        frame.add(plus2Button);
        frame.add(plus5Button);
        frame.add(plus10Button);
        frame.add(plus20Button);
        frame.add(plus50Button);
        frame.add(backButton);

        plus2Button.setVisible(true);
        plus5Button.setVisible(true);
        plus10Button.setVisible(true);
        plus20Button.setVisible(true);
        plus50Button.setVisible(true);

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
                plus2Button.setVisible(false);
                plus5Button.setVisible(false);
                plus10Button.setVisible(false);
                plus20Button.setVisible(false);
                plus50Button.setVisible(false);

                // Shop one labels visibility set to false
                moreCookiesLabel.setVisible(false);
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

    public void addCookiePlus2() { // Buttons that each have their own multiplier
        plus2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CookieGame.clickPlus += 1;
                // make plus2buttton change name and make it unusable
                plus2Button.setText("Purchased");
                plus2Button.setEnabled(false);

            }
        });
    }

    public void addCookiePlus5() { // Buttons that each have their own multiplier
        plus5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CookieGame.clickPlus += 4;
                // make plus2buttton change name and make it unusable
                plus5Button.setText("Purchased");
                plus5Button.setEnabled(false);
            }
        });

}

public void addCookiePlus10() { // Buttons that each have their own multiplier
        plus10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CookieGame.clickPlus += 9;
                // make plus2buttton change name and make it unusable
                plus10Button.setText("Purchased");
                plus10Button.setEnabled(false);
            }
        });

}

public void addCookiePlus20() { // Buttons that each have their own multiplier
        plus20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CookieGame.clickPlus += 19;
                // make plus2buttton change name and make it unusable
                plus20Button.setText("Purchased");
                plus20Button.setEnabled(false);
            }
        });

}

public void addCookiePlus50() { // Buttons that each have their own multiplier
        plus50Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CookieGame.clickPlus += 49;
                // make plus2buttton change name and make it unusable
                plus50Button.setText("Purchased");
                plus50Button.setEnabled(false);
            }
        });

}
}