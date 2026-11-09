package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.PixelUtil;

/* JADX INFO: loaded from: classes.dex */
public class LinearGradientView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f19279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f19280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f19281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f19282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f19283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f19284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f19285g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f19287j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f19288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f19289p;
    public float[] t;

    public LinearGradientView(Context context) {
        super(context);
        this.f19279a = new Paint(1);
        this.f19283e = new float[]{0.0f, 0.0f};
        this.f19284f = new float[]{0.0f, 1.0f};
        this.f19286i = false;
        this.f19287j = new float[]{0.5f, 0.5f};
        this.f19288o = 45.0f;
        this.f19289p = new int[]{0, 0};
        this.t = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final void a() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        int[] iArr = this.f19285g;
        if (iArr != null) {
            float[] fArr5 = this.f19282d;
            if (fArr5 == null || iArr.length == fArr5.length) {
                if (!this.f19286i || this.f19287j == null) {
                    float[] fArr6 = this.f19283e;
                    float f10 = fArr6[0];
                    int[] iArr2 = this.f19289p;
                    float f11 = iArr2[0];
                    float f12 = fArr6[1];
                    float f13 = iArr2[1];
                    fArr = new float[]{f10 * f11, f12 * f13};
                    float[] fArr7 = this.f19284f;
                    fArr2 = new float[]{fArr7[0] * f11, fArr7[1] * f13};
                } else {
                    float f14 = 90.0f - this.f19288o;
                    int[] iArr3 = this.f19289p;
                    float f15 = f14 % 360.0f;
                    if (f15 < 0.0f) {
                        f15 += 360.0f;
                    }
                    if (f15 % 90.0f == 0.0f) {
                        float f16 = iArr3[0] / 2.0f;
                        float f17 = iArr3[1] / 2.0f;
                        if (f15 == 0.0f) {
                            fArr4 = new float[]{-f16, 0.0f};
                        } else if (f15 == 90.0f) {
                            fArr4 = new float[]{0.0f, -f17};
                        } else {
                            fArr4 = f15 == 180.0f ? new float[]{f16, 0.0f} : new float[]{0.0f, f17};
                        }
                    } else {
                        float fTan = (float) Math.tan((((double) f15) * 3.141592653589793d) / 180.0d);
                        float f18 = (-1.0f) / fTan;
                        float f19 = iArr3[0] / 2.0f;
                        float f20 = iArr3[1] / 2.0f;
                        if (f15 < 90.0f) {
                            fArr3 = new float[]{-f19, -f20};
                        } else if (f15 < 180.0f) {
                            fArr3 = new float[]{f19, -f20};
                        } else {
                            fArr3 = f15 < 270.0f ? new float[]{f19, f20} : new float[]{-f19, f20};
                        }
                        float f21 = (fArr3[1] - (fArr3[0] * f18)) / (fTan - f18);
                        fArr4 = new float[]{f21, fTan * f21};
                    }
                    float[] fArr8 = this.f19287j;
                    float f22 = fArr8[0];
                    int[] iArr4 = this.f19289p;
                    float[] fArr9 = {f22 * iArr4[0], fArr8[1] * iArr4[1]};
                    fArr = new float[]{fArr9[0] + fArr4[0], fArr9[1] - fArr4[1]};
                    fArr2 = new float[]{fArr9[0] - fArr4[0], fArr9[1] + fArr4[1]};
                }
                this.f19279a.setShader(new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.f19285g, this.f19282d, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    public final void b() {
        if (this.f19280b == null) {
            this.f19280b = new Path();
            this.f19281c = new RectF();
        }
        this.f19280b.reset();
        RectF rectF = this.f19281c;
        int[] iArr = this.f19289p;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f19280b.addRoundRect(this.f19281c, this.t, Path.Direction.CW);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f19280b;
        Paint paint = this.f19279a;
        if (path == null) {
            canvas.drawPaint(paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        this.f19289p = new int[]{i7, i10};
        b();
        a();
    }

    public void setAngle(float f10) {
        this.f19288o = f10;
        a();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.f19287j = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i7));
        }
        this.t = fArr;
        b();
        a();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = readableArray.getType(i7) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(i7), getContext()).intValue() : readableArray.getInt(i7);
        }
        this.f19285g = iArr;
        a();
    }

    public void setEndPoint(ReadableArray readableArray) {
        this.f19284f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = (float) readableArray.getDouble(i7);
        }
        this.f19282d = fArr;
        a();
    }

    public void setStartPoint(ReadableArray readableArray) {
        this.f19283e = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setUseAngle(boolean z3) {
        this.f19286i = z3;
        a();
    }
}
