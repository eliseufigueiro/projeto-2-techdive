package HabilitPro.model.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarSenha {

    public boolean isValidarSenha(String senha) {

        //Valida 8 dígitos, letras maiúsculas e minúsculas, números e caracter especial
        String r = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(senha);
        return m.matches();
    }
}
