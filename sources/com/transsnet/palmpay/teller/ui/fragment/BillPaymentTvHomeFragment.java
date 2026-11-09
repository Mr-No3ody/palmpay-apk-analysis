package com.transsnet.palmpay.teller.ui.fragment;

import C0.C0127t;
import Ce.H;
import Ed.U;
import Ed.ViewOnFocusChangeListenerC0235o;
import G1.d;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.f;
import Rd.g0;
import Wd.I;
import Wf.AbstractC0780y;
import Wf.t0;
import Xd.C0786e;
import Yd.i;
import Zd.A;
import Zd.B;
import Zd.C;
import Zd.C0803h;
import Zd.D;
import Zd.v;
import Zd.w;
import Zd.x;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.camera.camera2.internal.P0;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;
import com.bumptech.glide.b;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.m;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.QueryServiceStateByCategoryIdReq;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelAvailablePointItem;
import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.BillerListRsp;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdReq;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdRsp;
import com.transsnet.palmpay.teller.bean.IntegerParams;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.TvRenewDataInfoBean;
import com.transsnet.palmpay.teller.bean.resp.QueryAccountHistoryData;
import com.transsnet.palmpay.teller.bean.resp.QueryCustomerIdIsExitResp;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import com.transsnet.palmpay.teller.ui.view.ModelTvRenewItem;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeTvViewModel;
import com.transsnet.palmpay.teller.viewmodel.BillQuickAccessDataViewModel;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p070ee.c;
import p086fe.A0;
import p086fe.B0;
import p086fe.C1655a0;
import p086fe.C1657b0;
import p086fe.C1675k0;
import p086fe.C1677l0;
import p086fe.C1683o0;
import p086fe.C1688r0;
import p086fe.C1694u0;
import p086fe.U0;
import p220oa.h;
import p355xf.C2131j;
import p355xf.EnumC2132k;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/fragment/BillPaymentTvHomeFragment;", "Lcom/transsnet/palmpay/teller/ui/fragment/BaseBillerFragment;", "Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeTvViewModel;", "LRd/g0;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerNewDialog$CallBack;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentTvHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentTvHomeFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/BillPaymentTvHomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1119:1\n172#2,9:1120\n106#2,15:1129\n106#2,15:1144\n629#3,11:1159\n171#4,12:1170\n215#4:1182\n383#4:1183\n401#4:1184\n383#4:1185\n401#4:1186\n260#4,10:1187\n296#4:1197\n115#4,8:1198\n145#4:1206\n115#4,8:1207\n145#4:1215\n115#4,8:1216\n145#4:1224\n1869#5,2:1225\n1#6:1227\n*S KotlinDebug\n*F\n+ 1 BillPaymentTvHomeFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/BillPaymentTvHomeFragment\n*L\n100#1:1120,9\n101#1:1129,15\n124#1:1144,15\n449#1:1159,11\n487#1:1170,12\n487#1:1182\n494#1:1183\n494#1:1184\n576#1:1185\n576#1:1186\n586#1:1187,10\n586#1:1197\n630#1:1198,8\n630#1:1206\n659#1:1207,8\n659#1:1215\n669#1:1216,8\n669#1:1224\n729#1:1225,2\n*E\n"})
public class BillPaymentTvHomeFragment extends BaseBillerFragment<BillPaymentHomeTvViewModel, g0> implements PickBillerNewDialog.CallBack {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f34295v0 = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final b0 f34299H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final String f34300L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f34301M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ChannelDataItemBean f34302Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f34303X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f34304Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ModelAvailableCouponItem f34305Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public BillerListItemBean f34306k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C0786e f34307p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final b0 f34308q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f34309r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f34310s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final HashMap f34311t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f34312u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f34313v = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f34314w = C2131j.b(new Zd.t(this, 0));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f34296A = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f34297B = new ArrayList();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final b0 f34298C = p002a.a.h(this, G.a(B0.class), new B(this, 0), new B(this, 1), new B(this, 2));

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

    public BillPaymentTvHomeFragment() {
        B b7 = new B(this, 3);
        EnumC2132k enumC2132k = EnumC2132k.f43971c;
        Lazy lazyA = C2131j.a(enumC2132k, new C0127t(b7, 7));
        this.f34299H = p002a.a.h(this, G.a(BillQuickAccessDataViewModel.class), new D(lazyA, 0), new D(lazyA, 1), new C(this, lazyA, 1));
        this.f34300L = "2";
        this.f34304Y = new ArrayList();
        Lazy lazyA2 = C2131j.a(enumC2132k, new C0127t(new B(this, 4), 8));
        this.f34308q0 = p002a.a.h(this, G.a(U0.class), new D(lazyA2, 2), new D(lazyA2, 3), new C(this, lazyA2, 0));
        this.f34309r0 = Long.MAX_VALUE;
        this.f34311t0 = new HashMap();
        this.f34312u0 = C2131j.b(new Zd.t(this, 1));
    }

    public final String A() {
        ModelNumberInputLayout modelNumberInputLayout;
        String number;
        g0 g0Var = (g0) this.f27335j;
        return (g0Var == null || (modelNumberInputLayout = g0Var.f8325v) == null || (number = modelNumberInputLayout.getNumber()) == null) ? "" : number;
    }

    public final void B(int i7, BillerListItemBean billerListItemBean, boolean z3) {
        g0 g0Var;
        String string;
        String billerId;
        TextView titleTv;
        ImageView startIconView;
        g0 g0Var2;
        AppCompatAutoCompleteTextView numberEdit;
        if (i0.W(requireActivity()) && billerListItemBean != null) {
            String str = "";
            if (this.f34306k0 != null) {
                String billerId2 = billerListItemBean.getBillerId();
                BillerListItemBean billerListItemBean2 = this.f34306k0;
                if (!Intrinsics.c(billerId2, billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null) && z3 && (g0Var2 = (g0) this.f27335j) != null && (numberEdit = g0Var2.f8325v.getNumberEdit()) != null) {
                    numberEdit.setText("");
                }
            }
            g0 g0Var3 = (g0) this.f27335j;
            if (g0Var3 != null) {
                g0Var3.f8312M.setText("");
            }
            g0 g0Var4 = (g0) this.f27335j;
            boolean z8 = false;
            if (g0Var4 != null) {
                h.s(g0Var4.f8323o, false);
            }
            this.f34306k0 = billerListItemBean;
            G(billerListItemBean);
            g0 g0Var5 = (g0) this.f27335j;
            if (g0Var5 != null) {
                g0Var5.f8307A.b(billerListItemBean.getBillerId(), billerListItemBean.getBillerName());
            }
            g0 g0Var6 = (g0) this.f27335j;
            if (g0Var6 != null) {
                g0Var6.f8310H.h(billerListItemBean.getBillerName());
            }
            g0 g0Var7 = (g0) this.f27335j;
            if (g0Var7 != null) {
                ModelItemSelection modelItemSelection = g0Var7.f8310H;
                Integer status = billerListItemBean.getStatus();
                if (status != null && status.intValue() == 1) {
                    z8 = true;
                }
                modelItemSelection.d(z8);
            }
            Integer status2 = billerListItemBean.getStatus();
            if ((status2 == null || status2.intValue() != 1) && (g0Var = (g0) this.f27335j) != null) {
                g0Var.f8310H.e(getString(f.qt_service_temporarily_unavailable_3, billerListItemBean.getBillerName()));
            }
            g0 g0Var8 = (g0) this.f27335j;
            if (g0Var8 != null && (startIconView = g0Var8.f8310H.getStartIconView()) != null) {
                ((m) b.c(getContext()).d(this).load(billerListItemBean.getInstitutionLogo()).a(new d().I(new z(CommonViewExtKt.getDp(8)), true)).x(r.cv_palmpay_logo_6)).S(startIconView);
            }
            g0 g0Var9 = (g0) this.f27335j;
            if (g0Var9 != null && (titleTv = g0Var9.f8325v.getTitleTv()) != null) {
                String str2 = c.f36289a;
                String string2 = getString(c.e(this.f34300L));
                BillerListItemBean billerListItemBean3 = this.f34306k0;
                if (!TextUtils.isEmpty(billerListItemBean3 != null ? billerListItemBean3.getInputTitle() : null)) {
                    BillerListItemBean billerListItemBean4 = this.f34306k0;
                    string2 = billerListItemBean4 != null ? billerListItemBean4.getInputTitle() : null;
                }
                titleTv.setText(string2);
            }
            BillerListItemBean billerListItemBean5 = this.f34306k0;
            if (TextUtils.isEmpty(billerListItemBean5 != null ? billerListItemBean5.getInputTips() : null)) {
                string = getString(Vd.a.qt_enter_account_number);
                Intrinsics.e(string);
            } else {
                BillerListItemBean billerListItemBean6 = this.f34306k0;
                if (billerListItemBean6 == null || (string = billerListItemBean6.getInputTips()) == null) {
                    string = "";
                }
            }
            g0 g0Var10 = (g0) this.f27335j;
            if (g0Var10 != null) {
                g0Var10.f8325v.setHint(string);
            }
            BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) this.f27333i;
            if (billPaymentHomeTvViewModel != null) {
                String billerId3 = billerListItemBean.getBillerId();
                if (billerId3 == null) {
                    billerId3 = "";
                }
                Intrinsics.checkNotNullParameter(billerId3, "billerId");
                String strConcat = "queryCategoryAndTvListByBillerId".concat(billerId3);
                IntegerParams integerParams = new IntegerParams(i7);
                l lVar = billPaymentHomeTvViewModel.f34408f;
                lVar.f27356m = integerParams;
                AbstractC0780y.m(V.h(billPaymentHomeTvViewModel), null, null, new C1675k0(lVar, q0.y(strConcat, "_", BaseApplication.getCountryLocale()), null, billerId3), 3);
            }
            BillPaymentHomeTvViewModel billPaymentHomeTvViewModel2 = (BillPaymentHomeTvViewModel) this.f27333i;
            if (billPaymentHomeTvViewModel2 != null) {
                String billerId4 = billerListItemBean.getBillerId();
                if (billerId4 == null) {
                    billerId4 = "";
                }
                Intrinsics.checkNotNullParameter(billerId4, "billerId");
                if (BaseApplication.hasLogin()) {
                    String strConcat2 = "queryTvTipsListByBillerId".concat(billerId4);
                    l lVar2 = billPaymentHomeTvViewModel2.f34409g;
                    lVar2.f27356m = billerId4;
                    AbstractC0780y.m(V.h(billPaymentHomeTvViewModel2), null, null, new C1688r0(lVar2, q0.y(strConcat2, "_", BaseApplication.getCountryLocale()), null, billerId4), 3);
                }
            }
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = new ClickEvent("PPay_TV_Btn_BillerList");
            BillerListItemBean billerListItemBean7 = this.f34306k0;
            if (billerListItemBean7 != null && (billerId = billerListItemBean7.getBillerId()) != null) {
                str = billerId;
            }
            n0VarG.k(clickEvent.add("element_name", str));
        }
    }

    public final void C(boolean z3, boolean z8, String str, String str2) {
        AppCompatAutoCompleteTextView numberEdit;
        if (str != null) {
            ArrayList arrayList = this.f34304Y;
            if (arrayList.isEmpty()) {
                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) this.f27333i;
                if (billPaymentHomeTvViewModel != null) {
                    billPaymentHomeTvViewModel.d(this.f34300L, false, z8);
                }
            } else {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (Intrinsics.c(((BillerListItemBean) arrayList.get(i7)).getBillerId(), str)) {
                        B(i7, (BillerListItemBean) arrayList.get(i7), z3);
                        break;
                    }
                }
            }
        }
        if (str2 != null) {
            g0 g0Var = (g0) this.f27335j;
            if (g0Var != null && (numberEdit = g0Var.f8325v.getNumberEdit()) != null) {
                numberEdit.setText(str2);
            }
            y();
        }
    }

    public final void E() {
        PickBillerNewDialog pickBillerNewDialog = new PickBillerNewDialog(requireActivity(), "2", 0, false, 0, 20, null);
        String str = c.f36289a;
        pickBillerNewDialog.setBusinessName(c.c(getContext(), this.f34300L));
        pickBillerNewDialog.setCallBack(this);
        pickBillerNewDialog.show();
        pickBillerNewDialog.setBillers(this.f34304Y);
    }

    public final void F(boolean z3) {
        g0 g0Var = (g0) this.f27335j;
        if (g0Var != null) {
            g0Var.f8320g.setVisibility(8);
        }
        g0 g0Var2 = (g0) this.f27335j;
        if (g0Var2 != null) {
            g0Var2.f8319f.setVisibility(8);
        }
    }

    public final void G(BillerListItemBean billerListItemBean) {
        Object obj;
        g0 g0Var;
        Iterator it = this.f34296A.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (y.h(((QueryAccountHistoryData) next).getBillerId(), billerListItemBean != null ? billerListItemBean.getBillerId() : null, true)) {
                obj = next;
                break;
            }
        }
        QueryAccountHistoryData queryAccountHistoryData = (QueryAccountHistoryData) obj;
        if (queryAccountHistoryData == null || (g0Var = (g0) this.f27335j) == null) {
            return;
        }
        g0Var.f8325v.initModelInputRegexData(queryAccountHistoryData.getHistory());
    }

    public final void H(String str, String str2, long j6, TvListByCategoryIdResp.TvItemChildBean tvItemChildBean) {
        CheckCustomerIdReq checkCustomerIdReq = new CheckCustomerIdReq();
        checkCustomerIdReq.billerId = str;
        checkCustomerIdReq.billerName = str2;
        checkCustomerIdReq.businessAmount = j6;
        checkCustomerIdReq.customerId = A();
        checkCustomerIdReq.paymentItemId = tvItemChildBean.getItemId();
        checkCustomerIdReq.paymentItemName = tvItemChildBean.getItemName();
        BillerListItemBean billerListItemBean = this.f34306k0;
        checkCustomerIdReq.icon = billerListItemBean != null ? billerListItemBean.getInstitutionLogo() : null;
        checkCustomerIdReq.categoryId = this.f34300L;
        checkCustomerIdReq.itemId = tvItemChildBean.getItemId();
        checkCustomerIdReq.viewDoc = tvItemChildBean.getViewDoc();
        checkCustomerIdReq.viewPic = tvItemChildBean.getViewPic();
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) this.f27333i;
        if (billPaymentHomeTvViewModel != null) {
            C1657b0 c1657b0 = new C1657b0(checkCustomerIdReq, null);
            l lVar = billPaymentHomeTvViewModel.f34414v;
            lVar.f27356m = checkCustomerIdReq;
            Unit unit = Unit.f38893a;
            p140j8.f.v(billPaymentHomeTvViewModel, c1657b0, lVar, 0L);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ((B0) this.f34298C.getValue()).f36482d.e(this, new C0803h(this, 2));
        getChildFragmentManager().setFragmentResultListener("REQUEST_CODE_CLICK_PAYMENT_ITEM", this, new w(this));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        Window window;
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel;
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel2 = (BillPaymentHomeTvViewModel) this.f27333i;
        String categoryId = this.f34300L;
        View decorView = null;
        if (billPaymentHomeTvViewModel2 != null) {
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            if (BaseApplication.hasLogin()) {
                QueryServiceStateByCategoryIdReq queryServiceStateByCategoryIdReq = new QueryServiceStateByCategoryIdReq();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(categoryId);
                queryServiceStateByCategoryIdReq.categoryId = arrayList;
                p140j8.f.s(billPaymentHomeTvViewModel2, new C1677l0(queryServiceStateByCategoryIdReq, null), billPaymentHomeTvViewModel2.f34412o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel3 = (BillPaymentHomeTvViewModel) this.f27333i;
        if (billPaymentHomeTvViewModel3 != null) {
            billPaymentHomeTvViewModel3.f(categoryId);
        }
        if (this.f34302Q == null) {
            this.f34302Q = new ChannelDataItemBean();
        }
        ChannelDataItemBean channelDataItemBean = this.f34302Q;
        if (channelDataItemBean != null) {
            C(false, false, channelDataItemBean.getBillerId(), channelDataItemBean.getCustomerId());
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel4 = (BillPaymentHomeTvViewModel) this.f27333i;
        if (billPaymentHomeTvViewModel4 != null) {
            billPaymentHomeTvViewModel4.d(this.f34300L, false, false);
        }
        if (BaseApplication.hasLogin() && (billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) this.f27333i) != null) {
            billPaymentHomeTvViewModel.e();
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel5 = (BillPaymentHomeTvViewModel) this.f27333i;
        l lVar = billPaymentHomeTvViewModel5 != null ? billPaymentHomeTvViewModel5.f34415w : null;
        if (lVar != null) {
            lVar.e(this, new I(new x(this, 2), 5));
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel6 = (BillPaymentHomeTvViewModel) this.f27333i;
        l lVar2 = billPaymentHomeTvViewModel6 != null ? billPaymentHomeTvViewModel6.f34406B : null;
        if (lVar2 != null) {
            lVar2.e(this, new I(new Zd.y(lVar2, this, 0), 5));
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel7 = (BillPaymentHomeTvViewModel) this.f27333i;
        final int i7 = 0;
        n.B(this, billPaymentHomeTvViewModel7 != null ? billPaymentHomeTvViewModel7.f34407e : null, this, new Function2(this) { // from class: Zd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentTvHomeFragment f11689b;

            {
                this.f11689b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel8;
                String billerId;
                String string;
                TextView errorTv;
                String billerName;
                String billerId2;
                String str;
                String str2;
                String userIdTips;
                String institutionLogo;
                String str3;
                ArrayList<TvRenewDataInfoBean.Item> items;
                String str4;
                String operatorCode = "";
                BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11689b;
                switch (i7) {
                    case 0:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp = (BillerListRsp) obj2;
                        int i10 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            List<BillerListItemBean> list = rsp.data;
                            if (list != null) {
                                billPaymentTvHomeFragment.f34304Y.clear();
                                billPaymentTvHomeFragment.f34304Y.addAll(list);
                                ChannelDataItemBean channelDataItemBean2 = billPaymentTvHomeFragment.f34302Q;
                                if (channelDataItemBean2 != null) {
                                    billPaymentTvHomeFragment.C(true, false, channelDataItemBean2.getBillerId(), channelDataItemBean2.getCustomerId());
                                }
                                String str5 = billPaymentTvHomeFragment.f34301M;
                                if (str5 != null) {
                                    if (TextUtils.isEmpty(str5)) {
                                        str5 = null;
                                    }
                                    if (str5 != null) {
                                        billPaymentTvHomeFragment.C(true, false, str5, "");
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean3 = billPaymentTvHomeFragment.f34302Q;
                                if ((channelDataItemBean3 == null || TextUtils.isEmpty(channelDataItemBean3.getBillerName())) && TextUtils.isEmpty(billPaymentTvHomeFragment.f34301M) && (billPaymentHomeTvViewModel8 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i) != null) {
                                    StringBuilder sb2 = new StringBuilder("queryLastBillerByCategoryId");
                                    String str6 = billPaymentTvHomeFragment.f34300L;
                                    sb2.append(str6);
                                    AbstractC0780y.m(V.h(billPaymentHomeTvViewModel8), null, null, new C1694u0(billPaymentHomeTvViewModel8.f34411j, q0.y(sb2.toString(), "_", BaseApplication.getCountryLocale()), null, str6), 3);
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentTvHomeFragment.E();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        return Unit.f38893a;
                    case 1:
                        TvListByCategoryIdResp result = (TvListByCategoryIdResp) obj2;
                        int i11 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(result, "result");
                        billPaymentTvHomeFragment.F(false);
                        if (result.isSuccess() && result.getData() != null) {
                            ArrayList<TvListByCategoryIdResp.TvCategoryBean> data = result.getData();
                            if (data != null) {
                                billPaymentTvHomeFragment.f34297B = data;
                            }
                            C0786e c0786e = billPaymentTvHomeFragment.f34307p0;
                            if (c0786e != null) {
                                BillerListItemBean billerListItemBean = billPaymentTvHomeFragment.f34306k0;
                                if (billerListItemBean != null && (billerId = billerListItemBean.getBillerId()) != null) {
                                    operatorCode = billerId;
                                }
                                ArrayList list2 = billPaymentTvHomeFragment.f34297B;
                                Intrinsics.checkNotNullParameter(operatorCode, "operatorCode");
                                Intrinsics.checkNotNullParameter(list2, "list");
                                c0786e.f11144o = operatorCode;
                                c0786e.t = list2;
                                HashMap map = c0786e.f11145p;
                                List list3 = (List) map.get(operatorCode);
                                if (list3 != null) {
                                    list3.clear();
                                }
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(list2, 10));
                                int i12 = 0;
                                for (Object obj3 : list2) {
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        C1850q.k();
                                        throw null;
                                    }
                                    arrayList2.add(Long.valueOf(c0786e.h(i12, (TvListByCategoryIdResp.TvCategoryBean) obj3)));
                                    i12 = i13;
                                }
                                map.put(c0786e.f11144o, CollectionsKt.Z(arrayList2));
                            }
                            g0 g0Var = (g0) billPaymentTvHomeFragment.f27335j;
                            if (g0Var != null) {
                                g0Var.f8313Q.setCurrentItem(0, false);
                            }
                            F6.d.h("BundleFragment", 3, "notifyDataSetChanged");
                            C0786e c0786e2 = billPaymentTvHomeFragment.f34307p0;
                            if (c0786e2 != null) {
                                c0786e2.notifyDataSetChanged();
                            }
                        }
                        return Unit.f38893a;
                    default:
                        CheckCustomerIdReq checkCustomerIdReq = (CheckCustomerIdReq) obj;
                        CheckCustomerIdRsp rsp2 = (CheckCustomerIdRsp) obj2;
                        int i14 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            CheckCustomerIdRsp.DataBean dataBean = rsp2.data;
                            if (dataBean != null) {
                                BillerListItemBean billerListItemBean2 = billPaymentTvHomeFragment.f34306k0;
                                boolean zIsEmpty = TextUtils.isEmpty(billerListItemBean2 != null ? billerListItemBean2.getUserIdTips() : null);
                                String str7 = billPaymentTvHomeFragment.f34300L;
                                if (zIsEmpty) {
                                    string = billPaymentTvHomeFragment.getString(p070ee.c.e(str7));
                                } else {
                                    BillerListItemBean billerListItemBean3 = billPaymentTvHomeFragment.f34306k0;
                                    string = billerListItemBean3 != null ? billerListItemBean3.getUserIdTips() : null;
                                }
                                if (dataBean.available) {
                                    TvRenewDataInfoBean tvRenewDataInfoBean = new TvRenewDataInfoBean();
                                    BillerListItemBean billerListItemBean4 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean4 == null || (billerName = billerListItemBean4.getBillerName()) == null) {
                                        billerName = "";
                                    }
                                    tvRenewDataInfoBean.setBillerName(billerName);
                                    BillerListItemBean billerListItemBean5 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean5 == null || (billerId2 = billerListItemBean5.getBillerId()) == null) {
                                        billerId2 = "";
                                    }
                                    tvRenewDataInfoBean.setBillerId(billerId2);
                                    tvRenewDataInfoBean.setAccountNumber(billPaymentTvHomeFragment.A());
                                    if (checkCustomerIdReq == null || (str = checkCustomerIdReq.paymentItemName) == null) {
                                        str = "";
                                    }
                                    tvRenewDataInfoBean.setPaymentItemName(str);
                                    if (checkCustomerIdReq == null || (str2 = checkCustomerIdReq.paymentItemId) == null) {
                                        str2 = "";
                                    }
                                    tvRenewDataInfoBean.setPaymentItemId(str2);
                                    BillerListItemBean billerListItemBean6 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean6 == null || (userIdTips = billerListItemBean6.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    tvRenewDataInfoBean.setAccountNmberTitleName(userIdTips);
                                    BillerListItemBean billerListItemBean7 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean7 == null || (institutionLogo = billerListItemBean7.getInstitutionLogo()) == null) {
                                        institutionLogo = "";
                                    }
                                    tvRenewDataInfoBean.setBillerIcon(institutionLogo);
                                    tvRenewDataInfoBean.setAccountAmount(Long.valueOf(checkCustomerIdReq != null ? checkCustomerIdReq.businessAmount : 0L));
                                    tvRenewDataInfoBean.setAvailable(Boolean.valueOf(dataBean.available));
                                    tvRenewDataInfoBean.setFullName(dataBean.fullName);
                                    tvRenewDataInfoBean.setReferenceId(dataBean.referenceId);
                                    tvRenewDataInfoBean.setAddress(dataBean.address);
                                    tvRenewDataInfoBean.setMinAmount(Long.valueOf(dataBean.minAmount));
                                    tvRenewDataInfoBean.setRenewalAmount(Long.valueOf(dataBean.renewalAmount));
                                    if (checkCustomerIdReq == null || (str3 = checkCustomerIdReq.viewDoc) == null) {
                                        str3 = "";
                                    }
                                    tvRenewDataInfoBean.setViewDoc(str3);
                                    if (checkCustomerIdReq != null && (str4 = checkCustomerIdReq.viewPic) != null) {
                                        operatorCode = str4;
                                    }
                                    tvRenewDataInfoBean.setViewPic(operatorCode);
                                    tvRenewDataInfoBean.setItems(new ArrayList<>());
                                    List<CheckCustomerIdRsp.Item> list4 = dataBean.items;
                                    if (list4 != null) {
                                        for (CheckCustomerIdRsp.Item item : list4) {
                                            if (item != null && (items = tvRenewDataInfoBean.getItems()) != null) {
                                                items.add(new TvRenewDataInfoBean.Item(item.key, item.value));
                                            }
                                        }
                                    }
                                    g0 g0Var2 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var2 != null && g0Var2.f8317d.isChecked()) {
                                        AddFamilyAccontReq addFamilyAccontReq = new AddFamilyAccontReq();
                                        addFamilyAccontReq.customerId = billPaymentTvHomeFragment.A();
                                        addFamilyAccontReq.itemId = checkCustomerIdReq != null ? checkCustomerIdReq.paymentItemId : null;
                                        addFamilyAccontReq.billerName = checkCustomerIdReq != null ? checkCustomerIdReq.billerName : null;
                                        addFamilyAccontReq.institutionLogo = checkCustomerIdReq != null ? checkCustomerIdReq.icon : null;
                                        addFamilyAccontReq.categoryId = str7;
                                        addFamilyAccontReq.itemName = checkCustomerIdReq != null ? checkCustomerIdReq.paymentItemName : null;
                                        addFamilyAccontReq.billerId = checkCustomerIdReq != null ? checkCustomerIdReq.billerId : null;
                                        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel9 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                        if (billPaymentHomeTvViewModel9 != null) {
                                            p140j8.f.s(billPaymentHomeTvViewModel9, new C1655a0(addFamilyAccontReq, null), billPaymentHomeTvViewModel9.f34413p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                        n0.g().l("PPay_TV_Btn_SaveToBeneficiaries");
                                    }
                                    ARouter.getInstance().build("/quick_teller/tv_home_pre").withSerializable("extra_renew_data", tvRenewDataInfoBean).withString(AppsFlyerProperties.CHANNEL, billPaymentTvHomeFragment.f34303X).navigation();
                                } else {
                                    g0 g0Var3 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var3 != null && (errorTv = g0Var3.f8325v.getErrorTv()) != null) {
                                        errorTv.setText(billPaymentTvHomeFragment.getString(Pd.f.qt_msg_customer_id_invalid, string));
                                    }
                                }
                            }
                        } else {
                            String respCode = rsp2.getRespCode();
                            String respMsg = rsp2.getRespMsg();
                            if (respCode != null) {
                                if (respCode.equalsIgnoreCase("B00015")) {
                                    g0 g0Var4 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var4 != null) {
                                        g0Var4.f8316c.setExpanded(true, true);
                                    }
                                    g0 g0Var5 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var5 != null) {
                                        ModelNumberInputLayout modelNumberInputLayout = g0Var5.f8325v;
                                        operatorCode = respMsg != null ? respMsg : "";
                                        modelNumberInputLayout.setErrorMessage(operatorCode);
                                    }
                                } else if (respCode.equalsIgnoreCase("QK00009")) {
                                    g0 g0Var6 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var6 != null) {
                                        ModelItemSelection modelItemSelection = g0Var6.f8310H;
                                        operatorCode = respMsg != null ? respMsg : "";
                                        modelItemSelection.e(operatorCode);
                                    }
                                } else if (respCode.equalsIgnoreCase("QK000010")) {
                                    String string2 = billPaymentTvHomeFragment.getString(p025ba.k.core_important_notice);
                                    operatorCode = respMsg != null ? respMsg : "";
                                    billPaymentTvHomeFragment.r(string2, operatorCode, billPaymentTvHomeFragment.getString(p025ba.k.core_confirm), null);
                                } else {
                                    billPaymentTvHomeFragment.p(respMsg);
                                }
                            }
                        }
                        return Unit.f38893a;
                }
            }
        }, new Wd.G(21), false, null, 224);
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel8 = (BillPaymentHomeTvViewModel) this.f27333i;
        final int i10 = 1;
        n.B(this, billPaymentHomeTvViewModel8 != null ? billPaymentHomeTvViewModel8.f34408f : null, this, new Function2(this) { // from class: Zd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentTvHomeFragment f11689b;

            {
                this.f11689b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel9;
                String billerId;
                String string;
                TextView errorTv;
                String billerName;
                String billerId2;
                String str;
                String str2;
                String userIdTips;
                String institutionLogo;
                String str3;
                ArrayList<TvRenewDataInfoBean.Item> items;
                String str4;
                String operatorCode = "";
                BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11689b;
                switch (i10) {
                    case 0:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp = (BillerListRsp) obj2;
                        int i11 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            List<BillerListItemBean> list = rsp.data;
                            if (list != null) {
                                billPaymentTvHomeFragment.f34304Y.clear();
                                billPaymentTvHomeFragment.f34304Y.addAll(list);
                                ChannelDataItemBean channelDataItemBean2 = billPaymentTvHomeFragment.f34302Q;
                                if (channelDataItemBean2 != null) {
                                    billPaymentTvHomeFragment.C(true, false, channelDataItemBean2.getBillerId(), channelDataItemBean2.getCustomerId());
                                }
                                String str5 = billPaymentTvHomeFragment.f34301M;
                                if (str5 != null) {
                                    if (TextUtils.isEmpty(str5)) {
                                        str5 = null;
                                    }
                                    if (str5 != null) {
                                        billPaymentTvHomeFragment.C(true, false, str5, "");
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean3 = billPaymentTvHomeFragment.f34302Q;
                                if ((channelDataItemBean3 == null || TextUtils.isEmpty(channelDataItemBean3.getBillerName())) && TextUtils.isEmpty(billPaymentTvHomeFragment.f34301M) && (billPaymentHomeTvViewModel9 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i) != null) {
                                    StringBuilder sb2 = new StringBuilder("queryLastBillerByCategoryId");
                                    String str6 = billPaymentTvHomeFragment.f34300L;
                                    sb2.append(str6);
                                    AbstractC0780y.m(V.h(billPaymentHomeTvViewModel9), null, null, new C1694u0(billPaymentHomeTvViewModel9.f34411j, q0.y(sb2.toString(), "_", BaseApplication.getCountryLocale()), null, str6), 3);
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentTvHomeFragment.E();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        return Unit.f38893a;
                    case 1:
                        TvListByCategoryIdResp result = (TvListByCategoryIdResp) obj2;
                        int i12 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(result, "result");
                        billPaymentTvHomeFragment.F(false);
                        if (result.isSuccess() && result.getData() != null) {
                            ArrayList<TvListByCategoryIdResp.TvCategoryBean> data = result.getData();
                            if (data != null) {
                                billPaymentTvHomeFragment.f34297B = data;
                            }
                            C0786e c0786e = billPaymentTvHomeFragment.f34307p0;
                            if (c0786e != null) {
                                BillerListItemBean billerListItemBean = billPaymentTvHomeFragment.f34306k0;
                                if (billerListItemBean != null && (billerId = billerListItemBean.getBillerId()) != null) {
                                    operatorCode = billerId;
                                }
                                ArrayList list2 = billPaymentTvHomeFragment.f34297B;
                                Intrinsics.checkNotNullParameter(operatorCode, "operatorCode");
                                Intrinsics.checkNotNullParameter(list2, "list");
                                c0786e.f11144o = operatorCode;
                                c0786e.t = list2;
                                HashMap map = c0786e.f11145p;
                                List list3 = (List) map.get(operatorCode);
                                if (list3 != null) {
                                    list3.clear();
                                }
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(list2, 10));
                                int i13 = 0;
                                for (Object obj3 : list2) {
                                    int i14 = i13 + 1;
                                    if (i13 < 0) {
                                        C1850q.k();
                                        throw null;
                                    }
                                    arrayList2.add(Long.valueOf(c0786e.h(i13, (TvListByCategoryIdResp.TvCategoryBean) obj3)));
                                    i13 = i14;
                                }
                                map.put(c0786e.f11144o, CollectionsKt.Z(arrayList2));
                            }
                            g0 g0Var = (g0) billPaymentTvHomeFragment.f27335j;
                            if (g0Var != null) {
                                g0Var.f8313Q.setCurrentItem(0, false);
                            }
                            F6.d.h("BundleFragment", 3, "notifyDataSetChanged");
                            C0786e c0786e2 = billPaymentTvHomeFragment.f34307p0;
                            if (c0786e2 != null) {
                                c0786e2.notifyDataSetChanged();
                            }
                        }
                        return Unit.f38893a;
                    default:
                        CheckCustomerIdReq checkCustomerIdReq = (CheckCustomerIdReq) obj;
                        CheckCustomerIdRsp rsp2 = (CheckCustomerIdRsp) obj2;
                        int i15 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            CheckCustomerIdRsp.DataBean dataBean = rsp2.data;
                            if (dataBean != null) {
                                BillerListItemBean billerListItemBean2 = billPaymentTvHomeFragment.f34306k0;
                                boolean zIsEmpty = TextUtils.isEmpty(billerListItemBean2 != null ? billerListItemBean2.getUserIdTips() : null);
                                String str7 = billPaymentTvHomeFragment.f34300L;
                                if (zIsEmpty) {
                                    string = billPaymentTvHomeFragment.getString(p070ee.c.e(str7));
                                } else {
                                    BillerListItemBean billerListItemBean3 = billPaymentTvHomeFragment.f34306k0;
                                    string = billerListItemBean3 != null ? billerListItemBean3.getUserIdTips() : null;
                                }
                                if (dataBean.available) {
                                    TvRenewDataInfoBean tvRenewDataInfoBean = new TvRenewDataInfoBean();
                                    BillerListItemBean billerListItemBean4 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean4 == null || (billerName = billerListItemBean4.getBillerName()) == null) {
                                        billerName = "";
                                    }
                                    tvRenewDataInfoBean.setBillerName(billerName);
                                    BillerListItemBean billerListItemBean5 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean5 == null || (billerId2 = billerListItemBean5.getBillerId()) == null) {
                                        billerId2 = "";
                                    }
                                    tvRenewDataInfoBean.setBillerId(billerId2);
                                    tvRenewDataInfoBean.setAccountNumber(billPaymentTvHomeFragment.A());
                                    if (checkCustomerIdReq == null || (str = checkCustomerIdReq.paymentItemName) == null) {
                                        str = "";
                                    }
                                    tvRenewDataInfoBean.setPaymentItemName(str);
                                    if (checkCustomerIdReq == null || (str2 = checkCustomerIdReq.paymentItemId) == null) {
                                        str2 = "";
                                    }
                                    tvRenewDataInfoBean.setPaymentItemId(str2);
                                    BillerListItemBean billerListItemBean6 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean6 == null || (userIdTips = billerListItemBean6.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    tvRenewDataInfoBean.setAccountNmberTitleName(userIdTips);
                                    BillerListItemBean billerListItemBean7 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean7 == null || (institutionLogo = billerListItemBean7.getInstitutionLogo()) == null) {
                                        institutionLogo = "";
                                    }
                                    tvRenewDataInfoBean.setBillerIcon(institutionLogo);
                                    tvRenewDataInfoBean.setAccountAmount(Long.valueOf(checkCustomerIdReq != null ? checkCustomerIdReq.businessAmount : 0L));
                                    tvRenewDataInfoBean.setAvailable(Boolean.valueOf(dataBean.available));
                                    tvRenewDataInfoBean.setFullName(dataBean.fullName);
                                    tvRenewDataInfoBean.setReferenceId(dataBean.referenceId);
                                    tvRenewDataInfoBean.setAddress(dataBean.address);
                                    tvRenewDataInfoBean.setMinAmount(Long.valueOf(dataBean.minAmount));
                                    tvRenewDataInfoBean.setRenewalAmount(Long.valueOf(dataBean.renewalAmount));
                                    if (checkCustomerIdReq == null || (str3 = checkCustomerIdReq.viewDoc) == null) {
                                        str3 = "";
                                    }
                                    tvRenewDataInfoBean.setViewDoc(str3);
                                    if (checkCustomerIdReq != null && (str4 = checkCustomerIdReq.viewPic) != null) {
                                        operatorCode = str4;
                                    }
                                    tvRenewDataInfoBean.setViewPic(operatorCode);
                                    tvRenewDataInfoBean.setItems(new ArrayList<>());
                                    List<CheckCustomerIdRsp.Item> list4 = dataBean.items;
                                    if (list4 != null) {
                                        for (CheckCustomerIdRsp.Item item : list4) {
                                            if (item != null && (items = tvRenewDataInfoBean.getItems()) != null) {
                                                items.add(new TvRenewDataInfoBean.Item(item.key, item.value));
                                            }
                                        }
                                    }
                                    g0 g0Var2 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var2 != null && g0Var2.f8317d.isChecked()) {
                                        AddFamilyAccontReq addFamilyAccontReq = new AddFamilyAccontReq();
                                        addFamilyAccontReq.customerId = billPaymentTvHomeFragment.A();
                                        addFamilyAccontReq.itemId = checkCustomerIdReq != null ? checkCustomerIdReq.paymentItemId : null;
                                        addFamilyAccontReq.billerName = checkCustomerIdReq != null ? checkCustomerIdReq.billerName : null;
                                        addFamilyAccontReq.institutionLogo = checkCustomerIdReq != null ? checkCustomerIdReq.icon : null;
                                        addFamilyAccontReq.categoryId = str7;
                                        addFamilyAccontReq.itemName = checkCustomerIdReq != null ? checkCustomerIdReq.paymentItemName : null;
                                        addFamilyAccontReq.billerId = checkCustomerIdReq != null ? checkCustomerIdReq.billerId : null;
                                        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel10 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                        if (billPaymentHomeTvViewModel10 != null) {
                                            p140j8.f.s(billPaymentHomeTvViewModel10, new C1655a0(addFamilyAccontReq, null), billPaymentHomeTvViewModel10.f34413p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                        n0.g().l("PPay_TV_Btn_SaveToBeneficiaries");
                                    }
                                    ARouter.getInstance().build("/quick_teller/tv_home_pre").withSerializable("extra_renew_data", tvRenewDataInfoBean).withString(AppsFlyerProperties.CHANNEL, billPaymentTvHomeFragment.f34303X).navigation();
                                } else {
                                    g0 g0Var3 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var3 != null && (errorTv = g0Var3.f8325v.getErrorTv()) != null) {
                                        errorTv.setText(billPaymentTvHomeFragment.getString(Pd.f.qt_msg_customer_id_invalid, string));
                                    }
                                }
                            }
                        } else {
                            String respCode = rsp2.getRespCode();
                            String respMsg = rsp2.getRespMsg();
                            if (respCode != null) {
                                if (respCode.equalsIgnoreCase("B00015")) {
                                    g0 g0Var4 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var4 != null) {
                                        g0Var4.f8316c.setExpanded(true, true);
                                    }
                                    g0 g0Var5 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var5 != null) {
                                        ModelNumberInputLayout modelNumberInputLayout = g0Var5.f8325v;
                                        operatorCode = respMsg != null ? respMsg : "";
                                        modelNumberInputLayout.setErrorMessage(operatorCode);
                                    }
                                } else if (respCode.equalsIgnoreCase("QK00009")) {
                                    g0 g0Var6 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var6 != null) {
                                        ModelItemSelection modelItemSelection = g0Var6.f8310H;
                                        operatorCode = respMsg != null ? respMsg : "";
                                        modelItemSelection.e(operatorCode);
                                    }
                                } else if (respCode.equalsIgnoreCase("QK000010")) {
                                    String string2 = billPaymentTvHomeFragment.getString(p025ba.k.core_important_notice);
                                    operatorCode = respMsg != null ? respMsg : "";
                                    billPaymentTvHomeFragment.r(string2, operatorCode, billPaymentTvHomeFragment.getString(p025ba.k.core_confirm), null);
                                } else {
                                    billPaymentTvHomeFragment.p(respMsg);
                                }
                            }
                        }
                        return Unit.f38893a;
                }
            }
        }, new v(this, 0), false, null, 224);
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel9 = (BillPaymentHomeTvViewModel) this.f27333i;
        l lVar3 = billPaymentHomeTvViewModel9 != null ? billPaymentHomeTvViewModel9.f34409g : null;
        if (lVar3 != null) {
            lVar3.e(this, new I(new Zd.y(lVar3, this, 1), 5));
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel10 = (BillPaymentHomeTvViewModel) this.f27333i;
        l lVar4 = billPaymentHomeTvViewModel10 != null ? billPaymentHomeTvViewModel10.f34410i : null;
        if (lVar4 != null) {
            lVar4.e(this, new I(new x(this, this), 5));
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel11 = (BillPaymentHomeTvViewModel) this.f27333i;
        final int i11 = 2;
        n.B(this, billPaymentHomeTvViewModel11 != null ? billPaymentHomeTvViewModel11.f34414v : null, this, new Function2(this) { // from class: Zd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentTvHomeFragment f11689b;

            {
                this.f11689b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel12;
                String billerId;
                String string;
                TextView errorTv;
                String billerName;
                String billerId2;
                String str;
                String str2;
                String userIdTips;
                String institutionLogo;
                String str3;
                ArrayList<TvRenewDataInfoBean.Item> items;
                String str4;
                String operatorCode = "";
                BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11689b;
                switch (i11) {
                    case 0:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp = (BillerListRsp) obj2;
                        int i12 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            List<BillerListItemBean> list = rsp.data;
                            if (list != null) {
                                billPaymentTvHomeFragment.f34304Y.clear();
                                billPaymentTvHomeFragment.f34304Y.addAll(list);
                                ChannelDataItemBean channelDataItemBean2 = billPaymentTvHomeFragment.f34302Q;
                                if (channelDataItemBean2 != null) {
                                    billPaymentTvHomeFragment.C(true, false, channelDataItemBean2.getBillerId(), channelDataItemBean2.getCustomerId());
                                }
                                String str5 = billPaymentTvHomeFragment.f34301M;
                                if (str5 != null) {
                                    if (TextUtils.isEmpty(str5)) {
                                        str5 = null;
                                    }
                                    if (str5 != null) {
                                        billPaymentTvHomeFragment.C(true, false, str5, "");
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean3 = billPaymentTvHomeFragment.f34302Q;
                                if ((channelDataItemBean3 == null || TextUtils.isEmpty(channelDataItemBean3.getBillerName())) && TextUtils.isEmpty(billPaymentTvHomeFragment.f34301M) && (billPaymentHomeTvViewModel12 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i) != null) {
                                    StringBuilder sb2 = new StringBuilder("queryLastBillerByCategoryId");
                                    String str6 = billPaymentTvHomeFragment.f34300L;
                                    sb2.append(str6);
                                    AbstractC0780y.m(V.h(billPaymentHomeTvViewModel12), null, null, new C1694u0(billPaymentHomeTvViewModel12.f34411j, q0.y(sb2.toString(), "_", BaseApplication.getCountryLocale()), null, str6), 3);
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentTvHomeFragment.E();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        return Unit.f38893a;
                    case 1:
                        TvListByCategoryIdResp result = (TvListByCategoryIdResp) obj2;
                        int i13 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(result, "result");
                        billPaymentTvHomeFragment.F(false);
                        if (result.isSuccess() && result.getData() != null) {
                            ArrayList<TvListByCategoryIdResp.TvCategoryBean> data = result.getData();
                            if (data != null) {
                                billPaymentTvHomeFragment.f34297B = data;
                            }
                            C0786e c0786e = billPaymentTvHomeFragment.f34307p0;
                            if (c0786e != null) {
                                BillerListItemBean billerListItemBean = billPaymentTvHomeFragment.f34306k0;
                                if (billerListItemBean != null && (billerId = billerListItemBean.getBillerId()) != null) {
                                    operatorCode = billerId;
                                }
                                ArrayList list2 = billPaymentTvHomeFragment.f34297B;
                                Intrinsics.checkNotNullParameter(operatorCode, "operatorCode");
                                Intrinsics.checkNotNullParameter(list2, "list");
                                c0786e.f11144o = operatorCode;
                                c0786e.t = list2;
                                HashMap map = c0786e.f11145p;
                                List list3 = (List) map.get(operatorCode);
                                if (list3 != null) {
                                    list3.clear();
                                }
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(list2, 10));
                                int i14 = 0;
                                for (Object obj3 : list2) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        C1850q.k();
                                        throw null;
                                    }
                                    arrayList2.add(Long.valueOf(c0786e.h(i14, (TvListByCategoryIdResp.TvCategoryBean) obj3)));
                                    i14 = i15;
                                }
                                map.put(c0786e.f11144o, CollectionsKt.Z(arrayList2));
                            }
                            g0 g0Var = (g0) billPaymentTvHomeFragment.f27335j;
                            if (g0Var != null) {
                                g0Var.f8313Q.setCurrentItem(0, false);
                            }
                            F6.d.h("BundleFragment", 3, "notifyDataSetChanged");
                            C0786e c0786e2 = billPaymentTvHomeFragment.f34307p0;
                            if (c0786e2 != null) {
                                c0786e2.notifyDataSetChanged();
                            }
                        }
                        return Unit.f38893a;
                    default:
                        CheckCustomerIdReq checkCustomerIdReq = (CheckCustomerIdReq) obj;
                        CheckCustomerIdRsp rsp2 = (CheckCustomerIdRsp) obj2;
                        int i16 = BillPaymentTvHomeFragment.f34295v0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            CheckCustomerIdRsp.DataBean dataBean = rsp2.data;
                            if (dataBean != null) {
                                BillerListItemBean billerListItemBean2 = billPaymentTvHomeFragment.f34306k0;
                                boolean zIsEmpty = TextUtils.isEmpty(billerListItemBean2 != null ? billerListItemBean2.getUserIdTips() : null);
                                String str7 = billPaymentTvHomeFragment.f34300L;
                                if (zIsEmpty) {
                                    string = billPaymentTvHomeFragment.getString(p070ee.c.e(str7));
                                } else {
                                    BillerListItemBean billerListItemBean3 = billPaymentTvHomeFragment.f34306k0;
                                    string = billerListItemBean3 != null ? billerListItemBean3.getUserIdTips() : null;
                                }
                                if (dataBean.available) {
                                    TvRenewDataInfoBean tvRenewDataInfoBean = new TvRenewDataInfoBean();
                                    BillerListItemBean billerListItemBean4 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean4 == null || (billerName = billerListItemBean4.getBillerName()) == null) {
                                        billerName = "";
                                    }
                                    tvRenewDataInfoBean.setBillerName(billerName);
                                    BillerListItemBean billerListItemBean5 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean5 == null || (billerId2 = billerListItemBean5.getBillerId()) == null) {
                                        billerId2 = "";
                                    }
                                    tvRenewDataInfoBean.setBillerId(billerId2);
                                    tvRenewDataInfoBean.setAccountNumber(billPaymentTvHomeFragment.A());
                                    if (checkCustomerIdReq == null || (str = checkCustomerIdReq.paymentItemName) == null) {
                                        str = "";
                                    }
                                    tvRenewDataInfoBean.setPaymentItemName(str);
                                    if (checkCustomerIdReq == null || (str2 = checkCustomerIdReq.paymentItemId) == null) {
                                        str2 = "";
                                    }
                                    tvRenewDataInfoBean.setPaymentItemId(str2);
                                    BillerListItemBean billerListItemBean6 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean6 == null || (userIdTips = billerListItemBean6.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    tvRenewDataInfoBean.setAccountNmberTitleName(userIdTips);
                                    BillerListItemBean billerListItemBean7 = billPaymentTvHomeFragment.f34306k0;
                                    if (billerListItemBean7 == null || (institutionLogo = billerListItemBean7.getInstitutionLogo()) == null) {
                                        institutionLogo = "";
                                    }
                                    tvRenewDataInfoBean.setBillerIcon(institutionLogo);
                                    tvRenewDataInfoBean.setAccountAmount(Long.valueOf(checkCustomerIdReq != null ? checkCustomerIdReq.businessAmount : 0L));
                                    tvRenewDataInfoBean.setAvailable(Boolean.valueOf(dataBean.available));
                                    tvRenewDataInfoBean.setFullName(dataBean.fullName);
                                    tvRenewDataInfoBean.setReferenceId(dataBean.referenceId);
                                    tvRenewDataInfoBean.setAddress(dataBean.address);
                                    tvRenewDataInfoBean.setMinAmount(Long.valueOf(dataBean.minAmount));
                                    tvRenewDataInfoBean.setRenewalAmount(Long.valueOf(dataBean.renewalAmount));
                                    if (checkCustomerIdReq == null || (str3 = checkCustomerIdReq.viewDoc) == null) {
                                        str3 = "";
                                    }
                                    tvRenewDataInfoBean.setViewDoc(str3);
                                    if (checkCustomerIdReq != null && (str4 = checkCustomerIdReq.viewPic) != null) {
                                        operatorCode = str4;
                                    }
                                    tvRenewDataInfoBean.setViewPic(operatorCode);
                                    tvRenewDataInfoBean.setItems(new ArrayList<>());
                                    List<CheckCustomerIdRsp.Item> list4 = dataBean.items;
                                    if (list4 != null) {
                                        for (CheckCustomerIdRsp.Item item : list4) {
                                            if (item != null && (items = tvRenewDataInfoBean.getItems()) != null) {
                                                items.add(new TvRenewDataInfoBean.Item(item.key, item.value));
                                            }
                                        }
                                    }
                                    g0 g0Var2 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var2 != null && g0Var2.f8317d.isChecked()) {
                                        AddFamilyAccontReq addFamilyAccontReq = new AddFamilyAccontReq();
                                        addFamilyAccontReq.customerId = billPaymentTvHomeFragment.A();
                                        addFamilyAccontReq.itemId = checkCustomerIdReq != null ? checkCustomerIdReq.paymentItemId : null;
                                        addFamilyAccontReq.billerName = checkCustomerIdReq != null ? checkCustomerIdReq.billerName : null;
                                        addFamilyAccontReq.institutionLogo = checkCustomerIdReq != null ? checkCustomerIdReq.icon : null;
                                        addFamilyAccontReq.categoryId = str7;
                                        addFamilyAccontReq.itemName = checkCustomerIdReq != null ? checkCustomerIdReq.paymentItemName : null;
                                        addFamilyAccontReq.billerId = checkCustomerIdReq != null ? checkCustomerIdReq.billerId : null;
                                        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel13 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                        if (billPaymentHomeTvViewModel13 != null) {
                                            p140j8.f.s(billPaymentHomeTvViewModel13, new C1655a0(addFamilyAccontReq, null), billPaymentHomeTvViewModel13.f34413p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                        n0.g().l("PPay_TV_Btn_SaveToBeneficiaries");
                                    }
                                    ARouter.getInstance().build("/quick_teller/tv_home_pre").withSerializable("extra_renew_data", tvRenewDataInfoBean).withString(AppsFlyerProperties.CHANNEL, billPaymentTvHomeFragment.f34303X).navigation();
                                } else {
                                    g0 g0Var3 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var3 != null && (errorTv = g0Var3.f8325v.getErrorTv()) != null) {
                                        errorTv.setText(billPaymentTvHomeFragment.getString(Pd.f.qt_msg_customer_id_invalid, string));
                                    }
                                }
                            }
                        } else {
                            String respCode = rsp2.getRespCode();
                            String respMsg = rsp2.getRespMsg();
                            if (respCode != null) {
                                if (respCode.equalsIgnoreCase("B00015")) {
                                    g0 g0Var4 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var4 != null) {
                                        g0Var4.f8316c.setExpanded(true, true);
                                    }
                                    g0 g0Var5 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var5 != null) {
                                        ModelNumberInputLayout modelNumberInputLayout = g0Var5.f8325v;
                                        operatorCode = respMsg != null ? respMsg : "";
                                        modelNumberInputLayout.setErrorMessage(operatorCode);
                                    }
                                } else if (respCode.equalsIgnoreCase("QK00009")) {
                                    g0 g0Var6 = (g0) billPaymentTvHomeFragment.f27335j;
                                    if (g0Var6 != null) {
                                        ModelItemSelection modelItemSelection = g0Var6.f8310H;
                                        operatorCode = respMsg != null ? respMsg : "";
                                        modelItemSelection.e(operatorCode);
                                    }
                                } else if (respCode.equalsIgnoreCase("QK000010")) {
                                    String string2 = billPaymentTvHomeFragment.getString(p025ba.k.core_important_notice);
                                    operatorCode = respMsg != null ? respMsg : "";
                                    billPaymentTvHomeFragment.r(string2, operatorCode, billPaymentTvHomeFragment.getString(p025ba.k.core_confirm), null);
                                } else {
                                    billPaymentTvHomeFragment.p(respMsg);
                                }
                            }
                        }
                        return Unit.f38893a;
                }
            }
        }, new Wd.G(22), false, null, 240);
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel12 = (BillPaymentHomeTvViewModel) this.f27333i;
        l lVar5 = billPaymentHomeTvViewModel12 != null ? billPaymentHomeTvViewModel12.f34411j : null;
        if (lVar5 != null) {
            lVar5.e(this, new I(new x(this, 0), 5));
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel13 = (BillPaymentHomeTvViewModel) this.f27333i;
        l lVar6 = billPaymentHomeTvViewModel13 != null ? billPaymentHomeTvViewModel13.t : null;
        if (lVar6 != null) {
            lVar6.e(this, new I(new x(this, 1), 5));
        }
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel14 = (BillPaymentHomeTvViewModel) this.f27333i;
        l lVar7 = billPaymentHomeTvViewModel14 != null ? billPaymentHomeTvViewModel14.f34413p : null;
        if (lVar7 != null) {
            lVar7.e(this, new I(new U(5), 5));
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            decorView.post(new H(handlerJ, 14, this, this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ModelNumberInputLayout filter;
        IconicsImageView contactIv;
        AppCompatAutoCompleteTextView numberEdit;
        AppCompatAutoCompleteTextView numberEdit2;
        AppCompatAutoCompleteTextView numberEdit3;
        TextView titleTv;
        ImageView rightImageView1;
        ImageView rightImageView2;
        ImageView backImageView;
        LinearLayout linearLayout;
        final int i7 = 2;
        final int i10 = 1;
        super.o();
        ARouter.getInstance().inject(this);
        org.greenrobot.eventbus.c.b().j(this);
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: Zd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentTvHomeFragment f11685b;

            {
                this.f11685b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11685b;
                switch (i11) {
                    case 0:
                        int i12 = BillPaymentTvHomeFragment.f34295v0;
                        KeyboardUtils.hideSoftInput(billPaymentTvHomeFragment.requireActivity());
                        break;
                    case 1:
                        int i13 = BillPaymentTvHomeFragment.f34295v0;
                        androidx.fragment.app.E eRequireActivity = billPaymentTvHomeFragment.requireActivity();
                        Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                        ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                        break;
                    case 2:
                        int i14 = BillPaymentTvHomeFragment.f34295v0;
                        if (!BaseApplication.hasLogin()) {
                            i0.K(null, null);
                        } else {
                            BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                            if (billPaymentHomeTvViewModel != null) {
                                ArrayList transType = C1850q.e("17");
                                Intrinsics.checkNotNullParameter(transType, "transType");
                                AbstractC0780y.m(V.h(billPaymentHomeTvViewModel), null, null, new A0(billPaymentHomeTvViewModel.f34415w, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                            }
                            n0.g().l("PPay_TV_Btn_TransHistory");
                        }
                        break;
                    case 3:
                        if (!billPaymentTvHomeFragment.f34304Y.isEmpty()) {
                            billPaymentTvHomeFragment.E();
                        } else {
                            BillPaymentHomeTvViewModel billPaymentHomeTvViewModel2 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                            if (billPaymentHomeTvViewModel2 != null) {
                                billPaymentHomeTvViewModel2.d(billPaymentTvHomeFragment.f34300L, true, false);
                            }
                        }
                        break;
                    default:
                        int i15 = BillPaymentTvHomeFragment.f34295v0;
                        Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentTvHomeFragment.f34300L);
                        ARouter aRouter = ARouter.getInstance();
                        Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                        Intrinsics.e(postcardWithString);
                        r0.x(aRouter, billPaymentTvHomeFragment, postcardWithString, 101);
                        n0.g().l("PPay_TV_Btn_Contact");
                        break;
                }
            }
        };
        g0 g0Var = (g0) this.f27335j;
        if (g0Var != null && (linearLayout = g0Var.f8322j) != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
        g0 g0Var2 = (g0) this.f27335j;
        if (g0Var2 != null) {
            g0Var2.f8318e.setOnClickListener(onClickListener);
        }
        g0 g0Var3 = (g0) this.f27335j;
        if (g0Var3 != null) {
            g0Var3.f8311L.setTitle(getString(Vd.a.qt_cable_tv));
        }
        g0 g0Var4 = (g0) this.f27335j;
        if (g0Var4 != null && (backImageView = g0Var4.f8311L.getBackImageView()) != null) {
            backImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Zd.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentTvHomeFragment f11685b;

                {
                    this.f11685b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11685b;
                    switch (i10) {
                        case 0:
                            int i12 = BillPaymentTvHomeFragment.f34295v0;
                            KeyboardUtils.hideSoftInput(billPaymentTvHomeFragment.requireActivity());
                            break;
                        case 1:
                            int i13 = BillPaymentTvHomeFragment.f34295v0;
                            androidx.fragment.app.E eRequireActivity = billPaymentTvHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 2:
                            int i14 = BillPaymentTvHomeFragment.f34295v0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                if (billPaymentHomeTvViewModel != null) {
                                    ArrayList transType = C1850q.e("17");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentHomeTvViewModel), null, null, new A0(billPaymentHomeTvViewModel.f34415w, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_TV_Btn_TransHistory");
                            }
                            break;
                        case 3:
                            if (!billPaymentTvHomeFragment.f34304Y.isEmpty()) {
                                billPaymentTvHomeFragment.E();
                            } else {
                                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel2 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                if (billPaymentHomeTvViewModel2 != null) {
                                    billPaymentHomeTvViewModel2.d(billPaymentTvHomeFragment.f34300L, true, false);
                                }
                            }
                            break;
                        default:
                            int i15 = BillPaymentTvHomeFragment.f34295v0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentTvHomeFragment.f34300L);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentTvHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_TV_Btn_Contact");
                            break;
                    }
                }
            });
        }
        g0 g0Var5 = (g0) this.f27335j;
        if (g0Var5 != null && (rightImageView2 = g0Var5.f8311L.getRightImageView1()) != null) {
            rightImageView2.setImageResource(p025ba.d.core_bill_history_default);
        }
        g0 g0Var6 = (g0) this.f27335j;
        if (g0Var6 != null && (rightImageView1 = g0Var6.f8311L.getRightImageView1()) != null) {
            rightImageView1.setOnClickListener(new View.OnClickListener(this) { // from class: Zd.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentTvHomeFragment f11685b;

                {
                    this.f11685b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11685b;
                    switch (i7) {
                        case 0:
                            int i12 = BillPaymentTvHomeFragment.f34295v0;
                            KeyboardUtils.hideSoftInput(billPaymentTvHomeFragment.requireActivity());
                            break;
                        case 1:
                            int i13 = BillPaymentTvHomeFragment.f34295v0;
                            androidx.fragment.app.E eRequireActivity = billPaymentTvHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 2:
                            int i14 = BillPaymentTvHomeFragment.f34295v0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                if (billPaymentHomeTvViewModel != null) {
                                    ArrayList transType = C1850q.e("17");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentHomeTvViewModel), null, null, new A0(billPaymentHomeTvViewModel.f34415w, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_TV_Btn_TransHistory");
                            }
                            break;
                        case 3:
                            if (!billPaymentTvHomeFragment.f34304Y.isEmpty()) {
                                billPaymentTvHomeFragment.E();
                            } else {
                                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel2 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                if (billPaymentHomeTvViewModel2 != null) {
                                    billPaymentHomeTvViewModel2.d(billPaymentTvHomeFragment.f34300L, true, false);
                                }
                            }
                            break;
                        default:
                            int i15 = BillPaymentTvHomeFragment.f34295v0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentTvHomeFragment.f34300L);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentTvHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_TV_Btn_Contact");
                            break;
                    }
                }
            });
        }
        g0 g0Var7 = (g0) this.f27335j;
        if (g0Var7 != null) {
            final int i12 = 3;
            g0Var7.f8310H.setOnClickListener(new View.OnClickListener(this) { // from class: Zd.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentTvHomeFragment f11685b;

                {
                    this.f11685b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11685b;
                    switch (i12) {
                        case 0:
                            int i13 = BillPaymentTvHomeFragment.f34295v0;
                            KeyboardUtils.hideSoftInput(billPaymentTvHomeFragment.requireActivity());
                            break;
                        case 1:
                            int i14 = BillPaymentTvHomeFragment.f34295v0;
                            androidx.fragment.app.E eRequireActivity = billPaymentTvHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 2:
                            int i15 = BillPaymentTvHomeFragment.f34295v0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                if (billPaymentHomeTvViewModel != null) {
                                    ArrayList transType = C1850q.e("17");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentHomeTvViewModel), null, null, new A0(billPaymentHomeTvViewModel.f34415w, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_TV_Btn_TransHistory");
                            }
                            break;
                        case 3:
                            if (!billPaymentTvHomeFragment.f34304Y.isEmpty()) {
                                billPaymentTvHomeFragment.E();
                            } else {
                                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel2 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                if (billPaymentHomeTvViewModel2 != null) {
                                    billPaymentHomeTvViewModel2.d(billPaymentTvHomeFragment.f34300L, true, false);
                                }
                            }
                            break;
                        default:
                            int i16 = BillPaymentTvHomeFragment.f34295v0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentTvHomeFragment.f34300L);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentTvHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_TV_Btn_Contact");
                            break;
                    }
                }
            });
        }
        g0 g0Var8 = (g0) this.f27335j;
        if (g0Var8 != null && (titleTv = g0Var8.f8325v.getTitleTv()) != null) {
            String str = c.f36289a;
            titleTv.setText(getString(c.e(this.f34300L)));
        }
        if (this.f27319c != null) {
            Intrinsics.checkNotNullParameter(this, "fragment");
            C0786e c0786e = new C0786e(getChildFragmentManager(), getLifecycle());
            c0786e.f11144o = "";
            c0786e.f11145p = new HashMap();
            c0786e.t = new ArrayList();
            this.f34307p0 = c0786e;
            g0 g0Var9 = (g0) this.f27335j;
            if (g0Var9 != null) {
                g0Var9.f8313Q.setAdapter(c0786e);
            }
            g0 g0Var10 = (g0) this.f27335j;
            if (g0Var10 != null) {
                g0Var10.f8313Q.setUserInputEnabled(true);
            }
            g0 g0Var11 = (g0) this.f27335j;
            TabLayout tabLayout = g0Var11 != null ? g0Var11.f8315b : null;
            Intrinsics.e(tabLayout);
            g0 g0Var12 = (g0) this.f27335j;
            ViewPager2 viewPager2 = g0Var12 != null ? g0Var12.f8313Q : null;
            Intrinsics.e(viewPager2);
            new TabLayoutMediator(tabLayout, viewPager2, true, new w(this)).attach();
            g0 g0Var13 = (g0) this.f27335j;
            if (g0Var13 != null) {
                g0Var13.f8313Q.registerOnPageChangeCallback(new A(this));
            }
        }
        g0 g0Var14 = (g0) this.f27335j;
        if (g0Var14 != null && (numberEdit3 = g0Var14.f8325v.getNumberEdit()) != null) {
            numberEdit3.setSingleLine();
        }
        g0 g0Var15 = (g0) this.f27335j;
        if (g0Var15 != null && (numberEdit2 = g0Var15.f8325v.getNumberEdit()) != null) {
            numberEdit2.setImeOptions(6);
        }
        g0 g0Var16 = (g0) this.f27335j;
        if (g0Var16 != null && (numberEdit = g0Var16.f8325v.getNumberEdit()) != null) {
            numberEdit.setOnEditorActionListener(new Oc.A(this, 2));
        }
        g0 g0Var17 = (g0) this.f27335j;
        if (g0Var17 != null) {
            g0Var17.f8325v.setFocusListener(new ViewOnFocusChangeListenerC0235o(this, 10));
        }
        E activity = getActivity();
        if (activity != null) {
            CommonExtKt.softKeyBoardChangeListener(activity, new Wd.G(23), new v(this, 1));
        }
        g0 g0Var18 = (g0) this.f27335j;
        if (g0Var18 != null && (contactIv = g0Var18.f8325v.getContactIv()) != null) {
            final int i13 = 4;
            contactIv.setOnClickListener(new View.OnClickListener(this) { // from class: Zd.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentTvHomeFragment f11685b;

                {
                    this.f11685b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11685b;
                    switch (i13) {
                        case 0:
                            int i14 = BillPaymentTvHomeFragment.f34295v0;
                            KeyboardUtils.hideSoftInput(billPaymentTvHomeFragment.requireActivity());
                            break;
                        case 1:
                            int i15 = BillPaymentTvHomeFragment.f34295v0;
                            androidx.fragment.app.E eRequireActivity = billPaymentTvHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 2:
                            int i16 = BillPaymentTvHomeFragment.f34295v0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                if (billPaymentHomeTvViewModel != null) {
                                    ArrayList transType = C1850q.e("17");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentHomeTvViewModel), null, null, new A0(billPaymentHomeTvViewModel.f34415w, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_TV_Btn_TransHistory");
                            }
                            break;
                        case 3:
                            if (!billPaymentTvHomeFragment.f34304Y.isEmpty()) {
                                billPaymentTvHomeFragment.E();
                            } else {
                                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel2 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                                if (billPaymentHomeTvViewModel2 != null) {
                                    billPaymentHomeTvViewModel2.d(billPaymentTvHomeFragment.f34300L, true, false);
                                }
                            }
                            break;
                        default:
                            int i17 = BillPaymentTvHomeFragment.f34295v0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentTvHomeFragment.f34300L);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentTvHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_TV_Btn_Contact");
                            break;
                    }
                }
            });
        }
        g0 g0Var19 = (g0) this.f27335j;
        if (g0Var19 != null) {
            g0Var19.f8325v.setErrorListener(new Zd.z(this));
        }
        g0 g0Var20 = (g0) this.f27335j;
        if (g0Var20 != null && (filter = g0Var20.f8325v.setFilter(new InputFilter[]{new Tb.a(0), new Tb.c(32, 0)})) != null) {
            filter.build();
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1 && i7 == 101 && intent != null) {
            C(false, true, intent.getStringExtra("extra_data_1"), intent.getStringExtra("customerId"));
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog.CallBack
    public final void onBillerClick(int i7, BillerListItemBean billerListItemBean) {
        g0 g0Var = (g0) this.f27335j;
        if (g0Var != null) {
            g0Var.f8316c.setExpanded(true, true);
        }
        g0 g0Var2 = (g0) this.f27335j;
        if (g0Var2 != null) {
            h.s(g0Var2.f8326w, false);
        }
        B(i7, billerListItemBean, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        org.greenrobot.eventbus.c.b().l(this);
        z().stop();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel;
        if (messageEvent != null && messageEvent.getEventType() == 403 && BaseApplication.hasLogin() && (billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) this.f27333i) != null) {
            billPaymentHomeTvViewModel.e();
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ModelAvailableCouponItem modelAvailableCouponItem = this.f34305Z;
        if (modelAvailableCouponItem != null) {
            modelAvailableCouponItem.e();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Pd.d.qt_fragment_bill_payment_home_tv, viewGroup, false);
        int i7 = Pd.c.bill_category_tabs;
        TabLayout tabLayout = (TabLayout) p059e1.a.m(i7, viewInflate);
        if (tabLayout != null) {
            i7 = Pd.c.bundle_app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) p059e1.a.m(i7, viewInflate);
            if (appBarLayout != null) {
                i7 = Pd.c.cb_save_to_beneficiaries;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) p059e1.a.m(i7, viewInflate);
                if (appCompatCheckBox != null) {
                    i7 = Pd.c.clBody;
                    ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                    if (constraintLayout != null) {
                        i7 = Pd.c.coordinatorBody;
                        if (((CoordinatorLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = Pd.c.cpi_biller_loading;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) p059e1.a.m(i7, viewInflate);
                            if (circularProgressIndicator != null && (viewM = p059e1.a.m((i7 = Pd.c.cpi_biller_loading_bg), viewInflate)) != null) {
                                i7 = Pd.c.iv_check_customer;
                                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                if (imageView != null) {
                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                    i7 = Pd.c.ll_check_customer;
                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                    if (linearLayout2 != null) {
                                        i7 = Pd.c.ll_save_to_beneficiary;
                                        LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                        if (linearLayout3 != null) {
                                            i7 = Pd.c.llSelectBiller;
                                            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                i7 = Pd.c.model_available_point_item;
                                                ModelAvailablePointItem modelAvailablePointItem = (ModelAvailablePointItem) p059e1.a.m(i7, viewInflate);
                                                if (modelAvailablePointItem != null) {
                                                    i7 = Pd.c.modelBillNoticeItem;
                                                    if (((ModelBillNoticeItem) p059e1.a.m(i7, viewInflate)) != null) {
                                                        i7 = Pd.c.model_input_customer;
                                                        ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) p059e1.a.m(i7, viewInflate);
                                                        if (modelNumberInputLayout != null) {
                                                            i7 = Pd.c.model_renew_item;
                                                            ModelTvRenewItem modelTvRenewItem = (ModelTvRenewItem) p059e1.a.m(i7, viewInflate);
                                                            if (modelTvRenewItem != null) {
                                                                i7 = Pd.c.operatorMsgLayout;
                                                                ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) p059e1.a.m(i7, viewInflate);
                                                                if (modelBillerTipsInfo != null) {
                                                                    i7 = Pd.c.qt_tv_coupon;
                                                                    ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                    if (viewStub != null) {
                                                                        i7 = Pd.c.sav_biller_pocker_banner;
                                                                        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
                                                                        if (singleAdView != null) {
                                                                            i7 = Pd.c.space;
                                                                            if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                i7 = Pd.c.tev_select_biller;
                                                                                ModelItemSelection modelItemSelection = (ModelItemSelection) p059e1.a.m(i7, viewInflate);
                                                                                if (modelItemSelection != null) {
                                                                                    i7 = Pd.c.titleBar;
                                                                                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                                    if (ppTitleBar != null) {
                                                                                        i7 = Pd.c.tv_check_customer;
                                                                                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView != null) {
                                                                                            i7 = Pd.c.view_top_tab_bg;
                                                                                            if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                i7 = Pd.c.vp_tv_category;
                                                                                                ViewPager2 viewPager2 = (ViewPager2) p059e1.a.m(i7, viewInflate);
                                                                                                if (viewPager2 != null) {
                                                                                                    g0 g0Var = new g0(linearLayout, tabLayout, appBarLayout, appCompatCheckBox, constraintLayout, circularProgressIndicator, viewM, imageView, linearLayout, linearLayout2, linearLayout3, modelAvailablePointItem, modelNumberInputLayout, modelTvRenewItem, modelBillerTipsInfo, viewStub, singleAdView, modelItemSelection, ppTitleBar, textView, viewPager2);
                                                                                                    Intrinsics.checkNotNullExpressionValue(g0Var, "inflate(...)");
                                                                                                    return g0Var;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment
    public final P0 u() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        P0 p3 = new P0(contextRequireContext);
        g0 g0Var = (g0) this.f27335j;
        p3.f13251f = g0Var != null ? g0Var.f8318e : null;
        p3.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_common_tips));
        Zd.t listener = new Zd.t(this, 2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p3.f13247b = listener;
        return p3;
    }

    public final void w(String str, QueryCustomerIdIsExitResp.DataBean dataBean) {
        String billerId;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo;
        QueryCustomerIdIsExitResp.RenewalInfoBean renewalInfo;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo2;
        QueryCustomerIdIsExitResp.RenewalInfoBean renewalInfo2;
        Long renewalAmount;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo3;
        String strA = A();
        BillerListItemBean billerListItemBean = this.f34306k0;
        if (billerListItemBean == null || (billerId = billerListItemBean.getBillerId()) == null) {
            billerId = "";
        }
        String strR = C0.G.r(u.s(strA), this.f34300L, billerId);
        if (y.h(strR, str, true)) {
            g0 g0Var = (g0) this.f27335j;
            if (g0Var != null) {
                h.s(g0Var.f8324p, dataBean != null ? Intrinsics.c(dataBean.getFamilyAccountExist(), Boolean.FALSE) : false);
            }
        } else {
            g0 g0Var2 = (g0) this.f27335j;
            if (g0Var2 != null) {
                h.s(g0Var2.f8324p, true);
            }
        }
        if (y.h(strR, str, true)) {
            x(dataBean != null ? dataBean.getCustomerInfo() : null, dataBean != null ? dataBean.getCustomerId() : null, dataBean != null ? dataBean.getErrorInfo() : null, false);
            if (dataBean != null) {
                BillerListItemBean billerListItemBean2 = this.f34306k0;
                dataBean.setUserIdTips(billerListItemBean2 != null ? billerListItemBean2.getUserIdTips() : null);
            }
            g0 g0Var3 = (g0) this.f27335j;
            if (g0Var3 != null) {
                ModelTvRenewItem modelTvRenewItem = g0Var3.f8326w;
                if ((dataBean == null || (customerInfo3 = dataBean.getCustomerInfo()) == null) ? false : Intrinsics.c(customerInfo3.getAvailable(), Boolean.TRUE)) {
                    if (((dataBean == null || (customerInfo2 = dataBean.getCustomerInfo()) == null || (renewalInfo2 = customerInfo2.getRenewalInfo()) == null || (renewalAmount = renewalInfo2.getRenewalAmount()) == null) ? 0L : renewalAmount.longValue()) > 0) {
                        h.s(modelTvRenewItem, true);
                        if (dataBean == null || (customerInfo = dataBean.getCustomerInfo()) == null || (renewalInfo = customerInfo.getRenewalInfo()) == null) {
                            return;
                        }
                        boolean zIsEmpty = TextUtils.isEmpty(renewalInfo.getItemName());
                        Bc.k kVar = modelTvRenewItem.f34349a;
                        if (!zIsEmpty && kVar != null) {
                            ((TextView) kVar.f752f).setText(renewalInfo.getItemName());
                        }
                        SpanUtils spanUtils = new SpanUtils();
                        Long price = renewalInfo.getPrice();
                        SpanUtils spanUtilsAppend = spanUtils.append(r0.B(price != null ? price.longValue() : 0L, false));
                        String string = modelTvRenewItem.getContext().getString(f.qt_due_date);
                        String dueDate = renewalInfo.getDueDate();
                        SpannableStringBuilder spannableStringBuilderCreate = spanUtilsAppend.append(" | " + string + (dueDate != null ? dueDate : "")).create();
                        if (kVar != null) {
                            ((TextView) kVar.f749c).setText(spannableStringBuilderCreate);
                        }
                        if (kVar != null) {
                            ((PpButton) kVar.f751e).setOnClickListener(new i(dataBean, 14));
                            return;
                        }
                        return;
                    }
                }
                h.s(modelTvRenewItem, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    public final void x(QueryCustomerIdIsExitResp.CustomerInfoBean customerInfoBean, String str, String str2, boolean z3) {
        g0 g0Var;
        g0 g0Var2 = (g0) this.f27335j;
        if (g0Var2 != null) {
            g0Var2.f8325v.setErrorMessage("");
        }
        if (z3) {
            g0 g0Var3 = (g0) this.f27335j;
            if (g0Var3 != null) {
                h.s(g0Var3.f8323o, true);
            }
            g0 g0Var4 = (g0) this.f27335j;
            if (g0Var4 != null) {
                g0Var4.f8321i.setImageDrawable(z());
            }
            g0 g0Var5 = (g0) this.f27335j;
            if (g0Var5 != null) {
                g0Var5.f8312M.setText(getString(f.qt_verifying_account_loading));
            }
            if (!z().f17896d.isRunning()) {
                z().start();
            }
            Unit unit = Unit.f38893a;
            return;
        }
        z().stop();
        if (!TextUtils.isEmpty(str2)) {
            g0 g0Var6 = (g0) this.f27335j;
            if (g0Var6 != null) {
                h.s(g0Var6.f8323o, false);
            }
            g0 g0Var7 = (g0) this.f27335j;
            if (g0Var7 != null) {
                g0Var7.f8325v.setErrorMessage(str2);
                Unit unit2 = Unit.f38893a;
                return;
            }
            return;
        }
        if (customerInfoBean != null) {
            Unit unit3 = null;
            if (str == null) {
                g0Var = (g0) this.f27335j;
                if (g0Var != null) {
                    h.s(g0Var.f8323o, false);
                    unit3 = Unit.f38893a;
                }
            } else {
                g0 g0Var8 = (g0) this.f27335j;
                if (str.equalsIgnoreCase(g0Var8 != null ? g0Var8.f8325v.getNumber() : null)) {
                    g0 g0Var9 = (g0) this.f27335j;
                    if (g0Var9 != null) {
                        h.s(g0Var9.f8323o, true);
                    }
                    g0 g0Var10 = (g0) this.f27335j;
                    if (g0Var10 != null) {
                        g0Var10.f8312M.setText(!TextUtils.isEmpty(customerInfoBean.getFullName()) ? customerInfoBean.getFullName() : getString(f.qt_verifying_success));
                    }
                    g0 g0Var11 = (g0) this.f27335j;
                    if (g0Var11 != null) {
                        g0Var11.f8321i.setImageResource(r.cv_select_circle_purple);
                        unit3 = Unit.f38893a;
                    }
                } else {
                    g0Var = (g0) this.f27335j;
                    if (g0Var != null) {
                        h.s(g0Var.f8323o, false);
                        unit3 = Unit.f38893a;
                    }
                }
            }
            if (unit3 != null) {
                return;
            }
        }
        g0 g0Var12 = (g0) this.f27335j;
        if (g0Var12 != null) {
            h.s(g0Var12.f8323o, false);
            Unit unit4 = Unit.f38893a;
        }
    }

    public final void y() {
        String billerId;
        if (TextUtils.isEmpty(A()) || A().length() < this.f34313v || this.f34306k0 == null) {
            x(null, null, null, false);
            g0 g0Var = (g0) this.f27335j;
            if (g0Var != null) {
                h.s(g0Var.f8326w, false);
            }
            g0 g0Var2 = (g0) this.f27335j;
            if (g0Var2 != null) {
                h.s(g0Var2.f8324p, true);
                return;
            }
            return;
        }
        String strA = A();
        BillerListItemBean billerListItemBean = this.f34306k0;
        if (billerListItemBean == null || (billerId = billerListItemBean.getBillerId()) == null) {
            billerId = "";
        }
        String strR = C0.G.r(u.s(strA), this.f34300L, billerId);
        HashMap map = this.f34311t0;
        if (map.containsKey(strR)) {
            w(strR, (QueryCustomerIdIsExitResp.DataBean) map.get(strR));
            return;
        }
        x(null, null, null, true);
        BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) this.f27333i;
        if (billPaymentHomeTvViewModel != null) {
            String customerID = A();
            BillerListItemBean billerListItemBean2 = this.f34306k0;
            String billerId2 = billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null;
            BillerListItemBean billerListItemBean3 = this.f34306k0;
            String billerName = billerListItemBean3 != null ? billerListItemBean3.getBillerName() : null;
            Intrinsics.checkNotNullParameter(customerID, "customerID");
            String categoryId = this.f34300L;
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            if (BaseApplication.hasLogin()) {
                String strY = q0.y(customerID, categoryId, billerId2);
                t0 t0Var = billPaymentHomeTvViewModel.f34405A;
                if (t0Var != null && t0Var.isActive()) {
                    F6.d.h("QueryFamilyAccountIsExit cancel", 3, new Object[0]);
                    t0 t0Var2 = billPaymentHomeTvViewModel.f34405A;
                    if (t0Var2 != null) {
                        t0Var2.cancel((CancellationException) null);
                    }
                }
                String strO = C0.G.o("queryFamilyAccountIsExitByCategoryId", strY);
                l lVar = billPaymentHomeTvViewModel.f34406B;
                lVar.f27356m = strY;
                billPaymentHomeTvViewModel.f34405A = AbstractC0780y.m(V.h(billPaymentHomeTvViewModel), null, null, new C1683o0(lVar, q0.y(strO, "_", BaseApplication.getCountryLocale()), null, categoryId, billerId2, billerName, customerID), 3);
            }
        }
    }

    public final androidx.swiperefreshlayout.widget.c z() {
        return (androidx.swiperefreshlayout.widget.c) this.f34312u0.getValue();
    }
}
