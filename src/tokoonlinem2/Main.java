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
public class Main {
    public static void main(String[]args){
        User pengguna1 = new Admin("Rudi");
        User pengguna2 = new Buyer("Budi");
        User pengguna3 = new Seller("Siti");

        User[] semuaPengguna = {pengguna1, pengguna2, pengguna3};
        
        for (User u: semuaPengguna) {
            u.showMenu();
        }
    }
}
