package com.transsnet.palmpay.teller.ui.view;

import M1.j;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pd.g;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BillQuickAccessBean;
import com.transsnet.palmpay.core.bean.BillerAccessItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseLinearLayout;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041ce.o;
import p041ce.x;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelBillerMoreService;", "Lcom/transsnet/palmpay/custom_view/model/BaseLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lt9/j;", "d", "Lkotlin/Lazy;", "getAdapter", "()Lt9/j;", "adapter", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelBillerMoreService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelBillerMoreService.kt\ncom/transsnet/palmpay/teller/ui/view/ModelBillerMoreService\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,174:1\n116#2:175\n*S KotlinDebug\n*F\n+ 1 ModelBillerMoreService.kt\ncom/transsnet/palmpay/teller/ui/view/ModelBillerMoreService\n*L\n144#1:175\n*E\n"})
public final class ModelBillerMoreService extends BaseLinearLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34338e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f34340d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerMoreService(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(ModelBillerMoreService modelBillerMoreService, Context context, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        BillerAccessItem billerAccessItem = (BillerAccessItem) modelBillerMoreService.getAdapter().getItem(i7);
        if (!"OS App".equals(billerAccessItem != null ? billerAccessItem.linkType : null)) {
            String str = billerAccessItem != null ? billerAccessItem.androidLink : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intentA = F.a(context, str);
            n0.g().k(new ClickEvent("PalmPay_ModelBillerMoreService").add("element_name", modelBillerMoreService.f34339c).add("element_details", str));
            ActivityUtils.startActivity(intentA);
            return;
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        if (!TextUtils.isEmpty(billerAccessItem.androidLink)) {
            Uri uri = Uri.parse("tel:" + Uri.encode(billerAccessItem.androidLink));
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            intent.setData(uri);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private final t9.j getAdapter() {
        return (t9.j) this.f34340d.getValue();
    }

    public final void b(String str, boolean z3) {
        this.f34339c = TransType.TRANS_TYPE_BILLER_BETTING;
        getAdapter().f42364a = i0.V(this);
        if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new x(null, this), 2));
        }
    }

    public final void c(BillQuickAccessBean billQuickAccessBean) {
        List<BillerAccessItem> list;
        if (((billQuickAccessBean == null || (list = billQuickAccessBean.list) == null) ? 0 : list.size()) <= 0) {
            h.s(this, false);
        } else {
            getAdapter().setList(billQuickAccessBean != null ? billQuickAccessBean.list : null);
            h.s(this, true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerMoreService(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelBillerMoreService(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerMoreService(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34340d = C2131j.b(new o(1));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.QtBillerMoreService, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f34339c = typedArrayObtainStyledAttributes.getString(g.QtBillerMoreService_BillerTransType);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = View.inflate(context, Pd.d.qt_layout_biller_more_service, this);
        int i10 = Pd.c.serviceBannerRy;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
        if (recyclerView != null) {
            setBackgroundResource(r.cv_rect_corner_12_bg_white);
            setPadding(CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(12));
            setOrientation(1);
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            recyclerView.addItemDecoration(new C1548f(context.getColor(p.transparent), CommonViewExtKt.getDp(8)));
            recyclerView.setAdapter(getAdapter());
            getAdapter().setOnItemClickListener(new U8.a(21, this, context));
            setVisibility(8);
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
