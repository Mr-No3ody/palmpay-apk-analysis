package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/custom_view/PpSwipeRefreshLayout;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnRefreshListener", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PpSwipeRefreshLayout extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwipeRefreshLayout.OnRefreshListener f31095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PpSwipeRefreshLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setOnRefreshListener(@Nullable SwipeRefreshLayout.OnRefreshListener listener) {
        super.setOnRefreshListener(listener);
        this.f31095a = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PpSwipeRefreshLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
