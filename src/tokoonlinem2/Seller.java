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
public class Seller extends User {
    public Seller(String username) {
        super(username);
    }

    @Override
    public void showMenu() {
        System.out.println("Halo " + getUsername() + ", ini menu SELLER.");
    }
}
