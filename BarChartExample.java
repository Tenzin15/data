import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*; 
import org.jfree.ui.*; 

public class BarChartExample extends ApplicationFrame {
   
   public BarChartExample( String applicationTitle , String chartTitle ) {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Category",  //x-axis label        
         "Rating",     //y-axis label
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
      final String kona = "Kona";        
      final String sidamo = "Sidamo";        
      final String limu = "Limu";
      final String sul = "Sul De Minas";      
      final String marmelade = "Marmelade";

      final String flavor = "Flavor";        
      final String aroma = "Aroma";        
      final String sweetness = "Sweeteness";               
      final DefaultCategoryDataset dataset =    new DefaultCategoryDataset( );  

      dataset.addValue( 8.17 , kona , flavor );        
      dataset.addValue( 7.875 , kona , aroma );        
      dataset.addValue( 10.0 , kona , sweetness ); 

      dataset.addValue( 7.91 , sidamo , flavor );        
      dataset.addValue( 7.625 , sidamo , aroma );       
      dataset.addValue( 10.0 , sidamo , sweetness );        

      dataset.addValue( 7.92 , sul , flavor );        
      dataset.addValue( 8.295 , sul , aroma );        
      dataset.addValue( 10.0 , sul , sweetness );        
   
      dataset.addValue( 6.75 , marmelade , flavor );        
      dataset.addValue( 6.92 , marmelade , aroma );        
      dataset.addValue( 8.67 , marmelade , sweetness ); 

      dataset.addValue( 7.42 , limu , flavor );        
      dataset.addValue( 7.14 , limu , aroma );        
      dataset.addValue( 8.67 , limu , sweetness ); 

      return dataset; 
   }
   
   public static void main( String[ ] args ) {
    BarChartExample chart = new BarChartExample("Coffee Ratings", 
         "Which coffee do you like?");
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
   }
}