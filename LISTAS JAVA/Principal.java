public class Principal {

  
     
    public static void main(String[] args) {
        
    System.out.println("hola");
        Lista x = new Lista();
        x.Insertar(new Nodo(5));
        x.Insertar(new Nodo(1));
        x.Insertar(new Nodo(3));
        x.Insertar(new Nodo(0));
        
        
        System.out.println( x.Mostrar());
        x.eliminar(1);
        System.out.println( x.Mostrar());
        x.eliminarCabeza();
        System.out.println( x.Mostrar());
       
        
             //  System.out.println("el A "+ A);
        
       /* for (int j = 0; j < 51; j++) {
           B.insertar(new Nodo(A.atender()));
           
        }
        for (int i = 0; i < 50; i++) {
            C.insertar(new Nodo(A.atender()));
        }
        for (int i = 0; i < 20; i++) {
            B.atender();
        }
        for (int i = 0; i < 10; i++) {
            C.atender();
        }
//        for (int i = 0; i < 101; i++) {
//             A.insertar(new Nodo(i))*/
//        }
 
       // System.out.println("EL b "+B);
        //System.out.println("el C "+C);
    }
    
}

