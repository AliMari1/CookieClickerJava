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
    JFrame frame;

    JButton plus2Button = new JButton("+2 ($10)");
    JButton plus5Button = new JButton("+5  ($30)");
    JButton plus10Button = new JButton("+10  ($75)");
    JButton plus20Button = new JButton("+20  ($150)");
    JButton plus50Button = new JButton("+50  ($400)");

    JButton auto1 = new JButton("Auto 1  ($25)");
    JButton auto2 = new JButton("Auto 2  ($100)");
    JButton auto3 = new JButton("Auto 3  ($300)");
    JButton auto4 = new JButton("Auto 4  ($750)");
    JButton auto5 = new JButton("Auto 5  ($1500)");

    JButton clickBoost1 = new JButton("1.5x  ($25)");
    JButton clickBoost2 = new JButton("2x  ($50)");
    JButton clickBoost3 = new JButton("2.5x  ($100)");
    JButton clickBoost4 = new JButton("3x  ($150)");
    JButton clickBoost5 = new JButton("5x  ($300)");

    JButton frenzy = new JButton("Frenzy  ($50)");
    JButton mega = new JButton("Mega  ($100)");
    JButton lucky = new JButton("Lucky  ($150)");
    JButton warp = new JButton("Warp  ($250)");
    JButton rain = new JButton("Rain  ($500)");

    JButton grandma = new JButton("Grandma  ($100)");
    JButton farm = new JButton("Farm  ($300)");
    JButton mine = new JButton("Mine  ($700)");
    JButton bank = new JButton("Bank  ($1250)");
    JButton empire = new JButton("Empire  ($2500)");

    JButton backButton = new JButton("Back");

    JLabel moreCookiesLabel = new JLabel("More Cookies");
    JLabel autoLabel = new JLabel("Auto Clickers");
    JLabel boostLabel = new JLabel("Click Boosts");
    JLabel buffLabel = new JLabel("Buffs");
    JLabel specialLabel = new JLabel("Specials");

    JLabel multiplierLabel = new JLabel();

    public int autoClickersBought = 0;

    public Timer auto1Timer;
    public Timer auto2Timer;
    public Timer auto3Timer;
    public Timer auto4Timer;
    public Timer auto5Timer;
    public Timer rainBuffTimer;

    public int howMuchMoreCoins = 0;

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

    public void setUpShopButtons() {

        // multiplier buttons
        plus2Button.setBounds(20, 150, 140, 50);
        plus5Button.setBounds(20, 250, 140, 50);
        plus10Button.setBounds(20, 350, 140, 50);
        plus20Button.setBounds(20, 450, 140, 50);
        plus50Button.setBounds(20, 550, 140, 50);

        backButton.setBounds(20, 700, 100, 40);

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

        frame.repaint();

    }

    public void back() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CookieGame.shopButton.setVisible(true);
                CookieGame.pauseButton.setVisible(true);
                CookieGame.statsButton.setVisible(true);
                CookieGame.cookieClickerButton.setVisible(true);
                CookieGame.restart.setVisible(true);
                CookieGame.sell.setVisible(true);
                CookieGame.continueGameButton.setVisible(true);
                CookieGame.autoClickerButton.setVisible(true);
                CookieGame.cookieLabel.setVisible(false);

                CookieGame.saveButton.setVisible(true);
                CookieGame.loadButton.setVisible(true);
                
                plus2Button.setVisible(false);
                plus5Button.setVisible(false);
                plus10Button.setVisible(false);
                plus20Button.setVisible(false);
                plus50Button.setVisible(false);

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
                    CookieGame.stats.totalUpgradesBought++;
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

                if (CookieGame.goldCoinCount >= 30) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus += 4;
                    plus5Button.setText("Purchased");
                    plus5Button.setEnabled(false);
                    CookieGame.goldCoinCount -= 30;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 30 - CookieGame.goldCoinCount;
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

                if (CookieGame.goldCoinCount >= 75) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus += 9;
                    plus10Button.setText("Purchased");
                    plus10Button.setEnabled(false);
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

    public void addCookiePlus20() {
        plus20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 150) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus += 19;

                    plus20Button.setText("Purchased");
                    plus20Button.setEnabled(false);
                    CookieGame.goldCoinCount -= 150;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 150 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void addCookiePlus50() {
        plus50Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 400) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus += 49;

                    plus50Button.setText("Purchased");
                    plus50Button.setEnabled(false);
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

    public void autoClicker1() {
        auto1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 25) {
                    CookieGame.stats.totalUpgradesBought++;
                    autoClickersBought++;
                    auto1.setText("Purchased");
                    auto1.setEnabled(false);
                    CookieGame.goldCoinCount -= 25;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    auto1Timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (CookieGame.autoClickersEnabled) {
                                CookieGame.cookieClickerButton.doClick();
                            }

                        }
                    });
                    auto1Timer.start();

                } else {

                    howMuchMoreCoins = 25 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void autoClicker2() {
        auto2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 100) {
                    CookieGame.stats.totalUpgradesBought++;
                    autoClickersBought++;
                    auto2.setText("Purchased");
                    auto2.setEnabled(false);
                    CookieGame.goldCoinCount -= 100;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                    auto2Timer = new Timer(900, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (CookieGame.autoClickersEnabled) {
                                CookieGame.cookieClickerButton.doClick();
                            }
                        }
                    });

                    auto2Timer.start();
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
                if (CookieGame.goldCoinCount >= 300) {
                    CookieGame.stats.totalUpgradesBought++;
                    autoClickersBought++;
                    auto3.setText("Purchased");
                    auto3.setEnabled(false);
                    CookieGame.goldCoinCount -= 300;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                    auto3Timer = new Timer(800, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (CookieGame.autoClickersEnabled) {
                                CookieGame.cookieClickerButton.doClick();
                            }
                        }
                    });

                    auto3Timer.start();
                } else {
                    howMuchMoreCoins = 300 - CookieGame.goldCoinCount;
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
                if (CookieGame.goldCoinCount >= 750) {
                    CookieGame.stats.totalUpgradesBought++;
                    autoClickersBought++;
                    auto4.setText("Purchased");
                    auto4.setEnabled(false);
                    CookieGame.goldCoinCount -= 750;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    auto4Timer = new Timer(700, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (CookieGame.autoClickersEnabled) {
                                CookieGame.cookieClickerButton.doClick();
                            }
                        }
                    });

                    auto4Timer.start();
                } else {
                    howMuchMoreCoins = 750 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void autoClicker5() {
        auto5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 1500) {
                    CookieGame.stats.totalUpgradesBought++;
                    autoClickersBought++;
                    auto5.setText("Purchased");
                    auto5.setEnabled(false);
                    CookieGame.goldCoinCount -= 1500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    auto5Timer = new Timer(500, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (CookieGame.autoClickersEnabled) {
                                CookieGame.cookieClickerButton.doClick();
                            }
                        }
                    });

                    auto5Timer.start();
                } else {
                    howMuchMoreCoins = 1500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void clickBoostOne() {
        clickBoost1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 25) {
                    CookieGame.stats.totalUpgradesBought++;
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
                    CookieGame.stats.totalUpgradesBought++;
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

    public void clickBoostThree() {
        clickBoost3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 100) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus *= 2.5;

                    clickBoost3.setText("Purchased");
                    clickBoost3.setEnabled(false);
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

    public void clickBoostFour() {
        clickBoost4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 150) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus *= 3;
                    clickBoost4.setText("Purchased");
                    clickBoost4.setEnabled(false);
                    CookieGame.goldCoinCount -= 150;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 150 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void clickBoostFive() {
        clickBoost5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 300) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus *= 5;

                    clickBoost5.setText("Purchased");
                    clickBoost5.setEnabled(false);
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

    public void frenzyBuff() {
        frenzy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 50) {
                    CookieGame.stats.totalUpgradesBought++;
                    double frenzyClickPlus = CookieGame.clickPlus;
                    CookieGame.clickPlus *= 2;
                    frenzy.setText("Purchased");
                    frenzy.setEnabled(false);
                    CookieGame.goldCoinCount -= 50;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    Timer frenzyTimer = new Timer(10000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.clickPlus = frenzyClickPlus;
                            frenzy.setText("Frenzy ($50)");
                            frenzy.setEnabled(true);

                        }

                    });

                    frenzyTimer.setRepeats(false);
                    frenzyTimer.start();

                } else {
                    howMuchMoreCoins = 50 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void megaBuff() {
        mega.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 100) {
                    CookieGame.stats.totalUpgradesBought++;

                    double clickPlus2 = CookieGame.clickPlus;
                    CookieGame.clickPlus *= 2;
                    mega.setText("Purchased");
                    mega.setEnabled(false);
                    CookieGame.goldCoinCount -= 100;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    Timer megaTimer = new Timer(10000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.clickPlus = clickPlus2;
                            mega.setText("Mega ($100)");
                            mega.setEnabled(true);
                        }

                    });

                    megaTimer.setRepeats(false);
                    megaTimer.start();

                } else {
                    howMuchMoreCoins = 100 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void luckyBuff() {
        lucky.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 150) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.cookieCount += (int) (Math.random() * 200 + 50);
                    CookieGame.points.setText("Cookies: " + CookieGame.cookieCount);
                    lucky.setText("Purchased");
                    lucky.setEnabled(false);
                    CookieGame.goldCoinCount -= 150;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 150 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void warpBuff() {
        warp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 250) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.goldCoinCount *= 2;
                    warp.setText("Purchased");
                    warp.setEnabled(false);
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

    public void rainBuff() {
        rain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 500) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.goldCoinCount += 10;

                    rain.setText("Purchased");
                    rain.setEnabled(false);
                    CookieGame.goldCoinCount -= 500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    rainBuffTimer = new Timer(10, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.cookieClickerButton.doClick();
                        }
                    });

                    rainBuffTimer.start();

                    Timer rainTimer = new Timer(10000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            rainBuffTimer.stop();

                            rain.setText("Rain ($500)");
                            rain.setEnabled(true);
                        }
                    });

                    rainTimer.setRepeats(false);
                    rainTimer.start();
                } else {
                    howMuchMoreCoins = 500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void grandmaSpecial() {
        grandma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 100) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus += 1;

                    grandma.setText("Purchased");
                    grandma.setEnabled(false);
                    CookieGame.goldCoinCount -= 100;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    Timer grandmaSpecialTimer = new Timer(10000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.cookieCount += 199;
                            CookieGame.points.setText("Cookies: " + CookieGame.cookieCount);
                        }
                    });

                    grandmaSpecialTimer.start();
                } else {
                    howMuchMoreCoins = 100 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void farmSpecial() {
        farm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 300) {
                    CookieGame.stats.totalUpgradesBought++;
                    farm.setText("Purchased");
                    farm.setEnabled(false);
                    CookieGame.goldCoinCount -= 300;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    Timer farmSpecialTimer = new Timer(5000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.goldCoinCount += 5;
                            CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                        }
                    });
                    farmSpecialTimer.start();

                } else {
                    howMuchMoreCoins = 300 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void mineSpecial() {
        mine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 700) {
                    CookieGame.stats.totalUpgradesBought++;

                    mine.setText("Purchased");
                    mine.setEnabled(false);
                    CookieGame.goldCoinCount -= 700;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    Timer mineSpecialTimer = new Timer(10000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.cookieCount += CookieGame.cookieCount / 15;
                            CookieGame.points.setText("Cookies: " + CookieGame.cookieCount);
                        }
                    });

                    mineSpecialTimer.start();
                } else {
                    howMuchMoreCoins = 700 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void bankSpecial() {

        bank.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 1250) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.cookieCount += 2500;
                    CookieGame.points.setText("Cookies: " + CookieGame.cookieCount);

                    bank.setText("Purchased");
                    bank.setEnabled(false);
                    CookieGame.goldCoinCount -= 1250;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                } else {
                    howMuchMoreCoins = 1250 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

    public void empireSpecial() {
        empire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CookieGame.goldCoinCount >= 2500) {
                    CookieGame.stats.totalUpgradesBought++;
                    CookieGame.clickPlus *= 2;

                    empire.setText("Purchased");
                    empire.setEnabled(false);
                    CookieGame.goldCoinCount -= 2500;
                    CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);

                    Timer empireSpecialTimer = new Timer(15000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            CookieGame.goldCoinCount += 100;
                            CookieGame.cookieCount += 5000;

                            CookieGame.goldCoins.setText("Coins: " + CookieGame.goldCoinCount);
                            CookieGame.points.setText("Cookies: " + CookieGame.cookieCount);

                        }
                    });
                    empireSpecialTimer.start();
                } else {
                    howMuchMoreCoins = 2500 - CookieGame.goldCoinCount;
                    JOptionPane.showMessageDialog(frame,
                            "Not enough gold coins! Sell cookies for more gold coins!! You need " + howMuchMoreCoins
                                    + " more coins to purchase this item!");
                }

            }
        });
    }

}