package org.cal.TP1;

import org.cal.TP1.cli.CliApp;
import org.cal.TP1.db.IDbController;
import org.cal.TP1.db.IDbControllerIMPL;

public class App
{
    public static void main( String[] args )
    {
        /* TODO : Initialiser le DB controller Une fois vos deux classes implémentées, vous devrez modifier la méthode « main » dans
la classe « App » afin d’instancier le CliApp avec votre IDbController. Vous devrez, bien
entendu, vous assurer que le IDbController est initialiser avec un IDb. */
        IDbController dbController = new IDbControllerIMPL();

        CliApp cli = new CliApp(dbController);
        cli.start();
    }
}
