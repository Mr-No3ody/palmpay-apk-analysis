package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.appcompat.widget.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0853d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f12877l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f12878m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12879a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12880b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12881c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12882d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12883e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f12884f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12885g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f12886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f12887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f12888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0847a0 f12889k;

    public C0853d0(TextView textView) {
        this.f12887i = textView;
        this.f12888j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12889k = new C0849b0();
        } else {
            this.f12889k = new C0847a0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr) {
                if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f12878m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, new Object[0]);
        } catch (Exception unused) {
            return obj;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f12880b) {
                if (this.f12887i.getMeasuredHeight() <= 0 || this.f12887i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f12889k.b(this.f12887i) ? 1048576 : (this.f12887i.getMeasuredWidth() - this.f12887i.getTotalPaddingLeft()) - this.f12887i.getTotalPaddingRight();
                int height = (this.f12887i.getHeight() - this.f12887i.getCompoundPaddingBottom()) - this.f12887i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f12877l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f12887i.getTextSize()) {
                            g(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f12880b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f12884f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 <= i7) {
            int i12 = (i11 + i7) / 2;
            int i13 = this.f12884f[i12];
            TextView textView = this.f12887i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f12886h;
            if (textPaint == null) {
                this.f12886h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f12886h.set(textView.getPaint());
            this.f12886h.setTextSize(i13);
            StaticLayout staticLayoutA = Z.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, textView, this.f12886h, this.f12889k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i7 = i10;
            }
        }
        return this.f12884f[i10];
    }

    public final boolean f() {
        return j() && this.f12879a != 0;
    }

    public final void g(int i7, float f10) {
        Context context = this.f12888j;
        float fApplyDimension = TypedValue.applyDimension(i7, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f12887i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f12880b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f12879a == 1) {
            if (!this.f12885g || this.f12884f.length == 0) {
                int iFloor = ((int) Math.floor((this.f12883e - this.f12882d) / this.f12881c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f12881c) + this.f12882d);
                }
                this.f12884f = b(iArr);
            }
            this.f12880b = true;
        } else {
            this.f12880b = false;
        }
        return this.f12880b;
    }

    public final boolean i() {
        int[] iArr = this.f12884f;
        int length = iArr.length;
        boolean z3 = length > 0;
        this.f12885g = z3;
        if (z3) {
            this.f12879a = 1;
            this.f12882d = iArr[0];
            this.f12883e = iArr[length - 1];
            this.f12881c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.f12887i instanceof AppCompatEditText);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f12879a = 1;
        this.f12882d = f10;
        this.f12883e = f11;
        this.f12881c = f12;
        this.f12885g = false;
    }
}
