

package laberintos;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;


public class Laberinto {
private City ciudad;
private Robot robot;
private Wall muro[];
private Thing meta;

    public Laberinto(City ciudad) {
        this.ciudad = new City();
        this.robot = new Robot(ciudad,7,4,Direction.NORTH);
    }
    public Laberinto(){
        this.ciudad= new City();
        this.robot = new Robot(ciudad,6,4,Direction.NORTH);
        this.meta = new Thing(ciudad,7,4);
        this.muro = new Wall[50];
        this.muro[0] = new Wall(ciudad,1,3,Direction.NORTH);
        this.muro[1] = new Wall(ciudad,1,4,Direction.NORTH);
        this.muro[2] = new Wall(ciudad,1,5,Direction.NORTH);
        this.muro[3] = new Wall(ciudad,1,6,Direction.NORTH);
        this.muro[4] = new Wall(ciudad,1,6,Direction.EAST);
        this.muro[5] = new Wall(ciudad,2,7,Direction.NORTH);
        this.muro[6] = new Wall(ciudad,2,7,Direction.EAST);
        this.muro[7] = new Wall(ciudad,3,8,Direction.NORTH);
        this.muro[8] = new Wall(ciudad,3,8,Direction.EAST);
        this.muro[9] = new Wall(ciudad,4,8,Direction.EAST);
        this.muro[10] = new Wall(ciudad,5,8,Direction.EAST);
        this.muro[11] = new Wall(ciudad,5,8,Direction.SOUTH);
        this.muro[12] = new Wall(ciudad,6,7,Direction.EAST);
        this.muro[13] = new Wall(ciudad,6,7,Direction.SOUTH);
        this.muro[14] = new Wall(ciudad,5,7,Direction.WEST);
        this.muro[15] = new Wall(ciudad,6,7,Direction.WEST);
        this.muro[16] = new Wall(ciudad,5,7,Direction.NORTH);
        this.muro[17] = new Wall(ciudad,5,6,Direction.NORTH);
        this.muro[18] = new Wall(ciudad,5,5,Direction.EAST);
        this.muro[19] = new Wall(ciudad,6,5,Direction.NORTH);
        this.muro[20] = new Wall(ciudad,6,4,Direction.EAST);
        this.muro[21] = new Wall(ciudad,4,5,Direction.NORTH);
        this.muro[22] = new Wall(ciudad,5,4,Direction.WEST);
        this.muro[23] = new Wall(ciudad,6,4,Direction.WEST);
        this.muro[24] = new Wall(ciudad,6,2,Direction.SOUTH);
        this.muro[25] = new Wall(ciudad,6,3,Direction.SOUTH);
        this.muro[26] = new Wall(ciudad,6,2,Direction.WEST);
        this.muro[27] = new Wall(ciudad,5,1,Direction.SOUTH);
        this.muro[28] = new Wall(ciudad,5,1,Direction.WEST);
        this.muro[29] = new Wall(ciudad,4,1,Direction.WEST);
        this.muro[30] = new Wall(ciudad,4,1,Direction.NORTH);
        this.muro[31] = new Wall(ciudad,3,2,Direction.WEST);
        this.muro[32] = new Wall(ciudad,3,2,Direction.NORTH);
        this.muro[33] = new Wall(ciudad,1,3,Direction.WEST);
        this.muro[34] = new Wall(ciudad,2,3,Direction.WEST);
        this.muro[35] = new Wall(ciudad,5,4,Direction.NORTH);
        this.muro[36] = new Wall(ciudad,4,4,Direction.EAST);
        this.muro[37] = new Wall(ciudad,3,4,Direction.EAST);
        this.muro[38] = new Wall(ciudad,4,7,Direction.NORTH);
        this.muro[39] = new Wall(ciudad,3,7,Direction.WEST);
        this.muro[40] = new Wall(ciudad,3,6,Direction.NORTH);
        this.muro[41] = new Wall(ciudad,2,6,Direction.WEST);
        this.muro[42] = new Wall(ciudad,2,5,Direction.NORTH);
        this.muro[43] = new Wall(ciudad,2,4,Direction.NORTH);
        this.muro[44] = new Wall(ciudad,2,3,Direction.EAST);
        this.muro[45] = new Wall(ciudad,3,3,Direction.EAST);
        this.muro[46] = new Wall(ciudad,4,3,Direction.NORTH);
        this.muro[47] = new Wall(ciudad,4,2,Direction.EAST);
        this.muro[48] = new Wall(ciudad,5,2,Direction.EAST);
        this.muro[49] = new Wall(ciudad,5,2,Direction.NORTH);
    }
public void laberinto(){
    while (robot.canPickThing()==false){
    this.advanceRight();
    while (robot.frontIsClear()==false){
    robot.turnLeft();
    }
    robot.move();
    }
    if(robot.canPickThing()==true){
    robot.pickThing();
    }
}
 private void advanceRight(){
    for (int i = 0; i < 3; i++) {
    this.robot.turnLeft(); 
    
    }}
}