package io.github.ds.planeja.dominio.cartao.dto;

import io.github.ds.planeja.dominio.cartao.model.BandeiraCartao;

// Data Access Object
public record CartaoForm(String nome, BandeiraCartao bandeira) {
}
