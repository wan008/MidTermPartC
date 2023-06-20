/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author bada5
 */
public class TestUserprofile {
    
    public static void main(String[] args){        
        
        
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter user name: ");
        String username = input.next();
        
        System.out.print("Please enter your favourite Genre  : ");
        for (int i=0; i < UserProfile.genre().length(); i++){
            //System.out.println(("number=%2d %s", i, u1.genre()[i] ));
        }
        String genre1 = input.next();
        
        UserProfile u1 = new UserProfile(username, genre1);    
        
    }
    
}
