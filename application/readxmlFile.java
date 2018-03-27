package application;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class readxmlFile {

	public  static void start() {

		try {

			File cite1file = new File("D:/datafiles/Cities1.xml");
			File cite2file = new File("D:/datafiles/Cities2.xml");
			File routefile = new File("D:/datafiles/Routes.xml");
			// 3 files
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document city1doc = dBuilder.parse(cite1file);
			Document city2doc = dBuilder.parse(cite2file);
			Document routedoc = dBuilder.parse(routefile);

			city1doc.getDocumentElement().normalize();
			city2doc.getDocumentElement().normalize();
			routedoc.getDocumentElement().normalize();

			System.out.println("Root element :" + city1doc.getDocumentElement().getNodeName());
			System.out.println("Root element :" + city2doc.getDocumentElement().getNodeName());
			System.out.println("Root element :" + routedoc.getDocumentElement().getNodeName());

			NodeList city1List = city1doc.getElementsByTagName("city");
			NodeList city2List = city2doc.getElementsByTagName("city");
			NodeList routeList = routedoc.getElementsByTagName("route");

			System.out.println("----------------------------");

			for (int temp = 0; temp < city1List.getLength(); temp++) {

				Node nNode = city1List.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				// citylist

				Element eElement = (Element) nNode;

				// System.out.println("cityname " + eElement.getAttribute("city"));
				System.out.println("cityname : " + eElement.getElementsByTagName("cityname").item(0).getTextContent());
				System.out.println("country : " + eElement.getElementsByTagName("country").item(0).getTextContent());
				System.out.println("rank : " + eElement.getElementsByTagName("rank").item(0).getTextContent());
				System.out.println(
						"population : " + eElement.getElementsByTagName("population").item(0).getTextContent());
				System.out.println("area : " + eElement.getElementsByTagName("area").item(0).getTextContent());
				System.out.println("density : " + eElement.getElementsByTagName("density").item(0).getTextContent());
				System.out.println("x : " + eElement.getElementsByTagName("x").item(0).getTextContent());
				System.out.println("y : " + eElement.getElementsByTagName("y").item(0).getTextContent());
				

			}
			for (int temp = 0; temp < city2List.getLength(); temp++) {

				Node nNode = city2List.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				// citylist

				Element eElement = (Element) nNode;

				// System.out.println("cityname " + eElement.getAttribute("city"));
				System.out.println("cityname : " + eElement.getElementsByTagName("cityname").item(0).getTextContent());
				System.out.println("country : " + eElement.getElementsByTagName("country").item(0).getTextContent());
				System.out.println("rank : " + eElement.getElementsByTagName("rank").item(0).getTextContent());
				System.out.println(
						"population : " + eElement.getElementsByTagName("population").item(0).getTextContent());
				System.out.println("area : " + eElement.getElementsByTagName("area").item(0).getTextContent());
				System.out.println("density : " + eElement.getElementsByTagName("density").item(0).getTextContent());
				System.out.println("x : " + eElement.getElementsByTagName("x").item(0).getTextContent());
				System.out.println("y : " + eElement.getElementsByTagName("y").item(0).getTextContent());

			}
			for (int temp = 0; temp < routeList.getLength(); temp++) {

				Node nNode = routeList.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				// citylist

				Element eElement = (Element) nNode;

				// System.out.println("cityname " + eElement.getAttribute("city"));
				System.out.println("RouteNo : " + eElement.getElementsByTagName("RouteNo").item(0).getTextContent());
				System.out.println("city1 : " + eElement.getElementsByTagName("city1").item(0).getTextContent());
				System.out.println("city2 : " + eElement.getElementsByTagName("city2").item(0).getTextContent());
				System.out.println("distance : " + eElement.getElementsByTagName("distance").item(0).getTextContent());
				System.out.println("cost : " + eElement.getElementsByTagName("cost").item(0).getTextContent());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		readxmlFile read=new readxmlFile();
		
		read.start();
    }
	

}