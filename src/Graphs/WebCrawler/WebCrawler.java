package Graphs.WebCrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler
{
    private Queue<String> queue;
    private List<String> discoveredWebsiteList;

    public WebCrawler(){
        this.queue=new LinkedList<>();
        this.discoveredWebsiteList=new ArrayList<>();
    }
    public void discoverWeb(String root){
        this.queue.add(root);
        this.discoveredWebsiteList.add(root);

        while (!queue.isEmpty()){
            String v=this.queue.remove();
            String rawHTML=readURL(v);
            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern=Pattern.compile(regexp);
            Matcher matcher=pattern.matcher(rawHTML);
            while(matcher.find())
            {
                String actualurl=matcher.group();
                if(!this.discoveredWebsiteList.contains(actualurl)){
                    this.discoveredWebsiteList.add(actualurl);
                    System.out.println("discoverd url is"+actualurl);
                    this.queue.add(actualurl);
                }
            }
        }
    }

    private String readURL(String v)
    {
        String rawHtml="";
        try {
            URL url = new URL(v);
            BufferedReader in=new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine="";
            while ((inputLine=in.readLine())!=null)
            {
                rawHtml+=inputLine;
            }
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return rawHtml;
    }
}
