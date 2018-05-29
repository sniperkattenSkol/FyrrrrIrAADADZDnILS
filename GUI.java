import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Nils E Lindfors TE15
// 2018-01-31
// 13:03
public class GUI implements ActionListener {
    private static int x = 595;
    private static int y = 700;
    public static  int ColorTurn = 1;
    public static int nO[][] = new int[10][10]; //42 [7][6]
    public static int rowNum[] = new int[7];
    private static Dimension ButtonXY = new Dimension(68,100);
    public static void createGUI(){
        JFrame mainFrame = new JFrame("Fyra i rad");
        mainFrame.setPreferredSize(new Dimension(x,y));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        //BufferedImage board = new BufferedImage(595,700,BufferedImage.TYPE_3BYTE_BGR);
        mainFrame.setBackground(Color.blue);
        //Remake this with "dynmaic paint" google this
        mainFrame.setContentPane(new JPanel(){
            //Paints the game board
            public void  paintComponent(Graphics g){
                g.setColor(Color.WHITE);
               // g.drawImage(board,0,0,null);
                int rowCords = 165;
                int colCords = 0;
                for (int row = 1;row < 7; row++){
                    for (int col = 1; col < 8; col++){
                        g.fillOval(colCords,rowCords,80,80);
                        colCords+= 85;
                    }
                    colCords = 0;
                    rowCords+= 85;
                }
            }
        });



        JButton [] ArrowButtons = new JButton[8];
        //Creates 8 buttons
        for (int l = 0; l < 7; l++){
            ArrowButtons[l] = new JButton("V");
            ArrowButtons[l].setBackground(Color.black);
            ArrowButtons[l].setBorderPainted(false);
            ArrowButtons[l].setContentAreaFilled(false);
            ArrowButtons[l].setPreferredSize(ButtonXY);
            ArrowButtons[l].setFocusPainted(false);
            ArrowButtons[l].setFont(new Font("Arial", Font.PLAIN, 50));
            mainFrame.add(ArrowButtons[l]);

            ArrowButtons[l].addActionListener(new ActionListener() {

                //06 12 18 24 30 36 42
                //05 11 17 23 29 35 41
                //04 10 16 22 28 34 40
                //03 09 15 21 27 33 39
                //02 08 14 20 26 32 38
                //01 07 13 19 25 31 37
                //visualization of oval layout in oval ARRAY
                // 0 is white, 1 is red, 2 is yellow
                //

                //191 is the top oval
                @Override
                public void  actionPerformed(ActionEvent e) {
                    if (e.getSource() == ArrowButtons[0]) {
                         System.out.println("test 1");
                             int tempnumb = rowNum[0];
                             tempnumb = 616 - tempnumb * 85;
                             if (rowNum[0] < 6) {
                                 if (ColorTurn == 1) {
                                     Graphics g = mainFrame.getGraphics();
                                     g.setColor(Color.RED);
                                     g.fillOval(3, tempnumb, 81, 81);
                                     ColorTurn = 2;
                                     nO[0][rowNum[0]] = 1;
                                     rowNum[0]++;
                                 } else if (ColorTurn == 2) {
                                     Graphics g = mainFrame.getGraphics();
                                     g.setColor(Color.YELLOW);
                                     g.fillOval(3, tempnumb, 81, 81);
                                     ColorTurn = 1;
                                     nO[0][rowNum[0]] = 2;
                                     rowNum[0]++;
                                 }
                             }

                    } else if (e.getSource() == ArrowButtons[1]) {

                        System.out.println("test 2");
                        int tempnumb = rowNum[1];
                        tempnumb = 616 - tempnumb * 85;
                        if (rowNum[1] < 6) {
                            if (ColorTurn == 1) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.RED);
                                g.fillOval(88, tempnumb, 81, 81);
                                ColorTurn = 2;
                                nO[1][rowNum[1]] = 1;
                                rowNum[1]++;
                            } else if (ColorTurn == 2) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.YELLOW);
                                g.fillOval(88, tempnumb, 81, 81);
                                ColorTurn = 1;
                                nO[1][rowNum[1]] = 2;
                                rowNum[1]++;
                            }
                        }

                    }else if (e.getSource() == ArrowButtons[2]) {
                        System.out.println("test 3");
                        int tempnumb = rowNum[2];
                        tempnumb = 616 - tempnumb * 85;
                        if (rowNum[2] < 6) {
                            if (ColorTurn == 1) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.RED);
                                g.fillOval(173, tempnumb, 81, 81);
                                ColorTurn = 2;
                                nO[2][rowNum[2]] = 1;
                                rowNum[2]++;
                            } else if (ColorTurn == 2) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.YELLOW);
                                g.fillOval(173, tempnumb, 81, 81);
                                ColorTurn = 1;
                                nO[2][rowNum[2]] = 2;
                                rowNum[2]++;
                            }
                        }

                    }else if (e.getSource() == ArrowButtons[3]) {
                        System.out.println("test 4");
                        int tempnumb = rowNum[3];
                        tempnumb = 616 - tempnumb * 85;
                        if (rowNum[3] < 6) {
                            if (ColorTurn == 1) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.RED);
                                g.fillOval(258, tempnumb, 81, 81);
                                ColorTurn = 2;
                                nO[3][rowNum[3]] = 1;
                                rowNum[3]++;
                            } else if (ColorTurn == 2) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.YELLOW);
                                g.fillOval(258, tempnumb, 81, 81);
                                ColorTurn = 1;
                                nO[3][rowNum[3]] = 2;
                                rowNum[3]++;
                            }
                        }

                    }else if (e.getSource() == ArrowButtons[4]) {
                        System.out.println("test 5");
                        int tempnumb = rowNum[4];
                        tempnumb = 616 - tempnumb * 85;
                        if (rowNum[4] < 6) {
                            if (ColorTurn == 1) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.RED);
                                g.fillOval(343, tempnumb, 81, 81);
                                ColorTurn = 2;
                                nO[4][rowNum[4]] = 1;
                                rowNum[4]++;
                            } else if (ColorTurn == 2) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.YELLOW);
                                g.fillOval(343, tempnumb, 81, 81);
                                ColorTurn = 1;
                                nO[4][rowNum[4]] = 2;
                                rowNum[4]++;
                            }
                        }

                    }else if (e.getSource() == ArrowButtons[5]) {
                        System.out.println("test 6");
                        int tempnumb = rowNum[5];
                        tempnumb = 616 - tempnumb * 85;
                        if (rowNum[5] < 6) {
                            if (ColorTurn == 1) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.RED);
                                g.fillOval(428, tempnumb, 81, 81);
                                ColorTurn = 2;
                                nO[5][rowNum[5]] = 1;
                                rowNum[5]++;
                            } else if (ColorTurn == 2) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.YELLOW);
                                g.fillOval(428, tempnumb, 81, 81);
                                ColorTurn = 1;
                                nO[5][rowNum[5]] = 2;
                                rowNum[5]++;
                            }
                        }

                    }else if (e.getSource() == ArrowButtons[6]) {
                        System.out.println("test 7");
                        int tempnumb = rowNum[6];
                        tempnumb = 616 - tempnumb * 85;
                        if (rowNum[6] < 6) {
                            if (ColorTurn == 1) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.RED);
                                g.fillOval(513, tempnumb, 81, 81);
                                ColorTurn = 2;
                                nO[6][rowNum[6]] = 1;
                                rowNum[6]++;
                            } else if (ColorTurn == 2) {
                                Graphics g = mainFrame.getGraphics();
                                g.setColor(Color.YELLOW);
                                g.fillOval(513, tempnumb, 81, 81);
                                ColorTurn = 1;
                                nO[6][rowNum[6]] = 2;
                                rowNum[6]++;
                            }
                        }

                    }

                    if (fyraIradVinnare() == 1) {
                        //röd vinner
                        Graphics g = mainFrame.getGraphics();
                        g.setColor(Color.RED);
                        g.drawString("RED WINS",200,150);

                    }else if (fyraIradVinnare() == 2) {
                        //Gul vinner
                        Graphics g = mainFrame.getGraphics();
                        g.setColor(Color.YELLOW);
                        g.drawString("YELLOW WINS", 200, 150);
                    } else if (fyraIradVinnare() == 3){
                        Graphics g = mainFrame.getGraphics();
                        g.setColor(Color.GREEN);
                        g.drawString("TIE", 200, 150);

                    }else {
                        vemsTur(mainFrame);
                    }

                }

            });
        }





        mainFrame.pack();
        mainFrame.setVisible(true);






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
    }
    //The row is what oval/ovals should be painted
    //165 per row , 85 per col
   /* public void painterR(int ovalNumber , Graphics g){
        int tempcol = 0;
        if (nO[ovalNumber] == 1){
                g.setColor(Color.red);
                if (ovalNumber > 7){
                    ovalNumber = ovalNumber - 7;

                }
                g.fillOval();
            }
    }
*/
   //Funktionen är till så att arrayen inte går över eller under 0
   public static int pjas(int b, int c){
       if (b < 0 || c < 0 || b >= 6 || c >=7){
           return 0;
       } else {
           return nO[b][c];
       }
   }

   public static void vemsTur(JFrame mainFrame){
       if(ColorTurn == 1){
           Graphics g = mainFrame.getGraphics();
           g.setColor(Color.RED);
           for (int u = 0; u < 6; u++){
               int tempnumb = 50+u*100;
               g.fillOval(tempnumb, 150, 10, 10);
           }
       } else {
           Graphics g = mainFrame.getGraphics();
           g.setColor(Color.YELLOW);
           for (int u = 0; u < 6; u++){
               int tempnumb = 50+u*100;
               g.fillOval(tempnumb, 150, 10, 10);
           }
       }
   }

    public static int fyraIradVinnare() {
        int tempnumb = 0;
        for (int q = 0; q < 6; q++) {
            for (int w = 0; w < 7; w++) {
                //Checks if its empty and if the four pawns next to it are the same, if so == win
                if (pjas(q,w)!=0&&pjas(q,w)==pjas(q,w+1)&&pjas(q,w)==pjas(q,w+2)&&pjas(q,w)==pjas(q,w+3)) {
                    return nO[q][w];
                }
              }
            }
            for (int q = 0; q < 6; q++) {
                for (int w = 0; w < 7; w++) {
                    if (pjas(q,w)!=0&&pjas(q,w)==pjas(q+1,w)&&pjas(q,w)==pjas(q+2,w)&&pjas(q,w)==pjas(q+3,w)) {
                        return nO[q][w];
                    }
                }
            }
            for (int q = 0; q < 6; q++) {
                for (int w = 0; w < 7; w++) {
                    for (int e = -1; e <=1; e += 2){
                        if (pjas(q,w)!=0&&pjas(q,w)==pjas(q+1*e,w+1)&&pjas(q,w)==pjas(q+2*e,w+2)&&pjas(q,w)==pjas(q+3*e,w+3)){
                            return nO[q][w];
                        }
                    }
                }
            }
            for (int q = 0; q < 6; q++) {
                for (int w = 0; w < 7; w++) {
                    if (nO[q][w]== 0) {
                        return 0;
                        //Finns drag kvar att göra
                    }
                }
            }
            return 3;
            //Oavgjort
        }
     
    


    public static void main(String[] args) {
        createGUI();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
