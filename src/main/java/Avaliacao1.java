/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */

import utfpr.ct.dainf.if62c.avaliacao.Complexo;

public class Avaliacao1 {

    public static void main(String[] args) {
        // implementar main
    }
    
    public static Complexo []raizesEquacao(Complexo a, Complexo b, Complexo c){
           Complexo[]d = new Complexo[2];

           d[0] = ((b.prod(b)).soma(c.prod(a.prod(4))));
           d[1] = ((b.prod(b)).soma(c.prod(a.prod(4))));
           
           d[0] = d[0].sqrt();
           d[1] = d[1].sqrt();
           return d;
    }
    
}
