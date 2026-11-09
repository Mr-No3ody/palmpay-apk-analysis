package p141j9;

import com.transsnet.palmpay.airtime.bean.AirtimeOrderList;
import com.transsnet.palmpay.airtime.ui.TopUpRecordActivity;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopUpRecordActivity f38433b;

    public /* synthetic */ u(TopUpRecordActivity topUpRecordActivity, int i7) {
        this.f38432a = i7;
        this.f38433b = topUpRecordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AirtimeOrderList.OrderListData orderListData;
        List<AirtimeOrderList.OrderData> list;
        TopUpRecordActivity topUpRecordActivity = this.f38433b;
        switch (this.f38432a) {
            case 0:
                AirtimeOrderList list2 = (AirtimeOrderList) obj;
                TopUpRecordActivity.a aVar = TopUpRecordActivity.f26486p;
                Intrinsics.checkNotNullParameter(list2, "list");
                SwipeRecyclerView swipeRecyclerView = topUpRecordActivity.f26487c;
                if (swipeRecyclerView == null) {
                    Intrinsics.n("mSwipeRecyclerView");
                    throw null;
                }
                if (swipeRecyclerView.getEmptyView() == null) {
                    ModelEmptyView modelEmptyView = new ModelEmptyView(topUpRecordActivity);
                    modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
                    modelEmptyView.f31512c.setText(k.core_no_history);
                    SwipeRecyclerView swipeRecyclerView2 = topUpRecordActivity.f26487c;
                    if (swipeRecyclerView2 == null) {
                        Intrinsics.n("mSwipeRecyclerView");
                        throw null;
                    }
                    swipeRecyclerView2.setEmptyView(modelEmptyView);
                }
                if (list2 != null && (orderListData = list2.data) != null && (list = orderListData.list) != null) {
                    topUpRecordActivity.f26491g = orderListData.totalPage;
                    int i7 = orderListData.curPage;
                    topUpRecordActivity.f26490f = i7;
                    ArrayList arrayList = topUpRecordActivity.f26489e;
                    if (i7 == 1 && arrayList != null) {
                        arrayList.clear();
                    }
                    if (arrayList != null) {
                        arrayList.addAll(list);
                    }
                    topUpRecordActivity.n().f4985b = arrayList;
                    topUpRecordActivity.n().notifyDataSetChanged();
                    SwipeRecyclerView swipeRecyclerView3 = topUpRecordActivity.f26487c;
                    if (swipeRecyclerView3 == null) {
                        Intrinsics.n("mSwipeRecyclerView");
                        throw null;
                    }
                    swipeRecyclerView3.c();
                    if (topUpRecordActivity.f26490f >= topUpRecordActivity.f26491g) {
                        SwipeRecyclerView swipeRecyclerView4 = topUpRecordActivity.f26487c;
                        if (swipeRecyclerView4 == null) {
                            Intrinsics.n("mSwipeRecyclerView");
                            throw null;
                        }
                        swipeRecyclerView4.b(topUpRecordActivity.getString(k.core_list_end));
                    }
                }
                return Unit.f38893a;
            default:
                String it = (String) obj;
                TopUpRecordActivity.a aVar2 = TopUpRecordActivity.f26486p;
                Intrinsics.checkNotNullParameter(it, "it");
                SwipeRecyclerView swipeRecyclerView5 = topUpRecordActivity.f26487c;
                if (swipeRecyclerView5 != null) {
                    swipeRecyclerView5.b("Load fail");
                    return Unit.f38893a;
                }
                Intrinsics.n("mSwipeRecyclerView");
                throw null;
        }
    }
}
