package com.example.customview1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {

    private boolean isColorChanged = false;

    public CustomButton(Context context) {
        super(context);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setBackgroundColor(Color.BLUE); // Warna awal button

        setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isColorChanged) {
                    setBackgroundColor(Color.BLUE); // Warna sesuai dengan kriteria
                    isColorChanged = false;
                } else {
                    setBackgroundColor(Color.RED); // Warna berubah sesuai dengan kriteria
                    isColorChanged = true;
                }
            }
        });
    }

}
