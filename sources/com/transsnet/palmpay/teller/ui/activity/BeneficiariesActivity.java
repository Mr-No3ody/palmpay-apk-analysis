package com.transsnet.palmpay.teller.ui.activity;

import Fd.G;
import Fe.h0;
import Pd.c;
import Pd.d;
import V9.q;
import Wd.C0730d;
import Wd.C0732f;
import Xd.C0783b;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.QueryFamilyAccountReq;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import com.transsnet.palmpay.teller.viewmodel.BeneficiariesListViewModel;
import io.fastkv.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p070ee.b;
import p086fe.C1658c;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/quick_teller/betting_beneficiaries")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/BeneficiariesActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/BeneficiariesListViewModel;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBeneficiariesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeneficiariesActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BeneficiariesActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,311:1\n171#2,12:312\n215#2:324\n260#2,10:325\n296#2:335\n*S KotlinDebug\n*F\n+ 1 BeneficiariesActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BeneficiariesActivity\n*L\n179#1:312,12\n179#1:324\n234#1:325,10\n234#1:335\n*E\n"})
public final class BeneficiariesActivity extends BaseMvvmActivity<BeneficiariesListViewModel> implements CompleteCallback<PaymentItemBean> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f34148v = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SwipeRecyclerView f34149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0783b f34150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f34151e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34153g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34154i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f34156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f34157p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34152f = "8";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34155j = 1;
    public final q t = new q(this, 13);

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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return d.qt_activity_beneficiaries;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        int i7 = 27;
        ArrayList arrayList = new ArrayList();
        this.f34151e = arrayList;
        C0783b c0783b = this.f34150d;
        if (c0783b == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        c0783b.f4985b = arrayList;
        Object obj = b.f36288a;
        AutoTrackUtil.trackTransType(this, b.b(this.f34152f));
        l lVar = ((BeneficiariesListViewModel) l()).f34384e;
        if (lVar != null) {
            lVar.e(this, new G(new C0730d(this, this, 0), 27));
        }
        n.B(this, ((BeneficiariesListViewModel) l()).f34386g, this, new Ba.a(this, 17), new h0(i7), true, null, 224);
        l lVar2 = ((BeneficiariesListViewModel) l()).f34385f;
        if (lVar2 != null) {
            lVar2.e(this, new G(new C0730d(this, this, 1), 27));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        BeneficiariesListViewModel beneficiariesListViewModel = (BeneficiariesListViewModel) l();
        QueryFamilyAccountReq req = new QueryFamilyAccountReq(this.f34152f, this.f34153g, this.f34155j, 10);
        beneficiariesListViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(beneficiariesListViewModel, new C1658c(req, null), beneficiariesListViewModel.f34384e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void n(PaymentItemBean paymentItemBean, String str) {
        try {
            Intent intent = new Intent();
            intent.putExtra("extra_data_1", paymentItemBean.billerId);
            intent.putExtra("extra_data_2", paymentItemBean.paymentItemId);
            intent.putExtra("customerId", str);
            intent.putExtra("amount", this.f34157p);
            setResult(-1, intent);
        } catch (Exception e10) {
            F6.d.c(this.TAG, "sendPaymentItemBack: ", e10);
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(PaymentItemBean[] paymentItemBeanArr) {
        PaymentItemBean paymentItemBean;
        PaymentItemBean[] objects = paymentItemBeanArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        if (objects.length == 0 || (paymentItemBean = objects[0]) == null) {
            return;
        }
        n(paymentItemBean, this.f34156o);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        m();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        RecyclerView recyclerView;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundDark));
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(c.aqth_title_bar);
        this.f34149c = (SwipeRecyclerView) findViewById(c.aqth_record_rcv);
        ppTitleBar.setTitle(getString(Pd.f.qt_beneficifaries));
        final int i7 = 0;
        ((PpButton) findViewById(c.qt_add_more_beneficiaries_btn)).setOnClickListener(new View.OnClickListener(this) { // from class: Wd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiariesActivity f10751b;

            {
                this.f10751b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeneficiariesActivity beneficiariesActivity = this.f10751b;
                switch (i7) {
                    case 0:
                        int i10 = BeneficiariesActivity.f34148v;
                        ARouter.getInstance().build("/quick_teller/edit_beneficiaries").withString("extra_type", beneficiariesActivity.f34152f).navigation();
                        break;
                    default:
                        int i11 = BeneficiariesActivity.f34148v;
                        ARouter.getInstance().build("/quick_teller/edit_beneficiaries").withString("extra_type", beneficiariesActivity.f34152f).navigation();
                        break;
                }
            }
        });
        SwipeRecyclerView swipeRecyclerView = this.f34149c;
        if (swipeRecyclerView != null && (recyclerView = swipeRecyclerView.getRecyclerView()) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        C0783b c0783b = new C0783b(this);
        this.f34150d = c0783b;
        c0783b.f11142e = this.f34152f;
        c0783b.notifyDataSetChanged();
        SwipeRecyclerView swipeRecyclerView2 = this.f34149c;
        if (swipeRecyclerView2 != null) {
            C0783b c0783b2 = this.f34150d;
            if (c0783b2 == null) {
                Intrinsics.n("mAdapter");
                throw null;
            }
            swipeRecyclerView2.setAdapter(c0783b2);
        }
        C0783b c0783b3 = this.f34150d;
        if (c0783b3 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        c0783b3.f4986c = this.t;
        SwipeRecyclerView swipeRecyclerView3 = this.f34149c;
        if (swipeRecyclerView3 != null) {
            swipeRecyclerView3.setRefreshEnable(true);
        }
        SwipeRecyclerView swipeRecyclerView4 = this.f34149c;
        if (swipeRecyclerView4 != null) {
            swipeRecyclerView4.setOnLoadListener(new C0732f(this));
        }
        View viewInflate = LayoutInflater.from(this).inflate(d.qt_betting_beneficiaries_empty_view, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(c.qbev_add_betting_info_tv);
        TextView textView2 = (TextView) viewInflate.findViewById(c.qbev_add_betting_empty_tv);
        final int i10 = 1;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: Wd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiariesActivity f10751b;

            {
                this.f10751b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeneficiariesActivity beneficiariesActivity = this.f10751b;
                switch (i10) {
                    case 0:
                        int i11 = BeneficiariesActivity.f34148v;
                        ARouter.getInstance().build("/quick_teller/edit_beneficiaries").withString("extra_type", beneficiariesActivity.f34152f).navigation();
                        break;
                    default:
                        int i12 = BeneficiariesActivity.f34148v;
                        ARouter.getInstance().build("/quick_teller/edit_beneficiaries").withString("extra_type", beneficiariesActivity.f34152f).navigation();
                        break;
                }
            }
        };
        textView.setOnClickListener(onClickListener);
        textView2.setOnClickListener(onClickListener);
        SwipeRecyclerView swipeRecyclerView5 = this.f34149c;
        if (swipeRecyclerView5 != null) {
            swipeRecyclerView5.setEmptyView(viewInflate);
        }
    }
}
