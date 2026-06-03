public class Main {

    static int rangeSum(int arr[], int l, int r) {
        int sum = 0;

        for (int i = l; i <= r; i++)
            sum += arr[i];

        return sum;
    }

    public static void main(String[] args) {

        int vaccinations[] = {5, 3, 7, 2, 6};

        System.out.println(
                "Vaccination Count: "
                        + rangeSum(vaccinations, 1, 3));
    }
}
