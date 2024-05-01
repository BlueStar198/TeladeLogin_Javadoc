# TeladeLogin_Javadoc

Este é um sistema de autenticação de usuários simples desenvolvido em Java.

## Funcionalidades

- **Login de Usuário:** Permite que um usuário faça login fornecendo seu nome de usuário e senha. Se as credenciais estiverem corretas, o usuário é autenticado com sucesso.

- **Adição de Novos Usuários:** Possibilita a adição de novos usuários ao banco de dados, fornecendo um nome de usuário e senha.

## Utilização

1. Instancie um objeto `LoginScreen`.
2. Utilize o método `login(username, password)` para autenticar um usuário existente.
3. Para adicionar um novo usuário, utilize o método `addUser(username, password)`.

## Exemplo de Uso

```java
public static void main(String[] args) {
    // Criando uma instância de LoginScreen
    LoginScreen loginScreen = new LoginScreen();

    // Autenticando um usuário existente
    boolean loggedIn = loginScreen.login("john", "password123");
    if (loggedIn) {
        System.out.println("Usuário autenticado com sucesso!");
    } else {
        System.out.println("Falha na autenticação. Verifique suas credenciais.");
    }

    // Adicionando um novo usuário
    loginScreen.addUser("novo_usuario", "nova_senha");

    // Tentando fazer login com o novo usuário
    loggedIn = loginScreen.login("novo_usuario", "nova_senha");
    if (loggedIn) {
        System.out.println("Usuário autenticado com sucesso!");
    } else {
        System.out.println("Falha na autenticação. Verifique suas credenciais.");
    }
}
```

## Testes

Os testes de unidade estão implementados na classe `LoginScreenTest`, onde são verificados os seguintes cenários:

1. **Login Bem-Sucedido:** Verifica se o login é bem-sucedido com credenciais corretas.
2. **Login Mal-Sucedido:** Verifica se o login falha com credenciais incorretas.
3. **Adição de Novo Usuário:** Verifica se um novo usuário pode ser adicionado corretamente e se é possível fazer login com as novas credenciais.
