package androidx.appcompat.widget;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    @NonNull
    @DoNotInline
    public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i7, int i10, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull AbstractC0851c0 abstractC0851c0) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i10 == -1) {
            i10 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i10);
        try {
            abstractC0851c0.a(builderObtain, textView);
        } catch (ClassCastException unused) {
        }
        return builderObtain.build();
    }
}
