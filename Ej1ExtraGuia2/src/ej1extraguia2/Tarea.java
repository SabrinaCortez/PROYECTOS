
package ej1extraguia2;


public class Tarea implements Comparable<Tarea>{
    private int codigo;
    private String descripcion;
    private boolean completo;

    public Tarea(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        
        completo=false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

    

    @Override
    public int compareTo(Tarea m) {
         if(codigo == m.codigo){
         return 0;
     }else if(codigo>m.codigo){
         return 1;
     }else{
         return -1;
     }
    }

   
    
    
}
