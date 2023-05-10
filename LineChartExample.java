import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*; 
import org.jfree.ui.*; 

public class LineChartExample extends ApplicationFrame {

   public LineChartExample( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Years","Number of Kona Coffee Bags produced in the US",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private CategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      dataset.addValue( 37 , "Kona" , "2010" );
      dataset.addValue( 3 , "Kona" , "2011" );
      dataset.addValue( 243 , "Kona" , "2012" );
      dataset.addValue( 97 , "Kona" ,  "2013" );
      dataset.addValue( 87 , "Kona" , "2014" );
      dataset.addValue( 0 , "Kona" , "2015" );
      dataset.addValue( 0 , "Kona" , "2016" );
      dataset.addValue( 0 , "Kona" , "2017" );
      dataset.addValue( 0 , "Kona" , "2018" );
      return dataset;
   }
   
   public static void main( String[ ] args ) {
      LineChartExample chart = new LineChartExample(
         "Num coffee bags produced" ,
         "Number of Kona Coffee bags produced in the United States");

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
   }
}