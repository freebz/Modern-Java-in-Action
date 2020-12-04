// 13.1 변화하는 API

// 13.1.1 API 버전 1

public interface Resizable extends Drawable {
    int getWidth();
    int getHeight();
    void setWidth(int width);
    void setHeight(int height);
    void setAbsoluteSize(int width, int height);
}


// 사용자 구현

public class Ellipse implements Resizable {
    ...
}

public class Game {
    public static void main(String...args) {
	List<Resizable> resizableShapes =
	    Arrays.asList(new Square(), new Rectangle(), new Ellipse());
	Utils.paint(resizableShapes);
    }
}

public class Utils {
    public static void paint(List<Resizable> l) {
	l.forEach(r -> {
	    r.setAbsoluteSize(42, 42);
	    r.draw();
	});
    }
}
