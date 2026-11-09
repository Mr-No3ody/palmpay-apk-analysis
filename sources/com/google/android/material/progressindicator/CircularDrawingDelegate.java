package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import p118hf.a;

/* JADX INFO: loaded from: classes2.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH = 0.5522848f;
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float adjustedWavelength;
    private final RectF arcBounds;
    private float cachedAmplitude;
    private float cachedRadius;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    private final Pair<DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint, DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint> endPoints;

    @FloatRange(from = 0.0d, to = 1.0d)
    private float totalTrackLengthFraction;

    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.arcBounds = new RectF();
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void appendCubicPerHalfCycle(@NonNull Path path, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint2) {
        float f10 = (this.adjustedWavelength / 2.0f) * 0.48f;
        DrawingDelegate.PathPoint pathPoint3 = new DrawingDelegate.PathPoint(this, pathPoint);
        DrawingDelegate.PathPoint pathPoint4 = new DrawingDelegate.PathPoint(this, pathPoint2);
        pathPoint3.moveAlong(f10);
        pathPoint4.moveAlong(-f10);
        float[] fArr = pathPoint3.posVec;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float[] fArr2 = pathPoint4.posVec;
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float[] fArr3 = pathPoint2.posVec;
        path.cubicTo(f11, f12, f13, f14, fArr3[0], fArr3[1]);
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint, DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint> pair, float f10, float f11, float f12, float f13) {
        float f14 = this.displayedAmplitude * f12;
        int i7 = this.drawingDeterminateIndicator ? ((CircularProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((CircularProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
        float f15 = this.adjustedRadius;
        if (f15 != this.cachedRadius || (pathMeasure == this.activePathMeasure && (f14 != this.cachedAmplitude || i7 != this.cachedWavelength))) {
            this.cachedAmplitude = f14;
            this.cachedWavelength = i7;
            this.cachedRadius = f15;
            invalidateCachedPaths();
        }
        path.rewind();
        float f16 = 0.0f;
        float fL = a.l(f11, 0.0f, 1.0f);
        if (((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            float f17 = f13 / ((float) ((((double) this.adjustedRadius) * 6.283185307179586d) / ((double) this.adjustedWavelength)));
            f10 += f17;
            f16 = 0.0f - (f17 * 360.0f);
        }
        float f18 = f10 % 1.0f;
        float length = (pathMeasure.getLength() * f18) / 2.0f;
        float length2 = (pathMeasure.getLength() * (f18 + fL)) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setRotate(f16);
        pathPoint.rotate(f16);
        pathPoint2.rotate(f16);
        path.transform(this.transform);
    }

    private void createWavyPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, float f10) {
        path.rewind();
        float length = pathMeasure.getLength();
        int iMax = Math.max(3, (int) ((length / (this.drawingDeterminateIndicator ? ((CircularProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((CircularProgressIndicatorSpec) this.spec).wavelengthIndeterminate)) / 2.0f)) * 2;
        this.adjustedWavelength = length / iMax;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < iMax; i7++) {
            DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            float f11 = i7;
            pathMeasure.getPosTan(this.adjustedWavelength * f11, pathPoint.posVec, pathPoint.tanVec);
            DrawingDelegate.PathPoint pathPoint2 = new DrawingDelegate.PathPoint();
            float f12 = this.adjustedWavelength;
            pathMeasure.getPosTan((f12 / 2.0f) + (f11 * f12), pathPoint2.posVec, pathPoint2.tanVec);
            arrayList.add(pathPoint);
            pathPoint2.moveAcross(f10 * 2.0f);
            arrayList.add(pathPoint2);
        }
        arrayList.add((DrawingDelegate.PathPoint) arrayList.get(0));
        DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint3 = (DrawingDelegate.PathPoint) arrayList.get(0);
        float[] fArr = pathPoint3.posVec;
        int i10 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i10 < arrayList.size()) {
            DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint4 = (DrawingDelegate.PathPoint) arrayList.get(i10);
            appendCubicPerHalfCycle(path, pathPoint3, pathPoint4);
            i10++;
            pathPoint3 = pathPoint4;
        }
    }

    private void drawArc(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @ColorInt int i7, @Px int i10, @Px int i11, float f12, float f13, boolean z3) {
        float f14 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f15 = f10 % 1.0f;
        if (f15 < 0.0f) {
            f15 += 1.0f;
        }
        if (this.totalTrackLengthFraction < 1.0f) {
            float f16 = f15 + f14;
            if (f16 > 1.0f) {
                drawArc(canvas, paint, f15, 1.0f, i7, i10, 0, f12, f13, z3);
                drawArc(canvas, paint, 1.0f, f16, i7, 0, i11, f12, f13, z3);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        float f17 = f14 - 0.99f;
        if (f17 >= 0.0f) {
            float f18 = ((f17 * degrees) / 180.0f) / ROUND_CAP_RAMP_DOWN_THRESHHOLD;
            f14 += f18;
            if (!z3) {
                f15 -= f18 / 2.0f;
            }
        }
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f15);
        float fLerp2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f14);
        float degrees2 = (float) Math.toDegrees(i10 / this.adjustedRadius);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i11 / this.adjustedRadius));
        float f19 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z8 = ((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z3 && f12 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i7);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f20 = this.displayedCornerRadius * 2.0f;
        float f21 = degrees * 2.0f;
        if (degrees3 < f21) {
            float f22 = degrees3 / f21;
            float f23 = (degrees * f22) + f19;
            DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            if (z8) {
                float length = (this.activePathMeasure.getLength() * (f23 / 360.0f)) / 2.0f;
                float f24 = this.displayedAmplitude * f12;
                float f25 = this.adjustedRadius;
                if (f25 != this.cachedRadius || f24 != this.cachedAmplitude) {
                    this.cachedAmplitude = f24;
                    this.cachedRadius = f25;
                    invalidateCachedPaths();
                }
                this.activePathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
            } else {
                pathPoint.rotate(f23 + 90.0f);
                pathPoint.moveAcross(-this.adjustedRadius);
            }
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, pathPoint, f20, this.displayedTrackThickness, f22);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((CircularProgressIndicatorSpec) this.spec).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f26 = f19 + degrees;
        float f27 = degrees3 - f21;
        ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
        ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
        if (z8) {
            calculateDisplayedPath(this.activePathMeasure, this.displayedActivePath, this.endPoints, f26 / 360.0f, f27 / 360.0f, f12, f13);
            canvas.drawPath(this.displayedActivePath, paint);
        } else {
            ((DrawingDelegate.PathPoint) this.endPoints.first).rotate(f26 + 90.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.first).moveAcross(-this.adjustedRadius);
            ((DrawingDelegate.PathPoint) this.endPoints.second).rotate(f26 + f27 + 90.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).moveAcross(-this.adjustedRadius);
            RectF rectF = this.arcBounds;
            float f28 = this.adjustedRadius;
            rectF.set(-f28, -f28, f28, f28);
            canvas.drawArc(this.arcBounds, f26, f27, false, paint);
        }
        if (((CircularProgressIndicatorSpec) this.spec).useStrokeCap() || this.displayedCornerRadius <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.first, f20, this.displayedTrackThickness);
        drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f20, this.displayedTrackThickness);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, float f10, float f11) {
        drawRoundedBlock(canvas, paint, pathPoint, f10, f11, 1.0f);
    }

    private int getSize() {
        S s3 = this.spec;
        return (((CircularProgressIndicatorSpec) s3).indicatorInset * 2) + ((CircularProgressIndicatorSpec) s3).indicatorSize;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f10, boolean z3, boolean z8) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        S s3 = this.spec;
        float f11 = (((CircularProgressIndicatorSpec) s3).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s3).indicatorInset;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s8 = this.spec;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s8).trackThickness * f10;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s8).trackThickness / 2, ((CircularProgressIndicatorSpec) s8).getTrackCornerRadiusInPx()) * f10;
        S s10 = this.spec;
        this.displayedAmplitude = ((CircularProgressIndicatorSpec) s10).waveAmplitude * f10;
        float f13 = (((CircularProgressIndicatorSpec) s10).indicatorSize - ((CircularProgressIndicatorSpec) s10).trackThickness) / 2.0f;
        this.adjustedRadius = f13;
        if (z3 || z8) {
            float f14 = ((1.0f - f10) * ((CircularProgressIndicatorSpec) s10).trackThickness) / 2.0f;
            if ((z3 && ((CircularProgressIndicatorSpec) s10).showAnimationBehavior == 2) || (z8 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 1)) {
                this.adjustedRadius = f13 + f14;
            } else if ((z3 && ((CircularProgressIndicatorSpec) s10).showAnimationBehavior == 1) || (z8 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 2)) {
                this.adjustedRadius = f13 - f14;
            }
        }
        if (z8 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f10;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10) {
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i7) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i7);
        canvas.save();
        canvas.rotate(activeIndicator.rotationDegree);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f10 = activeIndicator.startFraction;
        float f11 = activeIndicator.endFraction;
        int i10 = activeIndicator.gapSize;
        drawArc(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i10, i10, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10, int i11) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i7, i10);
        this.drawingDeterminateIndicator = false;
        drawArc(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i11, i11, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void invalidateCachedPaths() {
        this.cachedActivePath.rewind();
        this.cachedActivePath.moveTo(1.0f, 0.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            this.cachedActivePath.cubicTo(1.0f, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, 1.0f, 0.0f, 1.0f);
            this.cachedActivePath.cubicTo(-0.5522848f, 1.0f, -1.0f, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, -1.0f, 0.0f);
            this.cachedActivePath.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.cachedActivePath.cubicTo(QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.transform.reset();
        Matrix matrix = this.transform;
        float f10 = this.adjustedRadius;
        matrix.setScale(f10, f10);
        this.cachedActivePath.transform(this.transform);
        if (((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            this.activePathMeasure.setPath(this.cachedActivePath, false);
            createWavyPath(this.activePathMeasure, this.cachedActivePath, this.cachedAmplitude);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, float f10, float f11, float f12) {
        float fMin = Math.min(f11, this.displayedTrackThickness);
        float f13 = f10 / 2.0f;
        float fMin2 = Math.min(f13, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f10) / 2.0f, (-fMin) / 2.0f, f13, fMin / 2.0f);
        canvas.save();
        float[] fArr = pathPoint.posVec;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
        canvas.scale(f12, f12);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
