// 13.3.2 동작 다중 상속

public class ArrayList<E> extends AbstractList<E>
    implements List<E>, RandomAccess, Cloneable,
	       Serializable {
}


// 기능이 중복되지 않는 최소의 인터페이스

public interface Rotatable {

    void setRotationAngle(int angleInDegrees);
    int getRotationAngle();
    default void rotateBy(int angleInDegrees) {
	setRotationAngle((getRotationAngle () + angleInDegrees) % 360);
    }
}


public interface Moveable {
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);

    default void moveHorizontally(int distance) {
	setX(getX() + distance);
    }

    default void moveVertically(int distance) {
	setY(getY() + distance);
    }
}


public interface Resizable {
    int getWidth();
    int getHeight();
    void setWidth(int width);
    void setHeight(int height);
    void setAbsoluteSize(int width, int height);

    default void setRelativeSize(int wFactor, int hFactor) {
	setAbsoluteSize(getWidth() / wFactor, getHeight() / hFactor);
    }
}


// 인터페이스 조합

public class Monster implements Rotatable, Moveable, Resizable {
...
}


Monster m = new Monster();
m.rotateBy(180);
m.moveVertically(10);


public class Sun implements Moveable, Rotatable {
...
}
