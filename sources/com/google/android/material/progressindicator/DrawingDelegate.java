package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    static final float WAVE_SMOOTHNESS = 0.48f;
    final PathMeasure activePathMeasure;
    final Path cachedActivePath;
    final Path displayedActivePath;
    S spec;
    final Matrix transform;

    public static class ActiveIndicator {

        @FloatRange(from = 0.0d, to = 1.0d)
        float amplitudeFraction = 1.0f;

        @ColorInt
        int color;

        @FloatRange(from = 0.0d, to = 1.0d)
        float endFraction;

        @Px
        int gapSize;
        boolean isDeterminate;

        @FloatRange(from = 0.0d, to = 1.0d)
        float phaseFraction;
        float rotationDegree;

        @FloatRange(from = 0.0d, to = 1.0d)
        float startFraction;
    }

    public DrawingDelegate(S s3) {
        Path path = new Path();
        this.cachedActivePath = path;
        this.displayedActivePath = new Path();
        this.activePathMeasure = new PathMeasure(path, false);
        this.spec = s3;
        this.transform = new Matrix();
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = FlexiOneClickOpenReq.Device.DEFAULT_DOUBLE_VALUE, to = 1.0d) float f10, boolean z3, boolean z8);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i7);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10, @Px int i11);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public abstract void invalidateCachedPaths();

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f10, boolean z3, boolean z8) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f10, z3, z8);
    }

    public float vectorToCanvasRotation(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public class PathPoint {
        float[] posVec;
        float[] tanVec;
        final Matrix transform;

        public PathPoint() {
            this.posVec = new float[2];
            this.tanVec = new float[]{1.0f, 0.0f};
            this.transform = new Matrix();
        }

        public float distance(DrawingDelegate<S>.PathPoint pathPoint) {
            float[] fArr = pathPoint.posVec;
            float f10 = fArr[0];
            float[] fArr2 = this.posVec;
            return (float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1]);
        }

        public void moveAcross(float f10) {
            float[] fArr = this.tanVec;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            float[] fArr2 = this.posVec;
            double d2 = f10;
            double d10 = fAtan2;
            fArr2[0] = (float) ((Math.cos(d10) * d2) + ((double) fArr2[0]));
            float[] fArr3 = this.posVec;
            fArr3[1] = (float) ((Math.sin(d10) * d2) + ((double) fArr3[1]));
        }

        public void moveAlong(float f10) {
            float[] fArr = this.tanVec;
            float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
            float[] fArr2 = this.posVec;
            double d2 = f10;
            double d10 = fAtan2;
            fArr2[0] = (float) ((Math.cos(d10) * d2) + ((double) fArr2[0]));
            float[] fArr3 = this.posVec;
            fArr3[1] = (float) ((Math.sin(d10) * d2) + ((double) fArr3[1]));
        }

        public void reset() {
            Arrays.fill(this.posVec, 0.0f);
            Arrays.fill(this.tanVec, 0.0f);
            this.tanVec[0] = 1.0f;
            this.transform.reset();
        }

        public void rotate(float f10) {
            this.transform.reset();
            this.transform.setRotate(f10);
            this.transform.mapPoints(this.posVec);
            this.transform.mapPoints(this.tanVec);
        }

        public void scale(float f10, float f11) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] * f10;
            fArr[1] = fArr[1] * f11;
            float[] fArr2 = this.tanVec;
            fArr2[0] = fArr2[0] * f10;
            fArr2[1] = fArr2[1] * f11;
        }

        public void translate(float f10, float f11) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] + f10;
            fArr[1] = fArr[1] + f11;
        }

        public PathPoint(DrawingDelegate drawingDelegate, DrawingDelegate<S>.PathPoint pathPoint) {
            this(pathPoint.posVec, pathPoint.tanVec);
        }

        public PathPoint(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.posVec = fArr3;
            this.tanVec = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.tanVec, 0, 2);
            this.transform = new Matrix();
        }
    }
}
