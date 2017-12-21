import javax.imageio.ImageIO;

public class youngImageIO {
    public static void main(String[] args) {
        String [] readFormat = ImageIO.getReaderFormatNames();
        System.out.println("----Image可以读的所有图像文件格式----");
        for (String tmp:readFormat
             ) {
            System.out.println(tmp);

        }

        String[] writeFormat = ImageIO.getWriterFormatNames();
        System.out.println("----Image可以写的所有图像文件格式----");
        for (String tmp:writeFormat
             ) {
            System.out.println(tmp);
        }
    }
}
