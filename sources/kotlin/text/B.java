package kotlin.text;

import kotlin.collections.AbstractC1848o;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends AbstractC1848o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38993a;

    @Override // kotlin.collections.AbstractC1848o
    public final char a() {
        int i7 = this.f38993a;
        this.f38993a = i7 + 1;
        return "0123456789".charAt(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38993a < 10;
    }
}
