import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List readFrom(String path) throws Exception {
        try (FileReader fileReader = new FileReader(path)) {
            Scanner in = new Scanner(fileReader);
            String[] header = in.nextLine().split(" ");
//            rows = Integer.valueOf(header[0]);
//            columns = Integer.valueOf(header[1]);
//            numberOfVehicles = Integer.valueOf(header[2]);
//            numberOfRides = Integer.valueOf(header[3]);
//            bonuses = Integer.valueOf(header[4]);
//            numberOfSteps = Integer.valueOf(header[5]);
//            int counter = 0;
//            while (in.hasNextLine()) {
//                String[] line = in.nextLine().split(" ");
//                Point start = new Point(Integer.valueOf(line[0]), Integer.valueOf(line[1]));
//                Point end = new Point(Integer.valueOf(line[2]), Integer.valueOf(line[3]));
//                int earliestStart = Integer.valueOf(line[4]);
//                int latestFinish = Integer.valueOf(line[5]);
//                Ride ride = new Ride(start, end, earliestStart, latestFinish);
//                ride.number = counter;
//                rides.add(ride);
//                counter++;
            } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
