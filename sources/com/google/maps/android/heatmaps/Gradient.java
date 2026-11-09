package com.google.maps.android.heatmaps;

import android.graphics.Color;
import com.horcrux.svg.d0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    public class ColorInterval {
        private final int color1;
        private final int color2;
        private final float duration;

        public /* synthetic */ ColorInterval(Gradient gradient, int i7, int i10, float f10, int i11) {
            this(i7, i10, f10);
        }

        private ColorInterval(int i7, int i10, float f10) {
            this.color1 = i7;
            this.color2 = i10;
            this.duration = f10;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap<Integer, ColorInterval> generateColorIntervals() {
        HashMap<Integer, ColorInterval> map = new HashMap<>();
        if (this.mStartPoints[0] != 0.0f) {
            map.put(0, new ColorInterval(this, Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0], 0));
        }
        for (int i7 = 1; i7 < this.mColors.length; i7++) {
            int i10 = i7 - 1;
            Integer numValueOf = Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i10]));
            int[] iArr = this.mColors;
            int i11 = iArr[i10];
            int i12 = iArr[i7];
            float f10 = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            map.put(numValueOf, new ColorInterval(this, i11, i12, (fArr[i7] - fArr[i10]) * f10, 0));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer numValueOf2 = Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int i13 = this.mColors[length];
            map.put(numValueOf2, new ColorInterval(this, i13, i13, (1.0f - this.mStartPoints[length]) * this.mColorMapSize, 0));
        }
        return map;
    }

    public static int interpolateColor(int i7, int i10, float f10) {
        int iAlpha = (int) (((Color.alpha(i10) - Color.alpha(i7)) * f10) + Color.alpha(i7));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i7), Color.green(i7), Color.blue(i7), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr2);
        float f11 = fArr[0];
        float f12 = fArr2[0];
        if (f11 - f12 > 180.0f) {
            fArr2[0] = f12 + 360.0f;
        } else if (f12 - f11 > 180.0f) {
            fArr[0] = f11 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i11 = 0; i11 < 3; i11++) {
            float f13 = fArr2[i11];
            float f14 = fArr[i11];
            fArr3[i11] = d0.e(f13, f14, f10, f14);
        }
        return Color.HSVToColor(iAlpha, fArr3);
    }

    public int[] generateColorMap(double d2) {
        HashMap<Integer, ColorInterval> mapGenerateColorIntervals = generateColorIntervals();
        int[] iArr = new int[this.mColorMapSize];
        ColorInterval colorInterval = mapGenerateColorIntervals.get(0);
        int i7 = 0;
        for (int i10 = 0; i10 < this.mColorMapSize; i10++) {
            if (mapGenerateColorIntervals.containsKey(Integer.valueOf(i10))) {
                colorInterval = mapGenerateColorIntervals.get(Integer.valueOf(i10));
                i7 = i10;
            }
            iArr[i10] = interpolateColor(colorInterval.color1, colorInterval.color2, (i10 - i7) / colorInterval.duration);
        }
        if (d2 != 1.0d) {
            for (int i11 = 0; i11 < this.mColorMapSize; i11++) {
                int i12 = iArr[i11];
                iArr[i11] = Color.argb((int) (((double) Color.alpha(i12)) * d2), Color.red(i12), Color.green(i12), Color.blue(i12));
            }
        }
        return iArr;
    }

    public Gradient(int[] iArr, float[] fArr, int i7) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (iArr.length == 0) {
            throw new IllegalArgumentException("No colors have been defined");
        }
        for (int i10 = 1; i10 < fArr.length; i10++) {
            if (fArr[i10] <= fArr[i10 - 1]) {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }
        this.mColorMapSize = i7;
        int[] iArr2 = new int[iArr.length];
        this.mColors = iArr2;
        this.mStartPoints = new float[fArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
    }
}
