package com.transsnet.palmpay.airtime.ui;

import Ed.ViewOnTouchListenerC0223c;
import Gd.e;
import N8.q0;
import O6.c;
import O6.d;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Rd.H;
import Wf.AbstractC0780y;
import Zd.C0803h;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.camera.camera2.internal.P0;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.provider.m;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.bean.AirtimeExtraItemInfoBean;
import com.transsnet.palmpay.airtime.bean.AirtimeItemsBean;
import com.transsnet.palmpay.airtime.bean.AirtimeSpecialRechargeItem;
import com.transsnet.palmpay.airtime.bean.BaseAirtimeItemsBean;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.bean.req.AirtimeOrderAddReq;
import com.transsnet.palmpay.airtime.bean.req.GroupPurchaseReq;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeCashbackInfoDataBean;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeDownTimeOrderUpdateRsp;
import com.transsnet.palmpay.airtime.bean.rsp.FlashSalesProductsDataBean;
import com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleItemBean;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleProductBean;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.viewmodel.DataBundleRecordHistoryViewModel;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.teller.bean.DataBundleParams;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.teller.ui.view.ModelBillerBottomMenu;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtil;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.annotation.MustBeDocumented;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.B;
import o9.C1906k;
import o9.C1907l;
import o9.C1908m;
import o9.C1911p;
import o9.C1912q;
import o9.C1913s;
import o9.F;
import o9.r;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p051d9.C1624v;
import p054dd.q;
import p141j9.A;
import p141j9.C;
import p141j9.E;
import p141j9.w;
import p141j9.x;
import p141j9.y;
import p155k9.f;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p220oa.h;
import p310ub.C2085k0;
import p355xf.C2131j;
import p355xf.t;
import p371yf.b;

/* JADX INFO: loaded from: classes3.dex */
@Route(deeplink = "palmpay://com.transsnet.palmpay.link?pageId=9&extra_id=213123123&channel=chuanyin1&af_force_deeplink=true", image = "https://static.chuanyinet.com/palmpayAppIcon/airtimehome_screen.png", name = "话费/Home", path = "/airtime/top_up_airtime", remark = "话费的首页")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\f\rB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/TopupAirtimeActivity;", "Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/AirTimeTopupViewModel;", "LRd/H;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "OrderStyle", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTopupAirtimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopupAirtimeActivity.kt\ncom/transsnet/palmpay/airtime/ui/TopupAirtimeActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1936:1\n75#2,13:1937\n115#3,8:1950\n145#3:1958\n152#3:1959\n169#3:1960\n171#3,12:1961\n215#3:1973\n383#3:1974\n401#3:1975\n115#3,8:1976\n145#3:1984\n152#3:1985\n169#3:1986\n115#3,8:1987\n145#3:1995\n152#3:1996\n169#3:1997\n171#3,12:1998\n215#3:2010\n260#3,10:2011\n296#3:2021\n260#3,10:2022\n296#3:2032\n295#4,2:2033\n1761#4,3:2045\n1761#4,3:2049\n1788#4,4:2052\n1563#4:2056\n1634#4,3:2057\n562#5,10:2035\n1#6:2048\n*S KotlinDebug\n*F\n+ 1 TopupAirtimeActivity.kt\ncom/transsnet/palmpay/airtime/ui/TopupAirtimeActivity\n*L\n207#1:1937,13\n393#1:1950,8\n393#1:1958\n404#1:1959\n404#1:1960\n421#1:1961,12\n421#1:1973\n470#1:1974\n470#1:1975\n546#1:1976,8\n546#1:1984\n553#1:1985\n553#1:1986\n560#1:1987,8\n560#1:1995\n572#1:1996\n572#1:1997\n731#1:1998,12\n731#1:2010\n747#1:2011,10\n747#1:2021\n785#1:2022,10\n785#1:2032\n951#1:2033,2\n1192#1:2045,3\n1203#1:2049,3\n1467#1:2052,4\n455#1:2056\n455#1:2057,3\n1051#1:2035,10\n*E\n"})
public final class TopupAirtimeActivity extends BaseBillerActivity<AirTimeTopupViewModel, H> implements CancelAdapt {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f26495x0 = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ModelActivityBannerWithCoupon f26498C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View f26499H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public f f26500L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public User f26501M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f26502Q;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public QueryAirtimeV2Rsp.DataBean f26505Z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f26506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PpAmountEditText f26507j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public FlashSalesProductsDataBean f26508k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f26509o;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BillerCouponRetentionBean f26514s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f26515t0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f26510p = C2131j.b(new A(this, 1));
    public final t t = C2131j.b(new A(this, 2));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f26517v = C2131j.b(new A(this, 3));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f26519w = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinkedHashMap f26496A = new LinkedHashMap();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f26497B = new ArrayList();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f26503X = "";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final b0 f26504Y = new b0(G.a(DataBundleRecordHistoryViewModel.class), new p141j9.G(this, 1), new p141j9.G(this, 0), new p141j9.G(this, 2));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f26511p0 = "";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f26512q0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f26513r0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public List f26516u0 = new ArrayList();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final y f26518v0 = new y(this, 5);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final E f26520w0 = new E(this);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/TopupAirtimeActivity$OrderStyle;", "", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Documented
    public @interface OrderStyle {
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static /* synthetic */ void G(TopupAirtimeActivity topupAirtimeActivity, int i7, String str, int i10) {
        if ((i10 & 1) != 0) {
            i7 = 1;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        topupAirtimeActivity.F(i7, str);
    }

    public static boolean x(String str, QueryAirtimeV2Rsp.DataBean dataBean) {
        if (!kotlin.text.y.h(str, dataBean != null ? dataBean.getNetwork() : null, true)) {
            if (!kotlin.text.y.h(str, dataBean != null ? dataBean.getName() : null, true)) {
                if (!kotlin.text.y.h(str, dataBean != null ? dataBean.getBillerId() : null, true)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A(String str) {
        if (TextUtils.isEmpty(str) || !BaseApplication.hasLogin()) {
            D("");
            return;
        }
        AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strB = Pa.H.b(C0.G.o("queryMobileWalletTypeByPhone", str));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        AbstractC0780y.m(V.h(airTimeTopupViewModel), null, null, new F(airTimeTopupViewModel.f26615B, C0.G.p("Pref_", strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void B(HighlyRecommendDataBundleItemBean highlyRecommendDataBundleItemBean) {
        HighlyRecommendDataBundleProductBean highlyRecommendDataBundleProductBean = highlyRecommendDataBundleItemBean.item;
        if (highlyRecommendDataBundleProductBean == null) {
            return;
        }
        DataBundleWalletItemBean dataBundleWalletItemBean = new DataBundleWalletItemBean();
        dataBundleWalletItemBean.setValidity(highlyRecommendDataBundleProductBean.validity);
        dataBundleWalletItemBean.setBillerName(highlyRecommendDataBundleItemBean.billerName);
        dataBundleWalletItemBean.setBillerId(highlyRecommendDataBundleItemBean.billerId);
        dataBundleWalletItemBean.setCategoryId(AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE);
        dataBundleWalletItemBean.setItemId(highlyRecommendDataBundleProductBean.itemId);
        dataBundleWalletItemBean.setItemName(highlyRecommendDataBundleProductBean.itemName);
        dataBundleWalletItemBean.setDescription(highlyRecommendDataBundleProductBean.description);
        long j6 = highlyRecommendDataBundleProductBean.businessPrice;
        if (j6 == null) {
            j6 = 0L;
        }
        dataBundleWalletItemBean.setPrice(j6);
        QueryAirtimeV2Rsp.DataBean dataBean = this.f26505Z;
        dataBundleWalletItemBean.setInstitutionLogo(dataBean != null ? dataBean.getLogo() : null);
        dataBundleWalletItemBean.setVolume(highlyRecommendDataBundleProductBean.volume);
        dataBundleWalletItemBean.setVolumeUnit(highlyRecommendDataBundleProductBean.volumeUnit);
        p(dataBundleWalletItemBean, u(), dataBundleWalletItemBean.getPrice(), true);
    }

    public final void C() {
        DailyFlashSalesView dailyFlashSalesView;
        this.f26508k0 = null;
        H h7 = (H) this.f27334c;
        if (h7 == null || (dailyFlashSalesView = h7.f8057B) == null) {
            return;
        }
        dailyFlashSalesView.setSelectedPosition(-1);
    }

    public final void D(String str) {
        if (str == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = SPUtils.get().getString("TOP_UP_AIRTIME_SELECTED_MOBILE_OPERATOR_CODE");
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        } else {
            QueryAirtimeV2Rsp.DataBean dataBean = this.f26505Z;
            if (dataBean != null && x(str, dataBean)) {
                return;
            }
        }
        List list = this.f26497B;
        QueryAirtimeV2Rsp.DataBean dataBean2 = null;
        if (list != null && !list.isEmpty()) {
            if (TextUtils.isEmpty(str)) {
                dataBean2 = (QueryAirtimeV2Rsp.DataBean) this.f26497B.get(0);
            } else {
                int size = this.f26497B.size();
                for (int i7 = 0; i7 < size; i7++) {
                    QueryAirtimeV2Rsp.DataBean dataBean3 = (QueryAirtimeV2Rsp.DataBean) this.f26497B.get(i7);
                    if (dataBean3 != null) {
                        if (dataBean2 == null) {
                            dataBean3.setIndexInList(Integer.valueOf(i7));
                            dataBean2 = dataBean3;
                        }
                        if (x(str == null ? "" : str, dataBean3)) {
                            dataBean3.setIndexInList(Integer.valueOf(i7));
                            dataBean2 = dataBean3;
                            break;
                        }
                    }
                }
            }
        }
        if (dataBean2 != null) {
            H h7 = (H) this.f27334c;
            if (h7 != null) {
                h7.f8066g.updateSelectItem(dataBean2);
            }
            y(dataBean2);
        }
    }

    public final void E(String str) {
        if (!TextUtils.isEmpty(str)) {
            KeyboardUtils.hideSoftInput(this);
        }
        PpAmountEditText ppAmountEditText = this.f26507j;
        if (ppAmountEditText != null) {
            ppAmountEditText.setError(str);
        }
    }

    public final void F(int i7, String str) {
        H h7 = (H) this.f27334c;
        String strL0 = r0.L0(h7 != null ? h7.f8066g.getPhoneNumber() : null);
        ArrayList arrayList = this.f26519w;
        int i10 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((AirtimeDownTimeOrderUpdateRsp.AirtimeDownTimeOrderUpdate) it.next()).getPhone(), strL0) && (i10 = i10 + 1) < 0) {
                    C1850q.j();
                    throw null;
                }
            }
        }
        if (i7 != 3 || i10 <= 0) {
            H(i7, str);
            return;
        }
        c cVar = new c(this);
        cVar.f6596b = d.f(getString(Pd.f.qt_airtime_down_time_number_tips_title, String.valueOf(i10)));
        cVar.b(Pd.f.qt_airtime_down_time_number_tips_msg);
        String string = getString(k.core_view);
        y yVar = new y(this, 3);
        cVar.f6600f = string;
        cVar.f6602h = yVar;
        cVar.c(k.core_book_again, new e(this, i7, str, 3));
        cVar.g();
    }

    public final void H(int i7, String str) {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        H h7 = (H) this.f27334c;
        String phoneNumber = (h7 == null || (modelMobileWithIconInputLayout = h7.f8066g) == null) ? null : modelMobileWithIconInputLayout.getPhoneNumber();
        AirtimeOrderAddReq airtimeOrderAddReq = new AirtimeOrderAddReq();
        airtimeOrderAddReq.amount = this.f26502Q;
        if (str == null) {
            str = "";
        }
        airtimeOrderAddReq.itemId = str;
        FlashSalesProductsDataBean flashSalesProductsDataBean = this.f26508k0;
        if (flashSalesProductsDataBean != null) {
            airtimeOrderAddReq.productId = flashSalesProductsDataBean != null ? flashSalesProductsDataBean.f26452id : 0L;
            airtimeOrderAddReq.transType = TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY;
        } else {
            airtimeOrderAddReq.transType = "04";
        }
        if (i7 == 3) {
            airtimeOrderAddReq.orderType = "03";
        }
        QueryAirtimeV2Rsp.DataBean dataBean = this.f26505Z;
        airtimeOrderAddReq.billerName = dataBean != null ? dataBean.getName() : null;
        QueryAirtimeV2Rsp.DataBean dataBean2 = this.f26505Z;
        airtimeOrderAddReq.network = dataBean2 != null ? dataBean2.getNetwork() : null;
        airtimeOrderAddReq.phone = r0.v0(r0.L0(phoneNumber));
        QueryAirtimeV2Rsp.DataBean dataBean3 = this.f26505Z;
        airtimeOrderAddReq.icon = dataBean3 != null ? dataBean3.getLogo() : null;
        airtimeOrderAddReq.appointment = i7 == 3 ? 1 : 0;
        r(airtimeOrderAddReq, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.transsnet.palmpay.core.base.l] */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.transsnet.palmpay.core.base.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68 */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() throws Throwable {
        ?? r3;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        AppCompatAutoCompleteTextView phoneNumberEdit;
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        l lVar5;
        l lVar6;
        l lVar7;
        l lVar8;
        int i7 = 24;
        int i10 = 3;
        int i11 = 5;
        int i12 = 2;
        int i13 = 1;
        int i14 = 4;
        int i15 = 8;
        this.f26501M = BaseApplication.getInstance().getUserDataSource().b();
        AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) l();
        Throwable th = null;
        l lVar9 = airTimeTopupViewModel != null ? airTimeTopupViewModel.f26628j : null;
        if (lVar9 != null) {
            lVar9.e(this, new q(new C(this, i12), 8));
        }
        AirTimeTopupViewModel airTimeTopupViewModel2 = (AirTimeTopupViewModel) l();
        l lVar10 = airTimeTopupViewModel2 != null ? airTimeTopupViewModel2.f26629o : null;
        if (lVar10 != null) {
            lVar10.e(this, new q(new C(this, i15), 8));
        }
        AirTimeTopupViewModel airTimeTopupViewModel3 = (AirTimeTopupViewModel) l();
        l lVar11 = airTimeTopupViewModel3 != null ? airTimeTopupViewModel3.f26617H : null;
        if (lVar11 != null) {
            lVar11.e(this, new q(new C(this, i11), 8));
        }
        String str = "mUser";
        if (TextUtils.isEmpty(this.f26513r0)) {
            th = null;
            str = "mUser";
            if (!TextUtils.isEmpty(this.f26512q0)) {
                User user = this.f26501M;
                if (user == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                String phoneNumber = user.getPhoneNumber();
                if (phoneNumber != null) {
                    AirTimeTopupViewModel airTimeTopupViewModel4 = (AirTimeTopupViewModel) l();
                    if (airTimeTopupViewModel4 != null) {
                        airTimeTopupViewModel4.g(phoneNumber, this.f26512q0);
                    }
                    this.f26513r0 = "";
                    this.f26512q0 = "";
                }
            }
        } else {
            User user2 = this.f26501M;
            if (user2 == null) {
                Intrinsics.n("mUser");
                throw null;
            }
            String phone = user2.getPhoneNumber();
            if (phone != null) {
                AirTimeTopupViewModel airTimeTopupViewModel5 = (AirTimeTopupViewModel) l();
                if (airTimeTopupViewModel5 != null) {
                    String code = this.f26513r0;
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    Intrinsics.checkNotNullParameter(code, "code");
                    o9.C c6 = new o9.C(phone, code, null);
                    l lVar12 = airTimeTopupViewModel5.f26619M;
                    lVar12.f27356m = phone;
                    Unit unit = Unit.f38893a;
                    p140j8.f.v(airTimeTopupViewModel5, c6, lVar12, 0L);
                }
                this.f26513r0 = "";
                this.f26512q0 = "";
            } else {
                th = null;
                str = "mUser";
            }
        }
        ((DataBundleRecordHistoryViewModel) this.f26504Y.getValue()).f28220e.e(this, new C0803h(this, i14));
        AirTimeTopupViewModel airTimeTopupViewModel6 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel6 != null) {
            lVar8 = airTimeTopupViewModel6.f26620Q;
        } else {
            r3 = th;
        }
        if (r3 != 0) {
            r3 = lVar8;
            r3.e(this, new q(new p141j9.t(r3, this, i12), 8));
        }
        r3 = lVar8;
        AirTimeTopupViewModel airTimeTopupViewModel7 = (AirTimeTopupViewModel) l();
        n.B(this, airTimeTopupViewModel7 != null ? airTimeTopupViewModel7.f26616C : th, this, new x(this, i12), new C1624v(27), true, null, 224);
        AirTimeTopupViewModel airTimeTopupViewModel8 = (AirTimeTopupViewModel) l();
        n.B(this, airTimeTopupViewModel8 != null ? airTimeTopupViewModel8.f26619M : th, this, new x(this, i10), new C1624v(28), true, null, 224);
        AirTimeTopupViewModel airTimeTopupViewModel9 = (AirTimeTopupViewModel) l();
        n.B(this, airTimeTopupViewModel9 != null ? airTimeTopupViewModel9.f26621X : th, this, new Ab.y(i7), new C1624v(29), false, null, 224);
        AirTimeTopupViewModel airTimeTopupViewModel10 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel10 != null) {
            lVar7 = airTimeTopupViewModel10.f26615B;
        } else {
            r10 = th;
        }
        if (r10 != 0) {
            r10 = lVar7;
            r10.e(this, new q(new C(this, i10), 8));
        }
        r10 = lVar7;
        AirTimeTopupViewModel airTimeTopupViewModel11 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel11 != null) {
            lVar6 = airTimeTopupViewModel11.f26614A;
        } else {
            r11 = th;
        }
        if (r11 != 0) {
            r11 = lVar6;
            r11.e(this, new q(new C(this, 9), 8));
        }
        r11 = lVar6;
        AirTimeTopupViewModel airTimeTopupViewModel12 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel12 != null) {
            lVar5 = airTimeTopupViewModel12.f26626g;
        } else {
            r12 = th;
        }
        if (r12 != 0) {
            r12 = lVar5;
            r12.e(this, new q(new C(this, i14), 8));
        }
        r12 = lVar5;
        AirTimeTopupViewModel airTimeTopupViewModel13 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel13 != null) {
            lVar4 = airTimeTopupViewModel13.f26627i;
        } else {
            r13 = th;
        }
        if (r13 != 0) {
            r13 = lVar4;
            r13.e(this, new q(new C(this, 10), 8));
        }
        r13 = lVar4;
        AirTimeTopupViewModel airTimeTopupViewModel14 = (AirTimeTopupViewModel) l();
        n.B(this, airTimeTopupViewModel14 != null ? airTimeTopupViewModel14.t : th, this, new x(this, i14), new w(this, i13), true, null, 224);
        AirTimeTopupViewModel airTimeTopupViewModel15 = (AirTimeTopupViewModel) l();
        n.B(this, airTimeTopupViewModel15 != null ? airTimeTopupViewModel15.f26630p : th, this, new x(this, i11), new C1624v(i7), false, null, 240);
        AirTimeTopupViewModel airTimeTopupViewModel16 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel16 != null) {
            lVar3 = airTimeTopupViewModel16.f26631v;
        } else {
            r14 = th;
        }
        if (r14 != 0) {
            r14 = lVar3;
            r14.e(this, new q(new p141j9.t(this, this, i13), 8));
        }
        r14 = lVar3;
        AirTimeTopupViewModel airTimeTopupViewModel17 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel17 != null) {
            lVar2 = airTimeTopupViewModel17.f26624e;
        } else {
            r15 = th;
        }
        if (r15 != 0) {
            r15 = lVar2;
            r15.e(this, new q(new C(this, this, 6), 8));
        }
        r15 = lVar2;
        AirTimeTopupViewModel airTimeTopupViewModel18 = (AirTimeTopupViewModel) l();
        n.B(this, airTimeTopupViewModel18 != null ? airTimeTopupViewModel18.f26625f : th, this, new x(this, 0), new C1624v(25), false, null, 224);
        AirTimeTopupViewModel airTimeTopupViewModel19 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel19 != null) {
            lVar = airTimeTopupViewModel19.f26622Y;
        } else {
            r16 = th;
        }
        if (r16 != 0) {
            r16 = lVar;
            r16.e(this, new q(new C(this, this, 7), 8));
        }
        r16 = lVar;
        AirTimeTopupViewModel airTimeTopupViewModel20 = (AirTimeTopupViewModel) l();
        n.B(this, airTimeTopupViewModel20 != null ? airTimeTopupViewModel20.f26623Z : th, this, new x(this, i13), new C1624v(26), false, null, 240);
        if (TextUtils.isEmpty(this.f26511p0)) {
            User user3 = this.f26501M;
            if (user3 == null) {
                Intrinsics.n(str);
                throw th;
            }
            String phoneNumber2 = user3.getPhoneNumber();
            if (phoneNumber2 == null) {
                phoneNumber2 = "";
            }
            if (!TextUtils.isEmpty(phoneNumber2)) {
                H h7 = (H) this.f27334c;
                if (h7 != null && (phoneNumberEdit = h7.f8066g.getPhoneNumberEdit()) != null) {
                    phoneNumberEdit.clearFocus();
                }
                String strSubstring = phoneNumber2.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                H h10 = (H) this.f27334c;
                if (h10 != null) {
                    h10.f8066g.setPhoneNumber(strSubstring);
                }
            }
        } else {
            if (i0.d0(this.f26511p0)) {
                String strSubstring2 = this.f26511p0.substring(r0.K().length());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                this.f26511p0 = strSubstring2;
            }
            String str2 = this.f26511p0;
            H h11 = (H) this.f27334c;
            if (h11 != null) {
                h11.f8066g.setPhoneNumber(str2);
            }
        }
        String strU = u();
        if (this.f26497B.isEmpty()) {
            AirTimeTopupViewModel airTimeTopupViewModel21 = (AirTimeTopupViewModel) l();
            if (airTimeTopupViewModel21 != null) {
                airTimeTopupViewModel21.f();
            }
        } else {
            A(strU);
        }
        H h12 = (H) this.f27334c;
        if (h12 != null) {
            h12.f8066g.showContactIv(true, true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isMainBusiness() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(Pd.d.qt_airtime_activity_top_up_airtime, (ViewGroup) null, false);
        int i7 = Pd.c.adViewBannerTitle;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = Pd.c.airtime_page_content_root;
            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
            if (constraintLayout != null) {
                i7 = Pd.c.asyncAmountView;
                AsyncViewStub asyncViewStub = (AsyncViewStub) p059e1.a.m(i7, viewInflate);
                if (asyncViewStub != null) {
                    i7 = Pd.c.async_bottom_banner_ads_view;
                    AsyncViewStub asyncViewStub2 = (AsyncViewStub) p059e1.a.m(i7, viewInflate);
                    if (asyncViewStub2 != null) {
                        i7 = Pd.c.async_top_view;
                        AsyncViewStub asyncViewStub3 = (AsyncViewStub) p059e1.a.m(i7, viewInflate);
                        if (asyncViewStub3 != null) {
                            i7 = Pd.c.atua_content_root;
                            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = Pd.c.atuaInputPhoneNumArea;
                                ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = (ModelMobileWithIconInputLayout) p059e1.a.m(i7, viewInflate);
                                if (modelMobileWithIconInputLayout != null) {
                                    i7 = Pd.c.atua_scroll_view;
                                    NestedScrollView nestedScrollView = (NestedScrollView) p059e1.a.m(i7, viewInflate);
                                    if (nestedScrollView != null) {
                                        i7 = Pd.c.atua_title_bar;
                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                        if (ppTitleBar != null) {
                                            i7 = Pd.c.bannerWithCouponStub;
                                            ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                            if (viewStub != null) {
                                                i7 = Pd.c.barrier_top;
                                                if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                                                    i7 = Pd.c.bottomMenuView;
                                                    ModelBillerBottomMenu modelBillerBottomMenu = (ModelBillerBottomMenu) p059e1.a.m(i7, viewInflate);
                                                    if (modelBillerBottomMenu != null) {
                                                        i7 = Pd.c.contentLayout;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                        if (constraintLayout2 != null) {
                                                            i7 = Pd.c.layoutLlDowntimeNotice;
                                                            ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                            if (viewStub2 != null) {
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                                i7 = Pd.c.operatorInputLayout;
                                                                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = Pd.c.savAirtimePockerBanner;
                                                                    SingleAdView singleAdView2 = (SingleAdView) p059e1.a.m(i7, viewInflate);
                                                                    if (singleAdView2 != null) {
                                                                        i7 = Pd.c.spaceAdMidBill;
                                                                        if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                                            i7 = Pd.c.tvAirtimePockerBannerTitle;
                                                                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView != null) {
                                                                                i7 = Pd.c.tvServiceProviderDisclaimer;
                                                                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView2 != null) {
                                                                                    i7 = Pd.c.vDfs;
                                                                                    DailyFlashSalesView dailyFlashSalesView = (DailyFlashSalesView) p059e1.a.m(i7, viewInflate);
                                                                                    if (dailyFlashSalesView != null) {
                                                                                        i7 = Pd.c.vsb_airtime_data_plan_quick_buy_item;
                                                                                        ViewStub viewStub3 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                                        if (viewStub3 != null) {
                                                                                            i7 = Pd.c.vsb_group_purchase_item;
                                                                                            ViewStub viewStub4 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                                            if (viewStub4 != null) {
                                                                                                H h7 = new H(constraintLayout3, singleAdView, constraintLayout, asyncViewStub, asyncViewStub2, asyncViewStub3, modelMobileWithIconInputLayout, nestedScrollView, ppTitleBar, viewStub, modelBillerBottomMenu, constraintLayout2, viewStub2, singleAdView2, textView, textView2, dailyFlashSalesView, viewStub3, viewStub4);
                                                                                                Intrinsics.checkNotNullExpressionValue(h7, "inflate(...)");
                                                                                                return h7;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity
    public final P0 n() {
        Zd.E e10 = new Zd.E(this);
        H h7 = (H) this.f27334c;
        e10.f13251f = h7 != null ? h7.f8062c : null;
        e10.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_tips, "top up Airtime"));
        A listener = new A(this, 0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        e10.f13247b = listener;
        String string = getString(Pd.f.qt_dial861);
        p054dd.d dVar = new p054dd.d(20);
        e10.f13248c = string;
        e10.f13250e = dVar;
        return e10;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        super.onActivityResult(i7, i10, intent);
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("PHONE_NUMBER");
        intent.getStringExtra("contact_name");
        H h7 = (H) this.f27334c;
        if (h7 == null || (modelMobileWithIconInputLayout = h7.f8066g) == null) {
            return;
        }
        modelMobileWithIconInputLayout.setPhoneNumber(i0.j(stringExtra));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        org.greenrobot.eventbus.c.b().l(this);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        AppCompatAutoCompleteTextView phoneNumberEdit;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout2;
        super.onPause();
        H h7 = (H) this.f27334c;
        KeyboardUtils.hideSoftInput((h7 == null || (modelMobileWithIconInputLayout2 = h7.f8066g) == null) ? null : modelMobileWithIconInputLayout2.getPhoneNumberEdit());
        H h10 = (H) this.f27334c;
        if (h10 == null || (modelMobileWithIconInputLayout = h10.f8066g) == null || (phoneNumberEdit = modelMobileWithIconInputLayout.getPhoneNumberEdit()) == null) {
            return;
        }
        phoneNumberEdit.clearFocus();
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
        ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem;
        if (messageEvent == null) {
            return;
        }
        int eventType = messageEvent.getEventType();
        if (eventType != 290) {
            if (eventType == 307 || eventType == 308) {
                this.f26501M = BaseApplication.getInstance().getUserDataSource().b();
                AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) l();
                if (airTimeTopupViewModel != null) {
                    airTimeTopupViewModel.f();
                }
                z();
                return;
            }
            return;
        }
        z();
        if (BaseApplication.hasLogin()) {
            AirTimeTopupViewModel airTimeTopupViewModel2 = (AirTimeTopupViewModel) l();
            if (airTimeTopupViewModel2 != null) {
                p140j8.f.s(airTimeTopupViewModel2, new C1913s(1, null), airTimeTopupViewModel2.f26628j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
            t tVar = this.f26517v;
            ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem2 = (ModelAirtimeDataPlanQuickBuyItem) tVar.getValue();
            if (modelAirtimeDataPlanQuickBuyItem2 == null || !modelAirtimeDataPlanQuickBuyItem2.isShown() || (modelAirtimeDataPlanQuickBuyItem = (ModelAirtimeDataPlanQuickBuyItem) tVar.getValue()) == null) {
                return;
            }
            QueryAirtimeV2Rsp.DataBean dataBean = this.f26505Z;
            String billerId = dataBean != null ? dataBean.getBillerId() : null;
            QueryAirtimeV2Rsp.DataBean dataBean2 = this.f26505Z;
            String itemName = dataBean2 != null ? dataBean2.getName() : null;
            QueryAirtimeV2Rsp.DataBean dataBean3 = this.f26505Z;
            if (dataBean3 != null) {
                dataBean3.getLogo();
            }
            modelAirtimeDataPlanQuickBuyItem.c(billerId, itemName, true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 1810) {
            if (grantResults.length == 1 && grantResults[0] == 0) {
                IntentUtil.gotoSystemContactsPage(this, 1810);
            } else {
                ToastUtils.showShort(Pd.f.qt_cant_get_contact_permission);
            }
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        String billerId;
        AirTimeTopupViewModel airTimeTopupViewModel;
        super.onResume();
        C();
        if (BaseApplication.hasLogin()) {
            QueryAirtimeV2Rsp.DataBean dataBean = this.f26505Z;
            if (dataBean != null && (billerId = dataBean.getNetwork()) != null && (airTimeTopupViewModel = (AirTimeTopupViewModel) l()) != null) {
                Intrinsics.checkNotNullParameter(billerId, "billerId");
                r rVar = new r(billerId, null);
                l lVar = airTimeTopupViewModel.f26625f;
                lVar.f27356m = billerId;
                Unit unit = Unit.f38893a;
                p140j8.f.v(airTimeTopupViewModel, rVar, lVar, 0L);
            }
            AirTimeTopupViewModel airTimeTopupViewModel2 = (AirTimeTopupViewModel) l();
            if (airTimeTopupViewModel2 != null) {
                p140j8.f.s(airTimeTopupViewModel2, new C1911p(1, null), airTimeTopupViewModel2.f26626g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
            AirTimeTopupViewModel airTimeTopupViewModel3 = (AirTimeTopupViewModel) l();
            if (airTimeTopupViewModel3 != null) {
                p140j8.f.s(airTimeTopupViewModel3, new B(1, null), airTimeTopupViewModel3.f26622Y, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
    }

    public final void p(DataBundleWalletItemBean paymentItem, String mobileNumber, Long l5, boolean z3) {
        AirTimeTopupViewModel airTimeTopupViewModel;
        if (paymentItem == null || mobileNumber == null || l5 == null || (airTimeTopupViewModel = (AirTimeTopupViewModel) l()) == null) {
            return;
        }
        long jLongValue = l5.longValue();
        String str = this.f26503X;
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        C1906k c1906k = new C1906k(paymentItem, mobileNumber, jLongValue, z3, str, null);
        DataBundleParams dataBundleParams = new DataBundleParams(paymentItem, mobileNumber, jLongValue, null, null, null, 56, null);
        l lVar = airTimeTopupViewModel.t;
        lVar.f27356m = dataBundleParams;
        Unit unit = Unit.f38893a;
        p140j8.f.v(airTimeTopupViewModel, c1906k, lVar, 0L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        AirTimeTopupViewModel airTimeTopupViewModel;
        n0.p(getIntent());
        if (BaseApplication.hasLogin() && (airTimeTopupViewModel = (AirTimeTopupViewModel) l()) != null) {
            p140j8.f.s(airTimeTopupViewModel, new C1913s(1, null), airTimeTopupViewModel.f26628j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        AirTimeTopupViewModel airTimeTopupViewModel2 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel2 != null) {
            airTimeTopupViewModel2.f();
        }
        if (BaseApplication.hasLogin()) {
            User user = this.f26501M;
            if (user == null) {
                Intrinsics.n("mUser");
                throw null;
            }
            String phoneNumber = user.getPhoneNumber();
            if (phoneNumber == null) {
                phoneNumber = "";
            }
            AirTimeTopupViewModel airTimeTopupViewModel3 = (AirTimeTopupViewModel) l();
            if (airTimeTopupViewModel3 != null) {
                p140j8.f.s(airTimeTopupViewModel3, new C1912q(phoneNumber, null), airTimeTopupViewModel3.f26624e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
        z();
        H h7 = (H) this.f27334c;
        if (h7 != null) {
            h7.f8063d.b(false, new w(this, 2));
        }
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new m(22, uIHandler, this));
    }

    public final void q(GroupPurchaseReq req, boolean z3) {
        req.setVerifyNetwork(Boolean.valueOf(z3));
        AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            C1907l c1907l = new C1907l(req, null);
            l lVar = airTimeTopupViewModel.f26623Z;
            lVar.f27356m = req;
            Unit unit = Unit.f38893a;
            p140j8.f.v(airTimeTopupViewModel, c1907l, lVar, 0L);
        }
    }

    public final void r(AirtimeOrderAddReq req, boolean z3) {
        req.verifyNetwork = z3;
        req.outSourceId = this.f26503X;
        AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            C1908m c1908m = new C1908m(req, null);
            l lVar = airTimeTopupViewModel.f26630p;
            lVar.f27356m = req;
            Unit unit = Unit.f38893a;
            p140j8.f.v(airTimeTopupViewModel, c1908m, lVar, 0L);
        }
    }

    public final long s() {
        Long maxAmount;
        QueryAirtimeV2Rsp.DataBean dataBean = this.f26505Z;
        return Math.min(50000000L, (dataBean == null || (maxAmount = dataBean.getMaxAmount()) == null) ? 50000000L : maxAmount.longValue());
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView contactIv;
        ImageView rightImageView1;
        ImageView rightImageView2;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new w(this, 0));
        ARouter.getInstance().inject(this);
        org.greenrobot.eventbus.c.b().j(this);
        H h7 = (H) this.f27334c;
        if (h7 != null && (rightImageView2 = h7.f8068j.getRightImageView1()) != null) {
            rightImageView2.setOnClickListener(new y(this, 0));
        }
        H h10 = (H) this.f27334c;
        if (h10 != null && (rightImageView1 = h10.f8068j.getRightImageView1()) != null) {
            rightImageView1.setImageResource(p025ba.d.core_bill_history_default);
        }
        H h11 = (H) this.f27334c;
        if (h11 != null) {
            h11.f8068j.setBackButtonClickListener(new y(this, 1));
        }
        if (!TextUtils.isEmpty(this.f26503X)) {
            n0.g().w("PPay_Airtime_Channel", kotlin.collections.F.b(new Pair("biller_channel", this.f26503X)));
        }
        this.f26500L = new f(isDarkMode());
        H h12 = (H) this.f27334c;
        if (h12 != null) {
            h12.f8066g.setOnNumberInputListener(new C2085k0(this, 23));
        }
        H h13 = (H) this.f27334c;
        if (h13 != null && (contactIv = h13.f8066g.getContactIv()) != null) {
            contactIv.setOnClickListener(this.f26518v0);
        }
        H h14 = (H) this.f27334c;
        KeyboardUtils.hideSoftInput(h14 != null ? h14.f8066g.getPhoneNumberEdit() : null);
        H h15 = (H) this.f27334c;
        if (h15 != null) {
            h15.f8067i.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 8));
        }
        n0.g().v("PPay_Airtime_Topuppage");
        H h16 = (H) this.f27334c;
        if (h16 != null) {
            h16.f8057B.setOnDailyFlashSalesListener(new p141j9.F(this));
        }
    }

    public final long t() {
        Long minAmount;
        QueryAirtimeV2Rsp.DataBean dataBean = this.f26505Z;
        return Math.max(5000L, (dataBean == null || (minAmount = dataBean.getMinAmount()) == null) ? 5000L : minAmount.longValue());
    }

    public final String u() {
        String phoneNumber;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        try {
            H h7 = (H) this.f27334c;
            if (h7 == null || (modelMobileWithIconInputLayout = h7.f8066g) == null || (phoneNumber = modelMobileWithIconInputLayout.getPhoneNumber()) == null) {
                phoneNumber = BaseApplication.get().getUser().getPhoneNumber();
            }
            Intrinsics.e(phoneNumber);
            return phoneNumber;
        } catch (Exception unused) {
            String phoneNumber2 = BaseApplication.get().getUser().getPhoneNumber();
            Intrinsics.e(phoneNumber2);
            return phoneNumber2;
        }
    }

    public final boolean v() {
        String phoneNumber;
        H h7 = (H) this.f27334c;
        if (h7 == null || (phoneNumber = h7.f8066g.getPhoneNumber()) == null) {
            phoneNumber = "";
        }
        if (!TextUtils.isEmpty(phoneNumber) && r0.b1(phoneNumber)) {
            return false;
        }
        H h10 = (H) this.f27334c;
        if (h10 != null) {
            h10.f8066g.setError(getString(v.cv_msg_enter_recipient_mobile_number));
        }
        H h11 = (H) this.f27334c;
        if (h11 != null) {
            h11.f8067i.setSmoothScrollingEnabled(true);
        }
        H h12 = (H) this.f27334c;
        if (h12 != null) {
            h12.f8067i.p(0);
        }
        return true;
    }

    public final boolean w() {
        return (!ActivityUtils.isValidActivityContext(this) || isFinishing() || isDestroyed()) ? false : true;
    }

    public final void y(QueryAirtimeV2Rsp.DataBean dataBean) {
        String billerId;
        String billerId2;
        String string;
        String userIdTips;
        String billerId3;
        AirTimeTopupViewModel airTimeTopupViewModel;
        List<AirtimeItemsBean> airtimeItems;
        String network;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        H h7 = (H) this.f27334c;
        if ((h7 != null ? h7.f8066g : null) == null) {
            return;
        }
        QueryAirtimeV2Rsp.DataBean dataBean2 = this.f26505Z;
        if (dataBean2 == null || (billerId = dataBean2.getNetwork()) == null) {
            QueryAirtimeV2Rsp.DataBean dataBean3 = this.f26505Z;
            billerId = dataBean3 != null ? dataBean3.getBillerId() : null;
        }
        if (dataBean == null || (billerId2 = dataBean.getNetwork()) == null) {
            billerId2 = dataBean != null ? dataBean.getBillerId() : null;
        }
        String str = "";
        if (!kotlin.text.y.h(billerId, billerId2, true)) {
            try {
                this.f26502Q = 0L;
                PpAmountEditText ppAmountEditText = this.f26507j;
                if (ppAmountEditText != null) {
                    ppAmountEditText.setAmount("");
                }
                PpAmountEditText ppAmountEditText2 = this.f26507j;
                if (ppAmountEditText2 != null) {
                    ppAmountEditText2.clearFocus();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.f26505Z = dataBean;
        if (dataBean != null) {
            SPUtils sPUtils = SPUtils.getInstance();
            QueryAirtimeV2Rsp.DataBean dataBean4 = this.f26505Z;
            if (dataBean4 == null || (network = dataBean4.getNetwork()) == null) {
                network = "";
            }
            sPUtils.put("TOP_UP_AIRTIME_SELECTED_MOBILE_OPERATOR_CODE", network);
            ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = (ModelAirtimeDataPlanQuickBuyItem) this.f26517v.getValue();
            if (modelAirtimeDataPlanQuickBuyItem != null) {
                QueryAirtimeV2Rsp.DataBean dataBean5 = this.f26505Z;
                String billerId4 = dataBean5 != null ? dataBean5.getBillerId() : null;
                QueryAirtimeV2Rsp.DataBean dataBean6 = this.f26505Z;
                String itemName = dataBean6 != null ? dataBean6.getName() : null;
                QueryAirtimeV2Rsp.DataBean dataBean7 = this.f26505Z;
                if (dataBean7 != null) {
                    dataBean7.getLogo();
                }
                int i7 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                modelAirtimeDataPlanQuickBuyItem.c(billerId4, itemName, false);
            }
        }
        if (dataBean == null || (airtimeItems = dataBean.getAirtimeItems()) == null || airtimeItems.isEmpty()) {
            f fVar = this.f26500L;
            if (fVar != null) {
                fVar.setList(null);
            }
        } else {
            AirtimeExtraItemInfoBean airtimeExtraItemInfoBean = (AirtimeExtraItemInfoBean) this.f26496A.get(dataBean.getNetwork());
            f fVar2 = this.f26500L;
            if (fVar2 != null) {
                Boolean boolIsCover = dataBean.getIsCover();
                if (boolIsCover == null) {
                    boolIsCover = Boolean.FALSE;
                }
                fVar2.f38710c = boolIsCover;
            }
            f fVar3 = this.f26500L;
            if (fVar3 != null) {
                List<AirtimeItemsBean> items = dataBean.getAirtimeItems();
                Intrinsics.e(items);
                AirtimeSpecialRechargeItem airtimeCustomizedSpotVO = airtimeExtraItemInfoBean != null ? airtimeExtraItemInfoBean.getAirtimeCustomizedSpotVO() : null;
                List<AirtimeCashbackInfoDataBean> itemTipsList = airtimeExtraItemInfoBean != null ? airtimeExtraItemInfoBean.getItemTipsList() : null;
                Intrinsics.checkNotNullParameter(items, "items");
                if (airtimeCustomizedSpotVO != null) {
                    fVar3.f38714g = airtimeCustomizedSpotVO;
                }
                fVar3.f38715i = itemTipsList;
                ArrayList arrayList = fVar3.f38713f;
                arrayList.clear();
                for (BaseAirtimeItemsBean baseAirtimeItemsBean : items) {
                    if (baseAirtimeItemsBean instanceof AirtimeItemsBean) {
                        arrayList.add(baseAirtimeItemsBean);
                    }
                }
                fVar3.f();
                fVar3.e();
            }
        }
        C();
        H h10 = (H) this.f27334c;
        if (h10 != null) {
            h.c(h10.f8057B);
        }
        AirTimeTopupViewModel airTimeTopupViewModel2 = (AirTimeTopupViewModel) l();
        if (airTimeTopupViewModel2 != null) {
            AbstractC0780y.m(V.h(airTimeTopupViewModel2), null, null, new o9.A(airTimeTopupViewModel2.f26631v, C0.G.o("Pref_DFSProducts_", BaseApplication.getCountryLocale()), null), 3);
        }
        if (dataBean != null && (billerId3 = dataBean.getNetwork()) != null && (airTimeTopupViewModel = (AirTimeTopupViewModel) l()) != null) {
            Intrinsics.checkNotNullParameter(billerId3, "billerId");
            r rVar = new r(billerId3, null);
            l lVar = airTimeTopupViewModel.f26625f;
            lVar.f27356m = billerId3;
            Unit unit = Unit.f38893a;
            p140j8.f.v(airTimeTopupViewModel, rVar, lVar, 0L);
        }
        H h11 = (H) this.f27334c;
        if (h11 != null) {
            ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = h11.f8066g;
            if (dataBean != null && (userIdTips = dataBean.getUserIdTips()) != null) {
                str = userIdTips;
            }
            modelMobileWithIconInputLayout.setInputHint(str);
        }
        if (TextUtils.isEmpty(dataBean != null ? dataBean.getAmtTips() : null)) {
            string = getString(Pd.f.qt_airtime_other_amount_ng);
            Intrinsics.e(string);
        } else if (dataBean == null || (string = dataBean.getAmtTips()) == null) {
            string = getString(Pd.f.qt_airtime_other_amount_ng);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        PpAmountEditText ppAmountEditText3 = this.f26507j;
        if (ppAmountEditText3 != null) {
            ppAmountEditText3.setHintText(string);
        }
    }

    public final void z() {
        if (BaseApplication.hasLogin()) {
            ((DataBundleRecordHistoryViewModel) this.f26504Y.getValue()).e();
        }
    }
}
