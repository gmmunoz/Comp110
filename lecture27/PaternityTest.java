package comp110.lecture27;

import java.util.ArrayList;
import java.util.List;

import comp110.lecture27.support.GUI;
import comp110.lecture27.support.TextFileReader;
import javafx.application.Application;
import javafx.stage.Stage;

public class PaternityTest {

    private static Study _study;

    public static void main(String[] args) {
        Sample subject = readSample("data/no-spoilers/child.txt");
        System.out.println(subject.countAlleles());
        _study = new Study(subject, 25);
        _study.addCandidate(readSample("data/no-spoilers/person0.txt"));
        _study.addCandidate(readSample("data/no-spoilers/person1.txt"));
        _study.addCandidate(readSample("data/no-spoilers/person2.txt"));
        // output results
        for (Sample s : _study.getAncestors()) {
            System.out.println("Father: " + s.toString());
        }
        // GUI.initializeGUI(_study);
    }

    public static Sample readSample(String fileName) {
        Sample sample = new Sample(fileName);
        TextFileReader input = new TextFileReader(fileName);
        while (input.hasNext()) {
            sample.addAllele(input.next());
        }
        return sample;
    }
}
