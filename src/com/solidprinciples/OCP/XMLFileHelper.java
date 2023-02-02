package com.solidprinciples.OCP;

class XMLFileHelper extends FileHelper{

    public XMLFileHelper(String fileFormat) {
        super(fileFormat);
    }

    /**
     * So the answer could have been to add all of this code within the switch statement in FileHelper but
     * that could create problems and that's why we are open for EXTENSION (this class) and closed for modification (EXISTING CODE IN SWITCH)
     * */
    @Override
    public void readData() {
        System.out.printf("Reading from the %s File\n", fileFormat.toUpperCase());
    }

    @Override
    public void writeData() {
        System.out.printf("Writing to an %s File now\n", fileFormat.toUpperCase());
    }
}