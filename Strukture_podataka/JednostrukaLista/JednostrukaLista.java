package dan07jednostrukeliste;

public class JednostrukaLista {

    Node head;
    //Node tail; 

    public void show() {

        Node node = head;
        while (node.next != null) {
            System.out.print(" " + node.data);
            node = node.next;

        }
        System.out.println(" " + node.data);

    }

    public int brojCvorova() {
        Node temp = head;
        int brojac = 0;

        while (temp != null) {
            temp = temp.next;
            brojac++;
        }
        return brojac;

    }

    public void insert_na_kraj(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insert_na_pocetak(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;

    }

    public void delete_na_kraju() {

        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {

                Node temp = new Node();
                while (temp.next.next != null) {
                    temp = temp.next;
                }

                Node poslednji = temp.next;
                temp.next = null;
                poslednji = null;
            }
        }
    }

    public void delete_head() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            temp = null;
        }

    }

    public void insert_na_poziciju(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insert_na_pocetak(data);
        } else {
            Node n = head;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;

            }

            node.next = n.next;
            n.next = node;

        }

    }

    public void deelete_na_poziciji(int index) {

        if (index == 0) {
            delete_head();
        } else {

            Node n = head;
            Node n2 = null;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            } 
            
            n2 = n.next; 
            n.next = n2.next; 
            System.out.println("izbrisali smo cvor sa vrednoscu " + n2.data); 
            n2 = null;
        }

    }

}

