public class Kullanici {
    private String isim;
    private String soyisim;
    private  String email;

    public Kullanici(String isim,String alani,String email){
        this.isim=isim;
        this.soyisim=alani;
        this.email=email;
    }
    public Kullanici(){

    }
    //public void kullaniciEkleme(Kullanici k){
     //   Kullanici[] kullaniciler;
    //}


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAlani() {
        return soyisim;
    }

    public void setAlani(String soyisim) {
        this.soyisim = soyisim;
    }
    public String getEmail() {return email;    }

    public void setEmail(String email) { this.email = email;    }

}

