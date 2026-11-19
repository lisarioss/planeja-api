package io.github.ds.planeja.dominio.cartao;

import io.github.ds.planeja.dominio.cartao.model.CartaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CartaoRepository extends JpaRepository<CartaoEntity, UUID> {

    Optional<CartaoEntity> findByNome(String nome);

    List<CartaoEntity> id(UUID id);
}
