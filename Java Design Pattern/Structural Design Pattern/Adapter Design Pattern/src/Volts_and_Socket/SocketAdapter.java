package Volts_and_Socket;

public class SocketAdapter extends Socket
{
    public Volts get120Volts()
    {
        return getVolt();
    }

    public Volts get12Volts()
    {
        Volts v = getVolt();
        return convertVolts(v,10);
    }

    public Volts convertVolts(Volts v, int i)
    {
        return new Volts(v.getVolts()/i);
    }

}
