package com.transsnet.palmpay.teller.ui.view;

import Bc.p;
import M1.j;
import Pa.F;
import Pa.n0;
import Pd.g;
import Wf.AbstractC0780y;
import Wf.I;
import Xd.x;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BannerWithCouponBean;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0005\u0018\u0012\u0019\u001a\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0017\u001a\u00060\u0012R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelActivityBannerWithCoupon;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/teller/ui/view/BillerCouponClickListener;", "e", "Lcom/transsnet/palmpay/teller/ui/view/BillerCouponClickListener;", "getMListener", "()Lcom/transsnet/palmpay/teller/ui/view/BillerCouponClickListener;", "setMListener", "(Lcom/transsnet/palmpay/teller/ui/view/BillerCouponClickListener;)V", "mListener", "Lcom/transsnet/palmpay/teller/ui/view/c;", "i", "Lkotlin/Lazy;", "getMAdapter", "()Lcom/transsnet/palmpay/teller/ui/view/c;", "mAdapter", "a", "com/transsnet/palmpay/teller/ui/view/d", "com/transsnet/palmpay/teller/ui/view/b", "OnCouponClickLister", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelActivityBannerWithCoupon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelActivityBannerWithCoupon.kt\ncom/transsnet/palmpay/teller/ui/view/ModelActivityBannerWithCoupon\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,531:1\n116#2:532\n*S KotlinDebug\n*F\n+ 1 ModelActivityBannerWithCoupon.kt\ncom/transsnet/palmpay/teller/ui/view/ModelActivityBannerWithCoupon\n*L\n261#1:532\n*E\n"})
public final class ModelActivityBannerWithCoupon extends BaseConstraintLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f34320j = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f34321o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f34322p = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f34323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f34324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public BillerCouponClickListener mListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f34326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34327g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f34328i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelActivityBannerWithCoupon$OnCouponClickLister;", "", "onSingleCouponItemClick", "", ViewProps.POSITION, "", "onCouponPackageItemClick", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnCouponClickLister {
        void onCouponPackageItemClick(int position);

        void onSingleCouponItemClick(int position);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTYPE_COUPON_PACKETAGE_ITEM() {
            return ModelActivityBannerWithCoupon.f34322p;
        }

        public final int getTYPE_SINGLE_COUPON_ITEM() {
            return ModelActivityBannerWithCoupon.f34321o;
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelActivityBannerWithCoupon(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(ModelActivityBannerWithCoupon modelActivityBannerWithCoupon, Context context, j jVar, View view, int i7) {
        String id2;
        String androidLinkUrl;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        c mAdapter = modelActivityBannerWithCoupon.getMAdapter();
        BannerWithCouponBean bannerWithCouponBean = mAdapter != null ? (BannerWithCouponBean) mAdapter.getItem(i7) : null;
        if (TextUtils.isEmpty(bannerWithCouponBean != null ? bannerWithCouponBean.getAndroidLinkUrl() : null)) {
            return;
        }
        Intent intentA = F.a(context, bannerWithCouponBean != null ? bannerWithCouponBean.getAndroidLinkUrl() : null);
        n0 n0VarG = n0.g();
        String str = "";
        if (bannerWithCouponBean == null || (id2 = bannerWithCouponBean.getId()) == null) {
            id2 = "";
        }
        Pair pair = new Pair("id", id2);
        Pair pair2 = new Pair("transType", modelActivityBannerWithCoupon.f34327g);
        if (bannerWithCouponBean != null && (androidLinkUrl = bannerWithCouponBean.getAndroidLinkUrl()) != null) {
            str = androidLinkUrl;
        }
        n0VarG.n("ModelActivityBannerWithCoupon", G.g(pair, pair2, new Pair("link", str)));
        ActivityUtils.startActivity(intentA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getMAdapter() {
        return (c) this.f34328i.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String str, boolean z3, Function0 function0, Function1 showLoadingDialog, BillerCouponClickListener billerCouponClickListener) {
        Intrinsics.checkNotNullParameter(showLoadingDialog, "showLoadingDialog");
        this.f34327g = str;
        getMAdapter().f34375b = z3;
        f();
        this.mListener = billerCouponClickListener;
        this.f34323c = (m) showLoadingDialog;
        this.f34324d = function0;
    }

    public final void f() {
        if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new p041ce.m(null, this), 2));
        }
    }

    public final void g(CommonListResultV2 commonListResultV2) {
        List<T> list;
        List<T> list2;
        if (((commonListResultV2 == null || (list2 = commonListResultV2.data) == 0) ? 0 : list2.size()) <= 0) {
            h.s(this, false);
            return;
        }
        getMAdapter().setList(commonListResultV2 != null ? commonListResultV2.data : null);
        int size = (commonListResultV2 == null || (list = commonListResultV2.data) == 0) ? 0 : list.size();
        p pVar = this.f34326f;
        if (size > 1) {
            x xVar = new x(size);
            if (pVar != null) {
                ((RecyclerView) pVar.f813d).setAdapter(xVar);
            }
            C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(com.transsnet.palmpay.custom_view.p.transparent, getContext()), CommonViewExtKt.getDp(3), CommonViewExtKt.getDp(2), CommonViewExtKt.getDp(2));
            c1548f.f31336e = false;
            if (pVar != null) {
                ((RecyclerView) pVar.f813d).addItemDecoration(c1548f);
            }
            if (pVar != null) {
                ((ViewPager2) pVar.f812c).registerOnPageChangeCallback(new p041ce.j(xVar));
            }
        } else if (pVar != null) {
            h.s((RecyclerView) pVar.f813d, false);
        }
        Function0 function0 = this.f34324d;
        if (function0 != null) {
            function0.invoke();
        }
        h.s(this, true);
        n0.g().u(new ViewEvent("ModelActivityBannerWithCoupon").add("transType", this.f34327g));
    }

    @Nullable
    public final BillerCouponClickListener getMListener() {
        return this.mListener;
    }

    public final void setMListener(@Nullable BillerCouponClickListener billerCouponClickListener) {
        this.mListener = billerCouponClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelActivityBannerWithCoupon(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelActivityBannerWithCoupon(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelActivityBannerWithCoupon(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34328i = C2131j.b(new X6.c(this, 10));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.ModelActivityBannerWithCoupon, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f34327g = typedArrayObtainStyledAttributes.getString(g.ModelActivityBannerWithCoupon_billTransType);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = View.inflate(context, Pd.d.qt_layout_activity_banner_with_coupon, this);
        int i10 = Pd.c.bannerVp;
        ViewPager2 viewPager2 = (ViewPager2) p059e1.a.m(i10, viewInflate);
        if (viewPager2 != null) {
            i10 = Pd.c.indicatorRv;
            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
            if (recyclerView != null) {
                this.f34326f = new p(viewInflate, viewPager2, recyclerView, 13);
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                viewPager2.setAdapter(getMAdapter());
                c mAdapter = getMAdapter();
                if (mAdapter != null) {
                    mAdapter.setOnItemClickListener(new U8.a(18, this, context));
                }
                c mAdapter2 = getMAdapter();
                if (mAdapter2 != null) {
                    mAdapter2.f34376c = new com.transsnet.palmpay.teller.ui.view.a(this, context);
                }
                setVisibility(8);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
