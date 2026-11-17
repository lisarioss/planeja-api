package io.github.ds.planeja.dominio.cartao.mapper;

import io.github.ds.planeja.dominio.cartao.dto.CartaoDetalhes;
import io.github.ds.planeja.dominio.cartao.dto.CartaoForm;
import io.github.ds.planeja.dominio.cartao.model.CartaoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartaoMapper {
    CartaoEntity toEntity(CartaoForm form);

    CartaoDetalhes toDetalhes(CartaoEntity entity);
}
