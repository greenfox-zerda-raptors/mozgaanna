/**
 * Created by mozgaanna on 29/11/16.
 */
public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;


    public MovableCircle(int radius, MovablePoint center){
        this.radius = radius;
        this.center = center;
    }




    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }





    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
