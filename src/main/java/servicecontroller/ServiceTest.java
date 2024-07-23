package servicecontroller;

import modelo.Category;

public class ServiceTest {

    public static void main(String[] args) {

        Category category = new Category();         //instanciando la clase

        CategoryService cs = new CategoryService();

        cs.CreateCategory(category);

        cs.SelectCategory();

        System.out.println("Ingrese id de la categoria a eliminar: ");
        int id = 2;

        cs.DeleteCategory(id);
    }
}
