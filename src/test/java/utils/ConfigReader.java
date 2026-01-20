package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try {
            InputStream input = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar config.properties");
        }
    }

    public static String get(String chave) {
        return properties.getProperty(chave);
    }
}
