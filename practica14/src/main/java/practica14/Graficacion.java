package practica14;

import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.colors.XChartSeriesColors;
import org.knowm.xchart.SwingWrapper;
import java.util.List;
import practica14.LectorCSV;
import java.io.IOException;

/**
 * Clase que grafica la regresión lineal de un conjunto de datos.
 * 
 * @author Daniel Linares
 */
public class Graficacion {

    public static void main(String[] args) {
        XYChart chart = new XYChartBuilder().title("Regresión lineal").width(800).height(600).xAxisTitle("X")
                .yAxisTitle("Y").theme(ChartTheme.Matlab).build();

        chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.GREY));
        chart.getStyler().setChartTitleVisible(true);
        chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
        chart.getStyler().setPlotGridLinesVisible(false);
        chart.getStyler().setMarkerSize(6);

        // Lee un archivo de tipo csv
        List<String[]> entradas = null;
        try {
            entradas = LectorCSV.leer(Graficacion.class.getResource("/420490056.csv").getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        double[] xData = new double[entradas.size()];
        double[] yData = new double[entradas.size()];

        // Introduce los datos en un arreglo con los valores de x y otro con los de y
        int c = 0;
        for (String[] linea : entradas) {
            xData[c] = Double.parseDouble(linea[0]);
            yData[c] = Double.parseDouble(linea[1]);
            c++;
        }

        // Calcula la pendiente y la intersección con el eje y de la recta que
        // representa la regresión
        double sumaX = 0;
        double sumaY = 0;
        double sumaXY = 0;
        double sumaCuadradaX = 0;
        for (int i = 0; i < xData.length; i++) {
            sumaX += xData[i];
            sumaY += yData[i];
            sumaXY += xData[i] * yData[i];
            sumaCuadradaX += Math.pow(xData[i], 2);
        }
        double m = (xData.length * sumaXY - sumaX * sumaY) / (xData.length * sumaCuadradaX - Math.pow(sumaX, 2));
        double b = (sumaY - m * sumaX) / (xData.length);

        // Imprime los puntos
        XYSeries sampleSeries = chart.addSeries("Observaciones", xData, yData);
        sampleSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
        sampleSeries.setMarkerColor(XChartSeriesColors.RED);

        // Imprime la recta que representa la regresión lineal
        XYSeries lineSeries = chart.addSeries("Línea", new double[] { minimo(xData), maximo(xData) },
                new double[] { m * minimo(xData) + b, m * maximo(xData) + b });
        lineSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Line);
        lineSeries.setLineColor(XChartSeriesColors.BLUE);
        lineSeries.setLineWidth(3);

        new SwingWrapper<XYChart>(chart).displayChart();
    }

    /**
     * Matodo para calcular el valor minimo de un arreglo
     * 
     * @param arr El arreglo a introducir
     * @return el menor valor del arreglo
     */
    public static double minimo(double[] arr) {
        double minimo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimo) {
                minimo = arr[i];
            }
        }
        return minimo;
    }

    /**
     * Metodo para calcular el valor maximo de un arreglo
     * 
     * @param arr El arreglo a introducir
     * @return el mayor valor del arreglo
     */
    public static double maximo(double[] arr) {
        double maximo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }
        return maximo;
    }
}
