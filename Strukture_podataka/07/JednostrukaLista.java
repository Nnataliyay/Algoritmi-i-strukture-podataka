package com.mycompany.spa_vezbe_7_1;

/**
 *
 * @author NATALIJA
 */
public class JednostrukaLista {
    
    //prvi cvor liste
    Node head;
    
    //prolazi kroz listu i ispisuje sve njene cvorove
    public void show(){
        
        Node node = head;
        while(node.next != null){
            System.out.print(" " + node.data);
        }
        
        System.out.println(" " + node.data);
    }
    
    //prolazi kroz listu i broji njene cvorove, pa vraca broj
    public int brojCvorova(){
        
        Node temp = head;
        int brojac = 0;
        
        while(temp != null){
            temp = temp.next;
            brojac++;
        }
        
        return brojac;
    }
    
    public void insert_na_kraj(int data){
        
        //definisemo novi cvor sa podatkom iz argumenta funkcije
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        //proveravamo da li lista ima cvorove, ako nema ni jedan,
        //cvor koji dodajemo postaje head
        if(head == null){
            head = node;
        //ukoliko lista vec ima barem jedan cvor, prolazimo kroz listu i trazimo
        //poslednji clan. poslednji clan je onaj koji nema sledeci cvor
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            //poslednjem clanu dodajemo nas novi cvor kao sledeci, 
            //stavljajuci novi cvor na poslednje mesto na listi
            n.next = node;
        }
    }
    
    public void insert_na_pocetak(int data){
        
        //definisemo novi cvor sa podatkom iz argumenta funkcije
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        node.next = head;
        head = node;
    }
    
    public void delete_na_kraju(){
        
        //proveravamo da li uopste ima cvorova
        if(head != null){
            //proveravamo da li postoji samo 1 cvor
            if(head.next == null){
                head = null;
            //ako ima 2 cvora ili vise
            }else{
                
                Node temp = new Node();
                
                //trazimo predposlednji cvor
                while(temp.next.next != null){
                    //uzimamo taj predposlednji cvor kao temp
                    temp = temp.next;
                }
                
                Node poslednji = temp.next;
                //"odvezujemo" novi(temp) i stari poslednji cvor
                temp.next = null;
                //brisemo vrednost starog poslednjeg cvora
                poslednji = null;
            }
        }
    }
    
    public void delete_head(){
        
        //proveravamo da li uopste ima cvorova
        if(head != null){
            Node temp = head;
            //menjamo stari head narednim cvorom u listi
            head = head.next;
            //brisemo vrednosst starog heada
            temp = null;
        }
    }
    
    public void insert_na_poziciju(int index, int data){
        
        //definisemo novi cvor sa podatkom iz argumenta funkcije
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        //proveravamo da li korisnik zeli da doda zapravo novi head(cvor na poziciji 0)
        if(index == 0 ){
            insert_na_pocetak(data);
        } else {
            Node n = head;
            
            //dolazimo do pozicije pred onu na koju zelimo da dodamo cvor
            for(int i = 0; i < index -1; i++){
                n = n.next;
            }
            
            //stavljamo da je slececi cvor naseg novog cvora koji dodajemo onaj 
            //koji je bio sledeci cvoru pre naseg novog(umecemo nas izmedju i 
            //vezujemo ga sa desne strane)
            node.next = n.next;
            //cvoru pre naseg dodeljujemo nas novi kao sledeci u nizu(da ga 
            //vezemo sada i sa leve strane)
            n.next = node;
        }
    }
    
    public void delete_na_poziciji(int index, int data){
        if(index ==0 ){
            delete_head();
        } else {
            Node n = head;
            Node n2 = null;
            
            for(int i = 0; i < index - 1; i++){
            n = n.next;
            }
            
            n2 = n.next;
            n.next = n2.next;
            System.out.println("Izbrisali smo cvor sa vrednoscu" + n2.data);
            n2 = null;
        }
        
        
    }
    
    
    
    
}
