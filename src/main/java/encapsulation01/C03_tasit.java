package encapsulation01;

public class C03_tasit {

    private String tasitTuru;
    private boolean muayenesiVarmi;
    private String vitesTuru;
    private int kacVites;
    static int counter=1000;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public  int getCounter() {
        return counter;
    }

    public void setCounter() {
        counter=counter;
        counter++;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;

    }

    public boolean isMuayenesiVarmi() {
        return muayenesiVarmi;
    }

    public void setMuayenesiVarmi(boolean muayenesiVarmi) {
        this.muayenesiVarmi = muayenesiVarmi;
    }

    public String getVitesTuru() {
        return vitesTuru;
    }

    public void setVitesTuru(String vitesTuru) {
        this.vitesTuru = vitesTuru;
    }

    public int getKacVites() {
        return kacVites;
    }

    public void setKacVites(int kacVites) {
        this.kacVites = kacVites;
    }

    @Override
    public String toString() {
        return "C03_tasit{" +
                "tasitTuru='" + tasitTuru + '\'' +
                ", muayenesiVarmi=" + muayenesiVarmi +
                ", vitesTuru='" + vitesTuru + '\'' +
                ", kacVites=" + kacVites +
                ", counter=" + counter +
                '}';
    }
}
