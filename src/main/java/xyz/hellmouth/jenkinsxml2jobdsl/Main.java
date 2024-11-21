package xyz.hellmouth.jenkinsxml2jobdsl;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.xml.parsers.ParserConfigurationException;

import jakarta.xml.bind.JAXBException;

import org.xml.sax.SAXException;

public class Main {

    public static void main(final String[] args)
            throws MalformedURLException, ParserConfigurationException, SAXException, IOException, JAXBException {
        new CLI().parse(args);
    }

}
