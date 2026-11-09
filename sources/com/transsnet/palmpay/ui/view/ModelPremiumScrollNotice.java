package com.transsnet.palmpay.ui.view;

import Hb.L;
import He.p;
import He.r;
import Wf.t0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u000f\u001a\u00060\nR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/ui/view/ModelPremiumScrollNotice;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LHe/p;", "f", "Lkotlin/Lazy;", "getScroller", "()LHe/p;", "scroller", "He/r", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelPremiumScrollNotice extends RecyclerView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f35310g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelPremiumBenefits f35312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f35313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f35314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f35316f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPremiumScrollNotice(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getScroller() {
        return (p) this.f35316f.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t0 t0Var = this.f35313c;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        this.f35313c = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPremiumScrollNotice(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPremiumScrollNotice(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPremiumScrollNotice(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35311a = 2000L;
        this.f35314d = new ArrayList();
        this.f35316f = C2131j.b(new L(2, this, context));
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        setAdapter(new r(this));
        setNestedScrollingEnabled(false);
    }
}
