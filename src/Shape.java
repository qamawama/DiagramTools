public class Shape {
    private String type;
    private Point position;
    private Dimension size;
    private String text;
    private Color color;
    private String style;
    private boolean isSelected;
    private boolean isLocked;

    public Shape(String type, Point position, Dimension size, String text, Color color, String style) {
        this.type = type;
        this.position = position;
        this.size = size;
        this.text = text;
        this.color = color;
        this.style = style;
        this.isSelected = false;
        this.isLocked = false;
    }

    public void move(Point position) {
        this.position = position;
    }

    public void resize(Dimension size) {
        this.size = size;
    }

    public void rotate(double angle) {
        // implement rotation logic here
    }

    public void select() {
        this.isSelected = true;
    }

    public void deselect() {
        this.isSelected = false;
    }

    public void lock() {
        this.isLocked = true;
    }

    public void unlock() {
        this.isLocked = false;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    // Getters and setters for all variables
}
