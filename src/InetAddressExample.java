import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) throws Exception {
        InetAddress local = InetAddress.getLocalHost();

        System.out.println("Local Host: " + local);
        System.out.println("Local HostAddress: " + local.getHostAddress());
        System.out.println("Local HostName: " + local.getHostName());
        System.out.println("loca isAnyLocalAddress(): " + local.isAnyLocalAddress());

        byte[] address = local.getAddress();
        for (int i = 0; i < address.length; i++) {
            System.out.print(address[i] + " ");
        }
        System.out.println();

        InetAddress google = InetAddress.getByName("www.google.com");
        System.out.println("GOOGLE IP: " + google);

        InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
        for (InetAddress addr : addresses) {
            System.out.println("GOOGLE Address: " + addr);
        }
    }
}

