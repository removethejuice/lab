
package clase2;
 
import java.util.ArrayList;

public class aula {
    
    private int num;
    private Pizarra p1;
    private Pizarra p2;
    private Datashow d;
    public ArrayList <Sillas> sillas = new ArrayList();
     public aula (){
    
    }

    public aula(int num, Pizarra p1, Pizarra p2, Datashow d) {
        this.num = num;
        this.p1 = p1;
        this.p2 = p2;
        this.d = d;
    }
    
    
   

    public void setNum(int num) {
        this.num = num;
    }

    public void setP1(Pizarra p1) {
        this.p1 = p1;
    }

    public void setP2(Pizarra p2) {
        this.p2 = p2;
    }

    public void setD(Datashow d) {
        this.d = d;
    }

    public void setSillas(ArrayList<Sillas> sillas) {
        this.sillas = sillas;
    }

    public int getNum() {
        return num;
    }

    public Pizarra getP1() {
        return p1;
    }

    public Pizarra getP2() {
        return p2;
    }

    public Datashow getD() {
        return d;
    }

    public ArrayList<Sillas> getSillas() {
        return sillas;
    }

    @Override
    public String toString() {
        return "aula{" + "num=" + num + ", p1=" + p1 + ", p2=" + p2 + ", d=" + d + ", sillas=" + sillas + '}';
    }
    
    
    
}
