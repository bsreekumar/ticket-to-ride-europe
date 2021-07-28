package main;

import java.io.IOException;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.stream.file.FileSource;
import org.graphstream.stream.file.FileSourceFactory;
import org.graphstream.ui.view.Viewer;

public class RouteMap {
	
	protected boolean loop = true;
	
	private Graph routeMap;
	private Viewer viewer;
	private FileSource fileSource;
	
	
	public RouteMap() {
		super();
		
		System.setProperty("org.graphstream.ui", "swing");
		routeMap = new MultiGraph("Ticket to Ride - Europe");
		routeMap.setAttribute("ui.stylesheet", "url(src/main/style.css)");
		routeMap.setAttribute("ui.quality");
		routeMap.setAttribute("ui.antialias");
		viewer = routeMap.display();
		viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
		
		loadEuropeMap();
		
		//TODO - MOVE THIS TO THE DSG FILE
		addCityNameAsNodeLabel();
		setColorOfRoutes();
	}
	
	private void addCityNameAsNodeLabel() {
		routeMap.nodes().forEach(n -> {
			n.setAttribute("ui.label", n.getId());
		});
	}
	
	private void setColorOfRoutes() {
		routeMap.edges().forEach(e -> {
			e.setAttribute("ui.style", "fill-color: " + e.getAttribute("color") + ";");
		});
	}
	
	private void loadEuropeMap() {
		try {
			fileSource = FileSourceFactory.sourceFor("src/main/ticket-to-ride-europe-map-creator.dsg");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		fileSource.addSink(routeMap);

		try {
			fileSource.readAll("src/main/ticket-to-ride-europe-map-creator.dsg");
		} catch( IOException e) {
			
		} finally {
			fileSource.removeSink(routeMap);
		}
	}

}
