public class CharacterDrawingUtilities {
    public static void drawElement(char c){
        System.out.print(c);
    }
    public static void drawNewLine(){
        System.out.println("");
    }
    public static void drawHorizontalSegmentWith(char c, int width){
        for (int i =0; i<width; i++){
            drawElement(c);
            System.out.print(" ");
        }
    }
    public static void drawHorizontalEmptySegmentWith(char c, int width){
        for (int i = 0; i<width; i++){
            if(i == 0 || i ==width -1 ){
                System.out.print(" ");
            }
        }
    }

    public static void drawFilledRectangleWith(char c, int width, int height){
        for (int i =0; i<height; i++){
            drawHorizontalSegmentWith(c,width);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(char c, int width, int height){
        for (int i = 0; i < height; i++) {
            if(i==0 || i == height -1){
                drawHorizontalSegmentWith(c,width);
            }
            else {
                drawHorizontalEmptySegmentWith(c,width);
            }
            drawNewLine();
        }
    }
}
