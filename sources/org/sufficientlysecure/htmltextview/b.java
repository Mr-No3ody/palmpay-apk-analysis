package org.sufficientlysecure.htmltextview;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f41120b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f41121a;

    public b(String str) {
        Typeface typeface;
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "sans-serif":
            case "sans":
                typeface = Typeface.SANS_SERIF;
                break;
            case "monospace":
                typeface = Typeface.MONOSPACE;
                break;
            case "serif":
                typeface = Typeface.SERIF;
                break;
            default:
                typeface = (Typeface) f41120b.get(lowerCase);
                if (typeface == null) {
                    typeface = null;
                    break;
                }
                break;
        }
        this.f41121a = typeface;
    }

    public static void a(String str, Typeface typeface, Integer num) {
        if (typeface != null) {
            String lowerCase = str.toLowerCase();
            if (num.intValue() >= 100 && num.intValue() <= 900) {
                if (Build.VERSION.SDK_INT >= 28) {
                    typeface = Typeface.create(typeface, num.intValue(), (typeface.getStyle() & 2) != 0);
                } else {
                    typeface = Typeface.create(typeface, num.intValue() >= 600 ? 1 : 0);
                }
            }
            f41120b.put(lowerCase, typeface);
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.f41121a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.f41121a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }
}
