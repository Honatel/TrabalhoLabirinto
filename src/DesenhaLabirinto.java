import com.senac.SimpleJava.Graphics.Canvas;
import com.senac.SimpleJava.Graphics.GraphicApplication;

public class DesenhaLabirinto extends GraphicApplication {

	int x1, y1, x2, y2;
	public DesenhaLabirinto(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		setup();
	}
	
	@Override
	protected void draw(Canvas canvas) {
		canvas.clear();
		canvas.drawLine(x1, y1, x2, y2);

	}

	@Override
	protected void loop() {

		x2 = (int) (Math.random() * 100);
		y2 = (int) (Math.random() * 100);
		redraw();
	}

	@Override
	protected void setup() {
		setFramesPerSecond(20);
      
		x1 = (int) getResolution().width  / 2;
		y1 = (int) getResolution().height / 2;

	}

}
