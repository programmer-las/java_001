public class zavd32 {
public static void main(String[] args) {    
	int max = 0;
	int min = 0;
	int pos_max=0;
	int pos_min = 0;
	int sum_min_between_max;
	int c;
    int sum = 0;
    //	в масиві цілі чила
    int[] array; 
    //	ініціалізація масиву з 20 елементів
    array = new int[20]; 
    //генерування масиву

for (int i = 0; i <array.length ; i++) { 
	array[i]=( (int)(Math.random()*30) - 15 );	
	}

//виводимо на екран отриманий масив
System.out.print("Весь масив: ");
for(int  i = 0; i < array.length; i++) {
	  System.out.print(array[i] + "  ");
	}
//відділяємо порожнім рядком
System.out.println("");
//перевідка кожного елементу
//зміна значень лічильників
for (int i = 0; i < array.length; i++) {
    if (array[i] < min) {
        min = array[i];
        pos_min = i;
    } else if (array[i] > max) {  
    	max = array[i];
    	pos_max = i;
    }	
	}

if (pos_min > pos_max) {
	c = pos_min;
	pos_min = pos_max;
	pos_max = c;
}

System.out.println("Позиція Мінімального значення елементу массиву  "+pos_min);
System.out.println("Позиція Максимального значення елементу массиву = "+pos_max);

System.out.println("Мінімальне значення елементу массиву  "+min);
System.out.println("Максимальне значення елементу массиву = "+max);
//вивід розвязку
//виводимо на екран отриманий масив
System.out.print("Mасив (між додатнім і відємним елементами): ");
for(int  i = pos_min; i < pos_max + 1; i++) {
	sum = sum + array[i];
	System.out.print(array[i] + "  ");
	}
System.out.println("");
System.out.println("Сума результуючого массиву = "+sum);
}
}