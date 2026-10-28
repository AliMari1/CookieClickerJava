import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class CookieClicker {

    JFrame frame = new JFrame("Cookie Clicker Game");

    CookieClickerShopOne shopOneScreen;

    int cookieCount = 0;
    int goldCoinCount = 0;
    public int clickPlus = 1;

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
    JLabel points = new JLabel("Cookies: " + cookieCount);
    JLabel gameOverScreen = new JLabel("You Beat The Game... Congrats!!!");
    JLabel goldCoins = new JLabel("");
    JLabel goldCoinIconLabel = new JLabel();

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

        frame.setVisible(true);

    }

    public void setUpFrame() {
        frame.setTitle("Cookie Clicker Game");
        frame.setSize(800, 800);
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
        Image GCI = goldCoinImage.getImage();
        Image scaledImg = GCI.getScaledInstance(30,30, Image.SCALE_SMOOTH);

        goldCoins.setIcon(new ImageIcon(scaledImg));
        goldCoins.setText(" Coins: " + goldCoinCount);

        // DCI stands for DaCookie Image
        Image DCI = cookie.getImage();
        Image cookieImg = DCI.getScaledInstance(300,300, Image.SCALE_SMOOTH);

        cookieClickerButton.setIcon(new ImageIcon(cookieImg));

        frame.add(cookieLabel);
        frame.add(points);
        frame.add(goldCoins);
    }

    public void updateCookies() {

        cookieClickerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cookieCount += clickPlus;

                points.setText("Cookies: " + cookieCount);
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
                    points.setText("Cookies: " + cookieCount);
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
                points.setText("Cookies: " + cookieCount);
                goldCoins.setText("Coins: " + goldCoinCount);
                // GAME RESET ANNOUNCEMENT IN FUTURE
                shopOneScreen.plus2Button.setEnabled(true);
                shopOneScreen.plus2Button.setText("+2 cookies ($10)");

                if (shopOneScreen.timer != null) {
                    shopOneScreen.timer.stop();
                }

                shopOneScreen.auto1.setEnabled(true);
                shopOneScreen.auto1.setText("Auto 1  ($100k)");

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