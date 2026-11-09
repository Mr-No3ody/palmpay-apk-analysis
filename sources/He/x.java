package He;

import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.ui.pop.HistoryMultiItemPopWindowV2$OnPopItemClickListener;
import com.transsnet.palmpay.ui.pop.HistoryStatusItemPopWindow$OnPopItemClickListener;
import com.transsnet.palmpay.ui.view.TransHistoryFilterLayout;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements HistoryStatusItemPopWindow$OnPopItemClickListener, HistoryMultiItemPopWindowV2$OnPopItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransHistoryFilterLayout f3921a;

    @Override // com.transsnet.palmpay.ui.pop.HistoryStatusItemPopWindow$OnPopItemClickListener
    public void onItemSelect(TransactionFilterResp.FilterBean filterBean) {
        TransHistoryFilterLayout.c(this.f3921a, filterBean);
    }

    @Override // com.transsnet.palmpay.ui.pop.HistoryMultiItemPopWindowV2$OnPopItemClickListener
    public void onItemSelect(HashMap map, ArrayList selectedFilterName) {
        int i7 = TransHistoryFilterLayout.f35338p;
        Intrinsics.checkNotNullParameter(selectedFilterName, "selectedFilterName");
        F6.d.h("TransHistoryFilterLayout", 3, "selectedFilters:" + map);
        TransHistoryFilterLayout transHistoryFilterLayout = this.f3921a;
        transHistoryFilterLayout.f35348o = map;
        transHistoryFilterLayout.setFilterName(selectedFilterName);
        TransHistoryFilterLayout.OnSelectListener onSelectListener = transHistoryFilterLayout.f35347j;
        if (onSelectListener != null) {
            onSelectListener.onSelectBillType(map);
        }
    }
}
