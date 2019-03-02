package Volts_and_Socket;

public class Main
{
    public static void main(String[] args)
    {
        SocketAdapter socketAdapter = new SocketAdapter();
        Volts volts = socketAdapter.get12Volts();

        System.out.println(volts.getVolts());
    }
}
