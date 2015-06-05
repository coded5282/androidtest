package com.example.fujieggs.mypractice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Kevin on 5/27/2015.
 */
public class TitleView extends View {

    private Bitmap titleGraphic;
    private int screenW; // Variables to keep track of width and height of screen
    private int screenH;

    public TitleView(Context context) {
        super(context);
        titleGraphic =
                BitmapFactory.decodeResource(getResources(),
                        R.drawable.ic_launcher);
    }

    @Override
    public void onSizeChanged (int w, int h, int oldw, int oldh)
    {
        super.onSizeChanged(w, h, oldw, oldh);
        screenW = w;
        screenH = h;
    } // Override onSizeChanged method to grab values of width and height
    // of screen



    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(titleGraphic, (screenW-titleGraphic.getWidth())/2,0,null);

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
