public class TextLabel implements 
        Drawable, Colorable {
    private double y;
    private double x;
    private String text;
    private String fontFamily;
    private double fontSize;
    private String color;

    public TextLabel() {
        fontSize = 10;
        fontFamily = "Times New Roman";
        text = "";
    }

    public TextLabel(double y, double x, String text, String fontFamily, double fontSize) {
        this.y = y;
        this.x = x;
        this.text = text;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public double getFontSize() {
        return fontSize;
    }

    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    
}
