package p069ed;

import M1.d;
import M1.j;
import S1.e;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.transsnet.palmpay.airtime.bean.R2CHistoryItemListBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d implements LoadMoreModule {
    static {
        new b(null);
    }

    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    public final S1.c addLoadMoreModule(j jVar) {
        return e.a(this, jVar);
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ((R2CHistoryItemListBean) data.get(i7)).itemType == 2 ? 2 : 1;
    }
}
