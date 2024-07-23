package daocontroller;

import conexion.conexion;
import modelo.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryDAO {

    public static void createCategoryDAO(Category category){                //se inyecta la dependencia(llamdo de objeto)

        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO category(category_name)VALUES(?)";

                ps = connect.prepareStatement(query);

                ps.setString(1,category.getCategoryName());

                ps.executeUpdate();

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void SelectCategoryDAO( ){

        conexion conexion = new conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM category";

            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID" + rs.getInt("id_category"));
                System.out.println("Categoria" + rs.getString("category_name"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void DeleteCategoryDAO(int idCategory){

        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM category WHERE category.id_category = ? ";

                ps = connect.prepareStatement(query);

                ps.setInt(1,idCategory);

                ps.executeUpdate();

                System.out.println("Se ha eliminado la categoria correctamente");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
