package com.example.drawshapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;

public class Circle extends Shape {

    PointF cornerLT;
    float radius;

    public Circle(String color, PointF cornerLT, float radius){
        super(color);
        this.cornerLT = cornerLT;
        this.radius = radius;
    }

    @Override
    void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.parseColor("#"+this.color));
        canvas.drawCircle(cornerLT.x,cornerLT.y,radius, paint);
    }
}
