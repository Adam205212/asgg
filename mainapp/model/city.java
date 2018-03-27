package mainapp.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class city {
	private final StringProperty city;
	private final StringProperty Country;
	private final IntegerProperty Rank;
	private final StringProperty Area;
	private final StringProperty Population;
	private final StringProperty Density;

	// connection
	public city(String city, String Country, int Rank, String Area, String Population, String Density) {
		this.city = new SimpleStringProperty(city);
		this.Country = new SimpleStringProperty(Country);
		this.Rank = new SimpleIntegerProperty(Rank);
		this.Area = new SimpleStringProperty(Area);
		this.Population = new SimpleStringProperty(Population);
		this.Density = new SimpleStringProperty(Density);
	}

	public city() {
		this(null, null, 0, null, null, null);
	}

	public String getcity() {
		return city.get();
	}

	public void setcity(String city) {
		this.city.set(city);
	}

	public StringProperty cityProperty() {
		return city;
	}

	public String getCountry() {
		return Country.get();
	}

	public void setCountry(String Country) {
		this.Country.set(Country);
	}

	public StringProperty CountryProperty() {
		return Country;
	}
	public int getRank() {
		return Rank.get();
	}

	public void setRank(int Rank) {
		this.Rank.set(Rank);
	}

	public IntegerProperty RankProperty() {
		return Rank;
	}
	public String getArea() {
		return Area.get();
	}

	public void setArea(String Area) {
		this.Area.set(Area);
	}

	public StringProperty AreaProperty() {
		return Area;
	}
	public String getPopulation() {
		return Population.get();
	}

	public void setPopulation(String Population) {
		this.Population.set(Population);
	}

	public StringProperty PopulationProperty() {
		return Population;
	}
	public String getDensity() {
		return Density.get();
	}

	public void setDensity(String Density) {
		this.Density.set(Density);
	}

	public StringProperty DensityProperty() {
		return Density;
	}
}
