public class SimpleFun {

    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {

        int counter = 0;
        int height = 0;

        while( height<desiredHeight){
                height+=upSpeed;
                counter++;
                if( height<desiredHeight){
                    height-= downSpeed;
                }
        }
        return counter;
    }

}
