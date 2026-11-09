package p068ec;

import C9.V;
import G1.d;
import Pa.C0525w;
import Pa.r0;
import Rd.C0599o;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.QueryMobileWalletTypeByPhoneRsp;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.teller.bean.DataBundleExtraItemInfo;
import com.transsnet.palmpay.teller.bean.DataBundleMoreTipsResult;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemTipsBean;
import com.transsnet.palmpay.teller.bean.resp.BillCommonConfigBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.teller.bean.resp.DataBundleHomeLinkBean;
import com.transsnet.palmpay.teller.ui.view.ModelBillerBottomMenu;
import com.transsnet.palmpay.util.StringUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import p130ic.C;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36262b;

    public /* synthetic */ i(BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        this.f36261a = i7;
        this.f36262b = buyBundleHomePageActivity;
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0394  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PpTitleBar ppTitleBar;
        ImageView rightImageView2;
        T t;
        ImageView rightImageView3;
        ImageView rightImageView4;
        TextView textView;
        TextView textView2;
        ModelBillerBottomMenu modelBillerBottomMenu;
        ArrayList<MobileWalletResp.MobileWallet> arrayList;
        ArrayList<MobileWalletResp.MobileWallet> data;
        BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36262b;
        switch (this.f36261a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        Object obj2 = commonBeanResult.data;
                        buyBundleHomePageActivity.f31756p0 = (BillerCouponRetentionBean) (commonBeanResult.isSuccess() ? obj2 : null);
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ((n) it).getClass();
                        buyBundleHomePageActivity.f31756p0 = null;
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        if (!commonBeanResult2.isSuccess() || (t = commonBeanResult2.data) == 0 || TextUtils.isEmpty(((DataBundleHomeLinkBean) t).icon)) {
                            ppTitleBar = buyBundleHomePageActivity.f31751i;
                            if (ppTitleBar != null && (rightImageView2 = ppTitleBar.getRightImageView2()) != null) {
                                h.s(rightImageView2, false);
                            }
                        } else {
                            DataBundleHomeLinkBean dataBundleHomeLinkBean = (DataBundleHomeLinkBean) commonBeanResult2.data;
                            if (TextUtils.isEmpty(dataBundleHomeLinkBean != null ? dataBundleHomeLinkBean.link : null)) {
                                ppTitleBar = buyBundleHomePageActivity.f31751i;
                                if (ppTitleBar != null) {
                                    h.s(rightImageView2, false);
                                }
                            } else {
                                PpTitleBar ppTitleBar2 = buyBundleHomePageActivity.f31751i;
                                if (ppTitleBar2 != null && (rightImageView4 = ppTitleBar2.getRightImageView2()) != null) {
                                    h.s(rightImageView4, true);
                                }
                                PpTitleBar ppTitleBar3 = buyBundleHomePageActivity.f31751i;
                                ImageView rightImageView5 = ppTitleBar3 != null ? ppTitleBar3.getRightImageView2() : null;
                                DataBundleHomeLinkBean dataBundleHomeLinkBean2 = (DataBundleHomeLinkBean) commonBeanResult2.data;
                                String str = dataBundleHomeLinkBean2 != null ? dataBundleHomeLinkBean2.icon : null;
                                d dVar = new d();
                                int dp = CommonViewExtKt.getDp(24);
                                r0.j1(rightImageView5, str, (d) dVar.w(dp, dp));
                                PpTitleBar ppTitleBar4 = buyBundleHomePageActivity.f31751i;
                                if (ppTitleBar4 != null && (rightImageView3 = ppTitleBar4.getRightImageView2()) != null) {
                                    rightImageView3.setOnClickListener(new V(12, buyBundleHomePageActivity, commonBeanResult2));
                                }
                            }
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    buyBundleHomePageActivity.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    buyBundleHomePageActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((p) it3).f27360a;
                    C0525w c0525wF = C0525w.f();
                    ArrayList arrayList2 = (ArrayList) commonBeanResult3.data;
                    com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList2 != null ? arrayList2 : ""));
                } else if (it3 instanceof m) {
                    buyBundleHomePageActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    buyBundleHomePageActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    ((n) it3).getClass();
                    com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", "");
                }
                return Unit.f38893a;
            case 3:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof o)) {
                    if (it4 instanceof p) {
                        CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((p) it4).f27360a;
                        BillCommonConfigBean billCommonConfigBean = (BillCommonConfigBean) commonBeanResult4.data;
                        String serviceStatement = billCommonConfigBean != null ? billCommonConfigBean.getServiceStatement() : null;
                        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                        C0599o c0599o = (C0599o) buyBundleHomePageActivity.f27334c;
                        if (c0599o != null && (textView2 = c0599o.f8424B) != null) {
                            if (!commonBeanResult4.isSuccess() || serviceStatement == null || StringsKt.F(serviceStatement)) {
                                h.c(textView2);
                            } else {
                                textView2.setText(serviceStatement);
                                h.C(textView2);
                            }
                        }
                    } else if (!(it4 instanceof m)) {
                        if (!(it4 instanceof n)) {
                            throw new l();
                        }
                        ((n) it4).getClass();
                        KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                        C0599o c0599o2 = (C0599o) buyBundleHomePageActivity.f27334c;
                        if (c0599o2 != null && (textView = c0599o2.f8424B) != null) {
                            h.c(textView);
                        }
                    }
                }
                return Unit.f38893a;
            case 4:
                q it5 = (q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof o)) {
                    if (it5 instanceof p) {
                        QueryMobileWalletTypeByPhoneRsp queryMobileWalletTypeByPhoneRsp = (QueryMobileWalletTypeByPhoneRsp) ((p) it5).f27360a;
                        String str2 = (String) buyBundleHomePageActivity.f31749Y.get(buyBundleHomePageActivity.s());
                        if (!queryMobileWalletTypeByPhoneRsp.isSuccess() || queryMobileWalletTypeByPhoneRsp.operatorName == null) {
                            buyBundleHomePageActivity.v(StringUtils.null2Length0(str2));
                        } else {
                            buyBundleHomePageActivity.f31749Y.put(buyBundleHomePageActivity.s(), queryMobileWalletTypeByPhoneRsp.operatorName);
                            buyBundleHomePageActivity.v(queryMobileWalletTypeByPhoneRsp.operatorName);
                        }
                    } else if (!(it5 instanceof m)) {
                        if (!(it5 instanceof n)) {
                            throw new l();
                        }
                        ((n) it5).getClass();
                        buyBundleHomePageActivity.v(StringUtils.null2Length0((String) buyBundleHomePageActivity.f31749Y.get(buyBundleHomePageActivity.s())));
                    }
                }
                return Unit.f38893a;
            case 5:
                q it6 = (q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof o)) {
                    if (it6 instanceof p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((p) it6).f27360a;
                        if (commonListResultV2.isSuccess()) {
                            KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                            C0599o c0599o3 = (C0599o) buyBundleHomePageActivity.f27334c;
                            if (c0599o3 != null && (modelBillerBottomMenu = c0599o3.f8428c) != null) {
                                modelBillerBottomMenu.a(TransType.TRANS_TYPE_BUNDLE, commonListResultV2.data);
                            }
                        }
                    } else if (!(it6 instanceof m)) {
                        if (!(it6 instanceof n)) {
                            throw new l();
                        }
                        ((n) it6).getClass();
                    }
                }
                return Unit.f38893a;
            case 6:
                q it7 = (q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (!(it7 instanceof o)) {
                    if (it7 instanceof p) {
                        DataBundleMoreTipsResult dataBundleMoreTipsResult = (DataBundleMoreTipsResult) ((p) it7).f27360a;
                        String operatorId = dataBundleMoreTipsResult.getBillerName();
                        CommonBeanResult<DataBundleExtraItemInfo> response = dataBundleMoreTipsResult.getResponse();
                        DataBundleExtraItemInfo cacheData = response != null ? response.data : null;
                        if (response != null && response.isSuccess() && cacheData != null && operatorId != null && operatorId.length() != 0) {
                            C c6 = (C) buyBundleHomePageActivity.f31755p.getValue();
                            c6.getClass();
                            Intrinsics.checkNotNullParameter(operatorId, "operatorId");
                            Intrinsics.checkNotNullParameter(cacheData, "cacheData");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            DataBundleExtraItemInfo dataBundleExtraItemInfoD = c6.d(operatorId);
                            Iterable<DataBundleWalletItemTipsBean> bundleTips = dataBundleExtraItemInfoD != null ? dataBundleExtraItemInfoD.getBundleTips() : null;
                            if (bundleTips == null) {
                                bundleTips = z.f38935a;
                            }
                            for (DataBundleWalletItemTipsBean dataBundleWalletItemTipsBean : bundleTips) {
                                String paymentItemId = dataBundleWalletItemTipsBean.getPaymentItemId();
                                if (paymentItemId != null) {
                                    if (StringsKt.F(paymentItemId)) {
                                        paymentItemId = null;
                                    }
                                    if (paymentItemId != null) {
                                        linkedHashMap.put(paymentItemId, dataBundleWalletItemTipsBean);
                                    }
                                }
                            }
                            Iterable<DataBundleWalletItemTipsBean> bundleTips2 = cacheData.getBundleTips();
                            if (bundleTips2 == null) {
                                bundleTips2 = z.f38935a;
                            }
                            for (DataBundleWalletItemTipsBean dataBundleWalletItemTipsBean2 : bundleTips2) {
                                String paymentItemId2 = dataBundleWalletItemTipsBean2.getPaymentItemId();
                                if (paymentItemId2 != null) {
                                    if (StringsKt.F(paymentItemId2)) {
                                        paymentItemId2 = null;
                                    }
                                    if (paymentItemId2 != null) {
                                        linkedHashMap.put(paymentItemId2, dataBundleWalletItemTipsBean2);
                                    }
                                }
                            }
                            DataBundleExtraItemInfo dataBundleExtraItemInfo = new DataBundleExtraItemInfo();
                            dataBundleExtraItemInfo.setBundleTips(new ArrayList<>(linkedHashMap.values()));
                            Unit unit = Unit.f38893a;
                            c6.e(operatorId, dataBundleExtraItemInfo);
                        }
                    } else if (!(it7 instanceof m)) {
                        if (!(it7 instanceof n)) {
                            throw new l();
                        }
                        ((n) it7).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                q it8 = (q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof o)) {
                    if (it8 instanceof p) {
                        MobileWalletResp response2 = (MobileWalletResp) ((p) it8).f27360a;
                        if (response2.isSuccess()) {
                            BuyBundleHomePageActivity buyBundleHomePageActivity2 = this.f36262b;
                            Intrinsics.checkNotNullParameter(response2, "response");
                            ArrayList arrayList3 = buyBundleHomePageActivity2.f31758r0;
                            arrayList3.clear();
                            if (response2.isSuccess() && (arrayList = response2.data) != null && (!arrayList.isEmpty()) && (data = response2.data) != null) {
                                Intrinsics.checkNotNullExpressionValue(data, "data");
                                arrayList3.addAll(data);
                                C0599o c0599o4 = (C0599o) buyBundleHomePageActivity2.f27334c;
                                if (c0599o4 != null) {
                                    ModelMobileWithIconInputLayout.initModelMobileInputLayout$default(c0599o4.f8429d, buyBundleHomePageActivity2, arrayList3, buyBundleHomePageActivity2, BaseApplication.getCountryLocale(), null, null, null, buyBundleHomePageActivity2.isDarkMode(), HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, null);
                                }
                            }
                            String strS = buyBundleHomePageActivity2.s();
                            if (TextUtils.isEmpty(strS)) {
                                buyBundleHomePageActivity2.v("");
                            } else {
                                String str3 = (String) buyBundleHomePageActivity2.f31749Y.get(strS);
                                if (TextUtils.isEmpty(str3)) {
                                    ((DataBundleHomeViewModel) buyBundleHomePageActivity2.l()).i(strS);
                                } else {
                                    buyBundleHomePageActivity2.v(str3);
                                }
                            }
                        }
                    } else if (!(it8 instanceof m)) {
                        if (!(it8 instanceof n)) {
                            throw new l();
                        }
                        ((n) it8).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }

    public i(BuyBundleHomePageActivity buyBundleHomePageActivity, BuyBundleHomePageActivity buyBundleHomePageActivity2) {
        this.f36261a = 4;
        this.f36262b = buyBundleHomePageActivity2;
    }
}
