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

public class Edge {
    public Node SourceNode;
    public Node TargetNode;

    public Label Label;
    public String LabelText;

    public Node getSourceNode() {
        return SourceNode;
    }

    public void setSourceNode(Node sourceNode) {
        this.SourceNode = sourceNode;
    }

    public Node getTargetNode() {
        return TargetNode;
    }

    public void setTargetNode(Node targetNode) {
        this.TargetNode = targetNode;
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
