package com.mikepenz.iconics.utils;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/mikepenz/iconics/utils/IconicsTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IconicsTypefaceSpan extends TypefaceSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f23604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconicsTypefaceSpan(Typeface newType) {
        super("sans-serif");
        Intrinsics.checkNotNullParameter("sans-serif", "family");
        Intrinsics.checkNotNullParameter(newType, "newType");
        this.f23604a = newType;
    }

    public static void c(TextPaint textPaint, Typeface typeface) {
        Typeface typeface2 = textPaint.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & (~typeface.getStyle());
        if ((style & 1) != 0) {
            textPaint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            textPaint.setTextSkewX(-0.25f);
        }
        textPaint.setTypeface(typeface);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        c(ds, this.f23604a);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        c(paint, this.f23604a);
    }
}
