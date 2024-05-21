package web.request;

import lombok.Data;

@Data
public class TransactionRequest {

        private String username;
        private String creancierCode;
        private double montant;

}
