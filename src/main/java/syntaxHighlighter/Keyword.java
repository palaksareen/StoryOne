package syntaxHighlighter;

public class Keyword {

	private String name;
	private String color;
	private String capitalization;
	private String style;
	
	
	public Keyword(String name, String color, String capitalization, String style) {
		super();
		this.name = name;
		this.color = color;
		this.capitalization = capitalization;
		this.style = style;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCapitalization() {
		return capitalization;
	}
	public void setCapitalization(String capitalization) {
		this.capitalization = capitalization;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	
	
}
