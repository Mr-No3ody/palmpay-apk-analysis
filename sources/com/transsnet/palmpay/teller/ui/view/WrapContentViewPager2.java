package com.transsnet.palmpay.teller.ui.view;

import G9.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p024b9.g;
import p041ce.E;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R0\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/WrapContentViewPager2;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/viewpager2/widget/ViewPager2;", "a", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager2", "()Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "value", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "adapter", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "currentItem", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWrapContentViewPager2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrapContentViewPager2.kt\ncom/transsnet/palmpay/teller/ui/view/WrapContentViewPager2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
public final class WrapContentViewPager2 extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34365e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ViewPager2 viewPager2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f34368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f34369d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WrapContentViewPager2(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(WrapContentViewPager2 wrapContentViewPager2) {
        View viewFindViewByPosition;
        int width;
        wrapContentViewPager2.f34367b = false;
        ViewPager2 viewPager2 = wrapContentViewPager2.viewPager2;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) == 0) {
            ViewGroup.LayoutParams layoutParams = wrapContentViewPager2.getLayoutParams();
            if (layoutParams == null || layoutParams.height == -2) {
                return;
            }
            layoutParams.height = -2;
            wrapContentViewPager2.setLayoutParams(layoutParams);
            return;
        }
        RecyclerView.LayoutManager layoutManager = wrapContentViewPager2.getRecyclerView().getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(viewPager2.getCurrentItem())) == null || (width = (wrapContentViewPager2.getWidth() - wrapContentViewPager2.getPaddingLeft()) - wrapContentViewPager2.getPaddingRight()) <= 0) {
            return;
        }
        viewFindViewByPosition.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = wrapContentViewPager2.getPaddingBottom() + wrapContentViewPager2.getPaddingTop() + viewFindViewByPosition.getMeasuredHeight();
        if (paddingBottom <= 0 || wrapContentViewPager2.getLayoutParams().height == paddingBottom) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = wrapContentViewPager2.getLayoutParams();
        layoutParams2.height = paddingBottom;
        wrapContentViewPager2.setLayoutParams(layoutParams2);
    }

    private final RecyclerView getRecyclerView() {
        View childAt = this.viewPager2.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        return (RecyclerView) childAt;
    }

    public final void b() {
        if (this.f34367b) {
            return;
        }
        this.f34367b = true;
        post(this.f34369d);
    }

    @Nullable
    public final RecyclerView.Adapter<?> getAdapter() {
        return this.viewPager2.getAdapter();
    }

    public final int getCurrentItem() {
        return this.viewPager2.getCurrentItem();
    }

    @NotNull
    public final ViewPager2 getViewPager2() {
        return this.viewPager2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f34368c);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f34368c);
        }
        removeCallbacks(this.f34369d);
        this.f34367b = false;
        super.onDetachedFromWindow();
    }

    public final void setAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && layoutParams.height != -2) {
            layoutParams.height = -2;
            setLayoutParams(layoutParams);
        }
        this.viewPager2.setAdapter(adapter);
        b();
    }

    public final void setCurrentItem(int i7) {
        this.viewPager2.setCurrentItem(i7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WrapContentViewPager2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WrapContentViewPager2(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WrapContentViewPager2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(Pd.c.qt_wrap_content_view_pager_internal);
        this.viewPager2 = viewPager2;
        E e10 = new E(this);
        int i10 = 1;
        this.f34368c = new r(this, i10);
        this.f34369d = new g(this, i10);
        addView(viewPager2, new FrameLayout.LayoutParams(-1, -1));
        viewPager2.registerOnPageChangeCallback(e10);
    }
}
