package web.model;


public class Cars {

    private int id;
    private String model;
    private String colour;
    private Integer series;

    public Cars() {
    }



    public Cars(Integer id, String model, String colour, Integer series) {
        this.id = id;
        this.model = model;
        this.colour = colour;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Cars " +
                "id=" + id +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", series=" + series;
    }
}
