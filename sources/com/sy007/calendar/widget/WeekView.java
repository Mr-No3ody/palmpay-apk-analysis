package com.sy007.calendar.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p065e8.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sy007/calendar/widget/WeekView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "calendar-view_release"}, k = 1, mv = {1, 4, 0})
public final class WeekView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence[] f25513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f25514g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f25515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint.FontMetrics f25516j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f25517o;

    @JvmOverloads
    public WeekView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        CharSequence[] charSequenceArr = this.f25513f;
        if (charSequenceArr == null || charSequenceArr.length == 0) {
            return;
        }
        Paint paint = this.f25517o;
        if (paint == null) {
            Intrinsics.n("labelPaint");
            throw null;
        }
        Paint.FontMetrics fontMetrics = this.f25516j;
        if (fontMetrics == null) {
            Intrinsics.n("fontMetrics");
            throw null;
        }
        paint.getFontMetrics(fontMetrics);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        for (int i7 = 0; i7 < this.f25511d; i7++) {
            RectF rectF = this.f25515i;
            if (rectF == null) {
                Intrinsics.n("labelRectF");
                throw null;
            }
            float f10 = paddingLeft;
            rectF.set(f10, paddingTop, this.f25512e + f10, paddingTop + height);
            Paint paint2 = this.f25517o;
            if (paint2 == null) {
                Intrinsics.n("labelPaint");
                throw null;
            }
            Object obj = this.f25514g.get(Integer.valueOf(i7));
            Intrinsics.e(obj);
            paint2.setColor(((Number) obj).intValue());
            Paint.FontMetrics fontMetrics2 = this.f25516j;
            if (fontMetrics2 == null) {
                Intrinsics.n("fontMetrics");
                throw null;
            }
            float f11 = fontMetrics2.descent;
            float f12 = ((f11 - fontMetrics2.ascent) / 2) - f11;
            RectF rectF2 = this.f25515i;
            if (rectF2 == null) {
                Intrinsics.n("labelRectF");
                throw null;
            }
            float fCenterY = rectF2.centerY() + f12;
            String string = charSequenceArr[i7].toString();
            RectF rectF3 = this.f25515i;
            if (rectF3 == null) {
                Intrinsics.n("labelRectF");
                throw null;
            }
            float fCenterX = rectF3.centerX();
            Paint paint3 = this.f25517o;
            if (paint3 == null) {
                Intrinsics.n("labelPaint");
                throw null;
            }
            canvas.drawText(string, fCenterX, fCenterY, paint3);
            paddingLeft += (int) this.f25512e;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        Paint paint = this.f25517o;
        if (paint == null) {
            Intrinsics.n("labelPaint");
            throw null;
        }
        Paint.FontMetrics fontMetrics = this.f25516j;
        if (fontMetrics == null) {
            Intrinsics.n("fontMetrics");
            throw null;
        }
        paint.getFontMetrics(fontMetrics);
        Paint.FontMetrics fontMetrics2 = this.f25516j;
        if (fontMetrics2 == null) {
            Intrinsics.n("fontMetrics");
            throw null;
        }
        float f10 = fontMetrics2.descent;
        if (fontMetrics2 == null) {
            Intrinsics.n("fontMetrics");
            throw null;
        }
        setMeasuredDimension(i7, getPaddingBottom() + getPaddingTop() + ((int) (f10 - fontMetrics2.ascent)));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f25512e = ((i7 - getPaddingLeft()) - getPaddingRight()) / (this.f25511d * 1.0f);
    }

    @JvmOverloads
    public WeekView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WeekView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25511d = 7;
        this.f25514g = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        float f10 = (13.0f * resources.getDisplayMetrics().scaledDensity) + 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.WeekView);
        this.f25508a = typedArrayObtainStyledAttributes.getColor(c.WeekView_wv_weekend_text_color, Color.parseColor("#FF6E00"));
        this.f25509b = typedArrayObtainStyledAttributes.getColor(c.WeekView_wv_text_color, Color.parseColor("#000000"));
        this.f25510c = typedArrayObtainStyledAttributes.getDimension(c.WeekView_wv_text_size, f10);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(c.WeekView_wv_content);
        this.f25513f = textArray;
        if (textArray != null) {
            int length = textArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                CharSequence charSequence = textArray[i10];
                this.f25514g.put(Integer.valueOf(i11), Integer.valueOf(this.f25509b));
                i10++;
                i11++;
            }
        }
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(c.WeekView_wv_weekend_index);
        if (textArray2 != null) {
            for (CharSequence charSequence2 : textArray2) {
                this.f25514g.put(Integer.valueOf(Integer.parseInt(charSequence2.toString())), Integer.valueOf(this.f25508a));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f25515i = new RectF();
        Paint paint = new Paint(1);
        this.f25517o = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        Paint paint2 = this.f25517o;
        if (paint2 != null) {
            paint2.setTextSize(this.f25510c);
            this.f25516j = new Paint.FontMetrics();
        } else {
            Intrinsics.n("labelPaint");
            throw null;
        }
    }

    public /* synthetic */ WeekView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }
}
