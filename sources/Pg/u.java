package Pg;

import java.util.RandomAccess;
import kotlin.collections.AbstractC1836c;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends AbstractC1836c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f7376d = new t(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m[] f7377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f7378c;

    public u(m[] mVarArr, int[] iArr) {
        this.f7377b = mVarArr;
        this.f7378c = iArr;
    }

    @Override // kotlin.collections.AbstractC1834a
    public final int a() {
        return this.f7377b.length;
    }

    @Override // kotlin.collections.AbstractC1834a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m) {
            return super.contains((m) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final Object get(int i7) {
        return this.f7377b[i7];
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof m) {
            return super.indexOf((m) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof m) {
            return super.lastIndexOf((m) obj);
        }
        return -1;
    }
}
