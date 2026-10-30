import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class CookieClicker {

    JFrame frame = new JFrame("Cookie Clicker Game");

    CookieClickerShopOne shopOneScreen;

    int cookieCount = 0;
    int goldCoinCount = 0;
    public double clickPlus = 1;
    

    // Image
    ImageIcon cookie = new ImageIcon("DaCookie.png");
    ImageIcon goldCoinImage = new ImageIcon("GoldCoinImage.png");

    // Buttons
    JButton shopButton = new JButton("Shop #1");
    JButton pauseButton = new JButton("Pause");
    JButton shopTwoButton = new JButton("Shop #2");
    JButton cookieClickerButton = new JButton(cookie);
    JButton restart = new JButton("Restart");
    JButton sell = new JButton("Sell Cookies");
    JButton continueGameButton = new JButton("Continue");
    JButton autoClickerButton = new JButton("Auto Clicker");

    // Labels
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
        setUpButtons();
        setUpLabels();
        updateCookies();
        updateGoldCoins();
        resetGame();
        shopOne();
        shopOneScreen.back();

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


        

        frame.setVisible(true);

    }

    public void setUpFrame() {
        frame.setTitle("Cookie Clicker Game");
        frame.setSize(1000, 800);
        frame.setLayout(null);

        // Cookie theme color
        frame.getContentPane().setBackground(new Color(101, 67, 33));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }

    public void setUpButtons() {

        cookieClickerButton.setBounds(250, 130, 300, 300);
        frame.add(cookieClickerButton);

        shopButton.setBounds(100, 470, 170, 50);
        frame.add(shopButton);

        shopTwoButton.setBounds(315, 470, 170, 50);
        frame.add(shopTwoButton);

        sell.setBounds(530, 470, 170, 50);
        frame.add(sell);

        autoClickerButton.setBounds(100, 550, 170, 50);
        frame.add(autoClickerButton);

        pauseButton.setBounds(315, 550, 170, 50);
        frame.add(pauseButton);

        restart.setBounds(530, 550, 170, 50);
        frame.add(restart);

        // Future menu buttons

        continueGameButton.setBounds(300, 400, 200, 60);

        // Brisket cooker game IDEA
        // make cookie button invisible
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
        goldCoins.setBounds(620, 20, 150, 30);

        // GCI stands for gold coin image

        goldCoins.setIcon(new ImageIcon(scaledGCI));
        goldCoins.setText(" Coins: " + goldCoinCount);

        // DCI stands for DaCookie Image
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

                cookieCount += (int)Math.round(clickPlus);

                points.setText(" Cookies: " + cookieCount);
            }
        });
    }

    public void updateGoldCoins() {
        goldCoins.setText(" Coins: " + goldCoinCount);
        sell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

    public void resetGame() { // resetGame function
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cookieCount = 0; // cookie count reset
                goldCoinCount = 0; // gold coin count reset
                clickPlus = 1;
                points.setText(" Cookies: " + cookieCount);
                goldCoins.setText(" Coins: " + goldCoinCount);
                // GAME RESET ANNOUNCEMENT IN FUTURE
                Image scaledGCI = GCI.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

                shopOneScreen.plus2Button.setText("+2 ($10)");
                shopOneScreen.plus5Button.setText("+5 ($50)");
                shopOneScreen.plus10Button.setText("+10 ($100)");
                shopOneScreen.plus20Button.setText("+20 ($300)");
                shopOneScreen.plus50Button.setText("+50 ($500)");
                // shopOneScreen.plus

                goldCoins.setIcon(new ImageIcon(scaledGCI));
                goldCoins.setText(" Coins: " + goldCoinCount);

                if (shopOneScreen.timer != null) {
                    shopOneScreen.timer.stop();
                }

                shopOneScreen.auto1.setText("Auto 1  ($100)");
                shopOneScreen.auto2.setText("Auto 2  ($500)");
                shopOneScreen.auto3.setText("Auto 3  ($1K)");
                shopOneScreen.auto4.setText("Auto 4  ($2.5K)");
                shopOneScreen.auto5.setText("Auto 5  ($5K)");

                shopOneScreen.auto1.setEnabled(true);
                shopOneScreen.auto2.setEnabled(true);
                shopOneScreen.auto3.setEnabled(true);
                shopOneScreen.auto4.setEnabled(true);
                shopOneScreen.auto5.setEnabled(true);

                shopOneScreen.clickBoost1.setText("1.5x  ($2.5K)");
                shopOneScreen.clickBoost1.setEnabled(true);

                shopOneScreen.clickBoost2.setText("2x  ($3K)");
                shopOneScreen.clickBoost2.setEnabled(true);

                shopOneScreen.clickBoost3.setText("2.5x  ($5K)");
                shopOneScreen.clickBoost3.setEnabled(true);

                shopOneScreen.clickBoost4.setText("3x  ($7.5K)");
                shopOneScreen.clickBoost4.setEnabled(true);

                shopOneScreen.clickBoost5.setText("5x  ($10K)");
                shopOneScreen.clickBoost5.setEnabled(true);

                shopOneScreen.frenzy.setText("Frenzy  ($25K)");
                shopOneScreen.frenzy.setEnabled(true);

                shopOneScreen.mega.setText("Mega  ($50K)");
                shopOneScreen.mega.setEnabled(true);

                shopOneScreen.lucky.setText("Lucky  ($75K)");
                shopOneScreen.lucky.setEnabled(true);

                shopOneScreen.warp.setText("Warp  ($100K)");
                shopOneScreen.warp.setEnabled(true);

                shopOneScreen.rain.setText("Rain  ($150K)");
                shopOneScreen.rain.setEnabled(true);

                shopOneScreen.grandma.setText("Grandma  ($500K)");
                shopOneScreen.grandma.setEnabled(true);

                shopOneScreen.farm.setText("Farm  ($750K)");
                shopOneScreen.farm.setEnabled(true);

                shopOneScreen.mine.setText("Mine  ($1M)");
                shopOneScreen.mine.setEnabled(true);

                shopOneScreen.bank.setText("Bank  ($1.5M)");
                shopOneScreen.bank.setEnabled(true);

                shopOneScreen.empire.setText("Empire  ($2M)");
                shopOneScreen.empire.setEnabled(true);

            }
        });
    }

    public void shopOne() {
        shopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cookieClickerButton.setVisible(false);
                shopButton.setVisible(false);
                shopTwoButton.setVisible(false);
                sell.setVisible(false);
                autoClickerButton.setVisible(false);
                pauseButton.setVisible(false);
                restart.setVisible(false);
                cookieLabel.setVisible(true);
                shopOneScreen.setUpShopButtons();
                shopOneScreen.shopOneLabels();

            }
        });
    }
}