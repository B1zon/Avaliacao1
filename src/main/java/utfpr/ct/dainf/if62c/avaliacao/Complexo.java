package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Complexo {
    private double real;
    private double img;

    public Complexo() {
    }

    public Complexo(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal(){
        return real;
    }

    public double getImg(){
        return img;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }
    
    public Complexo sub(Complexo c){
        return new Complexo(real - c.real, img - c.img); 
    }

    public Complexo prod(double x){
        return new Complexo(real * x, img * x);
    }

    public Complexo prod(Complexo c){
        return new Complexo(real * c.real, img * c.img);
    }
    
    public Complexo div(Complexo c){
        return new Complexo(((real*c.real + img*c.img)/(((c.real)*(c.real))+((c.img)*(c.img)))),
                            ((c.real*img - real*c.img)/(((c.real)*(c.real))+((c.img)*(c.img)))));
    }
    
    public Complexo[] sqrt() {
           
           Complexo[]c = new Complexo[2];
           
           double r = Math.sqrt(real*real + img*img);
           double phi = Math.sqrt(r);
           double another = 0, num1, num2;
           
           if(real>0){
              another = Math.atan(img/real);    
           }
           if(real<0){
              another = Math.atan(img/real)+Math.PI;
           }
           if(real == 0 && img == 0){
               another = 0;
           }
           if(real == 0 && img > 0){
               another = (Math.PI)/2;
           }
           if(real == 0 && img < 0){
               another = (3*(Math.PI))/2;
           }
           
           num1 = another/2;
           num2 = (another/2)+Math.PI;
          
          c[0] = new Complexo(phi*Math.cos(num1),phi*Math.sin(num1));
          c[1] = new Complexo(phi*Math.cos(num2),phi*Math.sin(num2));
          
        return c;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
            && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
