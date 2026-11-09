package com.transsnet.palmpay.custom_view.wheelview.widget;

import Be.c;
import F6.d;
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
import androidx.core.provider.m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WheelView<T> extends ListView implements IWheelView<T> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public OnWheelItemClickListener f31717A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public c f31718B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final a f31719C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final b f31720H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final D8.a f31721L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final D8.b f31722M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f31726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31729g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f31730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dc.a f31731j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dc.b f31732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WheelView f31733p;
    public HashMap t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Zb.a f31734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OnWheelItemSelectedListener f31735w;

    public interface OnWheelItemClickListener<T> {
        void onItemClick(int i7, T t);
    }

    public interface OnWheelItemSelectedListener<T> {
        void onItemSelected(int i7, T t);
    }

    public WheelView(Context context) {
        super(context);
        this.f31723a = 0;
        this.f31724b = 3;
        this.f31725c = false;
        this.f31726d = null;
        this.f31727e = -1;
        this.f31728f = 0;
        this.f31729g = false;
        this.f31731j = dc.a.f35862c;
        this.f31719C = new a(this);
        this.f31720H = new b(this);
        this.f31721L = new D8.a(2);
        this.f31722M = new D8.b(this, 1);
        e();
    }

    public static int a(WheelView wheelView, float f10) {
        if (Math.abs(f10) <= 2.0f) {
            return (int) f10;
        }
        if (Math.abs(f10) < 12.0f) {
            return f10 > 0.0f ? 2 : -2;
        }
        return (int) (f10 / 6.0f);
    }

    public static void b(WheelView wheelView, boolean z3) {
        if (wheelView.getChildAt(0) == null || wheelView.f31723a == 0) {
            return;
        }
        int firstVisiblePosition = wheelView.getFirstVisiblePosition();
        if (wheelView.f31725c && firstVisiblePosition == 0) {
            return;
        }
        int wheelCount = Math.abs(wheelView.getChildAt(0).getY()) <= ((float) (wheelView.f31723a / 2)) ? firstVisiblePosition : firstVisiblePosition + 1;
        int i7 = wheelView.f31724b / 2;
        wheelView.g(firstVisiblePosition, i7 + wheelCount, i7);
        if (wheelView.f31725c) {
            wheelCount = ((wheelView.f31724b / 2) + wheelCount) % wheelView.getWheelCount();
        }
        if (wheelCount != wheelView.f31727e || z3) {
            wheelView.f31727e = wheelCount;
            wheelView.f31734v.f11610e = wheelCount;
            a aVar = wheelView.f31719C;
            aVar.removeMessages(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            aVar.sendEmptyMessageDelayed(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 300L);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        Rect rect = new Rect(0, (this.f31724b / 2) * this.f31723a, getWidth(), ((this.f31724b / 2) + 1) * this.f31723a);
        this.f31730i.setTextSize(0);
        this.f31730i.setColor(0);
        Paint.FontMetricsInt fontMetricsInt = this.f31730i.getFontMetricsInt();
        int i7 = (((rect.bottom + rect.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
        this.f31730i.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(null, rect.centerX(), i7, this.f31730i);
    }

    public final void e() {
        if (this.f31732o == null) {
            this.f31732o = new dc.b();
        }
        this.f31730i = new Paint(1);
        setTag("com.wx.wheelview");
        setVerticalScrollBarEnabled(false);
        setScrollingCacheEnabled(false);
        setCacheColorHint(0);
        setFadingEdgeLength(0);
        setOverScrollMode(2);
        setDividerHeight(0);
        setOnItemClickListener(this.f31720H);
        setOnScrollListener(this.f31722M);
        setOnTouchListener(this.f31721L);
        setNestedScrollingEnabled(true);
        if (this.f31718B != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f31718B);
        }
        this.f31718B = new c(this, 11);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f31718B);
    }

    public final void f() {
        this.f31734v.notifyDataSetChanged();
    }

    public final void g(int i7, int i10, int i11) {
        TextView textViewR;
        int i12;
        float f10;
        for (int i13 = i10 - i11; i13 <= i10 + i11; i13++) {
            View childAt = getChildAt(i13 - i7);
            if (childAt != null && (textViewR = G8.a.r(childAt)) != null) {
                if (i10 == i13) {
                    dc.b bVar = this.f31732o;
                    int i14 = bVar.f35866c;
                    i12 = i14 != -10 ? i14 : -16777216;
                    int i15 = bVar.f35867d;
                    if (i15 != -10) {
                        i12 = i15;
                    }
                    int i16 = bVar.f35868e;
                    f10 = i16 != -1 ? i16 : 16.0f;
                    int i17 = bVar.f35869f;
                    if (i17 != -1) {
                        f10 = i17;
                    }
                    textViewR.setTextColor(i12);
                    textViewR.setTextSize(2, f10);
                    childAt.setAlpha(1.0f);
                } else {
                    dc.b bVar2 = this.f31732o;
                    int i18 = bVar2.f35866c;
                    i12 = i18 != -1 ? i18 : -16777216;
                    int i19 = bVar2.f35868e;
                    f10 = i19 != -1 ? i19 : 16.0f;
                    int iAbs = Math.abs(i13 - i10);
                    float f11 = this.f31732o.f35870g;
                    float fPow = (float) Math.pow(f11 != -1.0f ? f11 : 1.0d, iAbs);
                    textViewR.setTextColor(i12);
                    textViewR.setTextSize(2, f10);
                    childAt.setAlpha(fPow);
                }
            }
        }
    }

    public int getCurrentPosition() {
        return this.f31727e;
    }

    public int getSelection() {
        return this.f31728f;
    }

    public T getSelectionItem() {
        int currentPosition = getCurrentPosition();
        if (currentPosition < 0) {
            currentPosition = 0;
        }
        List list = this.f31726d;
        if (list == null || list.size() <= currentPosition) {
            return null;
        }
        return (T) this.f31726d.get(currentPosition);
    }

    public dc.a getSkin() {
        return this.f31731j;
    }

    public dc.b getStyle() {
        return this.f31732o;
    }

    public int getWheelCount() {
        if (G8.a.H(this.f31726d)) {
            return 0;
        }
        return this.f31726d.size();
    }

    public int getWheelSize() {
        return this.f31724b;
    }

    public final void h(List list) {
        if (G8.a.H(list)) {
            throw new P0.c("join map data is error.", 2, false);
        }
        postDelayed(new m(this, 13, list, false), 10L);
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.IWheelView
    public final void join(WheelView wheelView) {
        if (wheelView == null) {
            throw new P0.c("wheelview cannot be null.", 2, false);
        }
        this.f31733p = wheelView;
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.IWheelView
    public final void joinDatas(HashMap map) {
        this.t = map;
    }

    public void setAsynWheelData(List<T> list) {
        c cVar = this.f31718B;
        if (cVar == null) {
            if (cVar != null) {
                getViewTreeObserver().removeOnGlobalLayoutListener(this.f31718B);
            }
            this.f31718B = new c(this, 11);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f31718B);
        }
        if (G8.a.H(list)) {
            throw new P0.c("wheel datas are error.", 2, false);
        }
        this.f31726d = list;
        Zb.a aVar = this.f31734v;
        if (aVar != null) {
            aVar.c(list);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.IWheelView
    public void setLoop(boolean z3) {
        if (z3 != this.f31725c) {
            this.f31725c = z3;
            setSelection(0);
            Zb.a aVar = this.f31734v;
            if (aVar != null) {
                aVar.d(z3);
            }
        }
    }

    public void setOnWheelItemClickListener(OnWheelItemClickListener<T> onWheelItemClickListener) {
        this.f31717A = onWheelItemClickListener;
    }

    public void setOnWheelItemSelectedListener(OnWheelItemSelectedListener<T> onWheelItemSelectedListener) {
        this.f31735w = onWheelItemSelectedListener;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public void setSelection(int i7) {
        this.f31728f = i7;
        setVisibility(4);
        postDelayed(new androidx.core.provider.a(this, i7, 2), 500L);
    }

    public void setSkin(dc.a aVar) {
        this.f31731j = aVar;
    }

    public void setStyle(dc.b bVar) {
        this.f31732o = bVar;
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.IWheelView
    public void setWheelAdapter(Zb.a aVar) {
        super.setAdapter((ListAdapter) aVar);
        this.f31734v = aVar;
        aVar.c(this.f31726d);
        aVar.e(this.f31724b);
        aVar.d(this.f31725c);
        aVar.b(this.f31729g);
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.IWheelView
    public void setWheelClickable(boolean z3) {
        if (z3 != this.f31729g) {
            this.f31729g = z3;
            Zb.a aVar = this.f31734v;
            if (aVar != null) {
                aVar.b(z3);
            }
        }
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.IWheelView
    public void setWheelData(List<T> list) {
        if (G8.a.H(list)) {
            d.c("WheelView", "setWheelData: wheel datas are error.");
        }
        this.f31726d = list;
        Zb.a aVar = this.f31734v;
        if (aVar != null) {
            aVar.c(list);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.IWheelView
    public void setWheelSize(int i7) {
        if ((i7 & 1) == 0) {
            throw new P0.c("wheel size must be an odd number.", 2, false);
        }
        this.f31724b = i7;
        Zb.a aVar = this.f31734v;
        if (aVar != null) {
            aVar.e(i7);
        }
    }

    @Override // android.widget.AdapterView
    @Deprecated
    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter == null || !(listAdapter instanceof Zb.a)) {
            throw new P0.c("please invoke setWheelAdapter method.", 2, false);
        }
        setWheelAdapter((Zb.a) listAdapter);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31723a = 0;
        this.f31724b = 3;
        this.f31725c = false;
        this.f31726d = null;
        this.f31727e = -1;
        this.f31728f = 0;
        this.f31729g = false;
        this.f31731j = dc.a.f35862c;
        this.f31719C = new a(this);
        this.f31720H = new b(this);
        this.f31721L = new D8.a(2);
        this.f31722M = new D8.b(this, 1);
        e();
    }

    public WheelView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31723a = 0;
        this.f31724b = 3;
        this.f31725c = false;
        this.f31726d = null;
        this.f31727e = -1;
        this.f31728f = 0;
        this.f31729g = false;
        this.f31731j = dc.a.f35862c;
        this.f31719C = new a(this);
        this.f31720H = new b(this);
        this.f31721L = new D8.a(2);
        this.f31722M = new D8.b(this, 1);
        e();
    }
}
