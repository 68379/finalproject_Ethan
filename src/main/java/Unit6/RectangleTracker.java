package Unit6;

    public class RectangleTracker {

        private Rectangle[] rectangles;
        private int index;

        //Constructor
        public RectangleTracker(int length) {
            rectangles = new Rectangle[length];
            index = 0;
        }

//some setters and getters not shown

        public Rectangle[] getRectangles() {
            return rectangles;

        }

        public void addRectangle(Rectangle rec) {
            if (index < rectangles.length) {
                rectangles[index] = rec;
                index++;
            }
        }

        public void setRectangles(Rectangle[] rectangles) {
            this.rectangles = rectangles;
        }

        public void printRectangles() {
            for (int i = 0; i < rectangles.length; i++) {
                if (rectangles[i] != null) {
                    System.out.println(rectangles[i]);
                }
            }
        }


        public Rectangle getSmallest() {
            Rectangle r = rectangles[0];
            for (int i = 0; i < rectangles.length; i++) {
                if (rectangles[i].getPerimeter() < r.getPerimeter()) {
                    r = rectangles[i];
                }
            }
            return r;
        }
        public void printRectanglesWithSameLength(int length){
            for(int i = 0; i< rectangles.length; i++){
                if(rectangles[i].getLength() == length){
                    System.out.println(rectangles[i]);
                }
            }
        }
        public void editRectangle(int index, int length, int width){
            if(index >= 0 && index < rectangles.length){
                for(int i = 0; i< rectangles.length; i++){
                    if(index == 1){
                        rectangles[i].setLength(length);
                        rectangles[i].setWidth(width);
                        System.out.println("Length and width have been changed");
                    }
                }
            }
        }
    }




