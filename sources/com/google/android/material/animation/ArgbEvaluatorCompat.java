package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes2.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    @NonNull
    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Integer evaluate(float f10, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f11 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f12 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fE = d0.e(f12, f11, f10, f11);
        float fE2 = d0.e(fPow4, fPow, f10, fPow);
        float fE3 = d0.e(fPow5, fPow2, f10, fPow2);
        float fE4 = d0.e(fPow6, fPow3, f10, fPow3);
        float fPow7 = ((float) Math.pow(fE2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fE3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fE4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fE * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
