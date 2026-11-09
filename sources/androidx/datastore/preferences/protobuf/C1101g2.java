package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1101g2 extends M.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1093e2 f16626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1101g2(C1093e2 c1093e2) {
        super(c1093e2, 1);
        this.f16626c = c1093e2;
    }

    @Override // M.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1097f2(this.f16626c);
    }
}
