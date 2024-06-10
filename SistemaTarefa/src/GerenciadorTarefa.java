import java.util.ArrayList;

public class GerenciadorTarefa {

    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public static void cadastrarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    public static void buscarTarefa (String titulo) throws Exception{

        for (Tarefa tempTarefa : listaTarefas) {
            if (tempTarefa.getTitulo().contains(titulo)) {
                System.out.println(tempTarefa);
            }
        }

        throw new Exception("Não foi possível encontrar a tarefa com o título " + titulo);
    }
}
