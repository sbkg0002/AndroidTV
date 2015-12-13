package com.zao.androidtvapptutorial;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.List;

public class HTTPXMLTest
{
    public static void main(String[] args)
    {
        try {
            List<Video> videos = new HTTPXMLTest().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void start() throws Exception
    {
        List<Video> videoList = new List<Video>();
        URL url = new URL("http://www.gamekings.nl/iCache/Videos.xml");
        URLConnection connection = url.openConnection();

        Document doc = parseXML(connection.getInputStream());
        NodeList descNodes = doc.getElementsByTagName("video");

        for (int temp = 0; temp < descNodes.getLength(); temp++) {

                Node nNode = descNodes.item(temp);

        //        System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                        Element eElement = (Element) nNode;

                        System.out.println("Video id : " + eElement.getAttribute("id"));
                        System.out.println("thumbnail : " + eElement.getElementsByTagName("thumbnail").item(0).getTextContent());
                        System.out.println("Video MP4: " + eElement.getElementsByTagName("file").item(0).getTextContent());
                        System.out.println("category: " + eElement.getElementsByTagName("category").item(0).getTextContent());
                        
                        Video video = new Video();
                        video.id = eElement.getAttribute("id");
                        video.thumbnail = eElement.getElementsByTagName("thumbnail").item(0).getTextContent();
                        video.filePath = eElement.getElementsByTagName("file").item(0).getTextContent();
                        
                        videoList.Add(video);
                }

        }
        
        return videoList;
    }

    private Document parseXML(InputStream stream)
    throws Exception
    {
        DocumentBuilderFactory objDocumentBuilderFactory = null;
        DocumentBuilder objDocumentBuilder = null;
        Document doc = null;
        try
        {
            objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();

            doc = objDocumentBuilder.parse(stream);
        }
        catch(Exception ex)
        {
            throw ex;
        }

        return doc;
    }
}

