import Factory.Figure;
import Factory.FigureFactory;
import Factory.FigureType;

public class main {
    public static void main(String[] args) {
        FigureFactory figureFactory = new FigureFactory();

        Figure circle = figureFactory.makeFigure(FigureType.CIRCLE);
        Figure triangle = figureFactory.makeFigure(FigureType.TRIANGLE);
        Figure rectangle = figureFactory.makeFigure(FigureType.RECTANGLE);
    }
}
