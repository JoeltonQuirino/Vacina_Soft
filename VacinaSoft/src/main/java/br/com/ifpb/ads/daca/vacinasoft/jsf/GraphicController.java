package br.com.ifpb.ads.daca.vacinasoft.jsf;

import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;
import br.com.ifpb.ads.daca.vacinasoft.entities.PSFUser;
import br.com.ifpb.ads.vacinasoft.services.AdministrationServiceInterface;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author MarkusPatriota
 */
@Named
@SessionScoped
public class GraphicController implements Serializable{
    
    @Inject
    private AdministrationServiceInterface administrationDaoInterface;
    private List<PSFUser> pSFUsers;
    private Integer numberUserSex;
    
    private LineChartModel lineChartModelMonth;
    
    public GraphicController(){
        consultMonths();
    }

    private void consultMonths(){
        lineChartModelMonth = initLinearModel();
        lineChartModelMonth.setTitle("Crianças Vacinadas");
        lineChartModelMonth.setAnimate(true);
        lineChartModelMonth.setLegendPosition("se");
        Axis yAxis = lineChartModelMonth.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
        administrationDaoInterface.vaccinatedChildren(1);
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Meninos");
        
        series1.set(1, 8);
       
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);
        
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Meninas");
        
        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);
        
        model.addSeries(series1);
        model.addSeries(series2);
        
        return model;
    }

    public LineChartModel getLineChartModelMonth() {
        return lineChartModelMonth;
    }

    public void setLineChartModelMonth(LineChartModel lineChartModelMonth) {
        this.lineChartModelMonth = lineChartModelMonth;
    }

    public List<Administration> getpSFUsers() {
        return administrationDaoInterface.findAll();
    }
    
}