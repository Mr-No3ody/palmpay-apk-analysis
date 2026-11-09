package com.transsnet.palmpay.core.viewmodel;

import Bc.C0105b;
import Ua.v0;
import Wf.t0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.V;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardResp;
import com.transsnet.palmpay.custom_view.autoheightviewpager.AutoHeightViewPager;
import com.transsnet.palmpay.custom_view.model.BaseLinearLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p025ba.e;
import p025ba.g;
import p025ba.j;
import p183m6.n;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/OrderResultRewardModel;", "Lcom/transsnet/palmpay/custom_view/model/BaseLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/core/viewmodel/OnClaimRewardListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnClaimRewardListener", "(Lcom/transsnet/palmpay/core/viewmodel/OnClaimRewardListener;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrderResultRewardModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderResultRewardModel.kt\ncom/transsnet/palmpay/core/viewmodel/OrderResultRewardModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,395:1\n1869#2,2:396\n1#3:398\n116#4:399\n116#4:400\n*S KotlinDebug\n*F\n+ 1 OrderResultRewardModel.kt\ncom/transsnet/palmpay/core/viewmodel/OrderResultRewardModel\n*L\n183#1:396,2\n276#1:399\n297#1:400\n*E\n"})
public final class OrderResultRewardModel extends BaseLinearLayout {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0105b f28518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f28519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Mb.a f28520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f28522g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OrderResultRewardResp f28523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28524j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnClaimRewardListener f28526p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultRewardModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(String str, String str2, String str3) {
        String strD = "";
        if (this.f28523i == null) {
            this.f28524j = str3;
            this.f28525o = str;
            C0105b c0105b = this.f28518c;
            if (c0105b != null) {
                ((LottieAnimationView) c0105b.f666f).setAnimation(j.core_transfer_result_payments);
            }
            if (c0105b != null) {
                ((LottieAnimationView) c0105b.f666f).e();
            }
            try {
                strD = n.f39523a.instance().d("featurePaymentRewardQueryDelay", "");
            } catch (Exception unused) {
            }
            long j6 = 2000;
            if (!TextUtils.isEmpty(strD)) {
                try {
                    long jOptLong = new JSONObject(strD).optLong(str, 2000L);
                    if (jOptLong > 0) {
                        j6 = jOptLong;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.f28522g = org.chromium.support_lib_boundary.util.b.r(V.f(this), j6, null, new v0(this, str, str2, str3, null), null, 44);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseLinearLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28521f = true;
        t0 t0Var = this.f28522g;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
    }

    public final void setOnClaimRewardListener(@NotNull OnClaimRewardListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f28526p = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultRewardModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OrderResultRewardModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultRewardModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(g.core_layout_order_result_reward, this);
        int i10 = e.ahvpPaymentRewards;
        AutoHeightViewPager autoHeightViewPager = (AutoHeightViewPager) p059e1.a.m(i10, this);
        if (autoHeightViewPager != null) {
            i10 = e.lavLoading;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) p059e1.a.m(i10, this);
            if (lottieAnimationView != null) {
                i10 = e.llIndicator;
                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, this);
                if (linearLayout != null) {
                    i10 = e.llLoading;
                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i10, this);
                    if (linearLayout2 != null) {
                        i10 = e.tvRewardTitle;
                        TextView textView = (TextView) p059e1.a.m(i10, this);
                        if (textView != null) {
                            this.f28518c = new C0105b(this, autoHeightViewPager, lottieAnimationView, linearLayout, linearLayout2, textView);
                            setOrientation(1);
                            setPadding(0, CommonViewExtKt.getDp(12), 0, CommonViewExtKt.getDp(12));
                            setBackgroundResource(r.cv_shape_rect_corner_12_bg_secondary);
                            h.s(this, false);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }
}
