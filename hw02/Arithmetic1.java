//Ritika Poddar
//CSE 002
//HW 2
//Arithmetic

//define class
public class Arithmetic{
    
//main method
    public static void main(String[] args) { 
        
//Input Variables
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
//cost per bx of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

//Need to calculate:
//Total cost of each item; sales tax for that total cost
//Total cost of purchases before tax
//Total actually paid for this transaction, including sales tax

//Other variables
double totalSockCost$, totalEnvelopeCost$, totalGlassCost$;
double totalTaxSocks$, totalTaxEnvelope$, totalTaxGlass$;
double totalCostofPurchase$, totalSalesTax$;
double totalPaid$;

System.out.println(" We went to Walmart and bought " + (nSocks) + " socks "+
(nGlasses) + " glasses and " + (nEnvelopes) + " box of envelopes.");
System.out.println("The socks costed " + (sockCost$) + " dollars each, the glasses costed " + (glassCost$)+ 
" dollars each, and the envelopes costed " + (envelopeCost$) + " dollars each.");

//Here are the total costs and sales tax

totalSockCost$=nSocks*sockCost$; //total socks cost
totalTaxSocks$=taxPercent*totalSockCost$;  //total tax for socks
totalGlassCost$=nGlasses*glassCost$;        // total glass cost
totalTaxGlass$=taxPercent*totalGlassCost$;  //total glass tax
totalEnvelopeCost$=nEnvelopes*envelopeCost$;    //total envelope cost
totalTaxEnvelope$=taxPercent*totalEnvelopeCost$; //total envelope tax

totalCostofPurchase$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; 
//total cost of purcahse before tax
totalSalesTax$=totalTaxSocks$+totalTaxGlass$+totalTaxEnvelope$;
//total sales tax

totalPaid$=totalCostofPurchase$+totalSalesTax$;
//Total paid for entire purchase at Walmart.

System.out.println("The total cost for the socks was " +(totalSockCost$)+ " dollars, for glass it was "+ (totalGlassCost$)+ 
" dollars, and for enevelopes it was " + (totalEnvelopeCost$)+ " dollars.");
System.out.println("The total sales tax for the socks was " +(totalTaxSocks$)+ " dollars, for glass it was "+ (totalTaxGlass$)+ 
" dollars, and for enevelopes it was " + (totalTaxEnvelope$)+ " dollars.");
System.out.println("The total cost of the purchase before tax was " + (totalCostofPurchase$) + 
" dollars and the total sales tax paid was "+ (totalSalesTax$)+ " dollars.");
System.out.println("The total amount paid for the whole transaction at Walmart was " + (totalPaid$)+ " dollars.");



     
     
     
     
     
     
     
     
     
        
    }
    
}