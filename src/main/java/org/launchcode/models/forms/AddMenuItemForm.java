package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;
import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    private Iterable<Cheese> cheeses;

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }
    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    @NotNull
    private int menuId;

    public int getMenuId() {
        return menuId;
    }
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    @NotNull
    private int cheeseId;

    public int getCheeseId() {
        return cheeseId;
    }
    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }


    public AddMenuItemForm() {}

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu) {
        this.cheeses = cheeses;
        this.menu = menu;
    }
}