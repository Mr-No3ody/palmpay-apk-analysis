package com.palmpay.lib.ui.picker.wheel.view;

import Gb.HandlerC0283f;
import L6.c;
import L6.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.camera.view.impl.e;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.palmpay.lib.ui.picker.wheel.adapter.WheelAdapter;
import com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData;
import com.palmpay.lib.ui.picker.wheel.listener.OnItemSelectedListener;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p035c7.b;
import p049d7.a;

/* JADX INFO: loaded from: classes3.dex */
public class WheelView extends View {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final String[] f24552M0 = {TransType.TRANS_SCENE_REFUND, "01", "02", "03", "04", "05", "06", "07", "08", TransType.TRANS_TYPE_EX_GRATIA};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f24553A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f24554A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f24555B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f24556B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f24557C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f24558C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f24559D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public float f24560E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public long f24561F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f24562G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f24563H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f24564H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f24565I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f24566J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final float f24567K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Typeface f24568L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f24569L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f24570M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f24571Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f24572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerC0283f f24573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GestureDetector f24574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnItemSelectedListener f24575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f24578g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f24579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f24580j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f24581k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f24582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f24583p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f24584p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f24585q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f24586r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f24587s0;
    public WheelAdapter t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f24588t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f24589u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f24590v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f24591v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24592w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f24593w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f24594x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f24595y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f24596z0;

    public WheelView(Context context) {
        this(context, null);
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof IPickerViewData) {
            return ((IPickerViewData) obj).getPickerViewText();
        }
        if (!(obj instanceof Integer)) {
            return obj.toString();
        }
        int iIntValue = ((Integer) obj).intValue();
        return (iIntValue < 0 || iIntValue >= 10) ? String.valueOf(iIntValue) : f24552M0[iIntValue];
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.f24579i;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f24579i.cancel(true);
        this.f24579i = null;
    }

    public final int c(int i7) {
        if (i7 < 0) {
            return c(this.t.getItemsCount() + i7);
        }
        return i7 > this.t.getItemsCount() + (-1) ? c(i7 - this.t.getItemsCount()) : i7;
    }

    public final void d() {
        OnItemSelectedListener onItemSelectedListener = this.f24575d;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(getCurrentItem());
        }
    }

    public final void e() {
        if (this.t == null) {
            return;
        }
        Rect rect = new Rect();
        for (int i7 = 0; i7 < this.t.getItemsCount(); i7++) {
            String strB = b(this.t.getItem(i7));
            this.f24582o.getTextBounds(strB, 0, strB.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.f24553A) {
                this.f24553A = iWidth;
            }
        }
        this.f24582o.getTextBounds("星期", 0, 2, rect);
        int iHeight = rect.height() + 2;
        this.f24555B = iHeight;
        float f10 = this.f24585q0 * iHeight;
        this.f24563H = f10;
        int i10 = (int) (f10 * (this.f24596z0 - 1));
        this.f24554A0 = (int) (((double) (i10 * 2)) / 3.141592653589793d);
        this.f24558C0 = (int) (((double) i10) / 3.141592653589793d);
        this.f24556B0 = View.MeasureSpec.getSize(this.f24562G0);
        float f11 = this.f24554A0;
        float f12 = this.f24563H;
        this.f24587s0 = (f11 - f12) / 2.0f;
        float f13 = (f11 + f12) / 2.0f;
        this.f24588t0 = f13;
        this.f24589u0 = (f13 - ((f12 - this.f24555B) / 2.0f)) - this.f24567K0;
        if (this.f24593w0 == -1) {
            if (this.f24586r0) {
                this.f24593w0 = (this.t.getItemsCount() + 1) / 2;
            } else {
                this.f24593w0 = 0;
            }
        }
        this.f24595y0 = this.f24593w0;
    }

    public final void f(float f10, float f11) {
        int i7;
        int i10 = this.f24557C;
        if (i10 > 0) {
            i7 = 1;
        } else {
            i7 = i10 < 0 ? -1 : 0;
        }
        this.f24580j.setTextSkewX(i7 * (f11 <= 0.0f ? 1 : -1) * 0.5f * f10);
        this.f24580j.setAlpha(this.f24569L0 ? (int) (((90.0f - Math.abs(f11)) / 90.0f) * 255.0f) : 255);
    }

    public final void g(int i7) {
        a();
        if (i7 == 2 || i7 == 3) {
            float f10 = this.f24591v0;
            float f11 = this.f24563H;
            int i10 = (int) (((f10 % f11) + f11) % f11);
            this.f24559D0 = i10;
            float f12 = i10;
            if (f12 > f11 / 2.0f) {
                this.f24559D0 = (int) (f11 - f12);
            } else {
                this.f24559D0 = -i10;
            }
        }
        this.f24579i = this.f24578g.scheduleWithFixedDelay(new b(this, this.f24559D0), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public final WheelAdapter getAdapter() {
        return this.t;
    }

    public final int getCurrentItem() {
        int i7;
        WheelAdapter wheelAdapter = this.t;
        if (wheelAdapter == null) {
            return 0;
        }
        return (!this.f24586r0 || ((i7 = this.f24594x0) >= 0 && i7 < wheelAdapter.getItemsCount())) ? Math.max(0, Math.min(this.f24594x0, this.t.getItemsCount() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.f24594x0) - this.t.getItemsCount()), this.t.getItemsCount() - 1));
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f24573b;
    }

    public int getInitPosition() {
        return this.f24593w0;
    }

    public float getItemHeight() {
        return this.f24563H;
    }

    public int getItemsCount() {
        WheelAdapter wheelAdapter = this.t;
        if (wheelAdapter != null) {
            return wheelAdapter.getItemsCount();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.f24591v0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z3;
        Canvas canvas2;
        boolean z8;
        float f11;
        int i7;
        int i10;
        boolean z10;
        Object obj;
        int i11;
        String str;
        String str2;
        int iCeil;
        if (this.t == null) {
            return;
        }
        int i12 = 0;
        int iMin = Math.min(Math.max(0, this.f24593w0), this.t.getItemsCount() - 1);
        this.f24593w0 = iMin;
        try {
            this.f24595y0 = iMin + (((int) (this.f24591v0 / this.f24563H)) % this.t.getItemsCount());
            while (true) {
                int i13 = this.f24596z0;
                if (i7 >= i13) {
                    return;
                }
                int i14 = this.f24595y0 - ((i13 / 2) - i7);
                Object item = this.f24586r0 ? this.t.getItem(c(i14)) : (i14 >= 0 && i14 <= this.t.getItemsCount() + (-1)) ? this.t.getItem(i14) : "";
                canvas2.save();
                double d2 = ((this.f24563H * i7) - f10) / this.f24558C0;
                float f12 = (float) (90.0d - ((d2 / 3.141592653589793d) * 180.0d));
                if (f12 > 90.0f || f12 < -90.0f) {
                    i10 = i7;
                    f10 = f10;
                    z10 = z3;
                    canvas2.restore();
                } else {
                    String strB = (z8 || TextUtils.isEmpty(this.f24590v) || TextUtils.isEmpty(b(item))) ? b(item) : b(item) + this.f24590v;
                    float fPow = (float) Math.pow(Math.abs(f12) / 90.0f, 2.2d);
                    Rect rect = new Rect();
                    this.f24582o.getTextBounds(strB, i12, strB.length(), rect);
                    int i15 = this.f24592w;
                    for (int iWidth = rect.width(); iWidth > this.f24556B0; iWidth = rect.width()) {
                        i15--;
                        this.f24582o.setTextSize(i15);
                        this.f24582o.getTextBounds(strB, i12, strB.length(), rect);
                    }
                    this.f24580j.setTextSize(i15);
                    Rect rect2 = new Rect();
                    this.f24582o.getTextBounds(strB, i12, strB.length(), rect2);
                    int i16 = this.f24564H0;
                    if (i16 != 3) {
                        if (i16 == 5) {
                            obj = "";
                            this.f24565I0 = (this.f24556B0 - rect2.width()) - ((int) f11);
                        } else if (i16 != 17) {
                            obj = "";
                            i11 = 0;
                            f10 = f10;
                        } else {
                            if (this.f24576e || (str2 = this.f24590v) == null) {
                                obj = "";
                            } else {
                                obj = "";
                                if (!str2.equals(obj) && z8) {
                                    this.f24565I0 = (int) (((double) (this.f24556B0 - rect2.width())) * 0.25d);
                                }
                            }
                            this.f24565I0 = (int) (((double) (this.f24556B0 - rect2.width())) * 0.5d);
                        }
                        i11 = 0;
                    } else {
                        obj = "";
                        i11 = 0;
                        f10 = f10;
                        this.f24565I0 = 0;
                    }
                    Rect rect3 = new Rect();
                    this.f24580j.getTextBounds(strB, i11, strB.length(), rect3);
                    int i17 = this.f24564H0;
                    if (i17 == 3) {
                        this.f24566J0 = 0;
                    } else if (i17 == 5) {
                        this.f24566J0 = (this.f24556B0 - rect3.width()) - ((int) f11);
                    } else if (i17 == 17) {
                        if (this.f24576e || (str = this.f24590v) == null || str.equals(obj) || !z8) {
                            this.f24566J0 = (int) (((double) (this.f24556B0 - rect3.width())) * 0.5d);
                        } else {
                            this.f24566J0 = (int) (((double) (this.f24556B0 - rect3.width())) * 0.25d);
                        }
                    }
                    i10 = i7;
                    float fCos = (float) ((((double) this.f24558C0) - (Math.cos(d2) * ((double) this.f24558C0))) - ((Math.sin(d2) * ((double) this.f24555B)) / 2.0d));
                    canvas2.translate(0.0f, fCos);
                    float f13 = this.f24587s0;
                    if (fCos > f13 || this.f24555B + fCos < f13) {
                        float f14 = this.f24588t0;
                        if (fCos > f14 || this.f24555B + fCos < f14) {
                            z10 = false;
                            if (fCos >= f13) {
                                float f15 = this.f24555B;
                                if (fCos + f15 <= f14) {
                                    canvas2.drawText(strB, this.f24565I0, f15 - f11, this.f24582o);
                                    this.f24594x0 = this.f24595y0 - ((this.f24596z0 / 2) - i10);
                                }
                            }
                            canvas2.save();
                            i12 = 0;
                            canvas2.clipRect(0, 0, this.f24556B0, (int) this.f24563H);
                            canvas2.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                            f(fPow, f12);
                            canvas2.drawText(strB, (this.f24557C * fPow) + this.f24566J0, this.f24555B, this.f24580j);
                            canvas2.restore();
                        } else {
                            canvas2.save();
                            canvas2.clipRect(0.0f, 0.0f, this.f24556B0, this.f24588t0 - fCos);
                            canvas2.scale(1.0f, ((float) Math.sin(d2)) * 1.0f);
                            canvas2.drawText(strB, this.f24565I0, this.f24555B - f11, this.f24582o);
                            canvas2.restore();
                            canvas2.save();
                            z10 = false;
                            canvas2.clipRect(0.0f, this.f24588t0 - fCos, this.f24556B0, (int) this.f24563H);
                            canvas2.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                            f(fPow, f12);
                            canvas2.drawText(strB, this.f24566J0, this.f24555B, this.f24580j);
                            canvas2.restore();
                        }
                        i12 = 0;
                    } else {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, this.f24556B0, this.f24587s0 - fCos);
                        canvas2.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                        f(fPow, f12);
                        canvas2.drawText(strB, this.f24566J0, this.f24555B, this.f24580j);
                        canvas2.restore();
                        canvas2.save();
                        canvas2.clipRect(0.0f, this.f24587s0 - fCos, this.f24556B0, (int) this.f24563H);
                        canvas2.scale(1.0f, ((float) Math.sin(d2)) * 1.0f);
                        canvas2.drawText(strB, this.f24565I0, this.f24555B - f11, this.f24582o);
                        canvas2.restore();
                        i12 = 0;
                        z10 = false;
                    }
                    canvas2.restore();
                    this.f24582o.setTextSize(this.f24592w);
                }
                i7 = i10 + 1;
                z3 = z10;
                f10 = f10;
                z8 = z8;
            }
        } catch (ArithmeticException unused) {
            Log.e("WheelView", "出错了！adapter.getItemsCount() == 0，联动数据不匹配");
        }
        if (this.f24586r0) {
            if (this.f24595y0 < 0) {
                this.f24595y0 = this.t.getItemsCount() + this.f24595y0;
            }
            if (this.f24595y0 > this.t.getItemsCount() - 1) {
                this.f24595y0 -= this.t.getItemsCount();
            }
        } else {
            if (this.f24595y0 < 0) {
                this.f24595y0 = 0;
            }
            if (this.f24595y0 > this.t.getItemsCount() - 1) {
                this.f24595y0 = this.t.getItemsCount() - 1;
            }
        }
        f10 = this.f24591v0 % this.f24563H;
        a aVar = this.f24572a;
        z3 = false;
        if (aVar == a.f35539a) {
            float f16 = (TextUtils.isEmpty(this.f24590v) ? (this.f24556B0 - this.f24553A) / 2 : (this.f24556B0 - this.f24553A) / 4) - 12;
            float f17 = f16 <= 0.0f ? 10.0f : f16;
            float f18 = this.f24556B0 - f17;
            float f19 = this.f24587s0;
            canvas2 = canvas;
            canvas2.drawLine(f17, f19, f18, f19, this.f24583p);
            float f20 = this.f24588t0;
            canvas2.drawLine(f17, f20, f18, f20, this.f24583p);
        } else if (aVar == a.f35540b) {
            this.f24583p.setStyle(Paint.Style.STROKE);
            this.f24583p.setStrokeWidth(this.f24584p0);
            float f21 = (TextUtils.isEmpty(this.f24590v) ? (this.f24556B0 - this.f24553A) / 2.0f : (this.f24556B0 - this.f24553A) / 4.0f) - 12.0f;
            float f22 = f21 > 0.0f ? f21 : 10.0f;
            canvas.drawCircle(this.f24556B0 / 2.0f, this.f24554A0 / 2.0f, Math.max((this.f24556B0 - f22) - f22, this.f24563H) / 1.8f, this.f24583p);
            canvas2 = canvas;
        } else {
            float f23 = this.f24587s0;
            canvas.drawLine(0.0f, f23, this.f24556B0, f23, this.f24583p);
            float f24 = this.f24588t0;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, f24, this.f24556B0, f24, this.f24583p);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f24590v);
        z8 = this.f24577f;
        f11 = this.f24567K0;
        if (!zIsEmpty && z8) {
            int i18 = this.f24556B0;
            Paint paint = this.f24582o;
            String str3 = this.f24590v;
            if (str3 == null || str3.length() <= 0) {
                iCeil = 0;
            } else {
                int length = str3.length();
                float[] fArr = new float[length];
                paint.getTextWidths(str3, fArr);
                iCeil = 0;
                for (int i19 = 0; i19 < length; i19++) {
                    iCeil += (int) Math.ceil(fArr[i19]);
                }
            }
            canvas2.drawText(this.f24590v, (i18 - iCeil) - f11, this.f24589u0, this.f24582o);
        }
        i7 = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        this.f24562G0 = i7;
        e();
        setMeasuredDimension(this.f24556B0, this.f24554A0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.f24574c.onTouchEvent(motionEvent);
        float f10 = (-this.f24593w0) * this.f24563H;
        float itemsCount = ((this.t.getItemsCount() - 1) - this.f24593w0) * this.f24563H;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f24561F0 = System.currentTimeMillis();
            a();
            this.f24560E0 = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f24560E0 - motionEvent.getRawY();
            this.f24560E0 = motionEvent.getRawY();
            float f11 = this.f24591v0 + rawY;
            this.f24591v0 = f11;
            if (!this.f24586r0) {
                float f12 = this.f24563H * 0.25f;
                if ((f11 - f12 < f10 && rawY < 0.0f) || (f12 + f11 > itemsCount && rawY > 0.0f)) {
                    this.f24591v0 = f11 - rawY;
                    return true;
                }
            }
        } else if (!zOnTouchEvent) {
            float y8 = motionEvent.getY();
            float f13 = this.f24558C0;
            double dAcos = Math.acos((f13 - y8) / f13) * ((double) this.f24558C0);
            float f14 = this.f24563H;
            this.f24559D0 = (int) (((((int) ((dAcos + ((double) (f14 / 2.0f))) / ((double) f14))) - (this.f24596z0 / 2)) * f14) - (((this.f24591v0 % f14) + f14) % f14));
            if (System.currentTimeMillis() - this.f24561F0 > 120) {
                g(3);
            } else {
                g(1);
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(WheelAdapter wheelAdapter) {
        this.t = wheelAdapter;
        e();
        invalidate();
    }

    public void setAlphaGradient(boolean z3) {
        this.f24569L0 = z3;
    }

    public final void setCurrentItem(int i7) {
        this.f24594x0 = i7;
        this.f24593w0 = i7;
        this.f24591v0 = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z3) {
        this.f24586r0 = z3;
    }

    public void setDividerColor(int i7) {
        this.f24581k0 = i7;
        this.f24583p.setColor(i7);
    }

    public void setDividerType(a aVar) {
        this.f24572a = aVar;
    }

    public void setDividerWidth(int i7) {
        this.f24584p0 = i7;
        this.f24583p.setStrokeWidth(i7);
    }

    public void setGravity(int i7) {
        this.f24564H0 = i7;
    }

    public void setIsOptions(boolean z3) {
        this.f24576e = z3;
    }

    public void setItemsVisibleCount(int i7) {
        if (i7 % 2 == 0) {
            i7++;
        }
        this.f24596z0 = i7 + 2;
    }

    public void setLabel(String str) {
        this.f24590v = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        if (f10 != 0.0f) {
            this.f24585q0 = f10;
            if (f10 < 1.0f) {
                this.f24585q0 = 1.0f;
            } else if (f10 > 4.0f) {
                this.f24585q0 = 4.0f;
            }
        }
    }

    public final void setOnItemClickListener(View.OnClickListener onClickListener) {
    }

    public final void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.f24575d = onItemSelectedListener;
    }

    public void setTextColorCenter(int i7) {
        this.f24571Q = i7;
        this.f24582o.setColor(i7);
    }

    public void setTextColorOut(int i7) {
        this.f24570M = i7;
        this.f24580j.setColor(i7);
    }

    public final void setTextSize(int i7) {
        this.f24592w = i7;
        this.f24580j.setTextSize(i7);
        this.f24582o.setTextSize(this.f24592w);
    }

    public void setTextXOffset(int i7) {
        this.f24557C = i7;
        if (i7 != 0) {
            this.f24582o.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f10) {
        this.f24591v0 = f10;
    }

    public final void setTypeface(Typeface typeface) {
        this.f24568L = typeface;
        this.f24580j.setTypeface(typeface);
        this.f24582o.setTypeface(this.f24568L);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24576e = false;
        this.f24577f = true;
        this.f24578g = ShadowExecutors.newOptimizedSingleThreadScheduledExecutor("\u200bcom.palmpay.lib.ui.picker.wheel.view.WheelView");
        this.f24568L = Typeface.DEFAULT;
        this.f24585q0 = 1.0f;
        this.f24596z0 = 11;
        this.f24559D0 = 0;
        this.f24560E0 = 0.0f;
        this.f24561F0 = 0L;
        this.f24564H0 = 17;
        this.f24565I0 = 0;
        this.f24566J0 = 0;
        this.f24569L0 = false;
        this.f24592w = getResources().getDimensionPixelSize(c.pp_pickerview_text_size);
        float f10 = getResources().getDisplayMetrics().density;
        if (f10 < 1.0f) {
            this.f24567K0 = 2.4f;
        } else if (1.0f <= f10 && f10 < 2.0f) {
            this.f24567K0 = 4.0f;
        } else if (2.0f <= f10 && f10 < 3.0f) {
            this.f24567K0 = 6.0f;
        } else if (f10 >= 3.0f) {
            this.f24567K0 = f10 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.Pppickerview, 0, 0);
            this.f24564H0 = typedArrayObtainStyledAttributes.getInt(j.Pppickerview_pp_wheelview_gravity, 17);
            this.f24570M = typedArrayObtainStyledAttributes.getColor(j.Pppickerview_pp_wheelview_textColorOut, -5723992);
            this.f24571Q = typedArrayObtainStyledAttributes.getColor(j.Pppickerview_pp_wheelview_textColorCenter, -14013910);
            this.f24581k0 = typedArrayObtainStyledAttributes.getColor(j.Pppickerview_pp_wheelview_dividerColor, -2763307);
            this.f24584p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.Pppickerview_pp_wheelview_dividerWidth, 2);
            this.f24592w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.Pppickerview_pp_wheelview_textSize, this.f24592w);
            this.f24585q0 = typedArrayObtainStyledAttributes.getFloat(j.Pppickerview_pp_wheelview_lineSpacingMultiplier, this.f24585q0);
            typedArrayObtainStyledAttributes.recycle();
        }
        float f11 = this.f24585q0;
        if (f11 < 1.0f) {
            this.f24585q0 = 1.0f;
        } else if (f11 > 4.0f) {
            this.f24585q0 = 4.0f;
        }
        this.f24573b = new HandlerC0283f(this);
        GestureDetector gestureDetector = new GestureDetector(context, new e(this));
        this.f24574c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f24586r0 = true;
        this.f24591v0 = 0.0f;
        this.f24593w0 = -1;
        Paint paint = new Paint();
        this.f24580j = paint;
        paint.setColor(this.f24570M);
        this.f24580j.setAntiAlias(true);
        this.f24580j.setTypeface(this.f24568L);
        this.f24580j.setTextSize(this.f24592w);
        Paint paint2 = new Paint();
        this.f24582o = paint2;
        paint2.setColor(this.f24571Q);
        this.f24582o.setAntiAlias(true);
        this.f24582o.setTextScaleX(1.1f);
        this.f24582o.setTypeface(this.f24568L);
        this.f24582o.setTextSize(this.f24592w);
        Paint paint3 = new Paint();
        this.f24583p = paint3;
        paint3.setColor(this.f24581k0);
        this.f24583p.setAntiAlias(true);
        setLayerType(1, null);
    }
}
