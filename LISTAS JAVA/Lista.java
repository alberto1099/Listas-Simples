public class Lista {
 
    Nodo cab;
   
    Lista(){
        cab=null;
    }



    public boolean isVacia(){
        return (cab==null);
    }



    public void  Insertar(Nodo nuevo){
        if(isVacia()){
            cab=nuevo;
        } else{
            
        nuevo.sig=cab;
        cab=nuevo;
        }
        
    }




    public void InsertarCola(Nodo nuevo) {
        if (!isVacia()) {
            Nodo tmp = cab;
            while (tmp.sig != null) {
                tmp = tmp.sig;

            }
            tmp.sig = nuevo;
        } else {
            cab = nuevo;
        }
    }




     public void InsertarCol(Nodo nuevo) {
        if (isVacia()) {
            cab = nuevo;
            
        } else {
            Nodo tmp = cab;
            while (tmp.sig != null) {
                tmp = tmp.sig;

            }
            tmp.sig = nuevo;
        }
    }



     
    public  String mostrar(){
        return "cab->" + mostrar(cab);
    }
     
     public String mostrar( Nodo tmp){
         if (tmp == null){
             return "->null";
         }else{
             return tmp.info+"->"+mostrar(tmp.sig);
         }
     }


     public int longitud(){
        int tam=0;
        Nodo tmp=cab;
        while(tmp!=null){
            tam++;
            tmp=tmp.sig;
        }
        return tam;
    }
    


     public boolean eliminarCabeza(){        
        cab=cab.sig;
        return true;
    }

    public boolean eliminar(int pos){
        
        if(!isVacia() && pos<longitud()){
            if(pos==0){
                return eliminarCabeza();
            }
            Nodo tmp=cab;
            for(int i=1;i<pos;i++){
                tmp=tmp.sig;
            }            
            tmp.sig=tmp.sig.sig;
            return true;
        }
        return false;
    }

       public String Mostrar() {
        String mostrar = "Cab->";
        Nodo tmp = cab;
        while (tmp != null) {
            mostrar += tmp.info + " -> ";
            tmp = tmp.sig;
        }
        return mostrar + "null";
    }
    
    
}
