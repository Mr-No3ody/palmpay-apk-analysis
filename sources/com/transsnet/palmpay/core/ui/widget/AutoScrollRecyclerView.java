package com.transsnet.palmpay.core.ui.widget;

import M1.j;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/AutoScrollRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LM1/j;", "adapter", "", "setListAdapter", "(LM1/j;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoScrollRecyclerView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollRecyclerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        new Handler(Looper.getMainLooper());
    }

    public final void setListAdapter(@NotNull j adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.setAdapter(adapter);
        View view = new View(getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View view2 = new View(getContext());
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        j.addHeaderView$default(adapter, view, 0, 0, 6, null);
        j.addFooterView$default(adapter, view2, 0, 0, 6, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        new Handler(Looper.getMainLooper());
    }
}
