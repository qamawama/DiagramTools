public class Connection{

    private Shape fromShape;
    private Shape toShape;
    private Color color;
    private String style;
    private boolean isSelected;
    private boolean isLocked;

    public Connection(Shape fromShape, Shape toShape, Color color, String style) {
        this.fromShape = fromShape;
        this.toShape = toShape;
        this.color = color;
        this.style = style;
        this.isSelected = false;
        this.isLocked = false;
    }

    public void setFromShape(Shape fromShape) {
        this.fromShape = fromShape;
    }

    public void setToShape(Shape toShape) {
        this.toShape = toShape;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStyle(String style) {
        this.style = style;
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

// Getters and setters for all variables
}
