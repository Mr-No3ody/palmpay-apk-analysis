package p270rd;

import Pa.r0;
import android.text.SpannableStringBuilder;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.QueryMemberByCodePlateResp;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.managemoney.ui.activity.J;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p223od.a;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawInputAmountActivity f41746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WithdrawInputAmountActivity f41747c;

    public /* synthetic */ g0(WithdrawInputAmountActivity withdrawInputAmountActivity, WithdrawInputAmountActivity withdrawInputAmountActivity2, int i7) {
        this.f41745a = i7;
        this.f41746b = withdrawInputAmountActivity;
        this.f41747c = withdrawInputAmountActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0225  */
    /* JADX WARN: Code duplicated, block: B:118:0x022b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0236  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        a aVar;
        a aVar2;
        String str2;
        Unit unit;
        a aVar3;
        Collection collection;
        QueryMemberByCodePlateResp queryMemberByCodePlateResp;
        WithdrawInputAmountActivity withdrawInputAmountActivity = this.f41747c;
        WithdrawInputAmountActivity withdrawInputAmountActivity2 = this.f41746b;
        switch (this.f41745a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    withdrawInputAmountActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                    BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((p) it).f27360a;
                    if (balanceAndLimitResp.isSuccess()) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                        withdrawInputAmountActivity.f33298i = balanceAndLimitData;
                        a aVar4 = (a) withdrawInputAmountActivity.f27334c;
                        if (aVar4 != null) {
                            h.c(aVar4.t);
                        }
                        a aVar5 = (a) withdrawInputAmountActivity.f27334c;
                        if (aVar5 != null) {
                            h.c(aVar5.f40294o);
                        }
                        a aVar6 = (a) withdrawInputAmountActivity.f27334c;
                        if (aVar6 != null) {
                            aVar6.t.setOnClickListener(null);
                        }
                        if (balanceAndLimitData != null) {
                            a aVar7 = (a) withdrawInputAmountActivity.f27334c;
                            if (aVar7 != null) {
                                aVar7.f40286b.setText(withdrawInputAmountActivity.getString(p159kd.h.sm_balance_s, r0.B(balanceAndLimitData.balanceAmount, false), r0.B(balanceAndLimitData.cashBox, false)));
                            }
                            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(r0.A(balanceAndLimitData.minAmount) + "-" + r0.A(balanceAndLimitData.maxAmount)).create();
                            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                            a aVar8 = (a) withdrawInputAmountActivity.f27334c;
                            if (aVar8 != null) {
                                aVar8.f40287c.setHintText(spannableStringBuilderCreate);
                            }
                            a aVar9 = (a) withdrawInputAmountActivity.f27334c;
                            if (aVar9 != null) {
                                aVar9.f40287c.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                            }
                            if (balanceAndLimitData.stampDutySwitch && (aVar3 = (a) withdrawInputAmountActivity.f27334c) != null) {
                                aVar3.f40283M.setText(balanceAndLimitData.stampDutyMinAmountPpTip);
                            }
                            BalanceAndLimitResp.TransferSafe transferSafe = balanceAndLimitData.transferSafe;
                            if (transferSafe != null && (str = transferSafe.content) != null) {
                                if (str.length() <= 0) {
                                    str = null;
                                }
                                if (str != null) {
                                    a aVar10 = (a) withdrawInputAmountActivity.f27334c;
                                    if (aVar10 != null) {
                                        h.C(aVar10.t);
                                    }
                                    a aVar11 = (a) withdrawInputAmountActivity.f27334c;
                                    if (aVar11 != null) {
                                        aVar11.f40284Q.setText(str);
                                    }
                                    BalanceAndLimitResp.TransferSafe transferSafe2 = balanceAndLimitData.transferSafe;
                                    if (transferSafe2 == null || (str2 = transferSafe2.jumpUrl) == null) {
                                        aVar = (a) withdrawInputAmountActivity.f27334c;
                                        if (aVar != null) {
                                            h.c(aVar.f40294o);
                                        }
                                        aVar2 = (a) withdrawInputAmountActivity.f27334c;
                                        if (aVar2 != null) {
                                            aVar2.t.setOnClickListener(null);
                                            Unit unit2 = Unit.f38893a;
                                        }
                                    } else {
                                        if (str2.length() <= 0) {
                                            str2 = null;
                                        }
                                        if (str2 == null) {
                                            aVar = (a) withdrawInputAmountActivity.f27334c;
                                            if (aVar != null) {
                                                h.c(aVar.f40294o);
                                            }
                                            aVar2 = (a) withdrawInputAmountActivity.f27334c;
                                            if (aVar2 != null) {
                                                aVar2.t.setOnClickListener(null);
                                                Unit unit3 = Unit.f38893a;
                                            }
                                        } else {
                                            a aVar12 = (a) withdrawInputAmountActivity.f27334c;
                                            if (aVar12 != null) {
                                                h.C(aVar12.f40294o);
                                            }
                                            a aVar13 = (a) withdrawInputAmountActivity.f27334c;
                                            if (aVar13 != null) {
                                                aVar13.t.setOnClickListener(new J(str, 5, withdrawInputAmountActivity, str2));
                                                unit = Unit.f38893a;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                aVar = (a) withdrawInputAmountActivity.f27334c;
                                                if (aVar != null) {
                                                    h.c(aVar.f40294o);
                                                }
                                                aVar2 = (a) withdrawInputAmountActivity.f27334c;
                                                if (aVar2 != null) {
                                                    aVar2.t.setOnClickListener(null);
                                                    Unit unit4 = Unit.f38893a;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        h.x(withdrawInputAmountActivity, balanceAndLimitResp.getRespMsg());
                    }
                } else if (it instanceof m) {
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    ((n) it).getClass();
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    withdrawInputAmountActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                    ParseInstalmentsQrcodeRsp parseInstalmentsQrcodeRsp = (ParseInstalmentsQrcodeRsp) ((p) it2).f27360a;
                    if (parseInstalmentsQrcodeRsp.isSuccess()) {
                        ParseInstalmentsQrcodeRsp.DataBean dataBean = parseInstalmentsQrcodeRsp.data;
                        if (dataBean != null) {
                            withdrawInputAmountActivity.f33294d = dataBean;
                            WithdrawInputAmountActivity.n(withdrawInputAmountActivity);
                        }
                    } else {
                        h.x(withdrawInputAmountActivity, parseInstalmentsQrcodeRsp.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    withdrawInputAmountActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                    CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((p) it3).f27360a;
                    if (commonListResultV2.isSuccess() && (collection = commonListResultV2.data) != null && (!collection.isEmpty())) {
                        ParseInstalmentsQrcodeRsp.DataBean dataBean2 = new ParseInstalmentsQrcodeRsp.DataBean();
                        List<T> list = commonListResultV2.data;
                        if (list != 0 && (queryMemberByCodePlateResp = (QueryMemberByCodePlateResp) list.get(0)) != null) {
                            dataBean2.merchantUrl = queryMemberByCodePlateResp.businessPortrait;
                            dataBean2.pictureUrl = queryMemberByCodePlateResp.pictureUrl;
                            dataBean2.cashBackPictureUrl = queryMemberByCodePlateResp.cashBackPictureUrl;
                            dataBean2.type = queryMemberByCodePlateResp.type;
                            dataBean2.snNo = queryMemberByCodePlateResp.snNo;
                            dataBean2.soNoType = queryMemberByCodePlateResp.soNoType;
                            dataBean2.merchantName = queryMemberByCodePlateResp.businessName;
                            dataBean2.shopName = queryMemberByCodePlateResp.shopName;
                            withdrawInputAmountActivity.f33295e = queryMemberByCodePlateResp.accountNo;
                            dataBean2.transType = queryMemberByCodePlateResp.transType;
                            dataBean2.accountMark = queryMemberByCodePlateResp.accountMark;
                            dataBean2.darkAccountMark = queryMemberByCodePlateResp.darkAccountMark;
                            dataBean2.jumpUrl = queryMemberByCodePlateResp.jumpUrl;
                        }
                        withdrawInputAmountActivity.f33294d = dataBean2;
                        WithdrawInputAmountActivity.n(withdrawInputAmountActivity);
                    } else {
                        h.x(withdrawInputAmountActivity, commonListResultV2.getRespMsg());
                    }
                } else if (it3 instanceof m) {
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    withdrawInputAmountActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
