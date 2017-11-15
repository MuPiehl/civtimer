package de.mpi.civ.service;

import de.mpi.civ.exception.TemplateNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by MPi on 14.11.2017.
 */
@Component
public class TemplateLoader {
    final static Logger log = LoggerFactory.getLogger(TemplateLoader.class);

    public byte[] loadTemplate(String templateName) throws TemplateNotFoundException, IOException {

        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("java.io.tmpdir") + templateName);

            return IOUtils.toByteArray(fileInputStream);
        } catch (FileNotFoundException fnfE) {
            log.info("loadTemplate: FileNotFoundException gefangen -- weiter suchen nach " + templateName);

            InputStream inputStream = this.getClass().getResourceAsStream("/" + templateName);
            if (inputStream == null)
                throw new TemplateNotFoundException(templateName + " NICHT im Resource Path nicht gefunden");

            log.debug("MPi was here {}", templateName);

            return IOUtils.toByteArray(inputStream);
        }
    }
}
