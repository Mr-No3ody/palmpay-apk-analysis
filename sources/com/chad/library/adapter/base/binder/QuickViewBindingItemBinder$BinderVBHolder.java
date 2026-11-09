package com.chad.library.adapter.base.binder;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/chad/library/adapter/base/binder/QuickViewBindingItemBinder$BinderVBHolder", "Landroidx/viewbinding/ViewBinding;", "VB", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "viewBinding", "<init>", "(Landroidx/viewbinding/ViewBinding;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class QuickViewBindingItemBinder$BinderVBHolder<VB extends ViewBinding> extends BaseViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewBinding f21080a;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickViewBindingItemBinder$BinderVBHolder(@NotNull VB viewBinding) {
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        View root = viewBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "viewBinding.root");
        super(root);
        this.f21080a = viewBinding;
    }
}
