package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.d;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;

    @NonNull
    private final Paint cornerShadowPaint;

    @NonNull
    private final Paint edgeShadowPaint;
    private final Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;

    @NonNull
    private final Paint shadowPaint;
    private int shadowStartColor;
    private final Paint transparentPaint;
    private static final int[] edgeColors = new int[3];
    private static final float[] edgePositions = {0.0f, 0.5f, 1.0f};
    private static final int[] cornerColors = new int[4];
    private static final float[] cornerPositions = {0.0f, 0.0f, 0.5f, 1.0f};

    public ShadowRenderer() {
        this(-16777216);
    }

    public void drawCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i7, float f10, float f11) {
        float f12;
        boolean z3 = f11 < 0.0f;
        Path path = this.scratch;
        if (z3) {
            int[] iArr = cornerColors;
            iArr[0] = 0;
            iArr[1] = this.shadowEndColor;
            iArr[2] = this.shadowMiddleColor;
            iArr[3] = this.shadowStartColor;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i7;
            rectF.inset(f13, f13);
            int[] iArr2 = cornerColors;
            iArr2[0] = 0;
            iArr2[1] = this.shadowStartColor;
            iArr2[2] = this.shadowMiddleColor;
            iArr2[3] = this.shadowEndColor;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i7 / fWidth);
        float[] fArr = cornerPositions;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.cornerShadowPaint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, cornerColors, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.transparentPaint);
        }
        canvas.drawArc(rectF, f12, f11, true, this.cornerShadowPaint);
        canvas.restore();
    }

    public void drawEdgeShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i7) {
        rectF.bottom += i7;
        rectF.offset(0.0f, -i7);
        int[] iArr = edgeColors;
        iArr[0] = this.shadowEndColor;
        iArr[1] = this.shadowMiddleColor;
        iArr[2] = this.shadowStartColor;
        Paint paint = this.edgeShadowPaint;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, edgePositions, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.edgeShadowPaint);
        canvas.restore();
    }

    public void drawInnerCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i7, float f10, float f11, @NonNull float[] fArr) {
        if (f11 > 0.0f) {
            f10 += f11;
            f11 = -f11;
        }
        float f12 = f10;
        float f13 = f11;
        drawCornerShadow(canvas, matrix, rectF, i7, f12, f13);
        Path path = this.scratch;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f12, f13);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.transparentPaint);
        canvas.drawPath(path, this.shadowPaint);
        canvas.restore();
    }

    @NonNull
    public Paint getShadowPaint() {
        return this.shadowPaint;
    }

    public void setShadowColor(int i7) {
        this.shadowStartColor = d.e(i7, COLOR_ALPHA_START);
        this.shadowMiddleColor = d.e(i7, 20);
        this.shadowEndColor = d.e(i7, 0);
        this.shadowPaint.setColor(this.shadowStartColor);
    }

    public ShadowRenderer(int i7) {
        this.scratch = new Path();
        Paint paint = new Paint();
        this.transparentPaint = paint;
        this.shadowPaint = new Paint();
        setShadowColor(i7);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.cornerShadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.edgeShadowPaint = new Paint(paint2);
    }
}
