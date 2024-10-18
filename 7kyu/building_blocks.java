public class Block{
    // Good Luck!
    private int[] array = new int[3];

    public Block(int[] array){
        this.array = array;
    }

    public int getWidth(){
        return array[0];
    }

    public  int getLength(){
        return array[1];
    }

    public  int getHeight(){
        return array[2];
    }

    public  int getVolume(){
        return array[0]*array[1]*array[2];
    }

    public  int getSurfaceArea(){
        return 2*(array[0]*array[1])+2*(array[1]*array[2])+2*(array[2]*array[0]);
    }
}
