package androidx.constraintlayout.utils.widget;

import O.l;
import T.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.core.motion.utils.b;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.m;
import androidx.constraintlayout.motion.widget.n;
import androidx.constraintlayout.motion.widget.v;
import androidx.constraintlayout.widget.p;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Matrix f15593A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15594B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15595C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f15596H;
    public final Paint t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MotionLayout f15597v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f15598w;

    public MotionTelltales(Context context) {
        super(context);
        this.t = new Paint();
        this.f15598w = new float[2];
        this.f15593A = new Matrix();
        this.f15594B = 0;
        this.f15595C = -65281;
        this.f15596H = 0.25f;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.MotionTelltales);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.MotionTelltales_telltales_tailColor) {
                    this.f15595C = typedArrayObtainStyledAttributes.getColor(index, this.f15595C);
                } else if (index == p.MotionTelltales_telltales_velocityMode) {
                    this.f15594B = typedArrayObtainStyledAttributes.getInt(index, this.f15594B);
                } else if (index == p.MotionTelltales_telltales_tailScale) {
                    this.f15596H = typedArrayObtainStyledAttributes.getFloat(index, this.f15596H);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i10 = this.f15595C;
        Paint paint = this.t;
        paint.setColor(i10);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        char c6;
        int i7;
        char c10;
        f fVar;
        float f10;
        float f11;
        float[] fArr;
        double[] dArr;
        l lVar;
        MotionTelltales motionTelltales = this;
        int i10 = 5;
        super.onDraw(canvas);
        Matrix matrix = motionTelltales.getMatrix();
        Matrix matrix2 = motionTelltales.f15593A;
        matrix.invert(matrix2);
        if (motionTelltales.f15597v == null) {
            ViewParent parent = motionTelltales.getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.f15597v = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = motionTelltales.getWidth();
        int height = motionTelltales.getHeight();
        float[] fArr2 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i11 = 0;
        while (i11 < i10) {
            float f12 = fArr2[i11];
            int i12 = 0;
            while (i12 < i10) {
                float f13 = fArr2[i12];
                MotionLayout motionLayout = motionTelltales.f15597v;
                int i13 = motionTelltales.f15594B;
                float fA = motionLayout.f15296d;
                float interpolation = motionLayout.f15259A;
                if (motionLayout.f15292b != null) {
                    float fSignum = Math.signum(motionLayout.f15263C - interpolation);
                    float interpolation2 = motionLayout.f15292b.getInterpolation(motionLayout.f15259A + 1.0E-5f);
                    c6 = 1;
                    interpolation = motionLayout.f15292b.getInterpolation(motionLayout.f15259A);
                    fA = (((interpolation2 - interpolation) / 1.0E-5f) * fSignum) / motionLayout.f15312v;
                } else {
                    c6 = 1;
                }
                n nVar = motionLayout.f15292b;
                if (nVar != null) {
                    fA = nVar.a();
                }
                float f14 = fA;
                m mVar = (m) motionLayout.f15305p.get(motionTelltales);
                int i14 = i13 & 1;
                float f15 = f13;
                float f16 = f12;
                float[] fArr3 = motionTelltales.f15598w;
                if (i14 == 0) {
                    int width2 = motionTelltales.getWidth();
                    int height2 = motionTelltales.getHeight();
                    float[] fArr4 = mVar.f15401v;
                    float fD = mVar.d(interpolation, fArr4);
                    c10 = 0;
                    HashMap map = mVar.f15404y;
                    b bVar = map == null ? null : (b) map.get("translationX");
                    HashMap map2 = mVar.f15404y;
                    b bVar2 = map2 == null ? null : (b) map2.get("translationY");
                    HashMap map3 = mVar.f15404y;
                    b bVar3 = map3 == null ? null : (b) map3.get(ViewProps.ROTATION);
                    HashMap map4 = mVar.f15404y;
                    i7 = i13;
                    b bVar4 = map4 == null ? null : (b) map4.get(ViewProps.SCALE_X);
                    HashMap map5 = mVar.f15404y;
                    b bVar5 = map5 == null ? null : (b) map5.get(ViewProps.SCALE_Y);
                    HashMap map6 = mVar.f15405z;
                    f fVar2 = map6 == null ? null : (f) map6.get("translationX");
                    HashMap map7 = mVar.f15405z;
                    f fVar3 = map7 == null ? null : (f) map7.get("translationY");
                    HashMap map8 = mVar.f15405z;
                    f fVar4 = map8 == null ? null : (f) map8.get(ViewProps.ROTATION);
                    HashMap map9 = mVar.f15405z;
                    f fVar5 = map9 == null ? null : (f) map9.get(ViewProps.SCALE_X);
                    HashMap map10 = mVar.f15405z;
                    f fVar6 = map10 != null ? (f) map10.get(ViewProps.SCALE_Y) : null;
                    l lVar2 = new l();
                    lVar2.f6528e = 0.0f;
                    lVar2.f6527d = 0.0f;
                    lVar2.f6526c = 0.0f;
                    lVar2.f6525b = 0.0f;
                    lVar2.f6524a = 0.0f;
                    if (bVar3 != null) {
                        lVar2.f6528e = (float) bVar3.f15124a.A(fD);
                        lVar2.f6529f = bVar3.a(fD);
                    }
                    if (bVar != null) {
                        lVar2.f6526c = (float) bVar.f15124a.A(fD);
                    }
                    if (bVar2 != null) {
                        lVar2.f6527d = (float) bVar2.f15124a.A(fD);
                    }
                    if (bVar4 != null) {
                        lVar2.f6524a = (float) bVar4.f15124a.A(fD);
                    }
                    if (bVar5 != null) {
                        lVar2.f6525b = (float) bVar5.f15124a.A(fD);
                    }
                    if (fVar4 != null) {
                        lVar2.f6528e = fVar4.b(fD);
                    }
                    if (fVar2 != null) {
                        lVar2.f6526c = fVar2.b(fD);
                    }
                    if (fVar3 != 0) {
                        lVar2.f6527d = fVar.b(fD);
                    }
                    if (fVar5 != null) {
                        fVar = fVar3;
                        fVar = fVar3;
                        lVar2.f6524a = fVar5.b(fD);
                    }
                    if (fVar6 != null) {
                        lVar2.f6525b = fVar6.b(fD);
                    }
                    O.b bVar6 = mVar.f15391k;
                    if (bVar6 != null) {
                        double[] dArr2 = mVar.f15396p;
                        if (dArr2.length > 0) {
                            double d2 = fD;
                            bVar6.w(d2, dArr2);
                            mVar.f15391k.B(d2, mVar.f15397q);
                            int[] iArr = mVar.f15395o;
                            double[] dArr3 = mVar.f15397q;
                            double[] dArr4 = mVar.f15396p;
                            mVar.f15386f.getClass();
                            v.f(f15, f16, fArr3, iArr, dArr3, dArr4);
                            fArr = fArr3;
                            f11 = f16;
                            f10 = f15;
                            lVar = lVar2;
                        } else {
                            lVar = lVar2;
                            f10 = f15;
                            f11 = f16;
                            fArr = fArr3;
                        }
                        lVar.a(f10, f11, width2, height2, fArr);
                    } else {
                        i7 = i7;
                        if (mVar.f15390j != null) {
                            double d10 = mVar.d(fD, fArr4);
                            mVar.f15390j[0].B(d10, mVar.f15397q);
                            mVar.f15390j[0].w(d10, mVar.f15396p);
                            float f17 = fArr4[0];
                            int i15 = 0;
                            while (true) {
                                dArr = mVar.f15397q;
                                if (i15 >= dArr.length) {
                                    break;
                                }
                                dArr[i15] = dArr[i15] * ((double) f17);
                                i15++;
                            }
                            int[] iArr2 = mVar.f15395o;
                            double[] dArr5 = mVar.f15396p;
                            mVar.f15386f.getClass();
                            v.f(f15, f16, fArr3, iArr2, dArr, dArr5);
                            fArr = fArr3;
                            f11 = f16;
                            f10 = f15;
                            lVar2.a(f10, f11, width2, height2, fArr);
                        } else {
                            v vVar = mVar.f15387g;
                            float f18 = vVar.f15453e;
                            v vVar2 = mVar.f15386f;
                            float f19 = f18 - vVar2.f15453e;
                            float f20 = vVar.f15454f - vVar2.f15454f;
                            float f21 = vVar.f15455g - vVar2.f15455g;
                            float f22 = f20 + (vVar.f15456i - vVar2.f15456i);
                            fArr3[0] = ((f19 + f21) * f15) + ((1.0f - f15) * f19);
                            fArr3[c6] = (f22 * f16) + ((1.0f - f16) * f20);
                            lVar2.f6528e = 0.0f;
                            lVar2.f6527d = 0.0f;
                            lVar2.f6526c = 0.0f;
                            lVar2.f6525b = 0.0f;
                            lVar2.f6524a = 0.0f;
                            if (bVar3 != null) {
                                lVar2.f6528e = (float) bVar3.f15124a.A(fD);
                                lVar2.f6529f = bVar3.a(fD);
                            }
                            if (bVar != null) {
                                lVar2.f6526c = (float) bVar.f15124a.A(fD);
                            }
                            if (bVar2 != null) {
                                lVar2.f6527d = (float) bVar2.f15124a.A(fD);
                            }
                            if (bVar4 != null) {
                                lVar2.f6524a = (float) bVar4.f15124a.A(fD);
                            }
                            if (bVar5 != null) {
                                lVar2.f6525b = (float) bVar5.f15124a.A(fD);
                            }
                            if (fVar4 != null) {
                                lVar2.f6528e = fVar4.b(fD);
                            }
                            if (fVar2 != null) {
                                lVar2.f6526c = fVar2.b(fD);
                            }
                            if (fVar != null) {
                                lVar2.f6527d = fVar.b(fD);
                            }
                            if (fVar5 != null) {
                                lVar2.f6524a = fVar5.b(fD);
                            }
                            if (fVar6 != 0) {
                                lVar2.f6525b = fVar6.b(fD);
                            }
                            f10 = f15;
                            f11 = f16;
                            fArr = fArr3;
                            lVar2.a(f10, f11, width2, height2, fArr);
                        }
                        f15 = f10;
                        f16 = f11;
                        fArr3 = fArr;
                    }
                    i7 = i7;
                    f15 = f10;
                    f16 = f11;
                    fArr3 = fArr;
                } else {
                    i7 = i13;
                    c10 = 0;
                    mVar.f(interpolation, f15, f16, fArr3);
                }
                if (i7 < 2) {
                    fArr3[c10] = fArr3[c10] * f14;
                    fArr3[c6] = fArr3[c6] * f14;
                }
                motionTelltales = this;
                float[] fArr5 = motionTelltales.f15598w;
                Matrix matrix3 = matrix2;
                matrix3.mapVectors(fArr5);
                width = width;
                float f23 = width * f15;
                int i16 = height;
                float f24 = i16 * f16;
                float f25 = fArr5[c10];
                float f26 = motionTelltales.f15596H;
                float f27 = f24 - (fArr5[c6] * f26);
                matrix3.mapVectors(fArr5);
                canvas.drawLine(f23, f24, f23 - (f25 * f26), f27, motionTelltales.t);
                i12++;
                height = i16;
                f12 = f16;
                fArr2 = fArr2;
                i11 = i11;
                i10 = 5;
                matrix2 = matrix3;
            }
            i11++;
            i10 = 5;
            matrix2 = matrix2;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        postInvalidate();
    }

    public void setText(CharSequence text) {
        this.f15537f = text.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.t = new Paint();
        this.f15598w = new float[2];
        this.f15593A = new Matrix();
        this.f15594B = 0;
        this.f15595C = -65281;
        this.f15596H = 0.25f;
        b(context, attrs);
    }

    public MotionTelltales(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.t = new Paint();
        this.f15598w = new float[2];
        this.f15593A = new Matrix();
        this.f15594B = 0;
        this.f15595C = -65281;
        this.f15596H = 0.25f;
        b(context, attrs);
    }
}
