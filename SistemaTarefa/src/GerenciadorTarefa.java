import java.util.ArrayList;

public class GerenciadorTarefa {

    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public static void cadastrarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }


}
