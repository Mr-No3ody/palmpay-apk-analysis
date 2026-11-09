package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f16177b;

    public Q(ViewGroup viewGroup) {
        this.f16177b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16176a < this.f16177b.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.f16177b;
        int i7 = this.f16176a;
        this.f16176a = i7 + 1;
        View childAt = viewGroup.getChildAt(i7);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.f16177b;
        int i7 = this.f16176a - 1;
        this.f16176a = i7;
        viewGroup.removeViewAt(i7);
    }
}
