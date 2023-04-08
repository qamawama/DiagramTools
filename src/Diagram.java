import java.util.ArrayList;
import java.util.Date;

public class Diagram {
    private String name;
    private String description;
    private Date creationDate;
    private Date lastModifiedDate;
    private String owner;
    private ArrayList<Shape> shapes;
    private ArrayList<Connection> connections;

    public Diagram(String name, String description, String owner) {
        this.name = name;
        this.description = description;
        this.creationDate = new Date();
        this.lastModifiedDate = new Date();
        this.owner = owner;
        this.shapes = new ArrayList<Shape>();
        this.connections = new ArrayList<Connection>();
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
        this.lastModifiedDate = new Date();
    }

    public void removeShape(Shape shape) {
        this.shapes.remove(shape);
        this.lastModifiedDate = new Date();
    }

    public void addConnection(Connection connection) {
        this.connections.add(connection);
        this.lastModifiedDate = new Date();
    }

    public void removeConnection(Connection connection) {
        this.connections.remove(connection);
        this.lastModifiedDate = new Date();
    }

    public void rename(String name) {
        this.name = name;
        this.lastModifiedDate = new Date();
    }

    public void save() {
        // save the diagram to a file or database
    }
}