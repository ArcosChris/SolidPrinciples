package com.solidprinciples.OCP;

class Main {
    public static void main(String[] args) {
        FileHelper fileHelper = new FileHelper("CSV");
        fileHelper.readData();
        fileHelper.writeData();

        //USING OCP FOR XMLFILEHELPER
        XMLFileHelper file = new XMLFileHelper("XML");
        file.readData();
        file.writeData();

        XMLFileHelper notXML = new XMLFileHelper("CSV");
        notXML.readData();
        notXML.writeData();
    }
}