package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/divisao/{op}/{od}")
public class Divisao {
    
    @GET
    public double calcula(@PathParam("op") String opStr, @PathParam("od") String odStr ) {
        try {
            double op = Double.parseDouble(opStr);
            double od = Double.parseDouble(odStr);
            
            if (od == 0){
                throw new BadRequestException("O segundo numero nao pode ser 0!");    
            }
            return op / od;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}
