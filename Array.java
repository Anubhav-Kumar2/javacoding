
// import java.util.Scanner;
// public class Array {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int n =sc.nextInt();
//             int a[];
//             a = new int[n];
//            for(int i=0; i<a.length; i++){
//                 a[i] = sc.nextInt();
//             }
//             for(int i=0; i<a.length; i++){
//                 System.out.print(a[i] + " ");
//             }
//             sc.close();
//         }
// }

//Print All Negative Elements In An Array:
// import java.util.Scanner;
// public class ArraysInJava {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int n =sc.nextInt();
//             int arr[];
//             arr = new int[n];
//             System.out.println("Enter elements in an array: ");
//            for(int i=0; i<arr.length; i++){
//                 arr[i] = sc.nextInt();
//             }
//             for(int i=0; i<arr.length; i++){
//                 if(arr[i]<0){
//                     System.out.println(arr[i] + " ");
//                 }
//                 sc.close();
//             }
//         }
//     }


//Find the sum of all array elements
// import java.util.Scanner;
// public class ArraysInJava {
//         public static void main(String[] args) {
//             int sum=0;
//             Scanner sc = new Scanner(System.in);
//             int n =sc.nextInt();
//             int arr[];
//             arr = new int[n];
//             System.out.println("Enter elements in an array: ");
//            for(int i=0; i<arr.length; i++){
//                 arr[i] = sc.nextInt();
//             }
//             System.out.println("Array Elements: ");
//             for(int i=0; i<arr.length; i++){
//                     System.out.println(arr[i]+" ");
//                     sum = arr[i]+ sum;
//             }
//             System.out.println("Addition of Array Elements: " + sum);
//         }
//     }


//Find maximum and minimum element in an array:
// import java.util.Scanner;
// public class ArraysInJava {
//             public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int n =sc.nextInt();
//                 int arr[];
//                 arr = new int[n];
//                 System.out.println("Enter elements in an array: ");
//                for(int i=0; i<arr.length; i++){
//                     arr[i] = sc.nextInt();
//                 }
//                 System.out.println("Array Elements: ");
//                 int max = arr[0];
//                 int min = arr[0];
//                 for(int i=0; i<arr.length; i++){
//                     if (max < arr[i]){
//                         max = arr[i];
//                     }
//                     if (min > arr[i]){
//                         min = arr[i];
//                     }
//                 }
//                 System.out.println("Maximum element is : " + max);
//                 System.out.println("Minimum element is : " + min);
//                 sc.close();
//             }
//         }/* */


//Count total number of even and odd elements in an array:
// import java.util.Scanner;
// public class ArraysInJava {
//             public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int n =sc.nextInt();
//                 int arr[];
//                 arr = new int[n];
//                 System.out.println("Enter "+ n + " elements in an array: ");
//                for(int i=0; i<arr.length; i++){
//                     arr[i] = sc.nextInt();
//                 }
//                 for(int i=0; i<arr.length; i++){
//                     if (arr[i]%2==0){
//                         System.out.println(arr[i] + " is even.");
//                     }
//                     else{ 
//                         System.out.println(arr[i]+ " is odd.");
//                     }
//                     sc.close();
//                 }
//                 }
//             }


//Count total number of negative elements in an array:
// import java.util.*;
// public class ArraysInJava {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("n = ");
//         int n =sc.nextInt();
//         System.out.print("Enter " + n + " elements in an array: ");
//         int arr[];
//         arr = new int[n];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         int index = 0;
//         int negativeCount = 0;
//         while (index < arr.length) {
//             if (arr[index] < 0) {
//                 negativeCount++;
//             }
//             index++;
//         }
//          System.out.println("Total negative elements: " + negativeCount);
//          sc.close();
//     }
// }


//Copy all elements from one array to another array:
// public class ArraysInJava{
//     public static void main(String[] args) {
        
//         int arr1[] = new int[] {4,8,9,6,7};
//         int arr2[] = new int[arr1.length];
//         for(int i=0; i<arr1.length; i++){
//             arr2[i] = arr1[i];
//         }
//         System.out.println("Elements Of Original Array: ");
//         for(int i=0; i<arr1.length; i++){
//             System.out.println(arr1[i]+ " ");
//         }
//         System.out.println();
//         System.out.println("Elements of New Array: ");
//         for(int i=0; i<arr1.length;i++){
//             System.out.println(arr1[i]+" ");
//         }
//     }
// }


// //Insert an element in an array:
// import java.util.*;
// public class ArraysInJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n+1];
//         for (int i=0;i<n;i++){
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter the elements you want to insert: ");
//         int c = sc.nextInt();
//         System.out.println("Enter position: ");
//         int pos = sc.nextInt();
//         for(int i=n; i>=pos; i--){
//             a[i] = a[i-1];
//         }
//         a[pos-1] = c;
//         for (int i=0;i<=n;i++){
//             System.out.print(" " + a[i]);
//         sc.close();
//     }
//     }
// }


//Delete an element from an array:
// import java.util.*;
// public class ArraysInJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         System.out.println("Enter elements of Original Array: ");
//         for(int i=0; i<n; i++){
//             a[i] = sc.nextInt();
//         }
//         System.out.println();
//         System.out.println("Enter the position of element you want to delete: ");
//         int pos = sc.nextInt();
//         for(int i=pos; i<n-1; i++){
//             a[i] = a[i+1];
//         }
//         n--;
//         for(int i=0; i<n; i++){
//         System.out.print(a[i] + " ");
//         sc.close();
//     }
// }
// }
