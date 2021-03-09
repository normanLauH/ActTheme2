public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(); // La clase Rectangle no está definida y se debe declarar que myRect es una nueva instancia de esta
        myRect.width = 40;
        myRect.height = 50;

        System.out.println("myRect's area is " + myRect.area());
    }
}

class Rectangle {
    int width;
    int height;

    int area() {
        return this.height * this.width;
    }
}