package com.transsnet.palmpay.core.viewmodel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ScrollActivityWebView;", "Lcom/transsnet/palmpay/core/viewmodel/ActivityWebView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScrollActivityWebView extends ActivityWebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollActivityWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ViewParent b(View view) {
        ViewParent parent = view.getParent();
        return (parent == 0 || (parent instanceof ViewPager) || (parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || (parent instanceof NestedScrollView) || (parent instanceof GridView) || !(parent instanceof View)) ? parent : b((View) parent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i7, int i10, boolean z3, boolean z8) {
        ViewParent viewParentB;
        if (z8 && (viewParentB = b(this)) != null) {
            viewParentB.requestDisallowInterceptTouchEvent(false);
        }
        super.onOverScrolled(i7, i10, z3, z8);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        ViewParent viewParentB;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() == 0 && (viewParentB = b(this)) != null) {
            viewParentB.requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollActivityWebView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollActivityWebView(@NotNull Context context, @NotNull AttributeSet attrs, int i7) {
        super(context, attrs, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
