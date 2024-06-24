package model;

import java.time.LocalDateTime;

public class Post {
    private Long id;
    private Long campaignId;
    private Long influencerId;
    private String link;
    private LocalDateTime data;
    private Number likes;
    private Number alcance;
    private String descricao;
    private String autor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public Long getInfluencerId() {
        return influencerId;
    }

    public void setInfluencerId(Long influencerId) {
        this.influencerId = influencerId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link= link;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
    
    public Number getLikes() {
        return likes;
    }

    public void setLikes(Number likes) {
        this.likes = likes;
    }

    public Number getAlcance() {
        return alcance;
    }

    public void setAlcance(Number alcance) {
        this.alcance = alcance;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
