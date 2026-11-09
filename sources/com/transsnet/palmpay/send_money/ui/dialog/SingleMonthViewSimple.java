package com.transsnet.palmpay.send_money.ui.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.airbnb.lottie.model.layer.d;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.timepicker.TimeModel;
import com.sy007.calendar.widget.SingleMonthView;
import com.transsnet.palmpay.custom_view.r;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p081f8.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/SingleMonthViewSimple;", "Lcom/sy007/calendar/widget/SingleMonthView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", ViewProps.COLOR, "", "setPaintColor", "(I)V", "", "Lf8/b;", "A", "Ljava/util/Set;", "getDisableCalendarDays", "()Ljava/util/Set;", "setDisableCalendarDays", "(Ljava/util/Set;)V", "disableCalendarDays", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SingleMonthViewSimple extends SingleMonthView {

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    public Set disableCalendarDays;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f33643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f33644p;
    public final Paint t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Drawable f33645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint.FontMetrics f33646w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleMonthViewSimple(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setPaintColor(int color) {
        Paint paint = this.t;
        if (paint != null) {
            paint.setColor(color);
        } else {
            Intrinsics.n("dayTextPaint");
            throw null;
        }
    }

    @Override // com.sy007.calendar.widget.BaseMonthView
    public final void b(Canvas canvas, b calendarDay, Rect rect, boolean z3) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(calendarDay, "calendarDay");
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (z3) {
            Drawable drawable = this.f33645v;
            if (drawable == null) {
                Intrinsics.n("selectedBgDrawable");
                throw null;
            }
            drawable.setBounds(rect);
            Drawable drawable2 = this.f33645v;
            if (drawable2 == null) {
                Intrinsics.n("selectedBgDrawable");
                throw null;
            }
            drawable2.draw(canvas);
        }
        if (z3) {
            setPaintColor(this.f33643o);
        } else {
            Intrinsics.checkNotNullParameter(calendarDay, "$this$isOverDue");
            Calendar calendar = calendarDay.f36413a;
            calendar.clear();
            calendar.set(1, calendarDay.f36417e);
            calendar.set(2, calendarDay.f36418f);
            calendar.set(5, calendarDay.f36419g);
            Intrinsics.checkNotNullExpressionValue(calendar, "tempCalendar");
            Intrinsics.checkNotNullParameter(calendar, "calendar");
            if (!G8.a.j(calendarDay, new b(calendar.get(1), calendar.get(2), calendar.get(5)))) {
                Intrinsics.checkNotNullParameter(calendarDay, "calendarDay");
                Intrinsics.n("startCalendarDay");
                throw null;
            }
            setPaintColor(this.f33644p);
        }
        Paint paint = this.t;
        if (paint == null) {
            Intrinsics.n("dayTextPaint");
            throw null;
        }
        Paint.FontMetrics fontMetrics = this.f33646w;
        if (fontMetrics == null) {
            Intrinsics.n("fm");
            throw null;
        }
        paint.getFontMetrics(fontMetrics);
        float fCenterY = rect.centerY();
        Paint.FontMetrics fontMetrics2 = this.f33646w;
        if (fontMetrics2 == null) {
            Intrinsics.n("fm");
            throw null;
        }
        float f10 = fontMetrics2.descent;
        float f11 = (((f10 - fontMetrics2.ascent) / 2) + fCenterY) - f10;
        String strO = d.o(new Object[]{Integer.valueOf(calendarDay.f36416d)}, 1, Locale.CANADA, TimeModel.NUMBER_FORMAT, "format(...)");
        float fCenterX = rect.centerX();
        Paint paint2 = this.t;
        if (paint2 != null) {
            canvas.drawText(strO, fCenterX, f11, paint2);
        } else {
            Intrinsics.n("dayTextPaint");
            throw null;
        }
    }

    @Nullable
    public final Set<b> getDisableCalendarDays() {
        return this.disableCalendarDays;
    }

    public final void setDisableCalendarDays(@Nullable Set<b> set) {
        this.disableCalendarDays = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleMonthViewSimple(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SingleMonthViewSimple(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleMonthViewSimple(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33643o = Color.parseColor("#FFFFFF");
        this.f33644p = Color.parseColor("#C0C3C8");
        Color.parseColor("#202046");
        Color.parseColor("#202046");
        Paint paint = new Paint(1);
        this.t = paint;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        paint.setTextSize((20.0f * resources.getDisplayMetrics().scaledDensity) + 0.5f);
        Paint paint2 = this.t;
        if (paint2 != null) {
            paint2.setTextAlign(Paint.Align.CENTER);
            this.f33646w = new Paint.FontMetrics();
            Drawable drawable = getContext().getDrawable(r.cv_shape_rect_corner_8_bg_primary);
            Intrinsics.e(drawable);
            this.f33645v = drawable;
            return;
        }
        Intrinsics.n("dayTextPaint");
        throw null;
    }
}
