
package maingetset;

class sepakbola {
    String namapemain;
    public String skill;
    public String kakiterkuat;
    protected String klub;
    private int nomorpunggung;
    
    
    //setter
    public void setnomorpunggung(int x){
        this.nomorpunggung = x;
    }
    //getter
    public int getnomorpunggung()
    {
        return this.nomorpunggung;
    }

}            
    
public class MainGetSet {

   
    public static void main(String[] args) {
        sepakbola menball = new sepakbola ();
        menball.namapemain = "Harry Maguire";
        menball.skill = "Blunder atau Melakukan Kesalahan";
        menball.kakiterkuat = "Kanan";
        menball.klub = "Manchester United";
        menball.setnomorpunggung(5);
        
        //menampikan data
        System.out.println(" Nama Pemain     : "+menball.namapemain);
        System.out.println(" Kaki Terkuat    : "+menball.kakiterkuat);
        System.out.println(" Klub            : "+menball.klub);
        System.out.println(" Nomor Punggung  : "+menball.getnomorpunggung());
        System.out.println(" Skill           : "+menball.skill);
        
        sepakbola menball2 = new sepakbola ();
        menball.namapemain = "Neymar";
        menball.skill = "Rabona";
        menball.kakiterkuat = "Kanan";
        menball.klub = "Paris Saint Germain";
        menball.setnomorpunggung(10);
        
        //menampikan data
        System.out.println();
        System.out.println(" Nama Pemain     : "+menball.namapemain);
        System.out.println(" Kaki Terkuat    : "+menball.kakiterkuat);
        System.out.println(" Klub            : "+menball.klub);
        System.out.println(" Nomor Punggung  : "+menball.getnomorpunggung());
        System.out.println(" Skill           : "+menball.skill);
     
        
        
    }
    
 }
