package com.transsnet.palmpay.core.viewmodel;

import C9.C0158z;
import Ua.B;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeTextView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import com.transsnet.palmpay.custom_view.model.BaseFrameLayout;
import com.transsnet.palmpay.custom_view.x;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelBillNoticeItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeViewV2;", "e", "Lkotlin/Lazy;", "getLimitTimeAd", "()Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeViewV2;", "limitTimeAd", "Landroid/widget/LinearLayout;", "f", "getChannelNoticeLayout", "()Landroid/widget/LinearLayout;", "channelNoticeLayout", "Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeTextView;", "g", "getChannelNoticeTv", "()Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeTextView;", "channelNoticeTv", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelBillNoticeItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelBillNoticeItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelBillNoticeItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,142:1\n1#2:143\n116#3:144\n*S KotlinDebug\n*F\n+ 1 ModelBillNoticeItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelBillNoticeItem\n*L\n118#1:144\n*E\n"})
public final class ModelBillNoticeItem extends BaseFrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f28273i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28278g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillNoticeItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(String str, String str2) {
        this.f28274c = str;
        this.f28275d = str2;
        LinearLayout channelNoticeLayout = getChannelNoticeLayout();
        if (channelNoticeLayout != null) {
            h.s(channelNoticeLayout, false);
        }
        MarqueeViewV2 limitTimeAd = getLimitTimeAd();
        if (limitTimeAd != null) {
            h.s(limitTimeAd, false);
        }
        if (BaseApplication.hasLogin() && !TextUtils.isEmpty(this.f28274c)) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new B(null, this), 2));
        }
        String str3 = this.f28275d;
        if (str3 != null) {
            String str4 = str3.length() > 0 ? str3 : null;
            if (str4 != null) {
                MarqueeViewV2 limitTimeAd2 = getLimitTimeAd();
                if (limitTimeAd2 != null) {
                    limitTimeAd2.setSlotId(str4);
                }
                MarqueeViewV2 limitTimeAd3 = getLimitTimeAd();
                if (limitTimeAd3 != null) {
                    limitTimeAd3.setAdListener(new C0158z(this, 12));
                }
            }
        }
    }

    @Nullable
    public final LinearLayout getChannelNoticeLayout() {
        return (LinearLayout) this.f28277f.getValue();
    }

    @Nullable
    public final MarqueeTextView getChannelNoticeTv() {
        return (MarqueeTextView) this.f28278g.getValue();
    }

    @Nullable
    public final MarqueeViewV2 getLimitTimeAd() {
        return (MarqueeViewV2) this.f28276e.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillNoticeItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelBillNoticeItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillNoticeItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28276e = C2131j.b(new Function0(this) { // from class: Ua.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillNoticeItem f9508b;

            {
                this.f9508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillNoticeItem modelBillNoticeItem = this.f9508b;
                switch (i10) {
                    case 0:
                        int i11 = ModelBillNoticeItem.f28273i;
                        return (MarqueeViewV2) modelBillNoticeItem.findViewById(p025ba.e.tv_limit_time_offer);
                    case 1:
                        int i12 = ModelBillNoticeItem.f28273i;
                        return (LinearLayout) modelBillNoticeItem.findViewById(p025ba.e.ll_channel_notice);
                    default:
                        int i13 = ModelBillNoticeItem.f28273i;
                        return (MarqueeTextView) modelBillNoticeItem.findViewById(p025ba.e.tv_channel_notice);
                }
            }
        });
        final int i11 = 1;
        this.f28277f = C2131j.b(new Function0(this) { // from class: Ua.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillNoticeItem f9508b;

            {
                this.f9508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillNoticeItem modelBillNoticeItem = this.f9508b;
                switch (i11) {
                    case 0:
                        int i12 = ModelBillNoticeItem.f28273i;
                        return (MarqueeViewV2) modelBillNoticeItem.findViewById(p025ba.e.tv_limit_time_offer);
                    case 1:
                        int i13 = ModelBillNoticeItem.f28273i;
                        return (LinearLayout) modelBillNoticeItem.findViewById(p025ba.e.ll_channel_notice);
                    default:
                        int i14 = ModelBillNoticeItem.f28273i;
                        return (MarqueeTextView) modelBillNoticeItem.findViewById(p025ba.e.tv_channel_notice);
                }
            }
        });
        final int i12 = 2;
        this.f28278g = C2131j.b(new Function0(this) { // from class: Ua.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelBillNoticeItem f9508b;

            {
                this.f9508b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelBillNoticeItem modelBillNoticeItem = this.f9508b;
                switch (i12) {
                    case 0:
                        int i13 = ModelBillNoticeItem.f28273i;
                        return (MarqueeViewV2) modelBillNoticeItem.findViewById(p025ba.e.tv_limit_time_offer);
                    case 1:
                        int i14 = ModelBillNoticeItem.f28273i;
                        return (LinearLayout) modelBillNoticeItem.findViewById(p025ba.e.ll_channel_notice);
                    default:
                        int i15 = ModelBillNoticeItem.f28273i;
                        return (MarqueeTextView) modelBillNoticeItem.findViewById(p025ba.e.tv_channel_notice);
                }
            }
        });
        View.inflate(context, g.core_layout_biller_notice_view, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.CVModelBillerNotice);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f28274c = typedArrayObtainStyledAttributes.getString(x.CVModelBillerNotice_cv_notice_category_id);
        String string = typedArrayObtainStyledAttributes.getString(x.CVModelBillerNotice_cv_notice_slot_id);
        this.f28275d = string;
        a(this.f28274c, string);
    }
}
