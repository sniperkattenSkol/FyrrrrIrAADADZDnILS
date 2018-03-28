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
    private static Dimension ButtonXY = new Dimension(68,100);
    public static void createGUI(){
        JFrame mainFrame = new JFrame("Fyra i rad");
        mainFrame.setPreferredSize(new Dimension(x,y));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        //Remake this with "dynmaic paint" google this
        mainFrame.setContentPane(new JPanel(){
            //Paints the game board
            public void  paintComponent(Graphics g){
                super.paintComponent(g);
                setBackground(Color.blue);
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
        });



        JButton [] ArrowButtons = new JButton[8];
        //Creates 8 buttons
        for (int l = 0; l < 8; l++){
            ArrowButtons[l] = new JButton("↓");
            ArrowButtons[l].setBackground(Color.black);
            ArrowButtons[l].setBorderPainted(false);
            ArrowButtons[l].setContentAreaFilled(false);
            ArrowButtons[l].setPreferredSize(ButtonXY);
            ArrowButtons[l].setFont(new Font("Arial", Font.PLAIN, 60));
            mainFrame.add(ArrowButtons[l]);

            ArrowButtons[l].addActionListener(new ActionListener() {
                @Override
                public void  actionPerformed(ActionEvent e) {
                    System.out.println("test");
                    //When this is pressed, check where it was clicked and change one oval to filled.
                    //Maybe redraw? dont know how to do this yet, or just add an oval to
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

    public static void main(String[] args) {
        createGUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
