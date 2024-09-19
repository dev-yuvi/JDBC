package BusRes;

public class Bus {
    private int BusNo;
    private boolean Ac;
    private int Capacity;
    public  Bus(int BusNo,boolean Ac,int Capacity)
    {
        this.BusNo=BusNo;
        this.Ac=Ac;
        this.Capacity=Capacity;
    }
    public int getBusNo()
    {
        return BusNo;
    }
    public  void setBusNo(int busNo)
    {
        BusNo=busNo;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public boolean getAc() {
        return Ac;
    }

    public void setAc(boolean ac) {
        Ac = ac;
    }

    public  void displayinfo()
    {
        System.out.println("BusNo:"+BusNo+" "+"AC:"+Ac+" "+"Capacity:"+Capacity);
    }

}
