public class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }

    public void erase() {
        System.out.println("Erasing a shape...");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a circle...");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle...");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a triangle...");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square...");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a square...");
    }
}
