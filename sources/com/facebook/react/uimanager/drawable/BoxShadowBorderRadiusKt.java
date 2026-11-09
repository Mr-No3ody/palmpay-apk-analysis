package com.facebook.react.uimanager.drawable;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"adjustRadiusForSpread", "", "radius", "spread", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BoxShadowBorderRadiusKt {
    public static final float adjustRadiusForSpread(float f10, float f11) {
        float fPow;
        if (f10 < Math.abs(f11)) {
            float f12 = 1;
            fPow = f12 + ((float) Math.pow((f10 / Math.abs(f11)) - f12, 3));
        } else {
            fPow = 1.0f;
        }
        float f13 = (f11 * fPow) + f10;
        if (f13 < 0.0f) {
            return 0.0f;
        }
        return f13;
    }
}
