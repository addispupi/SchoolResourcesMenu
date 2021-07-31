package com.gashadigital.servicemenu;

public class Materials {
    private final String title;
    private final String description;
    private final int img;

    public static final Materials[] materials = {
            new Materials("Microscope", "A microscope is a laboratory instrument used to examine objects that are too small to be seen by the naked eye.", R.drawable.science),
            new Materials("Coloring", "Coloring tools to have", R.drawable.color_pen),
            new Materials("Books", "Books tools to have", R.drawable.book),
            new Materials("Rulers", "Rulers tools to have", R.drawable.stationary)
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
