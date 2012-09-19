/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.repartie;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Cyril
 */
public class SVGWriter {
	private String header;
	private String body;
	private String footer;
	private String fileName;
	
	/**
	 * Constructor
	 * @param filename File to write
	 */
	public SVGWriter(String filename){
		this.fileName = filename;
		this.header = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>" +
			"<svg xmlns=\"http://www.w3.org/2000/svg\" height=\"500\" width=\"500\">" +
				"<defs>" +
					"<marker id=\"Triangle\" viewBox=\"0 0 40 40\" refX=\"16\" refY=\"16\"" +
						"markerWidth=\"10\" markerHeight=\"10\" orient=\"auto\">" +
						"<path d=\"M 0 0 L 16 16 L 0 32 L 40 16 Z\" />" +
					"</marker>" +
				"</defs>";
		this.footer = "</svg>";
	}
	
	/**
	 * Append data to body
	 * @param data data to append
	 */
	private void appendToBody(String data){
		this.body += "\n" + data + "\n";
	}
	
	/**
	 * Write the SVG file or throw IOException
	 */
	public void close() throws IOException {
		FileWriter fw = new FileWriter(fileName);
		fw.write(header);
		fw.write(body);
		fw.write(footer);
		fw.close();
	}
	
	/**
	 * Draw arrow to canvas
	 * @param x1 Start position (x)
	 * @param y1 Start position (y)
	 * @param x2 End position (x)
	 * @param y2 End position (y)
	 * @param couleur Color
	 */
	public void tracerFleche(int x1 , int y1 , int x2 , int y2 , String couleur){
		this.appendToBody("<path d=\"M " + x1 + " " + y1 + " L " + x2 + " " + y2 + "\" style=\"fill:none;stroke:" + couleur + "; stroke-width:2; marker-end:url(#Triangle)\" />");
	}
	
	/**
	 * Write text to canvas
	 * @param x pos X
	 * @param y pos Y
	 * @param texte Text to write
	 * @param couleur Color
	 */
	public void ecrireText(int x, int y, String texte , String couleur){
		this.appendToBody("<text x=\"" + x + "\" y=\"" + y +"\"></text>");
	}
	
	/**
	 * Draw process
	 * @param num PID
	 * @param nom Name
	 */
	public void dessinerProcessus(int num , String nom){
		// TODO: Implement code
	}
	
	/**
	 * Draw red rectangle for critical section of process
	 * @param num
	 * @param dateDeb
	 * @param dateFin 
	 */
	public void dessinerSC (int num, int dateDeb, int dateFin){
		// TODO: Implement code
		// TODO: Implement code
	}

	/**
	 * Red arrow for REQUEST message
	 * @param numDep Start process number
	 * @param numArr Finish process number
	 * @param dateDeb Date 1
	 * @param dateFin Date 2
	 */
	public void dessinerREQ (int numDep, int numArr, int dateDeb, int dateFin){
		
	}
}
