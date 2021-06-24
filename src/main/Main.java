package main;

import main.control.Controller;
import main.info.Constants;

import javax.swing.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        /**
        JFileChooser choice = new JFileChooser();
        choice.showOpenDialog(new JFrame());
        File log = choice.getSelectedFile();
        choice.showOpenDialog(new JFrame());
        File petriNet = choice.getSelectedFile();
         */
        long startTime=System.currentTimeMillis(); //获取开始时间

        //要测的程序或方法


        Controller controller = new Controller();
        //controller.execute("/Users/aaronliu/Downloads/ConformanceChecker-master-1/ConformanceChecker-master-1/数据集/herbstFig6p31.xes", "/Users/aaronliu/Downloads/ConformanceChecker-master-1/ConformanceChecker-master-1/数据集/herbstFig6p31.pnml");
        //System.out.println(log.getAbsolutePath());
        //System.out.println(petriNet.getAbsolutePath());

        controller.execute(Constants.LogURL,Constants.PetriURL);
        System.out.println( controller.computeFitness() );

        long endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");




    }


}
