package pairmatching.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import pairmatching.domain.Crew;
import pairmatching.exception.FileOutputOverlapException;

public class FileStandardOutput {

    public static List<Crew> FileOutput(String file) throws IOException {
        BufferedReader reader = new BufferedReader(
            new FileReader(file)
        );
        List<Crew> crewList = new ArrayList<>();
        String buffer;

        while ((buffer = reader.readLine()) != null) {
            checkOverlap(crewList, buffer);
            crewList.add(Crew.from(buffer));
        }

        return crewList;
    }

    private static void checkOverlap(List<Crew> crewList, String buffer) {
        for (Crew crew : crewList) {
            if (Objects.equals(crew.getName(), buffer)) {
                throw new FileOutputOverlapException();
            }
        }
    }




}
