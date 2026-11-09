package G9;

import C0.G;
import J9.C;
import Pa.r0;
import Wf.AbstractC0780y;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BalanceAccountInfo;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.BankCardListInfo;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.bean.rsp.GetMoneyConfigResp;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.bean.rsp.WithdrawBankAccRsp;
import com.transsnet.palmpay.core.dialog.NgSelectBankCardDialog;
import com.transsnet.palmpay.core.viewmodel.ModelWithdrawBankaccountItem;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawV2Fragment f3189b;

    public /* synthetic */ s(WithdrawV2Fragment withdrawV2Fragment, int i7) {
        this.f3188a = i7;
        this.f3189b = withdrawV2Fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecyclerView.Adapter adapter;
        switch (this.f3188a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        GetMoneyConfigResp getMoneyConfigResp = (GetMoneyConfigResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        WithdrawV2Fragment withdrawV2Fragment = this.f3189b;
                        ArrayList arrayList = withdrawV2Fragment.f27064s0;
                        if (arrayList != null) {
                            Collection arrayList2 = getMoneyConfigResp.data;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList.addAll(arrayList2);
                        }
                        RecyclerView recyclerView = (RecyclerView) withdrawV2Fragment.f27059o.getValue();
                        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                            adapter.notifyDataSetChanged();
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        WithdrawBankAccRsp withdrawBankAccRsp = (WithdrawBankAccRsp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (withdrawBankAccRsp.isSuccess()) {
                            BankCardListInfo bankCardListInfo = withdrawBankAccRsp.data;
                            if (bankCardListInfo != null) {
                                int i7 = bankCardListInfo.curPage;
                                WithdrawV2Fragment withdrawV2Fragment2 = this.f3189b;
                                if (i7 == 0 || i7 == 1) {
                                    ArrayList arrayList3 = withdrawV2Fragment2.f27055Y;
                                    if (arrayList3 == null) {
                                        Intrinsics.n("mBankCardInfos");
                                        throw null;
                                    }
                                    arrayList3.clear();
                                }
                                ArrayList arrayList4 = withdrawV2Fragment2.f27055Y;
                                if (arrayList4 == null) {
                                    Intrinsics.n("mBankCardInfos");
                                    throw null;
                                }
                                arrayList4.addAll(bankCardListInfo.list);
                                NgSelectBankCardDialog ngSelectBankCardDialog = withdrawV2Fragment2.f27056Z;
                                if (ngSelectBankCardDialog != null) {
                                    ArrayList arrayList5 = withdrawV2Fragment2.f27055Y;
                                    if (arrayList5 == null) {
                                        Intrinsics.n("mBankCardInfos");
                                        throw null;
                                    }
                                    ngSelectBankCardDialog.setBankCardInfos(arrayList5);
                                }
                                ArrayList arrayList6 = withdrawV2Fragment2.f27055Y;
                                if (arrayList6 == null) {
                                    Intrinsics.n("mBankCardInfos");
                                    throw null;
                                }
                                if (!arrayList6.isEmpty() && withdrawV2Fragment2.f27054X == null) {
                                    ArrayList arrayList7 = withdrawV2Fragment2.f27055Y;
                                    if (arrayList7 == null) {
                                        Intrinsics.n("mBankCardInfos");
                                        throw null;
                                    }
                                    withdrawV2Fragment2.f27054X = (BankCardInfo) arrayList7.get(0);
                                }
                                BankCardInfo bankCardInfo = withdrawV2Fragment2.f27054X;
                                if (bankCardInfo != null) {
                                    WithdrawV2Fragment.t(withdrawV2Fragment2, bankCardInfo);
                                    NgSelectBankCardDialog ngSelectBankCardDialog2 = withdrawV2Fragment2.f27056Z;
                                    if (ngSelectBankCardDialog2 != null) {
                                        ngSelectBankCardDialog2.initNowSelectedBankCard(withdrawV2Fragment2.f27054X);
                                    }
                                }
                                ArrayList arrayList8 = withdrawV2Fragment2.f27055Y;
                                if (arrayList8 == null) {
                                    Intrinsics.n("mBankCardInfos");
                                    throw null;
                                }
                                boolean zIsEmpty = arrayList8.isEmpty();
                                p355xf.t tVar = withdrawV2Fragment2.f27049C;
                                p355xf.t tVar2 = withdrawV2Fragment2.f27048B;
                                if (zIsEmpty) {
                                    RelativeLayout relativeLayout = (RelativeLayout) tVar2.getValue();
                                    if (relativeLayout != null) {
                                        relativeLayout.setVisibility(0);
                                    }
                                    ModelWithdrawBankaccountItem modelWithdrawBankaccountItem = (ModelWithdrawBankaccountItem) tVar.getValue();
                                    if (modelWithdrawBankaccountItem != null) {
                                        modelWithdrawBankaccountItem.setVisibility(8);
                                    }
                                } else {
                                    RelativeLayout relativeLayout2 = (RelativeLayout) tVar2.getValue();
                                    if (relativeLayout2 != null) {
                                        relativeLayout2.setVisibility(8);
                                    }
                                    ModelWithdrawBankaccountItem modelWithdrawBankaccountItem2 = (ModelWithdrawBankaccountItem) tVar.getValue();
                                    if (modelWithdrawBankaccountItem2 != null) {
                                        modelWithdrawBankaccountItem2.setVisibility(0);
                                    }
                                }
                                WithdrawViewModel withdrawViewModel = (WithdrawViewModel) withdrawV2Fragment2.f27333i;
                                if (withdrawViewModel != null) {
                                    AbstractC0780y.m(V.h(withdrawViewModel), null, null, new C(withdrawViewModel.f27114i, G.p("Pref_", p367ya.a.d().i(), "_queryLastWithdrawBankAccNo_", BaseApplication.getCountryLocale()), null), 3);
                                }
                            }
                        } else {
                            ToastUtils.showLong(withdrawBankAccRsp.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonStringResult commonStringResult = (CommonStringResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (commonStringResult == null || !commonStringResult.isSuccess()) {
                            ToastUtils.showLong(commonStringResult != null ? commonStringResult.getRespMsg() : null, new Object[0]);
                        } else {
                            String str = commonStringResult.data;
                            if (str != null && !TextUtils.isEmpty(str)) {
                                this.f3189b.f27052M = str;
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        BalanceAccountInfo balanceAccountInfo = (BalanceAccountInfo) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        if (balanceAccountInfo != null) {
                            if (!balanceAccountInfo.isSuccess() || balanceAccountInfo.getData() == null) {
                                ToastUtils.showShort(balanceAccountInfo.getRespMsg(), new Object[0]);
                            } else {
                                long availableBalance = balanceAccountInfo.getData().getAvailableBalance();
                                WithdrawV2Fragment withdrawV2Fragment3 = this.f3189b;
                                withdrawV2Fragment3.f27061p0 = availableBalance;
                                p355xf.t tVar3 = withdrawV2Fragment3.f27060p;
                                TextView textView = (TextView) tVar3.getValue();
                                if (textView != null) {
                                    p220oa.h.s(textView, true);
                                }
                                TextView textView2 = (TextView) tVar3.getValue();
                                if (textView2 != null) {
                                    textView2.setText(withdrawV2Fragment3.getString(p366y9.d.core_balance_x, r0.B(withdrawV2Fragment3.f27061p0, false)));
                                }
                            }
                        }
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLimitAmountResp queryLimitAmountResp = (QueryLimitAmountResp) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        if (queryLimitAmountResp.isSuccess()) {
                            QueryLimitAmountResp.DataBean dataBean = queryLimitAmountResp.data;
                            if (dataBean != null) {
                                WithdrawV2Fragment withdrawV2Fragment4 = this.f3189b;
                                withdrawV2Fragment4.f27058k0 = dataBean;
                                SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(r0.A(dataBean.getMinAmount()) + "-" + r0.A(dataBean.getMaxAmount())).setFontSize(16, true).create();
                                Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                                StateAmountEditText stateAmountEditTextU = withdrawV2Fragment4.u();
                                if (stateAmountEditTextU != null) {
                                    stateAmountEditTextU.setHint(spannableStringBuilderCreate);
                                }
                            }
                        } else {
                            ToastUtils.showShort(queryLimitAmountResp.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it5).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }

    public /* synthetic */ s(WithdrawV2Fragment withdrawV2Fragment, WithdrawV2Fragment withdrawV2Fragment2, int i7) {
        this.f3188a = i7;
        this.f3189b = withdrawV2Fragment2;
    }
}
