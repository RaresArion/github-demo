public class Tests {
    public static void main(String[] args) {

        String str = "Cosul are mere";
        String[] arr = str.split(" ");
        System.out.println(str);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                System.out.print(arr[i].toUpperCase().charAt(0) + arr[i].substring(1) + " ");
            } else if (i == 0) {
                System.out.print(arr[i].toLowerCase());
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
