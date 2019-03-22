
package filemain;

public class FileMain {

    public static void main(String[] args) {
        Video v1 = new Video("Award Ceremony Video 2018", "12GB", "mpeg","MPEG4", "3D codecs");
        Video v2 = new Video( "Html Tutorial", "4.5GB", "flv","Adobe Flash Platform", "2D codecs");
        
        Image img1 = new Image("Sheraton otel", "350MB", "jpeg","GrayScale", "Animations");
        Image img2 = new Image("Swiss otel", "562MB", "gif","Multi-Color", "Graphics");
        
        System.out.println(v1);
        System.out.println(v2);
        
        System.out.println(img1);
        System.out.println(img2);
        
        
    }
    
}
