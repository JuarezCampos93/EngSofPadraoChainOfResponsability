public class RespostaDono implements TipoResposta {

    private static RespostaDono respostaDono = new RespostaDono();

    private RespostaDono() {
    }

    public static RespostaDono getDetratorResposta() {
        return respostaDono;
    }
}
