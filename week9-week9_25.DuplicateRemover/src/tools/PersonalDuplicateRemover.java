/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private int duplicateCounter;
    private Set<String> characterStrings;
    
    public PersonalDuplicateRemover() {
        this.duplicateCounter = 0;
        this.characterStrings = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /* for (String s : this.characterStrings) {
            if (s.equals(characterString)) {
                this.duplicateCounter++;
            } else {
                this.characterStrings.add(characterString);
            }
        } */
        if (this.characterStrings.contains(characterString)) {
            this.duplicateCounter++;
            // return;
        } else {
            this.characterStrings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.duplicateCounter;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.characterStrings;
    }

    @Override
    public void empty() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.characterStrings.clear();
        this.duplicateCounter = 0;
    }
    
}
