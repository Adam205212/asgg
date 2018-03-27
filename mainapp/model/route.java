package mainapp.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class route {
	private final StringProperty origin;
	private final StringProperty destinantion;

	public route(String origin, String destinantion) {
		this.origin = new SimpleStringProperty(origin);
		this.destinantion = new SimpleStringProperty(destinantion);
	}

	public route() {
		this(null, null);
	}
	public String getorigin() {
		return origin.get();
	}

	public void setorigin(String origin) {
		this.origin.set(origin);
	}

	public StringProperty originProperty() {
		return origin;
	}
}
