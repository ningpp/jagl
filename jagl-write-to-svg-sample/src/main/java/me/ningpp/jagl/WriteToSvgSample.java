/*
 *    Copyright 2021-2023 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package me.ningpp.jagl;

import System.Console;
import me.ningpp.jagl.core.geometry.Point;
import me.ningpp.jagl.core.geometry.curves.CurveFactory;
import me.ningpp.jagl.drawing.Graph;
import me.ningpp.jagl.drawing.SvgGraphWriter;
import me.ningpp.jagl.layout.layered.SugiyamaLayoutSettings;
import me.ningpp.jagl.miscellaneous.LayoutHelpers;

import java.io.StringWriter;

public class WriteToSvgSample {

    public static void main(String[] args) {
        var drawingGraph = new Graph();
        drawingGraph.addNode("A").setLabelText("AText");
        drawingGraph.addNode("B").setLabelText("BText");

        var e = drawingGraph.addEdge("A", "B"); // now the drawing graph has nodes A,B and and an edge A -> B\
        // the geometry graph is still null, so we are going to create it
        e.LabelText = "from " + e.SourceNode.LabelText + " to " + e.TargetNode.LabelText;
        drawingGraph.createGeometryGraph();


        // Now the drawing graph elements point to the corresponding geometry elements,
        // however the node boundary curves are not set.
        // Setting the node boundaries
        for (var n : drawingGraph.getNodes()) {
            // Ideally we should look at the drawing node attributes, and figure out, the required node size
            // I am not sure how to find out the size of a string rendered in SVG. Here,
            // we just blindly assign to each node a rectangle with width 60 and height 40,
            // and round its corners.
            n.GeometryNode.BoundaryCurve = CurveFactory.CreateRectangleWithRoundedCorners(60, 40, 3, 2, new Point(0, 0));
        }

        AssignLabelsDimensions(drawingGraph);

        LayoutHelpers.CalculateLayout(drawingGraph.getGeometryGraph(), new SugiyamaLayoutSettings(), null);
        PrintSvgAsString(drawingGraph);
    }

    private static void AssignLabelsDimensions(Graph drawingGraph) {
        // In general, the label dimensions should depend on the viewer
        var na = drawingGraph.findNode("A");
        na.Label.Width = na.Width * 0.6;
        na.Label.Height = 40;
        var nb = drawingGraph.findNode("B");
        nb.Label.Width = nb.Width * 0.6;
        nb.Label.Height = 40;
        // init geometry labels as well
        for (var de : drawingGraph.getEdges()) {
            // again setting the dimensions, that should depend on Drawing.Label and the viewer, blindly
            de.Label.GeometryLabel.Width = 140;
            de.Label.GeometryLabel.Height = 60;
        }
    }

    private static void PrintSvgAsString(Graph drawingGraph) {
        var writer = new StringWriter();
        var svgWriter = new SvgGraphWriter(writer, drawingGraph);
        svgWriter.write();
        Console.WriteLine(writer.getBuffer().toString());
    }

}
