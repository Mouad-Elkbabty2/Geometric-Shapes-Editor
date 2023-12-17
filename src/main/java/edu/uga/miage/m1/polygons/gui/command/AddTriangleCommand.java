
package edu.uga.miage.m1.polygons.gui.command;

import java.util.List;
import edu.uga.miage.m1.polygons.gui.shapes.Triangle;
import edu.uga.miage.m1.polygons.gui.shapes.SimpleShape;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AddTriangleCommand implements Command {
    private Triangle triangle;
    private List<SimpleShape> listOfShapes;

    public AddTriangleCommand(Triangle triangle, List<SimpleShape> listOfShapes) {
        this.triangle = triangle;
        this.listOfShapes = listOfShapes;
    }

    @Override
    public void execute() {
        listOfShapes.add(triangle);
    }



    
}