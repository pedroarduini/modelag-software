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
