public class RespostaAtendente implements TipoResposta {

    private static RespostaAtendente respostaAtendente = new RespostaAtendente();

    private RespostaAtendente(){};

    public static RespostaAtendente getRespostaAtendente(){
        return respostaAtendente;
    }
}
