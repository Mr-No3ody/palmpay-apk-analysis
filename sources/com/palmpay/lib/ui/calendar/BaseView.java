package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseView extends View implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f24071A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f24072B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f24073C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f24074H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f24075L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f24076M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f24077Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f24078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f24079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f24080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f24081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f24082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f24083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f24084g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f24085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f24086j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f24087k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f24088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f24089p;
    public final Paint t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Paint f24090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CalendarLayout f24091w;

    public BaseView(Context context) {
        this(context, null);
    }

    public final void a() {
        Map map = this.f24078a.f24285o0;
        if (map == null || map.size() == 0) {
            return;
        }
        for (C1435e c1435e : this.f24071A) {
            if (this.f24078a.f24285o0.containsKey(c1435e.toString())) {
                C1435e c1435e2 = (C1435e) this.f24078a.f24285o0.get(c1435e.toString());
                if (c1435e2 != null) {
                    c1435e.f24207g = TextUtils.isEmpty(c1435e2.f24207g) ? this.f24078a.f24256X : c1435e2.f24207g;
                }
            } else {
                c1435e.f24207g = "";
            }
        }
    }

    public final boolean b(C1435e c1435e) {
        p pVar = this.f24078a;
        return pVar != null && s.v(c1435e, pVar);
    }

    public final boolean c(C1435e c1435e) {
        CalendarView.OnCalendarInterceptListener onCalendarInterceptListener = this.f24078a.f24289q0;
        return onCalendarInterceptListener != null && onCalendarInterceptListener.onCalendarIntercept(c1435e);
    }

    public final void d() {
        Map map = this.f24078a.f24285o0;
        if (map != null && map.size() != 0) {
            a();
            invalidate();
        } else {
            Iterator it = this.f24071A.iterator();
            while (it.hasNext()) {
                ((C1435e) it.next()).f24207g = "";
            }
            invalidate();
        }
    }

    public void e() {
        this.f24072B = this.f24078a.f24270g0;
        Paint.FontMetrics fontMetrics = this.f24079b.getFontMetrics();
        this.f24074H = ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + ((this.f24072B / 2) - fontMetrics.descent);
    }

    public int getCalendarPaddingLeft() {
        p pVar = this.f24078a;
        if (pVar != null) {
            return pVar.f24301x;
        }
        return 0;
    }

    public int getCalendarPaddingRight() {
        p pVar = this.f24078a;
        if (pVar != null) {
            return pVar.f24303y;
        }
        return 0;
    }

    public List<C1435e> getCurrentSchemeCalendars() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f24078a;
        if (pVar != null) {
            Map map = pVar.f24285o0;
            ArrayList arrayList2 = this.f24071A;
            if (map != null && arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C1435e c1435e = (C1435e) map.get(((C1435e) it.next()).toString());
                    if (c1435e != null) {
                        arrayList.add(c1435e);
                    }
                }
            }
        }
        return arrayList;
    }

    public int getWeekStartWith() {
        p pVar = this.f24078a;
        if (pVar != null) {
            return pVar.f24261b;
        }
        return 1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x3;
        float y8;
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        ViewParent parent = getParent();
        if ((parent instanceof MonthViewPager) && ((MonthViewPager) parent).getOrientation() == 1) {
            float[] fArr = new float[2];
            int[] iArr = new int[2];
            ViewParent parent2 = getParent();
            if (parent2 instanceof MonthViewPager) {
                ((MonthViewPager) parent2).getLocationOnScreen(iArr);
                fArr[0] = motionEvent.getRawX() - iArr[0];
                fArr[1] = motionEvent.getRawY() - iArr[1];
            }
            x3 = fArr[0];
            y8 = fArr[1];
        } else {
            x3 = motionEvent.getX();
            y8 = motionEvent.getY();
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            this.f24075L = x3;
            this.f24076M = y8;
            invalidate();
        } else if (action != 2) {
            if (action == 3) {
                invalidate();
            }
        } else if (this.f24077Q) {
            this.f24077Q = Math.abs(y8 - this.f24076M) <= 50.0f;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setup(p pVar) {
        this.f24078a = pVar;
        pVar.getClass();
        p pVar2 = this.f24078a;
        if (pVar2 != null) {
            Paint paint = this.t;
            paint.setColor(pVar2.f24267f);
            Paint paint2 = this.f24090v;
            paint2.setColor(this.f24078a.f24269g);
            Paint paint3 = this.f24079b;
            paint3.setColor(this.f24078a.f24278l);
            Paint paint4 = this.f24080c;
            paint4.setColor(this.f24078a.f24276k);
            Paint paint5 = this.f24081d;
            paint5.setColor(this.f24078a.f24284o);
            Paint paint6 = this.f24082e;
            paint6.setColor(this.f24078a.f24282n);
            Paint paint7 = this.f24089p;
            paint7.setColor(this.f24078a.f24280m);
            Paint paint8 = this.f24083f;
            paint8.setColor(this.f24078a.f24286p);
            Paint paint9 = this.f24084g;
            paint9.setColor(this.f24078a.f24274j);
            this.f24085i.setColor(this.f24078a.f24249Q);
            Paint paint10 = this.f24088o;
            paint10.setColor(this.f24078a.f24273i);
            paint3.setTextSize(this.f24078a.f24266e0);
            paint4.setTextSize(this.f24078a.f24266e0);
            paint.setTextSize(this.f24078a.f24266e0);
            paint10.setTextSize(this.f24078a.f24266e0);
            paint7.setTextSize(this.f24078a.f24266e0);
            paint5.setTextSize(this.f24078a.f24268f0);
            paint6.setTextSize(this.f24078a.f24268f0);
            paint2.setTextSize(this.f24078a.f24268f0);
            paint8.setTextSize(this.f24078a.f24268f0);
            paint9.setTextSize(this.f24078a.f24268f0);
            Paint paint11 = this.f24086j;
            paint11.setStyle(Paint.Style.FILL);
            paint11.setColor(this.f24078a.f24250R);
        }
        e();
    }

    public BaseView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f24079b = paint;
        Paint paint2 = new Paint();
        this.f24080c = paint2;
        Paint paint3 = new Paint();
        this.f24081d = paint3;
        Paint paint4 = new Paint();
        this.f24082e = paint4;
        Paint paint5 = new Paint();
        this.f24083f = paint5;
        Paint paint6 = new Paint();
        this.f24084g = paint6;
        Paint paint7 = new Paint();
        this.f24085i = paint7;
        Paint paint8 = new Paint();
        this.f24086j = paint8;
        Paint paint9 = new Paint();
        this.f24088o = paint9;
        Paint paint10 = new Paint();
        this.f24089p = paint10;
        Paint paint11 = new Paint();
        this.t = paint11;
        Paint paint12 = new Paint();
        this.f24090v = paint12;
        this.f24077Q = true;
        this.f24087k0 = -1;
        paint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-15658735);
        paint.setTextSize(s.e(context, 14.0f));
        paint2.setAntiAlias(true);
        paint2.setTextAlign(align);
        paint2.setColor(-1973791);
        paint2.setTextSize(s.e(context, 14.0f));
        paint3.setAntiAlias(true);
        paint3.setTextAlign(align);
        paint4.setAntiAlias(true);
        paint4.setTextAlign(align);
        paint5.setAntiAlias(true);
        paint5.setTextAlign(align);
        paint6.setAntiAlias(true);
        paint6.setTextAlign(align);
        paint9.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint9.setStyle(style);
        paint9.setTextAlign(align);
        paint9.setColor(-1223853);
        paint9.setTextSize(s.e(context, 14.0f));
        paint10.setAntiAlias(true);
        paint10.setStyle(style);
        paint10.setTextAlign(align);
        paint10.setColor(-1223853);
        paint10.setFakeBoldText(true);
        paint10.setTextSize(s.e(context, 14.0f));
        paint7.setAntiAlias(true);
        paint7.setStyle(style);
        paint7.setStrokeWidth(2.0f);
        paint7.setColor(-1052689);
        paint11.setAntiAlias(true);
        paint11.setTextAlign(align);
        paint11.setColor(-65536);
        paint11.setTextSize(s.e(context, 14.0f));
        paint12.setAntiAlias(true);
        paint12.setTextAlign(align);
        paint12.setColor(-65536);
        paint12.setTextSize(s.e(context, 14.0f));
        paint8.setAntiAlias(true);
        paint8.setStyle(style);
        paint8.setStrokeWidth(2.0f);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }
}
