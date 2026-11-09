package E;

import V0.C0695n;
import androidx.arch.core.util.Function;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1934a;

    public /* synthetic */ K(int i7) {
        this.f1934a = i7;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        long j6;
        int i7;
        long jCalculateNextRunTime;
        switch (this.f1934a) {
            case 0:
                M m7 = P.f1940z;
                return null;
            case 1:
                return null;
            case 2:
                try {
                    return androidx.camera.video.internal.workaround.b.a(androidx.camera.video.internal.encoder.A.l((androidx.camera.video.internal.encoder.d) obj), null);
                } catch (androidx.camera.video.internal.encoder.x unused) {
                    p140j8.f.G("VideoEncoderInfoImpl");
                    return null;
                }
            case 3:
                return new androidx.camera.view.t((androidx.camera.lifecycle.h) obj);
            default:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                List<androidx.work.impl.model.j> list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list2, 10));
                for (androidx.work.impl.model.j jVar : list2) {
                    ArrayList arrayList2 = jVar.f18609q;
                    C0695n c0695n = !arrayList2.isEmpty() ? (C0695n) arrayList2.get(0) : C0695n.f9957c;
                    UUID uuidFromString = UUID.fromString(jVar.f18593a);
                    Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(id)");
                    HashSet hashSet = new HashSet(jVar.f18608p);
                    long j10 = jVar.f18597e;
                    V0.P p3 = j10 != 0 ? new V0.P(j10, jVar.f18598f) : null;
                    V0.Q q10 = V0.Q.f9885a;
                    V0.Q q11 = jVar.f18594b;
                    int i10 = jVar.f18600h;
                    long j11 = jVar.f18596d;
                    if (q11 == q10) {
                        j6 = j11;
                        jCalculateNextRunTime = androidx.work.impl.model.k.f18610y.calculateNextRunTime(q11 == q10 && i10 > 0, i10, jVar.f18601i, jVar.f18602j, jVar.f18603k, jVar.f18604l, j10 != 0, j6, jVar.f18598f, j10, jVar.f18606n);
                        i7 = i10;
                    } else {
                        j6 = j11;
                        i7 = i10;
                        jCalculateNextRunTime = Long.MAX_VALUE;
                    }
                    long j12 = jCalculateNextRunTime;
                    arrayList.add(new V0.S(uuidFromString, q11, hashSet, jVar.f18595c, c0695n, i7, jVar.f18605m, jVar.f18599g, j6, p3, j12, jVar.f18607o));
                }
                return arrayList;
        }
    }
}
