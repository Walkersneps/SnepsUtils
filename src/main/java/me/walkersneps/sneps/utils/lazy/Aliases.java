package me.walkersneps.sneps.utils.lazy;

/**
 * Created by Walkersneps on 23/04/16
 * in package me.walkersneps.sneps.utils.lazy.alias
 * for SnepsUtils
 */


import me.walkersneps.sneps.utils.lazy.aliases.PrintAlias;

/**
 * @author Walkersneps
 */
public class Aliases {

    /**
     * Alias for eprint in PrintAlias
     *
     * @see PrintAlias#eprint(String text)
     *
     * @param stringToPrint argument 'text' of PrintAlias.eprint
     */
    public void p (String stringToPrint) {
        PrintAlias.eprint(stringToPrint);
    }




} //end of class
