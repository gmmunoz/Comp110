package comp110;

/**
 * Author:Gabriela Munoz
 *
 * ONYEN: gmmunoz
 *
 * Collaborator(s):
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been received
 * or given in the completion of this work. I certify that I understand and
 * could now rewrite on my own, without assistance from collaborators or course
 * staff, the problem set code I am submitting.
 */
public class Image {

	// TODO: 2.1 Declare _pixels array
	private Color[][] _pixels;

	// TODO: 2.2 Declare & define constructor
	public Image(int width, int height) {
		_pixels = new Color[width][height];
		for (int wide = 0; wide < width; wide++) {
			for (int tall = 0; tall < height; tall++) {
				_pixels[wide][tall] = new Color(1.0, 1.0, 1.0);
			}
		}
	}

	// TODO: 2.3 Define width / height getters
	public int getWidth() {
		int width = _pixels.length;
		return width;
	}

	public int getHeight() {
		Color[] firstWidth = _pixels[0];
		int height = firstWidth.length;
		return height;
	}

	// TODO: 2.4 Define pixel getter/setter
	public Color getPixel(int x, int y) {
		return _pixels[x][y];
	}

	public void setPixel(int x, int y, Color color) {
		_pixels[x][y] = color;
	}

	// TODO: 2.5 Define copy method
	public Image copy() {
		Image image = new Image(this.getWidth(), this.getHeight());
		for (int wide = 0; wide < image.getWidth(); wide++) {
			for (int tall = 0; tall < image.getHeight(); tall++) {
				// this.setPixel(wide, tall, this.getPixel(wide, tall));
				Color color = this.getPixel(wide, tall);
				Color copy = color.copy();
				image.setPixel(wide, tall, copy);

			}
		}
		return image;
	}
}
