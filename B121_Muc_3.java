/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b121_muc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author PC-18
 */

class User{
    private String user;
    private String password;
    
    public User(String user, String password){
        this.user = user;
        this.password = password;
    }
    
    // Getter
    public String getUser(){
        return this.user;
    }
    public String getPass(){
        return this.password;
    }
    
    // Setter
    public void setUser(String userBaru){
        this.user = userBaru;
    }
    public void setPassword(String passwordBaru){
        this.password = passwordBaru;
    }
}

public class B121_Muc_3 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<User> dataUser = new ArrayList<>();
        while(true){
            System.out.println("=============================");
            System.out.println("1 | Create");
            System.out.println("2 | Read");
            System.out.println("3 | Update");
            System.out.println("4 | Delete");
            System.out.println("5 | Exit");
            System.out.println("=============================");
            System.out.print("Masukkan Pilihan Anda : ");
            int answer = Integer.parseInt(br.readLine());
            switch(answer){
                case 1:
                    System.out.print("Create Username : ");
                    String usr = br.readLine();
                    System.out.print("Create Password : ");
                    String pass = br.readLine();
                    User newuser = new User(usr, pass);
                    dataUser.add(newuser);
                    break;
                case 2: 
                    System.out.println("=============================");
                    for(int i = 0; i < dataUser.size(); i++){
                        System.out.println("Data User ke-" + (i+1));
                        System.out.println("Username : " + dataUser.get(i).getUser());
                        System.out.println("Password : " + dataUser.get(i).getPass());
                        System.out.println("=============================");
                    }
                    System.out.print("Press [enter] to continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 3:
                    System.out.println("=============================");
                    for(int i = 0; i < dataUser.size(); i++){
                        System.out.println("Data User ke-" + (i+1));
                        System.out.println("Username : " + dataUser.get(i).getUser());
                        System.out.println("Password : " + dataUser.get(i).getPass());
                        System.out.println("=============================");
                    }   
                    
                    System.out.print("Masukkan Username Yang Ingin Diupdate : ");
                    String update = br.readLine();
                    
//                    for (int i = 0; i < dataUser.size(); i++){
//                        if (dataUser.get(i).getUser().equals(update)){
//                            dataUser.get(i).setUser(update);
//                        }
//                    }
                    
                    for(User setUser : dataUser){
                        if(setUser.getUser().equals(update)){
                            System.out.print("Masukkan Username : ");
                            setUser.setUser(br.readLine());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("=============================");
                    for(int i = 0; i < dataUser.size(); i++){
                        System.out.println("Data User ke-" + (i+1));
                        System.out.println("Username : " + dataUser.get(i).getUser());
                        System.out.println("Password : " + dataUser.get(i).getPass());
                        System.out.println("=============================");
                    }   
                    
                    System.out.print("Masukkan Username Yang Ingin Dihapus : ");
                    String delete = br.readLine();
                    
                    for(User user : dataUser){
                        if (user.getUser().equals(delete)){
                            dataUser.remove(user);
                            break;
                        }
                    }
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}
