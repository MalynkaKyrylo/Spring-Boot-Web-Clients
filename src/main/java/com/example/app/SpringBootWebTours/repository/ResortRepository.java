package com.example.app.SpringBootWebTours.repository;

import com.example.app.SpringBootWebTours.entity.Resort;
import com.example.app.SpringBootWebTours.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class ResortRepository {

    private static final Logger LOGGER =
            Logger.getLogger(ResortRepository.class.getName());

    List<Resort> list;

    public List<Resort> getResorts() throws IOException {

        File jsonFile = new ClassPathResource(Constants.URL_FILES +
                Constants.FILE_RESORTS).getFile();
        String path = jsonFile.getAbsolutePath();

        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            list = gson.fromJson(reader,
                    new TypeToken<List<Resort>>() {}.getType());
            reader.close();
            return list.stream()
                    .map(tour -> new Resort(tour.getId(),
                            Constants.URL_IMAGES + tour.getImg(),
                            tour.getDescr()))
                    .toList();
        } catch (Exception ex) {
            LOGGER.info("ResortRepository msg: " + ex.getMessage());
            // Якщо помилка, повертаємо порожню колекцію
            return Collections.emptyList();
        }
    }
}
