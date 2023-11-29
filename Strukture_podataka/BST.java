package dan11binarnostablopretrage;

public class BST {

    public Node root;

    public BST() {
        this.root = null;
    }

    /*
        krecemo od root, setujemo current = root  poredimo current.data sa id 
        ako je current.data vece od id to znaci da moramo da idemo levo  
        ako je current.data manje od id to znaci da moramo da idemo desno
        ako u nekom trenutku current.data jednako id, cvor je uspesno pronadjen 
        ako dodjemo do lista(leaf) a nemamo current.data == id to znaci da se 
        takav cvor ne nalazi u BST.
     */
    public boolean find(int id) {

        Node current = root;

        while (current != null) {
            if (current.data == id) {
                return true;
            } else if (current.data > id) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void insert(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;

            if (id < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }

            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    } 
    
    public void display(Node root){
        
        if(root != null){
            
            display(root.left); 
            System.out.println(" " + root.data); 
            display(root.right);    
        }
    } 
    
    
    public boolean delete(int id){
        
        Node parent = root; 
        Node current = root; 
        
        boolean isLeftChild = true; 
        
        while(current.data != id){
            parent = current; 
            
            if(current.data > id) {
                isLeftChild = true; 
                current = current.left;
            }else {
                isLeftChild = false; 
                current = current.right;
            } 
            
            if(current == null){
                return false;
            }
        
        }  
        
        if(current.left == null && current.right == null){//brisemo cvor bez dece tj list
            
            if(current == root){
                root = null;
            } 
            
            if(isLeftChild == true) {
                parent.left = null;
            }else {
                parent.right = null;
            } 
        }else if(current.right == null){//brisemo cvor koji ima samo levo dete
            if(current == root){
                root = current.left;
            } else if(isLeftChild){
                parent.left = current.left;
            }else {
                parent.right = current.left;
            }
        }else if(current.left == null){//brisemo cvor koji ima samo desno dete
            
            if(current == root){
                root = current.right;
            }else if(isLeftChild){
                parent.left = current.right;
            }else{
                parent.right = current.right;
            } 
        }else if(current.left != null && current.right != null){// briseo cvor sa oba deteta 
            
            Node successor = getSuccessor(current); 
            if(current == root){
                root = successor;
            }else if(isLeftChild){
                parent.left = successor;
            }else {
                parent.right = successor;
            } 
            successor.left = current.left;
            
        } 
        return true;
    } 
    
    
    public Node getSuccessor(Node deleteNode){ // Trazimo naslednika
      
        Node successor = null; 
        Node successorParent = null; 
        Node current = deleteNode.right; 
        
        while(current != null){
            successorParent = successor; 
            successor = current; 
            current = current.left;
        } 
        
        if(successor != deleteNode.right){
            successorParent.left = successor.right; 
            successor.right = deleteNode.right;
        } 
        return successor;
    }

}
