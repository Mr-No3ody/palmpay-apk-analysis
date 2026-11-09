package com.transsnet.palmpay.airtime.ui.fragment;

import C0.C0127t;
import E0.h;
import L6.b;
import Oc.C0499b;
import Pa.H;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Rd.c0;
import Wf.AbstractC0780y;
import Wf.t0;
import Zd.D;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.bean.req.AddScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRemark;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRsp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpConfigInfoBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpRecommendBean;
import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.bean.TopUpHistoryDataResp;
import com.transsnet.palmpay.core.viewmodel.DataBundleRecordHistoryViewModel;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import kotlin.text.y;
import m9.e;
import m9.g;
import m9.j;
import m9.k;
import o9.K;
import o9.L;
import o9.N;
import o9.W;
import o9.j0;
import p054dd.q;
import p140j8.f;
import p155k9.i;
import p155k9.l;
import p171lb.d;
import p355xf.C2131j;
import p355xf.EnumC2132k;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpAddTaskFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/c0;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTopUpAddTaskFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTopUpAddTaskFragment.kt\ncom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpAddTaskFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,761:1\n172#2,9:762\n172#2,9:771\n106#2,15:786\n33#3,3:780\n33#3,3:783\n1869#4:801\n295#4,2:802\n1870#4:804\n1563#4:830\n1634#4,3:831\n1#5:805\n383#6:806\n401#6:807\n115#6,8:808\n145#6:816\n115#6,8:817\n145#6:825\n152#6:826\n169#6:827\n383#6:828\n401#6:829\n*S KotlinDebug\n*F\n+ 1 ScheduleTopUpAddTaskFragment.kt\ncom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpAddTaskFragment\n*L\n90#1:762,9\n91#1:771,9\n117#1:786,15\n95#1:780,3\n103#1:783,3\n214#1:801\n216#1:802,2\n214#1:804\n422#1:830\n422#1:831,3\n631#1:806\n631#1:807\n643#1:808,8\n643#1:816\n714#1:817,8\n714#1:825\n729#1:826\n729#1:827\n750#1:828\n750#1:829\n*E\n"})
public final class ScheduleTopUpAddTaskFragment extends BaseMvvmVBFragment<ScheduleTopUpViewModel, c0> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f26549q0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ScheduleTopUpAmountItemBean f26552C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f26553H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f26554L;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public QueryAirtimeV2Rsp.DataBean f26556Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final b0 f26557X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f26558Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f26559Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f26560k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f26563p0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ScheduleTopUpAmountItemRsp f26565w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f26561o = 102;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f26562p = p002a.a.h(this, G.a(K.class), new j(this, 0), new j(this, 1), new j(this, 2));
    public final b0 t = p002a.a.h(this, G.a(L.class), new j(this, 3), new j(this, 4), new j(this, 5));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f26564v = Boolean.FALSE;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final k f26550A = new k(this, 0);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final k f26551B = new k(this, 1);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public List f26555M = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        r rVar = new r("mDateMode", "getMDateMode()I", ScheduleTopUpAddTaskFragment.class);
        G.f38952a.getClass();
        f26549q0 = new KProperty[]{rVar, new r("mDateIndex", "getMDateIndex()I", ScheduleTopUpAddTaskFragment.class)};
        new a(null);
    }

    public ScheduleTopUpAddTaskFragment() {
        Lazy lazyA = C2131j.a(EnumC2132k.f43971c, new C0127t(new j(this, 6), 17));
        this.f26557X = p002a.a.h(this, G.a(DataBundleRecordHistoryViewModel.class), new D(lazyA, 8), new D(lazyA, 9), new h(6, this, lazyA));
        this.f26558Y = C2131j.b(new d(9));
        this.f26559Z = C2131j.b(new d(10));
        this.f26560k0 = C2131j.b(new d(11));
        this.f26563p0 = C2131j.b(new p068ec.d(this, 9));
    }

    public static final void u(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment, String str) {
        Object next;
        QueryAirtimeV2Rsp.DataBean dataBean = scheduleTopUpAddTaskFragment.f26556Q;
        if (dataBean == null || !y.h(str, dataBean.getNetwork(), true)) {
            QueryAirtimeV2Rsp.DataBean dataBean2 = null;
            if (!scheduleTopUpAddTaskFragment.f26555M.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    dataBean2 = (QueryAirtimeV2Rsp.DataBean) scheduleTopUpAddTaskFragment.f26555M.get(0);
                } else {
                    Iterator it = scheduleTopUpAddTaskFragment.f26555M.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!y.h(((QueryAirtimeV2Rsp.DataBean) next).getName(), str, true));
                    QueryAirtimeV2Rsp.DataBean dataBean3 = (QueryAirtimeV2Rsp.DataBean) next;
                    if (dataBean3 != null) {
                        dataBean3.setIndexInList(Integer.valueOf(scheduleTopUpAddTaskFragment.f26555M.indexOf(dataBean3)));
                        dataBean2 = dataBean3;
                    }
                    if (dataBean2 == null) {
                        dataBean2 = (QueryAirtimeV2Rsp.DataBean) scheduleTopUpAddTaskFragment.f26555M.get(0);
                    }
                }
            }
            if (dataBean2 != null) {
                c0 c0Var = (c0) scheduleTopUpAddTaskFragment.f27335j;
                if (c0Var != null) {
                    c0Var.f8230e.updateSelectItem(dataBean2);
                }
                scheduleTopUpAddTaskFragment.A(dataBean2);
            }
        }
    }

    public static final void v(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            scheduleTopUpAddTaskFragment.y().a(-1);
            scheduleTopUpAddTaskFragment.y().setList(null);
        } else {
            scheduleTopUpAddTaskFragment.y().setList(list2);
            scheduleTopUpAddTaskFragment.E((List) ((L) scheduleTopUpAddTaskFragment.t.getValue()).f40123e.d());
            scheduleTopUpAddTaskFragment.y().a(0);
            scheduleTopUpAddTaskFragment.f26552C = (ScheduleTopUpAmountItemBean) scheduleTopUpAddTaskFragment.y().getItem(0);
        }
    }

    public static final void w(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment, int i7) {
        scheduleTopUpAddTaskFragment.f26550A.setValue(scheduleTopUpAddTaskFragment, f26549q0[0], Integer.valueOf(i7));
    }

    public final void A(QueryAirtimeV2Rsp.DataBean dataBean) {
        this.f26556Q = dataBean;
        this.f26552C = null;
        y().a(-1);
        String billerId = dataBean.getNetwork();
        if (billerId != null) {
            ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
            if (scheduleTopUpViewModel != null) {
                Object value = this.f26558Y.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                String memberId = (String) value;
                Intrinsics.checkNotNullParameter(memberId, "memberId");
                Intrinsics.checkNotNullParameter(billerId, "billerId");
                f.s(scheduleTopUpViewModel, new o9.c0(memberId, billerId, null), scheduleTopUpViewModel.f26637L, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
            ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) this.f27333i;
            if (scheduleTopUpViewModel2 != null) {
                scheduleTopUpViewModel2.g(billerId);
            }
        }
    }

    public final void B(String str) {
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
        if (scheduleTopUpViewModel == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strB = H.b(C0.G.o("queryMobileWalletTypeByPhone", str));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        AbstractC0780y.m(V.h(scheduleTopUpViewModel), null, null, new j0(scheduleTopUpViewModel.t, C0.G.p("Pref_", strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void C(String str) {
        if (this.f26555M.isEmpty()) {
            z(new Hb.L(22, this, str));
        } else {
            B(str);
        }
    }

    public final void D(int i7) {
        this.f26551B.setValue(this, f26549q0[1], Integer.valueOf(i7));
    }

    public final void E(List list) {
        Iterator<T> it = y().getData().iterator();
        while (it.hasNext()) {
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = (ScheduleTopUpAmountItemBean) it.next();
            ScheduleTopUpAmountItemRemark scheduleTopUpAmountItemRemark = null;
            Object obj = null;
            if (list != null) {
                for (Object obj2 : list) {
                    ScheduleTopUpAmountItemRemark scheduleTopUpAmountItemRemark2 = (ScheduleTopUpAmountItemRemark) obj2;
                    if (Intrinsics.c(scheduleTopUpAmountItemRemark2.getBillerId(), scheduleTopUpAmountItemBean.getBillerId()) && Intrinsics.c(scheduleTopUpAmountItemRemark2.getItemId(), scheduleTopUpAmountItemBean.getItemId())) {
                        obj = obj2;
                        break;
                    }
                }
                scheduleTopUpAmountItemRemark = (ScheduleTopUpAmountItemRemark) obj;
            }
            if (scheduleTopUpAmountItemRemark != null) {
                scheduleTopUpAmountItemBean.setRewardsRateText(scheduleTopUpAmountItemRemark.getRewardsRateText());
            } else {
                scheduleTopUpAmountItemBean.setRewardsRateText("");
            }
        }
        y().notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        c0 c0Var;
        ImageView contactIv;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26564v = Boolean.valueOf(arguments.getBoolean("extra_type", false));
            this.f26554L = arguments.getString("key_phone", "");
        }
        final int i7 = 1;
        ((DataBundleRecordHistoryViewModel) this.f26557X.getValue()).f28220e.e(this, new q(new Function1(this) { // from class: m9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTopUpAddTaskFragment f39556b;

            {
                this.f39556b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                c0 c0Var2;
                TextView textView;
                ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39556b;
                switch (i7) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                        scheduleTopUpAddTaskFragment.E((List) obj);
                        break;
                    case 1:
                        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                        KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof com.transsnet.palmpay.core.base.p) {
                            com.transsnet.palmpay.core.base.p pVar = (com.transsnet.palmpay.core.base.p) it;
                            if (((TopUpHistoryDataResp) pVar.f27360a).isSuccess() && (c0Var2 = (c0) scheduleTopUpAddTaskFragment.f27335j) != null) {
                                c0Var2.f8230e.initModelInputRegexData(((TopUpHistoryDataResp) pVar.f27360a).getData(), new a(scheduleTopUpAddTaskFragment, 2), new a(scheduleTopUpAddTaskFragment, 3));
                            }
                        }
                        break;
                    default:
                        ScheduleTopUpConfigInfoBean scheduleTopUpConfigInfoBean = (ScheduleTopUpConfigInfoBean) obj;
                        KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                        c0 c0Var3 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                        if (c0Var3 != null && (textView = c0Var3.f8235o) != null) {
                            textView.setText(scheduleTopUpConfigInfoBean.getRemark());
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, 12));
        c0 c0Var2 = (c0) this.f27335j;
        if (c0Var2 != null) {
            c0Var2.f8230e.setOnNumberInputListener(new org.greenrobot.eventbus.f(this, 17));
        }
        c0 c0Var3 = (c0) this.f27335j;
        if (c0Var3 != null && (contactIv = c0Var3.f8230e.getContactIv()) != null) {
            final int i10 = 0;
            contactIv.setOnClickListener(new View.OnClickListener(this) { // from class: m9.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpAddTaskFragment f39558b;

                {
                    this.f39558b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long price;
                    ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39558b;
                    switch (i10) {
                        case 0:
                            KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                            Postcard postcardWithString = ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", "04");
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, scheduleTopUpAddTaskFragment, postcardWithString, 1812);
                            n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Beneficiaries");
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                            if (!r0.U0()) {
                                ((WeekAndDaySelectDialog) scheduleTopUpAddTaskFragment.f26563p0.getValue()).show();
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Top_Up_Date");
                                break;
                            }
                            break;
                        default:
                            KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                            if (!r0.U0()) {
                                if (scheduleTopUpAddTaskFragment.x()) {
                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = scheduleTopUpAddTaskFragment.f26552C;
                                    if (scheduleTopUpAmountItemBean == null) {
                                        ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_please_select_amount_item), new Object[0]);
                                    } else {
                                        Boolean suspend = scheduleTopUpAmountItemBean.getSuspend();
                                        Boolean bool = Boolean.TRUE;
                                        if (Intrinsics.c(suspend, bool)) {
                                            ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_this_amount_item_is_suspend), new Object[0]);
                                        } else {
                                            QueryAirtimeV2Rsp.DataBean dataBean = scheduleTopUpAddTaskFragment.f26556Q;
                                            String network = dataBean != null ? dataBean.getNetwork() : null;
                                            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean2 = scheduleTopUpAddTaskFragment.f26552C;
                                            if (y.h(network, scheduleTopUpAmountItemBean2 != null ? scheduleTopUpAmountItemBean2.getBillerId() : null, true)) {
                                                c0 c0Var4 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                if (c0Var4 == null || c0Var4.f8227b.isChecked()) {
                                                    AddScheduleTopUpTaskReq req = new AddScheduleTopUpTaskReq();
                                                    Object value = scheduleTopUpAddTaskFragment.f26558Y.getValue();
                                                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                                    req.setMemberId((String) value);
                                                    PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                                                    c0 c0Var5 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                    String strV0 = r0.v0(phoneBaseNumberUtils.getValidMobileNumber(c0Var5 != null ? c0Var5.f8230e.getPhoneNumber() : null, BaseApplication.getCountryLocale()));
                                                    if (strV0 != null) {
                                                        req.setPhone(strV0);
                                                    }
                                                    req.setTagName(scheduleTopUpAddTaskFragment.f26553H);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean3 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerId(scheduleTopUpAmountItemBean3 != null ? scheduleTopUpAmountItemBean3.getBillerId() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean4 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerName(scheduleTopUpAmountItemBean4 != null ? scheduleTopUpAmountItemBean4.getBillerName() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean5 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerLogo(scheduleTopUpAmountItemBean5 != null ? scheduleTopUpAmountItemBean5.getBillerLogo() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean6 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setItemId(scheduleTopUpAmountItemBean6 != null ? scheduleTopUpAmountItemBean6.getItemId() : null);
                                                    KProperty<?>[] kPropertyArr4 = ScheduleTopUpAddTaskFragment.f26549q0;
                                                    req.setTimeType(Integer.valueOf(((Number) scheduleTopUpAddTaskFragment.f26550A.getValue(scheduleTopUpAddTaskFragment, kPropertyArr4[0])).intValue()));
                                                    req.setTimeValue(Integer.valueOf(((Number) scheduleTopUpAddTaskFragment.f26551B.getValue(scheduleTopUpAddTaskFragment, kPropertyArr4[1])).intValue()));
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean7 = scheduleTopUpAddTaskFragment.f26552C;
                                                    if (scheduleTopUpAmountItemBean7 == null || (price = scheduleTopUpAmountItemBean7.getPrice()) == null) {
                                                        price = 0L;
                                                    }
                                                    req.setRechargeAmount(price);
                                                    req.setVerifyNetwork(bool);
                                                    ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) scheduleTopUpAddTaskFragment.f27333i;
                                                    if (scheduleTopUpViewModel != null) {
                                                        Intrinsics.checkNotNullParameter(req, "req");
                                                        if (BaseApplication.hasLogin()) {
                                                            N n10 = new N(req, null);
                                                            com.transsnet.palmpay.core.base.l lVar = scheduleTopUpViewModel.f26649w;
                                                            lVar.f27356m = req;
                                                            Unit unit = Unit.f38893a;
                                                            p140j8.f.v(scheduleTopUpViewModel, n10, lVar, 0L);
                                                        }
                                                    }
                                                } else {
                                                    c0 c0Var6 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                    if (c0Var6 != null) {
                                                        IconicsCheckBox iconicsCheckBox = c0Var6.f8227b;
                                                        String string = scheduleTopUpAddTaskFragment.getString(Pd.f.qt_please_agree_agreement);
                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                        LifecycleOwner viewLifecycleOwner = scheduleTopUpAddTaskFragment.getViewLifecycleOwner();
                                                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                                        CommonViewExtKt.showBalloon(iconicsCheckBox, string, viewLifecycleOwner, (2089452 & 4) != 0 ? iconicsCheckBox : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : L6.b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                                    }
                                                }
                                            } else {
                                                ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_this_biller_id_is_not_match), new Object[0]);
                                            }
                                        }
                                    }
                                }
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Confirm");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        z(null);
        final int i11 = 0;
        ((L) this.t.getValue()).f40123e.e(this, new q(new Function1(this) { // from class: m9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTopUpAddTaskFragment f39556b;

            {
                this.f39556b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                c0 c0Var4;
                TextView textView;
                ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39556b;
                switch (i11) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                        scheduleTopUpAddTaskFragment.E((List) obj);
                        break;
                    case 1:
                        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                        KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof com.transsnet.palmpay.core.base.p) {
                            com.transsnet.palmpay.core.base.p pVar = (com.transsnet.palmpay.core.base.p) it;
                            if (((TopUpHistoryDataResp) pVar.f27360a).isSuccess() && (c0Var4 = (c0) scheduleTopUpAddTaskFragment.f27335j) != null) {
                                c0Var4.f8230e.initModelInputRegexData(((TopUpHistoryDataResp) pVar.f27360a).getData(), new a(scheduleTopUpAddTaskFragment, 2), new a(scheduleTopUpAddTaskFragment, 3));
                            }
                        }
                        break;
                    default:
                        ScheduleTopUpConfigInfoBean scheduleTopUpConfigInfoBean = (ScheduleTopUpConfigInfoBean) obj;
                        KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                        c0 c0Var5 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                        if (c0Var5 != null && (textView = c0Var5.f8235o) != null) {
                            textView.setText(scheduleTopUpConfigInfoBean.getRemark());
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, 12));
        c0 c0Var4 = (c0) this.f27335j;
        if (c0Var4 != null) {
            c0Var4.f8231f.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        c0 c0Var5 = (c0) this.f27335j;
        if (c0Var5 != null) {
            c0Var5.f8231f.addItemDecoration(new i());
        }
        c0 c0Var6 = (c0) this.f27335j;
        if (c0Var6 != null) {
            c0Var6.f8231f.setAdapter(y());
        }
        p155k9.j jVarY = y();
        ModelEmptyView modelEmptyView = new ModelEmptyView(getContext());
        modelEmptyView.f31511b.setImageResource(com.transsnet.palmpay.custom_view.r.cv_empty_no_transaction_history);
        modelEmptyView.f31512c.setText(Pd.f.qt_no_data);
        modelEmptyView.f31512c.setTextColor(modelEmptyView.getContext().getColor(b.ppColorTextPrimary));
        modelEmptyView.setBackgroundColor(modelEmptyView.getContext().getColor(b.ppColorBackgroundLight));
        jVarY.setEmptyView(modelEmptyView);
        p155k9.j jVarY2 = y();
        if (jVarY2 != null) {
            final int i12 = 1;
            jVarY2.setOnItemClickListener(new OnItemClickListener(this) { // from class: m9.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpAddTaskFragment f39554b;

                {
                    this.f39554b = this;
                }

                @Override // com.chad.library.adapter.base.listener.OnItemClickListener
                public final void onItemClick(M1.j jVar, View view, int i13) {
                    ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39554b;
                    switch (i12) {
                        case 0:
                            KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(view, "<unused var>");
                            if (!r0.U0()) {
                                ScheduleTopUpRecommendBean scheduleTopUpRecommendBean = (ScheduleTopUpRecommendBean) ((p155k9.l) scheduleTopUpAddTaskFragment.f26560k0.getValue()).getItem(i13);
                                if (scheduleTopUpRecommendBean != null) {
                                    c0 c0Var7 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                    if (c0Var7 != null) {
                                        c0Var7.f8230e.setPhoneNumber(r0.w0(scheduleTopUpRecommendBean.getPhone()));
                                    }
                                    scheduleTopUpAddTaskFragment.f26553H = scheduleTopUpRecommendBean.getTag();
                                    c0 c0Var8 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                    if (c0Var8 != null) {
                                        c0Var8.f8230e.showContactIv(true, true);
                                    }
                                }
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Choose_Recommended_Number");
                                break;
                            }
                            break;
                        default:
                            KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(view, "<unused var>");
                            if (!r0.U0()) {
                                p155k9.j jVarY3 = scheduleTopUpAddTaskFragment.y();
                                if (jVarY3 != null) {
                                    jVarY3.a(i13);
                                }
                                p155k9.j jVarY4 = scheduleTopUpAddTaskFragment.y();
                                scheduleTopUpAddTaskFragment.f26552C = jVarY4 != null ? (ScheduleTopUpAmountItemBean) jVarY4.getItem(i13) : null;
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Choose_Item");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        c0 c0Var7 = (c0) this.f27335j;
        if (c0Var7 != null) {
            c0Var7.f8232g.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        c0 c0Var8 = (c0) this.f27335j;
        if (c0Var8 != null) {
            c0Var8.f8232g.addItemDecoration(new e());
        }
        c0 c0Var9 = (c0) this.f27335j;
        t tVar = this.f26560k0;
        if (c0Var9 != null) {
            c0Var9.f8232g.setAdapter((l) tVar.getValue());
        }
        l lVar = (l) tVar.getValue();
        if (lVar != null) {
            final int i13 = 0;
            lVar.setOnItemClickListener(new OnItemClickListener(this) { // from class: m9.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpAddTaskFragment f39554b;

                {
                    this.f39554b = this;
                }

                @Override // com.chad.library.adapter.base.listener.OnItemClickListener
                public final void onItemClick(M1.j jVar, View view, int i14) {
                    ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39554b;
                    switch (i13) {
                        case 0:
                            KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(view, "<unused var>");
                            if (!r0.U0()) {
                                ScheduleTopUpRecommendBean scheduleTopUpRecommendBean = (ScheduleTopUpRecommendBean) ((p155k9.l) scheduleTopUpAddTaskFragment.f26560k0.getValue()).getItem(i14);
                                if (scheduleTopUpRecommendBean != null) {
                                    c0 c0Var10 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                    if (c0Var10 != null) {
                                        c0Var10.f8230e.setPhoneNumber(r0.w0(scheduleTopUpRecommendBean.getPhone()));
                                    }
                                    scheduleTopUpAddTaskFragment.f26553H = scheduleTopUpRecommendBean.getTag();
                                    c0 c0Var11 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                    if (c0Var11 != null) {
                                        c0Var11.f8230e.showContactIv(true, true);
                                    }
                                }
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Choose_Recommended_Number");
                                break;
                            }
                            break;
                        default:
                            KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(view, "<unused var>");
                            if (!r0.U0()) {
                                p155k9.j jVarY3 = scheduleTopUpAddTaskFragment.y();
                                if (jVarY3 != null) {
                                    jVarY3.a(i14);
                                }
                                p155k9.j jVarY4 = scheduleTopUpAddTaskFragment.y();
                                scheduleTopUpAddTaskFragment.f26552C = jVarY4 != null ? (ScheduleTopUpAmountItemBean) jVarY4.getItem(i14) : null;
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Choose_Item");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        c0 c0Var10 = (c0) this.f27335j;
        if (c0Var10 != null) {
            c0Var10.t.setText(CommonViewExtKt.toDayOfWeek(System.currentTimeMillis()));
        }
        D(CommonViewExtKt.getDayIndexOfWeek(System.currentTimeMillis()));
        c0 c0Var11 = (c0) this.f27335j;
        if (c0Var11 != null) {
            final int i14 = 1;
            c0Var11.t.setOnClickListener(new View.OnClickListener(this) { // from class: m9.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpAddTaskFragment f39558b;

                {
                    this.f39558b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long price;
                    ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39558b;
                    switch (i14) {
                        case 0:
                            KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                            Postcard postcardWithString = ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", "04");
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, scheduleTopUpAddTaskFragment, postcardWithString, 1812);
                            n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Beneficiaries");
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                            if (!r0.U0()) {
                                ((WeekAndDaySelectDialog) scheduleTopUpAddTaskFragment.f26563p0.getValue()).show();
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Top_Up_Date");
                                break;
                            }
                            break;
                        default:
                            KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                            if (!r0.U0()) {
                                if (scheduleTopUpAddTaskFragment.x()) {
                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = scheduleTopUpAddTaskFragment.f26552C;
                                    if (scheduleTopUpAmountItemBean == null) {
                                        ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_please_select_amount_item), new Object[0]);
                                    } else {
                                        Boolean suspend = scheduleTopUpAmountItemBean.getSuspend();
                                        Boolean bool = Boolean.TRUE;
                                        if (Intrinsics.c(suspend, bool)) {
                                            ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_this_amount_item_is_suspend), new Object[0]);
                                        } else {
                                            QueryAirtimeV2Rsp.DataBean dataBean = scheduleTopUpAddTaskFragment.f26556Q;
                                            String network = dataBean != null ? dataBean.getNetwork() : null;
                                            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean2 = scheduleTopUpAddTaskFragment.f26552C;
                                            if (y.h(network, scheduleTopUpAmountItemBean2 != null ? scheduleTopUpAmountItemBean2.getBillerId() : null, true)) {
                                                c0 c0Var12 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                if (c0Var12 == null || c0Var12.f8227b.isChecked()) {
                                                    AddScheduleTopUpTaskReq req = new AddScheduleTopUpTaskReq();
                                                    Object value = scheduleTopUpAddTaskFragment.f26558Y.getValue();
                                                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                                    req.setMemberId((String) value);
                                                    PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                                                    c0 c0Var13 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                    String strV0 = r0.v0(phoneBaseNumberUtils.getValidMobileNumber(c0Var13 != null ? c0Var13.f8230e.getPhoneNumber() : null, BaseApplication.getCountryLocale()));
                                                    if (strV0 != null) {
                                                        req.setPhone(strV0);
                                                    }
                                                    req.setTagName(scheduleTopUpAddTaskFragment.f26553H);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean3 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerId(scheduleTopUpAmountItemBean3 != null ? scheduleTopUpAmountItemBean3.getBillerId() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean4 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerName(scheduleTopUpAmountItemBean4 != null ? scheduleTopUpAmountItemBean4.getBillerName() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean5 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerLogo(scheduleTopUpAmountItemBean5 != null ? scheduleTopUpAmountItemBean5.getBillerLogo() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean6 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setItemId(scheduleTopUpAmountItemBean6 != null ? scheduleTopUpAmountItemBean6.getItemId() : null);
                                                    KProperty<?>[] kPropertyArr4 = ScheduleTopUpAddTaskFragment.f26549q0;
                                                    req.setTimeType(Integer.valueOf(((Number) scheduleTopUpAddTaskFragment.f26550A.getValue(scheduleTopUpAddTaskFragment, kPropertyArr4[0])).intValue()));
                                                    req.setTimeValue(Integer.valueOf(((Number) scheduleTopUpAddTaskFragment.f26551B.getValue(scheduleTopUpAddTaskFragment, kPropertyArr4[1])).intValue()));
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean7 = scheduleTopUpAddTaskFragment.f26552C;
                                                    if (scheduleTopUpAmountItemBean7 == null || (price = scheduleTopUpAmountItemBean7.getPrice()) == null) {
                                                        price = 0L;
                                                    }
                                                    req.setRechargeAmount(price);
                                                    req.setVerifyNetwork(bool);
                                                    ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) scheduleTopUpAddTaskFragment.f27333i;
                                                    if (scheduleTopUpViewModel != null) {
                                                        Intrinsics.checkNotNullParameter(req, "req");
                                                        if (BaseApplication.hasLogin()) {
                                                            N n10 = new N(req, null);
                                                            com.transsnet.palmpay.core.base.l lVar2 = scheduleTopUpViewModel.f26649w;
                                                            lVar2.f27356m = req;
                                                            Unit unit = Unit.f38893a;
                                                            p140j8.f.v(scheduleTopUpViewModel, n10, lVar2, 0L);
                                                        }
                                                    }
                                                } else {
                                                    c0 c0Var14 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                    if (c0Var14 != null) {
                                                        IconicsCheckBox iconicsCheckBox = c0Var14.f8227b;
                                                        String string = scheduleTopUpAddTaskFragment.getString(Pd.f.qt_please_agree_agreement);
                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                        LifecycleOwner viewLifecycleOwner = scheduleTopUpAddTaskFragment.getViewLifecycleOwner();
                                                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                                        CommonViewExtKt.showBalloon(iconicsCheckBox, string, viewLifecycleOwner, (2089452 & 4) != 0 ? iconicsCheckBox : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : L6.b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                                    }
                                                }
                                            } else {
                                                ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_this_biller_id_is_not_match), new Object[0]);
                                            }
                                        }
                                    }
                                }
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Confirm");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        c0 c0Var12 = (c0) this.f27335j;
        if (c0Var12 != null) {
            c0Var12.f8233i.setMovementMethod(LinkMovementMethod.getInstance());
        }
        c0 c0Var13 = (c0) this.f27335j;
        if (c0Var13 != null) {
            c0Var13.f8233i.setText(d0.i(requireContext(), b.ppColorTextPrimary, C0.G.i("I confirm and accept "), "Schedule top up airtime agreement").setClickSpan(new C0499b(1)).create());
        }
        c0 c0Var14 = (c0) this.f27335j;
        if (c0Var14 != null) {
            final int i15 = 2;
            c0Var14.f8236p.setOnClickListener(new View.OnClickListener(this) { // from class: m9.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpAddTaskFragment f39558b;

                {
                    this.f39558b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long price;
                    ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39558b;
                    switch (i15) {
                        case 0:
                            KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                            Postcard postcardWithString = ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", "04");
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, scheduleTopUpAddTaskFragment, postcardWithString, 1812);
                            n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Beneficiaries");
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                            if (!r0.U0()) {
                                ((WeekAndDaySelectDialog) scheduleTopUpAddTaskFragment.f26563p0.getValue()).show();
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Top_Up_Date");
                                break;
                            }
                            break;
                        default:
                            KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                            if (!r0.U0()) {
                                if (scheduleTopUpAddTaskFragment.x()) {
                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = scheduleTopUpAddTaskFragment.f26552C;
                                    if (scheduleTopUpAmountItemBean == null) {
                                        ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_please_select_amount_item), new Object[0]);
                                    } else {
                                        Boolean suspend = scheduleTopUpAmountItemBean.getSuspend();
                                        Boolean bool = Boolean.TRUE;
                                        if (Intrinsics.c(suspend, bool)) {
                                            ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_this_amount_item_is_suspend), new Object[0]);
                                        } else {
                                            QueryAirtimeV2Rsp.DataBean dataBean = scheduleTopUpAddTaskFragment.f26556Q;
                                            String network = dataBean != null ? dataBean.getNetwork() : null;
                                            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean2 = scheduleTopUpAddTaskFragment.f26552C;
                                            if (y.h(network, scheduleTopUpAmountItemBean2 != null ? scheduleTopUpAmountItemBean2.getBillerId() : null, true)) {
                                                c0 c0Var15 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                if (c0Var15 == null || c0Var15.f8227b.isChecked()) {
                                                    AddScheduleTopUpTaskReq req = new AddScheduleTopUpTaskReq();
                                                    Object value = scheduleTopUpAddTaskFragment.f26558Y.getValue();
                                                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                                    req.setMemberId((String) value);
                                                    PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                                                    c0 c0Var16 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                    String strV0 = r0.v0(phoneBaseNumberUtils.getValidMobileNumber(c0Var16 != null ? c0Var16.f8230e.getPhoneNumber() : null, BaseApplication.getCountryLocale()));
                                                    if (strV0 != null) {
                                                        req.setPhone(strV0);
                                                    }
                                                    req.setTagName(scheduleTopUpAddTaskFragment.f26553H);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean3 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerId(scheduleTopUpAmountItemBean3 != null ? scheduleTopUpAmountItemBean3.getBillerId() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean4 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerName(scheduleTopUpAmountItemBean4 != null ? scheduleTopUpAmountItemBean4.getBillerName() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean5 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setBillerLogo(scheduleTopUpAmountItemBean5 != null ? scheduleTopUpAmountItemBean5.getBillerLogo() : null);
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean6 = scheduleTopUpAddTaskFragment.f26552C;
                                                    req.setItemId(scheduleTopUpAmountItemBean6 != null ? scheduleTopUpAmountItemBean6.getItemId() : null);
                                                    KProperty<?>[] kPropertyArr4 = ScheduleTopUpAddTaskFragment.f26549q0;
                                                    req.setTimeType(Integer.valueOf(((Number) scheduleTopUpAddTaskFragment.f26550A.getValue(scheduleTopUpAddTaskFragment, kPropertyArr4[0])).intValue()));
                                                    req.setTimeValue(Integer.valueOf(((Number) scheduleTopUpAddTaskFragment.f26551B.getValue(scheduleTopUpAddTaskFragment, kPropertyArr4[1])).intValue()));
                                                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean7 = scheduleTopUpAddTaskFragment.f26552C;
                                                    if (scheduleTopUpAmountItemBean7 == null || (price = scheduleTopUpAmountItemBean7.getPrice()) == null) {
                                                        price = 0L;
                                                    }
                                                    req.setRechargeAmount(price);
                                                    req.setVerifyNetwork(bool);
                                                    ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) scheduleTopUpAddTaskFragment.f27333i;
                                                    if (scheduleTopUpViewModel != null) {
                                                        Intrinsics.checkNotNullParameter(req, "req");
                                                        if (BaseApplication.hasLogin()) {
                                                            N n10 = new N(req, null);
                                                            com.transsnet.palmpay.core.base.l lVar2 = scheduleTopUpViewModel.f26649w;
                                                            lVar2.f27356m = req;
                                                            Unit unit = Unit.f38893a;
                                                            p140j8.f.v(scheduleTopUpViewModel, n10, lVar2, 0L);
                                                        }
                                                    }
                                                } else {
                                                    c0 c0Var17 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                                    if (c0Var17 != null) {
                                                        IconicsCheckBox iconicsCheckBox = c0Var17.f8227b;
                                                        String string = scheduleTopUpAddTaskFragment.getString(Pd.f.qt_please_agree_agreement);
                                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                        LifecycleOwner viewLifecycleOwner = scheduleTopUpAddTaskFragment.getViewLifecycleOwner();
                                                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                                        CommonViewExtKt.showBalloon(iconicsCheckBox, string, viewLifecycleOwner, (2089452 & 4) != 0 ? iconicsCheckBox : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : L6.b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                                    }
                                                }
                                            } else {
                                                ToastUtils.showShort(scheduleTopUpAddTaskFragment.getString(Pd.f.qt_airtime_this_biller_id_is_not_match), new Object[0]);
                                            }
                                        }
                                    }
                                }
                                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Confirm");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        if (!TextUtils.isEmpty(this.f26554L)) {
            String strD = i0.D(this.f26554L);
            c0 c0Var15 = (c0) this.f27335j;
            if (c0Var15 != null) {
                c0Var15.f8230e.setPhoneNumber(strD);
            }
            C(strD);
            c0 c0Var16 = (c0) this.f27335j;
            if (c0Var16 != null) {
                c0Var16.f8230e.showContactIv(true, true);
            }
        } else if (!Intrinsics.c(this.f26564v, Boolean.TRUE)) {
            String strW0 = r0.w0(BaseApplication.getInstance().getUser().getPhoneNumber());
            c0 c0Var17 = (c0) this.f27335j;
            if (c0Var17 != null) {
                c0Var17.f8230e.setPhoneNumber(strW0);
            }
            C(strW0);
            c0 c0Var18 = (c0) this.f27335j;
            if (c0Var18 != null) {
                c0Var18.f8230e.showContactIv(true, true);
            }
        }
        b0 b0Var = this.f26562p;
        ScheduleTopUpConfigInfoBean scheduleTopUpConfigInfoBean = (ScheduleTopUpConfigInfoBean) ((K) b0Var.getValue()).f40121d.d();
        if (scheduleTopUpConfigInfoBean != null && (c0Var = (c0) this.f27335j) != null) {
            c0Var.f8235o.setText(scheduleTopUpConfigInfoBean.getRemark());
        }
        final int i16 = 2;
        ((K) b0Var.getValue()).f40121d.e(this, new q(new Function1(this) { // from class: m9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTopUpAddTaskFragment f39556b;

            {
                this.f39556b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                c0 c0Var19;
                TextView textView;
                ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39556b;
                switch (i16) {
                    case 0:
                        KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                        scheduleTopUpAddTaskFragment.E((List) obj);
                        break;
                    case 1:
                        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                        KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof com.transsnet.palmpay.core.base.p) {
                            com.transsnet.palmpay.core.base.p pVar = (com.transsnet.palmpay.core.base.p) it;
                            if (((TopUpHistoryDataResp) pVar.f27360a).isSuccess() && (c0Var19 = (c0) scheduleTopUpAddTaskFragment.f27335j) != null) {
                                c0Var19.f8230e.initModelInputRegexData(((TopUpHistoryDataResp) pVar.f27360a).getData(), new a(scheduleTopUpAddTaskFragment, 2), new a(scheduleTopUpAddTaskFragment, 3));
                            }
                        }
                        break;
                    default:
                        ScheduleTopUpConfigInfoBean scheduleTopUpConfigInfoBean2 = (ScheduleTopUpConfigInfoBean) obj;
                        KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                        c0 c0Var20 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                        if (c0Var20 != null && (textView = c0Var20.f8235o) != null) {
                            textView.setText(scheduleTopUpConfigInfoBean2.getRemark());
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, 12));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        ((DataBundleRecordHistoryViewModel) this.f26557X.getValue()).e();
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = scheduleTopUpViewModel != null ? scheduleTopUpViewModel.f26642f : null;
        if (lVar != null) {
            lVar.e(this, new q(new m9.h(lVar, this, 0), 11));
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = scheduleTopUpViewModel2 != null ? scheduleTopUpViewModel2.t : null;
        if (lVar2 != null) {
            lVar2.e(this, new q(new g(this, 0), 11));
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel3 = (ScheduleTopUpViewModel) this.f27333i;
        n.B(this, scheduleTopUpViewModel3 != null ? scheduleTopUpViewModel3.f26633A : null, this, new m9.a(this, 0), new kotlin.text.D(3), false, null, 240);
        ScheduleTopUpViewModel scheduleTopUpViewModel4 = (ScheduleTopUpViewModel) this.f27333i;
        n.B(this, scheduleTopUpViewModel4 != null ? scheduleTopUpViewModel4.f26649w : null, this, new m9.a(this, 1), new kotlin.text.D(4), false, null, 240);
        ScheduleTopUpViewModel scheduleTopUpViewModel5 = (ScheduleTopUpViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = scheduleTopUpViewModel5 != null ? scheduleTopUpViewModel5.f26637L : null;
        if (lVar3 != null) {
            lVar3.e(this, new q(new g(this, 1), 11));
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel6 = (ScheduleTopUpViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = scheduleTopUpViewModel6 != null ? scheduleTopUpViewModel6.f26648v : null;
        if (lVar4 != null) {
            lVar4.e(this, new q(new g(this, 2), 11));
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel7 = (ScheduleTopUpViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar5 = scheduleTopUpViewModel7 != null ? scheduleTopUpViewModel7.f26647p : null;
        if (lVar5 != null) {
            lVar5.e(this, new q(new m9.h(lVar5, this, 1), 11));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        long price;
        super.onActivityResult(i7, i10, intent);
        if (i7 != this.f26561o) {
            if (intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("PHONE_NUMBER");
            String stringExtra2 = intent.getStringExtra("contact_name");
            c0 c0Var = (c0) this.f27335j;
            if (c0Var != null) {
                c0Var.f8230e.setPhoneNumber(i0.j(stringExtra));
            }
            this.f26553H = stringExtra2;
            return;
        }
        if (i10 == -1) {
            AddScheduleTopUpTaskReq addScheduleTopUpTaskReq = new AddScheduleTopUpTaskReq();
            Object value = this.f26558Y.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            addScheduleTopUpTaskReq.setMemberId((String) value);
            PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
            c0 c0Var2 = (c0) this.f27335j;
            String strV0 = r0.v0(phoneBaseNumberUtils.getValidMobileNumber(c0Var2 != null ? c0Var2.f8230e.getPhoneNumber() : null, BaseApplication.getCountryLocale()));
            if (strV0 != null) {
                addScheduleTopUpTaskReq.setPhone(strV0);
            }
            addScheduleTopUpTaskReq.setTagName(this.f26553H);
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = this.f26552C;
            addScheduleTopUpTaskReq.setBillerId(scheduleTopUpAmountItemBean != null ? scheduleTopUpAmountItemBean.getBillerId() : null);
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean2 = this.f26552C;
            addScheduleTopUpTaskReq.setBillerName(scheduleTopUpAmountItemBean2 != null ? scheduleTopUpAmountItemBean2.getBillerName() : null);
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean3 = this.f26552C;
            addScheduleTopUpTaskReq.setBillerLogo(scheduleTopUpAmountItemBean3 != null ? scheduleTopUpAmountItemBean3.getBillerLogo() : null);
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean4 = this.f26552C;
            addScheduleTopUpTaskReq.setItemId(scheduleTopUpAmountItemBean4 != null ? scheduleTopUpAmountItemBean4.getItemId() : null);
            KProperty<?>[] kPropertyArr = f26549q0;
            addScheduleTopUpTaskReq.setTimeType(Integer.valueOf(((Number) this.f26550A.getValue(this, kPropertyArr[0])).intValue()));
            addScheduleTopUpTaskReq.setTimeValue(Integer.valueOf(((Number) this.f26551B.getValue(this, kPropertyArr[1])).intValue()));
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean5 = this.f26552C;
            if (scheduleTopUpAmountItemBean5 == null || (price = scheduleTopUpAmountItemBean5.getPrice()) == null) {
                price = 0L;
            }
            addScheduleTopUpTaskReq.setRechargeAmount(price);
            addScheduleTopUpTaskReq.setVerifyNetwork(Boolean.FALSE);
            ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
            if (scheduleTopUpViewModel != null) {
                scheduleTopUpViewModel.d(addScheduleTopUpTaskReq);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Pd.d.qt_fragment_airtime_schedule_task_add, viewGroup, false);
        int i7 = c.cbAgreement;
        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
        if (iconicsCheckBox != null) {
            i7 = c.gpAmountList;
            Group group = (Group) p059e1.a.m(i7, viewInflate);
            if (group != null) {
                i7 = c.llRecommend;
                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                if (linearLayout != null) {
                    i7 = c.modelPhoneNumber;
                    ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = (ModelMobileWithIconInputLayout) p059e1.a.m(i7, viewInflate);
                    if (modelMobileWithIconInputLayout != null) {
                        i7 = c.nsvBody;
                        if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = c.ryAmount;
                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                            if (recyclerView != null) {
                                i7 = c.ryRecommend;
                                RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                if (recyclerView2 != null) {
                                    i7 = c.tvAgreement;
                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView != null) {
                                        i7 = c.tvAutoTopUp;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            i7 = c.tvAutoTopUpTips;
                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView3 != null) {
                                                i7 = c.tvConfirm;
                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView4 != null) {
                                                    i7 = c.tvDate;
                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView5 != null) {
                                                        i7 = c.tvEvery;
                                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView6 != null && (viewM = p059e1.a.m((i7 = c.viewBgAmount), viewInflate)) != null) {
                                                            c0 c0Var = new c0((LinearLayout) viewInflate, iconicsCheckBox, group, linearLayout, modelMobileWithIconInputLayout, recyclerView, recyclerView2, textView, textView2, textView3, textView4, textView5, textView6, viewM);
                                                            Intrinsics.checkNotNullExpressionValue(c0Var, "inflate(...)");
                                                            return c0Var;
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

    public final boolean x() {
        String phoneNumber;
        c0 c0Var = (c0) this.f27335j;
        if (c0Var == null || (phoneNumber = c0Var.f8230e.getPhoneNumber()) == null) {
            phoneNumber = "";
        }
        if (!PhoneBaseNumberUtils.INSTANCE.isValidMobileNumber(phoneNumber, BaseApplication.getCountryLocale(), true)) {
            c0 c0Var2 = (c0) this.f27335j;
            if (c0Var2 != null) {
                c0Var2.f8230e.setError(getString(p025ba.k.core_please_enter_11_digit_phone_number));
            }
        } else {
            if (!y.m(phoneNumber, "0234", false) && !y.m(phoneNumber, "234", false)) {
                c0 c0Var3 = (c0) this.f27335j;
                if (c0Var3 != null) {
                    c0Var3.f8230e.setError("");
                }
                return true;
            }
            c0 c0Var4 = (c0) this.f27335j;
            if (c0Var4 != null) {
                c0Var4.f8230e.setError(getString(p025ba.k.core_check_number));
                return false;
            }
        }
        return false;
    }

    public final p155k9.j y() {
        return (p155k9.j) this.f26559Z.getValue();
    }

    public final void z(Hb.L l5) {
        t0 t0Var;
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
        Object function = l5;
        if (scheduleTopUpViewModel != null) {
            if (l5 == null) {
                function = new d(12);
            }
            Intrinsics.checkNotNullParameter(function, "function");
            t0 t0Var2 = scheduleTopUpViewModel.f26641e;
            if (t0Var2 != null && t0Var2.isActive() && (t0Var = scheduleTopUpViewModel.f26641e) != null) {
                t0Var.cancel((CancellationException) null);
            }
            com.transsnet.palmpay.core.base.l lVar = scheduleTopUpViewModel.f26647p;
            lVar.f27356m = function;
            scheduleTopUpViewModel.f26641e = AbstractC0780y.m(V.h(scheduleTopUpViewModel), null, null, new W(lVar, C0.G.o("queryAirtimeItemV4_", BaseApplication.getCountryLocale()), null), 3);
        }
    }
}
