package com.xml;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.*;

public class Test3 {

	public static void main(String[] args) {
		
		try {

			//Dom Document 객체를 생성하기위해 팩토리 생성
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			
			Document xmlDoc = null;
			
			String url = "coment.xml";
			//String url = "http://www.naver.com/book.xml"
			
			if(url.indexOf("http://")!=-1){
				
				URL u = new URL(url);
				InputStream is = u.openStream();
				
				xmlDoc = parser.parse(is);
				
				
			}else{
				
				xmlDoc = parser.parse(url);
				
			}
			
			String str = "";
			String out="";
			//root
			//Element : xml 문서의 요소를 표현하기위해 사용
			Element root = xmlDoc.getDocumentElement();
			
			//코멘트 갯수
			Node total = root.getElementsByTagName("total").item(0);
			str = total.getFirstChild().getNodeValue();
			System.out.println("코맨트갯수:"+str);
			
			NodeList items = root.getElementsByTagName("comment");
			for(int i =0; i<items.getLength();i++){
				
				Node node = items.item(i);
				
				NodeList nodeList = node.getChildNodes();
				NamedNodeMap map = node.getAttributes();
				out = map.getNamedItem("num").getNodeValue();
				
				for(int j =0; j<nodeList.getLength();j++){
					
					Node e = nodeList.item(j);
					if(e.getNodeType() == Node.ELEMENT_NODE){
						
						str = e.getChildNodes().item(0).getNodeValue();
						out += "" +str;
					}
					
				}
				System.out.println(out);
				
			}
			
			
			System.out.println(out);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}


















