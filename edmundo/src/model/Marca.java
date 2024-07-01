package model;

import java.util.List;

public class Marca extends User {
	private String cnpj;
	private String categoria;
	private Number orcamento;
    private List<Campanha> campaigns;
    private List<Produto> produtos;
    
    public Marca() {
        this.type = UserType.MARCA;
    }


    public List<Campanha> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campanha> campaigns) {
        this.campaigns = campaigns;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public String getCnpj() {
    	return cnpj;
    }
    
    public void setCnpj(String cnpj) {
    	this.cnpj = cnpj;
    }
    
    public String getCategoria() {
    	return categoria;
    }
    
    public void setCategoria(String categoria) {
    	this.categoria = categoria;
    }
    
    public Number getOrcamento() {
    	return orcamento;
    }
    
    public void setOrcamento(Number orcamento) {
    	this.orcamento = orcamento;
    }

    public List<Produto> get_produtos() {
        return produtos;
    }

}

public void lanca_campanha(String objetivo, double orcamento, LocalDate data_de_termino) {
    Campanha campanha = new Campanha(objetivo, orcamento, data_de_termino);
    this.campanhas.add(campanha);
}