/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import nguyen.User_Nguyen;
import Model.User;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class User_sv {
    private User_Nguyen userNguyen;

    public User_sv() {
        userNguyen = new User_Nguyen();
    }

    public  List<User> getAllUers(){
        return userNguyen.getAllUsers();
    }
    public void addUser(User user){
        userNguyen.addUser(user);
    }
     public void deleteUser(int id){
        userNguyen.deleteUser(id);
    }
}
