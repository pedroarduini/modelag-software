package model;

import java.time.LocalDate;
import java.util.List;

public class Campanha {
    private Long id;
    private Long brandId;
    private List<Aplicacao> applications;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Number orcamento;
    private String objetivo;

    public Campanha(String objetivo, double orcamento, LocalDate data_de_termino) {
        this.id = UUID.randomUUID();
        this.data_de_inicio = LocalDate.now();
        atualiza_dados(objetivo, orcamento, data_de_termino);
        this.produtos = new ArrayList<>();
    }

    public void atualiza_dados(String objetivo, double orcamento, LocalDate data_de_termino) {
        this.objetivo = objetivo;
        this.orcamento = orcamento;
        this.data_de_termino = data_de_termino;
    }

    public void adiciona_produtos(List<Produto> lista_produtos) {
        this.produtos.addAll(lista_produtos);
    }

    public boolean valida_dados(String objetivo, double orcamento, LocalDate data_de_termino) {
        // Implementação da validação conforme regras de negócio
        return true;
    }


    public boolean valida_dados(String objetivo, double orcamento, LocalDate data_de_termino) {
        if (objetivo == null || objetivo.trim().isEmpty()) {
            System.out.println("O objetivo não pode ser nulo ou vazio.");
            return false;
        }
        if (orcamento <= 0) {
            System.out.println("O orçamento deve ser positivo.");
            return false;
        }
        if (data_de_termino.isBefore(this.data_de_inicio)) {
            System.out.println("A data de término deve ser posterior à data de início.");
            return false;
        }
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }


    public List<Aplicacao> getApplications() {
        return applications;
    }

    public void setApplications(List<Aplicacao> applications) {
        this.applications = applications;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Number getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Number orcamento) {
        this.orcamento = orcamento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
