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

import me.ningpp.jagl.core.layout.GeometryGraph;

import java.util.List;

public class Graph {

    private List<Node> nodes;

    private List<Edge> edges;

    private GeometryGraph geometryGraph;

    public Node addNode(String nodeId) {
        return null;
    }

    public Node findNode(String nodeId) {
        return null;
    }

    public Edge addEdge(String source, String target) {
        return null;
    }

    public void createGeometryGraph() {
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public GeometryGraph getGeometryGraph() {
        return geometryGraph;
    }

    public void setGeometryGraph(GeometryGraph geometryGraph) {
        this.geometryGraph = geometryGraph;
    }
}
