package Sf;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f8905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8906c;

    public r(Q q10) {
        this.f8904a = 1;
        this.f8906c = new ArrayList();
        this.f8905b = q10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8904a) {
            case 0:
                break;
        }
        return this.f8905b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8904a) {
            case 0:
                return ((e) this.f8906c).f8886c.invoke(this.f8905b.next());
            default:
                Object next = this.f8905b.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                Q q10 = viewGroup != null ? new Q(viewGroup) : null;
                ArrayList arrayList = (ArrayList) this.f8906c;
                if (q10 == null || !q10.hasNext()) {
                    while (!this.f8905b.hasNext() && !arrayList.isEmpty()) {
                        this.f8905b = (Iterator) CollectionsKt.K(arrayList);
                        v.s(arrayList);
                    }
                } else {
                    arrayList.add(this.f8905b);
                    this.f8905b = q10;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8904a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r(e eVar) {
        this.f8904a = 0;
        this.f8906c = eVar;
        this.f8905b = ((Sequence) eVar.f8885b).iterator();
    }
}
