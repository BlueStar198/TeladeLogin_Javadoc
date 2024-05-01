import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe que representa uma tela de login com funcionalidade de autenticação de usuário.
 */
public class LoginScreen {
    private Map<String, String> userDatabase;

    /**
     * Constrói um novo objeto LoginScreen e inicializa o banco de dados de usuários com usuários padrão.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Autentica um usuário com o nome de usuário e senha fornecidos.
     *
     * @param username O nome de usuário do usuário para autenticar.
     * @param password A senha do usuário para autenticar.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
    public boolean login(String username, String password) {
        // Verifica se o nome de usuário existe no banco de dados
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            // Verifica se a senha fornecida corresponde à senha armazenada
            if (storedPassword.equals(password)) {
                return true; // Autenticação bem-sucedida
            }
        }
        return false; // Autenticação falhou
    }

    /**
     * Adiciona um novo usuário ao banco de dados de usuários.
     *
     * @param username O nome de usuário do novo usuário.
     * @param password A senha do novo usuário.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password); // Adiciona o novo usuário ao banco de dados
    }

}
