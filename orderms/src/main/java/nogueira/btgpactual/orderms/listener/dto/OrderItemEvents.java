package nogueira.btgpactual.orderms.listener.dto;

import java.math.BigDecimal;

public record OrderItemEvents(String produto, Integer quantidade, BigDecimal preco) {
}
