package figury;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class Elipsa extends Figura{
    public Elipsa(Graphics2D buf, int del, int w, int h) {
        super(buf, del, w, h);
        area = new Area(new Ellipse2D.Double(0,0,100,50));
        aft = new AffineTransform();
    }
}
