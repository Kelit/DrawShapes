package com.example.drawshapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;

public class Rect extends Shape{

    PointF cornerLT;
    PointF cornerLB;

    public Rect(String color,PointF cornerLT, PointF cornerLB){
        super(color);
        this.cornerLT = cornerLT;
        this.cornerLB = cornerLB;
    }

    @Override
    void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.parseColor("#"+this.color));
        canvas.drawRect(cornerLT.x,cornerLT.y,cornerLB.x,cornerLB.x, paint);
    }
}
