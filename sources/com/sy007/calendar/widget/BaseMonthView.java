package com.sy007.calendar.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.sy007.calendar.OnCalendarDayClickListener;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p065e8.c;
import p081f8.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \b&\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR$\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000bR$\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000bR\"\u0010$\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u000b\"\u0004\b'\u0010#R\"\u0010,\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010#¨\u0006-"}, d2 = {"Lcom/sy007/calendar/widget/BaseMonthView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getRealHeight$calendar_view_release", "()I", "getRealHeight", "Lcom/sy007/calendar/OnCalendarDayClickListener;", "a", "Lcom/sy007/calendar/OnCalendarDayClickListener;", "getOnClickListener$calendar_view_release", "()Lcom/sy007/calendar/OnCalendarDayClickListener;", "setOnClickListener$calendar_view_release", "(Lcom/sy007/calendar/OnCalendarDayClickListener;)V", "onClickListener", "<set-?>", "b", "I", "getColumnNum", "columnNum", "c", "getDayWidth", "dayWidth", "d", "getRowNum", "rowNum", "e", "getRowHeight", "setRowHeight", "(I)V", "rowHeight", "f", "getDividerHeight", "setDividerHeight", "dividerHeight", "g", "getDividerColor", "setDividerColor", "dividerColor", "calendar-view_release"}, k = 1, mv = {1, 4, 0})
public abstract class BaseMonthView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public OnCalendarDayClickListener onClickListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int columnNum;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int dayWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int rowNum;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int rowHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int dividerHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int dividerColor;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    @JvmOverloads
    public BaseMonthView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    public abstract void a(Canvas canvas, b bVar, Rect rect);

    public abstract void b(Canvas canvas, b bVar, Rect rect, boolean z3);

    public final int getColumnNum() {
        return this.columnNum;
    }

    public final int getDayWidth() {
        return this.dayWidth;
    }

    public final int getDividerColor() {
        return this.dividerColor;
    }

    public final int getDividerHeight() {
        return this.dividerHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnClickListener$calendar_view_release, reason: from getter */
    public final OnCalendarDayClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public final int getRealHeight$calendar_view_release() {
        int i7 = this.rowNum;
        return getPaddingBottom() + getPaddingTop() + (i7 * this.rowHeight) + ((i7 - 1) * this.dividerHeight);
    }

    public final int getRowHeight() {
        return this.rowHeight;
    }

    public final int getRowNum() {
        return this.rowNum;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(i7, getRealHeight$calendar_view_release());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int paddingRight = i7 - (getPaddingRight() + getPaddingLeft());
        int i13 = this.columnNum;
        this.dayWidth = paddingRight / i13;
        int paddingLeft = (((i7 - getPaddingLeft()) - getPaddingRight()) % i13) / 2;
        setPadding(getPaddingLeft() + paddingLeft, getPaddingTop(), getPaddingRight() + paddingLeft, getPaddingBottom());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            float x3 = event.getX();
            float y8 = event.getY();
            if (x3 >= getPaddingLeft() && x3 <= getWidth() - getPaddingRight() && y8 >= getPaddingTop() && y8 <= getHeight() - getPaddingBottom()) {
                getPaddingTop();
                Intrinsics.n("curCalendarDay");
                throw null;
            }
        }
        return true;
    }

    public final void setDividerColor(int i7) {
        this.dividerColor = i7;
    }

    public final void setDividerHeight(int i7) {
        this.dividerHeight = i7;
    }

    public final void setOnClickListener$calendar_view_release(@Nullable OnCalendarDayClickListener onCalendarDayClickListener) {
        this.onClickListener = onCalendarDayClickListener;
    }

    public final void setRowHeight(int i7) {
        this.rowHeight = i7;
    }

    @JvmOverloads
    public BaseMonthView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseMonthView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.columnNum = 7;
        this.rowNum = 6;
        new p096g8.a(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.MonthView);
        int i10 = c.MonthView_rowHeight;
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this.rowHeight = (int) typedArrayObtainStyledAttributes.getFloat(i10, (64.0f * resources.getDisplayMetrics().density) + 0.5f);
        this.dividerHeight = (int) typedArrayObtainStyledAttributes.getDimension(c.MonthView_dividerHeight, 0.0f);
        this.dividerColor = typedArrayObtainStyledAttributes.getColor(c.MonthView_dividerColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        new Rect();
        new Paint().setColor(this.dividerColor);
    }

    public /* synthetic */ BaseMonthView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }
}
