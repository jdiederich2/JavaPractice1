package jendiederich.OverloadingExample;

public class PaintJob {
	
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        
        if(width <= 0 || height <= 0|| areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        
        double area = calculateArea(width, height);
        double dBucketsNeeded = Math.ceil((double)(area / areaPerBucket - extraBuckets));
        System.out.println((int)dBucketsNeeded);
        return ((int)dBucketsNeeded);
    }
    
    
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0|| areaPerBucket <= 0) {
            return -1;
        }
        
        double area = calculateArea(width, height);
        double dBucketsNeeded = Math.ceil(((double)(area / areaPerBucket)));
        System.out.println((int)dBucketsNeeded);
        return ((int)dBucketsNeeded);
    }
    
    
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        
        double dBucketsNeeded = Math.ceil(((double)(area / areaPerBucket)));
        System.out.println((int)dBucketsNeeded);
        return ((int)dBucketsNeeded);
    }
    
    public static double calculateArea(double width, double height) {
        double area = width * height;
        return area;
    }
}
