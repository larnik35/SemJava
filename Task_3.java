// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)



public class Task_3 {
    public static void main(String[] args) {
        
      	for ( int i=2; i<1000; i++)
    	{int k=0;
    		for (int j=2; j<=i; j++)
    		{
    			if ((i%j) == 0)
                k++;
    		}
            if (k<2)
    		System.out.println(i);
        }

    }

}
