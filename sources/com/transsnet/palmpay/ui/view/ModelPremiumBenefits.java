package com.transsnet.palmpay.ui.view;

import Ab.C;
import Ad.c0;
import Bc.D;
import C0.G;
import F5.b;
import Gb.T;
import He.l;
import He.o;
import M1.j;
import Pa.F;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsItemBean;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsRewardBean;
import com.transsnet.palmpay.main.export.bean.rsp.RewardTrialVipBean;
import com.transsnet.palmpay.main.export.bean.rsp.RewardVipCardBean;
import com.transsnet.palmpay.util.ActivityUtils;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p059e1.a;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p370ye.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/ui/view/ModelPremiumBenefits;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lye/f;", "f", "Lkotlin/Lazy;", "getMAdapter", "()Lye/f;", "mAdapter", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelPremiumBenefits.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelPremiumBenefits.kt\ncom/transsnet/palmpay/ui/view/ModelPremiumBenefits\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,316:1\n116#2:317\n116#2:318\n116#2:319\n*S KotlinDebug\n*F\n+ 1 ModelPremiumBenefits.kt\ncom/transsnet/palmpay/ui/view/ModelPremiumBenefits\n*L\n161#1:317\n190#1:318\n210#1:319\n*E\n"})
public final class ModelPremiumBenefits extends BaseConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f35304i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f35305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f35306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f35308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PagerGridLayoutManager f35309g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPremiumBenefits(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(ModelPremiumBenefits modelPremiumBenefits, Context context, j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        PremiumBenefitsItemBean premiumBenefitsItemBean = (PremiumBenefitsItemBean) modelPremiumBenefits.getMAdapter().getItem(i7);
        if (r0.U0() || TextUtils.isEmpty(premiumBenefitsItemBean.rewardAndroidLink)) {
            return;
        }
        ActivityUtils.startActivity(F.a(context, premiumBenefitsItemBean.rewardAndroidLink));
        n0.g().k(((ClickEvent) G.f("PremiumBenefits", "event_type", "Click_Event")).add("element_name", "PremiumBenefits_Reward_item").add("element_details", premiumBenefitsItemBean.businessCode));
    }

    private final f getMAdapter() {
        return (f) this.f35308f.getValue();
    }

    public final void d() {
        if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            p042cg.f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new l(null, this), 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
    public final void e(PremiumBenefitsRewardBean data) {
        int i7 = 3;
        Intrinsics.checkNotNullParameter(data, "data");
        Unit unit = null;
        if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            p042cg.f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new o(null, this), 2));
        }
        RewardVipCardBean rewardVipCardBean = data.rewardVipCardDTO;
        D d2 = this.f35306d;
        if (rewardVipCardBean != null) {
            if (!TextUtils.isEmpty(rewardVipCardBean.logo)) {
                r0.l1(rewardVipCardBean.logo, d2 != null ? (ImageView) d2.f616b : null);
            }
            if (!TextUtils.isEmpty(rewardVipCardBean.levelLogo)) {
                r0.l1(rewardVipCardBean.levelLogo, d2 != null ? (ImageView) d2.f617c : null);
            }
            if (d2 != null) {
                TextView textView = d2.f621g;
                String str = rewardVipCardBean.text;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
            }
        }
        RewardTrialVipBean rewardTrialVipBean = data.rewardTrialVipDTO;
        if (rewardTrialVipBean != null) {
            if (d2 != null) {
                h.s((LinearLayout) d2.f618d, true);
            }
            r0.l1(rewardTrialVipBean.icon, d2 != null ? (ImageView) d2.t : null);
            if (d2 != null) {
                TextView textView2 = d2.f623j;
                String str2 = rewardTrialVipBean.text;
                if (str2 == null) {
                    str2 = "";
                }
                textView2.setText(str2);
            }
            int color = this.f35307e ? Color.parseColor("#5E3E1F") : Color.parseColor("#F5C670");
            int color2 = this.f35307e ? Color.parseColor("#FFFFFF") : Color.parseColor("#5E3E1F");
            if (d2 != null) {
                h.n(d2.f619e, color, CommonViewExtKt.getDp(16.0f), null, null, 124);
            }
            if (d2 != null) {
                d2.f619e.setTextColor(color2);
            }
            if (d2 != null) {
                TextView textView3 = d2.f619e;
                String str3 = rewardTrialVipBean.buttonName;
                textView3.setText(str3 != null ? str3 : "");
            }
            if (d2 != null) {
                d2.f619e.setOnClickListener(new T(i7, rewardTrialVipBean, this));
                unit = Unit.f38893a;
            }
            if (unit == null) {
                if (d2 != null) {
                    h.s((LinearLayout) d2.f618d, false);
                    Unit unit2 = Unit.f38893a;
                }
            }
        } else if (d2 != null) {
            h.s((LinearLayout) d2.f618d, false);
            Unit unit3 = Unit.f38893a;
        }
        List<PremiumBenefitsItemBean> list = data.benefitVOList;
        if (list != null) {
            C c6 = this.f35305c;
            if (c6 != null) {
                c6.invoke(Boolean.TRUE);
            }
            getMAdapter().setList(list);
            int size = (list.size() + 2) / 3;
            if (size <= 1) {
                if (d2 != null) {
                    h.s((RecyclerView) d2.f627w, false);
                    return;
                }
                return;
            }
            p370ye.h hVar = new p370ye.h(size, this.f35307e);
            if (d2 != null) {
                ((RecyclerView) d2.f627w).setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            }
            if (d2 != null) {
                ((RecyclerView) d2.f627w).setAdapter(hVar);
            }
            C1548f c1548f = new C1548f(getContext().getColor(p.transparent), CommonViewExtKt.getDp(1), CommonViewExtKt.getDp(2), CommonViewExtKt.getDp(2));
            c1548f.f31336e = false;
            if (d2 != null) {
                ((RecyclerView) d2.f627w).addItemDecoration(c1548f);
            }
            PagerGridLayoutManager pagerGridLayoutManager = this.f35309g;
            if (pagerGridLayoutManager != null) {
                pagerGridLayoutManager.f25197H = new He.f(hVar);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPremiumBenefits(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPremiumBenefits(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPremiumBenefits(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        View viewM;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35308f = C2131j.b(new G9.j(13));
        View viewInflate = View.inflate(context, Ac.f.main_layout_reward_premium_benefits, this);
        int i10 = Ac.e.btnTrial;
        TextView textView = (TextView) a.m(i10, viewInflate);
        if (textView != null) {
            i10 = Ac.e.ivIcon;
            ImageView imageView = (ImageView) a.m(i10, viewInflate);
            if (imageView != null) {
                i10 = Ac.e.ivLevelIcon;
                ImageView imageView2 = (ImageView) a.m(i10, viewInflate);
                if (imageView2 != null) {
                    i10 = Ac.e.ivTrialIcon;
                    ImageView imageView3 = (ImageView) a.m(i10, viewInflate);
                    if (imageView3 != null) {
                        i10 = Ac.e.llPremiumTrial;
                        LinearLayout linearLayout = (LinearLayout) a.m(i10, viewInflate);
                        if (linearLayout != null) {
                            i10 = Ac.e.loadingIndicator;
                            AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView) a.m(i10, viewInflate);
                            if (aVLoadingIndicatorView != null) {
                                i10 = Ac.e.rvBenefits;
                                RecyclerView recyclerView = (RecyclerView) a.m(i10, viewInflate);
                                if (recyclerView != null) {
                                    i10 = Ac.e.rvIndicator;
                                    RecyclerView recyclerView2 = (RecyclerView) a.m(i10, viewInflate);
                                    if (recyclerView2 != null) {
                                        i10 = Ac.e.scrollNotice;
                                        ModelPremiumScrollNotice modelPremiumScrollNotice = (ModelPremiumScrollNotice) a.m(i10, viewInflate);
                                        if (modelPremiumScrollNotice != null) {
                                            i10 = Ac.e.tvMore;
                                            if (((IconicsImageView) a.m(i10, viewInflate)) != null) {
                                                i10 = Ac.e.tvNotice;
                                                TextView textView2 = (TextView) a.m(i10, viewInflate);
                                                if (textView2 != null) {
                                                    i10 = Ac.e.tvSubTitle;
                                                    TextView textView3 = (TextView) a.m(i10, viewInflate);
                                                    if (textView3 != null) {
                                                        i10 = Ac.e.tvTitle;
                                                        TextView textView4 = (TextView) a.m(i10, viewInflate);
                                                        if (textView4 != null) {
                                                            i10 = Ac.e.tvTrialContent;
                                                            TextView textView5 = (TextView) a.m(i10, viewInflate);
                                                            if (textView5 != null && (viewM = a.m((i10 = Ac.e.viewClickNotice), viewInflate)) != null) {
                                                                this.f35306d = new D(viewInflate, textView, imageView, imageView2, imageView3, linearLayout, aVLoadingIndicatorView, recyclerView, recyclerView2, modelPremiumScrollNotice, textView2, textView3, textView4, textView5, viewM);
                                                                setBackgroundResource(r.cv_rect_corner_12_bg_white);
                                                                setPadding(0, 0, 0, CommonViewExtKt.getDp(12));
                                                                setLayoutParams(new ConstraintLayout.LayoutParams(-1, CommonViewExtKt.getDp(161)));
                                                                PagerGridLayoutManager pagerGridLayoutManager = new PagerGridLayoutManager(1, 3);
                                                                this.f35309g = pagerGridLayoutManager;
                                                                recyclerView.setLayoutManager(pagerGridLayoutManager);
                                                                pagerGridLayoutManager.setOrientation(0);
                                                                pagerGridLayoutManager.f25200Q = false;
                                                                Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
                                                                modelPremiumScrollNotice.f35312b = this;
                                                                AbstractC0780y.m(V.f(this), null, null, new He.t(this, modelPremiumScrollNotice, null), 3);
                                                                recyclerView.setHasFixedSize(true);
                                                                recyclerView.setAdapter(getMAdapter());
                                                                getMAdapter().setOnItemClickListener(new c0(21, this, context));
                                                                viewM.setOnClickListener(new b(1));
                                                                h.s(this, false);
                                                                return;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
