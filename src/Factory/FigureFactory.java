package Factory;

import Factory.Figures.Circle;
import Factory.Figures.Rectangle;
import Factory.Figures.Triangle;

public class FigureFactory {
    public Figure makeFigure (FigureType figureType) {
        Figure figure = null;

        switch (figureType) {
            case CIRCLE -> figure = new Circle(100, 100);
            case TRIANGLE -> figure = new Triangle(100, 100);
            case RECTANGLE -> figure = new Rectangle(100, 100);
        }

        return figure;
    }
}
