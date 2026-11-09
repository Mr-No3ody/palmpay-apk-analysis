package com.transsnet.palmpay.custom_view.autoheightviewpager;

import Mb.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/custom_view/autoheightviewpager/AutoHeightViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/viewpager/widget/a;", "adapter", "", "setAdapter", "(Landroidx/viewpager/widget/a;)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoHeightViewPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoHeightViewPager.kt\ncom/transsnet/palmpay/custom_view/autoheightviewpager/AutoHeightViewPager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class AutoHeightViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31191d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoHeightViewPager(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int a(int i7) {
        View view;
        Object adapter = getAdapter();
        AutoHeightPager autoHeightPager = adapter instanceof AutoHeightPager ? (AutoHeightPager) adapter : null;
        if (autoHeightPager == null || (view = autoHeightPager.getView(i7)) == null) {
            return 0;
        }
        view.measure(this.f31188a, View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.f31188a = i7;
        if (this.f31191d) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f31189b, 1073741824);
        } else {
            int iA = a(getCurrentItem());
            Integer numValueOf = Integer.valueOf(iA);
            if (iA <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                i10 = View.MeasureSpec.makeMeasureSpec(numValueOf.intValue(), 1073741824);
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(@Nullable a adapter) {
        if (adapter != null && !(adapter instanceof AutoHeightPager)) {
            throw new IllegalArgumentException("PagerAdapter must implement AutoHeightPager.");
        }
        super.setAdapter(adapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoHeightViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        addOnPageChangeListener(new b(this));
    }
}
