/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

public class Player {
    
    private int x, y; 
    private final int length, height;
    
    public Player(int length, int height) {
        this.x = 0;
        this.y = 0;
        this.length = length;
        this.height = height;
    }
    
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    
    public String getPlayerPosition() {
        return "@ " + this.x + " " + this.y;
    }
}
