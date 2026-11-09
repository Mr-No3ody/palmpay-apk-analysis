package com.transsnet.mtn.sdk.ui.view.wheelview.widget;

import D8.c;
import D8.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WheelView<T> extends ListView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f25757C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final D8.a f25758A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final D8.b f25759B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f25763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25766g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f25767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f25768j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f25769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qh.a f25770p;
    public f t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f25771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f25772w;

    public interface e<T> {
    }

    public interface f<T> {
        void a(int i7, T t);
    }

    public WheelView(Context context) {
        super(context);
        this.f25760a = 0;
        this.f25761b = 3;
        this.f25762c = false;
        this.f25763d = null;
        this.f25764e = -1;
        this.f25765f = 0;
        this.f25766g = false;
        this.f25768j = c.f1696c;
        this.f25771v = new a(this);
        this.f25772w = new b(this);
        this.f25758A = new D8.a(0);
        this.f25759B = new D8.b(this, 0);
        a();
    }

    public final void a() {
        if (this.f25769o == null) {
            this.f25769o = new d();
        }
        this.f25767i = new Paint(1);
        setTag("com.wx.wheelview");
        setVerticalScrollBarEnabled(false);
        setScrollingCacheEnabled(false);
        setCacheColorHint(0);
        setFadingEdgeLength(0);
        setOverScrollMode(2);
        setDividerHeight(0);
        setOnItemClickListener(this.f25772w);
        setOnScrollListener(this.f25759B);
        setOnTouchListener(this.f25758A);
        setNestedScrollingEnabled(true);
        getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 20));
    }

    public final void b(int i7, int i10, int i11) {
        TextView textViewA;
        int i12;
        float f10;
        for (int i13 = i10 - i11; i13 <= i10 + i11; i13++) {
            View childAt = getChildAt(i13 - i7);
            if (childAt != null && (textViewA = p002a.a.a(childAt)) != null) {
                if (i10 == i13) {
                    d dVar = this.f25769o;
                    int i14 = dVar.f1699b;
                    i12 = i14 != -1 ? i14 : -16777216;
                    int i15 = dVar.f1700c;
                    if (i15 != -1) {
                        i12 = i15;
                    }
                    int i16 = dVar.f1701d;
                    f10 = i16 != -1 ? i16 : 16.0f;
                    float f11 = dVar.f1702e;
                    if (f11 != -1.0f) {
                        f10 *= f11;
                    }
                    textViewA.setTextColor(i12);
                    textViewA.setTextSize(1, f10);
                    childAt.setAlpha(1.0f);
                } else {
                    d dVar2 = this.f25769o;
                    int i17 = dVar2.f1699b;
                    i12 = i17 != -1 ? i17 : -16777216;
                    int i18 = dVar2.f1701d;
                    f10 = i18 != -1 ? i18 : 16.0f;
                    int iAbs = Math.abs(i13 - i10);
                    this.f25769o.getClass();
                    float fPow = (float) Math.pow(0.699999988079071d, iAbs);
                    textViewA.setTextColor(i12);
                    textViewA.setTextSize(1, f10);
                    childAt.setAlpha(fPow);
                }
            }
        }
    }

    public final void c() {
        if (getChildAt(0) == null || this.f25760a == 0) {
            return;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        if (this.f25762c && firstVisiblePosition == 0) {
            return;
        }
        int wheelCount = Math.abs(getChildAt(0).getY()) <= ((float) (this.f25760a / 2)) ? firstVisiblePosition : firstVisiblePosition + 1;
        int i7 = this.f25761b / 2;
        b(firstVisiblePosition, i7 + wheelCount, i7);
        if (this.f25762c) {
            wheelCount = ((this.f25761b / 2) + wheelCount) % getWheelCount();
        }
        if (wheelCount == this.f25764e) {
            return;
        }
        this.f25764e = wheelCount;
        this.f25770p.f41530e = wheelCount;
        a aVar = this.f25771v;
        aVar.removeMessages(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        aVar.sendEmptyMessageDelayed(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 300L);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        Rect rect = new Rect(0, (this.f25761b / 2) * this.f25760a, getWidth(), ((this.f25761b / 2) + 1) * this.f25760a);
        this.f25767i.setTextSize(0);
        this.f25767i.setColor(0);
        Paint.FontMetricsInt fontMetricsInt = this.f25767i.getFontMetricsInt();
        int i7 = (((rect.bottom + rect.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
        this.f25767i.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(null, rect.centerX(), i7, this.f25767i);
    }

    public int getCurrentPosition() {
        return this.f25764e;
    }

    public int getSelection() {
        return this.f25765f;
    }

    public T getSelectionItem() {
        int currentPosition = getCurrentPosition();
        if (currentPosition < 0) {
            currentPosition = 0;
        }
        List list = this.f25763d;
        if (list == null || list.size() <= currentPosition) {
            return null;
        }
        return (T) this.f25763d.get(currentPosition);
    }

    public c getSkin() {
        return this.f25768j;
    }

    public d getStyle() {
        return this.f25769o;
    }

    public int getWheelCount() {
        if (p002a.a.c(this.f25763d)) {
            return 0;
        }
        return this.f25763d.size();
    }

    public void setLoop(boolean z3) {
        if (z3 != this.f25762c) {
            this.f25762c = z3;
            setSelection(0);
            qh.a aVar = this.f25770p;
            if (aVar != null) {
                aVar.e(z3);
            }
        }
    }

    public void setOnWheelItemClickListener(e<T> eVar) {
    }

    public void setOnWheelItemSelectedListener(f<T> fVar) {
        this.t = fVar;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public void setSelection(int i7) {
        this.f25765f = i7;
        if (p002a.a.c(this.f25763d)) {
            i7 = 0;
        } else if (this.f25762c) {
            i7 = ((this.f25763d.size() * (1073741823 / this.f25763d.size())) + i7) - (this.f25761b / 2);
        }
        super.setSelection(i7);
        c();
    }

    public void setSkin(c cVar) {
        this.f25768j = cVar;
    }

    public void setStyle(d dVar) {
        this.f25769o = dVar;
    }

    public void setWheelAdapter(qh.a aVar) {
        super.setAdapter((ListAdapter) aVar);
        this.f25770p = aVar;
        aVar.c(this.f25763d);
        aVar.b(this.f25761b);
        aVar.e(this.f25762c);
        aVar.d(this.f25766g);
    }

    public void setWheelClickable(boolean z3) {
        if (z3 != this.f25766g) {
            this.f25766g = z3;
            qh.a aVar = this.f25770p;
            if (aVar != null) {
                aVar.d(z3);
            }
        }
    }

    public void setWheelData(List<T> list) {
        if (p002a.a.c(list)) {
            throw new P0.c("wheel datas are error.", 17, false);
        }
        this.f25763d = list;
        qh.a aVar = this.f25770p;
        if (aVar != null) {
            aVar.c(list);
        }
    }

    public void setWheelSize(int i7) {
        if ((i7 & 1) == 0) {
            throw new P0.c("wheel size must be an odd number.", 17, false);
        }
        this.f25761b = i7;
        qh.a aVar = this.f25770p;
        if (aVar != null) {
            aVar.b(i7);
        }
    }

    @Override // android.widget.AdapterView
    @Deprecated
    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter == null || !(listAdapter instanceof qh.a)) {
            throw new P0.c("please invoke setWheelAdapter method.", 17, false);
        }
        setWheelAdapter((qh.a) listAdapter);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25760a = 0;
        this.f25761b = 3;
        this.f25762c = false;
        this.f25763d = null;
        this.f25764e = -1;
        this.f25765f = 0;
        this.f25766g = false;
        this.f25768j = c.f1696c;
        this.f25771v = new a(this);
        this.f25772w = new b(this);
        this.f25758A = new D8.a(0);
        this.f25759B = new D8.b(this, 0);
        a();
    }

    public WheelView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f25760a = 0;
        this.f25761b = 3;
        this.f25762c = false;
        this.f25763d = null;
        this.f25764e = -1;
        this.f25765f = 0;
        this.f25766g = false;
        this.f25768j = c.f1696c;
        this.f25771v = new a(this);
        this.f25772w = new b(this);
        this.f25758A = new D8.a(0);
        this.f25759B = new D8.b(this, 0);
        a();
    }
}
