package retrofit2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public okhttp3.U f41879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public okhttp3.J f41880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f41881c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f41882d = new ArrayList();

    public final void a(AbstractC1989g abstractC1989g) {
        ArrayList arrayList = this.f41881c;
        Objects.requireNonNull(abstractC1989g, "factory == null");
        arrayList.add(abstractC1989g);
    }

    public final void b(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        okhttp3.J j6 = okhttp3.J.f40577k.get(str);
        Objects.requireNonNull(j6, "baseUrl == null");
        ArrayList arrayList = j6.f40584f;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.f41880b = j6;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + j6);
        }
    }

    public final N c() {
        if (this.f41880b == null) {
            throw new IllegalStateException("Base URL required.");
        }
        okhttp3.U u6 = this.f41879a;
        if (u6 == null) {
            u6 = new okhttp3.U();
        }
        okhttp3.U u10 = u6;
        O1.a aVar = F.f41819a;
        C1983a c1983a = F.f41821c;
        ArrayList arrayList = new ArrayList(this.f41882d);
        List listA = c1983a.a(aVar);
        arrayList.addAll(listA);
        List listB = c1983a.b();
        int size = listB.size();
        ArrayList arrayList2 = this.f41881c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new C1984b(0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listB);
        okhttp3.J j6 = this.f41880b;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
        listA.size();
        return new N(u10, j6, listUnmodifiableList, listUnmodifiableList2, aVar);
    }
}
