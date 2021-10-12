import java.util.Random;


public class random {
    public static void main (String[] args){
        int numero, i, j;
        int [] mega = new int[6];
        Random r = new Random();

         for (i=0; i<mega.length; i++){
             numero = r.nextInt(60) +1;

             for (j=0; j<mega.length; j++){
                 if (numero == mega[j] && j!= i ) {
                     numero = r.nextInt(60)+1;

                 }
             numero = r.nextInt(60)+1;
            }
             {
            mega [i] = numero;
            }
             //ordenação de numeros

             for (i=0; i<mega.length; i++){
                 for (j=i+1; j<mega.length;j++){
                     numero = mega[i];
                     mega[i]= mega [j];
                     mega[j]=numero;
                 }

             }


        }
         for(i=0; i< mega.length; i++){
             System.out.print(mega[i]+ " ");
         }

    }

}