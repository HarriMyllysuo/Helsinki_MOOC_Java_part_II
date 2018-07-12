package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

public class Worm {

    private int origX;
    private int newX;
    private int origY;
    private int newY;
    private int length = 3;
    private Direction direction;
    private List<Piece> pieces = new ArrayList<Piece>();

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.origX = originalX;
        this.origY = originalY;
        this.newX = origX;
        this.newY = origY;
        this.direction = originalDirection;
        this.pieces.add(new Piece(origX, origY));
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return this.pieces.size();
    }

    public List<Piece> getPieces() {
        return this.pieces;
    }

    public void move() {
        if (this.direction == Direction.RIGHT) {
            this.newX += 1;
            addPieces();
            
        } else if (this.direction == Direction.LEFT) {
            this.newX -= 1;
            addPieces();

        } else if (this.direction == Direction.DOWN) {
            this.newY += 1;
            addPieces();

        } else if (this.direction == Direction.UP) {
            this.newY -= 1;
            addPieces();
        }
    }

    private void addPieces() {
        if (this.pieces.size() < this.length) {
            this.pieces.add(new Piece(newX, newY));
        } else {
            this.pieces.remove(0);
            this.pieces.add(new Piece(newX, newY));
        }
    }

    public void grow() {
        if (this.pieces.size() < 3) {
        } else {
            this.length += 1;
        }
    }

    public boolean runsInto(Piece piece) {
        for (Piece p : this.pieces) {
            if (p.getX() == piece.getX() && p.getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {

        Piece piece = this.pieces.get(pieces.size() - 1);

        for (int i = 0; i < this.pieces.size() - 1; i++) {
            if (piece.getX() == pieces.get(i).getX()
                    && piece.getY() == pieces.get(i).getY()) {
                return true;
            }
        }
        return false;
    }
}
