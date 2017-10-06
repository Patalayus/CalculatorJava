public class validation {
    private int hour;
    private int minute;
    private int second;

    public void validate(int h, int w, int c){
        hour = h+2;
        minute = w+4;
        second = c+5;
    }
    public String val_2(){
        return  String.format("%02d:%02d:%02d",hour, minute, second);
    }
}
