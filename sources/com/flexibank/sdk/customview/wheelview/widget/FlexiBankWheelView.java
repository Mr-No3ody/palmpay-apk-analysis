package com.flexibank.sdk.customview.wheelview.widget;

import Be.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import io.fastkv.n;
import java.util.HashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005/DE7FB\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nB%\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u0019\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00102\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00102\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(R$\u0010.\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0013\u0010A\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010C\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bB\u0010-¨\u0006G"}, d2 = {"Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView;", "T", "Landroid/widget/ListView;", "Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelViewContract;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView$OnWheelItemSelectedListener;", "onWheelItemSelectedListener", "", "setOnWheelItemSelectedListener", "(Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView$OnWheelItemSelectedListener;)V", "wheelSize", "setWheelSize", "(I)V", "", "loop", "setLoop", "(Z)V", "clickable", "setWheelClickable", "selection", "setSelection", "Landroid/widget/ListAdapter;", "adapter", "setAdapter", "(Landroid/widget/ListAdapter;)V", "Ls4/a;", "setWheelAdapter", "(Ls4/a;)V", "", "list", "setWheelData", "(Ljava/util/List;)V", "value", "e", "I", "getCurrentPosition", "()I", "currentPosition", "Lw4/a;", "j", "Lw4/a;", "getSkin", "()Lw4/a;", "setSkin", "(Lw4/a;)V", "skin", "Lw4/b;", "o", "Lw4/b;", "getStyle", "()Lw4/b;", "setStyle", "(Lw4/b;)V", "style", "getSelectionItem", "()Ljava/lang/Object;", "selectionItem", "getWheelCount", "wheelCount", "OnWheelItemSelectedListener", "OnWheelItemClickListener", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankWheelView<T> extends ListView implements FlexiBankWheelViewContract<T> {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f22274M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c f22275A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final com.flexibank.sdk.customview.wheelview.widget.a f22276B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final b f22277C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final D8.a f22278H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final D8.b f22279L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f22283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22286g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f22287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public p334w4.a skin;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public p334w4.b style;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlexiBankWheelView f22290p;
    public HashMap t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p278s4.a f22291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OnWheelItemSelectedListener f22292w;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView$OnWheelItemClickListener;", "T", "", "onItemClick", "", ViewProps.POSITION, "", "t", "(ILjava/lang/Object;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnWheelItemClickListener<T> {
        void onItemClick(int position, @Nullable T t);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView$OnWheelItemSelectedListener;", "T", "", "onItemSelected", "", ViewProps.POSITION, "", "t", "(ILjava/lang/Object;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnWheelItemSelectedListener<T> {
        void onItemSelected(int position, @Nullable T t);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public FlexiBankWheelView(@Nullable Context context) {
        super(context);
        this.f22281b = 3;
        this.currentPosition = -1;
        this.skin = p334w4.a.f43257c;
        this.style = new p334w4.b();
        this.f22276B = new com.flexibank.sdk.customview.wheelview.widget.a(this);
        this.f22277C = new b(this);
        this.f22278H = new D8.a(3);
        this.f22279L = new D8.b(this, 2);
        d();
    }

    public static final int a(FlexiBankWheelView flexiBankWheelView, float f10) {
        if (Math.abs(f10) <= 2.0f) {
            return (int) f10;
        }
        if (Math.abs(f10) < 12.0f) {
            return f10 > 0.0f ? 2 : -2;
        }
        return (int) (f10 / 6);
    }

    public static final void b(FlexiBankWheelView flexiBankWheelView, boolean z3) {
        if (flexiBankWheelView.getChildAt(0) == null || flexiBankWheelView.f22280a == 0) {
            return;
        }
        int firstVisiblePosition = flexiBankWheelView.getFirstVisiblePosition();
        if (flexiBankWheelView.f22282c && firstVisiblePosition == 0) {
            return;
        }
        int wheelCount = Math.abs(flexiBankWheelView.getChildAt(0).getY()) <= ((float) (flexiBankWheelView.f22280a / 2)) ? firstVisiblePosition : firstVisiblePosition + 1;
        int i7 = flexiBankWheelView.f22281b / 2;
        flexiBankWheelView.e(firstVisiblePosition, i7 + wheelCount, i7);
        if (flexiBankWheelView.f22282c) {
            wheelCount = ((flexiBankWheelView.f22281b / 2) + wheelCount) % flexiBankWheelView.getWheelCount();
        }
        if (wheelCount != flexiBankWheelView.currentPosition || z3) {
            flexiBankWheelView.currentPosition = wheelCount;
            p278s4.a aVar = flexiBankWheelView.f22291v;
            Intrinsics.e(aVar);
            aVar.f42017e = wheelCount;
            com.flexibank.sdk.customview.wheelview.widget.a aVar2 = flexiBankWheelView.f22276B;
            aVar2.removeMessages(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            aVar2.sendEmptyMessageDelayed(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 300L);
        }
    }

    public final void d() {
        if (this.style == null) {
            this.style = new p334w4.b();
        }
        this.f22287i = new Paint(1);
        setTag("com.wx.wheelview");
        setVerticalScrollBarEnabled(false);
        setScrollingCacheEnabled(false);
        setCacheColorHint(0);
        setFadingEdgeLength(0);
        setOverScrollMode(2);
        setDividerHeight(0);
        setOnItemClickListener(this.f22277C);
        setOnScrollListener(this.f22279L);
        setOnTouchListener(this.f22278H);
        setNestedScrollingEnabled(true);
        if (this.f22275A != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f22275A);
        }
        this.f22275A = new c(this, 21);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f22275A);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        Rect rect = new Rect(0, (this.f22281b / 2) * this.f22280a, getWidth(), ((this.f22281b / 2) + 1) * this.f22280a);
        Paint paint = this.f22287i;
        Intrinsics.e(paint);
        paint.setTextSize(0);
        Paint paint2 = this.f22287i;
        Intrinsics.e(paint2);
        paint2.setColor(0);
        Paint paint3 = this.f22287i;
        Intrinsics.e(paint3);
        Paint.FontMetricsInt fontMetricsInt = paint3.getFontMetricsInt();
        int i7 = (((rect.bottom + rect.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
        Paint paint4 = this.f22287i;
        Intrinsics.e(paint4);
        paint4.setTextAlign(Paint.Align.CENTER);
        Intrinsics.e(null);
        float fCenterX = rect.centerX();
        float f10 = i7;
        Paint paint5 = this.f22287i;
        Intrinsics.e(paint5);
        canvas.drawText(null, fCenterX, f10, paint5);
    }

    public final void e(int i7, int i10, int i11) {
        TextView textViewH;
        int i12;
        int i13;
        int i14 = i10 - i11;
        int i15 = i11 + i10;
        if (i14 > i15) {
            return;
        }
        while (true) {
            View childAt = getChildAt(i14 - i7);
            if (childAt != null && (textViewH = n.h(childAt)) != null) {
                int i16 = 16;
                if (i10 == i14) {
                    p334w4.b bVar = this.style;
                    Intrinsics.e(bVar);
                    if (bVar.f43261c != -10) {
                        p334w4.b bVar2 = this.style;
                        Intrinsics.e(bVar2);
                        i13 = bVar2.f43261c;
                    } else {
                        i13 = p290t4.a.f42326d;
                    }
                    p334w4.b bVar3 = this.style;
                    Intrinsics.e(bVar3);
                    if (bVar3.f43262d != -10) {
                        p334w4.b bVar4 = this.style;
                        Intrinsics.e(bVar4);
                        i13 = bVar4.f43262d;
                    }
                    p334w4.b bVar5 = this.style;
                    Intrinsics.e(bVar5);
                    if (bVar5.f43263e != -1) {
                        p334w4.b bVar6 = this.style;
                        Intrinsics.e(bVar6);
                        i16 = bVar6.f43263e;
                    }
                    float f10 = i16;
                    Intrinsics.e(this.style);
                    p334w4.b bVar7 = this.style;
                    Intrinsics.e(bVar7);
                    if (bVar7.f43264f != -1) {
                        p334w4.b bVar8 = this.style;
                        Intrinsics.e(bVar8);
                        f10 = bVar8.f43264f;
                    }
                    textViewH.setTextColor(i13);
                    textViewH.setTextSize(2, f10);
                    childAt.setAlpha(1.0f);
                } else {
                    p334w4.b bVar9 = this.style;
                    Intrinsics.e(bVar9);
                    if (bVar9.f43261c != -1) {
                        p334w4.b bVar10 = this.style;
                        Intrinsics.e(bVar10);
                        i12 = bVar10.f43261c;
                    } else {
                        i12 = p290t4.a.f42326d;
                    }
                    p334w4.b bVar11 = this.style;
                    Intrinsics.e(bVar11);
                    if (bVar11.f43263e != -1) {
                        p334w4.b bVar12 = this.style;
                        Intrinsics.e(bVar12);
                        i16 = bVar12.f43263e;
                    }
                    int iAbs = Math.abs(i14 - i10);
                    Intrinsics.e(this.style);
                    float fPow = (float) Math.pow(1.0f, iAbs);
                    textViewH.setTextColor(i12);
                    textViewH.setTextSize(2, i16);
                    childAt.setAlpha(fPow);
                }
            }
            if (i14 == i15) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    @Nullable
    public final T getSelectionItem() {
        int i7 = this.currentPosition;
        if (i7 < 0) {
            i7 = 0;
        }
        List list = this.f22283d;
        if (list == null) {
            return null;
        }
        Intrinsics.e(list);
        if (list.size() <= i7) {
            return null;
        }
        List list2 = this.f22283d;
        Intrinsics.e(list2);
        return (T) list2.get(i7);
    }

    @NotNull
    public final p334w4.a getSkin() {
        return this.skin;
    }

    @NotNull
    public final p334w4.b getStyle() {
        return this.style;
    }

    public final int getWheelCount() {
        List list = this.f22283d;
        if (list == null || list.size() == 0) {
            return 0;
        }
        List list2 = this.f22283d;
        Intrinsics.e(list2);
        return list2.size();
    }

    @Override // com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelViewContract
    public final void join(FlexiBankWheelView wheelView) {
        Intrinsics.checkNotNullParameter(wheelView, "wheelView");
        this.f22290p = wheelView;
    }

    @Override // com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelViewContract
    public final void joinDatas(HashMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.t = map;
    }

    @Override // com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelViewContract
    public void setLoop(boolean loop) {
        if (loop != this.f22282c) {
            this.f22282c = loop;
            setSelection(0);
            p278s4.a aVar = this.f22291v;
            if (aVar != null) {
                aVar.d(loop);
            }
        }
    }

    public final void setOnWheelItemSelectedListener(@Nullable OnWheelItemSelectedListener<T> onWheelItemSelectedListener) {
        this.f22292w = onWheelItemSelectedListener;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public void setSelection(int selection) {
        this.f22285f = selection;
        setVisibility(4);
        postDelayed(new androidx.core.provider.a(this, selection, 3), 500L);
    }

    public final void setSkin(@NotNull p334w4.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.skin = aVar;
    }

    public final void setStyle(@NotNull p334w4.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.style = bVar;
    }

    @Override // com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelViewContract
    public void setWheelAdapter(@Nullable p278s4.a adapter) {
        super.setAdapter((ListAdapter) adapter);
        this.f22291v = adapter;
        Intrinsics.e(adapter);
        adapter.c(this.f22283d);
        adapter.e(this.f22281b);
        adapter.d(this.f22282c);
        adapter.b(this.f22286g);
    }

    @Override // com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelViewContract
    public void setWheelClickable(boolean clickable) {
        if (clickable != this.f22286g) {
            this.f22286g = clickable;
            p278s4.a aVar = this.f22291v;
            if (aVar != null) {
                aVar.b(clickable);
            }
        }
    }

    @Override // com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelViewContract
    public void setWheelData(@Nullable List<T> list) {
        List<T> list2 = list;
        if (list2 == null || list2.size() == 0) {
            Log.e("FlexiBankWheelView", "setWheelData: wheel datas are error.");
        }
        this.f22283d = list;
        p278s4.a aVar = this.f22291v;
        if (aVar != null) {
            aVar.c(list);
        }
    }

    @Override // com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelViewContract
    public void setWheelSize(int wheelSize) {
        if ((wheelSize & 1) == 0) {
            throw new P0.c("wheel size must be an odd number.", 19, false);
        }
        this.f22281b = wheelSize;
        p278s4.a aVar = this.f22291v;
        if (aVar != null) {
            aVar.e(wheelSize);
        }
    }

    @Override // android.widget.AdapterView
    @Deprecated(message = "")
    public void setAdapter(@Nullable ListAdapter adapter) {
        if (adapter == null || !(adapter instanceof p278s4.a)) {
            throw new P0.c("please invoke setWheelAdapter method.", 19, false);
        }
        setWheelAdapter((p278s4.a) adapter);
    }

    public FlexiBankWheelView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22281b = 3;
        this.currentPosition = -1;
        this.skin = p334w4.a.f43257c;
        this.style = new p334w4.b();
        this.f22276B = new com.flexibank.sdk.customview.wheelview.widget.a(this);
        this.f22277C = new b(this);
        this.f22278H = new D8.a(3);
        this.f22279L = new D8.b(this, 2);
        d();
    }

    public FlexiBankWheelView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22281b = 3;
        this.currentPosition = -1;
        this.skin = p334w4.a.f43257c;
        this.style = new p334w4.b();
        this.f22276B = new com.flexibank.sdk.customview.wheelview.widget.a(this);
        this.f22277C = new b(this);
        this.f22278H = new D8.a(3);
        this.f22279L = new D8.b(this, 2);
        d();
    }
}
