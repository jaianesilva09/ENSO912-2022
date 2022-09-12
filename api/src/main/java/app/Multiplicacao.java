package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/multiplicacao/{op}/{od}")
public class Multiplicacao {
    
    @GET
    public double calcula(@PathParam("op") String opStr, @PathParam("od") String odStr) {
        try {
            double op = Double.parseDouble(opStr);
            double od = Double.parseDouble(odStr);

            return op * od;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}
