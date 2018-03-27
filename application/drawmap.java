package application;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class drawmap {
	ArrayList<String> cityname1 = new ArrayList<String>();
	ArrayList<String> country1 = new ArrayList<String>();
	ArrayList<String> rank1 = new ArrayList<String>();
	ArrayList<String> population1 = new ArrayList<String>();
	ArrayList<String> area1 = new ArrayList<String>();
	ArrayList<String> density1 = new ArrayList<String>();
	ArrayList<String> x1 = new ArrayList<String>();
	ArrayList<String> y1 = new ArrayList<String>();
	// city1
	ArrayList<String> cityname2 = new ArrayList<String>();
	ArrayList<String> country2 = new ArrayList<String>();
	ArrayList<String> rank2 = new ArrayList<String>();
	ArrayList<String> population2 = new ArrayList<String>();
	ArrayList<String> area2 = new ArrayList<String>();
	ArrayList<String> density2 = new ArrayList<String>();
	ArrayList<String> x2 = new ArrayList<String>();
	ArrayList<String> y2 = new ArrayList<String>();
	// city2
	ArrayList<String> RouteNo = new ArrayList<String>();
	ArrayList<String> city1 = new ArrayList<String>();
	ArrayList<String> city2 = new ArrayList<String>();
	ArrayList<String> distance = new ArrayList<String>();
	ArrayList<String> cost = new ArrayList<String>();
	// route
	Circle circleR = new Circle();
	Circle circleG = new Circle();
	Circle circleB = new Circle();
	int radiusR = 10;
	int radiusG = 16;
	int radiusB = 8;
	// circle property
	Pane border = new Pane();
	//add circle
	Group groupCircle1 = new Group();
	Group groupCircle2 = new Group();

	public void run() {
		
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

				// // System.out.println("cityname " + eElement.getAttribute("city"));
				// System.out.println("cityname : " +
				// eElement.getElementsByTagName("cityname").item(0).getTextContent());
				// System.out.println("country : " +
				// eElement.getElementsByTagName("country").item(0).getTextContent());
				// System.out.println("rank : " +
				// eElement.getElementsByTagName("rank").item(0).getTextContent());
				// System.out.println(
				// "population : " +
				// eElement.getElementsByTagName("population").item(0).getTextContent());
				// System.out.println("area : " +
				// eElement.getElementsByTagName("area").item(0).getTextContent());
				// System.out.println("density : " +
				// eElement.getElementsByTagName("density").item(0).getTextContent());
				// System.out.println("x : " +
				// eElement.getElementsByTagName("x").item(0).getTextContent());
				// System.out.println("y : " +
				// eElement.getElementsByTagName("y").item(0).getTextContent());
				cityname1.add(eElement.getElementsByTagName("cityname").item(0).getTextContent());
				country1.add(eElement.getElementsByTagName("country").item(0).getTextContent());
				rank1.add(eElement.getElementsByTagName("rank").item(0).getTextContent());
				population1.add(eElement.getElementsByTagName("population").item(0).getTextContent());
				area1.add(eElement.getElementsByTagName("area").item(0).getTextContent());
				density1.add(eElement.getElementsByTagName("density").item(0).getTextContent());
				x1.add(eElement.getElementsByTagName("x").item(0).getTextContent());
				y1.add(eElement.getElementsByTagName("y").item(0).getTextContent());
				circleR.setCenterX(Integer.parseInt(eElement.getElementsByTagName("x").item(0).getTextContent()));
				circleR.setCenterY(Integer.parseInt(eElement.getElementsByTagName("y").item(0).getTextContent()));
				circleR.setRadius(radiusR);
				groupCircle1.getChildren().add(circleR);
			}
			for (int temp = 0; temp < city2List.getLength(); temp++) {

				Node nNode = city2List.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				// citylist

				Element eElement = (Element) nNode;

				// System.out.println("cityname " + eElement.getAttribute("city"));
				// System.out.println("cityname : " +
				// eElement.getElementsByTagName("cityname").item(0).getTextContent());
				// System.out.println("country : " +
				// eElement.getElementsByTagName("country").item(0).getTextContent());
				// System.out.println("rank : " +
				// eElement.getElementsByTagName("rank").item(0).getTextContent());
				// System.out.println(
				// "population : " +
				// eElement.getElementsByTagName("population").item(0).getTextContent());
				// System.out.println("area : " +
				// eElement.getElementsByTagName("area").item(0).getTextContent());
				// System.out.println("density : " +
				// eElement.getElementsByTagName("density").item(0).getTextContent());
				// System.out.println("x : " +
				// eElement.getElementsByTagName("x").item(0).getTextContent());
				// System.out.println("y : " +
				// eElement.getElementsByTagName("y").item(0).getTextContent());
				cityname2.add(eElement.getElementsByTagName("cityname").item(0).getTextContent());
				country2.add(eElement.getElementsByTagName("country").item(0).getTextContent());
				rank2.add(eElement.getElementsByTagName("rank").item(0).getTextContent());
				population2.add(eElement.getElementsByTagName("population").item(0).getTextContent());
				area2.add(eElement.getElementsByTagName("area").item(0).getTextContent());
				density2.add(eElement.getElementsByTagName("density").item(0).getTextContent());
				x2.add(eElement.getElementsByTagName("x").item(0).getTextContent());
				y2.add(eElement.getElementsByTagName("y").item(0).getTextContent());
				circleR.setCenterX(Integer.parseInt(eElement.getElementsByTagName("x").item(0).getTextContent()));
				circleR.setCenterY(Integer.parseInt(eElement.getElementsByTagName("y").item(0).getTextContent()));
				circleR.setRadius(radiusR);
				groupCircle2.getChildren().add(circleR);
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
				RouteNo.add(eElement.getElementsByTagName("RouteNo").item(0).getTextContent());
				city1.add(eElement.getElementsByTagName("city1").item(0).getTextContent());
				city2.add(eElement.getElementsByTagName("city2").item(0).getTextContent());
				distance.add(eElement.getElementsByTagName("distance").item(0).getTextContent());
				cost.add(eElement.getElementsByTagName("cost").item(0).getTextContent());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	

	}

	
}
