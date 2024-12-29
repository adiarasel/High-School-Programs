public class main {

    public static final int WIDTH = 94, HEIGHT = 50;


    public static void main(String[] args) {
        StdDraw.clear();
        TERenderer renderer = new TERenderer();
        renderer.initialize(WIDTH, HEIGHT);
        TETile[][] world;

//        while(true){ // game loop
//            char input = waitForUserInput();
//            System.out.println(input);
//        }
    }

    public static TETile[][] getEmptyWorld(){
        TETile[][] world = new TETile[WIDTH][HEIGHT];
//        for(int i = 0; i < )
        return world;
    }
    public static char waitForUserInput(){
        while(true) {
            if (StdDraw.hasNextKeyTyped()) {
                return Character.toLowerCase(StdDraw.nextKeyTyped());
            }
        }
    }
}
