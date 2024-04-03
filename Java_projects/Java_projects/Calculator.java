package Java_projects;
// package Java_projects;

// public class Calculator {
//     public int calculate(char op, int a, int b) {
//       switch(op){
//         case '+':
//           return a+b;
//          case '-':
//           return a-b;
//          case '*':
//           return a*b;
//          case '/':
//           if (b == 0){
//             System.out.println("Деление на ноль");
//                     return 0;
//           }
//           return(int) ((double)a/b);
//         default:
//           return 0;
//           }
//       }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) { 
//         int a = 0;
//         char op = ' ';
//         int b = 0;

//         if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             a = 3;
//             op = '+';
//             b = 7;
//         } else {
//             a = Integer.parseInt(args[0]);
//             op = args[1].charAt(0);
//             b = Integer.parseInt(args[2]);
//         }
//         if (op != '+' && op != '-' && op != '*' && op!='/'){
//            System.out.println("Некорректный оператор: '" + op +"'");
//         }
      
//         Calculator calculator = new Calculator();
//     // else{
//         double result = calculator.calculate(op, a, b);
//         System.out.println(result);
//         }
//     }
