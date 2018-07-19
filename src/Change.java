/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s434655
 */
public class Change {
    private char from;
    private char to;

    public Change(char from, char to) {
        this.from = from;
        this.to = to;
    }
    
    public String change (String characterString) {
        
        String replace=characterString;
        for(int i=0;i<characterString.length();i++){
        
            if(characterString.charAt(i)==this.from){
            
                replace = characterString.replace(characterString.charAt(i), this.to);
            }
        }
        return replace;
    }

}
