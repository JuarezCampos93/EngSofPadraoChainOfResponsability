public class Atendente extends Usuario {
    public Atendente(Usuario usuario){
        listaDeRespostas.add(RespostaAtendente.getRespostaAtendente());
        setUsuario(usuario);
    }

    public String getPapel(){
        return "Atendente";
    }
}
