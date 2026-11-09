package com.luck.picture.lib.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class MarqueeTextView extends MediumBoldTextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z3, int i7, Rect rect) {
        if (z3) {
            super.onFocusChanged(true, i7, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z3) {
        if (z3) {
            super.onWindowFocusChanged(true);
        }
    }

    public MarqueeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
