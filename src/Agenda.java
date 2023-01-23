public class Agenda {
    private Perfil[] agenda;

    public Agenda(){
        this.agenda=agenda;
    }
    public Perfil[] getAgenda(){
        return agenda;
    }

    public void setAgenda(Perfil[] agenda) {
        this.agenda = agenda;
    }
    public Perfil[] agregarPerfil(){

        System.out.println("Estos son los perfiles que contiene la agenda");
        for (int i=0; i< agenda.length;i++){
            System.out.println("Posicion " + i + "/" + agenda[i]);
        }
        return agenda;
    }
}
