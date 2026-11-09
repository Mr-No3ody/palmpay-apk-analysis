package p141j9;

import C0.G;
import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Rd.H;
import Rd.l0;
import Rf.g;
import V8.p;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.bean.AirtimeExtraItemInfoBean;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeDownTimeOrderUpdateRsp;
import com.transsnet.palmpay.airtime.bean.rsp.DowntimeOrderListBean;
import com.transsnet.palmpay.airtime.bean.rsp.GroupPurchaseItem;
import com.transsnet.palmpay.airtime.bean.rsp.GroupPurchaseRsp;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.view.GroupPurchaseAvatarLayout;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeGoupPurchaseSaleView;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.rsp.BillerRenewalBodyBean;
import com.transsnet.palmpay.core.bean.rsp.QueryMobileWalletTypeByPhoneRsp;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.teller.bean.resp.BillCommonConfigBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.teller.ui.dialog.BillerRenewalItemDialog;
import com.transsnet.palmpay.teller.ui.view.ModelBillerBottomMenu;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.chromium.support_lib_boundary.util.b;
import p025ba.k;
import p155k9.f;
import p202n9.e;
import p220oa.h;
import p355xf.l;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38367b;

    public /* synthetic */ C(TopupAirtimeActivity topupAirtimeActivity, int i7) {
        this.f38366a = i7;
        this.f38367b = topupAirtimeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long total;
        List<AirtimeDownTimeOrderUpdateRsp.AirtimeDownTimeOrderUpdate> list;
        T t;
        PpAmountEditText ppAmountEditText;
        List<GroupPurchaseItem> list2;
        TextView textView;
        TextView textView2;
        ModelBillerBottomMenu modelBillerBottomMenu;
        TopupAirtimeActivity topupAirtimeActivity = this.f38367b;
        switch (this.f38366a) {
            case 0:
                CommonBeanResult rsp = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                int i7 = TopupAirtimeActivity.f26495x0;
                if (topupAirtimeActivity.w()) {
                    BillerRenewalItemDialog billerRenewalItemDialog = new BillerRenewalItemDialog(topupAirtimeActivity);
                    billerRenewalItemDialog.setData((BillerRenewalBodyBean) rsp.data);
                    billerRenewalItemDialog.setOnConfirmClickListener(new p(topupAirtimeActivity, rsp, 1));
                    billerRenewalItemDialog.show();
                }
                return Unit.f38893a;
            case 1:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                int i10 = TopupAirtimeActivity.f26495x0;
                if (topupAirtimeActivity.w()) {
                    SingleAdView singleAdView = (SingleAdView) view.findViewById(c.atu_banner_ads_view);
                    b.c(singleAdView);
                    singleAdView.setSlotId(topupAirtimeActivity.getString(k.airtime_home_bottom_slot_id));
                }
                return Unit.f38893a;
            case 2:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        Object obj2 = commonBeanResult.data;
                        topupAirtimeActivity.f26514s0 = (BillerCouponRetentionBean) (commonBeanResult.isSuccess() ? obj2 : null);
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ((n) it).getClass();
                        topupAirtimeActivity.f26514s0 = null;
                    }
                }
                return Unit.f38893a;
            case 3:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryMobileWalletTypeByPhoneRsp queryMobileWalletTypeByPhoneRsp = (QueryMobileWalletTypeByPhoneRsp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (queryMobileWalletTypeByPhoneRsp.isSuccess()) {
                            String str = queryMobileWalletTypeByPhoneRsp.operatorName;
                            int i11 = TopupAirtimeActivity.f26495x0;
                            topupAirtimeActivity.D(str);
                        } else {
                            int i12 = TopupAirtimeActivity.f26495x0;
                            topupAirtimeActivity.D("");
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        ((n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            case 4:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (commonBeanResult2.isSuccess() && commonBeanResult2.data != 0) {
                            topupAirtimeActivity.f26519w.clear();
                            DowntimeOrderListBean downtimeOrderListBean = (DowntimeOrderListBean) commonBeanResult2.data;
                            ArrayList arrayList = topupAirtimeActivity.f26519w;
                            if (downtimeOrderListBean != null && (list = downtimeOrderListBean.getList()) != null) {
                                arrayList.addAll(list);
                            }
                            DowntimeOrderListBean downtimeOrderListBean2 = (DowntimeOrderListBean) commonBeanResult2.data;
                            if (((downtimeOrderListBean2 == null || (total = downtimeOrderListBean2.getTotal()) == null) ? 0L : total.longValue()) > 0) {
                                H h7 = (H) topupAirtimeActivity.f27334c;
                                if ((h7 != null ? h7.t.getParent() : null) != null) {
                                    H h10 = (H) topupAirtimeActivity.f27334c;
                                    View viewInflate = h10 != null ? h10.t.inflate() : null;
                                    topupAirtimeActivity.f26499H = viewInflate;
                                    if (viewInflate != null) {
                                        viewInflate.setOnClickListener(new y(topupAirtimeActivity, 2));
                                    }
                                }
                                View view2 = topupAirtimeActivity.f26499H;
                                TextView textView3 = view2 != null ? (TextView) view2.findViewById(c.tv_downtime_order_number) : null;
                                SpannableStringBuilder spannableStringBuilderCreate = G.i("You have ").setFontSize(SizeUtils.dp2px(12.0f)).append(String.valueOf(arrayList != null ? Integer.valueOf(arrayList.size()) : null)).setFontFamily("sans-serif-medium").setFontSize(SizeUtils.dp2px(14.0f)).append(" booked transactions in progress").setFontSize(SizeUtils.dp2px(12.0f)).create();
                                if (textView3 != null) {
                                    textView3.setText(spannableStringBuilderCreate);
                                }
                            }
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                        ((n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            case 5:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof o) {
                    topupAirtimeActivity.showLoadingDialog(true, true);
                } else if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                    topupAirtimeActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                    C0525w c0525wF = C0525w.f();
                    ArrayList arrayList2 = (ArrayList) commonBeanResult3.data;
                    d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList2 != null ? arrayList2 : ""));
                } else if (it4 instanceof m) {
                    topupAirtimeActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof n)) {
                        throw new l();
                    }
                    topupAirtimeActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it4).f27358a, new Object[0]);
                    ((n) it4).getClass();
                    d.G("/main/trans_history", "");
                }
                return Unit.f38893a;
            case 6:
                q it5 = (q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        if (commonBeanResult4.isSuccess() && (t = commonBeanResult4.data) != 0 && !TextUtils.isEmpty(((AirtimeExtraItemInfoBean) t).getBillerId())) {
                            String billerId = ((AirtimeExtraItemInfoBean) commonBeanResult4.data).getBillerId();
                            QueryAirtimeV2Rsp.DataBean dataBean = topupAirtimeActivity.f26505Z;
                            if (y.h(billerId, dataBean != null ? dataBean.getNetwork() : null, true)) {
                                LinkedHashMap linkedHashMap = topupAirtimeActivity.f26496A;
                                String billerId2 = ((AirtimeExtraItemInfoBean) commonBeanResult4.data).getBillerId();
                                Intrinsics.e(billerId2);
                                linkedHashMap.put(billerId2, commonBeanResult4.data);
                                f fVar = topupAirtimeActivity.f26500L;
                                if (fVar != null) {
                                    fVar.g(((AirtimeExtraItemInfoBean) commonBeanResult4.data).getAirtimeCustomizedSpotVO(), ((AirtimeExtraItemInfoBean) commonBeanResult4.data).getItemTipsList());
                                }
                                AirtimeExtraItemInfoBean airtimeExtraItemInfoBean = (AirtimeExtraItemInfoBean) commonBeanResult4.data;
                                Long lastRechargeAmount = airtimeExtraItemInfoBean != null ? airtimeExtraItemInfoBean.getLastRechargeAmount() : null;
                                if (lastRechargeAmount != null && new g(topupAirtimeActivity.t(), topupAirtimeActivity.s()).a(lastRechargeAmount.longValue())) {
                                    PpAmountEditText ppAmountEditText2 = topupAirtimeActivity.f26507j;
                                    if ((ppAmountEditText2 != null ? ppAmountEditText2.getLongAmount() : 0L) <= 0) {
                                        long jLongValue = lastRechargeAmount.longValue();
                                        topupAirtimeActivity.f26502Q = jLongValue;
                                        if (jLongValue > 0 && (ppAmountEditText = topupAirtimeActivity.f26507j) != null) {
                                            ppAmountEditText.setAmount(r0.n0(jLongValue));
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!(it5 instanceof m)) {
                        if (!(it5 instanceof n)) {
                            throw new l();
                        }
                        ((n) it5).getClass();
                    }
                }
                return Unit.f38893a;
            case 7:
                q it6 = (q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof o)) {
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult5 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it6).f27360a;
                        if (commonBeanResult5.isSuccess()) {
                            GroupPurchaseRsp groupPurchaseRsp = (GroupPurchaseRsp) commonBeanResult5.data;
                            int size = (groupPurchaseRsp == null || (list2 = groupPurchaseRsp.getList()) == null) ? 0 : list2.size();
                            t tVar = topupAirtimeActivity.t;
                            if (size > 0) {
                                ModelAirtimeGoupPurchaseSaleView modelAirtimeGoupPurchaseSaleView = (ModelAirtimeGoupPurchaseSaleView) tVar.getValue();
                                if (modelAirtimeGoupPurchaseSaleView != null) {
                                    GroupPurchaseRsp groupPurchaseRsp2 = (GroupPurchaseRsp) commonBeanResult5.data;
                                    boolean zIsDarkMode = topupAirtimeActivity.isDarkMode();
                                    D onItemClick = new D(topupAirtimeActivity);
                                    Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
                                    l0 l0Var = modelAirtimeGoupPurchaseSaleView.f26603c;
                                    if (l0Var != null) {
                                        List<GroupPurchaseItem> list3 = groupPurchaseRsp2 != null ? groupPurchaseRsp2.getList() : null;
                                        List<GroupPurchaseItem> list4 = list3;
                                        if (list4 == null || list4.isEmpty()) {
                                            h.s(modelAirtimeGoupPurchaseSaleView, false);
                                        } else {
                                            if (TextUtils.isEmpty(groupPurchaseRsp2 != null ? groupPurchaseRsp2.getLink() : null)) {
                                                IconicsImageView ivArrowRight = l0Var.ivArrowRight;
                                                Intrinsics.checkNotNullExpressionValue(ivArrowRight, "ivArrowRight");
                                                h.s(ivArrowRight, false);
                                                TextView moreTv = l0Var.moreTv;
                                                Intrinsics.checkNotNullExpressionValue(moreTv, "moreTv");
                                                h.s(moreTv, false);
                                            } else {
                                                p054dd.n nVar = new p054dd.n(19, modelAirtimeGoupPurchaseSaleView, groupPurchaseRsp2);
                                                l0Var.ivArrowRight.setOnClickListener(nVar);
                                                l0Var.moreTv.setOnClickListener(nVar);
                                                IconicsImageView ivArrowRight2 = l0Var.ivArrowRight;
                                                Intrinsics.checkNotNullExpressionValue(ivArrowRight2, "ivArrowRight");
                                                h.s(ivArrowRight2, true);
                                                TextView moreTv2 = l0Var.moreTv;
                                                Intrinsics.checkNotNullExpressionValue(moreTv2, "moreTv");
                                                h.s(moreTv2, true);
                                            }
                                            GroupPurchaseItem groupPurchaseItem = (GroupPurchaseItem) CollectionsKt.G(0, list3);
                                            ConstraintLayout firstCl = l0Var.firstCl;
                                            Intrinsics.checkNotNullExpressionValue(firstCl, "firstCl");
                                            GroupPurchaseAvatarLayout avaterLl = l0Var.avaterLl;
                                            Intrinsics.checkNotNullExpressionValue(avaterLl, "avaterLl");
                                            TextView itemName = l0Var.itemName;
                                            Intrinsics.checkNotNullExpressionValue(itemName, "itemName");
                                            TextView itemPriceValue = l0Var.itemPriceValue;
                                            Intrinsics.checkNotNullExpressionValue(itemPriceValue, "itemPriceValue");
                                            ModelAirtimeGoupPurchaseSaleView.c(new e(firstCl, avaterLl, itemName, itemPriceValue), groupPurchaseItem, onItemClick);
                                            n0.g().u(new ViewEvent("AirtimeGoupPurchaseSale").add("activityId", groupPurchaseItem != null ? groupPurchaseItem.getActivityId() : null));
                                            if (list3.size() > 1) {
                                                ConstraintLayout constraintLayout = l0Var.secCl;
                                                if (constraintLayout != null) {
                                                    h.s(constraintLayout, true);
                                                }
                                                ConstraintLayout constraintLayout2 = l0Var.secPlaceholderCl;
                                                if (constraintLayout2 != null) {
                                                    h.s(constraintLayout2, false);
                                                }
                                                GroupPurchaseItem groupPurchaseItem2 = (GroupPurchaseItem) CollectionsKt.G(1, list3);
                                                ConstraintLayout secCl = l0Var.secCl;
                                                Intrinsics.checkNotNullExpressionValue(secCl, "secCl");
                                                GroupPurchaseAvatarLayout avaterSecondLl = l0Var.avaterSecondLl;
                                                Intrinsics.checkNotNullExpressionValue(avaterSecondLl, "avaterSecondLl");
                                                TextView itemSecondName = l0Var.itemSecondName;
                                                Intrinsics.checkNotNullExpressionValue(itemSecondName, "itemSecondName");
                                                TextView itemSecondPriceValue = l0Var.itemSecondPriceValue;
                                                Intrinsics.checkNotNullExpressionValue(itemSecondPriceValue, "itemSecondPriceValue");
                                                ModelAirtimeGoupPurchaseSaleView.c(new e(secCl, avaterSecondLl, itemSecondName, itemSecondPriceValue), groupPurchaseItem2, onItemClick);
                                                n0.g().u(new ViewEvent("AirtimeGoupPurchaseSale").add("activityId", groupPurchaseItem2 != null ? groupPurchaseItem2.getActivityId() : null));
                                            } else {
                                                ConstraintLayout constraintLayout3 = l0Var.secCl;
                                                if (constraintLayout3 != null) {
                                                    h.s(constraintLayout3, false);
                                                }
                                                ConstraintLayout constraintLayout4 = l0Var.secPlaceholderCl;
                                                if (constraintLayout4 != null) {
                                                    h.s(constraintLayout4, true);
                                                }
                                                r0.l1(r0.y0(zIsDarkMode ? "airtime_group_purchase_item_default_dark.png" : "airtime_group_purchase_item_default.png"), l0Var.secPlaceholderIv);
                                                n0.g().q(new ViewEvent("AirtimeGoupPurchaseSaleHome"));
                                                ImageView imageView = l0Var.secPlaceholderIv;
                                                if (imageView != null) {
                                                    imageView.setOnClickListener(new p054dd.d(25));
                                                }
                                            }
                                            h.s(modelAirtimeGoupPurchaseSaleView, true);
                                        }
                                    }
                                }
                            } else {
                                ModelAirtimeGoupPurchaseSaleView modelAirtimeGoupPurchaseSaleView2 = (ModelAirtimeGoupPurchaseSaleView) tVar.getValue();
                                if (modelAirtimeGoupPurchaseSaleView2 != null) {
                                    h.s(modelAirtimeGoupPurchaseSaleView2, false);
                                }
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
            case 8:
                q it7 = (q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (!(it7 instanceof o)) {
                    if (it7 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult6 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it7).f27360a;
                        BillCommonConfigBean billCommonConfigBean = (BillCommonConfigBean) commonBeanResult6.data;
                        String serviceStatement = billCommonConfigBean != null ? billCommonConfigBean.getServiceStatement() : null;
                        int i13 = TopupAirtimeActivity.f26495x0;
                        H h11 = (H) topupAirtimeActivity.f27334c;
                        if (h11 != null && (textView2 = h11.f8056A) != null) {
                            if (!commonBeanResult6.isSuccess() || serviceStatement == null || StringsKt.F(serviceStatement)) {
                                h.c(textView2);
                            } else {
                                textView2.setText(serviceStatement);
                                h.C(textView2);
                            }
                        }
                    } else if (!(it7 instanceof m)) {
                        if (!(it7 instanceof n)) {
                            throw new l();
                        }
                        ((n) it7).getClass();
                        int i14 = TopupAirtimeActivity.f26495x0;
                        H h12 = (H) topupAirtimeActivity.f27334c;
                        if (h12 != null && (textView = h12.f8056A) != null) {
                            h.c(textView);
                        }
                    }
                }
                return Unit.f38893a;
            case 9:
                q it8 = (q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof o)) {
                    if (it8 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryAirtimeV2Rsp queryAirtimeV2Rsp = (QueryAirtimeV2Rsp) ((com.transsnet.palmpay.core.base.p) it8).f27360a;
                        if (queryAirtimeV2Rsp.isSuccess()) {
                            List<QueryAirtimeV2Rsp.DataBean> data = queryAirtimeV2Rsp.getData();
                            int i15 = TopupAirtimeActivity.f26495x0;
                            TopupAirtimeActivity topupAirtimeActivity2 = this.f38367b;
                            if (data != null) {
                                List<QueryAirtimeV2Rsp.DataBean> list5 = !data.isEmpty() ? data : null;
                                if (list5 != null) {
                                    H h13 = (H) topupAirtimeActivity2.f27334c;
                                    if (h13 != null) {
                                        ModelMobileWithIconInputLayout.initModelMobileInputLayout$default(h13.f8066g, topupAirtimeActivity2, list5, topupAirtimeActivity2.f26520w0, BaseApplication.getCountryLocale(), null, null, null, topupAirtimeActivity2.isDarkMode(), HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, null);
                                    }
                                    topupAirtimeActivity2.f26497B = list5;
                                    if (TextUtils.isEmpty(topupAirtimeActivity2.u())) {
                                        H h14 = (H) topupAirtimeActivity2.f27334c;
                                        if (h14 != null) {
                                            h14.f8066g.updateSelectItem(list5.get(0));
                                        }
                                        topupAirtimeActivity2.y(list5.get(0));
                                    } else {
                                        topupAirtimeActivity2.A(topupAirtimeActivity2.u());
                                    }
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
            default:
                q it9 = (q) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!(it9 instanceof o)) {
                    if (it9 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it9).f27360a;
                        if (commonListResultV2.isSuccess()) {
                            int i16 = TopupAirtimeActivity.f26495x0;
                            H h15 = (H) topupAirtimeActivity.f27334c;
                            if (h15 != null && (modelBillerBottomMenu = h15.f8070p) != null) {
                                modelBillerBottomMenu.a("04", commonListResultV2.data);
                            }
                        }
                    } else if (!(it9 instanceof m)) {
                        if (!(it9 instanceof n)) {
                            throw new l();
                        }
                        ((n) it9).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }

    public /* synthetic */ C(TopupAirtimeActivity topupAirtimeActivity, TopupAirtimeActivity topupAirtimeActivity2, int i7) {
        this.f38366a = i7;
        this.f38367b = topupAirtimeActivity2;
    }
}
