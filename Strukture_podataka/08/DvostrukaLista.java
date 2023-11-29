package com.mycompany.spa_vezbe_8_1;

/**
 *
 * @author NATALIJA
 */
public class DvostrukaLista {
    
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
    
    public void show(){
        Node node = head;
        
        if(head == null){
            return;
        }
        while(node != null){
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println(" null ");
    }
    
    public void showFromBack(){
        Node node = tail;
        
        if(tail == null){
            return;
        }
        while(node != null){
            System.out.print(" " + node.data);
            node = node.previous;
        }
        System.out.println(" null ");
    }   
    
    public void dodajNaKraj(int data){
        
        Node node = new Node(data);
        
        //ako je prazno cvor koji dodajemo svakako mora biti head
        if(isEmpty()){
            head = node;
        //ako nije prazno, stavljamo novi cvor kao sledeci za stari poslednji cvor,
        //time ga kacimo na kraj
        } else {
            tail.next = node;
        }
        node.previous = tail;
        //nas novi cvor postaje novi poslednji tj tail cvor
        //ovaj sto je bio tail je postao normalan cvor, treba se gledati samo 
        //kao podatak a ne kao poseban tip cvora
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
        length++;

    }
    
    public Node ukloniPoslednji(){
        
        if(isEmpty()){
            System.out.println("Lista je prazna");
        }
        
        Node node = tail;
        
        if(head == tail){
            head = null;
        } else {
            tail.previous.next = null;
        }
        
        tail = tail.previous;
        node.previous = null;
        length--;
        return tail;
    }
    
    public Node ukloniPrvi(){
        
        if(isEmpty()){
            System.out.println("Lista je prazna");
        }
        
        Node node = head;
        
        if(head == tail){
            head = null;
        } else {
            head.next.previous = null;
        }
        
        head = head.next;
        node.next = null;
        length--;
        return head;
    }
    
    public void dodajNaPoziciju(int poz,int data){
        
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = null;
        newNode.previous = null;
        
        if( poz < 1){
            System.out.println("Pozicija mora biti veca ili jednaka 1 !!!"); 
        }else if(poz == 1){
            dodajNaPocetak(data);
        }else{
            Node temp = new Node(data);
            temp = head;
            
            for(int i= 1; i < poz - 1; i++){
                if(temp != null){
                    temp = temp.next;
                }
            }
            
            if( temp != null){
                newNode.next = temp.next;
                newNode.previous = temp;
                temp.next = newNode;
                if(newNode.next != null){
                    newNode.next.previous = newNode;
                }
            }
        }  
    }

    public Node ukloniSaPozicije(int poz){
            
        Node temp = head;
            
        if(poz == 1){
            ukloniPrvi();
        } else if (poz == length - 1){
            ukloniPoslednji();
        } else {
            for(int i = 1; i < poz && head.next != null; i++){
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
        
        System.out.println("Uspesno ste obrisali sve cvorove");
    }
}
