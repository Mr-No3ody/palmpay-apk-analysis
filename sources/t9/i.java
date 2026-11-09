package t9;

import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends M1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BettingBillerListItemBean f42363b;

    static {
        new h(null);
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ((BettingBillerListItemBean) data.get(i7)).getItemType() == 2 ? 2 : 1;
    }
}
