import db_objs.User;
import guis.BankingAppGui;
import guis.LoginGui;

import javax.swing.*;
import java.math.BigDecimal;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginGui().setVisible(true));
//                new User(1,"username","password" , new BigDecimal("20.00"))
//        ).setVisible(true));
    }
}
