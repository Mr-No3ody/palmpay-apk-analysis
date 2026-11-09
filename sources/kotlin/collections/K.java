package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends AbstractC1836c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38903b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38904c;

    public K(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38904c = delegate;
    }

    @Override // kotlin.collections.AbstractC1834a
    public final int a() {
        switch (this.f38903b) {
            case 0:
                return ((List) this.f38904c).size();
            default:
                return ((kotlin.text.o) this.f38904c).f39031a.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.AbstractC1834a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f38903b) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public final Object get(int i7) {
        switch (this.f38903b) {
            case 0:
                return ((List) this.f38904c).get(w.t(i7, this));
            default:
                String strGroup = ((kotlin.text.o) this.f38904c).f39031a.group(i7);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f38903b) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f38903b) {
            case 0:
                return new J(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f38903b) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public ListIterator listIterator() {
        switch (this.f38903b) {
            case 0:
                return new J(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // kotlin.collections.AbstractC1836c, java.util.List
    public ListIterator listIterator(int i7) {
        switch (this.f38903b) {
            case 0:
                return new J(this, i7);
            default:
                return super.listIterator(i7);
        }
    }

    public K(kotlin.text.o oVar) {
        this.f38904c = oVar;
    }
}
