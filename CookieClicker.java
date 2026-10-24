import javax.swing.JFrame;

// Allows images/icons to be loaded and displayed
import javax.swing.ImageIcon;

// Displays text, images, or both in the window
import javax.swing.JLabel;

// Creates clickable buttons
import javax.swing.JButton;

// Lets a class listen for button clicks and other actions
import java.awt.event.ActionListener;

// Handles events such as button clicks
import java.awt.event.ActionEvent;

// Imports all Swing GUI components
import javax.swing.*;

// Imports AWT classes for layouts, colors, fonts, etc.
import java.awt.*;

    
    
    public class CookieClicker {
        
        
        public static void main(String[] args) {
            CookieClicker cookieGame = new CookieClicker();
            cookieGame.setup();
        }
        
        public void setup() {
            setUpFrame();
            setUpButtons();
            //setUpLabels();
            frame.setVisible(true);
        }
        
        public void setUpFrame() {
            frame.setTitle("Cookie Clicker Game");
            frame.setSize(800, 800);
            frame.setLayout(null);

            // cookie theme color
            frame.getContentPane().setBackground(new Color(101, 67, 33));
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(true);
        }
        
        public void setUpButtons() {
            cookieClickerButton.setBounds(250, 150, 300, 300);
            frame.add(cookieClickerButton);
            
            points.setBounds(20, 20, 150, 30);
            frame.add(points);
            
            goldCoins.setBounds(650, 20, 120, 30);
            frame.add(goldCoins);
            
            powerUp.setBounds(300, 480, 200, 50);
            frame.add(powerUp);
            
            shopButton.setBounds(120, 600, 150, 50);
            frame.add(shopButton);

            shopTwoButton.setBounds(325, 600, 150, 50);
            frame.add(shopTwoButton);
            
            sell.setBounds(530, 600, 150, 50);
            frame.add(sell);
            
            pauseButton.setBounds(250, 700, 120, 40);
            frame.add(pauseButton);

            restart.setBounds(430, 700, 120, 40);
            frame.add(restart);
            
            // add these 4 later
            mainMenu.setBounds(300, 100, 200, 50);

            startButton.setBounds(300, 300, 200, 60);

            continueGameButton.setBounds(300, 380, 200, 60);
            
            autoClickerButton.setBounds(0, 0, 150, 50);
        }
        
    JFrame frame = new JFrame("Cookie Clicker Game");
    int cookieCount = 0;
    int clicksForPowerUp = 0;

    // Image
    ImageIcon cookie = new ImageIcon("DaCookie.jpg");


    //buttons
    JButton startButton = new JButton("Start");
    JButton mainMenuButton = new JButton("Main Menu");
    JButton shopButton = new JButton("Shop");
    JButton pauseButton = new JButton("Pause");
    JButton shopTwoButton = new JButton("Shop #2");
    JButton cookieClickerButton = new JButton(cookie);
    JButton powerUp = new JButton("Power Up!");
    JButton restart = new JButton("Restart");
    JButton sell = new JButton("Sell");
    JButton continueGameButton = new JButton("Continue");
    JButton autoClickerButton = new JButton("Auto Clicker");

    // Labels
    JLabel mainMenu = new JLabel("Main Menu");
    JLabel points = new JLabel("Cookies: 0");
    JLabel gameOverScreen = new JLabel("You Beat The Game... Congrats!!!");
    JLabel goldCoins = new JLabel("Coins: 0");
    }



    
    
