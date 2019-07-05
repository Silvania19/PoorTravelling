
package poortravelling;

import org.json.JSONException;
import org.json.JSONObject;

public class Lugar {
    
   private String pais;
   private String ciudad;
   private String localidad;

   public  Lugar()
   {
       setPais("");
       setCiudad("");
       setLocalidad("");
       
   }
    public Lugar(String pais, String ciudad, String localidad) {
        setPais(pais);
        setCiudad(ciudad);
        setLocalidad(localidad);
    }
    

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

   public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public boolean equals(Object obj) {
       boolean retorno=false;
      if (obj !=null && obj instanceof Lugar)
      {
          Lugar lugar1=(Lugar)obj;
          if(pais.equals(lugar1.getPais())&&ciudad.equals(lugar1.getCiudad())&&localidad.equals(lugar1.getLocalidad()))
          {
              retorno =true;
          }
          else{
              retorno =false;
          }
      }
      else
      {
          retorno=false;
      }
      return retorno;
    }

    @Override
    public String toString() {
        return  "\n  Pais: "+pais+"\n  Ciudad: "+ciudad+"\n  Localidad:  "+localidad;
    }
    public JSONObject getFormatoJsonLugar()throws  JSONException
    {
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("pais", pais);
        jsonObject.put("ciudad", ciudad);
        jsonObject.put("localidad", localidad);
        
        return jsonObject;
    }
    
   
}
