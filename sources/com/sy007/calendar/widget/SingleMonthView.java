package com.sy007.calendar.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.sy007.calendar.OnSelectedListener;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p081f8.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/sy007/calendar/widget/SingleMonthView;", "Lcom/sy007/calendar/widget/BaseMonthView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sy007/calendar/OnSelectedListener;", "i", "Lcom/sy007/calendar/OnSelectedListener;", "getOnSelectedListener", "()Lcom/sy007/calendar/OnSelectedListener;", "setOnSelectedListener", "(Lcom/sy007/calendar/OnSelectedListener;)V", "onSelectedListener", "Lf8/b;", "j", "Lf8/b;", "getSelected", "()Lf8/b;", "setSelected", "(Lf8/b;)V", "selected", "calendar-view_release"}, k = 1, mv = {1, 4, 0})
public abstract class SingleMonthView extends BaseMonthView {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public OnSelectedListener onSelectedListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public b selected;

    @JvmOverloads
    public SingleMonthView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @Override // com.sy007.calendar.widget.BaseMonthView
    public final void a(Canvas canvas, b calendarDay, Rect rect) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(calendarDay, "calendarDay");
        Intrinsics.checkNotNullParameter(rect, "rect");
        b(canvas, calendarDay, rect, Intrinsics.c(calendarDay, this.selected));
    }

    @Nullable
    public final OnSelectedListener getOnSelectedListener() {
        return this.onSelectedListener;
    }

    @Nullable
    public final b getSelected() {
        return this.selected;
    }

    public final void setOnSelectedListener(@Nullable OnSelectedListener onSelectedListener) {
        this.onSelectedListener = onSelectedListener;
    }

    public final void setSelected(@Nullable b bVar) {
        this.selected = bVar;
    }

    @JvmOverloads
    public SingleMonthView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleMonthView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SingleMonthView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }
}
