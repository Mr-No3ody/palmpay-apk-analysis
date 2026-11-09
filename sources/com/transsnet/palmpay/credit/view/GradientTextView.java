package com.transsnet.palmpay.credit.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class GradientTextView extends LimitTextView {
    public GradientTextView(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        if (z3) {
            getPaint().setShader(new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), Color.parseColor("#FFFFFF"), Color.parseColor("#FFDE9D"), Shader.TileMode.CLAMP));
        }
    }

    public GradientTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GradientTextView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
