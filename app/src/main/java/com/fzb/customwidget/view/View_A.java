package com.fzb.customwidget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class View_A extends View {
    private int widthSize;
    private int heightSize;

    String h_model_string = "--";
    String w_model_string = "--";

    public View_A(Context context) {
        super(context, null);
    }

    public View_A(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public View_A(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //    测量
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        MeasureSpec.getMode(widthMeasureSpec)
//        MeasureSpec.AT_MOST  最大值
//        MeasureSpec.EXACTLY 确定值
//        MeasureSpec.UNSPECIFIED 不确定值

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

//        MeasureSpec.getSize(widthMeasureSpec) 获取当前测量的具体值
        widthSize = MeasureSpec.getSize(widthMeasureSpec);
        heightSize = MeasureSpec.getSize(heightMeasureSpec);
//        不确定值未考虑
        switch (widthMode) {
            case MeasureSpec.AT_MOST:
                widthSize = 800;//最大值500
                w_model_string = "AT_MOST";
                break;
            case MeasureSpec.EXACTLY:
                w_model_string = "EXACTLY";
                break;
        }
        switch (heightMode) {
            case MeasureSpec.AT_MOST:
                heightSize = 800;
                h_model_string = "AT_MOST";
                break;
            case MeasureSpec.EXACTLY:
                h_model_string = "EXACTLY";
                break;
        }

        setMeasuredDimension(widthSize, heightSize);
    }

    //绘制
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(Color.RED);
        paint.setTextSize(50);
        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("w-" + w_model_string + "\n  h-" + h_model_string, 0, heightSize/2, paint);

    }
}
