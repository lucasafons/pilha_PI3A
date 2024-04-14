public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: a pilha está vazia.");
            return -1;
        }
        int valueRemoval = top.data;
        top = top.next;
        return valueRemoval;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Erro: a pilha está vazia.");
            return -1;
        }
        return top.data;
    }

    // Método para destruir a pilha (liberar todos os nós)
    public void destroy() {
        top = null;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Topo da pilha: " + stack.top());
        System.out.println("Removendo topo da pilha: " + stack.pop());
        System.out.println("Topo da pilha após remoção: " + stack.top());
        stack.destroy();
        System.out.println("A pilha foi destruída.");
        System.out.println("Verificando se está vazia: " + stack.top());
    }
}
