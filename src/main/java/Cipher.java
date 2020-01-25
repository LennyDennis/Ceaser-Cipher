public class Cipher {
    private String mText;
    private int mKey;
    public Cipher(String text,int key){
        this.mText=text;
        this.mKey = key;
    }
    public int getKey(){
        return this.mKey;

    }
    public String getText(){
        return this.mText;
    }
    public String encryptText(){
        return null;
    }

}
