public class Tool {
    private String name;
    private String description;
    private String icon;
    private String tooltip;
    private boolean isSelected;

    public Tool(String name, String description, String icon, String tooltip) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.tooltip = tooltip;
        this.isSelected = false;
    }

    public void execute() {
        // execute the functionality of the tool
    }

    public void select() {
        isSelected = true;
    }

    public void deselect() {
        isSelected = false;
    }
}