package com.transsnet.palmpay.core.viewmodel;

import Oc.j;
import Pa.r0;
import Ua.C0642x;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CorePointInfoBean;
import com.transsnet.palmpay.core.viewmodel.ModelAvailablePointItem;
import com.transsnet.palmpay.custom_view.model.BaseLinearLayout;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p025ba.m;
import p042cg.e;
import p042cg.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u001a\u001a\n \u0010*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelAvailablePointItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "transType", "", "setTransType", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "c", "Lkotlin/Lazy;", "getTv_name", "()Landroid/widget/TextView;", "tv_name", "Landroid/widget/ImageView;", "d", "getIv_icon", "()Landroid/widget/ImageView;", "iv_icon", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelAvailablePointItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelAvailablePointItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelAvailablePointItem\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,134:1\n116#2:135\n*S KotlinDebug\n*F\n+ 1 ModelAvailablePointItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelAvailablePointItem\n*L\n85#1:135\n*E\n"})
public final class ModelAvailablePointItem extends BaseLinearLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f28256i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28261g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailablePointItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(ModelAvailablePointItem modelAvailablePointItem, CorePointInfoBean corePointInfoBean) {
        TextView tv_name;
        ImageView iv_icon = modelAvailablePointItem.getIv_icon();
        if (iv_icon != null && !TextUtils.isEmpty(corePointInfoBean.icon)) {
            r0.l1(corePointInfoBean.icon, iv_icon);
        }
        String str = modelAvailablePointItem.f28259e ? corePointInfoBean.darkContent : corePointInfoBean.content;
        if (str == null) {
            str = corePointInfoBean.content;
        }
        if (!TextUtils.isEmpty(str) && (tv_name = modelAvailablePointItem.getTv_name()) != null) {
            tv_name.setText(CommonExtKt.formatHtmlText(str));
        }
        modelAvailablePointItem.setOnClickListener(new j(10, corePointInfoBean, modelAvailablePointItem));
    }

    private final ImageView getIv_icon() {
        return (ImageView) this.f28258d.getValue();
    }

    private final TextView getTv_name() {
        return (TextView) this.f28257c.getValue();
    }

    public final void b() {
        if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new C0642x(null, this), 2));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseLinearLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28260f) {
            b();
        }
    }

    public final void setTransType(@Nullable String transType) {
        this.f28261g = transType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailablePointItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelAvailablePointItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailablePointItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28257c = C2131j.b(new Function0(this) { // from class: Ua.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAvailablePointItem f9486b;

            {
                this.f9486b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAvailablePointItem modelAvailablePointItem = this.f9486b;
                switch (i10) {
                    case 0:
                        int i11 = ModelAvailablePointItem.f28256i;
                        return (TextView) modelAvailablePointItem.findViewById(p025ba.e.tv_name);
                    default:
                        int i12 = ModelAvailablePointItem.f28256i;
                        return (ImageView) modelAvailablePointItem.findViewById(p025ba.e.iv_icon);
                }
            }
        });
        final int i11 = 1;
        this.f28258d = C2131j.b(new Function0(this) { // from class: Ua.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAvailablePointItem f9486b;

            {
                this.f9486b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAvailablePointItem modelAvailablePointItem = this.f9486b;
                switch (i11) {
                    case 0:
                        int i12 = ModelAvailablePointItem.f28256i;
                        return (TextView) modelAvailablePointItem.findViewById(p025ba.e.tv_name);
                    default:
                        int i13 = ModelAvailablePointItem.f28256i;
                        return (ImageView) modelAvailablePointItem.findViewById(p025ba.e.iv_icon);
                }
            }
        });
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.CoreModelAvailPointItems, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f28261g = typedArrayObtainStyledAttributes.getString(m.CoreModelAvailPointItems_pointTransType);
        this.f28260f = typedArrayObtainStyledAttributes.getBoolean(m.CoreModelAvailPointItems_pointAutoload, false);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, g.core_layout_available_point_item, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(20)));
        setVisibility(8);
    }
}
