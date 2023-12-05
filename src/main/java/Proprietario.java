public class Proprietario extends Usuario {
    public Proprietario(Usuario usuario){
        listaDeRespostas.add(RespostaDono.getRespostaDono());
        setUsuario(usuario);
    }

    public String getPapel(){
        return "Proprietario";
    }
}
