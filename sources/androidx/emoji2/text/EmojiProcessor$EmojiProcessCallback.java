package androidx.emoji2.text;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
interface EmojiProcessor$EmojiProcessCallback<T> {
    T getResult();

    boolean handleEmoji(@NonNull CharSequence charSequence, int i7, int i10, w wVar);
}
