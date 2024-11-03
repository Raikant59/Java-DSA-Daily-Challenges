// Given a route containing 4 direction[E,W,S,N] find the shortest path to reach destination?

public class directionroute {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path : "+shortestpath(path));
    }

    public  static float shortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char direction = path.charAt(i);
            // North
            if(direction=='N'){
                y++;
            }// East
            else if(direction=='E'){
                x++;
            }// South
            else if(direction=='S'){
                y--;
            }// West
            else if(direction=='W'){
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2 + y2);
    }
}
