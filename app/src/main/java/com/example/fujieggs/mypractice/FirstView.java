package com.example.fujieggs.mypractice;

/**
 * Created by Kevin on 5/27/2015.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class FirstView extends View {

    private Paint redPaint;
    private int circleX;
    private int circleY;
    private float radius;

    public FirstView(Context context) {
        super(context);
        redPaint = new Paint();
        redPaint.setAntiAlias(true);
        redPaint.setColor(Color.RED);
        circleX = 100;
        circleY = 100;
        radius = 30;
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(circleX, circleY, radius, redPaint);
    }

    public boolean onTouchEvent(MotionEvent event) {
        int eventaction = event.getAction(); // get integer associated with action of user
        int X = (int)event.getX(); // get x coordinates of finger
        int Y = (int)event.getY(); // get y coordinates of finger

        switch (eventaction) { // handle 3 cases

            case MotionEvent.ACTION_DOWN: // finger down on screen
                break;

            case MotionEvent.ACTION_MOVE: // finger dragged across screen
                break;

            case MotionEvent.ACTION_UP: // finger removed from screen
                circleX = X;
                circleY = Y;
                break;
        }
        invalidate(); // Telling view change has occurred and canvas needs to be redrawn
        return true;
    }


}
