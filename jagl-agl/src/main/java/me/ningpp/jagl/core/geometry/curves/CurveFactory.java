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


import me.ningpp.jagl.core.geometry.Point;
import me.ningpp.jagl.core.geometry.Rectangle;

public class CurveFactory {

    public static ICurve CreateRectangleWithRoundedCorners(double width, double height, double radiusInXDirection, double radiusInYDirection, Point center) {
        var box = new Rectangle(center.X() - width / 2,
                center.Y() - height / 2,
                center.X() + width / 2,
                center.Y() + height / 2);
        return new RoundedRect(box, radiusInXDirection, radiusInYDirection);
    }

    public static void CreateRectangleWithRoundedCorners(Curve c, double width, double height, double radiusInXDirection, double radiusInYDirection, Point center) {

    }
}
