package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes4.dex */
public class StateImageView extends AppCompatImageView {
    public StateImageView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                drawable = getBackground();
            }
            if (drawable != null) {
                drawable.setAlpha(128);
            }
        } else if (actionMasked == 1) {
            Drawable drawable2 = getDrawable();
            if (drawable2 == null) {
                drawable2 = getBackground();
            }
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
        } else if (actionMasked == 3) {
            Drawable drawable3 = getDrawable();
            if (drawable3 == null) {
                drawable3 = getBackground();
            }
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public StateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
