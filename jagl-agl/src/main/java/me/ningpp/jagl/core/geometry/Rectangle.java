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
package me.ningpp.jagl.core.geometry;

public class Rectangle {

    public double Width;
    public double Height;
    public Point Center;
    double left;
    double right;
    double top;
    double bottom;

    /**
     * create a box on points (x0,y0), (x1,y1)
     *
     * @param x0
     * @param y0
     * @param x1
     * @param y1
     */
    public Rectangle(double x0, double y0, double x1, double y1) {
        left = right = x0;
        top = bottom = y0;
        Add(new Point(x1, y1));
    }

    public void Add(Point point) {

    }

}
