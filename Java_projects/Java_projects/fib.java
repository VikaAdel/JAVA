//Фибоначчи 
package Java_projects;

public class fib {
    public static int fibb(int position) {
        if (position == 1 || position == 2) {
            return 1;
        }
        return fibb(position - 1) + fibb(position - 2);
    }
}
