package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/SingleKeyValueBean;", "", "key", "", "value", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getKey", "()Ljava/lang/CharSequence;", "getValue", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SingleKeyValueBean {

    @Nullable
    private final CharSequence key;

    @Nullable
    private final CharSequence value;

    public SingleKeyValueBean(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        this.key = charSequence;
        this.value = charSequence2;
    }

    @Nullable
    public final CharSequence getKey() {
        return this.key;
    }

    @Nullable
    public final CharSequence getValue() {
        return this.value;
    }
}
