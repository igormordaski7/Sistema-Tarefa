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

    public static void editarTarefa (String titulo, String newTitulo, String newDescricao, int newDataVenc, String newStatus) throws Exception{

        for (Tarefa tempTarefa : listaTarefas) {
            if (tempTarefa.getTitulo().contains(titulo)) {
                newTitulo = Console.lerString("Novo titulo");
                newDescricao = Console.lerString("Nova Descrição");
                newDataVenc = Console.lerInt("Nova data vencimento");
                newStatus = Console.lerString("Novo status");
            }
        }

        throw new Exception("Não foi possível encontrar a tarefa com o titulo " + titulo);
    }
}
