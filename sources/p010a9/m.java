package p010a9;

import H5.e;
import L6.b;
import Ma.p;
import Pa.i0;
import Rd.O;
import Xd.v;
import Ya.g;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.api.Service;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.text.ImageTextView;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.snackbar.SnackBarAdView;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepBillsFragment;
import com.transsnet.palmpay.core.bean.BindBankCardFeeBean;
import com.transsnet.palmpay.core.bean.BindCardBvnContent;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeGroupBean;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeItemBean;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.core.ui.activity.FinancialWithdrawalPreviewActivity;
import com.transsnet.palmpay.core.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.core.ui.mvvm.CoreCashierViewModel;
import com.transsnet.palmpay.credit.ui.dialog.CLFillYourInformationDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.DownloadCashPageDialogFragment;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.activity.BuyFlashSaleActivity;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;
import com.transsnet.palmpay.databundle.ui.fragment.DataBundleWalletFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxMainFragment;
import com.transsnet.palmpay.managemoney.ui.view.PlanInfoItem;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashRecordActivity;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import com.transsnet.palmpay.ui.activity.BillPaymentEditActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.GooglePlayInnerAppHelper;
import com.transsnet.palmpay.util.RecentMenuCache;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p118hf.a;
import p220oa.h;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11851b;

    public /* synthetic */ m(Object obj, int i7) {
        this.f11850a = i7;
        this.f11851b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0077  */
    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function2 function2;
        List<BindCardBvnContent> list;
        String str;
        SwipeRefreshLayout swipeRefreshLayout;
        String str2;
        boolean zEqualsIgnoreCase;
        boolean z3 = true;
        Object obj2 = this.f11851b;
        switch (this.f11850a) {
            case 0:
                IconicsDrawable apply = (IconicsDrawable) obj;
                SignUpStepInputPinV2Fragment.a aVar = SignUpStepInputPinV2Fragment.f26273A;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                a.I(apply, 20);
                D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorTextPrimary, ((SignUpStepInputPinV2Fragment) obj2).requireContext()));
                return Unit.f38893a;
            case 1:
                ((UpgradeTier3StepBillsFragment) obj2).showLoadingDialog(((Boolean) obj).booleanValue());
                return Unit.f38893a;
            case 2:
                String it = (String) obj;
                int i7 = ModelAvailableCouponAndPointItem.f34329i;
                Intrinsics.checkNotNullParameter(it, "it");
                ToastUtils.showLong(it, new Object[0]);
                ((ModelAvailableCouponAndPointItem) obj2).getClass();
                return Unit.f38893a;
            case 3:
                return DefaultTurboModuleManagerDelegate.Builder.addCxxReactPackage$lambda$3$lambda$2((Function1) obj2, (ReactApplicationContext) obj);
            case 4:
                return DefaultTurboModuleManagerDelegate.Builder.addCxxReactPackage$lambda$1$lambda$0((Function0) obj2, (ReactApplicationContext) obj);
            case 5:
                return Boolean.valueOf(ReactScrollViewHelper.removeScrollListener$lambda$0((ReactScrollViewHelper.ScrollListener) obj2, (WeakReference) obj));
            case 6:
                return Boolean.valueOf(ReactScrollViewHelper.removeLayoutChangeListener$lambda$2((ReactScrollViewHelper.LayoutChangeListener) obj2, (WeakReference) obj));
            case 7:
                return Boolean.valueOf(InterstitialAdView.fetchData$lambda$11((InterstitialAdView) obj2, (Boolean) obj));
            case 8:
                return Boolean.valueOf(SnackBarAdView.fetchData$lambda$4((SnackBarAdView) obj2, (Boolean) obj));
            case 9:
                String error = (String) obj;
                int i10 = CoreCashierPreviewActivity.f27486Y0;
                Intrinsics.checkNotNullParameter(error, "error");
                p pVar = (p) ((CoreCashierViewModel) ((CoreCashierPreviewActivity) obj2).l()).f28063g.f27356m;
                if (pVar == null || (function2 = pVar.f5913c) == null) {
                    ToastUtils.showLong(error, new Object[0]);
                } else {
                    CommonBeanResult commonBeanResult = new CommonBeanResult();
                    commonBeanResult.setRespMsg(error);
                    commonBeanResult.setRespCode(CommonResult.CODE_FAIL);
                    Unit unit = Unit.f38893a;
                    function2.invoke(pVar.f5911a, commonBeanResult);
                }
                return Unit.f38893a;
            case 10:
                String error2 = (String) obj;
                int i11 = FinancialWithdrawalPreviewActivity.f27631H;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (!TextUtils.isEmpty(error2)) {
                    ToastUtils.showLong(error2, new Object[0]);
                }
                ((FinancialWithdrawalPreviewActivity) obj2).finish();
                return Unit.f38893a;
            case 11:
                BindBankCardFeeBean bindBankCardFeeBean = (BindBankCardFeeBean) obj;
                int i12 = AddBankAccountFragment.f27823C;
                if (bindBankCardFeeBean != null && (list = bindBankCardFeeBean.bindCardBvnContentDTOList) != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            Integer num = ((BindCardBvnContent) obj3).pageType;
                            if (num != null && num.intValue() == 2) {
                                arrayList.add(obj3);
                            }
                        }
                        BindCardBvnContent bindCardBvnContent = (BindCardBvnContent) arrayList.get(0);
                        if (bindCardBvnContent != null) {
                            SpanUtils spanUtils = new SpanUtils();
                            List listSplit$default = z.f38935a;
                            if (!TextUtils.isEmpty(bindCardBvnContent.highLightBindCardTips) && (str = bindCardBvnContent.bindCardTips) != null) {
                                String str3 = TextUtils.isEmpty(str) ? null : str;
                                if (str3 != null) {
                                    String str4 = bindCardBvnContent.highLightBindCardTips;
                                    Intrinsics.e(str4);
                                    listSplit$default = StringsKt__StringsKt.split$default(str3, new String[]{str4}, false, 0, 6, null);
                                }
                            }
                            AddBankAccountFragment addBankAccountFragment = (AddBankAccountFragment) obj2;
                            if (listSplit$default.isEmpty()) {
                                String str5 = bindCardBvnContent.bindCardTips;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                spanUtils.append(str5);
                            } else {
                                spanUtils.append((CharSequence) listSplit$default.get(0)).append(String.valueOf(bindCardBvnContent.highLightBindCardTips)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, addBankAccountFragment.requireActivity()));
                                if (listSplit$default.size() >= 2) {
                                    spanUtils.append((CharSequence) listSplit$default.get(1));
                                }
                            }
                            t tVar = addBankAccountFragment.f27824A;
                            TextView textView = (TextView) tVar.getValue();
                            if (textView != null) {
                                textView.setText(spanUtils.create());
                            }
                            TextView textView2 = (TextView) tVar.getValue();
                            if (textView2 != null) {
                                h.C(textView2);
                            }
                        }
                    }
                }
                return Unit.f38893a;
            case 12:
                Long l5 = (Long) obj;
                CLFillYourInformationDialogFragment cLFillYourInformationDialogFragment = (CLFillYourInformationDialogFragment) obj2;
                TextView textView3 = cLFillYourInformationDialogFragment.f29943L;
                if (textView3 != null) {
                    textView3.setText(cLFillYourInformationDialogFragment.getString(g.cs_cl_borrow_now_with_count_down, l5));
                }
                return Unit.f38893a;
            case 13:
                Long l6 = (Long) obj;
                DownloadCashPageDialogFragment downloadCashPageDialogFragment = (DownloadCashPageDialogFragment) obj2;
                TextView textView4 = downloadCashPageDialogFragment.f29961H;
                if (textView4 != null) {
                    textView4.setText(downloadCashPageDialogFragment.getString(g.cs_cl_skip_download_page, l6));
                }
                return Unit.f38893a;
            case 14:
                return ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$14((ModelMobileWithIconInputLayout) obj2, ((Integer) obj).intValue());
            case 15:
                IconicsDrawable apply2 = (IconicsDrawable) obj;
                CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                Intrinsics.checkNotNullParameter(apply2, "$this$apply");
                D3.a.E(apply2, e.f3702a.colorInt(CommonViewExtKt.colorInt(Jc.a.mm_color_balance_eye, ((CashBoxMainFragment) obj2).requireContext())));
                return Unit.f38893a;
            case 16:
                IconicsDrawable apply3 = (IconicsDrawable) obj;
                int i13 = PlanInfoItem.f32704e;
                Intrinsics.checkNotNullParameter(apply3, "$this$apply");
                a.I(apply3, 20);
                apply3.g(ColorStateList.valueOf(((PlanInfoItem) obj2).getContext().getColor(b.ppColorTextAssist)));
                return Unit.f38893a;
            case 17:
                return GooglePlayInnerAppHelper.innerAppSmartDownLoadedUpdate$lambda$10((AppUpdateManager) obj2, (AppUpdateInfo) obj);
            case 18:
                return Boolean.valueOf(RecentMenuCache.addRecentMenu$lambda$6((RecentMenuCache.RecentMenuKey) obj2, (RecentMenuCache.RecentMenuKey) obj));
            case 19:
                androidx.activity.z addCallback = (androidx.activity.z) obj;
                ArrayList arrayList2 = Recharge2CashHomeActivity.f33117v;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                Recharge2CashHomeActivity recharge2CashHomeActivity = (Recharge2CashHomeActivity) obj2;
                recharge2CashHomeActivity.getClass();
                for (Class cls : Recharge2CashHomeActivity.f33117v) {
                    if (ActivityUtils.isActivityExistsInStack((Class<?>) cls)) {
                        ActivityUtils.finishToActivity((Class<?>) cls, false);
                        recharge2CashHomeActivity.finish();
                        return Unit.f38893a;
                    }
                }
                i0.H(null);
                return Unit.f38893a;
            case 20:
                int i14 = Recharge2CashRecordActivity.f33127g;
                Intrinsics.checkNotNullParameter((String) obj, "it");
                Recharge2CashRecordActivity recharge2CashRecordActivity = (Recharge2CashRecordActivity) obj2;
                recharge2CashRecordActivity.n().getLoadMoreModule().h();
                O o10 = (O) recharge2CashRecordActivity.f27334c;
                if (o10 != null && (swipeRefreshLayout = o10.f8123d) != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                return Unit.f38893a;
            case 21:
                IconicsDrawable apply4 = (IconicsDrawable) obj;
                int i15 = ImageTextView.f24597H;
                Intrinsics.checkNotNullParameter(apply4, "$this$apply");
                ImageTextView imageTextView = (ImageTextView) obj2;
                apply4.k(imageTextView.f24610o);
                apply4.l(imageTextView.f24610o);
                return Unit.f38893a;
            case 22:
                String errorMsg = (String) obj;
                int i16 = BuyFlashSaleActivity.f31762f;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                BuyFlashSaleActivity buyFlashSaleActivity = (BuyFlashSaleActivity) obj2;
                h.x(buyFlashSaleActivity, errorMsg);
                buyFlashSaleActivity.finish();
                return Unit.f38893a;
            case 23:
                androidx.activity.z addCallback2 = (androidx.activity.z) obj;
                int i17 = DataBundleAutoTopupOverlayActivity.f31768f;
                Intrinsics.checkNotNullParameter(addCallback2, "$this$addCallback");
                ((DataBundleAutoTopupOverlayActivity) obj2).n();
                return Unit.f38893a;
            case 24:
                String button = (String) obj;
                Intrinsics.checkNotNullParameter(button, "button");
                ((p082f9.b) obj2).c(button);
                return Unit.f38893a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Integer num2 = (Integer) obj;
                v vVarU = ((DataBundleWalletFragment) obj2).u();
                Intrinsics.e(num2);
                int iIntValue = num2.intValue();
                if (vVarU.f11176c != iIntValue) {
                    vVarU.f11176c = iIntValue;
                    vVarU.notifyDataSetChanged();
                }
                return Unit.f38893a;
            case 26:
                ((View) obj2).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return Unit.f38893a;
            case 27:
                SectionEntity it2 = (SectionEntity) obj;
                int i18 = BillPaymentEditActivity.f34439j;
                Intrinsics.checkNotNullParameter(it2, "it");
                HomePageMenuData homePageMenuData = (HomePageMenuData) obj2;
                if (it2 instanceof LifeBillHomeItemBean) {
                    String str6 = homePageMenuData.billCategoryName;
                    if (!(str6 != null ? str6.equalsIgnoreCase(((LifeBillHomeItemBean) it2).billCategoryName) : false)) {
                        if (it2 instanceof LifeBillHomeGroupBean) {
                            str2 = homePageMenuData.billCategoryName;
                            if (str2 != null) {
                                zEqualsIgnoreCase = str2.equalsIgnoreCase(((LifeBillHomeGroupBean) it2).getTitle());
                            } else {
                                zEqualsIgnoreCase = false;
                            }
                            if (!zEqualsIgnoreCase) {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                    }
                } else if (it2 instanceof LifeBillHomeGroupBean) {
                    z3 = false;
                } else {
                    str2 = homePageMenuData.billCategoryName;
                    if (str2 != null) {
                        zEqualsIgnoreCase = str2.equalsIgnoreCase(((LifeBillHomeGroupBean) it2).getTitle());
                    } else {
                        zEqualsIgnoreCase = false;
                    }
                    if (!zEqualsIgnoreCase) {
                        z3 = false;
                    }
                }
                return Boolean.valueOf(z3);
            case 28:
                IconicsDrawable apply5 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply5, "$this$apply");
                a.I(apply5, 20);
                D3.a.F(apply5, CommonViewExtKt.colorInt(b.ppColorTextPrimary, ((p132ie.b) obj2).f37579b.getContext()));
                return Unit.f38893a;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                p133ig.e eVar = (p133ig.e) obj2;
                sb2.append(eVar.f37613f[iIntValue2]);
                sb2.append(": ");
                sb2.append(eVar.f37614g[iIntValue2].getSerialName());
                return sb2.toString();
        }
    }
}
