package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/BaseFrameLayout;", "Landroid/widget/FrameLayout;", "Lcom/transsnet/palmpay/custom_view/model/BaseLayoutLifecycleOwner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/lifecycle/o;", "getLifecycle", "()Landroidx/lifecycle/o;", "lifecycle", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseFrameLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFrameLayout.kt\ncom/transsnet/palmpay/custom_view/model/BaseFrameLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1869#2,2:53\n*S KotlinDebug\n*F\n+ 1 BaseFrameLayout.kt\ncom/transsnet/palmpay/custom_view/model/BaseFrameLayout\n*L\n44#1:53,2\n*E\n"})
public class BaseFrameLayout extends FrameLayout implements BaseLayoutLifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1212w f31414b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseFrameLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseLayoutLifecycleOwner
    public final void addJob(Job job) {
        this.f31413a.add(job);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public AbstractC1205o getLifecycle() {
        return this.f31414b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1212w c1212w = this.f31414b;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17463d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1212w c1212w = this.f31414b;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17462c);
        }
        for (Job job : this.f31413a) {
            if (job != null && job.isActive()) {
                job.cancel((CancellationException) null);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BaseFrameLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31413a = new ArrayList();
        C1212w c1212w = new C1212w(this);
        c1212w.g(EnumC1204n.f17462c);
        this.f31414b = c1212w;
    }
}
