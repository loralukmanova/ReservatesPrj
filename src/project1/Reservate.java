/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project1;

/**
 *
 * @author Lenovo
 */
public class Reservate {

    private String name;
    private int x;
    private int y;
    private String iconName;
    private String description;
    private String imageName;

    public Reservate(String name, int x, int y, String iconName, String description, String imageName) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.iconName = iconName;
        this.description = description;
        this.imageName = imageName;
    }

    
    public Reservate(){
    }
    
    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public String toString() {
        return name + " " + x + " " + y + " " + iconName + " " + imageName+ " " + description ;
    }

    
}
