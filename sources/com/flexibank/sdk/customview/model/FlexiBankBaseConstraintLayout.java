package com.flexibank.sdk.customview.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/flexibank/sdk/customview/model/FlexiBankBaseConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/flexibank/sdk/customview/model/FlexiBankBaseLayoutLifecycleOwner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/lifecycle/o;", "getLifecycle", "()Landroidx/lifecycle/o;", "lifecycle", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankBaseConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankBaseConstraintLayout.kt\ncom/flexibank/sdk/customview/model/FlexiBankBaseConstraintLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1863#2,2:53\n*S KotlinDebug\n*F\n+ 1 FlexiBankBaseConstraintLayout.kt\ncom/flexibank/sdk/customview/model/FlexiBankBaseConstraintLayout\n*L\n43#1:53,2\n*E\n"})
public class FlexiBankBaseConstraintLayout extends ConstraintLayout implements FlexiBankBaseLayoutLifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1212w f22242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankBaseConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        C1212w c1212w = new C1212w(this);
        c1212w.g(EnumC1204n.f17462c);
        this.f22242a = c1212w;
        this.f22243b = new ArrayList();
    }

    @Override // com.flexibank.sdk.customview.model.FlexiBankBaseLayoutLifecycleOwner
    public final void addJob(Job job) {
        this.f22243b.add(job);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public AbstractC1205o getLifecycle() {
        return this.f22242a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1212w c1212w = this.f22242a;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17463d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1212w c1212w = this.f22242a;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17462c);
        }
        for (Job job : this.f22243b) {
            if (job != null && job.isActive()) {
                job.cancel((CancellationException) null);
            }
        }
    }
}
