package Wd;

import Xd.C0783b;
import com.transsnet.palmpay.core.bean.CloseContactBean;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.QueryFamilyAccountRsp;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0730d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeneficiariesActivity f10753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeneficiariesActivity f10754c;

    public /* synthetic */ C0730d(BeneficiariesActivity beneficiariesActivity, BeneficiariesActivity beneficiariesActivity2, int i7) {
        this.f10752a = i7;
        this.f10753b = beneficiariesActivity;
        this.f10754c = beneficiariesActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SwipeRecyclerView swipeRecyclerView;
        ArrayList arrayList;
        BeneficiariesActivity beneficiariesActivity = this.f10754c;
        BeneficiariesActivity beneficiariesActivity2 = this.f10753b;
        switch (this.f10752a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    beneficiariesActivity2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    beneficiariesActivity2.showLoadingDialog(false, true);
                    QueryFamilyAccountRsp queryFamilyAccountRsp = (QueryFamilyAccountRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (queryFamilyAccountRsp.isSuccess()) {
                        QueryFamilyAccountRsp.DataBean dataBean = queryFamilyAccountRsp.data;
                        if (dataBean == null || dataBean.list == null) {
                            SwipeRecyclerView swipeRecyclerView2 = beneficiariesActivity.f34149c;
                            if (swipeRecyclerView2 != null) {
                                swipeRecyclerView2.setRefreshing(false);
                            }
                            SwipeRecyclerView swipeRecyclerView3 = beneficiariesActivity.f34149c;
                            if (swipeRecyclerView3 != null) {
                                swipeRecyclerView3.c();
                            }
                        } else {
                            beneficiariesActivity.f34154i = dataBean.totalPage;
                            int i7 = dataBean.curPage;
                            beneficiariesActivity.f34155j = i7;
                            if (i7 == 1 && (arrayList = beneficiariesActivity.f34151e) != null) {
                                arrayList.clear();
                            }
                            ArrayList arrayList2 = beneficiariesActivity.f34151e;
                            if (arrayList2 != null) {
                                List<CloseContactBean> list = queryFamilyAccountRsp.data.list;
                                Intrinsics.checkNotNullExpressionValue(list, "list");
                                arrayList2.addAll(list);
                            }
                            C0783b c0783b = beneficiariesActivity.f34150d;
                            if (c0783b == null) {
                                Intrinsics.n("mAdapter");
                                throw null;
                            }
                            c0783b.f4985b = beneficiariesActivity.f34151e;
                            c0783b.notifyDataSetChanged();
                            SwipeRecyclerView swipeRecyclerView4 = beneficiariesActivity.f34149c;
                            if (swipeRecyclerView4 != null) {
                                swipeRecyclerView4.c();
                            }
                            if (beneficiariesActivity.f34155j >= beneficiariesActivity.f34154i && (swipeRecyclerView = beneficiariesActivity.f34149c) != null) {
                                swipeRecyclerView.b(beneficiariesActivity.getString(Pd.f.qt_no_more));
                            }
                            SwipeRecyclerView swipeRecyclerView5 = beneficiariesActivity.f34149c;
                            if (swipeRecyclerView5 != null) {
                                swipeRecyclerView5.setRefreshing(false);
                            }
                        }
                    } else {
                        SwipeRecyclerView swipeRecyclerView6 = beneficiariesActivity.f34149c;
                        if (swipeRecyclerView6 != null) {
                            swipeRecyclerView6.setRefreshing(false);
                        }
                        SwipeRecyclerView swipeRecyclerView7 = beneficiariesActivity.f34149c;
                        if (swipeRecyclerView7 != null) {
                            swipeRecyclerView7.c();
                        }
                        ToastUtils.showShort(queryFamilyAccountRsp.getRespMsg(), new Object[0]);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    beneficiariesActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    beneficiariesActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    beneficiariesActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    beneficiariesActivity2.showLoadingDialog(false, true);
                    ToastUtils.showShort(((CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a).getRespMsg(), new Object[0]);
                    int i10 = BeneficiariesActivity.f34148v;
                    beneficiariesActivity.m();
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    beneficiariesActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    beneficiariesActivity2.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                }
                return Unit.f38893a;
        }
    }
}
