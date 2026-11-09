package Ad;

import B6.C0079a;
import B6.RunnableC0085g;
import M7.EnumC0454n;
import Rd.C0598n;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.runtime.internal.bolts.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.api.Service;
import com.google.firebase.perf.util.Constants;
import com.google.mlkit.vision.common.InputImage;
import com.mikepenz.iconics.IconicsDrawable;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.swmansion.rnscreens.ScreenStack;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepBillsFragment;
import com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.ClipboardMatchInfoResp;
import com.transsnet.palmpay.core.bean.rsp.SmsChannelRsp;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView;
import com.transsnet.palmpay.core.ui.mvp.contract.CorePaymentPreviewContract;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.credit.ui.dialog.CreditApplicationDialogFragment;
import com.transsnet.palmpay.custom_view.CircleProgressView;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRecommendModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QuerySavingTaskModuleResp;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.teller.ui.dialog.CouponClaimResultDialog;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import com.transsnet.palmpay.ui.fragment.InvestGuideFragment;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import com.transsnet.palmpay.util.GooglePlayInnerAppHelper;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.ProducerScope;
import p051d9.C1604a;
import p051d9.C1611h;
import p051d9.C1612i;

/* JADX INFO: renamed from: Ad.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0058e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f215c;

    public /* synthetic */ C0058e(int i7, Object obj, Object obj2) {
        this.f213a = i7;
        this.f214b = obj;
        this.f215c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeFragmentContract$IView homeFragmentContract$IView;
        TextView orderStatusTv;
        int i7 = 2;
        boolean z3 = true;
        z3 = true;
        Object obj2 = this.f215c;
        Object obj3 = this.f214b;
        switch (this.f213a) {
            case 0:
                IconicsDrawable apply = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 24);
                C0059f c0059f = (C0059f) obj2;
                D3.a.F(apply, ((AddFromContactListResp) obj3).getIsSelect() ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, c0059f.getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, c0059f.getContext()));
                return Unit.f38893a;
            case 1:
                IconicsDrawable apply2 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply2, "$this$apply");
                p118hf.a.I(apply2, 24);
                C0060g c0060g = (C0060g) obj2;
                D3.a.F(apply2, ((AddFromContactListResp) obj3).getIsSelect() ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, c0060g.getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, c0060g.getContext()));
                return Unit.f38893a;
            case 2:
                List list = (List) obj;
                Intrinsics.e(list);
                ((ProducerScope) obj2).mo64trySendJP2dKIU(new C0079a(list, (InputImage) obj3));
                return Unit.f38893a;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                int i10 = WithdrawAgentPaymentResultActivity.f26909H;
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = (WithdrawAgentPaymentResultActivity) obj3;
                withdrawAgentPaymentResultActivity.n().getOrderStatusTv().setText((jLongValue / ((long) 1000)) + "S");
                withdrawAgentPaymentResultActivity.n().h(((PayByOrderResp.DataBean) obj2).pendingCountdownAcTips);
                return Unit.f38893a;
            case 4:
                View it = (View) obj;
                int i11 = HomeFragmentHomeTab.f35093A0;
                Intrinsics.checkNotNullParameter(it, "it");
                HomeFragmentHomeTab homeFragmentHomeTab = (HomeFragmentHomeTab) obj3;
                if (!homeFragmentHomeTab.isAdded() || homeFragmentHomeTab.isDetached()) {
                    return Unit.f38893a;
                }
                Ie.m mVar = new Ie.m(it);
                homeFragmentHomeTab.f35117w0 = mVar;
                mVar.c((List) obj2);
                return Unit.f38893a;
            case 5:
                View it2 = (View) obj;
                HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                Intrinsics.checkNotNullParameter(it2, "it");
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = (HomeSavingsUserV2Fragment) obj3;
                if (!homeSavingsUserV2Fragment.isAdded() || homeSavingsUserV2Fragment.isDetached()) {
                    return Unit.f38893a;
                }
                O2.a aVar2 = new O2.a(it2, 2);
                homeSavingsUserV2Fragment.f35184z0 = aVar2;
                aVar2.d((QuerySavingTaskModuleResp) obj2);
                return Unit.f38893a;
            case 6:
                View it3 = (View) obj;
                HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                Intrinsics.checkNotNullParameter(it3, "it");
                HomeSavingsUserV2Fragment homeSavingsUserV2Fragment2 = (HomeSavingsUserV2Fragment) obj3;
                if (!homeSavingsUserV2Fragment2.isAdded() || homeSavingsUserV2Fragment2.isDetached()) {
                    return Unit.f38893a;
                }
                Ie.u uVar = new Ie.u(it3);
                homeSavingsUserV2Fragment2.f35183y0 = uVar;
                uVar.a((QueryRecommendModuleResp) obj2);
                return Unit.f38893a;
            case 7:
                View it4 = (View) obj;
                InvestGuideFragment.a aVar4 = InvestGuideFragment.f35185t0;
                Intrinsics.checkNotNullParameter(it4, "it");
                InvestGuideFragment investGuideFragment = (InvestGuideFragment) obj3;
                if (!investGuideFragment.isAdded() || investGuideFragment.isDetached()) {
                    return Unit.f38893a;
                }
                Ie.u uVar2 = new Ie.u(it4);
                investGuideFragment.f35199X = uVar2;
                uVar2.a((QueryRecommendModuleResp) obj2);
                return Unit.f38893a;
            case 8:
                View it5 = (View) obj;
                InvestGuideFragment.a aVar5 = InvestGuideFragment.f35185t0;
                Intrinsics.checkNotNullParameter(it5, "it");
                InvestGuideFragment investGuideFragment2 = (InvestGuideFragment) obj3;
                if (!investGuideFragment2.isAdded() || investGuideFragment2.isDetached()) {
                    return Unit.f38893a;
                }
                Ie.t tVar = new Ie.t(it5);
                investGuideFragment2.f35201Z = tVar;
                tVar.a((List) obj2);
                return Unit.f38893a;
            case 9:
                CommonBeanResult response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccess() && (homeFragmentContract$IView = (HomeFragmentContract$IView) ((Fe.I) obj3).f27351a) != null) {
                    homeFragmentContract$IView.handleClipboardMatchInfo((String) obj2, (ClipboardMatchInfoResp) response.data);
                }
                return Unit.f38893a;
            case 10:
                CheckBankCardInfoRsp it6 = (CheckBankCardInfoRsp) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                AddNewCardContract$IView addNewCardContract$IView = (AddNewCardContract$IView) ((La.l) obj3).f27351a;
                if (addNewCardContract$IView != null) {
                    addNewCardContract$IView.handleCheckInputBankCardInfoRsp((CheckBankCardInfoReq) obj2, it6);
                }
                return Unit.f38893a;
            case 11:
                PreviewPayInfoResp it7 = (PreviewPayInfoResp) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                CorePaymentPreviewContract.View view = (CorePaymentPreviewContract.View) ((La.x) obj3).f27351a;
                if (view != null) {
                    PreviewPayInfoV2Req previewPayInfoV2Req = (PreviewPayInfoV2Req) obj2;
                    view.updatePreviewInfo(previewPayInfoV2Req != null ? previewPayInfoV2Req.payerAccountType : null, it7.getData());
                }
                return Unit.f38893a;
            case 12:
                PreviewPayInfoResp it8 = (PreviewPayInfoResp) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                La.F f10 = (La.F) obj3;
                if (it8.isSuccess()) {
                    if (it8.getData() != null) {
                        PreviewPayInfoResp.DataBean data = it8.getData();
                        long j6 = data.orderAmount;
                        SelectPaymentContract$IView selectPaymentContract$IView = (SelectPaymentContract$IView) f10.f27351a;
                        if (selectPaymentContract$IView != null) {
                            selectPaymentContract$IView.setPayAmount(j6);
                        }
                        SelectPaymentContract$IView selectPaymentContract$IView2 = (SelectPaymentContract$IView) f10.f27351a;
                        if (selectPaymentContract$IView2 != null) {
                            selectPaymentContract$IView2.setFeeAmount(data.fee);
                        }
                    }
                    f10.c(0, ((PreviewPayInfoV2Req) obj2).transType, "", "");
                } else {
                    SelectPaymentContract$IView selectPaymentContract$IView3 = (SelectPaymentContract$IView) f10.f27351a;
                    if (selectPaymentContract$IView3 != null) {
                        selectPaymentContract$IView3.showLoadingView(false);
                    }
                    SelectPaymentContract$IView selectPaymentContract$IView4 = (SelectPaymentContract$IView) f10.f27351a;
                    if (selectPaymentContract$IView4 != null) {
                        selectPaymentContract$IView4.showPaymentMethodError(it8.getRespMsg());
                    }
                }
                return Unit.f38893a;
            case 13:
                ScreenFragmentWrapper it9 = (ScreenFragmentWrapper) obj;
                ScreenStack.a aVar6 = ScreenStack.f25329L;
                Intrinsics.checkNotNullParameter(it9, "it");
                if ((it9 == ((kotlin.jvm.internal.F) obj3).f38951a || CollectionsKt.A(((ScreenStack) obj2).f25335o, it9)) && it9.getScreen().getActivityState() != EnumC0454n.f5825a) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 14:
                return SetUserPhotoActivity.compressPhoto$lambda$17((SetUserPhotoActivity) obj3, (String) obj2, (Uri) obj);
            case 15:
                int iIntValue = ((Integer) obj).intValue();
                OneTimeCodeV5View oneTimeCodeV5View = (OneTimeCodeV5View) obj3;
                OnSendCodeListener onSendCodeListener = oneTimeCodeV5View.sendCodeListener;
                if (onSendCodeListener != null) {
                    int iIntValue2 = ((Number) ((ArrayList) obj2).get(iIntValue)).intValue();
                    if (iIntValue2 >= 2000) {
                        SmsChannelRsp smsChannelRspF = oneTimeCodeV5View.f(4);
                        onSendCodeListener.onSend(4, iIntValue2 - Constants.MAX_URL_LENGTH, smsChannelRspF != null ? smsChannelRspF.sender : null);
                    } else if (iIntValue2 == 3) {
                        SmsChannelRsp smsChannelRspF2 = oneTimeCodeV5View.f(3);
                        onSendCodeListener.onSend(3, iIntValue2 - Constants.MAX_URL_LENGTH, smsChannelRspF2 != null ? smsChannelRspF2.sender : null);
                    } else {
                        oneTimeCodeV5View.k();
                        onSendCodeListener.onSend(iIntValue2, 0, null);
                    }
                }
                return Unit.f38893a;
            case 16:
                Integer num = (Integer) obj;
                int iIntValue3 = num.intValue();
                if (iIntValue3 >= 0 && iIntValue3 < ((List) obj3).size()) {
                    ((Function1) obj2).invoke(num);
                }
                return Unit.f38893a;
            case 17:
                String line = (String) obj;
                Intrinsics.checkNotNullParameter(line, "line");
                SpannableString spannableString = (SpannableString) obj3;
                spannableString.setSpan(new ForegroundColorSpan(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, (MapPage) obj2)), StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", line, 0, false, 6), line.length() + StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", line, 0, false, 6), 33);
                spannableString.setSpan(new StyleSpan(1), StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", line, 0, false, 6), line.length() + StringsKt.E("1. How to find the exact address of the nearby agent?\n\nClick the Nearby Agent and find the agent according to the map. If the agent provides a phone number, you can also call in advance to find the agent.\n\n\n2. How to get cashback when you use PalmPay App's Withdrawal Feature to get cash from the agents?\n\nYou can get cashback at any agent store that provides the payment method of PalmPay's Pay With Transfer and the account name shows cashback label at the same time when you enter the account number.\n\n\n3. How to get cash after finding the nearby agent?\n\nAfter you find an agent, you can use the Withdrawal feature on PalmPay App to transfer money to his or her PalmPay account or pay with transfer account number, and then get cash.\n\n\n4. What are the benefits of withdrawing cash through PalmPay App?\n\nWithdraw cash from PalmPay agent through the Withdrawal feature of PalmPay App will be free of charge. And you will have a chance to get cashback every day.\n\n\n5. What should I do if I see an agent on Nearby Agent but I don't find one?\n\nYou can call the customer service number（018886888） to mention the issue. We will verify the location of the agent as soon as possible, notify the agent to change the location if there’s any problem, and give you feedback on the results.\n\nxxxxx If there’s any address problem, click here to feedback\n", line, 0, false, 6), 33);
                return Unit.f38893a;
            case 18:
                long jLongValue2 = ((Long) obj).longValue();
                int i12 = BillerTransactionResultActivity.f34181Y;
                BillerTransactionResultActivity billerTransactionResultActivity = (BillerTransactionResultActivity) obj3;
                C0598n c0598n = (C0598n) billerTransactionResultActivity.f27334c;
                if (c0598n != null && (orderStatusTv = c0598n.f8408f.getOrderStatusTv()) != null) {
                    orderStatusTv.setText((jLongValue2 / ((long) 1000)) + "S");
                }
                C0598n c0598n2 = (C0598n) billerTransactionResultActivity.f27334c;
                if (c0598n2 != null) {
                    c0598n2.f8408f.h((String) obj2);
                }
                return Unit.f38893a;
            case 19:
                ((Xf.d) obj3).f11222c.removeCallbacks((RunnableC0085g) obj2);
                return Unit.f38893a;
            case 20:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                p024b9.d dVar = ((UpgradeTier3StepBillsFragment) obj3).t;
                if (dVar != null) {
                    dVar.b((QueryAddressFromBillRsp) obj2);
                }
                return Unit.f38893a;
            case 21:
                BillerCouponItemBean billerCouponItemBean = (BillerCouponItemBean) obj;
                int i13 = ModelAvailableCouponAndPointItem.f34329i;
                ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem = (ModelAvailableCouponAndPointItem) obj3;
                ((Function1) obj2).invoke(billerCouponItemBean);
                if (billerCouponItemBean != null) {
                    CouponClaimResultDialog couponClaimResultDialog = new CouponClaimResultDialog(modelAvailableCouponAndPointItem.getContext(), 0, 0, 6, null);
                    couponClaimResultDialog.setCouponItem(C1849p.c(billerCouponItemBean)).setResultCallback((ResultCallback<List<BillerCouponItemBean>>) new U8.a(20, modelAvailableCouponAndPointItem, couponClaimResultDialog)).show();
                }
                if (BaseApplication.hasLogin()) {
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = androidx.lifecycle.V.f(modelAvailableCouponAndPointItem);
                    p042cg.f fVar = Wf.I.f10809a;
                    modelAvailableCouponAndPointItem.addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new p041ce.u(null, modelAvailableCouponAndPointItem), 2));
                }
                return Unit.f38893a;
            case 22:
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$41$lambda$39((ReactHostImpl) obj3, (String) obj2, (Task) obj);
            case 23:
                return ReactHostImpl.loadBundle$lambda$16((ReactHostImpl) obj3, "loadBundle()", (JSBundleLoader) obj2, (ReactInstance) obj);
            case 24:
                return InterstitialAdView.fetchData$lambda$9((InterstitialAdView) obj3, (AdShowCallback) obj2, ((Boolean) obj).booleanValue());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Long l5 = (Long) obj;
                CreditApplicationDialogFragment.a aVar7 = CreditApplicationDialogFragment.f29952L;
                TextView textView = (TextView) obj3;
                if (textView != null) {
                    textView.setText(l5 + "S");
                }
                CircleProgressView circleProgressView = (CircleProgressView) obj2;
                if (circleProgressView != null) {
                    circleProgressView.b((int) l5.longValue(), 4);
                }
                return Unit.f38893a;
            case 26:
                return ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$16((ModelMobileWithIconInputLayout) obj3, (Function1) obj2, ((Integer) obj).intValue());
            case 27:
                return CommonExtKt.formatWithSeparator$lambda$0((kotlin.jvm.internal.D) obj3, (String) obj2, ((Integer) obj).intValue());
            case 28:
                return GooglePlayInnerAppHelper.innerAppSmartUpdate$lambda$5((AppUpdateManager) obj3, (Activity) obj2, (AppUpdateInfo) obj);
            default:
                CommonResult it10 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                C1612i c1612i = (C1612i) obj3;
                if (it10.isSuccess()) {
                    J3.a.D(c1612i, c1612i.f27351a, new C1611h((SmsActionReq) obj2, null), new C1604a(c1612i, z3 ? 1 : 0), new C1604a(c1612i, i7), false, false);
                } else {
                    ChangeMobileContract.View view2 = (ChangeMobileContract.View) c1612i.f27351a;
                    if (view2 != null) {
                        view2.showLoadingView(false);
                    }
                    if (CommonResult.CODE_PHONE_REGISTERED.equals(it10.getRespCode())) {
                        ToastUtils.showLong(F8.h.ac_msg_mobile_number_is_used);
                    } else {
                        ToastUtils.showLong(it10.getRespMsg(), new Object[0]);
                    }
                    ChangeMobileContract.View view3 = (ChangeMobileContract.View) c1612i.f27351a;
                    if (view3 != null) {
                        view3.handSendMessageResult(it10);
                    }
                }
                return Unit.f38893a;
        }
    }
}
