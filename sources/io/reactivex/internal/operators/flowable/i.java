package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Consumer;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f37693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f37694b;

    static {
        i iVar = new i("INSTANCE", 0);
        f37693a = iVar;
        f37694b = new i[]{iVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f37694b.clone();
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        ((Subscription) obj).request(Long.MAX_VALUE);
    }
}
