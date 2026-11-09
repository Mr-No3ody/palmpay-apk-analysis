package com.transsnet.palmpay.core.viewmodel;

import Ab.D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.target.Target;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/FailResultPageAdView;", "Lcom/transsnet/adsdk/widgets/SingleAdView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FailResultPageAdView extends SingleAdView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailResultPageAdView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
    }

    @Override // com.transsnet.adsdk.widgets.SingleAdView, com.bumptech.glide.request.RequestListener
    public final boolean onLoadFailed(u uVar, Object obj, Target<Drawable> target, boolean z3) {
        Intrinsics.checkNotNullParameter(target, "target");
        return super.onLoadFailed(uVar, obj, target, z3);
    }

    @Override // com.transsnet.adsdk.widgets.SingleAdView, com.bumptech.glide.request.RequestListener
    public final /* bridge */ /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, com.bumptech.glide.load.a aVar, boolean z3) {
        return onResourceReady(drawable, obj, (Target) target, aVar, z3);
    }

    public final void s(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((PayApiService) p324va.c.f43141a.f14621b).payFailResultAd(str).k(f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 27));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailResultPageAdView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.transsnet.adsdk.widgets.SingleAdView
    public final boolean onResourceReady(Drawable resource, Object model, Target target, com.bumptech.glide.load.a dataSource, boolean z3) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.e(target);
        return super.onResourceReady(resource, model, (Target<Drawable>) target, dataSource, z3);
    }
}
