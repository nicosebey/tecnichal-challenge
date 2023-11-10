package dto;


public class VehiclesTypeDto {
    private boolean isPrimary;
    private String name;
    private Integer id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public boolean isPrimary() {
        return isPrimary;
    }
}
