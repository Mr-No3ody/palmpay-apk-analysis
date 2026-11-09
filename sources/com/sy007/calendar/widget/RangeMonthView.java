package com.sy007.calendar.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.sy007.calendar.OnRangeSelectedListener;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p081f8.b;
import p081f8.c;
import p096g8.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"Lcom/sy007/calendar/widget/RangeMonthView;", "Lcom/sy007/calendar/widget/BaseMonthView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "i", "I", "getMaximumDay", "()I", "setMaximumDay", "(I)V", "maximumDay", "Lcom/sy007/calendar/OnRangeSelectedListener;", "j", "Lcom/sy007/calendar/OnRangeSelectedListener;", "getOnSelectedListener", "()Lcom/sy007/calendar/OnRangeSelectedListener;", "setOnSelectedListener", "(Lcom/sy007/calendar/OnRangeSelectedListener;)V", "onSelectedListener", "Lf8/c;", "o", "Lf8/c;", "getSelected", "()Lf8/c;", "setSelected", "(Lf8/c;)V", "selected", "Lf8/b;", "getFirstSelected", "()Lf8/b;", "firstSelected", "getLastSelected", "lastSelected", "calendar-view_release"}, k = 1, mv = {1, 4, 0})
public abstract class RangeMonthView extends BaseMonthView {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int maximumDay;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public OnRangeSelectedListener onSelectedListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public c selected;

    @JvmOverloads
    public RangeMonthView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    private final b getFirstSelected() {
        this.selected.getClass();
        return null;
    }

    private final b getLastSelected() {
        this.selected.getClass();
        return null;
    }

    @Override // com.sy007.calendar.widget.BaseMonthView
    public final void a(Canvas canvas, b calendarDay, Rect rect) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(calendarDay, "calendarDay");
        Intrinsics.checkNotNullParameter(rect, "rect");
        b(canvas, calendarDay, rect, Intrinsics.c(calendarDay, getFirstSelected()) || Intrinsics.c(calendarDay, getLastSelected()));
    }

    public abstract void c();

    public final int getMaximumDay() {
        return this.maximumDay;
    }

    @Nullable
    public final OnRangeSelectedListener getOnSelectedListener() {
        return this.onSelectedListener;
    }

    @NotNull
    public final c getSelected() {
        return this.selected;
    }

    public final void setMaximumDay(int i7) {
        this.maximumDay = i7;
    }

    public final void setOnSelectedListener(@Nullable OnRangeSelectedListener onRangeSelectedListener) {
        this.onSelectedListener = onRangeSelectedListener;
    }

    public final void setSelected(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.selected = cVar;
    }

    @JvmOverloads
    public RangeMonthView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RangeMonthView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        new a(this, 1);
        this.maximumDay = -1;
        this.selected = new c();
    }

    public /* synthetic */ RangeMonthView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }
}
