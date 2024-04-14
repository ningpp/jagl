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
package me.ningpp.jagl.core.geometry.curves;

import me.ningpp.jagl.core.geometry.Rectangle;

public class RoundedRect implements ICurve {

    private final double RadiusX;
    private final double RadiusY;
    private final Curve curve;

    public RoundedRect(Rectangle bounds, double radiusX, double radiusY) {
        RadiusX = radiusX;
        RadiusY = radiusY;
        curve = new Curve(8);
        CurveFactory.CreateRectangleWithRoundedCorners(curve,
                bounds.Width, bounds.Height, radiusX, radiusY, bounds.Center);
    }

}
