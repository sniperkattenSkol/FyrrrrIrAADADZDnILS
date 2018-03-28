import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

// Nils E Lindfors TE15
// 2018-03-28
// 12:54
public class GUI2 implements ActionListener {
        //Size of window and array for painting the ovals and one for checking if its occupied.
        private static int x = 595;
        private static int y = 700;
        public static int numberOfOvals[] = new int[42];
        private static Dimension ButtonXY = new Dimension(68,100);
        public static void createGUI2() {
            JFrame mainFrame = new JFrame("Fyra i rad");
            mainFrame.setPreferredSize(new Dimension(x, y));
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setResizable(false);
            BufferedImage game;
            JLabel viewGame;

            //Public GUI2 , FORMAT LATER
                game = new BufferedImage(595, 700, BufferedImage.TYPE_INT_RGB);
                viewGame = new JLabel(new ImageIcon(game));
                Graphics g = game.getGraphics();
                g.setColor(Color.BLUE);
                g.fillRect(0,0,595,700);

            JButton[] ArrowButtons = new JButton[8];
            //Creates 8 buttons
            for (int l = 0; l < 8; l++) {
                ArrowButtons[l] = new JButton("↓");

                ArrowButtons[l].setBackground(Color.black);
                ArrowButtons[l].setBorderPainted(false);
                ArrowButtons[l].setContentAreaFilled(false);
                ArrowButtons[l].setPreferredSize(ButtonXY);
                ArrowButtons[l].setFont(new Font("Arial", Font.PLAIN, 60));
                mainFrame.add(ArrowButtons[l]);

                ArrowButtons[l].addActionListener(new ActionListener() {
                    //07 14 21 28 35 42
                    //06 13 20 27 34 41
                    //05 12 19 26 33 40
                    //04 11 18 25 32 32
                    //03 10 17 24 31 38
                    //02 09 16 23 30 37
                    //01 08 15 22 29 36
                    //visualization of oval layout in oval ARRAY
                    // 0 is white, 1 is red, 2 is yellow
                    //
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == ArrowButtons[0]){
                            System.out.println("test 1");
                            if (numberOfOvals[0] == 0){
                                //red or yellow
                            }

                        } else if (e.getSource() == ArrowButtons[1]) {
                            System.out.println("test 2");
                        } else if (e.getSource() == ArrowButtons[2]) {
                            System.out.println("test 3");
                        }else if (e.getSource() == ArrowButtons[3]) {
                            System.out.println("test 3");
                        }else if (e.getSource() == ArrowButtons[4]) {
                            System.out.println("test 4");
                        }else if (e.getSource() == ArrowButtons[5]) {
                            System.out.println("test 5");
                        }else if (e.getSource() == ArrowButtons[6]) {
                            System.out.println("test 6");
                        }else if (e.getSource() == ArrowButtons[7]) {
                            System.out.println("test 7");
                        }

                        //When this is pressed, check where it was clicked and change one oval to filled.
                        //Maybe redraw? dont know how to do this yet, or just add an oval to
                    }
                });
            }


            mainFrame.pack();
            mainFrame.setVisible(true);
        }

            public void drawBase(Graphics g){
                    g.setColor(Color.white);
                    int rowCords = 165;
                    int colCords = 0;
                    for (int row = 0;row < 6; row++){
                        for (int col = 0; col < 7; col++){
                            g.fillOval(colCords,rowCords,80,80);
                            colCords+= 85;
                        }
                        colCords = 0;
                        rowCords+= 85;
                    }
            }

    // 1  = draw Yellow
    // 1 != draw red
    public void drawOval(int type, Graphics g, int Arrow){
            if (type == 1){
                g.setColor(Color.YELLOW);
                //if ()
            } else{
                g.setColor(Color.red);
            }
        }

    public void getXYcolour(int x, int y){
        if
    }

    public void setXY(int x, int y, int colour){

    }

    public void checkIfFourInARow(int x, int y){

    }









            //mainFrame.setLayout(new GridLayout(7,8));

       /* JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(7,8,2,2));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        JLabel newLabel = new JLabel("lll");


        newLabel.setPreferredSize(new Dimension(98,98));
        newLabel.setForeground(Color.RED);

        /*for (int i = 0; i < 56; i++) {
            mainFrame.add(newLabel);

        }
        */


        public static void main(String[] args) {
            System.out.println(xy[1][1]);

        }


        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


