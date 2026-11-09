package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Z0;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes2.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Z0 z0E = Z0.e(context, attributeSet, R.styleable.TabItem);
        int i7 = R.styleable.TabItem_android_text;
        TypedArray typedArray = z0E.f12863b;
        this.text = typedArray.getText(i7);
        this.icon = z0E.b(R.styleable.TabItem_android_icon);
        this.customLayout = typedArray.getResourceId(R.styleable.TabItem_android_layout, 0);
        z0E.g();
    }
}
