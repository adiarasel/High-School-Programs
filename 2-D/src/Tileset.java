import java.awt.Color;

    /**
     * Contains constant tile objects, to avoid having to remake the same tiles in different parts of
     * the code.
     * <p>
     * You are free to (and encouraged to) create and add your own tiles to this file. This file will
     * be turned in with the rest of your code.
     * <p>
     * Ex:
     *      world[x][y] = Tileset.FLOOR;
     */
    public class Tileset {
        public static final TETile WALL = new TETile(
                new Color(122, 1, 1), Color.darkGray,
                "Behold the wall tile, the pinnacle of tile-based technology",
                "ﳼ"
        );

        public static final TETile NOTHING = new TETile(
                Color.black, Color.black,
                "The void in our hearts as we read our spaghetti code",
                " "
        );

        public static final TETile GRASS = new TETile(
                Color.green, new Color(97, 35, 8),
                "Mission students should probably go touch some",
                "\"'"
        );

        public static final TETile WATER = new TETile(
                Color.blue, Color.black,
                "Water you waiting for? Use me",
                "≈"
        );

        public static final TETile FLOWER = new TETile(
                Color.magenta, Color.pink,
                "Flowery writing won't make this prettier than it already is",
                "❀"
        );

        public static final TETile LOCKED_DOOR = new TETile(
                Color.orange, Color.black,
                "A key part of being able to open these doors is...",
                "█"
        );

        public static final TETile UNLOCKED_DOOR = new TETile(
                Color.orange, Color.black,
                "Nothing on 1, binding on 2, a click out of 3...",
                "▢"
        );

        public static final TETile SAND = new TETile(
                Color.yellow, Color.black,
                "Welcome to Sahara! We've got a lot of SAaAAnD",
                "▒"
        );

        public static final TETile MOUNTAIN = new TETile(
                Color.gray, Color.black,
                "A mountain of dread has been building up in the distance",
                "▲"
        );

        public static final TETile TREE = new TETile(
                Color.green, Color.black,
                "#TeamTrees",
                "♠"
        );

        public static final TETile PLAYER = new TETile(
                Color.blue, Color.orange, 
                "Player :p",
                "\uE738"
        );

    }
