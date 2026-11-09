package p353xd;

import Kd.C0413s1;
import Kd.C0422v1;
import Pa.n0;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.req.TransferBankChannelInfoReq;
import com.transsnet.palmpay.send_money.bean.req.TransferBankEntranceReq;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferEntranceResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferToBankAccountInfoResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;
import p223od.i;
import p294tb.W;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43912b;

    public /* synthetic */ y(TransferToBankInputAmountActivity transferToBankInputAmountActivity, int i7) {
        this.f43911a = i7;
        this.f43912b = transferToBankInputAmountActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransferToBankAccountInfoResp transferToBankAccountInfoResp;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43912b;
        switch (this.f43911a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        if (commonBeanResult.isSuccess() && (transferToBankAccountInfoResp = (TransferToBankAccountInfoResp) commonBeanResult.data) != null) {
                            TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                            TransferToBankViewModel transferToBankViewModel = (TransferToBankViewModel) transferToBankInputAmountActivity.l();
                            if (transferToBankViewModel != null) {
                                transferToBankViewModel.f34061p = transferToBankAccountInfoResp;
                            }
                            BankInfo bankInfo = transferToBankInputAmountActivity.f33526e;
                            if (bankInfo != null) {
                                bankInfo.relationshipPic = transferToBankAccountInfoResp.getRelationshipPic();
                                bankInfo.relationshipDarkPic = transferToBankAccountInfoResp.getRelationshipDarkPic();
                                bankInfo.label = transferToBankAccountInfoResp.getLabel();
                            }
                            TransferToBankInputAmountActivity.o(transferToBankInputAmountActivity);
                            TransferToBankViewModel transferToBankViewModel2 = (TransferToBankViewModel) transferToBankInputAmountActivity.l();
                            TransferBankEntranceReq transferBankEntranceReq = new TransferBankEntranceReq();
                            BankInfo bankInfo2 = transferToBankInputAmountActivity.f33526e;
                            transferBankEntranceReq.setBusinessType(Integer.valueOf((bankInfo2 == null || bankInfo2.mmo != 1) ? 3 : 9));
                            transferBankEntranceReq.setBankAccount(transferToBankInputAmountActivity.f33527f);
                            BankInfo bankInfo3 = transferToBankInputAmountActivity.f33526e;
                            if (bankInfo3 != null) {
                                transferBankEntranceReq.setBankCode(bankInfo3.bankCode);
                                transferBankEntranceReq.setLabel(bankInfo3.label);
                            }
                            transferToBankViewModel2.getClass();
                            f.s(transferToBankViewModel2, new C0422v1(transferBankEntranceReq, null), transferToBankViewModel2.f34059j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((p) it2).f27360a;
                        if (commonListResultV2.isSuccess()) {
                            Iterable<ScheduleTransferEntranceResp> iterable = commonListResultV2.data;
                            if (iterable != null) {
                                TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                                for (ScheduleTransferEntranceResp scheduleTransferEntranceResp : iterable) {
                                    if (Intrinsics.c(scheduleTransferEntranceResp.getShow(), Boolean.TRUE)) {
                                        ImageView imageView = new ImageView(transferToBankInputAmountActivity);
                                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                                        imageView.setAdjustViewBounds(true);
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams.setMargins(0, CommonViewExtKt.getDp(12), 0, 0);
                                        imageView.setLayoutParams(layoutParams);
                                        r0.k1(imageView, scheduleTransferEntranceResp.getPic(), scheduleTransferEntranceResp.getDarkPic());
                                        if (!TextUtils.isEmpty(scheduleTransferEntranceResp.getViewEvent())) {
                                            HashMap map = new HashMap();
                                            if (!TextUtils.isEmpty(scheduleTransferEntranceResp.getElementName())) {
                                                String elementName = scheduleTransferEntranceResp.getElementName();
                                                if (elementName == null) {
                                                    elementName = "";
                                                }
                                                map.put("element_name", elementName);
                                            }
                                            n0 n0VarG = n0.g();
                                            String viewEvent = scheduleTransferEntranceResp.getViewEvent();
                                            Intrinsics.e(viewEvent);
                                            n0VarG.w(viewEvent, map);
                                        }
                                        imageView.setOnClickListener(new W(15, scheduleTransferEntranceResp, transferToBankInputAmountActivity));
                                        i iVar = (i) transferToBankInputAmountActivity.f27334c;
                                        if (iVar != null) {
                                            iVar.f40381o.addView(imageView);
                                        }
                                    }
                                }
                            }
                            TransferToBankInputAmountActivity.a aVar3 = TransferToBankInputAmountActivity.f33522C;
                            TransferToBankViewModel transferToBankViewModel3 = (TransferToBankViewModel) transferToBankInputAmountActivity.l();
                            TransferBankChannelInfoReq req = new TransferBankChannelInfoReq();
                            req.setPayeeBankCardNo(transferToBankInputAmountActivity.f33527f);
                            BankInfo bankInfo4 = transferToBankInputAmountActivity.f33526e;
                            req.setPayeeBankCode(bankInfo4 != null ? bankInfo4.bankCode : null);
                            req.setPayeeAccountName(transferToBankInputAmountActivity.f33528g);
                            transferToBankViewModel3.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            f.s(transferToBankViewModel3, new C0413s1(req, null), transferToBankViewModel3.f34058i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
