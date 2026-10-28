import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
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
    JButton plus2Button = new JButton("+2  ($100)");
    JButton plus5Button = new JButton("+5  ($1K)");
    JButton plus10Button = new JButton("+10  ($10K)");
    JButton plus20Button = new JButton("+20  ($100K)");
    JButton plus50Button = new JButton("+50  ($1M)");

    // auto click buttons
    JButton auto1 = new JButton("Auto 1  ($100k)");
    JButton auto2 = new JButton("Auto 2  ($500k)");
    JButton auto3 = new JButton("Auto 3  ($1M)");
    JButton auto4 = new JButton("Auto 4  ($5M)");
    JButton auto5 = new JButton("Auto 5  ($10M)");

    // click boosts // temporary multipliers
    JButton clickBoost1 = new JButton("x2  ($1M)");
    JButton clickBoost2 = new JButton("x5  ($10M)");
    JButton clickBoost3 = new JButton("x10  ($100M)");
    JButton clickBoost4 = new JButton("x25  ($500M)");
    JButton clickBoost5 = new JButton("x50  ($1B)");

    // Buffs
    JButton frenzy = new JButton("Frenzy  ($1B)");
    JButton mega = new JButton("Mega  ($5B)");
    JButton lucky = new JButton("Lucky  ($10B)");
    JButton Warp = new JButton("Warp  ($100B)");
    JButton Rain = new JButton("Rain  ($500B)");

    // specials
    JButton grandma = new JButton("Grandma  ($1T)");
    JButton farm = new JButton("Farm  ($5T)");
    JButton Mine = new JButton("Mine  ($10T)");
    JButton bank = new JButton("Bank  ($100T)");
    JButton empire = new JButton("Empire  ($500T)");

    JButton backButton = new JButton("Back");

    JLabel moreCookiesLabel = new JLabel("More Cookies");
    JLabel autoLabel = new JLabel("Auto Clickers");
    JLabel boostLabel = new JLabel("Click Boosts");
    JLabel buffLabel = new JLabel("Buffs");
    JLabel specialLabel = new JLabel("Specials");

    JLabel multiplierLabel = new JLabel();

    // Timer
    public Timer timer;

    public int howMuchMoreCoins = 0;

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

        // Auto Clickers
        auto1.setBounds(170, 150, 120, 50);
        auto2.setBounds(170, 250, 120, 50);
        auto3.setBounds(170, 350, 120, 50);
        auto4.setBounds(170, 450, 120, 50);
        auto5.setBounds(170, 550, 120, 50);

        frame.add(auto1);
        frame.add(auto2);
        frame.add(auto3);
        frame.add(auto4);
        frame.add(auto5);

        auto1.setVisible(true);
        auto2.setVisible(true);
        auto3.setVisible(true);
        auto4.setVisible(true);
        auto5.setVisible(true);

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

                auto1.setVisible(false);
                auto2.setVisible(false);
                auto3.setVisible(false);
                auto4.setVisible(false);
                auto5.setVisible(false);

                backButton.setVisible(false);

                frame.repaint();
            }
        });
    }

    public void addCookiePlus2() {
        plus2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CookieGame.goldCoinCount >= 10) {
                    CookieGame.clickPlus += 1;
                    plus2Button.setText("Purchased");
                    plus2Button.setEnabled(false);
                    CookieGame.goldCoinCount -= 10;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 10 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }

    public void addCookiePlus5() {
        plus5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 50) {
                    CookieGame.clickPlus += 4;
                    plus5Button.setText("Purchased");
                    plus5Button.setEnabled(false);
                    CookieGame.goldCoinCount -= 50;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 50 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }

    public void addCookiePlus10() {
        plus10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 100) {
                    CookieGame.clickPlus += 9;
                    plus10Button.setText("Purchased");
                    plus10Button.setEnabled(false);
                    CookieGame.goldCoinCount -= 100;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 100 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }

    public void addCookiePlus20() { // Buttons that each have their own multiplier
        plus20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 300) {
                    CookieGame.clickPlus += 19;
                    // make plus2buttton change name and make it unusable
                    plus20Button.setText("Purchased");
                    plus20Button.setEnabled(false);
                    CookieGame.goldCoinCount -= 300;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 300 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }

    public void addCookiePlus50() { // Buttons that each have their own multiplier
        plus50Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 500) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    plus50Button.setText("Purchased");
                    plus50Button.setEnabled(false);
                    CookieGame.goldCoinCount -= 500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }



    // auto clicker setup
  //  public void autoClick1Setup() {
    //    this.CookieGame.cookieClickerButton;
    //}
    // Auto Clicker function
    public void autoClicker1() { // Buttons that each have their own multiplier
        auto1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 10) {
                    //CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    auto1.setText("Purchased");
                    auto1.setEnabled(false);
                    CookieGame.goldCoinCount -= 10;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                   // autoClick1Setup();
                   timer = new Timer(1000, new ActionListener() {
                    @Override 
                    public void actionPerformed(ActionEvent e) {
                        CookieGame.cookieClickerButton.doClick();
                    }
                   });

                   timer.start();
                } else {
                    howMuchMoreCoins = 10 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }



    public void autoClicker2() { // Buttons that each have their own multiplier
        auto2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 100) {
                    
                    // make plus2buttton change name and make it unusable
                    auto2.setText("Purchased");
                    auto2.setEnabled(false);
                    CookieGame.goldCoinCount -= 100;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                   // autoClick1Setup();
                   timer = new Timer(500, new ActionListener() {
                    @Override 
                    public void actionPerformed(ActionEvent e) {
                        CookieGame.cookieClickerButton.doClick();
                    }
                   });

                   timer.start();
                } else {
                    howMuchMoreCoins = 100 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }




    public void autoClicker3() { // Buttons that each have their own multiplier
        auto3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 1000) {
                    //CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    auto3.setText("Purchased");
                    auto3.setEnabled(false);
                    CookieGame.goldCoinCount -= 1000;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                   // autoClick1Setup();
                   timer = new Timer(250, new ActionListener() {
                    @Override 
                    public void actionPerformed(ActionEvent e) {
                        CookieGame.cookieClickerButton.doClick();
                    }
                   });

                   timer.start();
                } else {
                    howMuchMoreCoins = 1000 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }





    public void autoClicker4() { // Buttons that each have their own multiplier
        auto4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 1250) {
                    //CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    auto4.setText("Purchased");
                    auto4.setEnabled(false);
                    CookieGame.goldCoinCount -= 1250;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                   // autoClick1Setup();
                   timer = new Timer(200, new ActionListener() {
                    @Override 
                    public void actionPerformed(ActionEvent e) {
                        CookieGame.cookieClickerButton.doClick();
                    }
                   });

                   timer.start();
                } else {
                    howMuchMoreCoins = 1250 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }





    public void autoClicker5() { // Buttons that each have their own multiplier
        auto5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 2500) {
                    //CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    auto5.setText("Purchased");
                    auto5.setEnabled(false);
                    CookieGame.goldCoinCount -= 2500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                   // autoClick1Setup();
                   timer = new Timer(100, new ActionListener() {
                    @Override 
                    public void actionPerformed(ActionEvent e) {
                        CookieGame.cookieClickerButton.doClick();
                    }
                   });

                   timer.start();
                } else {
                    howMuchMoreCoins = 2500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame, "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins + " more coins to purchase this item!");
                }

            }
        });
    }

    //Need to add item in shop double 1.5x sell 2.0x sell and so on.




}