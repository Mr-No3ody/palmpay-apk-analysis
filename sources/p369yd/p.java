package p369yd;

import P8.a;
import Pa.r0;
import Qb.b;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.resp.CLQueryBorrowLoanProductResp;
import com.transsnet.palmpay.credit.bean.resp.OcFinanceMenuData;
import com.transsnet.palmpay.credit.bean.resp.OcFinanceMenuResp;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.FinanceStatusData;
import com.transsnet.palmpay.credit.bean.rsp.FinanceStatusResp;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.fragment.DoubleOpenBanFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeLoanTabFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.activity.J;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p159kd.h;
import p223od.j;
import p355xf.l;
import p355xf.t;
import p368yb.B;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44309b;

    public /* synthetic */ p(Object obj, int i7) {
        this.f44308a = i7;
        this.f44309b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0288  */
    /* JADX WARN: Code duplicated, block: B:148:0x028e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0299  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j jVar;
        RecyclerView recyclerView;
        TextView textView;
        String str;
        j jVar2;
        j jVar3;
        Object obj2;
        String str2;
        CLMainCreditCard cashLoanAccount;
        Integer remainingDays;
        OkCardMainPageRspData okCardAccount;
        Integer remainingDays2;
        Object obj3 = null;
        int iIntValue = 0;
        Object obj4 = this.f44309b;
        switch (this.f44308a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) obj4;
                        if (balanceAndLimitResp.isSuccess()) {
                            BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                            if (balanceAndLimitData != null) {
                                transferToPalmPayInputAmountActivity.f33619v = balanceAndLimitData;
                                AppCompatCheckBox appCompatCheckBox = transferToPalmPayInputAmountActivity.f33603A;
                                if (appCompatCheckBox != null) {
                                    appCompatCheckBox.setText(transferToPalmPayInputAmountActivity.getString(h.sm_balance_s, r0.B(balanceAndLimitData.balanceAmount, false), r0.B(balanceAndLimitData.cashBox, false)));
                                }
                                TextView textView2 = transferToPalmPayInputAmountActivity.f33604B;
                                if (textView2 != null) {
                                    textView2.setText(transferToPalmPayInputAmountActivity.getString(h.sm_balance_s, r0.B(balanceAndLimitData.balanceAmount, false), r0.B(balanceAndLimitData.cashBox, false)));
                                }
                                SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(r0.A(balanceAndLimitData.minAmount) + "-" + r0.A(balanceAndLimitData.maxAmount)).create();
                                Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                                PpAmountEditText ppAmountEditText = transferToPalmPayInputAmountActivity.f33620w;
                                if (ppAmountEditText != null) {
                                    ppAmountEditText.setHintText(spannableStringBuilderCreate);
                                }
                                PpAmountEditText ppAmountEditText2 = transferToPalmPayInputAmountActivity.f33620w;
                                if (ppAmountEditText2 != null) {
                                    ppAmountEditText2.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                                }
                                BalanceAndLimitResp.TransferSafe transferSafe = balanceAndLimitData.transferSafe;
                                if (transferSafe == null || (str = transferSafe.content) == null) {
                                    jVar = (j) transferToPalmPayInputAmountActivity.f27334c;
                                    if (jVar != null) {
                                        p220oa.h.c(jVar.t);
                                        Unit unit = Unit.f38893a;
                                    }
                                } else {
                                    if (str.length() <= 0) {
                                        str = null;
                                    }
                                    if (str == null) {
                                        jVar = (j) transferToPalmPayInputAmountActivity.f27334c;
                                        if (jVar != null) {
                                            p220oa.h.c(jVar.t);
                                            Unit unit2 = Unit.f38893a;
                                        }
                                    } else {
                                        j jVar4 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                        if (jVar4 != null) {
                                            p220oa.h.C(jVar4.t);
                                        }
                                        j jVar5 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                        if (jVar5 != null) {
                                            jVar5.f40392X.setText(str);
                                        }
                                        BalanceAndLimitResp.TransferSafe transferSafe2 = balanceAndLimitData.transferSafe;
                                        if (transferSafe2 == null || (str2 = transferSafe2.jumpUrl) == null) {
                                            jVar2 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                            if (jVar2 != null) {
                                                p220oa.h.c(jVar2.f40402o);
                                            }
                                            jVar3 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                            if (jVar3 != null) {
                                                jVar3.t.setOnClickListener(null);
                                                obj3 = Unit.f38893a;
                                            }
                                            obj2 = obj3;
                                        } else {
                                            if (str2.length() <= 0) {
                                                str2 = null;
                                            }
                                            if (str2 == null) {
                                                jVar2 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                                if (jVar2 != null) {
                                                    p220oa.h.c(jVar2.f40402o);
                                                }
                                                jVar3 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                                if (jVar3 != null) {
                                                    jVar3.t.setOnClickListener(null);
                                                    obj3 = Unit.f38893a;
                                                }
                                                obj2 = obj3;
                                            } else {
                                                j jVar6 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                                if (jVar6 != null) {
                                                    p220oa.h.C(jVar6.f40402o);
                                                }
                                                j jVar7 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                                if (jVar7 != null) {
                                                    jVar7.t.setOnClickListener(new J(str, 10, transferToPalmPayInputAmountActivity, str2));
                                                    obj2 = Unit.f38893a;
                                                } else {
                                                    obj2 = null;
                                                }
                                                if (obj2 == null) {
                                                    jVar2 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                                    if (jVar2 != null) {
                                                        p220oa.h.c(jVar2.f40402o);
                                                    }
                                                    jVar3 = (j) transferToPalmPayInputAmountActivity.f27334c;
                                                    if (jVar3 != null) {
                                                        jVar3.t.setOnClickListener(null);
                                                        obj3 = Unit.f38893a;
                                                    }
                                                    obj2 = obj3;
                                                }
                                            }
                                        }
                                        if (obj2 == null) {
                                            jVar = (j) transferToPalmPayInputAmountActivity.f27334c;
                                            if (jVar != null) {
                                                p220oa.h.c(jVar.t);
                                                Unit unit3 = Unit.f38893a;
                                            }
                                        }
                                    }
                                }
                                BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = transferToPalmPayInputAmountActivity.f33619v;
                                if (balanceAndLimitData2 != null && (textView = transferToPalmPayInputAmountActivity.f33605C) != null) {
                                    textView.setText(balanceAndLimitData2.stampDutyMinAmountPpTip);
                                }
                                BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData3 = transferToPalmPayInputAmountActivity.f33619v;
                                if (balanceAndLimitData3 != null) {
                                    if (balanceAndLimitData3.firstTransfer) {
                                        AppCompatCheckBox appCompatCheckBox2 = transferToPalmPayInputAmountActivity.f33603A;
                                        if (appCompatCheckBox2 != null) {
                                            appCompatCheckBox2.setVisibility(8);
                                        }
                                        TextView textView3 = transferToPalmPayInputAmountActivity.f33604B;
                                        if (textView3 != null) {
                                            textView3.setVisibility(0);
                                        }
                                    } else {
                                        TextView textView4 = transferToPalmPayInputAmountActivity.f33604B;
                                        if (textView4 != null) {
                                            textView4.setVisibility(8);
                                        }
                                        AppCompatCheckBox appCompatCheckBox3 = transferToPalmPayInputAmountActivity.f33603A;
                                        if (appCompatCheckBox3 != null) {
                                            appCompatCheckBox3.setVisibility(0);
                                        }
                                    }
                                }
                                ArrayList<Long> arrayList = balanceAndLimitData.amountList;
                                if (arrayList == null || arrayList.isEmpty()) {
                                    RecyclerView recyclerView2 = transferToPalmPayInputAmountActivity.f33608M;
                                    if (recyclerView2 != null) {
                                        p220oa.h.c(recyclerView2);
                                    }
                                } else {
                                    RecyclerView recyclerView3 = transferToPalmPayInputAmountActivity.f33608M;
                                    if (recyclerView3 != null) {
                                        p220oa.h.C(recyclerView3);
                                    }
                                    if (transferToPalmPayInputAmountActivity.f33610X == null) {
                                        a aVar = new a(5);
                                        transferToPalmPayInputAmountActivity.f33610X = aVar;
                                        aVar.setOnItemClickListener(new k(transferToPalmPayInputAmountActivity));
                                    }
                                    RecyclerView recyclerView4 = transferToPalmPayInputAmountActivity.f33608M;
                                    if (recyclerView4 != null) {
                                        recyclerView4.setLayoutManager(new GridLayoutManager(transferToPalmPayInputAmountActivity, 3));
                                    }
                                    RecyclerView recyclerView5 = transferToPalmPayInputAmountActivity.f33608M;
                                    if (recyclerView5 != null && recyclerView5.getItemDecorationCount() == 0 && (recyclerView = transferToPalmPayInputAmountActivity.f33608M) != null) {
                                        recyclerView.addItemDecoration(new b(3, CommonViewExtKt.getDp(8), 0));
                                    }
                                    RecyclerView recyclerView6 = transferToPalmPayInputAmountActivity.f33608M;
                                    if (recyclerView6 != null) {
                                        recyclerView6.setAdapter(transferToPalmPayInputAmountActivity.f33610X);
                                    }
                                    a aVar2 = transferToPalmPayInputAmountActivity.f33610X;
                                    if (aVar2 != null) {
                                        aVar2.setList(arrayList);
                                    }
                                }
                            }
                        } else {
                            p220oa.h.x(transferToPalmPayInputAmountActivity, balanceAndLimitResp.getRespMsg());
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        ((n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    boolean z3 = it2 instanceof com.transsnet.palmpay.core.base.p;
                    CLMainFragment cLMainFragment = (CLMainFragment) obj4;
                    t tVar = cLMainFragment.f30281o;
                    if (z3) {
                        List<OcFinanceMenuData> data = ((OcFinanceMenuResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a).getData();
                        ArrayList arrayList2 = cLMainFragment.f30275e1;
                        if (data != null) {
                            arrayList2.clear();
                            arrayList2.addAll(data);
                            B b7 = cLMainFragment.f30276g1;
                            if (b7 != null) {
                                b7.notifyDataSetChanged();
                            }
                        }
                        int i7 = CLMainFragment.j1;
                        RecyclerView recyclerView7 = (RecyclerView) tVar.getValue();
                        if (recyclerView7 != null) {
                            p220oa.h.s(recyclerView7, ((arrayList2 == null || arrayList2.isEmpty()) ? 1 : 0) ^ 1);
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        int i10 = CLMainFragment.j1;
                        RecyclerView recyclerView8 = (RecyclerView) tVar.getValue();
                        if (recyclerView8 != null) {
                            p220oa.h.s(recyclerView8, false);
                        }
                    }
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        FinanceStatusResp financeStatusResp = (FinanceStatusResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        FinanceStatusData data2 = financeStatusResp.getData();
                        int iIntValue2 = (data2 == null || (okCardAccount = data2.getOkCardAccount()) == null || (remainingDays2 = okCardAccount.getRemainingDays()) == null) ? 0 : remainingDays2.intValue();
                        FinanceStatusData data3 = financeStatusResp.getData();
                        if (data3 != null && (cashLoanAccount = data3.getCashLoanAccount()) != null && (remainingDays = cashLoanAccount.getRemainingDays()) != null) {
                            iIntValue = remainingDays.intValue();
                        }
                        int iMin = Math.min(iIntValue2, iIntValue);
                        TextView textView5 = (TextView) ((DoubleOpenBanFragment) obj4).f30332o.getValue();
                        if (textView5 != null) {
                            textView5.setText("Please try again after " + iMin + " days");
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 3:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        CLQueryBorrowLoanProductResp cLQueryBorrowLoanProductResp = (CLQueryBorrowLoanProductResp) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        if (cLQueryBorrowLoanProductResp != null && cLQueryBorrowLoanProductResp.isSuccess()) {
                            CLQueryBorrowLoanProductResp.Data data4 = cLQueryBorrowLoanProductResp.getData();
                            if (!TextUtils.isEmpty(data4 != null ? data4.getLoanProduct() : null)) {
                                ILoanCreditService iLoanCreditService = (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
                                Z childFragmentManager = ((OcHomeLoanTabFragment) obj4).getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                CLQueryBorrowLoanProductResp.Data data5 = cLQueryBorrowLoanProductResp.getData();
                                iLoanCreditService.startBorrow(childFragmentManager, data5 != null ? data5.getLoanProduct() : null, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
                            }
                        }
                    } else if (!(it4 instanceof m)) {
                        if (!(it4 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it4).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                IconicsDrawable apply = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 20);
                D3.a.F(apply, ((TransferViaUssdActivity) obj4).getColor(L6.b.ppColorTextBase));
                return Unit.f38893a;
        }
    }
}
