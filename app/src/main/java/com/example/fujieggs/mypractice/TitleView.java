package com.example.fujieggs.mypractice;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Kevin on 5/27/2015.
 */
public class TitleView extends View {

    public TitleView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

    }

    public boolean onTouchEvent (MotionEvent event) {
        int eventaction = event.getAction();
        int X = (int)event.getX();
        int Y = (int)event.getY();

        switch (eventaction) {

            case MotionEvent.ACTION_DOWN:
                break;

            case MotionEvent.ACTION_MOVE:
                break;

            case MotionEvent.ACTION_UP:
                break;

        }
        invalidate();
        return true;
    }
}
