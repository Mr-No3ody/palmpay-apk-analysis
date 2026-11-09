package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.util.DeviceProperties;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes2.dex */
public final class zaad extends Button {
    public zaad(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i7, int i10, int i11, int i12) {
        if (i7 == 0) {
            return i10;
        }
        if (i7 == 1) {
            return i11;
        }
        if (i7 == 2) {
            return i12;
        }
        throw new IllegalStateException(d0.n(i7, "Unknown color scheme: ", new StringBuilder(String.valueOf(i7).length() + 22)));
    }

    public final void zaa(Resources resources, int i7, int i10) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i11 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i11);
        setMinWidth(i11);
        int i12 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i13 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i10, i12, i13, i13);
        int i14 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i15 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i10, i14, i15, i15);
        if (i7 == 0 || i7 == 1) {
            iZab = iZab2;
        } else if (i7 != 2) {
            throw new IllegalStateException(d.g(String.valueOf(i7).length() + 21, i7, "Unknown button size: "));
        }
        Drawable drawable = resources.getDrawable(iZab);
        drawable.setTintList(resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i16 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i17 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i10, i16, i17, i17))));
        if (i7 == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i7 == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i7 != 2) {
                throw new IllegalStateException(d.g(String.valueOf(i7).length() + 21, i7, "Unknown button size: "));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
