package p294tb;

import Pa.C0525w;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import S6.a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.betting.bean.BettingQuickILotHomeBean;
import com.transsnet.palmpay.betting.ui.view.ModelQuickBettingView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.ui.dialog.BillDetailProcessDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLTaskResp;
import com.transsnet.palmpay.credit.bean.resp.OcAutoDeductOrderDetailRsp;
import com.transsnet.palmpay.credit.bean.resp.OcFeedbackHistoryDetail;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import com.transsnet.palmpay.credit.manager.LoanCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLRepayExitDialog;
import com.transsnet.palmpay.credit.ui.dialog.OcRepayExitMarketingDialog;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideDoubleOpenFragment;
import com.transsnet.palmpay.jara_packet.bean.WhoInviteItem;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecord;
import com.transsnet.palmpay.main.export.bean.rsp.AccountData;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantOrderDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferEntranceResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantOrderDetailActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p141j9.C1798f;
import p220oa.h;
import p223od.i;
import p295tc.e;
import p295tc.f;
import p295tc.n;
import p312ud.l;
import p328ve.c;
import p339wb.b;
import p351xb.g;
import p368yb.C2154w;
import p368yb.C2156y;
import p368yb.C2157z;
import p382zb.I;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class W implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42438c;

    public /* synthetic */ W(int i7, Object obj, Object obj2) {
        this.f42436a = i7;
        this.f42437b = obj;
        this.f42438c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        I i7;
        C1798f c1798f;
        PpAmountEditText ppAmountEditText;
        EditText editText;
        Editable text;
        Intent openUrlIntent;
        int i10 = 1;
        String string = null;
        Object obj = this.f42438c;
        Object obj2 = this.f42437b;
        switch (this.f42436a) {
            case 0:
                int i11 = CLRepaymentActivity.f29036w0;
                ((CLRepaymentActivity) obj2).finish();
                ((CLRepayExitDialog) obj).dismiss();
                break;
            case 1:
                f fVar = (f) obj;
                try {
                    Object tag = ((e) obj2).d().getTag();
                    if ((tag instanceof Integer) && (i7 = fVar.f42561b) != null) {
                        Object obj3 = fVar.b().get(((Number) tag).intValue());
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        i7.inviteesClick((ReferEarnRecord) obj3);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                if (!r0.U0() && (c1798f = ((n) obj2).f42580a) != null) {
                    c1798f.invoke((WhoInviteItem) obj);
                }
                break;
            case 3:
                int i12 = ThirdPartyMerchantOrderDetailActivity.f35001M;
                ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity = (ThirdPartyMerchantOrderDetailActivity) obj2;
                thirdPartyMerchantOrderDetailActivity.getClass();
                OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                ThirdPartyMerchantOrderDetailResp thirdPartyMerchantOrderDetailResp = (ThirdPartyMerchantOrderDetailResp) obj;
                orderInfoForCustomerService.paymentType = thirdPartyMerchantOrderDetailResp.getMerchantName();
                orderInfoForCustomerService.time = thirdPartyMerchantOrderDetailResp.getUpdateTime();
                orderInfoForCustomerService.amount = thirdPartyMerchantOrderDetailResp.getPayAmount();
                orderInfoForCustomerService.fee = thirdPartyMerchantOrderDetailResp.getPayerFee();
                orderInfoForCustomerService.vat = thirdPartyMerchantOrderDetailResp.getPayerVat();
                orderInfoForCustomerService.pointsUsed = thirdPartyMerchantOrderDetailResp.getLoyaltyPoint();
                orderInfoForCustomerService.pointsEarned = thirdPartyMerchantOrderDetailResp.getReturnPoint();
                orderInfoForCustomerService.orderNumber = thirdPartyMerchantOrderDetailResp.getOrderId();
                orderInfoForCustomerService.orderStatus = thirdPartyMerchantOrderDetailResp.getOrderDesc();
                i0.M(thirdPartyMerchantOrderDetailActivity, orderInfoForCustomerService);
                break;
            case 4:
                int i13 = OcApplyBaseActivity.f29246X;
                if (!Intrinsics.c((String) obj2, "5")) {
                    ((OcApplyBaseActivity) obj).getClass();
                    OcApplyBaseActivity.n();
                    break;
                }
                break;
            case 5:
                int i14 = OcRepayActivity.f29705v1;
                ((OcRepayActivity) obj2).finish();
                ((OcRepayExitMarketingDialog) obj).dismiss();
                break;
            case 6:
                int i15 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                BillDetailProcessDialog billDetailProcessDialog = new BillDetailProcessDialog((OcRepayOrderDetailInPalmPayActivity) obj2);
                billDetailProcessDialog.show();
                billDetailProcessDialog.fillData(((OcAutoDeductOrderDetailRsp.DataBean) obj).orderStatusInfo);
                break;
            case 7:
                ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity = (ScheduleTransferOrderDetailActivity) obj2;
                scheduleTransferOrderDetailActivity.f33415j = !scheduleTransferOrderDetailActivity.f33415j;
                Iterator it = scheduleTransferOrderDetailActivity.f33416o.iterator();
                while (it.hasNext()) {
                    h.s((View) it.next(), scheduleTransferOrderDetailActivity.f33415j);
                }
                IconicsDrawable iconicsDrawable = new IconicsDrawable(scheduleTransferOrderDetailActivity, scheduleTransferOrderDetailActivity.f33415j ? a.pay_ArrowUp : a.pay_Arrowdown);
                iconicsDrawable.a(new l(scheduleTransferOrderDetailActivity, i10));
                ((TextView) obj).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, iconicsDrawable, (Drawable) null);
                break;
            case 8:
                Context context = ((c) obj2).f43179a;
                O6.c cVar = new O6.c(context);
                LinkBankCardResp.LinkBankCard linkBankCard = (LinkBankCardResp.LinkBankCard) obj;
                cVar.f6598d = context.getString(Ac.h.main_expiry_date_s, linkBankCard.getExpiryMonth(), linkBankCard.getExpiryYear());
                cVar.d(k.core_confirm, null);
                cVar.g();
                break;
            case 9:
                int i16 = ModelQuickBettingView.f26759p;
                BettingQuickILotHomeBean bettingQuickILotHomeBean = (BettingQuickILotHomeBean) obj2;
                Pair pair = new Pair("linkUrl", bettingQuickILotHomeBean != null ? bettingQuickILotHomeBean.getILotLink1() : null);
                ModelQuickBettingView modelQuickBettingView = (ModelQuickBettingView) obj;
                BettingQuickILotHomeBean bettingQuickILotHomeBean2 = modelQuickBettingView.f26767o;
                Pair pair2 = new Pair("BillerIcon", bettingQuickILotHomeBean2 != null ? bettingQuickILotHomeBean2.getBillerIcon() : null);
                BettingQuickILotHomeBean bettingQuickILotHomeBean3 = modelQuickBettingView.f26767o;
                d.E(p002a.a.e(pair, pair2, new Pair("BillerName", bettingQuickILotHomeBean3 != null ? bettingQuickILotHomeBean3.getBillerName() : null)), "/quick_teller/betting_quickbet_web");
                break;
            case 10:
                int i17 = ModelQuickBettingView.f26759p;
                ((ModelQuickBettingView) obj2).g((String) obj);
                break;
            case 11:
                n0.g().m("DanceFiesta_element_click", "taskGo", "");
                CLTaskResp.CLTaskData.CLTask cLTask = (CLTaskResp.CLTaskData.CLTask) obj;
                String taskName = cLTask.getTaskName();
                String str = taskName != null ? taskName : "";
                b bVar = (b) obj2;
                boolean zC = Intrinsics.c(bVar.f4984a.getString(Nd.c.share_invitation_title), str);
                Context context2 = bVar.f4984a;
                if (zC || "Invite 1 Friend".equals(str)) {
                    ShareDialog shareDialog = new ShareDialog(context2);
                    shareDialog.setShareBusinessType(47);
                    shareDialog.show();
                } else if (!TextUtils.isEmpty(cLTask.getTaskJumpParam())) {
                    F.f(cLTask.getTaskJumpPath(), String.valueOf(cLTask.getTaskJumpType()), cLTask.getTaskJumpParam());
                } else {
                    ActivityUtils.startActivity(F.a(context2, cLTask.getTaskJumpPath()));
                }
                break;
            case 12:
                p339wb.d dVar = (p339wb.d) obj2;
                dVar.getClass();
                if (!r0.U0()) {
                    dVar.closeAllItems();
                    RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                    if (recipientBean.getRecipientType() != 2 && recipientBean.getRecipientType() != 7) {
                        recipientBean.getRecipientType();
                        break;
                    }
                }
                break;
            case 13:
                CLBorrowCouponData cLBorrowCouponData = (CLBorrowCouponData) obj2;
                Boolean expend = cLBorrowCouponData.getExpend();
                Boolean bool = Boolean.TRUE;
                g gVar = (g) obj;
                if (!Intrinsics.c(expend, bool)) {
                    cLBorrowCouponData.setExpend(bool);
                    p351xb.h.a(gVar.f43765f, true);
                    gVar.f43768j.setVisibility(0);
                } else {
                    cLBorrowCouponData.setExpend(Boolean.FALSE);
                    p351xb.h.a(gVar.f43765f, false);
                    gVar.f43768j.setVisibility(8);
                }
                break;
            case 14:
                p351xb.h hVar = (p351xb.h) obj2;
                ImageView imageView = hVar.f43773d;
                if (imageView != null) {
                    imageView.setImageResource(p025ba.d.core_coupon_uncheck_black);
                }
                int i18 = hVar.f43772c;
                g gVar2 = (g) obj;
                int bindingAdapterPosition = gVar2.getBindingAdapterPosition();
                ImageView imageView2 = gVar2.f43763d;
                if (i18 != bindingAdapterPosition) {
                    imageView2.setImageResource(p025ba.d.core_coupon_checked);
                    hVar.f43772c = gVar2.getBindingAdapterPosition();
                    hVar.f43773d = imageView2;
                } else {
                    imageView2.setImageResource(p025ba.d.core_coupon_uncheck_black);
                    hVar.f43772c = -1;
                    hVar.f43773d = null;
                }
                org.greenrobot.eventbus.f fVar2 = hVar.f43774e;
                if (fVar2 != null) {
                    View itemView = gVar2.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    fVar2.onItemClick(itemView, hVar.f43772c);
                }
                break;
            case 15:
                TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                ScheduleTransferEntranceResp scheduleTransferEntranceResp = (ScheduleTransferEntranceResp) obj2;
                if (!TextUtils.isEmpty(scheduleTransferEntranceResp.getClickEvent())) {
                    n0 n0VarG = n0.g();
                    ClickEvent clickEvent = new ClickEvent(scheduleTransferEntranceResp.getClickEvent());
                    if (!TextUtils.isEmpty(scheduleTransferEntranceResp.getElementName())) {
                        clickEvent.add("element_name", scheduleTransferEntranceResp.getElementName());
                    }
                    n0VarG.q(clickEvent);
                }
                Integer entranceType = scheduleTransferEntranceResp.getEntranceType();
                TransferToBankInputAmountActivity transferToBankInputAmountActivity = (TransferToBankInputAmountActivity) obj;
                if (entranceType == null || entranceType.intValue() != 1) {
                    ActivityUtils.startActivity(F.a(transferToBankInputAmountActivity, scheduleTransferEntranceResp.getJumpUrl()));
                } else {
                    Postcard postcardBuild = ARouter.getInstance().build("/sm/schedule_transfer_create");
                    BankInfo bankInfo = transferToBankInputAmountActivity.f33526e;
                    Postcard postcardWithString = postcardBuild.withInt("extra_type", (bankInfo == null || bankInfo.mmo != 1) ? 3 : 9).withString("extra_data", ((Gson) C0525w.f().f7166b).toJson(transferToBankInputAmountActivity.f33526e)).withString("BANK_ACCOUNT_NUMBER", transferToBankInputAmountActivity.f33527f).withString("contact_name", transferToBankInputAmountActivity.f33528g);
                    i iVar = (i) transferToBankInputAmountActivity.f27334c;
                    if (iVar != null && (editText = iVar.f40373b) != null && (text = editText.getText()) != null) {
                        string = text.toString();
                    }
                    Postcard postcardWithString2 = postcardWithString.withString("extra_note", string);
                    i iVar2 = (i) transferToBankInputAmountActivity.f27334c;
                    postcardWithString2.withDouble("extra_amount", (iVar2 == null || (ppAmountEditText = iVar2.f40374c) == null) ? 0.0d : ppAmountEditText.getDoubleAmount()).navigation();
                }
                break;
            case 16:
                C2154w c2154w = (C2154w) obj2;
                Object systemService = c2154w.f4991a.getSystemService("clipboard");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                OcFeedbackHistoryDetail ocFeedbackHistoryDetail = (OcFeedbackHistoryDetail) obj;
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(ocFeedbackHistoryDetail.getFeedbackNo(), ocFeedbackHistoryDetail.getFeedbackNo()));
                ToastUtils.showShort(c2154w.f4991a.getString(Ya.g.cs_oc_copied), new Object[0]);
                break;
            case 17:
                int absoluteAdapterPosition = ((C2156y) ((RecyclerView.ViewHolder) obj2)).getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition != -1) {
                    C2157z c2157z = (C2157z) obj;
                    if (c2157z.f44274b.size() > absoluteAdapterPosition) {
                        ArrayList arrayList = c2157z.f44274b;
                        arrayList.remove(absoluteAdapterPosition);
                        c2157z.notifyItemRemoved(absoluteAdapterPosition);
                        c2157z.notifyItemRangeChanged(absoluteAdapterPosition, arrayList.size());
                    }
                }
                break;
            case 18:
                int i19 = CLMainFragment.j1;
                E activity = ((CLMainFragment) obj2).getActivity();
                if (activity != null) {
                    ((CLMainActivity) activity).f28946k0 = true;
                }
                String str2 = (String) obj;
                if (str2 != null && (openUrlIntent = IntentUtils.getOpenUrlIntent(str2, true)) != null) {
                    ActivityUtils.startActivity(openUrlIntent);
                    break;
                }
                break;
            case 19:
                int i20 = OcGuideDoubleOpenFragment.f30417r0;
                ProductContentInfo productContentInfo = (ProductContentInfo) obj2;
                if (!TextUtils.equals("declined", productContentInfo != null ? productContentInfo.status : null)) {
                    F.f(productContentInfo != null ? productContentInfo.jumpPath : null, productContentInfo != null ? productContentInfo.jumpType : null, productContentInfo != null ? productContentInfo.jumpParams : null);
                } else {
                    OcGuideDoubleOpenFragment ocGuideDoubleOpenFragment = (OcGuideDoubleOpenFragment) obj;
                    LoanCreditService loanCreditService = new LoanCreditService(ocGuideDoubleOpenFragment);
                    Z childFragmentManager = ocGuideDoubleOpenFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    androidx.camera.core.impl.utils.n.y(loanCreditService, childFragmentManager, productContentInfo != null ? productContentInfo.loanProduct : null, null, productContentInfo != null ? productContentInfo.applyId : null, 4);
                }
                break;
            default:
                AccountData accountData = (AccountData) obj2;
                n0.g().k(new ClickEvent("FinanceTab_Breakdown_Product_Click").add("element_name", accountData.name));
                if (!TextUtils.isEmpty(accountData.androidIndexUrl)) {
                    p385ze.a aVar2 = (p385ze.a) obj;
                    if (accountData.androidVersion <= BaseApplication.get().getVersionCode()) {
                        ActivityUtils.startActivity(F.a(aVar2.itemView.getContext(), accountData.androidIndexUrl));
                    } else {
                        O6.c cVar2 = new O6.c(aVar2.itemView.getContext());
                        cVar2.f6596b = O6.d.f("Upgrade Required");
                        cVar2.d(k.core_upgrade_now, new p327vd.c(aVar2, 25));
                        cVar2.f6598d = "Your current version does not support this feature. Please update your app to the latest version to access this service.";
                        cVar2.a().show();
                    }
                }
                break;
        }
    }

    public /* synthetic */ W(CLBorrowCouponData cLBorrowCouponData, p351xb.h hVar, g gVar) {
        this.f42436a = 13;
        this.f42437b = cLBorrowCouponData;
        this.f42438c = gVar;
    }
}
