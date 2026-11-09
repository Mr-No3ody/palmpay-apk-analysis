package Q3;

import N8.C0457a;
import Pa.b0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierCouponListDialog$CallBack;
import com.flexibank.sdk.customview.model.FlexiBankModelEmptyView;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p263r4.a implements View.OnClickListener, LifecycleOwner {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f7589H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f7590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public O3.k f7591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f7592C;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f7593g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f7594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f7595j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f7596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f7597p;
    public List t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f7598v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FlexiBankCashierCouponListDialog$CallBack f7599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, q.fb_dialog_cashier_coupon_list);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.f7593g = C2131j.b(new Function0(this) { // from class: Q3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f7584b;

            {
                this.f7584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return this.f7584b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (IconicsImageView) this.f7584b.findViewById(p.fb_cdsc_close_iv);
                    case 2:
                        return (TextView) this.f7584b.findViewById(p.fb_cdsc_title_tv);
                    case 3:
                        return (RecyclerView) this.f7584b.findViewById(p.fb_cdsc_rcv);
                    case 4:
                        return (PpButton) this.f7584b.findViewById(p.fb_cdsc_confirm);
                    default:
                        return this.f7584b.findViewById(p.fb_loadingView);
                }
            }
        });
        final int i10 = 1;
        this.f7594i = C2131j.b(new Function0(this) { // from class: Q3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f7584b;

            {
                this.f7584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.f7584b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (IconicsImageView) this.f7584b.findViewById(p.fb_cdsc_close_iv);
                    case 2:
                        return (TextView) this.f7584b.findViewById(p.fb_cdsc_title_tv);
                    case 3:
                        return (RecyclerView) this.f7584b.findViewById(p.fb_cdsc_rcv);
                    case 4:
                        return (PpButton) this.f7584b.findViewById(p.fb_cdsc_confirm);
                    default:
                        return this.f7584b.findViewById(p.fb_loadingView);
                }
            }
        });
        final int i11 = 2;
        this.f7595j = C2131j.b(new Function0(this) { // from class: Q3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f7584b;

            {
                this.f7584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return this.f7584b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (IconicsImageView) this.f7584b.findViewById(p.fb_cdsc_close_iv);
                    case 2:
                        return (TextView) this.f7584b.findViewById(p.fb_cdsc_title_tv);
                    case 3:
                        return (RecyclerView) this.f7584b.findViewById(p.fb_cdsc_rcv);
                    case 4:
                        return (PpButton) this.f7584b.findViewById(p.fb_cdsc_confirm);
                    default:
                        return this.f7584b.findViewById(p.fb_loadingView);
                }
            }
        });
        final int i12 = 3;
        this.f7596o = C2131j.b(new Function0(this) { // from class: Q3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f7584b;

            {
                this.f7584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.f7584b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (IconicsImageView) this.f7584b.findViewById(p.fb_cdsc_close_iv);
                    case 2:
                        return (TextView) this.f7584b.findViewById(p.fb_cdsc_title_tv);
                    case 3:
                        return (RecyclerView) this.f7584b.findViewById(p.fb_cdsc_rcv);
                    case 4:
                        return (PpButton) this.f7584b.findViewById(p.fb_cdsc_confirm);
                    default:
                        return this.f7584b.findViewById(p.fb_loadingView);
                }
            }
        });
        this.f7597p = C2131j.b(new b0(1));
        this.f7598v = -1L;
        final int i13 = 4;
        this.f7590A = C2131j.b(new Function0(this) { // from class: Q3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f7584b;

            {
                this.f7584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.f7584b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (IconicsImageView) this.f7584b.findViewById(p.fb_cdsc_close_iv);
                    case 2:
                        return (TextView) this.f7584b.findViewById(p.fb_cdsc_title_tv);
                    case 3:
                        return (RecyclerView) this.f7584b.findViewById(p.fb_cdsc_rcv);
                    case 4:
                        return (PpButton) this.f7584b.findViewById(p.fb_cdsc_confirm);
                    default:
                        return this.f7584b.findViewById(p.fb_loadingView);
                }
            }
        });
        final int i14 = 5;
        this.f7592C = C2131j.b(new Function0(this) { // from class: Q3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f7584b;

            {
                this.f7584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f7584b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (IconicsImageView) this.f7584b.findViewById(p.fb_cdsc_close_iv);
                    case 2:
                        return (TextView) this.f7584b.findViewById(p.fb_cdsc_title_tv);
                    case 3:
                        return (RecyclerView) this.f7584b.findViewById(p.fb_cdsc_rcv);
                    case 4:
                        return (PpButton) this.f7584b.findViewById(p.fb_cdsc_confirm);
                    default:
                        return this.f7584b.findViewById(p.fb_loadingView);
                }
            }
        });
    }

    @Override // p215o4.b
    public final void a() {
        ViewTreeObserver viewTreeObserver;
        TextView textView;
        t tVar = this.f7596o;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f40023a, 1, false));
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setItemViewCacheSize(4);
        }
        RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new p197n4.a());
        }
        RecyclerView recyclerView4 = (RecyclerView) tVar.getValue();
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(c());
        }
        if (!TextUtils.isEmpty(null) && (textView = (TextView) this.f7595j.getValue()) != null) {
            textView.setText((CharSequence) null);
        }
        d();
        M3.a aVarC = c();
        if (aVarC != null) {
            aVarC.setOnItemChildClickListener(new C0457a(this, 10));
        }
        FlexiBankModelEmptyView flexiBankModelEmptyView = new FlexiBankModelEmptyView(this.f40023a, null, 0);
        ImageView mIv = flexiBankModelEmptyView.getMIv();
        if (mIv != null) {
            mIv.setImageResource(o.fb_no_coupon_icon);
        }
        TextView mTv = flexiBankModelEmptyView.getMTv();
        if (mTv != null) {
            mTv.setText(r.fb_no_coupon_available);
        }
        int i7 = L6.b.ppColorBackgroundLight;
        Context context = this.f40023a;
        if (context == null && (context = K3.g.f4925c.getContext()) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        flexiBankModelEmptyView.setBackgroundColor(context.getColor(i7));
        c().setEmptyView(flexiBankModelEmptyView);
        p215o4.b.b(this, getWindow());
        IconicsImageView iconicsImageView = (IconicsImageView) this.f7594i.getValue();
        if (iconicsImageView != null) {
            iconicsImageView.setOnClickListener(this);
        }
        PpButton ppButton = (PpButton) this.f7590A.getValue();
        if (ppButton != null) {
            ppButton.setOnClickListener(this);
        }
        View view = (View) this.f7593g.getValue();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new Be.c(this, 3));
    }

    public final M3.a c() {
        return (M3.a) this.f7597p.getValue();
    }

    public final void d() {
        if (this.t != null) {
            M3.a aVarC = c();
            List list = this.t;
            int i7 = -1;
            if (list != null) {
                Iterator it = list.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Long couponId = ((FlexiBankCashierCouponItem) it.next()).getCouponId();
                    long j6 = this.f7598v;
                    if (couponId != null && couponId.longValue() == j6) {
                        i7 = i10;
                        break;
                    }
                    i10++;
                }
            }
            aVarC.f5748b = i7;
            aVarC.notifyDataSetChanged();
            c().setList(this.t);
        }
    }

    @Override // p215o4.b, android.view.View.OnClickListener
    public final void onClick(View v3) {
        FlexiBankCashierCouponItem flexiBankCashierCouponItem;
        Intrinsics.checkNotNullParameter(v3, "v");
        int id2 = v3.getId();
        PpButton ppButton = (PpButton) this.f7590A.getValue();
        if (ppButton == null || id2 != ppButton.getId()) {
            IconicsImageView iconicsImageView = (IconicsImageView) this.f7594i.getValue();
            if (iconicsImageView == null || id2 != iconicsImageView.getId()) {
                return;
            }
            dismiss();
            return;
        }
        if (this.f7599w != null) {
            M3.a aVarC = c();
            if ((aVarC != null ? aVarC.f5748b : 0) < 0) {
                FlexiBankCashierCouponListDialog$CallBack flexiBankCashierCouponListDialog$CallBack = this.f7599w;
                if (flexiBankCashierCouponListDialog$CallBack != null) {
                    flexiBankCashierCouponListDialog$CallBack.onCouponClick(null);
                }
                dismiss();
                return;
            }
            M3.a aVarC2 = c();
            if (aVarC2 != null) {
                M3.a aVarC3 = c();
                flexiBankCashierCouponItem = (FlexiBankCashierCouponItem) aVarC2.getItem(aVarC3 != null ? aVarC3.f5748b : 0);
            } else {
                flexiBankCashierCouponItem = null;
            }
            if (flexiBankCashierCouponItem != null && Intrinsics.c(flexiBankCashierCouponItem.getShowOnlyMeErrors(), Boolean.TRUE)) {
                ToastUtils.showLong(r.fb_msg_coupons_myself_only);
            }
            if (this.f7591B == null) {
                FlexiBankCashierCouponListDialog$CallBack flexiBankCashierCouponListDialog$CallBack2 = this.f7599w;
                if (flexiBankCashierCouponListDialog$CallBack2 != null) {
                    flexiBankCashierCouponListDialog$CallBack2.onCouponClick(flexiBankCashierCouponItem);
                }
                dismiss();
                return;
            }
            View view = (View) this.f7592C.getValue();
            if (view != null) {
                view.setVisibility(0);
            }
            O3.k kVar = this.f7591B;
            if (kVar != null) {
                kVar.d(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getCouponId() : null);
            }
            O3.k kVar2 = this.f7591B;
            if (kVar2 != null) {
                kVar2.c(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getNominaValue() : null);
            }
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            p042cg.f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, p015ag.o.f11960a, null, new b(null, this, flexiBankCashierCouponItem), 2));
        }
    }

    @Override // p263r4.a, android.app.Dialog
    public final void show() {
        d();
        super.show();
    }
}
