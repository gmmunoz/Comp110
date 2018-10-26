package comp110;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Emoji {

	// field
	private FaceShape _faceShape;
	private Nose _nose;
	private Mouth _mouth;
	private Eye _leftEye;
	private Eye _rightEye;

	// constructor
	public Emoji() {
		_nose = new Nose();
		_mouth = new Mouth();
		_leftEye = new Eye(Color.BLACK);
		_rightEye = new Eye(Color.BLACK);
		_faceShape = new FaceShape(Color.ORANGE);
	}

	// Methods
	// addchildren below???
	public Group shapes() {
		Group aGroup = new Group();
		aGroup.getChildren().add(this.getLeftEye().shapes());
		aGroup.getChildren().add(this.getMouth().shapes());
		aGroup.getChildren().add(this.getNose().shapes());
		aGroup.getChildren().add(this.getFaceShape().shapes());
		aGroup.getChildren().add(this.getRightEye().shapes());

		// Group LeftEye = _leftEye.shapes();
		// LeftEye.setTranslateX(-5.0);

		return aGroup;
	}

	// getters & setters
	public void setFaceShape(FaceShape faceShape) {
		_faceShape = faceShape;
	}

	public FaceShape getFaceShape() {
		return _faceShape;
	}

	public Nose getNose() {
		return _nose;
	}

	public Mouth getMouth() {
		return _mouth;
	}

	public void setLeftEye(Eye leftEye) {
		_leftEye = leftEye;
	}

	public Eye getLeftEye() {
		return _leftEye;
	}

	public void setRightEye(Eye rightEye) {
		_rightEye = rightEye;
	}

	public Eye getRightEye() {
		return _rightEye;
	}

}
