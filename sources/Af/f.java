package Af;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341e;

    public f(e map, int i7) {
        this.f341e = i7;
        Intrinsics.checkNotNullParameter(map, "map");
        this.f348d = map;
        this.f346b = -1;
        this.f347c = map.f336i;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f341e) {
            case 0:
                b();
                int i7 = this.f345a;
                e eVar = (e) this.f348d;
                if (i7 >= eVar.f334f) {
                    throw new NoSuchElementException();
                }
                this.f345a = i7 + 1;
                this.f346b = i7;
                g gVar = new g(eVar, i7);
                e();
                return gVar;
            case 1:
                b();
                int i10 = this.f345a;
                e eVar2 = (e) this.f348d;
                if (i10 >= eVar2.f334f) {
                    throw new NoSuchElementException();
                }
                this.f345a = i10 + 1;
                this.f346b = i10;
                Object obj = eVar2.f329a[i10];
                e();
                return obj;
            default:
                b();
                int i11 = this.f345a;
                e eVar3 = (e) this.f348d;
                if (i11 >= eVar3.f334f) {
                    throw new NoSuchElementException();
                }
                this.f345a = i11 + 1;
                this.f346b = i11;
                Object[] objArr = eVar3.f330b;
                Intrinsics.e(objArr);
                Object obj2 = objArr[this.f346b];
                e();
                return obj2;
        }
    }
}
