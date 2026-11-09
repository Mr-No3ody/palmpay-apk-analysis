package com.transsnet.palmpay.ui.view;

import Ab.C;
import Ab.ViewOnClickListenerC0053e;
import C0.G;
import L6.b;
import M1.j;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.text.ImageTextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PalmPrizeItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002a.a;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p370ye.i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/ui/view/ModelPalmPrizeBanner;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lye/i;", "d", "Lkotlin/Lazy;", "getMAdapter", "()Lye/i;", "mAdapter", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelPalmPrizeBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelPalmPrizeBanner.kt\ncom/transsnet/palmpay/ui/view/ModelPalmPrizeBanner\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,144:1\n116#2:145\n*S KotlinDebug\n*F\n+ 1 ModelPalmPrizeBanner.kt\ncom/transsnet/palmpay/ui/view/ModelPalmPrizeBanner\n*L\n112#1:145\n*E\n"})
public final class ModelPalmPrizeBanner extends BaseConstraintLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f35301e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f35302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f35303d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPalmPrizeBanner(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(ModelPalmPrizeBanner modelPalmPrizeBanner, j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        PalmPrizeItem palmPrizeItem = (PalmPrizeItem) modelPalmPrizeBanner.getMAdapter().getItem(i7);
        if (r0.U0() || TextUtils.isEmpty(palmPrizeItem.lotteryId)) {
            return;
        }
        d.x(a.e(new Pair("lotteryId", palmPrizeItem.lotteryId)), "PalmPrizeDetail");
        n0.g().k(((ClickEvent) G.f("PalmPrize", "event_type", "Click_Event")).add("element_name", "PalmPrize_Reward_item").add("element_details", palmPrizeItem.lotteryId));
    }

    private final i getMAdapter() {
        return (i) this.f35303d.getValue();
    }

    public final void d() {
        if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new He.e(null, this), 2));
        }
    }

    public final void e(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List list2 = list;
        if (list2.isEmpty()) {
            h.s(this, false);
        } else {
            h.s(this, true);
            getMAdapter().setList(list2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPalmPrizeBanner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPalmPrizeBanner(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPalmPrizeBanner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35303d = C2131j.b(new G9.j(12));
        View viewInflate = View.inflate(context, Ac.f.main_layout_reward_palmprize_banner, this);
        int i10 = Ac.e.rvPalmPrize;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
        if (recyclerView != null) {
            i10 = Ac.e.tvMore;
            ImageTextView imageTextView = (ImageTextView) p059e1.a.m(i10, viewInflate);
            if (imageTextView != null) {
                i10 = Ac.e.tvTitle;
                if (((TextView) p059e1.a.m(i10, viewInflate)) != null) {
                    setBackgroundResource(r.cv_rect_corner_12_bg_white);
                    setPadding(0, 0, 0, CommonViewExtKt.getDp(12));
                    setLayoutParams(new ConstraintLayout.LayoutParams(-1, CommonViewExtKt.getDp(182)));
                    recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                    C1548f c1548f = new C1548f(context.getColor(b.pp_transparent), CommonViewExtKt.getDp(12), 0, 0);
                    c1548f.f31336e = true;
                    recyclerView.addItemDecoration(c1548f);
                    recyclerView.setAdapter(getMAdapter());
                    getMAdapter().setOnItemClickListener(new Dg.a(this, 18));
                    imageTextView.setOnClickListener(new ViewOnClickListenerC0053e(19));
                    h.s(this, false);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
