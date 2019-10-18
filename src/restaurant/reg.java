/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Med
 */
import java.util.prefs.Preferences;

public class reg {
    
    public static final String PREF_KEY = "CURRENT_USER";
    public static void main(String[] args) {
        // Write Preferences information to HKCU (HKEY_CURRENT_USER),
        // HKCUSoftwareJavaSoftPrefsorg.kodejava
        Preferences userPref = Preferences.userRoot();
        userPref.put(PREF_KEY, "365");


        // Read back the value we've written in the code above.
        System.out.println("Preferences = "
                + userPref.get(PREF_KEY, PREF_KEY + " was not found."));
    }

}