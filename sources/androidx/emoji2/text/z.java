package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16943a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f16944b;

    public z(Spannable spannable) {
        this.f16944b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f16944b;
        if (!this.f16943a) {
            if ((Build.VERSION.SDK_INT < 28 ? new com.growingio.android.circler.a(4) : new y(4)).a(spannable)) {
                this.f16944b = new SpannableString(spannable);
            }
        }
        this.f16943a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f16944b.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f16944b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f16944b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f16944b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f16944b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f16944b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i10, Class cls) {
        return this.f16944b.getSpans(i7, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f16944b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        return this.f16944b.nextSpanTransition(i7, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f16944b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i10, int i11) {
        a();
        this.f16944b.setSpan(obj, i7, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        return this.f16944b.subSequence(i7, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f16944b.toString();
    }
}
