package Strings;

public class shortestpath {
    public static void main(String[] args) {
        String path = "WENSNWENSN";
        int disp = shortestPath(path);
        System.out.println(disp);
    }
    public static int shortestPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'w'){
                x--;
            }
            else{  //  E
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (int)Math.sqrt(x2 + y2);
    }
}
