
package poortravelling;

public class Main {

    
    public static void main(String[] args) {
      
       Persona sil=new Persona("sil", "ortega", "jsjjsjs", 566789, "tuculo");
       Persona flor =new Persona("FLOR", "JUAREZ" ," HAHGAGDG" ,354375 ,"DGHSJDJHSAJH");
       Comentario come=new Comentario();
        come= sil.comentar(" morite");
       flor.agregarComentario(come);
       
        System.out.println("per1"+flor.listarComentarios());
        
    }
    
}
