package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
@RestrictTo({c.f39801b})
public class VisibilityAwareImageButton extends ImageButton {
    private int userSetVisibility;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final int getUserSetVisibility() {
        return this.userSetVisibility;
    }

    public final void internalSetVisibility(int i7, boolean z3) {
        super.setVisibility(i7);
        if (z3) {
            this.userSetVisibility = i7;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        internalSetVisibility(i7, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.userSetVisibility = getVisibility();
    }
}
