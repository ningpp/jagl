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
package me.ningpp.jagl.miscellaneous;

import me.ningpp.jagl.core.CancelToken;
import me.ningpp.jagl.core.layout.GeometryGraph;
import me.ningpp.jagl.core.layout.LayoutAlgorithmSettings;

public class LayoutHelpers {

    public static void CalculateLayout(GeometryGraph geometryGraph, LayoutAlgorithmSettings settings, CancelToken cancelToken) {
        CalculateLayout(geometryGraph, settings, cancelToken, null);
    }

    public static void CalculateLayout(GeometryGraph geometryGraph, LayoutAlgorithmSettings settings, CancelToken cancelToken, String tileDirectory) {

    }

}