
package filemain;

public class Video extends File{
    private String video_coding_formats;
    private String codecs;

    public Video(String name, String size, String extension,String video_coding_formats, String codecs) {
        super(name, size, extension);
        this.video_coding_formats = video_coding_formats;
        this.codecs = codecs;
    }

    @Override
    public String toString() {
        return "\nVideo File"+super.toString()+"\nVideo_Coding_Formats=" + video_coding_formats + "\nCodecs=" + codecs ;
    }

    public String getVideo_Coding_Formats() {
        return video_coding_formats;
    }

    public void setVideo_Coding_Formats(String video_coding_formats) {
        this.video_coding_formats = video_coding_formats;
    }

    public String getCodecs() {
        return codecs;
    }

    public void setCodecs(String codecs) {
        this.codecs = codecs;
    }

   
    
       
}
