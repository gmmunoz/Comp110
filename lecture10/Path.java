package comp110.lecture10;

public class Path {

	// Fields
	private Point[] _points;

	// Constructor
	public Path(Point[] points) {
		_points = points;
	}

	// Methods
	public Point getHighestPoint() {
		Point max = _points[0];
		for (int i = 1; i < _points.length; i++) {
			Point next = _points[i];
			if (next.getY() > max.getY()) {
				max = next;
			}
		}
		return max;
	}

	public boolean isInQuadrant(int quadrant) {
		for (int i = 0; i < _points.length; i++) {
			Point point = _points[i];
			if (point.getQuadrant() != quadrant) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		String result = "[";
		for (int i = 0; i < _points.length; i++) {
			Point point = _points[i];
			result = result + " " + point + " ";
		}
		return result + "]";
	}

}