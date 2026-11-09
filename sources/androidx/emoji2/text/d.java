package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class d implements EmojiCompat$GlyphChecker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f16881b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f16882a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f16882a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat$GlyphChecker
    public final boolean hasGlyph(CharSequence charSequence, int i7, int i10, int i11) {
        ThreadLocal threadLocal = f16881b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb2 = (StringBuilder) threadLocal.get();
        sb2.setLength(0);
        while (i7 < i10) {
            sb2.append(charSequence.charAt(i7));
            i7++;
        }
        TextPaint textPaint = this.f16882a;
        String string = sb2.toString();
        int i12 = androidx.core.graphics.f.f16062a;
        return textPaint.hasGlyph(string);
    }
}
