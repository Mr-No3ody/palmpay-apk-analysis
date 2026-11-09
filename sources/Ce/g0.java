package Ce;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.BalanceAccountInfo;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.ui.fragment.MeBalanceStatementFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeBalanceStatementFragment f1487b;

    public /* synthetic */ g0(MeBalanceStatementFragment meBalanceStatementFragment, int i7) {
        this.f1486a = i7;
        this.f1487b = meBalanceStatementFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccountFlowBean.DataBean data;
        AccountFlowBean.DataBean.ExtDataBean extData;
        p328ve.s sVar;
        MeBalanceStatementFragment meBalanceStatementFragment = this.f1487b;
        switch (this.f1486a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        BalanceAccountInfo balanceAccountInfo = (BalanceAccountInfo) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (balanceAccountInfo.isSuccess()) {
                            User user = BaseApplication.getInstance().getUser();
                            BalanceAccountInfo.DataBean data2 = balanceAccountInfo.getData();
                            if (!TextUtils.isEmpty(data2 != null ? data2.getAccountId() : null)) {
                                BalanceAccountInfo.DataBean data3 = balanceAccountInfo.getData();
                                user.setBalanceAccountId(data3 != null ? data3.getAccountId() : null);
                                meBalanceStatementFragment.f35217X = user.getBalanceAccountId();
                                BaseApplication.get().getUserDataSource().getClass();
                                p156ka.a.c(user);
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        AccountFlowBean accountFlowBean = (AccountFlowBean) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
                        SwipeRecyclerView swipeRecyclerViewT = meBalanceStatementFragment.t();
                        if (swipeRecyclerViewT != null) {
                            swipeRecyclerViewT.c();
                        }
                        SwipeRecyclerView swipeRecyclerViewT2 = meBalanceStatementFragment.t();
                        if (swipeRecyclerViewT2 != null) {
                            swipeRecyclerViewT2.setRefreshing(false);
                        }
                        if (accountFlowBean.isSuccess()) {
                            AccountFlowBean.DataBean data4 = accountFlowBean.getData();
                            meBalanceStatementFragment.f35216Q = data4 != null ? data4.getTotal() : 0;
                            AccountFlowBean.DataBean data5 = accountFlowBean.getData();
                            if (data5 != null) {
                                meBalanceStatementFragment.f35212C = data5.getCurPage();
                                meBalanceStatementFragment.f35216Q = data5.getTotalPage();
                                if (meBalanceStatementFragment.f35212C == 1 && (sVar = meBalanceStatementFragment.f35210A) != null) {
                                    sVar.b();
                                }
                                p328ve.s sVar2 = meBalanceStatementFragment.f35210A;
                                if (sVar2 != null) {
                                    sVar2.a(data5.getList());
                                }
                                p328ve.s sVar3 = meBalanceStatementFragment.f35210A;
                                if (sVar3 != null) {
                                    sVar3.notifyDataSetChanged();
                                }
                            }
                            if (meBalanceStatementFragment.f35212C == 1 && (data = accountFlowBean.getData()) != null && (extData = data.getExtData()) != null) {
                                LinearLayout linearLayout = (LinearLayout) meBalanceStatementFragment.t.getValue();
                                if (linearLayout != null) {
                                    p220oa.h.s(linearLayout, true);
                                }
                                TextView textView = (TextView) meBalanceStatementFragment.f35220o.getValue();
                                if (textView != null) {
                                    textView.setText(Pa.r0.B(Math.abs(extData.getPayOutAmount()), false));
                                }
                                TextView textView2 = (TextView) meBalanceStatementFragment.f35221p.getValue();
                                if (textView2 != null) {
                                    textView2.setText(Pa.r0.B(extData.getInComeAmount(), false));
                                }
                            }
                        } else {
                            ToastUtils.showShort(accountFlowBean.getRespMsg(), new Object[0]);
                            SwipeRecyclerView swipeRecyclerViewT3 = meBalanceStatementFragment.t();
                            if (swipeRecyclerViewT3 != null) {
                                swipeRecyclerViewT3.b("Load fail");
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str = ((com.transsnet.palmpay.core.base.n) it2).f27358a;
                        MeBalanceStatementFragment.a aVar2 = MeBalanceStatementFragment.f35209Z;
                        SwipeRecyclerView swipeRecyclerViewT4 = meBalanceStatementFragment.t();
                        if (swipeRecyclerViewT4 != null) {
                            swipeRecyclerViewT4.c();
                        }
                        SwipeRecyclerView swipeRecyclerViewT5 = meBalanceStatementFragment.t();
                        if (swipeRecyclerViewT5 != null) {
                            swipeRecyclerViewT5.setRefreshing(false);
                        }
                        ToastUtils.showLong(str, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
