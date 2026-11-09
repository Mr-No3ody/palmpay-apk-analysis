package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: renamed from: kotlin.collections.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1841h extends AbstractSet implements Set, KMutableSet {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
