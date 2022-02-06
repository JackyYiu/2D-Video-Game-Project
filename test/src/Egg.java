import java.awt.Image;
import javax.swing.ImageIcon;

public class Egg extends Environment
{
	private static Image image = null;
	private static int count = 0;

	Egg() {
		super();
		if (Egg.image == null) {
			Egg.image = new ImageIcon("images/egg.png").getImage();
		}
		count++;
	}

	@Override
	public Image getImage() { return Egg.image; }

	public static int getCount() { return count; }
	public static void decCount() { count--; }
}