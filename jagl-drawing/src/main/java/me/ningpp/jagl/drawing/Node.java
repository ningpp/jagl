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
package me.ningpp.jagl.drawing;

public class Node {
    public double Width;
    public double Height;

    public Label Label;
    public String LabelText;

    public me.ningpp.jagl.core.layout.Node GeometryNode;

    public me.ningpp.jagl.core.layout.Node getGeometryNode() {
        return GeometryNode;
    }

    public void setGeometryNode(me.ningpp.jagl.core.layout.Node geometryNode) {
        GeometryNode = geometryNode;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public me.ningpp.jagl.drawing.Label getLabel() {
        return Label;
    }

    public void setLabel(me.ningpp.jagl.drawing.Label label) {
        Label = label;
    }

    public String getLabelText() {
        return LabelText;
    }

    public void setLabelText(String LabelText) {
        this.LabelText = LabelText;
    }
}
