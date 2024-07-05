public class first {

    public static void main(String[] args) {
    int[] number;
    number= new int[10];
    int sum=0;
    
    number[0]=1;
    number[1]=2;
    number[2]=3;
    number[3]=4;
    number[4]=5;
    number[5]=6;
    number[6]=7;
    number[7]=8;
    number[8]=9;
    number[9]=10;
    for (int i = number[0]; i <=number[9]; i++) {
       
        sum +=i;
        
    }
    System.out.println(sum);

    int len =number.length;
    System.out.println("Array length:"+len);

    

    }
}