package p130ic;

import androidx.lifecycle.F;
import androidx.lifecycle.a0;
import com.transsnet.palmpay.teller.bean.DataBundleExtraItemInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f37494d;

    public C() {
        F f10 = new F();
        this.f37494d = f10;
        if (f10.d() == null) {
            f10.k(new LinkedHashMap());
        }
    }

    public final DataBundleExtraItemInfo d(String operatorId) {
        Intrinsics.checkNotNullParameter(operatorId, "operatorId");
        Map map = (Map) this.f37494d.d();
        if (map == null) {
            return null;
        }
        return (DataBundleExtraItemInfo) map.get(operatorId);
    }

    public final void e(String operatorId, DataBundleExtraItemInfo cacheData) {
        Intrinsics.checkNotNullParameter(operatorId, "operatorId");
        Intrinsics.checkNotNullParameter(cacheData, "cacheData");
        F f10 = this.f37494d;
        Map linkedHashMap = (Map) f10.d();
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(operatorId, cacheData);
        f10.k(linkedHashMap);
    }
}
