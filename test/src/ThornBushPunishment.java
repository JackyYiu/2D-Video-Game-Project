import java.awt.Image;
import javax.swing.ImageIcon;

public class ThornBushPurnishment {
    private static Image image = null;

    ThornBushPurnishment() {
        super();
        if (ThornBushPurnishment.image == null) {
            ThornBushPurnishment.image = new ImageIcon("images/tree.png").getImage();
        }
    }

    @Override
    public Image getImage() { return ThornBushPurnishment.image; }
}
