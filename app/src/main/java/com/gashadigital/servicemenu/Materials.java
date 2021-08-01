package com.gashadigital.servicemenu;

public class Materials {
    private final String title;
    private final String description;
    private final int img;

    public static final Materials[] materials = {
            new Materials("Microscope", "An Instrument that produces enlarged images of small objects, allowing the observer an exceedingly close view of minute structures at a scale convenient for examination and analysis.", R.drawable.science),
            new Materials("Coloring", "A coloring materials are any material used for its color", R.drawable.color_pen),
            new Materials("Books", "A medium for recording information in the form of writing or images, typically composed of many pages bound together and protected by a cover.", R.drawable.book),
            new Materials("Rulers", "Come in a different shapes sizes and materials. Some of that materials are plastic, wood and metal", R.drawable.stationary)
    };

    public Materials(String title, String description, int img) {
        this.title = title;
        this.description = description;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getImg() {
        return img;
    }
//    public String toString() {
//        return this.title;
//    }

}
