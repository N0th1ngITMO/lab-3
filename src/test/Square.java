package test;

public class Square implements Shape {


    void sqared() {
        System.out.println("Я квадратный");
    }

    @Override
    public void rotate() {
        System.out.println("Квадрат вертим двумя руками");
    }

    @Override
    public void scaling(int scale) {
        System.out.println("Масштабируем в "+ scale + " раз");
    }
}
