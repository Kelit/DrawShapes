package com.example.drawshapes;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Shape {
    String color;
    Shape(String color) {
        this.color = color;
    }
    abstract void draw(Canvas canvas, Paint paint);
}
