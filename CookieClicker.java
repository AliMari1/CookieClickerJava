import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class CookieClicker {

    JFrame frame = new JFrame("Cookie Clicker Game");

    CookieClickerShopOne shopOneScreen;
    PlayerStats stats = new PlayerStats();
    SaveGame savegame = new SaveGame();

    int cookieCount = 0;
    int goldCoinCount = 0;
    public double clickPlus = 1;

    ImageIcon cookie = new ImageIcon("DaCookie.png");
    ImageIcon goldCoinImage = new ImageIcon("GoldCoinImage.png");


    JButton shopButton = new JButton("Shop #1");
    JButton pauseButton = new JButton("Pause");
    JButton statsButton = new JButton("Stats");
    JButton cookieClickerButton = new JButton(cookie);
    JButton restart = new JButton("Restart");
    JButton sell = new JButton("Sell Cookies");
    JButton continueGameButton = new JButton("Continue");
    JButton autoClickerButton = new JButton("Auto Clicker");
    JButton saveButton = new JButton("Save");
    JButton loadButton = new JButton("Load");

    JLabel cookieLabel = new JLabel("Cookie Clicker");
    JLabel points = new JLabel();
    JLabel gameOverScreen = new JLabel("You Beat The Game... Congrats!!!");
    JLabel goldCoins = new JLabel();
    JLabel goldCoinIconLabel = new JLabel();

    Image GCI = goldCoinImage.getImage();
    Image scaledGCI = GCI.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

    public static void main(String[] args) {
        CookieClicker cookieGame = new CookieClicker();
        cookieGame.setup();

    }

    public void setup() {

        shopOneScreen = new CookieClickerShopOne(this);

        shopOneScreen.frame = frame;

        setUpFrame();
        shopOneScreen.setUpShopButtons();
        shopOneScreen.shopOneLabels();

        saveButton.setVisible(true);
        loadButton.setVisible(true);

        shopOneScreen.addCookiePlus2();
        shopOneScreen.addCookiePlus5();
        shopOneScreen.addCookiePlus10();
        shopOneScreen.addCookiePlus20();
        shopOneScreen.addCookiePlus50();

        shopOneScreen.autoClicker1();
        shopOneScreen.autoClicker2();
        shopOneScreen.autoClicker3();
        shopOneScreen.autoClicker4();
        shopOneScreen.autoClicker5();

        shopOneScreen.clickBoostOne();
        shopOneScreen.clickBoostTwo();
        shopOneScreen.clickBoostThree();
        shopOneScreen.clickBoostFour();
        shopOneScreen.clickBoostFive();

        shopOneScreen.frenzyBuff();
        shopOneScreen.megaBuff();
        shopOneScreen.luckyBuff();
        shopOneScreen.warpBuff();
        shopOneScreen.rainBuff();

        shopOneScreen.grandmaSpecial();
        shopOneScreen.farmSpecial();
        shopOneScreen.mineSpecial();
        shopOneScreen.bankSpecial();
        shopOneScreen.empireSpecial();

        setUpButtons();
        setUpLabels();

        saveGame();
        loadGame();
        autoClickerOffAndOn();
        pauseGame();
        cookieLabel.setVisible(false);
        updateCookies();
        updateGoldCoins();
        resetGame();
        shopOne();
        shopOneScreen.back();

        shopOneScreen.plus2Button.setVisible(false);
        shopOneScreen.plus5Button.setVisible(false);
        shopOneScreen.plus10Button.setVisible(false);
        shopOneScreen.plus20Button.setVisible(false);
        shopOneScreen.plus50Button.setVisible(false);

        shopOneScreen.auto1.setVisible(false);
        shopOneScreen.auto2.setVisible(false);
        shopOneScreen.auto3.setVisible(false);
        shopOneScreen.auto4.setVisible(false);
        shopOneScreen.auto5.setVisible(false);

        shopOneScreen.clickBoost1.setVisible(false);
        shopOneScreen.clickBoost2.setVisible(false);
        shopOneScreen.clickBoost3.setVisible(false);
        shopOneScreen.clickBoost4.setVisible(false);
        shopOneScreen.clickBoost5.setVisible(false);

        shopOneScreen.frenzy.setVisible(false);
        shopOneScreen.mega.setVisible(false);
        shopOneScreen.lucky.setVisible(false);
        shopOneScreen.warp.setVisible(false);
        shopOneScreen.rain.setVisible(false);

        shopOneScreen.grandma.setVisible(false);
        shopOneScreen.farm.setVisible(false);
        shopOneScreen.mine.setVisible(false);
        shopOneScreen.bank.setVisible(false);
        shopOneScreen.empire.setVisible(false);

        shopOneScreen.moreCookiesLabel.setVisible(false);
        shopOneScreen.autoLabel.setVisible(false);
        shopOneScreen.boostLabel.setVisible(false);
        shopOneScreen.buffLabel.setVisible(false);
        shopOneScreen.specialLabel.setVisible(false);

        playerStats();

        shopOneScreen.backButton.setVisible(false);

        frame.repaint();

        frame.setVisible(true);

    }

    public void setUpFrame() {
        frame.setTitle("Cookie Clicker Game");
        frame.setSize(1000, 800);
        frame.setLayout(null);

        frame.getContentPane().setBackground(new Color(101, 67, 33));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }

    public void setUpButtons() {

        saveButton.setBounds(750, 470, 170, 50);
        loadButton.setBounds(750, 550, 170, 50);

        frame.add(saveButton);
        frame.add(loadButton);

        cookieClickerButton.setBounds(250, 130, 300, 300);
        frame.add(cookieClickerButton);

        shopButton.setBounds(100, 470, 170, 50);
        frame.add(shopButton);

        statsButton.setBounds(315, 470, 170, 50);
        frame.add(statsButton);

        sell.setBounds(530, 470, 170, 50);
        frame.add(sell);

        autoClickerButton.setBounds(100, 550, 170, 50);
        frame.add(autoClickerButton);

        pauseButton.setBounds(315, 550, 170, 50);
        frame.add(pauseButton);

        restart.setBounds(530, 550, 170, 50);
        frame.add(restart);

        continueGameButton.setBounds(300, 400, 200, 60);

        cookieClickerButton.setOpaque(false);
        cookieClickerButton.setContentAreaFilled(false);
        cookieClickerButton.setBorderPainted(false);
        cookieClickerButton.setFocusPainted(false);
    }

    public void setUpLabels() {

        cookieLabel.setFont(new Font("Arial", Font.BOLD, 22));
        cookieLabel.setBounds(320, 60, 200, 40);

        points.setFont(new Font("Arial", Font.BOLD, 18));
        points.setBounds(20, 20, 200, 30);

        goldCoins.setFont(new Font("Arial", Font.BOLD, 18));
        goldCoins.setBounds(620, 20, 300, 30);

        goldCoins.setIcon(new ImageIcon(scaledGCI));
        goldCoins.setText(" Coins: " + goldCoinCount);

        Image DCI = cookie.getImage();
        Image cookieImg = DCI.getScaledInstance(300, 300, Image.SCALE_SMOOTH);

        cookieClickerButton.setIcon(new ImageIcon(cookieImg));

        Image cookieImgScore = DCI.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        points.setIcon(new ImageIcon(cookieImgScore));

        frame.add(cookieLabel);
        frame.add(points);
        frame.add(goldCoins);

        points.setText(" Cookies: " + cookieCount);
    }

    public void updateCookies() {

        cookieClickerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!gamePaused) {

                    stats.totalClicks++;
                    stats.totalCookiesEarned += (int) Math.round(clickPlus);

                    cookieCount += (int) Math.round(clickPlus);

                    points.setText(" Cookies: " + cookieCount);
                }
            }
        });
    }

    public void updateGoldCoins() {
        goldCoins.setText(" Coins: " + goldCoinCount);
        sell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gamePaused) {
                    return;
                }
                goldCoinCount += cookieCount;

                stats.totalGoldEarned += cookieCount;
                if (cookieCount >= 1) {
                    goldCoinCount += cookieCount;
                    cookieCount = 0;
                    points.setText(" Cookies: " + cookieCount);
                    goldCoins.setText(" Coins: " + goldCoinCount);

                } else {
                    JOptionPane.showMessageDialog(frame, "Not enough cookies to sell! Get more cookies");
                }
            }

        });
    }

    public void resetGame() {
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cookieCount = 0;
                goldCoinCount = 0;
                clickPlus = 1;
                points.setText(" Cookies: " + cookieCount);
                goldCoins.setText(" Coins: " + goldCoinCount);

                Image scaledGCI = GCI.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

                shopOneScreen.plus2Button.setText("+2 ($10)");
                shopOneScreen.plus5Button.setText("+5 ($30)");
                shopOneScreen.plus10Button.setText("+10 ($75)");
                shopOneScreen.plus20Button.setText("+20 ($150)");
                shopOneScreen.plus50Button.setText("+50 ($400)");

                shopOneScreen.plus2Button.setEnabled(true);
                shopOneScreen.plus5Button.setEnabled(true);
                shopOneScreen.plus10Button.setEnabled(true);
                shopOneScreen.plus20Button.setEnabled(true);
                shopOneScreen.plus50Button.setEnabled(true);

                goldCoins.setIcon(new ImageIcon(scaledGCI));
                goldCoins.setText(" Coins: " + goldCoinCount);

                if (shopOneScreen.auto1Timer != null)
                    shopOneScreen.auto1Timer.stop();
                if (shopOneScreen.auto2Timer != null)
                    shopOneScreen.auto2Timer.stop();
                if (shopOneScreen.auto3Timer != null)
                    shopOneScreen.auto3Timer.stop();
                if (shopOneScreen.auto4Timer != null)
                    shopOneScreen.auto4Timer.stop();
                if (shopOneScreen.auto5Timer != null)
                    shopOneScreen.auto5Timer.stop();

                if (shopOneScreen.rainBuffTimer != null)
                    shopOneScreen.rainBuffTimer.stop();

                shopOneScreen.auto1.setText("Auto 1  ($25)");
                shopOneScreen.auto2.setText("Auto 2  ($100)");
                shopOneScreen.auto3.setText("Auto 3  ($300)");
                shopOneScreen.auto4.setText("Auto 4  ($750)");
                shopOneScreen.auto5.setText("Auto 5  ($1500)");

                shopOneScreen.auto1.setEnabled(true);
                shopOneScreen.auto2.setEnabled(true);
                shopOneScreen.auto3.setEnabled(true);
                shopOneScreen.auto4.setEnabled(true);
                shopOneScreen.auto5.setEnabled(true);

                shopOneScreen.clickBoost1.setText("1.5x  ($25)");
                shopOneScreen.clickBoost1.setEnabled(true);

                shopOneScreen.clickBoost2.setText("2x  ($50)");
                shopOneScreen.clickBoost2.setEnabled(true);

                shopOneScreen.clickBoost3.setText("2.5x  ($100)");
                shopOneScreen.clickBoost3.setEnabled(true);

                shopOneScreen.clickBoost4.setText("3x  ($150)");
                shopOneScreen.clickBoost4.setEnabled(true);

                shopOneScreen.clickBoost5.setText("5x  ($300)");
                shopOneScreen.clickBoost5.setEnabled(true);

                shopOneScreen.frenzy.setText("Frenzy  ($50)");
                shopOneScreen.frenzy.setEnabled(true);

                shopOneScreen.mega.setText("Mega  ($100)");
                shopOneScreen.mega.setEnabled(true);

                shopOneScreen.lucky.setText("Lucky  ($150)");
                shopOneScreen.lucky.setEnabled(true);

                shopOneScreen.warp.setText("Warp  ($250)");
                shopOneScreen.warp.setEnabled(true);

                shopOneScreen.rain.setText("Rain  ($500)");
                shopOneScreen.rain.setEnabled(true);

                shopOneScreen.grandma.setText("Grandma  ($100)");
                shopOneScreen.grandma.setEnabled(true);

                shopOneScreen.farm.setText("Farm  ($300)");
                shopOneScreen.farm.setEnabled(true);

                shopOneScreen.mine.setText("Mine  ($700)");
                shopOneScreen.mine.setEnabled(true);

                shopOneScreen.bank.setText("Bank  ($1250)");
                shopOneScreen.bank.setEnabled(true);

                shopOneScreen.empire.setText("Empire  ($2500)");
                shopOneScreen.empire.setEnabled(true);

                shopOneScreen.autoClickersBought = 0;

                autoClickersEnabled = true;
                autoClickerButton.setText("Auto Clicker: ON");

            }
        });
    }

    public void shopOne() {
        shopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cookieClickerButton.setVisible(false);
                shopButton.setVisible(false);
                statsButton.setVisible(false);
                sell.setVisible(false);
                autoClickerButton.setVisible(false);
                pauseButton.setVisible(false);
                restart.setVisible(false);
                cookieLabel.setVisible(true);

                saveButton.setVisible(false);
                loadButton.setVisible(false);

                // Show Multiplier Buttons
                shopOneScreen.plus2Button.setVisible(true);
                shopOneScreen.plus5Button.setVisible(true);
                shopOneScreen.plus10Button.setVisible(true);
                shopOneScreen.plus20Button.setVisible(true);
                shopOneScreen.plus50Button.setVisible(true);

                // Show Auto Clickers
                shopOneScreen.auto1.setVisible(true);
                shopOneScreen.auto2.setVisible(true);
                shopOneScreen.auto3.setVisible(true);
                shopOneScreen.auto4.setVisible(true);
                shopOneScreen.auto5.setVisible(true);

                // Show Click Boosts
                shopOneScreen.clickBoost1.setVisible(true);
                shopOneScreen.clickBoost2.setVisible(true);
                shopOneScreen.clickBoost3.setVisible(true);
                shopOneScreen.clickBoost4.setVisible(true);
                shopOneScreen.clickBoost5.setVisible(true);

                // Show Buffs
                shopOneScreen.frenzy.setVisible(true);
                shopOneScreen.mega.setVisible(true);
                shopOneScreen.lucky.setVisible(true);
                shopOneScreen.warp.setVisible(true);
                shopOneScreen.rain.setVisible(true);

                // Show Specials
                shopOneScreen.grandma.setVisible(true);
                shopOneScreen.farm.setVisible(true);
                shopOneScreen.mine.setVisible(true);
                shopOneScreen.bank.setVisible(true);
                shopOneScreen.empire.setVisible(true);

                // Show Labels
                shopOneScreen.moreCookiesLabel.setVisible(true);
                shopOneScreen.autoLabel.setVisible(true);
                shopOneScreen.boostLabel.setVisible(true);
                shopOneScreen.buffLabel.setVisible(true);
                shopOneScreen.specialLabel.setVisible(true);

                // Show Back Button
                shopOneScreen.backButton.setVisible(true);

                frame.repaint();
            }
        });

    }

    public boolean autoClickersEnabled = true;
    public boolean gamePaused = false;

    public void autoClickerOffAndOn() {

        autoClickerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                autoClickersEnabled = !autoClickersEnabled;

                if (autoClickersEnabled) {
                    autoClickerButton.setText("Auto Clicker: ON");
                } else {
                    autoClickerButton.setText("Auto Clicker: OFF");
                }

            }
        });

    }

    public void playerStats() {

        statsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(
                        frame,
                        "Total Clicks: " + stats.totalClicks +
                                "\nTotal Cookies Earned: " + stats.totalCookiesEarned +
                                "\nTotal Gold Earned: " + stats.totalGoldEarned +
                                "\nTotal Upgrades Bought: " + stats.totalUpgradesBought,
                        "Player Statistics",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });

    }

    public void saveGame() {

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    savegame.plus2Bought = !shopOneScreen.plus2Button.isEnabled();
                    savegame.plus5Bought = !shopOneScreen.plus5Button.isEnabled();
                    savegame.plus10Bought = !shopOneScreen.plus10Button.isEnabled();
                    savegame.plus20Bought = !shopOneScreen.plus20Button.isEnabled();
                    savegame.plus50Bought = !shopOneScreen.plus50Button.isEnabled();

                    savegame.auto1Bought = !shopOneScreen.auto1.isEnabled();
                    savegame.auto2Bought = !shopOneScreen.auto2.isEnabled();
                    savegame.auto3Bought = !shopOneScreen.auto3.isEnabled();
                    savegame.auto4Bought = !shopOneScreen.auto4.isEnabled();
                    savegame.auto5Bought = !shopOneScreen.auto5.isEnabled();

                    savegame.boost1Bought = !shopOneScreen.clickBoost1.isEnabled();
                    savegame.boost2Bought = !shopOneScreen.clickBoost2.isEnabled();
                    savegame.boost3Bought = !shopOneScreen.clickBoost3.isEnabled();
                    savegame.boost4Bought = !shopOneScreen.clickBoost4.isEnabled();
                    savegame.boost5Bought = !shopOneScreen.clickBoost5.isEnabled();

                    savegame.grandmaBought = !shopOneScreen.grandma.isEnabled();
                    savegame.farmBought = !shopOneScreen.farm.isEnabled();
                    savegame.mineBought = !shopOneScreen.mine.isEnabled();
                    savegame.bankBought = !shopOneScreen.bank.isEnabled();
                    savegame.empireBought = !shopOneScreen.empire.isEnabled();

                    savegame.cookieCount = cookieCount;
                    savegame.goldCoinCount = goldCoinCount;
                    savegame.clickPlus = clickPlus;

                    savegame.totalClicks = stats.totalClicks;
                    savegame.totalCookiesEarned = stats.totalCookiesEarned;
                    savegame.totalGoldEarned = stats.totalGoldEarned;
                    savegame.totalUpgradesBought = stats.totalUpgradesBought;

                    PrintWriter writer = new PrintWriter("savegame.txt");

                    writer.println(savegame.cookieCount);
                    writer.println(savegame.goldCoinCount);
                    writer.println(savegame.clickPlus);

                    writer.println(savegame.totalClicks);
                    writer.println(savegame.totalCookiesEarned);
                    writer.println(savegame.totalGoldEarned);
                    writer.println(savegame.totalUpgradesBought);

                    writer.println(savegame.plus2Bought);
                    writer.println(savegame.plus5Bought);
                    writer.println(savegame.plus10Bought);
                    writer.println(savegame.plus20Bought);
                    writer.println(savegame.plus50Bought);

                    writer.println(savegame.auto1Bought);
                    writer.println(savegame.auto2Bought);
                    writer.println(savegame.auto3Bought);
                    writer.println(savegame.auto4Bought);
                    writer.println(savegame.auto5Bought);

                    writer.println(savegame.boost1Bought);
                    writer.println(savegame.boost2Bought);
                    writer.println(savegame.boost3Bought);
                    writer.println(savegame.boost4Bought);
                    writer.println(savegame.boost5Bought);

                    writer.println(savegame.grandmaBought);
                    writer.println(savegame.farmBought);
                    writer.println(savegame.mineBought);
                    writer.println(savegame.bankBought);
                    writer.println(savegame.empireBought);

                    writer.close();

                    JOptionPane.showMessageDialog(frame, "Game Saved!");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public void loadGame() {

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    Scanner reader = new Scanner(new File("savegame.txt"));

                    savegame.cookieCount = Integer.parseInt(reader.nextLine());
                    savegame.goldCoinCount = Integer.parseInt(reader.nextLine());
                    savegame.clickPlus = Double.parseDouble(reader.nextLine());

                    savegame.totalClicks = Integer.parseInt(reader.nextLine());
                    savegame.totalCookiesEarned = Integer.parseInt(reader.nextLine());
                    savegame.totalGoldEarned = Integer.parseInt(reader.nextLine());
                    savegame.totalUpgradesBought = Integer.parseInt(reader.nextLine());

                    savegame.plus2Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.plus5Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.plus10Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.plus20Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.plus50Bought = Boolean.parseBoolean(reader.nextLine());

                    savegame.auto1Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.auto2Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.auto3Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.auto4Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.auto5Bought = Boolean.parseBoolean(reader.nextLine());

                    savegame.boost1Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.boost2Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.boost3Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.boost4Bought = Boolean.parseBoolean(reader.nextLine());
                    savegame.boost5Bought = Boolean.parseBoolean(reader.nextLine());

                    savegame.grandmaBought = Boolean.parseBoolean(reader.nextLine());
                    savegame.farmBought = Boolean.parseBoolean(reader.nextLine());
                    savegame.mineBought = Boolean.parseBoolean(reader.nextLine());
                    savegame.bankBought = Boolean.parseBoolean(reader.nextLine());
                    savegame.empireBought = Boolean.parseBoolean(reader.nextLine());

                    reader.close();

                    cookieCount = savegame.cookieCount;
                    goldCoinCount = savegame.goldCoinCount;
                    clickPlus = savegame.clickPlus;

                    stats.totalClicks = savegame.totalClicks;
                    stats.totalCookiesEarned = savegame.totalCookiesEarned;
                    stats.totalGoldEarned = savegame.totalGoldEarned;
                    stats.totalUpgradesBought = savegame.totalUpgradesBought;

                    // More Cookies
                    if (savegame.plus2Bought) {
                        shopOneScreen.plus2Button.setEnabled(false);
                        shopOneScreen.plus2Button.setText("Purchased");
                    }

                    if (savegame.plus5Bought) {
                        shopOneScreen.plus5Button.setEnabled(false);
                        shopOneScreen.plus5Button.setText("Purchased");
                    }

                    if (savegame.plus10Bought) {
                        shopOneScreen.plus10Button.setEnabled(false);
                        shopOneScreen.plus10Button.setText("Purchased");
                    }

                    if (savegame.plus20Bought) {
                        shopOneScreen.plus20Button.setEnabled(false);
                        shopOneScreen.plus20Button.setText("Purchased");
                    }

                    if (savegame.plus50Bought) {
                        shopOneScreen.plus50Button.setEnabled(false);
                        shopOneScreen.plus50Button.setText("Purchased");
                    }

                    // Auto Clickers
                    if (savegame.auto1Bought) {

                        shopOneScreen.auto1.setEnabled(false);
                        shopOneScreen.auto1.setText("Purchased");

                        shopOneScreen.auto1Timer = new Timer(1000, e2 -> {
                            if (autoClickersEnabled) {
                                cookieClickerButton.doClick();
                            }
                        });

                        shopOneScreen.auto1Timer.start();
                    }

                    if (savegame.auto2Bought) {

                        shopOneScreen.auto2.setEnabled(false);
                        shopOneScreen.auto2.setText("Purchased");

                        shopOneScreen.auto2Timer = new Timer(900, e2 -> {
                            if (autoClickersEnabled) {
                                cookieClickerButton.doClick();
                            }
                        });

                        shopOneScreen.auto2Timer.start();
                    }

                    if (savegame.auto3Bought) {

                        shopOneScreen.auto3.setEnabled(false);
                        shopOneScreen.auto3.setText("Purchased");

                        shopOneScreen.auto3Timer = new Timer(800, e2 -> {
                            if (autoClickersEnabled) {
                                cookieClickerButton.doClick();
                            }
                        });

                        shopOneScreen.auto3Timer.start();
                    }

                    if (savegame.auto4Bought) {

                        shopOneScreen.auto4.setEnabled(false);
                        shopOneScreen.auto4.setText("Purchased");

                        shopOneScreen.auto4Timer = new Timer(700, e2 -> {
                            if (autoClickersEnabled) {
                                cookieClickerButton.doClick();
                            }
                        });

                        shopOneScreen.auto4Timer.start();
                    }

                    if (savegame.auto5Bought) {

                        shopOneScreen.auto5.setEnabled(false);
                        shopOneScreen.auto5.setText("Purchased");

                        shopOneScreen.auto5Timer = new Timer(500, e2 -> {
                            if (autoClickersEnabled) {
                                cookieClickerButton.doClick();
                            }
                        });

                        shopOneScreen.auto5Timer.start();
                    }

                    // Click Boosts
                    if (savegame.boost1Bought) {
                        shopOneScreen.clickBoost1.setEnabled(false);
                        shopOneScreen.clickBoost1.setText("Purchased");
                    }

                    if (savegame.boost2Bought) {
                        shopOneScreen.clickBoost2.setEnabled(false);
                        shopOneScreen.clickBoost2.setText("Purchased");
                    }

                    if (savegame.boost3Bought) {
                        shopOneScreen.clickBoost3.setEnabled(false);
                        shopOneScreen.clickBoost3.setText("Purchased");
                    }

                    if (savegame.boost4Bought) {
                        shopOneScreen.clickBoost4.setEnabled(false);
                        shopOneScreen.clickBoost4.setText("Purchased");
                    }

                    if (savegame.boost5Bought) {
                        shopOneScreen.clickBoost5.setEnabled(false);
                        shopOneScreen.clickBoost5.setText("Purchased");
                    }

                    // Specials
                    if (savegame.grandmaBought) {
                        shopOneScreen.grandma.setEnabled(false);
                        shopOneScreen.grandma.setText("Purchased");
                    }

                    if (savegame.farmBought) {

                        shopOneScreen.farm.setEnabled(false);
                        shopOneScreen.farm.setText("Purchased");

                        Timer farmTimer = new Timer(5000, e2 -> {
                            goldCoinCount += 5;
                            goldCoins.setText(" Coins: " + goldCoinCount);
                        });

                        farmTimer.start();
                    }

                    if (savegame.mineBought) {

                        shopOneScreen.mine.setEnabled(false);
                        shopOneScreen.mine.setText("Purchased");

                        Timer mineTimer = new Timer(10000, e2 -> {
                            cookieCount += cookieCount / 15;
                            points.setText(" Cookies: " + cookieCount);
                        });

                        mineTimer.start();
                    }

                    if (savegame.bankBought) {
                        shopOneScreen.bank.setEnabled(false);
                        shopOneScreen.bank.setText("Purchased");
                    }

                    if (savegame.empireBought) {

                        shopOneScreen.empire.setEnabled(false);
                        shopOneScreen.empire.setText("Purchased");

                        Timer empireTimer = new Timer(15000, e2 -> {

                            goldCoinCount += 100;
                            cookieCount += 5000;

                            goldCoins.setText(" Coins: " + goldCoinCount);
                            points.setText(" Cookies: " + cookieCount);

                        });

                        empireTimer.start();
                    }

                    points.setText(" Cookies: " + cookieCount);
                    goldCoins.setText(" Coins: " + goldCoinCount);

                    JOptionPane.showMessageDialog(frame, "Game Loaded!");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "No save file found!");
                }
            }
        });
    }

    public void pauseGame() {

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                gamePaused = !gamePaused;

                if (gamePaused) {
                    pauseButton.setText("Resume");
                } else {
                    pauseButton.setText("Pause");
                }

            }
        });

    }

}