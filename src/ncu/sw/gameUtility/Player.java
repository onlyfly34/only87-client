package ncu.sw.gameUtility;


import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Timer;

/**
 * Created by Arson on 2016/11/1.
 */
public class Player extends GameObject{
    private int effectNum = 0 ;
    private String identity;
    private int score;
    private InetAddress address;
    private InetSocketAddress socketAddress;
    private int count87;
    private int speed;
    private int radius = 50;
    private int moveDir = 1;
    private Timer itemTimer;

    public void setCount87(int count87) {
        this.count87 = count87;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Player(int x, int y, String id, InetAddress bufAddress){
        super(x,y,50,50);
        identity = id;
        address = bufAddress;
        setAttribute(0);
        count87  = 0;
        speed = 20;
    }

    public InetSocketAddress getSocketAddress() {
        return socketAddress;
    }

    public Player(int x, int y, String id, InetSocketAddress bufAddress){
        super(x,y,50,50);
        identity = id;
        socketAddress = bufAddress;
        setAttribute(0);
        count87  = 0;
        speed = 20;
    }


    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getId() {
        return identity;
    }

    public InetAddress getAddress() {
        return address;
    }

    public void setAddress(InetAddress address) {
        this.address = address;
    }

    public int getCount87() {
        return count87;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public int getMoveDir() {
        return moveDir;
    }

    public void setMoveDir(int moveDir) {
        this.moveDir = moveDir;
    }


    public Timer getItemTimer() {
        return itemTimer;
    }

    public void setItemTimer(Timer itemTimer) {
        this.itemTimer = itemTimer;
    }

    public int getEffectNum(){
        return effectNum;
    }
    public void setEffectNum(int effectNum){
        this.effectNum = effectNum;
    }
}
