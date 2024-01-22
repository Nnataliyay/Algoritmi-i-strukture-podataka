
package dvostrukalista;


public class NasaDvostrukaLista { 
    
    Node head; 
    Node tail; 
    int length; 
    
    boolean isValidIndex(int index){
        return index > 0 && index <= length;
    } 
    
    boolean isEmpty(){
        return length == 0;
    } 
    
    int getLength(){
        return length;
    } 
    
    public void show() {
        Node node = head;
 
        while (node != null) {
            System.out.print(node.data + " ->");
            node = node.next;
 
        }
        System.out.println(" null");
 
    }
    
    public void showFromBack () {
        Node node = tail; 
        
        if(tail == null) 
            return; 
        
        while(node != null){
            System.out.print(node.data + " ->"); 
            node = node.previous; 
        } 
        System.out.println(" null");
    
    } 
    
    public void dodajNaKraj(int data){
    
        Node node = new Node(data); 
        
        if(isEmpty()) 
            head = node; 
        
        else  
            tail.next = node; 
        node.previous = tail; 
        tail = node; 
        length++;
    } 
    
    public void dodajNaPocetak(int data){
        Node node = new Node(data); 
        
        node.next = head; 
        node.previous = null; 
        
        if(head != null){
            head.previous = node;
        
        } 
        head = node;
    
    } 
    
    public Node ukloniPoslednji() {
        
        if(isEmpty()) {
            System.out.println("Lista je prazna");
        } 
        
        Node node = tail; 
        
        if(head == tail) {
            head = null;
        }else {
            tail.previous.next = null;
        
        } 
        
        tail = tail.previous; 
        node.previous =null; 
        length--; 
        return tail;
                
    
    } 
    
    public Node ukloniPrvi(){
        if(isEmpty()) 
            System.out.println("Lista je prazna"); 
        
        Node node = head; 
        
        if(head == tail){
            tail = null;
        }else{
            head.next.previous = null;
        
        } 
        
        head = head.next; 
        node.next = null; 
        length--; 
        return head;
    
    }
    
    public void dodajNaPoziciju(int data, int poz){
        
        Node newNode = new Node(data); 
        newNode.data = data; 
        newNode.next = null; 
        newNode.previous = null; 
        
        if(poz < 1){
            System.out.println("Pozicija mora da bude >= 1");
    
        }else if(poz == 1) {
            newNode.next = head; 
            head.previous = newNode; 
            head = newNode; 
            length++;
        }else {
            Node temp = new Node(data); 
            temp = head; 
            
            for(int i = 1; i < poz - 1; i++){
                if(temp != null){
                    temp = temp.next;
                }
            
            } 
            
            if(temp != null){
                newNode.next = temp.next; 
                newNode.previous = temp; 
                temp.next = newNode; 
                if(newNode.next != null){
                    newNode.next.previous = newNode;
                }
            
            }
        
        
        }
    } 
    
    public Node ukloniSaPozicije(int poz) { // Proverite
        
        Node temp = head;
        if(poz == 1){ 
            ukloniPrvi();
        }else if (poz == length - 1){
            ukloniPoslednji();
        }else {
            for(int i = 1; i < poz - 1 && head.next != null; i++){
                temp = temp.next;
            
            } 
            
            temp.previous.next = temp.next; 
            temp.next.previous = temp.previous; 
            length--;
                    
        
        } 
        
        return temp;
    } 
    
    void ukloniSve(){
    
        Node temp = new Node(); 
        
        while(head != null){
            temp = head; 
            head = head.next; 
            temp = null;
        
        } 
        
        System.out.println("Uspesno ste uklonili sve cvorove");
    }
    
    
    
}

