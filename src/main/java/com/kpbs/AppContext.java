package com.kpbs;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.UUID;

public class AppContext implements ServletContextListener {
	static ServletContext context;

	private final String PROPS_FILE_PATH = "/WEB-INF/application.properties";

	public static final Logger Log = Logger.getLogger(AppContext.class);
	private static Calendar cal = Calendar.getInstance();

	private static Properties props = null;



	private void initParams() {
		try {
			props = new Properties();
			props.load(context
					.getResourceAsStream(PROPS_FILE_PATH));
			
		} catch (Exception e) {
			Log.error("Settings problem");
		}
	}

	public static URL getContextResourceByPropertyName(String propertyName) throws MalformedURLException {

		String propertyValue = getProperty (propertyName);
		return context.getResource(propertyValue);
	}
	public static URL getContextResource(String resource) throws MalformedURLException {
		return context.getResource(resource);
    }

    public static String getFilePath (String innerPath) {
		return context.getContextPath() + "/" + innerPath;
	}

	public static String getProperty(String propertyName) {
	    if (props != null)
            return props.getProperty(propertyName);
	    Log.error("Unknown property requested: " + propertyName);
	    throw new IllegalArgumentException("No such property: " + propertyName);
    }

	public static String saveToFile(String path, Object document) {
		try {
			JAXBContext context = JAXBContext.newInstance(document.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.TRUE);
			StringWriter sw = new StringWriter();
			JAXBElement jx = new JAXBElement(new QName(document.getClass()
					.getSimpleName()), document.getClass(), document);
			marshaller.marshal(jx, sw);
			String xmlString = sw.toString();

			SimpleDateFormat fileDateFormat = new SimpleDateFormat(
					"yyyyMMdd_HH_mm_ss_SSS");
			
			String xmlFileName = document.getClass().getSimpleName() + "_"
					+ fileDateFormat.format(cal.getTime()) + "_"
					+ UUID.randomUUID().toString() + ".xml";
			
			String xmlName = path + xmlFileName;

			Log.info("Saving xml: " + xmlName);

			try {
				OutputStream out = new FileOutputStream(new File(xmlName));
				IOUtils.write(xmlString, out, Charset.forName("UTF-8"));
				out.close();
				return xmlFileName;
			} catch (FileNotFoundException e) {
				Log.error("Can't save file: " + xmlName, e);
			} catch (IOException e) {
				Log.error("Can't save file: " + xmlName, e);
			}
		} catch (Exception e) {
			Log.error(e);
		}
		return null;
	}

	private static void moveFile(String from, String to, String name) {
		try {
			File src = new File (from + name);
			File dst = new File (to + name);
			org.apache.commons.io.FileUtils.moveFile(src, dst);
		} catch (Exception e) {
			Log.error("Can't move file '" + name + "' from '" 
					+ from + "' to '" + to + "'");
		}
	}
	public void contextInitialized(ServletContextEvent contextEvent) {

		context = contextEvent.getServletContext();
		initParams();
		Log.info("Context created");

	}

	public void contextDestroyed(ServletContextEvent contextEvent) {
		Log.info("Context Destroyed");
	}
}