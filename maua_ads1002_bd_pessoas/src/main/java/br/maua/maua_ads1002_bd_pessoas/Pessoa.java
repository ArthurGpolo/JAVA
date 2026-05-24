package br.maua.maua_ads1002_bd_pessoas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class Pessoa {

    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Pessoa(int codigo, String nome, String fone, String email) {
        this(nome, fone, email);
        this.codigo = codigo;
    }
    
    public Pessoa(int codigo){
        this.codigo = codigo;
    }

    //clausula catch or declare
    public void cadastrar() throws Exception {
        //1. Definir o comando sql
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        //2. Abrir uma conexão
        Connection conexao = ConnectionFactory.conectar();
        //3. Preparar o comando 
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Substituir eventuais placeholders
        ps.setString(1, nome);
        ps.setString(2, fone);
        ps.setString(3, email);
        //5. Executar o comando
        ps.execute();
        ps.close();
        conexao.close();
    }

    public static List<Pessoa> listar() throws Exception {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        String sql = "SELECT * FROM tb_pessoa";
        Connection conexao = ConnectionFactory.conectar();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int codigo = rs.getInt("codigo");
            String nome = rs.getString("nome");
            String fone = rs.getString("fone");
            String email = rs.getString("email");
            Pessoa p = new Pessoa(codigo, nome, fone, email);
            pessoas.add(p);
        }
        rs.close();
        ps.close();
        conexao.close();
        return pessoas;
    }

    public void remover() throws Exception {
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        try(
            Connection conexao = ConnectionFactory.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql);           
        ){
            ps.setInt(1, codigo);
            ps.executeUpdate();
        }
    }
    
    public void atualizar() throws Exception {

    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
