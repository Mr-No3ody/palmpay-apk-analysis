package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1151w1 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Internal$IntList f16798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Internal$IntListAdapter$IntConverter f16799b;

    public C1151w1(Internal$IntList internal$IntList, Internal$IntListAdapter$IntConverter internal$IntListAdapter$IntConverter) {
        this.f16798a = internal$IntList;
        this.f16799b = internal$IntListAdapter$IntConverter;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.f16799b.convert(this.f16798a.getInt(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16798a.size();
    }
}
