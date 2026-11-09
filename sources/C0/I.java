package C0;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f949f;

    public I(K destination, Bundle bundle, boolean z3, int i7, boolean z8, int i10) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f944a = destination;
        this.f945b = bundle;
        this.f946c = z3;
        this.f947d = i7;
        this.f948e = z8;
        this.f949f = i10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(I other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z3 = this.f946c;
        if (z3 && !other.f946c) {
            return 1;
        }
        if (!z3 && other.f946c) {
            return -1;
        }
        int i7 = this.f947d - other.f947d;
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        Bundle bundle = other.f945b;
        Bundle bundle2 = this.f945b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            Intrinsics.e(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z8 = other.f948e;
        boolean z10 = this.f948e;
        if (z10 && !z8) {
            return 1;
        }
        if (z10 || !z8) {
            return this.f949f - other.f949f;
        }
        return -1;
    }
}
