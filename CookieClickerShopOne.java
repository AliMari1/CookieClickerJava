import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CookieClickerShopOne {

    public CookieClickerShopOne(CookieClicker CookieGame) {
        this.CookieGame = CookieGame;
    }

    CookieClicker CookieGame;
    JFrame frame; // giving access to frame

    // Shop one buttons

    // LEFT OFF AROUND HERE

    // multiplier buttons
    JButton plus2Button = new JButton("+2 ($10)");
    JButton plus5Button = new JButton("+5  ($50)");
    JButton plus10Button = new JButton("+10  ($100)");
    JButton plus20Button = new JButton("+20  ($300)");
    JButton plus50Button = new JButton("+50  ($500)");

    // auto click buttons
    JButton auto1 = new JButton("Auto 1  ($10)");
    JButton auto2 = new JButton("Auto 2  ($100)");
    JButton auto3 = new JButton("Auto 3  ($1K)");
    JButton auto4 = new JButton("Auto 4  ($1.25K)");
    JButton auto5 = new JButton("Auto 5  ($2.5K)");

    // click boosts // temporary multipliers
    JButton clickBoost1 = new JButton("1.5x  ($2.5K)");
    JButton clickBoost2 = new JButton("2x  ($3K)");
    JButton clickBoost3 = new JButton("2.5x  ($5K)");
    JButton clickBoost4 = new JButton("3x  ($7.5K)");
    JButton clickBoost5 = new JButton("5x  ($10K)");

    // Buffs
    JButton frenzy = new JButton("Frenzy  ($25K)");
    JButton mega = new JButton("Mega  ($50K)");
    JButton lucky = new JButton("Lucky  ($75K)");
    JButton warp = new JButton("Warp  ($100K)");
    JButton rain = new JButton("Rain  ($150K)");

    // specials
    JButton grandma = new JButton("Grandma  ($500K)");
    JButton farm = new JButton("Farm  ($750K)");
    JButton mine = new JButton("Mine  ($1M)");
    JButton bank = new JButton("Bank  ($1.5M)");
    JButton empire = new JButton("Empire  ($2M)");

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

        moreCookiesLabel.setBounds(20, 100, 140, 30);
        autoLabel.setBounds(180, 100, 140, 30);
        boostLabel.setBounds(340, 100, 140, 30);
        buffLabel.setBounds(500, 100, 140, 30);
        specialLabel.setBounds(660, 100, 140, 30);

        moreCookiesLabel.setFont(new Font("Arial", Font.BOLD, 16));
        autoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        boostLabel.setFont(new Font("Arial", Font.BOLD, 16));
        buffLabel.setFont(new Font("Arial", Font.BOLD, 16));
        specialLabel.setFont(new Font("Arial", Font.BOLD, 16));

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
        plus2Button.setBounds(20, 150, 140, 50);
        plus5Button.setBounds(20, 250, 140, 50);
        plus10Button.setBounds(20, 350, 140, 50);
        plus20Button.setBounds(20, 450, 140, 50);
        plus50Button.setBounds(20, 550, 140, 50);

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
        auto1.setBounds(180, 150, 140, 50);
        auto2.setBounds(180, 250, 140, 50);
        auto3.setBounds(180, 350, 140, 50);
        auto4.setBounds(180, 450, 140, 50);
        auto5.setBounds(180, 550, 140, 50);

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

        clickBoost1.setBounds(340, 150, 140, 50);
        clickBoost2.setBounds(340, 250, 140, 50);
        clickBoost3.setBounds(340, 350, 140, 50);
        clickBoost4.setBounds(340, 450, 140, 50);
        clickBoost5.setBounds(340, 550, 140, 50);

        frame.add(clickBoost1);
        frame.add(clickBoost2);
        frame.add(clickBoost3);
        frame.add(clickBoost4);
        frame.add(clickBoost5);

        clickBoost1.setVisible(true);
        clickBoost2.setVisible(true);
        clickBoost3.setVisible(true);
        clickBoost4.setVisible(true);
        clickBoost5.setVisible(true);

        // Buffs
        frenzy.setBounds(500, 150, 140, 50);
        mega.setBounds(500, 250, 140, 50);
        lucky.setBounds(500, 350, 140, 50);
        warp.setBounds(500, 450, 140, 50);
        rain.setBounds(500, 550, 140, 50);

        frame.add(frenzy);
        frame.add(mega);
        frame.add(lucky);
        frame.add(warp);
        frame.add(rain);

        frenzy.setVisible(true);
        mega.setVisible(true);
        lucky.setVisible(true);
        warp.setVisible(true);
        rain.setVisible(true);

        // Specials
        grandma.setBounds(660, 150, 140, 50);
        farm.setBounds(660, 250, 140, 50);
        mine.setBounds(660, 350, 140, 50);
        bank.setBounds(660, 450, 140, 50);
        empire.setBounds(660, 550, 140, 50);

        frame.add(grandma);
        frame.add(farm);
        frame.add(mine);
        frame.add(bank);
        frame.add(empire);

        grandma.setVisible(true);
        farm.setVisible(true);
        mine.setVisible(true);
        bank.setVisible(true);
        empire.setVisible(true);

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


                clickBoost1.setVisible(false);
                clickBoost2.setVisible(false);
                clickBoost3.setVisible(false);
                clickBoost4.setVisible(false);
                clickBoost5.setVisible(false);


                frenzy.setVisible(false);
                mega.setVisible(false);
                lucky.setVisible(false);
                warp.setVisible(false);
                rain.setVisible(false);


                grandma.setVisible(false);
                farm.setVisible(false);
                mine.setVisible(false);
                bank.setVisible(false);
                empire.setVisible(false);




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
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
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
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
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
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
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
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
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
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    // auto clicker setup
    // public void autoClick1Setup() {
    // this.CookieGame.cookieClickerButton;
    // }
    // Auto Clicker function
    public void autoClicker1() { // Buttons that each have their own multiplier
        auto1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 10) {
                    auto1.setText("Purchased");
                    auto1.setEnabled(false);
                    CookieGame.goldCoinCount -= 10;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                    
                    timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.cookieClickerButton.doClick();
                        }
                    });

                    timer.start();
                } else {
                    howMuchMoreCoins = 10 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void autoClicker2() { // Buttons that each have their own multiplier
        auto2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (CookieGame.goldCoinCount >= 100) {
                    auto2.setText("Purchased");
                    auto2.setEnabled(false);
                    CookieGame.goldCoinCount -= 100;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                    timer = new Timer(500, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.cookieClickerButton.doClick();
                        }
                    });

                    timer.start();
                } else {
                    howMuchMoreCoins = 100 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void autoClicker3() { 
        auto3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CookieGame.goldCoinCount >= 1000) {
                    auto3.setText("Purchased");
                    auto3.setEnabled(false);
                    CookieGame.goldCoinCount -= 1000;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                    timer = new Timer(250, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.cookieClickerButton.doClick();
                        }
                    });

                    timer.start();
                } else {
                    howMuchMoreCoins = 1000 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void autoClicker4() { 
        auto4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CookieGame.goldCoinCount >= 1250) {
                    auto4.setText("Purchased");
                    auto4.setEnabled(false);
                    CookieGame.goldCoinCount -= 1250;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    timer = new Timer(200, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.cookieClickerButton.doClick();
                        }
                    });

                    timer.start();
                } else {
                    howMuchMoreCoins = 1250 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void autoClicker5() { // Buttons that each have their own multiplier
        auto5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if (CookieGame.goldCoinCount >= 2500) {
                    auto5.setText("Purchased");
                    auto5.setEnabled(false);
                    CookieGame.goldCoinCount -= 2500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                    
                    timer = new Timer(100, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.cookieClickerButton.doClick();
                        }
                    });

                    timer.start();
                } else {
                    howMuchMoreCoins = 2500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void clickBoostOne() { // Buttons that each have their own multiplier
        clickBoost1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (CookieGame.goldCoinCount >= 25) {
                    CookieGame.clickPlus *= 1.5;
                    clickBoost1.setText("Purchased");
                    clickBoost1.setEnabled(false);
                    CookieGame.goldCoinCount -= 25;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 25 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }


    public void clickBoostTwo() { 
        clickBoost2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CookieGame.goldCoinCount >= 50) {
                    CookieGame.clickPlus *= 2;
                    clickBoost2.setText("Purchased");
                    clickBoost2.setEnabled(false);
                    CookieGame.goldCoinCount -= 50;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 50 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }


    public void clickBoostThree() { // Buttons that each have their own multiplier
        clickBoost3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 75) {
                    CookieGame.clickPlus *= 2.5;
                    // make plus2buttton change name and make it unusable
                    clickBoost3.setText("Purchased");
                    clickBoost3.setEnabled(false);
                    CookieGame.goldCoinCount -= 75;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 75 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }


    public void clickBoostFour() { // Buttons that each have their own multiplier
        clickBoost4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 100) {
                    CookieGame.clickPlus *= 3;
                    clickBoost4.setText("Purchased");
                    clickBoost4.setEnabled(false);
                    CookieGame.goldCoinCount -= 100;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 100 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }


    public void clickBoostFive() { // Buttons that each have their own multiplier
        clickBoost5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 200) {
                    CookieGame.clickPlus *= 5;
                    // make plus2buttton change name and make it unusable
                    clickBoost5.setText("Purchased");
                    clickBoost5.setEnabled(false);
                    CookieGame.goldCoinCount -= 200;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 200 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }




    public void frenzyBuff() { // Buttons that each have their own multiplier
        frenzy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 100) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    frenzy.setText("Purchased");
                    frenzy.setEnabled(false);
                    CookieGame.goldCoinCount -= 100;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 100 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    } 



    public void megaBuff() { // Buttons that each have their own multiplier
        mega.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 250) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    mega.setText("Purchased");
                    mega.setEnabled(false);
                    CookieGame.goldCoinCount -= 250;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 250 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }



    public void luckyBuff() { // Buttons that each have their own multiplier
        lucky.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 300) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    lucky.setText("Purchased");
                    lucky.setEnabled(false);
                    CookieGame.goldCoinCount -= 300;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 300 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }



    public void warpBuff() { // Buttons that each have their own multiplier
        warp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 400) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    warp.setText("Purchased");
                    warp.setEnabled(false);
                    CookieGame.goldCoinCount -= 400;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 400 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }



    public void rainBuff() { // Buttons that each have their own multiplier
        rain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 500) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    rain.setText("Purchased");
                    rain.setEnabled(false);
                    CookieGame.goldCoinCount -= 500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }



    public void grandmaSpecial() { // Buttons that each have their own multiplier
        grandma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 750) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    grandma.setText("Purchased");
                    grandma.setEnabled(false);
                    CookieGame.goldCoinCount -= 750;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 750 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }



    public void farmSpecial() { // Buttons that each have their own multiplier
        farm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 500) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    farm.setText("Purchased");
                    farm.setEnabled(false);
                    CookieGame.goldCoinCount -= 500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }



    public void mineSpecial() { // Buttons that each have their own multiplier
        mine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 500) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    mine.setText("Purchased");
                    mine.setEnabled(false);
                    CookieGame.goldCoinCount -= 500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }




    public void bankSpecial() { // Buttons that each have their own multiplier
        bank.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 500) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    bank.setText("Purchased");
                    bank.setEnabled(false);
                    CookieGame.goldCoinCount -= 500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }




    public void empireSpecial() { // Buttons that each have their own multiplier
        empire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // LEFT OFF HERE COME BACKKKKK
                if (CookieGame.goldCoinCount >= 500) {
                    CookieGame.clickPlus += 49;
                    // make plus2buttton change name and make it unusable
                    empire.setText("Purchased");
                    empire.setEnabled(false);
                    CookieGame.goldCoinCount -= 500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }







}