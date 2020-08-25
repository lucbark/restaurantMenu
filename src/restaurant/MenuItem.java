package restaurant;

public class MenuItem(String category, String name, String description, int price) {
    private String category;
    private String name;
    private String description;
    private int price;


// category
    public String getCategory() {
        return this.category;
    }
    private void setCategory(String category) {
        this.category = category;
    }

//name
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getDescription() {
        return this.description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return this.price;
    }

    private void setPrice(int price) {
        this.price = price;
    }



    public AddMenuItem()

}
