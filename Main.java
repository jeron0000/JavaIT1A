import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("IT1AG3");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // add GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp. LaunchGame();








    }
}

