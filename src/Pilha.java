public class Pilha {
    private No topo; // Referência para o topo da pilha

    // Construtor para criar uma nova pilha vazia
    public Pilha() {
        this.topo = null;
    }

    // Método para verificar se a pilha está vazia
    public boolean estaVazia() {
        return topo == null;
    }

    // Método para adicionar um elemento no topo da pilha (push)
    public void push(int valor) {
        No novoNo = new No(valor); // Cria um novo nó com o valor fornecido
        novoNo.proximo = topo; // Define o próximo do novo nó como o atual topo da pilha
        topo = novoNo; // Atualiza o topo para o novo nó
    }

    // Método para remover e retornar o elemento no topo da pilha (pop)
    public int pop() {
        if (estaVazia()) {
            System.out.println("Erro: a pilha está vazia.");
            return -1;
        }
        int valorRemovido = topo.dado; // Salva o valor do topo atual da pilha
        topo = topo.proximo; // Atualiza o topo para o próximo nó
        return valorRemovido; // Retorna o valor removido
    }

    // Método para retornar o elemento no topo da pilha sem removê-lo
    public int top() {
        if (estaVazia()) {
            System.out.println("Erro: a pilha está vazia.");
            return -1;
        }
        return topo.dado; // Retorna o valor do topo atual da pilha
    }

    // Método para destruir a pilha (liberar todos os nós)
    public void destroy() {
        topo = null; // Define o topo como null, fazendo com que todos os nós se tornem inacessíveis e sejam eventualmente coletados pelo coletor de lixo
    }

    // Classe interna para representar os nós da pilha
    private class No {
        int dado; // Valor armazenado no nó
        No proximo; // Referência para o próximo nó na pilha

        // Construtor para criar um novo nó com o valor fornecido
        public No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(); // Criando uma nova pilha
        pilha.push(10); // Adicionando elementos na pilha
        pilha.push(20);
        pilha.push(30);
        System.out.println("Topo da pilha: " + pilha.top()); // Obtendo o elemento no topo da pilha
        System.out.println("Removendo topo da pilha: " + pilha.pop()); // Removendo e obtendo o elemento no topo da pilha
        System.out.println("Topo da pilha após remoção: " + pilha.top()); // Obtendo o novo elemento no topo da pilha após a remoção
        pilha.destroy(); // Destruindo a pilha
        System.out.println("A pilha foi destruída."); // Verificando se a pilha foi destruída
    }
}
