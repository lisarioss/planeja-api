package io.github.ds.planeja.dominio.cartao;

import io.github.ds.planeja.common.validation.CampoInvalido;
import io.github.ds.planeja.dominio.cartao.dto.CartaoForm;
import io.github.ds.planeja.common.validation.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartaoValidator {

    @Autowired
    private CartaoRepository repository;

    public ValidationResult validar(CartaoForm form){
        var result = ValidationResult.novo();

        if(repository.findByNome(form.nome()).isPresent()){
            result.add(new CampoInvalido("nome", "Já cadastrado!"));
        }

        return result;
    }
}
