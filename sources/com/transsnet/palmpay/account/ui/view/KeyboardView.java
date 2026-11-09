package com.transsnet.palmpay.account.ui.view;

import F8.i;
import Gb.HandlerC0283f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p066e9.b;
import p066e9.c;
import p066e9.d;
import p066e9.e;

/* JADX INFO: loaded from: classes3.dex */
public class KeyboardView extends View implements View.OnClickListener {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int[] f26329l1 = {-5};

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int[] f26330m1 = {F8.a.state_long_pressable};

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f26331n1 = ViewConfiguration.getLongPressTimeout();

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f26332o1 = 12;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final PopupWindow f26333A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final Rect f26334A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f26335B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public long f26336B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public KeyboardView f26337C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public long f26338C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f26339D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f26340E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f26341F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f26342G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f26343H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public long f26344H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public long f26345I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final int[] f26346J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public GestureDetector f26347K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View f26348L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f26349L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f26350M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f26351M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f26352N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final int f26353O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f26354P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f26355Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public b f26356Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final Rect f26357R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f26358S0;
    public final e T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final int f26359U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f26360V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public float f26361W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public float f26362X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final Drawable f26363Y0;
    public final int[] Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f26364a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f26365a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26366b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f26367b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26368c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f26369c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26370d;
    public boolean d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26371e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final StringBuilder f26372e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26373f;
    public boolean f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26374g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final Rect f26375g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Bitmap f26376h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f26377i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f26378i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f26379j;
    public Canvas j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final HashMap f26380k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public HandlerC0283f f26381k1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PopupWindow f26382o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f26383p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public b[] f26384p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OnKeyboardActionListener f26385q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f26386r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f26387s0;
    public final int t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f26388t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f26389u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f26390v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f26391v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f26392w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f26393w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f26394x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f26395y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Paint f26396z0;

    public interface OnKeyboardActionListener {
        void onKey(int i7, int[] iArr);

        void onPress(int i7);

        void onRelease(int i7);

        void onText(CharSequence charSequence);

        void swipeDown();

        void swipeLeft();

        void swipeRight();

        void swipeUp();
    }

    public KeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, F8.a.keyboardViewStyle);
    }

    public final CharSequence a(CharSequence charSequence) {
        return (!this.f26364a.f36222e || charSequence == null || charSequence.length() >= 3 || !Character.isLowerCase(charSequence.charAt(0))) ? charSequence : charSequence.toString().toUpperCase();
    }

    public final void b(int i7, int i10, int i11, long j6) {
        if (i7 != -1) {
            b[] bVarArr = this.f26384p0;
            if (i7 < bVarArr.length) {
                b bVar = bVarArr[i7];
                CharSequence charSequence = bVar.f36204m;
                if (charSequence != null) {
                    this.f26385q0.onText(charSequence);
                    this.f26385q0.onRelease(-1);
                } else {
                    int i12 = bVar.f36192a[0];
                    int[] iArr = new int[f26332o1];
                    Arrays.fill(iArr, -1);
                    d(i10, i11, iArr);
                    if (this.d1) {
                        if (this.f26367b1 != -1) {
                            this.f26385q0.onKey(-5, f26329l1);
                        } else {
                            this.f26367b1 = 0;
                        }
                        i12 = bVar.f36192a[this.f26367b1];
                    }
                    this.f26385q0.onKey(i12, iArr);
                    this.f26385q0.onRelease(i12);
                }
                this.f26365a1 = i7;
                this.f26369c1 = j6;
            }
        }
    }

    public final void c() {
        PopupWindow popupWindow = this.f26333A;
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.f26343H = false;
            e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a1 A[LOOP:5: B:99:0x019f->B:100:0x01a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:101:0x01b0 A[LOOP:4: B:94:0x0188->B:101:0x01b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173 A[PHI: r6
      0x0173: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:85:0x0171, B:82:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x017d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x0186  */
    /* JADX WARN: Code duplicated, block: B:96:0x018b  */
    public final int d(int i7, int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        boolean z3;
        int iA;
        int[] iArr4;
        int length;
        int i11;
        int i12;
        KeyboardView keyboardView = this;
        b[] bVarArr = keyboardView.f26384p0;
        boolean z8 = true;
        int i13 = keyboardView.f26387s0 + 1;
        int[] iArr5 = keyboardView.Z0;
        Arrays.fill(iArr5, Integer.MAX_VALUE);
        d dVar = keyboardView.f26364a;
        if (dVar.f36233p == null) {
            dVar.f36231n = (dVar.f36226i + 9) / 10;
            dVar.f36232o = (dVar.f36225h + 4) / 5;
            dVar.f36233p = new int[50][];
            ArrayList arrayList = dVar.f36227j;
            int[] iArr6 = new int[arrayList.size()];
            int i14 = dVar.f36231n * 10;
            int i15 = dVar.f36232o * 5;
            int i16 = 0;
            while (i16 < i14) {
                boolean z10 = z8;
                int i17 = 0;
                while (i17 < i15) {
                    b[] bVarArr2 = bVarArr;
                    int i18 = 0;
                    int i19 = 0;
                    while (i19 < arrayList.size()) {
                        b bVar = (b) arrayList.get(i19);
                        int i20 = i13;
                        ArrayList arrayList2 = arrayList;
                        if (bVar.a(i16, i17) < dVar.f36234q || bVar.a((dVar.f36231n + i16) - 1, i17) < dVar.f36234q || bVar.a((dVar.f36231n + i16) - 1, (dVar.f36232o + i17) - 1) < dVar.f36234q || bVar.a(i16, (dVar.f36232o + i17) - 1) < dVar.f36234q) {
                            iArr6[i18] = i19;
                            i18++;
                        }
                        i19++;
                        i13 = i20;
                        arrayList = arrayList2;
                    }
                    int i21 = i13;
                    ArrayList arrayList3 = arrayList;
                    int[] iArr7 = new int[i18];
                    System.arraycopy(iArr6, 0, iArr7, 0, i18);
                    int[][] iArr8 = dVar.f36233p;
                    int i22 = dVar.f36232o;
                    iArr8[(i16 / dVar.f36231n) + ((i17 / i22) * 10)] = iArr7;
                    i17 += i22;
                    bVarArr = bVarArr2;
                    i13 = i21;
                    arrayList = arrayList3;
                }
                i16 += dVar.f36231n;
                z8 = z10;
                bVarArr = bVarArr;
            }
        }
        b[] bVarArr3 = bVarArr;
        int i23 = i13;
        boolean z11 = z8;
        if (i7 < 0 || i7 >= dVar.f36226i || i10 < 0 || i10 >= dVar.f36225h) {
            iArr2 = new int[0];
        } else {
            int i24 = (i7 / dVar.f36231n) + ((i10 / dVar.f36232o) * 10);
            if (i24 < 50) {
                iArr2 = dVar.f36233p[i24];
            } else {
                iArr2 = new int[0];
            }
        }
        int length2 = iArr2.length;
        int i25 = i23;
        int i26 = 0;
        int i27 = -1;
        int i28 = -1;
        while (i26 < length2) {
            int i29 = iArr2[i26];
            b bVar2 = bVarArr3[i29];
            int i30 = bVar2.f36206o;
            boolean z12 = (i30 & 1) > 0 ? z11 : false;
            boolean z13 = (i30 & 2) > 0 ? z11 : false;
            boolean z14 = (i30 & 4) > 0 ? z11 : false;
            boolean z15 = (i30 & 8) > 0 ? z11 : false;
            int i31 = bVar2.f36200i;
            if ((i7 >= i31 || (z12 && i7 <= bVar2.f36196e + i31)) && (i7 < bVar2.f36196e + i31 || (z13 && i7 >= i31))) {
                int i32 = bVar2.f36201j;
                int i33 = bVar2.f36197f;
                if (i10 >= i32) {
                    iArr3 = iArr2;
                } else if (z14) {
                    iArr3 = iArr2;
                    if (i10 <= i32 + i33) {
                    }
                } else {
                    iArr3 = iArr2;
                }
                z3 = (i10 < i33 + i32 || (z15 && i10 >= i32)) ? z11 : false;
            } else {
                iArr3 = iArr2;
            }
            if (z3) {
                i27 = i29;
            }
            if (keyboardView.f26395y0) {
                iA = bVar2.a(i7, i10);
                if (iA < keyboardView.f26387s0) {
                    iArr4 = bVar2.f36192a;
                    if (iArr4[0] > 32) {
                        length = iArr4.length;
                        if (iA < i25) {
                            i28 = iArr3[i26];
                            i25 = iA;
                        }
                        if (iArr == null) {
                            for (i11 = 0; i11 < iArr5.length; i11++) {
                                if (iArr5[i11] > iA) {
                                    int i34 = i11 + length;
                                    System.arraycopy(iArr5, i11, iArr5, i34, (iArr5.length - i11) - length);
                                    System.arraycopy(iArr, i11, iArr, i34, (iArr.length - i11) - length);
                                    for (i12 = 0; i12 < length; i12++) {
                                        int i35 = i11 + i12;
                                        iArr[i35] = bVar2.f36192a[i12];
                                        iArr5[i35] = iA;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                i26++;
                keyboardView = this;
                iArr2 = iArr3;
            } else {
                iA = 0;
            }
            if (z3) {
                iArr4 = bVar2.f36192a;
                if (iArr4[0] > 32) {
                    length = iArr4.length;
                    if (iA < i25) {
                        i28 = iArr3[i26];
                        i25 = iA;
                    }
                    if (iArr == null) {
                        while (i11 < iArr5.length) {
                            if (iArr5[i11] > iA) {
                                int i36 = i11 + length;
                                System.arraycopy(iArr5, i11, iArr5, i36, (iArr5.length - i11) - length);
                                System.arraycopy(iArr, i11, iArr, i36, (iArr.length - i11) - length);
                                while (i12 < length) {
                                    int i37 = i11 + i12;
                                    iArr[i37] = bVar2.f36192a[i12];
                                    iArr5[i37] = iA;
                                }
                                break;
                                break;
                            }
                        }
                    }
                }
            }
            i26++;
            keyboardView = this;
            iArr2 = iArr3;
        }
        return i27 == -1 ? i28 : i27;
    }

    public final void e() {
        this.f26375g1.union(0, 0, getWidth(), getHeight());
        this.f1 = true;
        invalidate();
    }

    public final void f(int i7) {
        b[] bVarArr = this.f26384p0;
        if (bVarArr != null && i7 >= 0 && i7 < bVarArr.length) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            b bVar = this.f26384p0[i7];
            this.f26356Q0 = bVar;
            int i10 = bVar.f36200i;
            int i11 = bVar.f36201j;
            this.f26375g1.union(i10 + paddingLeft, i11 + paddingTop, i10 + bVar.f36196e + paddingLeft, i11 + bVar.f36197f + paddingTop);
            g();
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    public final void g() {
        boolean z3;
        int i7;
        Bitmap bitmap = this.f26376h1;
        if (bitmap == null || this.f26378i1) {
            if (bitmap == null || (this.f26378i1 && (bitmap.getWidth() != getWidth() || this.f26376h1.getHeight() != getHeight()))) {
                this.f26376h1 = Bitmap.createBitmap(Math.max(1, getWidth()), Math.max(1, getHeight()), Bitmap.Config.ARGB_8888);
                this.j1 = new Canvas(this.f26376h1);
            }
            e();
            this.f26378i1 = false;
        }
        if (this.f26364a == null) {
            return;
        }
        this.j1.save();
        Canvas canvas = this.j1;
        Rect rect = this.f26375g1;
        canvas.clipRect(rect);
        Paint paint = this.f26396z0;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        b[] bVarArr = this.f26384p0;
        b bVar = this.f26356Q0;
        paint.setColor(this.f26371e);
        if (bVar != null) {
            Rect rect2 = this.f26357R0;
            if (canvas.getClipBounds(rect2)) {
                int i10 = bVar.f36200i;
                if ((i10 + paddingLeft) - 1 <= rect2.left) {
                    int i11 = bVar.f36201j;
                    if ((i11 + paddingTop) - 1 > rect2.top || i10 + bVar.f36196e + paddingLeft + 1 < rect2.right || i11 + bVar.f36197f + paddingTop + 1 < rect2.bottom) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        int length = bVarArr.length;
        int i12 = 0;
        while (i12 < length) {
            b bVar2 = bVarArr[i12];
            if (!z3 || bVar == bVar2) {
                int[] iArr = b.f36190w;
                if (bVar2.f36203l) {
                    iArr = bVar2.f36202k ? b.t : b.f36187s;
                } else if (bVar2.f36199h) {
                    iArr = bVar2.f36202k ? b.f36189v : b.f36188u;
                } else if (bVar2.f36202k) {
                    iArr = b.f36191x;
                }
                Drawable drawable = this.f26363Y0;
                drawable.setState(iArr);
                CharSequence charSequence = bVar2.f36193b;
                String string = charSequence == null ? null : a(charSequence).toString();
                Rect bounds = drawable.getBounds();
                int i13 = bVar2.f36196e;
                int i14 = bounds.right;
                i7 = paddingLeft;
                int i15 = bVar2.f36197f;
                if (i13 != i14 || i15 != bounds.bottom) {
                    drawable.setBounds(0, 0, i13, i15);
                }
                canvas.translate(bVar2.f36200i + i7, bVar2.f36201j + paddingTop);
                drawable.draw(canvas);
                Rect rect3 = this.f26334A0;
                if (string != null) {
                    if (string.length() <= 1 || bVar2.f36192a.length >= 2) {
                        paint.setTextSize(this.f26370d);
                        paint.setTypeface(Typeface.DEFAULT);
                    } else {
                        paint.setTextSize(this.f26368c);
                        paint.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    paint.setShadowLayer(this.f26373f, 0.0f, 0.0f, this.f26374g);
                    int i16 = bVar2.f36196e;
                    int i17 = rect3.left;
                    canvas.drawText(string, (((i16 - i17) - rect3.right) / 2) + i17, ((paint.getTextSize() - paint.descent()) / 2.0f) + (((i15 - rect3.top) - rect3.bottom) / 2) + rect3.top, paint);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                } else {
                    Drawable drawable2 = bVar2.f36194c;
                    if (drawable2 != null) {
                        int intrinsicWidth = ((((bVar2.f36196e - rect3.left) - rect3.right) - drawable2.getIntrinsicWidth()) / 2) + rect3.left;
                        int intrinsicHeight = ((((i15 - rect3.top) - rect3.bottom) - drawable2.getIntrinsicHeight()) / 2) + rect3.top;
                        canvas.translate(intrinsicWidth, intrinsicHeight);
                        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                        drawable2.draw(canvas);
                        canvas.translate(-intrinsicWidth, -intrinsicHeight);
                    }
                }
                canvas.translate((-bVar2.f36200i) - i7, (-bVar2.f36201j) - paddingTop);
            } else {
                i7 = paddingLeft;
            }
            i12++;
            rect = rect;
            paddingLeft = i7;
        }
        Rect rect4 = rect;
        this.f26356Q0 = null;
        if (this.f26343H) {
            paint.setColor(((int) (this.f26377i * 255.0f)) << 24);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        this.j1.restore();
        this.f1 = false;
        rect4.setEmpty();
    }

    public d getKeyboard() {
        return this.f26364a;
    }

    public OnKeyboardActionListener getOnKeyboardActionListener() {
        return this.f26385q0;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x021d  */
    public final void h(MotionEvent motionEvent, boolean z3) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int x3 = ((int) motionEvent.getX()) - getPaddingLeft();
        int y8 = ((int) motionEvent.getY()) - getPaddingTop();
        int i15 = this.f26386r0;
        if (y8 >= (-i15)) {
            y8 += i15;
        }
        int i16 = y8;
        int action = motionEvent.getAction();
        long eventTime = motionEvent.getEventTime();
        int iD = d(x3, i16, null);
        this.f26358S0 = z3;
        e eVar = this.T0;
        if (action == 0) {
            eVar.f36238c[0] = 0;
        }
        eVar.getClass();
        long eventTime2 = motionEvent.getEventTime();
        int historySize = motionEvent.getHistorySize();
        int i17 = 0;
        while (i17 < historySize) {
            eVar.a(motionEvent.getHistoricalX(i17), motionEvent.getHistoricalY(i17), motionEvent.getHistoricalEventTime(i17));
            i17++;
            x3 = x3;
            i16 = i16;
        }
        int i18 = x3;
        int i19 = i16;
        eVar.a(motionEvent.getX(), motionEvent.getY(), eventTime2);
        if (!this.f26354P0 || action == 0 || action == 3) {
            if (this.f26347K0.onTouchEvent(motionEvent)) {
                l(-1);
                this.f26381k1.removeMessages(3);
                this.f26381k1.removeMessages(4);
                return;
            }
            if (!this.f26343H || action == 3) {
                int i20 = f26331n1;
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            if (iD == -1) {
                                this.f26381k1.removeMessages(4);
                                if (iD != -1) {
                                    this.f26381k1.sendMessageDelayed(this.f26381k1.obtainMessage(4, motionEvent), i20);
                                }
                            } else {
                                int i21 = this.f26342G0;
                                if (i21 == -1) {
                                    this.f26342G0 = iD;
                                    this.f26345I0 = eventTime - this.f26336B0;
                                } else if (iD == i21) {
                                    this.f26345I0 = (eventTime - this.f26338C0) + this.f26345I0;
                                } else if (this.f26352N0 == -1) {
                                    j();
                                    this.f26339D0 = this.f26342G0;
                                    this.f26340E0 = this.f26393w0;
                                    this.f26341F0 = this.f26394x0;
                                    this.f26344H0 = (this.f26345I0 + eventTime) - this.f26338C0;
                                    this.f26342G0 = iD;
                                    this.f26345I0 = 0L;
                                }
                                this.f26381k1.removeMessages(4);
                                if (iD != -1) {
                                    this.f26381k1.sendMessageDelayed(this.f26381k1.obtainMessage(4, motionEvent), i20);
                                }
                            }
                            l(this.f26342G0);
                            this.f26338C0 = eventTime;
                        } else if (action == 3) {
                            i();
                            c();
                            this.f26354P0 = true;
                            l(-1);
                            f(this.f26342G0);
                        }
                        i7 = i19;
                    } else {
                        i();
                        if (iD == this.f26342G0) {
                            this.f26345I0 = (eventTime - this.f26338C0) + this.f26345I0;
                        } else {
                            j();
                            this.f26339D0 = this.f26342G0;
                            this.f26344H0 = (this.f26345I0 + eventTime) - this.f26338C0;
                            this.f26342G0 = iD;
                            this.f26345I0 = 0L;
                        }
                        long j6 = this.f26345I0;
                        if (j6 >= this.f26344H0 || j6 >= 70 || (i14 = this.f26339D0) == -1) {
                            i12 = i18;
                            i13 = i19;
                        } else {
                            this.f26342G0 = i14;
                            int i22 = this.f26340E0;
                            i13 = this.f26341F0;
                            i12 = i22;
                        }
                        l(-1);
                        Arrays.fill(this.f26346J0, -1);
                        if (this.f26352N0 == -1 && !this.f26343H && !this.f26354P0) {
                            b(this.f26342G0, i12, i13, eventTime);
                        }
                        f(iD);
                        this.f26352N0 = -1;
                        i11 = i12;
                        i10 = i13;
                    }
                    this.f26393w0 = i11;
                    this.f26394x0 = i10;
                }
                this.f26354P0 = false;
                this.f26340E0 = i18;
                i7 = i19;
                this.f26341F0 = i7;
                this.f26344H0 = 0L;
                this.f26345I0 = 0L;
                this.f26339D0 = -1;
                this.f26342G0 = iD;
                long eventTime3 = motionEvent.getEventTime();
                this.f26336B0 = eventTime3;
                this.f26338C0 = eventTime3;
                if (iD != -1) {
                    int[] iArr = this.f26384p0[iD].f36192a;
                    if (iArr.length > 1) {
                        this.d1 = true;
                        if (eventTime >= this.f26369c1 + 800 || iD != this.f26365a1) {
                            this.f26367b1 = -1;
                        } else {
                            this.f26367b1 = (this.f26367b1 + 1) % iArr.length;
                        }
                    } else if (eventTime > this.f26369c1 + 800 || iD != this.f26365a1) {
                        j();
                    }
                }
                this.f26385q0.onPress(iD != -1 ? this.f26384p0[iD].f36192a[0] : 0);
                int i23 = this.f26342G0;
                if (i23 < 0 || !this.f26384p0[i23].f36209r) {
                    if (this.f26342G0 != -1) {
                        this.f26381k1.sendMessageDelayed(this.f26381k1.obtainMessage(4, motionEvent), i20);
                    }
                    l(iD);
                } else {
                    this.f26352N0 = i23;
                    this.f26381k1.sendMessageDelayed(this.f26381k1.obtainMessage(3), 400L);
                    b bVar = this.f26384p0[this.f26352N0];
                    b(this.f26342G0, bVar.f36200i, bVar.f36201j, this.f26369c1);
                    if (this.f26354P0) {
                        this.f26352N0 = -1;
                    } else {
                        if (this.f26342G0 != -1) {
                            this.f26381k1.sendMessageDelayed(this.f26381k1.obtainMessage(4, motionEvent), i20);
                        }
                        l(iD);
                    }
                }
                i11 = i18;
                i10 = i7;
                this.f26393w0 = i11;
                this.f26394x0 = i10;
            }
        }
    }

    public final void i() {
        HandlerC0283f handlerC0283f = this.f26381k1;
        if (handlerC0283f != null) {
            handlerC0283f.removeMessages(3);
            this.f26381k1.removeMessages(4);
            this.f26381k1.removeMessages(1);
        }
    }

    public final void j() {
        this.f26365a1 = -1;
        this.f26367b1 = 0;
        this.f26369c1 = -1L;
        this.d1 = false;
    }

    public final void k(int i7) {
        CharSequence charSequenceA;
        PopupWindow popupWindow = this.f26382o;
        b[] bVarArr = this.f26384p0;
        if (i7 < 0 || i7 >= bVarArr.length) {
            return;
        }
        b bVar = bVarArr[i7];
        Drawable drawable = bVar.f36194c;
        TextView textView = this.f26379j;
        if (drawable != null) {
            Drawable drawable2 = bVar.f36195d;
            if (drawable2 != null) {
                drawable = drawable2;
            }
            textView.setCompoundDrawables(null, null, null, drawable);
            textView.setText((CharSequence) null);
        } else {
            textView.setCompoundDrawables(null, null, null, null);
            if (this.d1) {
                StringBuilder sb2 = this.f26372e1;
                sb2.setLength(0);
                int[] iArr = bVar.f36192a;
                int i10 = this.f26367b1;
                if (i10 < 0) {
                    i10 = 0;
                }
                sb2.append((char) iArr[i10]);
                charSequenceA = a(sb2);
            } else {
                charSequenceA = a(bVar.f36193b);
            }
            textView.setText(charSequenceA);
            if (bVar.f36193b.length() <= 1 || bVar.f36192a.length >= 2) {
                textView.setTextSize(0, this.f26383p);
                textView.setTypeface(Typeface.DEFAULT);
            } else {
                textView.setTextSize(0, this.f26370d);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iMax = Math.max(textView.getMeasuredWidth(), textView.getPaddingRight() + textView.getPaddingLeft() + bVar.f36196e);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        int i11 = this.f26390v;
        if (layoutParams != null) {
            layoutParams.width = iMax;
            layoutParams.height = i11;
        }
        this.f26389u0 = getPaddingLeft() + (bVar.f36200i - textView.getPaddingLeft());
        this.f26391v0 = (bVar.f36201j - i11) + this.t;
        this.f26381k1.removeMessages(2);
        int[] iArr2 = this.f26392w;
        getLocationInWindow(iArr2);
        iArr2[0] = iArr2[0] + this.f26350M;
        iArr2[1] = iArr2[1] + this.f26355Q;
        textView.getBackground().setState(bVar.f36208q != 0 ? f26330m1 : View.EMPTY_STATE_SET);
        this.f26389u0 += iArr2[0];
        this.f26391v0 += iArr2[1];
        getLocationOnScreen(iArr2);
        if (this.f26391v0 + iArr2[1] < 0) {
            if (bVar.f36200i + bVar.f36196e <= getWidth() / 2) {
                this.f26389u0 += (int) (((double) bVar.f36196e) * 2.5d);
            } else {
                this.f26389u0 -= (int) (((double) bVar.f36196e) * 2.5d);
            }
            this.f26391v0 += i11;
        }
        if (popupWindow.isShowing()) {
            popupWindow.update(this.f26389u0, this.f26391v0, iMax, i11);
        } else {
            popupWindow.setWidth(iMax);
            popupWindow.setHeight(i11);
            popupWindow.showAtLocation(this.f26348L, 0, this.f26389u0, this.f26391v0);
        }
        textView.setVisibility(0);
    }

    public final void l(int i7) {
        int i10 = this.f26366b;
        PopupWindow popupWindow = this.f26382o;
        this.f26366b = i7;
        b[] bVarArr = this.f26384p0;
        if (i10 != i7) {
            if (i10 != -1 && bVarArr.length > i10) {
                b bVar = bVarArr[i10];
                boolean z3 = i7 == -1;
                bVar.f36202k = !bVar.f36202k;
                if (bVar.f36199h && z3) {
                    bVar.f36203l = !bVar.f36203l;
                }
                f(i10);
            }
            int i11 = this.f26366b;
            if (i11 != -1 && bVarArr.length > i11) {
                b bVar2 = bVarArr[i11];
                bVar2.f36202k = !bVar2.f36202k;
                f(i11);
            }
        }
        if (i10 == this.f26366b || !this.f26388t0) {
            return;
        }
        this.f26381k1.removeMessages(1);
        if (popupWindow.isShowing() && i7 == -1) {
            HandlerC0283f handlerC0283f = this.f26381k1;
            handlerC0283f.sendMessageDelayed(handlerC0283f.obtainMessage(2), 70L);
        }
        if (i7 != -1) {
            if (popupWindow.isShowing() && this.f26379j.getVisibility() == 0) {
                k(i7);
            } else {
                HandlerC0283f handlerC0283f2 = this.f26381k1;
                handlerC0283f2.sendMessageDelayed(handlerC0283f2.obtainMessage(1, i7, 0), 0L);
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f26347K0 == null) {
            GestureDetector gestureDetector = new GestureDetector(getContext(), new androidx.camera.view.impl.e(this, 4));
            this.f26347K0 = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
        }
        if (this.f26381k1 == null) {
            this.f26381k1 = new HandlerC0283f(this, Looper.getMainLooper(), 5);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PopupWindow popupWindow = this.f26382o;
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        i();
        c();
        this.f26376h1 = null;
        this.j1 = null;
        this.f26380k0.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1 || this.f26376h1 == null || this.f26378i1) {
            g();
        }
        canvas.drawBitmap(this.f26376h1, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        d dVar = this.f26364a;
        if (dVar == null) {
            setMeasuredDimension(paddingLeft + paddingRight, paddingTop + paddingBottom);
            return;
        }
        int size = dVar.f36226i + paddingLeft + paddingRight;
        if (View.MeasureSpec.getSize(i7) < size + 10) {
            size = View.MeasureSpec.getSize(i7);
        }
        setMeasuredDimension(size, this.f26364a.f36225h + paddingTop + paddingBottom);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        ArrayList arrayList;
        super.onSizeChanged(i7, i10, i11, i12);
        d dVar = this.f26364a;
        if (dVar != null) {
            ArrayList arrayList2 = dVar.f36235r;
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = (c) arrayList2.get(i13);
                int size2 = cVar.f36214e.size();
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    arrayList = cVar.f36214e;
                    if (i14 >= size2) {
                        break;
                    }
                    b bVar = (b) arrayList.get(i14);
                    if (i14 > 0) {
                        i15 += bVar.f36198g;
                    }
                    i16 += bVar.f36196e;
                    i14++;
                }
                if (i15 + i16 > i7) {
                    float f10 = (i7 - i15) / i16;
                    int i17 = 0;
                    for (int i18 = 0; i18 < size2; i18++) {
                        b bVar2 = (b) arrayList.get(i18);
                        int i19 = (int) (bVar2.f36196e * f10);
                        bVar2.f36196e = i19;
                        bVar2.f36200i = i17;
                        i17 += i19 + bVar2.f36198g;
                    }
                }
            }
            dVar.f36226i = i7;
        }
        this.f26376h1 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        long eventTime = motionEvent.getEventTime();
        if (pointerCount != this.f26360V0) {
            if (pointerCount == 1) {
                MotionEvent motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
                h(motionEventObtain, false);
                motionEventObtain.recycle();
                if (action == 1) {
                    h(motionEvent, true);
                }
            } else {
                MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 1, this.f26361W0, this.f26362X0, motionEvent.getMetaState());
                h(motionEventObtain2, true);
                motionEventObtain2.recycle();
            }
        } else if (pointerCount == 1) {
            h(motionEvent, false);
            this.f26361W0 = motionEvent.getX();
            this.f26362X0 = motionEvent.getY();
        }
        this.f26360V0 = pointerCount;
        return true;
    }

    public void setKeyboard(d dVar) {
        if (this.f26364a != null) {
            l(-1);
        }
        i();
        this.f26364a = dVar;
        ArrayList arrayList = dVar.f36227j;
        this.f26384p0 = (b[]) arrayList.toArray(new b[arrayList.size()]);
        requestLayout();
        this.f26378i1 = true;
        e();
        b[] bVarArr = this.f26384p0;
        if (bVarArr != null) {
            int length = bVarArr.length;
            int iMin = 0;
            for (b bVar : bVarArr) {
                iMin += Math.min(bVar.f36196e, bVar.f36197f) + bVar.f36198g;
            }
            if (iMin >= 0 && length != 0) {
                int i7 = (int) ((iMin * 1.4f) / length);
                this.f26387s0 = i7 * i7;
            }
        }
        this.f26380k0.clear();
        this.f26354P0 = true;
    }

    public void setOnKeyboardActionListener(OnKeyboardActionListener onKeyboardActionListener) {
        this.f26385q0 = onKeyboardActionListener;
    }

    public void setPopupParent(View view) {
        this.f26348L = view;
    }

    public void setPreviewEnabled(boolean z3) {
        this.f26388t0 = z3;
    }

    public void setProximityCorrectionEnabled(boolean z3) {
        this.f26395y0 = z3;
    }

    public void setVerticalCorrection(int i7) {
    }

    public KeyboardView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        this.f26366b = -1;
        this.f26392w = new int[2];
        this.f26388t0 = true;
        this.f26342G0 = -1;
        this.f26346J0 = new int[12];
        this.f26352N0 = -1;
        this.f26357R0 = new Rect(0, 0, 0, 0);
        this.T0 = new e();
        this.f26360V0 = 1;
        this.Z0 = new int[f26332o1];
        this.f26372e1 = new StringBuilder(1);
        this.f26375g1 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.KeyboardView, i7, 0);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        int resourceId = 0;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == i.KeyboardView_keyBackground) {
                this.f26363Y0 = typedArrayObtainStyledAttributes.getDrawable(index);
            } else if (index == i.KeyboardView_verticalCorrection) {
                this.f26386r0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, 0);
            } else if (index == i.KeyboardView_keyPreviewLayout) {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == i.KeyboardView_keyPreviewOffset) {
                this.t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, 0);
            } else if (index == i.KeyboardView_keyPreviewHeight) {
                this.f26390v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 80);
            } else if (index == i.KeyboardView_keyTextSize) {
                this.f26370d = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 18);
            } else if (index == i.KeyboardView_keyTextColor) {
                this.f26371e = typedArrayObtainStyledAttributes.getColor(index, -16777216);
            } else if (index == i.KeyboardView_labelTextSize) {
                this.f26368c = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 14);
            } else if (index == i.KeyboardView_popupLayout) {
                this.f26353O0 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == i.KeyboardView_shadowColor) {
                this.f26374g = typedArrayObtainStyledAttributes.getColor(index, 0);
            } else if (index == i.KeyboardView_shadowRadius) {
                this.f26373f = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
            }
        }
        this.f26377i = 0.6f;
        PopupWindow popupWindow = new PopupWindow(context);
        this.f26382o = popupWindow;
        if (resourceId != 0) {
            TextView textView = (TextView) layoutInflater.inflate(resourceId, (ViewGroup) null);
            this.f26379j = textView;
            this.f26383p = (int) textView.getTextSize();
            popupWindow.setContentView(textView);
            popupWindow.setBackgroundDrawable(null);
        } else {
            this.f26388t0 = false;
        }
        popupWindow.setTouchable(false);
        PopupWindow popupWindow2 = new PopupWindow(context);
        this.f26333A = popupWindow2;
        popupWindow2.setBackgroundDrawable(null);
        this.f26348L = this;
        Paint paint = new Paint();
        this.f26396z0 = paint;
        paint.setAntiAlias(true);
        paint.setTextSize(0);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAlpha(255);
        Rect rect = new Rect(0, 0, 0, 0);
        this.f26334A0 = rect;
        this.f26380k0 = new HashMap();
        this.f26363Y0.getPadding(rect);
        this.f26359U0 = (int) (getResources().getDisplayMetrics().density * 500.0f);
        j();
    }
}
