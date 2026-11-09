package com.transsnet.palmpay.credit.view;

import Ab.D;
import K8.b;
import Ya.d;
import Ya.e;
import Ya.f;
import Ya.g;
import Ya.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.lifecycle.AbstractC1205o;
import com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager;
import com.transsnet.palmpay.credit.bean.OcIntroduceData;
import com.transsnet.palmpay.credit.view.FlexiUserEvaluationView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.q;
import com.zhpan.indicator.IndicatorView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p221ob.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/view/FlexiUserEvaluationView;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/lifecycle/o;", "lifecycleRegistry", "", "setLifecycleRegistry", "(Landroidx/lifecycle/o;)V", "Lgf/a;", "c", "Lgf/a;", "getMCompositeDisposableNext", "()Lgf/a;", "setMCompositeDisposableNext", "(Lgf/a;)V", "mCompositeDisposableNext", "d", "getMCompositeDisposableNet", "setMCompositeDisposableNet", "mCompositeDisposableNet", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiUserEvaluationView extends BaseModel {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f30761p = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public p103gf.a mCompositeDisposableNext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public p103gf.a mCompositeDisposableNet;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f30764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BannerViewPager f30765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f30766g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IndicatorView f30767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CustomTextSwitcher f30768j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f30769o;

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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiUserEvaluationView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(final Context context) {
        View viewInflate = View.inflate(context, f.cs_cl_view_user_evaluation, this);
        this.f30764e = (FrameLayout) viewInflate.findViewById(e.flNotification);
        this.f30765f = (BannerViewPager) viewInflate.findViewById(e.cl_user_evaluation);
        this.f30767i = (IndicatorView) viewInflate.findViewById(e.clIndicatorView);
        CustomTextSwitcher customTextSwitcher = (CustomTextSwitcher) viewInflate.findViewById(e.notification_switcher);
        this.f30768j = customTextSwitcher;
        if (customTextSwitcher != null) {
            customTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: Gb.i
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    int i7 = FlexiUserEvaluationView.f30761p;
                    TextView textView = new TextView(context);
                    FlexiUserEvaluationView flexiUserEvaluationView = this;
                    if (flexiUserEvaluationView.f30769o == 1) {
                        textView.setTextColor(flexiUserEvaluationView.f31417a.getColor(Ya.b.cs_flexi_main_color));
                    } else {
                        textView.setTextColor(flexiUserEvaluationView.f31417a.getColor(Ya.b.cs_cl_main_color));
                    }
                    textView.setMaxLines(1);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    return textView;
                }
            });
        }
        return viewInflate;
    }

    @Nullable
    public final p103gf.a getMCompositeDisposableNet() {
        return this.mCompositeDisposableNet;
    }

    @Nullable
    public final p103gf.a getMCompositeDisposableNext() {
        return this.mCompositeDisposableNext;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103gf.a aVar = this.mCompositeDisposableNext;
        if (aVar != null) {
            aVar.dispose();
            this.mCompositeDisposableNext = null;
        }
        p103gf.a aVar2 = this.mCompositeDisposableNet;
        if (aVar2 != null) {
            aVar2.dispose();
            this.mCompositeDisposableNet = null;
        }
    }

    public final void setLifecycleRegistry(@NotNull AbstractC1205o lifecycleRegistry) {
        ArrayList arrayList;
        BannerViewPager indicatorSliderGap;
        BannerViewPager canLoop;
        BannerViewPager autoPlay;
        BannerViewPager indicatorView;
        BannerViewPager lifecycleRegistry2;
        BannerViewPager indicatorStyle;
        BannerViewPager indicatorSlideMode;
        BannerViewPager roundCorner;
        BannerViewPager indicatorHeight;
        BannerViewPager indicatorSliderColor;
        BannerViewPager indicatorSliderWidth;
        BannerViewPager adapter;
        Intrinsics.checkNotNullParameter(lifecycleRegistry, "lifecycleRegistry");
        Context context = getContext();
        if (context == null || (arrayList = this.f30766g) == null || !arrayList.isEmpty()) {
            return;
        }
        int i7 = this.f30769o;
        if (i7 == 1 || i7 == 2) {
            ArrayList arrayList2 = this.f30766g;
            if (arrayList2 != null) {
                arrayList2.add(new OcIntroduceData(this.f31417a.getString(g.cs_cl_used_time_1), d.cs_cl_used_head_1, new SpannableStringBuilder(this.f31417a.getString(g.cs_cl_first_name_1)), new SpannableStringBuilder(this.f31417a.getString(g.cs_cl_used_content_1))));
            }
            ArrayList arrayList3 = this.f30766g;
            if (arrayList3 != null) {
                arrayList3.add(new OcIntroduceData(this.f31417a.getString(g.cs_cl_used_time_2), d.cs_cl_used_head_2, new SpannableStringBuilder(this.f31417a.getString(g.cs_cl_first_name_2)), new SpannableStringBuilder(this.f31417a.getString(g.cs_cl_used_content_2))));
            }
            ArrayList arrayList4 = this.f30766g;
            if (arrayList4 != null) {
                arrayList4.add(new OcIntroduceData(this.f31417a.getString(g.cs_cl_used_time_3), d.cs_cl_used_head_3, new SpannableStringBuilder(this.f31417a.getString(g.cs_cl_first_name_3)), new SpannableStringBuilder(this.f31417a.getString(g.cs_cl_used_content_3))));
            }
            ArrayList arrayList5 = this.f30766g;
            if (arrayList5 != null) {
                arrayList5.add(new OcIntroduceData(this.f31417a.getString(g.cs_cl_used_time_4), d.cs_cl_used_head_4, new SpannableStringBuilder(this.f31417a.getString(g.cs_cl_first_name_4)), new SpannableStringBuilder(this.f31417a.getString(g.cs_cl_used_content_4))));
            }
        }
        if (i7 == 1 || i7 == 3) {
            ArrayList arrayList6 = this.f30766g;
            if (arrayList6 != null) {
                arrayList6.add(new OcIntroduceData(this.f31417a.getString(g.cs_oc_ssed_flexi_for_years), d.cs_oc_open_first_avatar, new SpannableStringBuilder(this.f31417a.getString(g.cs_oc_open_first_name)), new SpannableStringBuilder(this.f31417a.getString(g.cs_oc_before_my_salary))));
            }
            ArrayList arrayList7 = this.f30766g;
            if (arrayList7 != null) {
                arrayList7.add(new OcIntroduceData(this.f31417a.getString(g.cs_oc_used_flexi_for_months), d.cs_oc_open_second_avatar, new SpannableStringBuilder(this.f31417a.getString(g.cs_oc_open_second_name)), new SpannableStringBuilder(this.f31417a.getString(g.cs_oc_in_the_last_month))));
            }
            ArrayList arrayList8 = this.f30766g;
            if (arrayList8 != null) {
                arrayList8.add(new OcIntroduceData(this.f31417a.getString(g.cs_oc_used_flexi_for_one_years), d.cs_oc_open_third_avatar, new SpannableStringBuilder(this.f31417a.getString(g.cs_oc_open_third_name)), new SpannableStringBuilder(this.f31417a.getString(g.cs_oc_using_flexi_for_one_year))));
            }
        }
        b bVar = new b(1);
        BannerViewPager bannerViewPager = this.f30765f;
        if (bannerViewPager == null || (indicatorSliderGap = bannerViewPager.setIndicatorSliderGap(getResources().getDimensionPixelOffset(q.dp6))) == null || (canLoop = indicatorSliderGap.setCanLoop(true)) == null || (autoPlay = canLoop.setAutoPlay(false)) == null || (indicatorView = autoPlay.setIndicatorView(this.f30767i)) == null || (lifecycleRegistry2 = indicatorView.setLifecycleRegistry(lifecycleRegistry)) == null || (indicatorStyle = lifecycleRegistry2.setIndicatorStyle(0)) == null || (indicatorSlideMode = indicatorStyle.setIndicatorSlideMode(4)) == null || (roundCorner = indicatorSlideMode.setRoundCorner(getResources().getDimensionPixelOffset(q.dp4))) == null || (indicatorHeight = roundCorner.setIndicatorHeight(getResources().getDimensionPixelOffset(q.dp4))) == null || (indicatorSliderColor = indicatorHeight.setIndicatorSliderColor(context.getColor(Ya.b.cs_cl_indicator_unselected), context.getColor(Ya.b.cs_cl_indicator_selected))) == null || (indicatorSliderWidth = indicatorSliderColor.setIndicatorSliderWidth(getResources().getDimensionPixelOffset(q.dp4))) == null || (adapter = indicatorSliderWidth.setAdapter(bVar)) == null) {
            return;
        }
        adapter.create(this.f30766g);
    }

    public final void setMCompositeDisposableNet(@Nullable p103gf.a aVar) {
        this.mCompositeDisposableNet = aVar;
    }

    public final void setMCompositeDisposableNext(@Nullable p103gf.a aVar) {
        this.mCompositeDisposableNext = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiUserEvaluationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiUserEvaluationView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiUserEvaluationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCompositeDisposableNext = new p103gf.a();
        this.mCompositeDisposableNet = new p103gf.a();
        this.f30769o = 3;
        TypedArray typedArrayObtainStyledAttributes = this.f31417a.obtainStyledAttributes(attributeSet, h.FlexiUserEvaluationView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i10 = typedArrayObtainStyledAttributes.getInt(h.FlexiUserEvaluationView_businessType, 3);
        this.f30769o = i10;
        typedArrayObtainStyledAttributes.recycle();
        this.f30766g = new ArrayList();
        c.f40268a.getInstance().getClass();
        c.a().queryEvaluationNotice(i10).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 8));
    }
}
