package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f16148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f16149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16151d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            A1.a.h(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
        }
        this.f16148a = textPaint;
        this.f16149b = textDirectionHeuristic;
        this.f16150c = i7;
        this.f16151d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16150c != cVar.f16150c || this.f16151d != cVar.f16151d) {
            return false;
        }
        TextPaint textPaint = this.f16148a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = cVar.f16148a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f16149b == cVar.f16149b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f16148a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f16149b, Integer.valueOf(this.f16150c), Integer.valueOf(this.f16151d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f16148a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i7 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i7 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f16149b);
        sb2.append(", breakStrategy=" + this.f16150c);
        sb2.append(", hyphenationFrequency=" + this.f16151d);
        sb2.append("}");
        return sb2.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f16148a = params.getTextPaint();
        this.f16149b = params.getTextDirection();
        this.f16150c = params.getBreakStrategy();
        this.f16151d = params.getHyphenationFrequency();
    }
}
