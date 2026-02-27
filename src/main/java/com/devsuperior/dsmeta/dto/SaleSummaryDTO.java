package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Seller;

public class SaleSummaryDTO {

    private Long sellerId;
    private String sellerName;
    private Double amount;

    public SaleSummaryDTO() {
    }

    public SaleSummaryDTO(Long sellerId, String sellerName, Double amount) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.amount = amount;
    }

    public SaleSummaryDTO(Seller seller) {
        sellerId = seller.getId();
        sellerName = seller.getName();
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
