package androidx.emoji2.text;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes.dex */
public final class m implements EmojiProcessor$EmojiProcessCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f16904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final retrofit2.adapter.rxjava2.d f16905b;

    public m(z zVar, retrofit2.adapter.rxjava2.d dVar) {
        this.f16904a = zVar;
        this.f16905b = dVar;
    }

    @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public final Object getResult() {
        return this.f16904a;
    }

    @Override // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public final boolean handleEmoji(CharSequence charSequence, int i7, int i10, w wVar) {
        if ((wVar.f16941c & 4) > 0) {
            return true;
        }
        if (this.f16904a == null) {
            this.f16904a = new z(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        this.f16905b.getClass();
        this.f16904a.setSpan(new x(wVar), i7, i10, 33);
        return true;
    }
}
