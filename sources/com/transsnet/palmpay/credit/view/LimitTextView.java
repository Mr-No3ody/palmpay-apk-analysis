package com.transsnet.palmpay.credit.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes4.dex */
public class LimitTextView extends AppCompatTextView {
    public LimitTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        CharSequence text = getText();
        TextPaint paint = getPaint();
        int width = getWidth();
        int i7 = 1;
        while (true) {
            paint.setTextSize(i7);
            if (paint.measureText(text, 0, text.length()) >= width) {
                break;
            } else {
                i7++;
            }
        }
        paint.setTextSize(i7 == 1 ? 1.0f : i7 - 1);
        int i10 = i7 != 1 ? i7 - 1 : 1;
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new AbsoluteSizeSpan(i10), 0, text.length(), 33);
        setText(spannableString);
        super.onDraw(canvas);
    }

    public LimitTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LimitTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
