package com.solidprinciples.OCP;

/**
 * Let's consider this class that reads and writes data from and to different file formats
 * */
class FileHelper {
    String fileFormat;
    public FileHelper(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * THIS CODE IS GREAT AS IT IS but what happens if the client wants you to add XML FILE Support ??
     * Should we just update the Switch statement?? NOOOO OCP says Open for Extension Closed for Modification!!!
     * What do we do ? Check out the XMLFileHelper :)
     * */
    public void readData(){
        switch (this.fileFormat.toLowerCase()) {
            case "csv", "txt" -> System.out.printf("Reading from a %s File\n", fileFormat.toUpperCase());
            default -> throw new Error("Not supported file format");
        }
    }


    public void writeData(){
        switch (this.fileFormat.toLowerCase()) {
            case "csv", "txt" -> System.out.printf("Writing to a %s File\n", fileFormat.toUpperCase());
            default -> throw new Error("Not supported file format");
        }
    }

}