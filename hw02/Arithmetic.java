///////////////////////////////////////
//Shen Guo
//CSE2
//Sep/5/2014
//hw02
//Arithmetic Java Program
//compute cost of items bought with tax
//
//  first compile the program
//      javac Arithmeic.java
//  run the program
//      java Arithmeric//

//  define a class
public class Arithmetic {
    // main method
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
           
            //print what items are bought
        System.out.println("Bought Socks, Glasses and Envelopes");
        
            //print how many each items are bought
        System.out.println("Bought " + nSocks + " Socks");
        System.out.println("Bought " + nGlasses + " Glasses");
        System.out.println("Bought " + nEnvelopes + " Envelopes");
            
            //print the cost per item
        System.out.println("Cost per Sock is " + sockCost$ );
        System.out.println("Cost per Glass is " + glassCost$ );
        System.out.println("Cost per Envelopes is " + envelopeCost$ );
            
            //declare variables for each of these values
        double totalSockCost$; //total cost of socks
        double totalGlassCost$; //total cost of glasses
        double totalEnvelopeCost$; //total cost of envelopes
        double totalTaxCost$; //total cost of tax
        double totalPhurchase$; //total cost of phurchases before tax
        double totalPaid$; //total actually paid for this transaction including saled tax
        
        totalSockCost$=nSocks*sockCost$;
        totalGlassCost$=nGlasses*glassCost$;
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        
            //print the total cost of each kind of item
        System.out.println("Cost of Socks before tax is " + (totalSockCost$));
        System.out.println("Cost of Glasses before tax is " + (totalGlassCost$));
        System.out.println("Cost of Envelopes before tax is " + (totalEnvelopeCost$));
            
            //print the sales tax for these items
        System.out.println("Sales tax for Socks is " + ((int)(totalSockCost$ * taxPercent * 100)) / 100.0);
        System.out.println("Sales tax for Glasses is " + ((int)(totalGlassCost$ * taxPercent * 100)) / 100.0);
        System.out.println("Sales tax for Envelopes is " + ((int)(totalEnvelopeCost$ * taxPercent * 100)) / 100.0);
        totalPhurchase$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        totalTaxCost$=(totalPhurchase$*taxPercent);
        totalPaid$=totalPhurchase$+totalTaxCost$;
        
            //print the total cost of the phurchases before tax
        System.out.println("Total cost before tax is " + totalPhurchase$);
            
            //print the total sales tax
        System.out.println("Total sales tax is " + ((int)(totalTaxCost$ * 100) / 100.0));
            
            //print the total cost of the phurchases including saled tax
        System.out.println("Total cost of the phurchase with tax is "+ ((int)(totalPaid$ * 100) / 100.0));
            
    }
}