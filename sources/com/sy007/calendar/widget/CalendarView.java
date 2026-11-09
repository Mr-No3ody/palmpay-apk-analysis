package com.sy007.calendar.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.sy007.calendar.MonthViewBinder;
import com.sy007.calendar.OnMonthScrollListener;
import com.sy007.calendar.widget.help.CalendarLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p065e8.d;
import p113h8.a;
import p113h8.b;
import p113h8.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R,\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R$\u00102\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R,\u0010:\u001a\f\u0012\u0006\b\u0001\u0012\u000209\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/sy007/calendar/widget/CalendarView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Le8/a;", "monthConfig", "", "setUp", "(Le8/a;)V", "Le8/d;", "value", "b", "Le8/d;", "getScrollMode$calendar_view_release", "()Le8/d;", "setScrollMode$calendar_view_release", "(Le8/d;)V", "scrollMode", "Lcom/sy007/calendar/MonthViewBinder;", "Lcom/sy007/calendar/widget/BaseMonthView;", "c", "Lcom/sy007/calendar/MonthViewBinder;", "getMonthViewBinder", "()Lcom/sy007/calendar/MonthViewBinder;", "setMonthViewBinder", "(Lcom/sy007/calendar/MonthViewBinder;)V", "monthViewBinder", "Lcom/sy007/calendar/OnMonthScrollListener;", "d", "Lcom/sy007/calendar/OnMonthScrollListener;", "getMonthScrollListener", "()Lcom/sy007/calendar/OnMonthScrollListener;", "setMonthScrollListener", "(Lcom/sy007/calendar/OnMonthScrollListener;)V", "monthScrollListener", "Lcom/sy007/calendar/widget/help/CalendarLayoutManager;", "getCalendarLayoutManager", "()Lcom/sy007/calendar/widget/help/CalendarLayoutManager;", "calendarLayoutManager", "Lh8/a;", "getMCalendarAdapter", "()Lh8/a;", "mCalendarAdapter", "Lh8/c;", "monthHeaderViewDecoration", "Lh8/c;", "getMonthHeaderViewDecoration$calendar_view_release", "()Lh8/c;", "setMonthHeaderViewDecoration$calendar_view_release", "(Lh8/c;)V", "Le8/b;", "Landroid/view/View;", "headerViewBinder", "Le8/b;", "getHeaderViewBinder", "()Le8/b;", "setHeaderViewBinder", "(Le8/b;)V", "calendar-view_release"}, k = 1, mv = {1, 4, 0})
public final class CalendarView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public d scrollMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public MonthViewBinder monthViewBinder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public OnMonthScrollListener monthScrollListener;

    @JvmOverloads
    public CalendarView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    private final CalendarLayoutManager getCalendarLayoutManager() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof CalendarLayoutManager)) {
            layoutManager = null;
        }
        return (CalendarLayoutManager) layoutManager;
    }

    private final a getMCalendarAdapter() {
        RecyclerView.Adapter adapter = getAdapter();
        if (!(adapter instanceof a)) {
            adapter = null;
        }
        return (a) adapter;
    }

    @Nullable
    public final p065e8.b getHeaderViewBinder() {
        return null;
    }

    @Nullable
    public final c getMonthHeaderViewDecoration$calendar_view_release() {
        return null;
    }

    @Nullable
    public final OnMonthScrollListener getMonthScrollListener() {
        return this.monthScrollListener;
    }

    @Nullable
    public final MonthViewBinder<? extends BaseMonthView> getMonthViewBinder() {
        return this.monthViewBinder;
    }

    @NotNull
    /* JADX INFO: renamed from: getScrollMode$calendar_view_release, reason: from getter */
    public final d getScrollMode() {
        return this.scrollMode;
    }

    public final void setMonthScrollListener(@Nullable OnMonthScrollListener onMonthScrollListener) {
        this.monthScrollListener = onMonthScrollListener;
    }

    public final void setMonthViewBinder(@Nullable MonthViewBinder<? extends BaseMonthView> monthViewBinder) {
        this.monthViewBinder = monthViewBinder;
    }

    public final void setScrollMode$calendar_view_release(@NotNull d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.scrollMode = value;
        if (d.f36183b == value) {
            this.f25497a.attachToRecyclerView(this);
        }
    }

    public final void setUp(@NotNull p065e8.a monthConfig) {
        Intrinsics.checkNotNullParameter(monthConfig, "monthConfig");
        if (this.monthViewBinder != null) {
            throw null;
        }
    }

    @JvmOverloads
    public CalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25497a = new b();
        this.scrollMode = d.f36182a;
    }

    public /* synthetic */ CalendarView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public final void setHeaderViewBinder(@Nullable p065e8.b bVar) {
    }

    public final void setMonthHeaderViewDecoration$calendar_view_release(@Nullable c cVar) {
    }
}
