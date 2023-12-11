package oophomework;

public class Rectangle1 {

    int lenght;
    int width;

    public Rectangle1 (int lenght,int width){
        this.lenght= lenght;
        this.width = width;

    }

    int getArea() {
        return lenght*width;
        // не нужно писать статик
    }
    int getPerimeter () {
        return 2*(lenght +width);
    }
    //подсчеты делать нужно не в конструкторе, а ниже


}
