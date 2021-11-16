import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {
    public Game() {
        var image = new ImageIcon("cmpt276Group9ImplementationMaven/src/main/resources/images/72_egg_1.png");
        setIconImage(image.getImage());  // set application icon
        setResizable(false);
        setContentPane(new Maze());
        setTitle("Easter Bunny Hunt");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void run() {
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Game());
    }
}