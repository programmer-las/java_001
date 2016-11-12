public class zavd31 {
public static void main(String[] args) {    
    int counter = 0;    
    int counter_neg = 0;
    //	в масиві цілі чила
    int[] array; 
    //	ініціалізація масиву з 20 елементів
    array = new int[20]; 
    //генерування масиву
for (int i = 0; i <array.length ; i++) { 
	array[i]=( (int)(Math.random()*30) - 15 ); 
	System.out.print(array[i]+"  ");
	}
System.out.println("");
//перевірка кожного елементу
//зміна значень лічильників
for (int i = 0; i < array.length; i++) {
    if (array[i] > 0) {
        counter ++;
    } else if (array[i] < 0) {  
        counter_neg ++;
    }	
	}
System.out.println("Кількість додатніх елементів массиву = "+counter);
System.out.println("Кількість відємних елементів массиву = "+counter_neg);
//вивід розвязку
System.out.println("Добуток додатніх і відємних елементів массиву = "+counter*counter_neg);
}
}