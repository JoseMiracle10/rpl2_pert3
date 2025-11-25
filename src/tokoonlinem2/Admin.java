/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoonlinem2;

/**
 *
 * @author josem
 */
public class Admin extends User {
    public Admin(String username) {
        super(username); // Melempar 'username' ke konstruktor User
    }

    @Override
    public void showMenu() {
        System.out.println("Halo " + getUsername() + ", ini menu ADMIN.");
    }
}
