package org.example;
import java.io.InputStream;
import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting data integration pipeline...");

        InputStream xmlStream = Main.class.getClassLoader().getResourceAsStream("input.xml");
        InputStream xsltStream = Main.class.getClassLoader().getResourceAsStream("transform.xslt");

        if (xmlStream == null || xsltStream == null) {
            System.err.println("Error: input.xml or transform.xslt not found in resources!");
            return;
        }

        try {
            // 2. Setting up the XSLT transformer
            TransformerFactory factory = TransformerFactory.newInstance();
            Source xslt = new StreamSource(xsltStream);
            Transformer transformer = factory.newTransformer(xslt);

            Source xmlInput = new StreamSource(xmlStream);
            StringWriter writer = new StringWriter();
            transformer.transform(xmlInput, new StreamResult(writer));

            System.out.println("\n--- Transformed XML Output (Ready for X-Archive) ---");
            System.out.println(writer.toString());

        } catch (Exception e) {
            System.err.println("Error setting up transformer: " + e.getMessage());
        }

    }
}

