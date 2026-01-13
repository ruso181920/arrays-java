
public class TrappingRainwater {
    public static int trappedWater(int height[]){
        int n=height.length;
        // calculate left boundary
        int leftBound[]=new int[n];
         leftBound[0]=height[0];
        for(int i=1;i<n;i++) {
            leftBound[i]=Math.max(height[i],leftBound[i-1]);
        }
        // calculate right boundary
        int rightBound[]=new int[n];
         rightBound[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--) {
            rightBound[i]=Math.max(rightBound[i+1],height[i]);
        }
        //calculating water level
        int width=1; 
        int storedWater=0;
        for(int i=0;i<n;i++) {
        int  waterLevel=Math.min(leftBound[i],rightBound[i]);
           storedWater+=(waterLevel-height[i])*width;
        }
         return storedWater;
    }
    public static void main(String args[]) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Stored Water is :"+trappedWater(height) +" units");
    }

}
