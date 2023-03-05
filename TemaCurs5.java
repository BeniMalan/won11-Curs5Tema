import java.util.Random;
public class TemaCurs5{
	public static void main(String[] args){
	int x=900;
	int maxDon=10;
	int target=100;
	int array[]={10,20,30,40,50,1000,19,27,13};
	System.out.println("Suma elementelor este "+sumaElementelor(array));
	System.out.println("Numarul elementelor impare este "+numarElementeImpare(array));
	System.out.println("Elementele/Elementul mai mari/mare ca si X sunt/este "+numereMaiMariCaVarX(array,x));
	DonatieRandom(target);
	DonatieRandom2(target,maxDon);
	String fraza ="Ma numesc.Malan Beniamin.Florin";
	MaiMulteFraze(fraza);
	
}
	
	public static int sumaElementelor(int array[]){
		int s=0;
		for(int numar:array){
			s=s+numar;
		}
		return s;
	}
	public static int numarElementeImpare(int[]array){
		int nr=0;
		for(int numar:array){
			if(numar%2!=0){
			nr++;
		  }
		}
		return nr;
	}
	public static int numereMaiMariCaVarX(int array[],int x){
		for(int numar:array){
			if(numar>x){
				return numar;
     		}
	  }
	  return -1;
  } 
  public static void DonatieRandom(int target){
    int donatie;
    Random r=new Random();
    while(target > 0 && target<=100){
        donatie=r.nextInt(10)+1;
            target += donatie;
            System.out.println("Donatie: " + donatie + ". Suma totala: " + target);
         if(target>=100){
            System.out.println("Succes! Suma dorita a fost atinsa.");
            break;
          }
       }
    }

public static void DonatieRandom2(int target, int maxDon) {
    int suma = 0;
    Random rand = new Random();
    int numarDonatii = 0;
    
    while (suma < target && numarDonatii < maxDon) {
        int donatie = rand.nextInt(10) + 1;
        suma += donatie;
        numarDonatii++;
        System.out.println("Donatie: " + donatie + ". Suma totala: " + suma);
    }
    
    if (suma >= target) {
        System.out.println("Succes! Suma dorita a fost atinsa.");
    } else {
        System.out.println("Campania s-a incheiat cu suma stransa de " + suma + " dolari");
    }
  }
  public static void MaiMulteFraze(String fraza) {
    String nouaFraza=fraza.replace(".","\n");
    System.out.println(nouaFraza);
    }
}






