package servicecontroller;

import daocontroller.CategoryDAO;
import modelo.Category;

import java.util.Scanner;

public class CategoryService {
    Scanner sc = new Scanner(System.in);
    public void CreateCategory(Category category){

        System.out.println("Ingrese nombre de categoria");
        String categoryName = sc.nextLine();
        category.setCategoryName(categoryName);             //se manda el dato al modelo, se guarda en el modelo

        CategoryDAO.createCategoryDAO(category);

    }

    public void SelectCategory(){
        CategoryDAO.SelectCategoryDAO();

    }

    public void DeleteCategory(int idCategory){
        System.out.println("Indique el id de la categoria a borrar");
        int idCategoria = sc.nextInt();

        CategoryDAO.DeleteCategoryDAO(idCategoria);

    }

}
