import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;


public class Food {
    public static void main(String[] args) throws IOException {

        Document d = Jsoup.connect("http://findfood.ru/product").get();
       // System.out.println(d);
        Elements v = d.select("div.view");

        for (Element i: v) {
            System.out.println(new String(i.select("a").text().getBytes("UTF-8"),"windows-1251"));
        }

        for (int i = 2; i <= 10; i++) {
            Document d2 = Jsoup.connect("http://findfood.ru/product/index?Product_page=" + i).get();
            // System.out.println(d);
            Elements v2 = d2.select("div.view");

            for (Element j : v2
            ) {
                System.out.println("Done");
                System.out.println(new String(j.select("a").text().getBytes("UTF-8"), "windows-1251"));
            }
        }
    }

}
