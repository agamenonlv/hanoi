public class TorreHanoi {
    private int discos;

    public TorreHanoi()
    {
    }
    public TorreHanoi(int discos)
    {
        setDiscos(discos);
    }

    public void setDiscos(int discos) {
        if (discos < 1)
        {
            this.discos = 1;
        }
        else
        {
            this.discos = discos;
        }
    }
    public int getDiscos() {
        return discos;
    }

    public int resolverTorreHanoi()
    {
        return (int) (Math.pow(2, getDiscos()) - 1);
    }
}
