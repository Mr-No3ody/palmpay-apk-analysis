package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class FeColorMatrixView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC1408e f23274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ReadableArray f23275e;

    @Override // com.horcrux.svg.FilterPrimitiveView
    public final Bitmap b(HashMap map, Bitmap bitmap) {
        Bitmap bitmapC = FilterPrimitiveView.c(map, bitmap, this.f23273c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int iOrdinal = this.f23274d.ordinal();
        if (iOrdinal == 0) {
            if (this.f23275e.size() >= 20) {
                float[] fArr = new float[this.f23275e.size()];
                for (int i7 = 0; i7 < this.f23275e.size(); i7++) {
                    fArr[i7] = ((float) this.f23275e.getDouble(i7)) * (i7 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapC);
            }
            return bitmapC;
        }
        if (iOrdinal == 1) {
            if (this.f23275e.size() == 1) {
                colorMatrix.setSaturation((float) this.f23275e.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapC);
            }
            return bitmapC;
        }
        if (iOrdinal == 2) {
            if (this.f23275e.size() == 1) {
                double d2 = (((double) ((float) this.f23275e.getDouble(0))) * 3.141592653589793d) / 180.0d;
                float fCos = (float) Math.cos(d2);
                float fSin = (float) Math.sin(d2);
                float f10 = 0.715f - (fCos * 0.715f);
                float f11 = fSin * 0.715f;
                float f12 = 0.072f - (fCos * 0.072f);
                float f13 = 0.213f - (fCos * 0.213f);
                colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f10 - f11, (fSin * 0.928f) + f12, 0.0f, 0.0f, (0.143f * fSin) + f13, (0.14f * fSin) + (0.285f * fCos) + 0.715f, f12 - (0.283f * fSin), 0.0f, 0.0f, f13 - (0.787f * fSin), f10 + f11, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            }
            return bitmapC;
        }
        if (iOrdinal == 3) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapC);
    }
}
