/*
 * JGridChart.java
 *
 * Copyright (c) 2002-2017 Alexei Drummond, Andrew Rambaut and Marc Suchard
 *
 * This file is part of BEAST.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * BEAST is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 *  BEAST is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with BEAST; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package tracer.traces;

import dr.app.gui.chart.*;

/**
 * @author Guy Baele
 */
public class JGridChart extends JChart {

    private final CustomAxis xVariableAxis;
    private final CustomAxis yVariableAxis;

    public JGridChart() {
        super(null, null);

        //xVariableAxis = new DiscreteAxis(true, true);
        //yVariableAxis = new DiscreteAxis(true, true);

        xVariableAxis = new CustomAxis(1, 2);
        yVariableAxis = new CustomAxis(1, 2);

        //this sets the axes on the JGridChart
        setXAxis(xVariableAxis);
        setYAxis(yVariableAxis);
    }

    public JGridChart(double aspectRatio) {
        super(null, null, aspectRatio);

        //xVariableAxis = new DiscreteAxis(true, true);
        //yVariableAxis = new DiscreteAxis(true, true);

        xVariableAxis = new CustomAxis(1, 2);
        yVariableAxis = new CustomAxis(1, 2);

        //this sets the axes on the JGridChart
        setXAxis(xVariableAxis);
        setYAxis(yVariableAxis);
    }

    @Override
    public void addPlot(Plot plot) {
        //System.out.println("JGridChart: addPlot");

        plot.setAxes(xAxis, yAxis);

        plots.add(plot);
        //System.out.println("getPlotCount() = " + getPlotCount());
        // set the range manually to the square root of the number of plots
        xVariableAxis.setRange(1.0, Math.sqrt(getPlotCount()));
        yVariableAxis.setRange(1.0, Math.sqrt(getPlotCount()));

        //System.out.println("xVariableAxis: (" + xVariableAxis.getMinAxis() + "," + xVariableAxis.getMaxAxis() + ")");
        //System.out.println("yVariableAxis: (" + yVariableAxis.getMinAxis() + "," + yVariableAxis.getMaxAxis() + ")");

        recalibrate();
        repaint();
    }

    @Override
    protected String getXAxisLabel(double value) {
        return getPlotName(value);
    }

    @Override
    protected String getYAxisLabel(double value) {
        return getPlotName(value);
    }

    private String getPlotName(double value) {
        int index = (int)(value);
        //System.out.println("JGridChart: getPlotName = " + index);
        if (index >= 1 && index <= getPlotCount()) {
            Plot plot = getPlot(index - 1);
            //System.out.println("  " + plot.getName());
            return plot.getName();
        } else {
            return "";
        }

    }

}
