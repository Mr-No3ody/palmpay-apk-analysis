package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import p118hf.a;

/* JADX INFO: loaded from: classes2.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float adjustedWavelength;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedInnerCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> endPoints;

    @FloatRange(from = 0.0d, to = 1.0d)
    private float totalTrackLengthFraction;
    private float trackLength;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair, float f10, float f11, float f12, float f13) {
        int i7 = this.drawingDeterminateIndicator ? ((LinearProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
        if (pathMeasure == this.activePathMeasure && i7 != this.cachedWavelength) {
            this.cachedWavelength = i7;
            invalidateCachedPaths();
        }
        path.rewind();
        float f14 = (-this.trackLength) / 2.0f;
        boolean zHasWavyEffect = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator);
        if (zHasWavyEffect) {
            float f15 = this.trackLength;
            float f16 = this.adjustedWavelength;
            float f17 = f15 / f16;
            float f18 = f13 / f17;
            float f19 = f17 / (f17 + 1.0f);
            f10 = (f10 + f18) * f19;
            f11 = (f11 + f18) * f19;
            f14 -= f13 * f16;
        }
        float length = pathMeasure.getLength() * f10;
        float length2 = pathMeasure.getLength() * f11;
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setTranslate(f14, 0.0f);
        pathPoint.translate(f14, 0.0f);
        pathPoint2.translate(f14, 0.0f);
        if (zHasWavyEffect) {
            float f20 = this.displayedAmplitude * f12;
            this.transform.postScale(1.0f, f20);
            pathPoint.scale(1.0f, f20);
            pathPoint2.scale(1.0f, f20);
        }
        path.transform(this.transform);
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @ColorInt int i7, @Px int i10, @Px int i11, float f12, float f13, boolean z3) {
        float f14;
        float fLerp;
        Paint paint2;
        Canvas canvas2;
        float fL = a.l(f10, 0.0f, 1.0f);
        float fL2 = a.l(f11, 0.0f, 1.0f);
        float fLerp2 = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fL);
        float fLerp3 = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fL2);
        int iL = (int) ((a.l(fLerp2, 0.0f, 0.01f) * i10) / 0.01f);
        float fL3 = 1.0f - a.l(fLerp3, 0.99f, 1.0f);
        float f15 = this.trackLength;
        int i12 = (int) ((fLerp2 * f15) + iL);
        int i13 = (int) ((fLerp3 * f15) - ((int) ((fL3 * i11) / 0.01f)));
        float f16 = this.displayedCornerRadius;
        float f17 = this.displayedInnerCornerRadius;
        if (f16 != f17) {
            float fMax = Math.max(f16, f17);
            float f18 = this.trackLength;
            float f19 = fMax / f18;
            float fLerp4 = MathUtils.lerp(this.displayedCornerRadius, this.displayedInnerCornerRadius, a.l(i12 / f18, 0.0f, f19) / f19);
            float f20 = this.displayedCornerRadius;
            float f21 = this.displayedInnerCornerRadius;
            float f22 = this.trackLength;
            fLerp = MathUtils.lerp(f20, f21, a.l((f22 - i13) / f22, 0.0f, f19) / f19);
            f14 = fLerp4;
        } else {
            f14 = f16;
            fLerp = f14;
        }
        float f23 = (-this.trackLength) / 2.0f;
        boolean z8 = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z3 && f12 > 0.0f;
        if (i12 <= i13) {
            float f24 = i12 + f14;
            float f25 = i13 - fLerp;
            float f26 = f14 * 2.0f;
            float f27 = 2.0f * fLerp;
            paint.setColor(i7);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.first).translate(f24 + f23, 0.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).translate(f23 + f25, 0.0f);
            if (i12 == 0 && f25 + fLerp < f24 + f14) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
                float f28 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint, f26, f28, f14, (DrawingDelegate.PathPoint) pair.second, f27, f28, fLerp, true);
                return;
            }
            if (f24 - f14 > f25 - fLerp) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair2 = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair2.second;
                float f29 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint2, f27, f29, fLerp, (DrawingDelegate.PathPoint) pair2.first, f26, f29, f14, false);
                return;
            }
            float f30 = fLerp;
            float f31 = f14;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.spec).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z8) {
                paint2 = paint;
                PathMeasure pathMeasure = this.activePathMeasure;
                Path path = this.displayedActivePath;
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair3 = this.endPoints;
                float f32 = this.trackLength;
                calculateDisplayedPath(pathMeasure, path, pair3, f24 / f32, f25 / f32, f12, f13);
                canvas2 = canvas;
                canvas2.drawPath(this.displayedActivePath, paint2);
            } else {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair4 = this.endPoints;
                Object obj = pair4.first;
                float f33 = ((DrawingDelegate.PathPoint) obj).posVec[0];
                float f34 = ((DrawingDelegate.PathPoint) obj).posVec[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f33, f34, ((DrawingDelegate.PathPoint) obj2).posVec[0], ((DrawingDelegate.PathPoint) obj2).posVec[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            }
            if (((LinearProgressIndicatorSpec) this.spec).useStrokeCap()) {
                return;
            }
            if (f24 > 0.0f && f31 > 0.0f) {
                drawRoundedBlock(canvas2, paint2, (DrawingDelegate.PathPoint) this.endPoints.first, f26, this.displayedTrackThickness, f31);
            }
            if (f25 >= this.trackLength || f30 <= 0.0f) {
                return;
            }
            drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f27, this.displayedTrackThickness, f30);
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f10, float f11, float f12) {
        drawRoundedBlock(canvas, paint, pathPoint, f10, f11, f12, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f10, boolean z3, boolean z8) {
        if (this.trackLength != rect.width()) {
            this.trackLength = rect.width();
            invalidateCachedPaths();
        }
        float preferredHeight = getPreferredHeight();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - preferredHeight) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f11 = this.trackLength / 2.0f;
        float f12 = preferredHeight / 2.0f;
        canvas.clipRect(-f11, -f12, f11, f12);
        S s3 = this.spec;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s3).trackThickness * f10;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s3).trackThickness / 2, ((LinearProgressIndicatorSpec) s3).getTrackCornerRadiusInPx()) * f10;
        S s8 = this.spec;
        this.displayedAmplitude = ((LinearProgressIndicatorSpec) s8).waveAmplitude * f10;
        this.displayedInnerCornerRadius = Math.min(((LinearProgressIndicatorSpec) s8).trackThickness / 2.0f, ((LinearProgressIndicatorSpec) s8).getTrackInnerCornerRadiusInPx()) * f10;
        if (z3 || z8) {
            if ((z3 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z8 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z3 || (z8 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, ((1.0f - f10) * ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f);
            }
        }
        if (z8 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f10;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i7, i10);
        this.drawingDeterminateIndicator = false;
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        S s3 = this.spec;
        DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint(new float[]{(this.trackLength / 2.0f) - (((LinearProgressIndicatorSpec) s3).trackStopIndicatorPadding != null ? (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize / 2.0f) + ((LinearProgressIndicatorSpec) s3).trackStopIndicatorPadding.floatValue() : this.displayedTrackThickness / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        S s8 = this.spec;
        drawRoundedBlock(canvas, paint, pathPoint, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize, (this.displayedCornerRadius * ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize) / this.displayedTrackThickness);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i7) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i7);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f10 = activeIndicator.startFraction;
        float f11 = activeIndicator.endFraction;
        int i10 = activeIndicator.gapSize;
        drawLine(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i10, i10, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i7, int i10, @Px int i11) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i7, i10);
        this.drawingDeterminateIndicator = false;
        drawLine(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i11, i11, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        S s3 = this.spec;
        return (((LinearProgressIndicatorSpec) s3).waveAmplitude * 2) + ((LinearProgressIndicatorSpec) s3).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void invalidateCachedPaths() {
        this.cachedActivePath.rewind();
        if (((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            int i7 = this.drawingDeterminateIndicator ? ((LinearProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
            float f10 = this.trackLength;
            int i10 = (int) (f10 / i7);
            this.adjustedWavelength = f10 / i10;
            for (int i11 = 0; i11 <= i10; i11++) {
                int i12 = i11 * 2;
                float f11 = i12 + 1;
                this.cachedActivePath.cubicTo(i12 + 0.48f, 0.0f, f11 - 0.48f, 1.0f, f11, 1.0f);
                float f12 = i12 + 2;
                this.cachedActivePath.cubicTo(f11 + 0.48f, 1.0f, f12 - 0.48f, 0.0f, f12, 0.0f);
            }
            this.transform.reset();
            this.transform.setScale(this.adjustedWavelength / 2.0f, -2.0f);
            this.transform.postTranslate(0.0f, 1.0f);
            this.cachedActivePath.transform(this.transform);
        } else {
            this.cachedActivePath.lineTo(this.trackLength, 0.0f);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f10, float f11, float f12, @Nullable DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2, float f13, float f14, float f15, boolean z3) {
        char c6;
        float f16;
        float f17;
        float fMin = Math.min(f11, this.displayedTrackThickness);
        float f18 = (-f10) / 2.0f;
        float f19 = (-fMin) / 2.0f;
        float f20 = f10 / 2.0f;
        float f21 = fMin / 2.0f;
        RectF rectF = new RectF(f18, f19, f20, f21);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pathPoint2 != null) {
            float fMin2 = Math.min(f14, this.displayedTrackThickness);
            float fMin3 = Math.min(f13 / 2.0f, (f15 * fMin2) / this.displayedTrackThickness);
            RectF rectF2 = new RectF();
            if (z3) {
                c6 = 0;
                float f22 = (pathPoint2.posVec[0] - fMin3) - (pathPoint.posVec[0] - f12);
                if (f22 > 0.0f) {
                    pathPoint2.translate((-f22) / 2.0f, 0.0f);
                    f17 = f13 + f22;
                } else {
                    f17 = f13;
                }
                rectF2.set(0.0f, f19, f20, f21);
            } else {
                c6 = 0;
                float f23 = (pathPoint2.posVec[0] + fMin3) - (pathPoint.posVec[0] + f12);
                if (f23 < 0.0f) {
                    pathPoint2.translate((-f23) / 2.0f, 0.0f);
                    f16 = f13 - f23;
                } else {
                    f16 = f13;
                }
                rectF2.set(f18, f19, 0.0f, f21);
                f17 = f16;
            }
            RectF rectF3 = new RectF((-f17) / 2.0f, (-fMin2) / 2.0f, f17 / 2.0f, fMin2 / 2.0f);
            float[] fArr = pathPoint2.posVec;
            canvas.translate(fArr[c6], fArr[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint2.tanVec));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-vectorToCanvasRotation(pathPoint2.tanVec));
            float[] fArr2 = pathPoint2.posVec;
            canvas.translate(-fArr2[c6], -fArr2[1]);
            float[] fArr3 = pathPoint.posVec;
            canvas.translate(fArr3[c6], fArr3[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f12, f12, paint);
        } else {
            float[] fArr4 = pathPoint.posVec;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        canvas.restore();
    }
}
