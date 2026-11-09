package p353xd;

import P8.a;
import Pa.r0;
import Qb.b;
import android.text.SpannableStringBuilder;
import androidx.recyclerview.widget.GridLayoutManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.activity.J;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBankChannelInfoResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.BeneficiaryBankUnstableDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ExceedsDailyLimitDialog;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p159kd.h;
import p223od.i;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43915c;

    public /* synthetic */ z(TransferToBankInputAmountActivity transferToBankInputAmountActivity, TransferToBankInputAmountActivity transferToBankInputAmountActivity2, int i7) {
        this.f43913a = i7;
        this.f43914b = transferToBankInputAmountActivity;
        this.f43915c = transferToBankInputAmountActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0212  */
    /* JADX WARN: Code duplicated, block: B:127:0x0218  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i iVar;
        i iVar2;
        String str;
        i iVar3;
        i iVar4;
        Unit unit;
        String str2;
        i iVar5;
        TransferBankChannelInfoResp transferBankChannelInfoResp;
        Integer channelStatus;
        int i7 = 8;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43915c;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity2 = this.f43914b;
        switch (this.f43913a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    transferToBankInputAmountActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                    BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((p) it).f27360a;
                    if (balanceAndLimitResp.isSuccess()) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                        if (balanceAndLimitData != null) {
                            transferToBankInputAmountActivity.f33532p = balanceAndLimitData;
                            i iVar6 = (i) transferToBankInputAmountActivity.f27334c;
                            if (iVar6 != null) {
                                iVar6.f40365B.setText(transferToBankInputAmountActivity.getString(h.sm_balance_s, r0.B(balanceAndLimitData.balanceAmount, false), r0.B(balanceAndLimitData.cashBox, false)));
                            }
                            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(r0.A(balanceAndLimitData.minAmount) + "-" + r0.A(balanceAndLimitData.maxAmount)).create();
                            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                            i iVar7 = (i) transferToBankInputAmountActivity.f27334c;
                            if (iVar7 != null) {
                                iVar7.f40374c.setHintText(spannableStringBuilderCreate);
                            }
                            i iVar8 = (i) transferToBankInputAmountActivity.f27334c;
                            if (iVar8 != null) {
                                iVar8.f40374c.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                            }
                            if (balanceAndLimitData.stampDutySwitch && (iVar5 = (i) transferToBankInputAmountActivity.f27334c) != null) {
                                iVar5.f40370Q.setText(balanceAndLimitData.stampDutyMinAmountBankTip);
                            }
                            BalanceAndLimitResp.TransferSafe transferSafe = balanceAndLimitData.transferSafe;
                            if (transferSafe == null || (str = transferSafe.content) == null) {
                                iVar = (i) transferToBankInputAmountActivity.f27334c;
                                if (iVar != null) {
                                    p220oa.h.c(iVar.f40382p);
                                    Unit unit2 = Unit.f38893a;
                                }
                            } else {
                                Unit unit3 = null;
                                if (str.length() <= 0) {
                                    str = null;
                                }
                                if (str == null) {
                                    iVar = (i) transferToBankInputAmountActivity.f27334c;
                                    if (iVar != null) {
                                        p220oa.h.c(iVar.f40382p);
                                        Unit unit4 = Unit.f38893a;
                                    }
                                } else {
                                    i iVar9 = (i) transferToBankInputAmountActivity.f27334c;
                                    if (iVar9 != null) {
                                        p220oa.h.C(iVar9.f40382p);
                                    }
                                    i iVar10 = (i) transferToBankInputAmountActivity.f27334c;
                                    if (iVar10 != null) {
                                        iVar10.f40371X.setText(str);
                                    }
                                    BalanceAndLimitResp.TransferSafe transferSafe2 = balanceAndLimitData.transferSafe;
                                    if (transferSafe2 == null || (str2 = transferSafe2.jumpUrl) == null) {
                                        iVar3 = (i) transferToBankInputAmountActivity.f27334c;
                                        if (iVar3 != null) {
                                            p220oa.h.c(iVar3.f40379i);
                                        }
                                        iVar4 = (i) transferToBankInputAmountActivity.f27334c;
                                        if (iVar4 != null) {
                                            iVar4.f40382p.setOnClickListener(null);
                                            unit3 = Unit.f38893a;
                                        }
                                        unit = unit3;
                                    } else {
                                        if (str2.length() <= 0) {
                                            str2 = null;
                                        }
                                        if (str2 == null) {
                                            iVar3 = (i) transferToBankInputAmountActivity.f27334c;
                                            if (iVar3 != null) {
                                                p220oa.h.c(iVar3.f40379i);
                                            }
                                            iVar4 = (i) transferToBankInputAmountActivity.f27334c;
                                            if (iVar4 != null) {
                                                iVar4.f40382p.setOnClickListener(null);
                                                unit3 = Unit.f38893a;
                                            }
                                            unit = unit3;
                                        } else {
                                            i iVar11 = (i) transferToBankInputAmountActivity.f27334c;
                                            if (iVar11 != null) {
                                                p220oa.h.C(iVar11.f40379i);
                                            }
                                            i iVar12 = (i) transferToBankInputAmountActivity.f27334c;
                                            if (iVar12 != null) {
                                                iVar12.f40382p.setOnClickListener(new J(str, i7, transferToBankInputAmountActivity, str2));
                                                unit = Unit.f38893a;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                iVar3 = (i) transferToBankInputAmountActivity.f27334c;
                                                if (iVar3 != null) {
                                                    p220oa.h.c(iVar3.f40379i);
                                                }
                                                iVar4 = (i) transferToBankInputAmountActivity.f27334c;
                                                if (iVar4 != null) {
                                                    iVar4.f40382p.setOnClickListener(null);
                                                    unit3 = Unit.f38893a;
                                                }
                                                unit = unit3;
                                            }
                                        }
                                    }
                                    if (unit == null) {
                                        iVar = (i) transferToBankInputAmountActivity.f27334c;
                                        if (iVar != null) {
                                            p220oa.h.c(iVar.f40382p);
                                            Unit unit5 = Unit.f38893a;
                                        }
                                    }
                                }
                            }
                            ArrayList<Long> arrayList = balanceAndLimitData.amountList;
                            if (arrayList == null || !arrayList.isEmpty()) {
                                i iVar13 = (i) transferToBankInputAmountActivity.f27334c;
                                if (iVar13 != null) {
                                    p220oa.h.C(iVar13.t);
                                }
                                if (transferToBankInputAmountActivity.f33524B == null) {
                                    a aVar = new a(5);
                                    transferToBankInputAmountActivity.f33524B = aVar;
                                    aVar.setOnItemClickListener(new r(transferToBankInputAmountActivity));
                                }
                                i iVar14 = (i) transferToBankInputAmountActivity.f27334c;
                                if (iVar14 != null) {
                                    iVar14.t.setLayoutManager(new GridLayoutManager(transferToBankInputAmountActivity, 3));
                                }
                                i iVar15 = (i) transferToBankInputAmountActivity.f27334c;
                                if (iVar15 != null && iVar15.t.getItemDecorationCount() == 0 && (iVar2 = (i) transferToBankInputAmountActivity.f27334c) != null) {
                                    iVar2.t.addItemDecoration(new b(3, CommonViewExtKt.getDp(8), 0));
                                }
                                i iVar16 = (i) transferToBankInputAmountActivity.f27334c;
                                if (iVar16 != null) {
                                    iVar16.t.setAdapter(transferToBankInputAmountActivity.f33524B);
                                }
                                a aVar2 = transferToBankInputAmountActivity.f33524B;
                                if (aVar2 != null) {
                                    aVar2.setList(arrayList);
                                }
                            } else {
                                i iVar17 = (i) transferToBankInputAmountActivity.f27334c;
                                if (iVar17 != null) {
                                    p220oa.h.c(iVar17.t);
                                }
                            }
                        }
                    } else {
                        p220oa.h.x(transferToBankInputAmountActivity, balanceAndLimitResp.getRespMsg());
                    }
                } else if (it instanceof m) {
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    ((n) it).getClass();
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    transferToBankInputAmountActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                    VerifyPaymentInfoRsp verifyPaymentInfoRsp = (VerifyPaymentInfoRsp) ((p) it2).f27360a;
                    if (verifyPaymentInfoRsp.isSuccess()) {
                        VerifyPaymentInfoRsp.DataBean dataBean = verifyPaymentInfoRsp.data;
                        if (dataBean != null) {
                            TransferToBankInputAmountActivity.a aVar3 = TransferToBankInputAmountActivity.f33522C;
                            if (dataBean.amountLimitPopUp) {
                                ExceedsDailyLimitDialog exceedsDailyLimitDialog = new ExceedsDailyLimitDialog(transferToBankInputAmountActivity);
                                exceedsDailyLimitDialog.show();
                                exceedsDailyLimitDialog.setData(dataBean);
                            } else {
                                transferBankChannelInfoResp = transferToBankInputAmountActivity.f33531o;
                                if (transferBankChannelInfoResp == null && (channelStatus = transferBankChannelInfoResp.getChannelStatus()) != null && channelStatus.intValue() == 2) {
                                    if (transferToBankInputAmountActivity.f33533v == null) {
                                        transferToBankInputAmountActivity.f33533v = new BeneficiaryBankUnstableDialog(transferToBankInputAmountActivity);
                                    }
                                    BeneficiaryBankUnstableDialog beneficiaryBankUnstableDialog = transferToBankInputAmountActivity.f33533v;
                                    if (beneficiaryBankUnstableDialog != null && !beneficiaryBankUnstableDialog.isShowing()) {
                                        beneficiaryBankUnstableDialog.show();
                                        beneficiaryBankUnstableDialog.setOnContinueClickListener(new t(transferToBankInputAmountActivity, dataBean, 3));
                                    }
                                } else {
                                    transferToBankInputAmountActivity.t(dataBean);
                                }
                            }
                        } else {
                            transferBankChannelInfoResp = transferToBankInputAmountActivity.f33531o;
                            if (transferBankChannelInfoResp == null) {
                                transferToBankInputAmountActivity.t(dataBean);
                            } else {
                                transferToBankInputAmountActivity.t(dataBean);
                            }
                        }
                    } else {
                        p220oa.h.x(transferToBankInputAmountActivity, verifyPaymentInfoRsp.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    transferToBankInputAmountActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it3).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        transferToBankInputAmountActivity.f33531o = (TransferBankChannelInfoResp) commonBeanResult.data;
                    }
                } else if (it3 instanceof m) {
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    transferToBankInputAmountActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    ((n) it3).getClass();
                }
                return Unit.f38893a;
        }
    }
}
