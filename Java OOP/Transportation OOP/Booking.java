import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

public class Booking {
    /**
     * show output of booking.
     * @param path file to be read
     * @return arraylist of output transportation objects
     * @throws FileNotFound Exception invalid file
     * @throws InvalidBookingException invalid booking
     */
    public static ArrayList<Transportation> outputBookings(String path)
        throws FileNotFoundException, InvalidBookingException {
        ArrayList<Transportation> transport = new ArrayList<Transportation>();
        if (path == null || path.equals("")) {
            throw new FileNotFoundException();
        }
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String full = scan.nextLine();
                String[] division = full.split(",");
                if (division[0].equals("Flight")) {
                    String com = division[1];
                    int id = Integer.parseInt(division[2]);
                    String dd = division[3];
                    String dt = division[4];
                    String at = division[5];
                    int types = Integer.parseInt(division[6]);
                    Flight air = new Flight(com, id, dd, dt, at, types);
                    transport.add(air);
                } else if (division[0].equals("Bus")) {
                    String com = division[1];
                    int id = Integer.parseInt(division[2]);
                    String dd = division[3];
                    String dt = division[4];
                    String at = division[5];
                    int types = Integer.parseInt(division[6]);
                    Bus ground = new Bus(com, id, dd, dt, at, types);
                    transport.add(ground);
                } else {
                    throw new InvalidBookingException("Invalid Booking Type");
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe = new FileNotFoundException("File not valid");
            System.out.println(fnfe.getMessage());
        }
        return transport;
    }
    /**
     * write the booking.
     * @param path file to be read
     * @param trans the list of transportation
     * @return if write is sucessful.
     */
    public static boolean writeBookings(String path, ArrayList<Transportation> trans) {
        boolean write = false;
        PrintWriter writer2 = null;
        try {
            if (path.equals("") || path == null) {
                throw new FileNotFoundException();
            }
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            writer2 = new PrintWriter(file);
            for (int i = 0; i < outputBookings(path).size(); i++) {
                writer2.println(outputBookings(path).get(i).toString());
            }
            for (int i = 0; i < trans.size(); i++) {
                writer2.println(trans.get(i).toString());
            }
            write = true;
        } catch (FileNotFoundException ex) {
            ex = new FileNotFoundException("File not valid");
            System.out.println(ex.getMessage());
        }  catch (InvalidBookingException ibe) {
            ibe = new InvalidBookingException("Booking Invalid");
            System.out.println(ibe.getMessage());
        } finally {
            if (writer2 != null) {
                writer2.close();
            }
        }
        return write;
    }
    /**
     * read the booking and find transportation.
     * @param path file to be read.
     * @param trans the tansportation that will be searched.
     * @return the list of number of transportation objects.
     * @throws FileNotFound Exception invalid file
     * @throws InvalidBookingException invalid booking
     */
    public static ArrayList<Integer> readBookings(String path, Transportation trans)
        throws FileNotFoundException, InvalidBookingException {
        ArrayList<Integer> lines = new ArrayList<Integer>();
        boolean check = false;
        try {
            if (path.equals("") || path == null) {
                throw new FileNotFoundException();
            }
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            int i = 1;
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                if (trans.toString().equals(scan.next())) {
                    Integer num = new Integer(i);
                    lines.add(num);
                    check = true;
                }
                i++;
            }
            if (!check) {
                throw new InvalidBookingException();
            }
        } catch (FileNotFoundException fnfe) {
            fnfe = new FileNotFoundException("File not valid");
            System.out.println(fnfe.getMessage());
        } catch (InvalidBookingException ibe) {
            ibe = new InvalidBookingException();
            System.out.println(ibe.getMessage());
        }
        return lines;
    }
    /**
     * practicing booking.
     * @param args string argument array.
     */
    public static void main(String[] args) {
        try {
            Flight korean = new Flight("korean", 12345, "11-11-2021", "1200", "1400", 1);
            Flight asiana = new Flight("asiana", 54321, "12-13-2021", "1125", "1300", 2);
            Bus marta = new Bus("marta", 67890, "10-11-2021", "1045", "1300", 3);
            Bus stinger = new Bus("stinger", 19876, "03-04-2021", "1241", "1420", 4);
            ArrayList<Transportation> trans = new ArrayList<Transportation>();
            trans.add(korean);
            trans.add(asiana);
            trans.add(marta);
            trans.add(stinger);
            System.out.println(trans);
            System.out.println(writeBookings("./TestBooking.csv", trans));
            System.out.println(readBookings("./TestBooking.csv", stinger));
            for (int i = 0; i < outputBookings("./TestBooking.csv").size(); i++) {
                System.out.println(outputBookings("./TestBooking.csv").get(i).toString());
            }
            System.out.println("----------------------------------------");
            Flight air = new Flight("jin", 54331, "12-31-2022", "1225", "1400", 8);
            trans.add(air);
            writeBookings("./TestBooking.csv", trans);
            for (int i = 0; i < outputBookings("./TestBooking.csv").size(); i++) {
                System.out.println(outputBookings("./TestBooking.csv").get(i).toString());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe = new FileNotFoundException("File not valid");
            System.out.println(fnfe.getMessage());
        } catch (InvalidBookingException ibe) {
            ibe = new InvalidBookingException();
            System.out.println(ibe.getMessage());
        }
    }
}