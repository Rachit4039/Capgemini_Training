public class CircularTour {

    static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0, curr_petrol = 0, total_petrol = 0;

        for (int i = 0; i < n; i++) {
            int net = petrol[i] - distance[i];
            curr_petrol += net;
            total_petrol += net;

            if (curr_petrol < 0) {
                start = i + 1;
                curr_petrol = 0;
            }
        }

        return (total_petrol >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPump(petrol, distance);
        if (start != -1)
            System.out.println("Start at pump " + start);
        else
            System.out.println("Not possible");
    }
}
