package cn.tongdun.android.qgq9qg99.qgq9qg99;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class q9q9gqgqg9qgqg9qggq9 implements Comparator {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Map f19177q999ggg99999qqggqqg9qg;

    public q9q9gqgqg9qgqg9qggq9(Map map) {
        this.f19177q999ggg99999qqggqqg9qg = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (((Integer) this.f19177q999ggg99999qqggqqg9qg.get(obj)).intValue() < ((Integer) this.f19177q999ggg99999qqggqqg9qg.get(obj2)).intValue()) {
            return 1;
        }
        return this.f19177q999ggg99999qqggqqg9qg.get(obj) == this.f19177q999ggg99999qqggqqg9qg.get(obj2) ? 0 : -1;
    }
}
