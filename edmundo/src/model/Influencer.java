package model;

import java.util.List;

public class Influencer extends User {
	private String cpf;
    private List<Aplicacao> applications;
    private List<Post> posts;
    private Number nota;
	private Number numero_avaliacoes;

    public Influencer() {
        this.type = UserType.INFLUENCER;
    }


    public List<Aplicacao> getApplications() {
        return applications;
    }

    public void setApplications(List<Aplicacao> applications) {
        this.applications = applications;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Number getNota() {
        return nota;
    }

    public void setNota(Number nota) {
        this.nota = nota;
    }

    public Number getNumeroAvaliacoes() {
        return numero_avaliacoes;
    }

    public void setNumeroAvaliacoes(Number numero_avaliacoes) {
        this.numero_avaliacoes = numero_avaliacoes;
    }
}
