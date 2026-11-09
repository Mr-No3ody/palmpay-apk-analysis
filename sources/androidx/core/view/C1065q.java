package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: renamed from: androidx.core.view.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1065q implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Menu f16275b;

    public C1065q(Menu menu) {
        this.f16275b = menu;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16274a < this.f16275b.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Menu menu = this.f16275b;
        int i7 = this.f16274a;
        this.f16274a = i7 + 1;
        MenuItem item = menu.getItem(i7);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Unit unit;
        Menu menu = this.f16275b;
        int i7 = this.f16274a - 1;
        this.f16274a = i7;
        MenuItem item = menu.getItem(i7);
        if (item != null) {
            menu.removeItem(item.getItemId());
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
