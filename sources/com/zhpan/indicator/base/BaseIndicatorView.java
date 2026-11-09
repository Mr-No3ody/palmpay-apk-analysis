package com.zhpan.indicator.base;

import Ve.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0005*\u0001Z\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u0017J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u001aJ\u0017\u0010&\u001a\u00020\f2\b\b\u0001\u0010%\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\u0007¢\u0006\u0004\b'\u0010!J\u0017\u0010(\u001a\u00020\f2\b\b\u0001\u0010%\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u0017J\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u000f¢\u0006\u0004\b+\u0010\u001aJ\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010!J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\u00002\b\b\u0001\u0010%\u001a\u00020\u00072\b\b\u0001\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00002\b\b\u0001\u00103\u001a\u00020\u000f¢\u0006\u0004\b4\u00105J!\u00104\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u00106\u001a\u00020\u000f¢\u0006\u0004\b4\u00107J\u0015\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u000f¢\u0006\u0004\b9\u00105J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010!J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0007¢\u0006\u0004\b<\u0010/J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0007¢\u0006\u0004\b>\u0010/J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000f¢\u0006\u0004\b@\u00105J\u0015\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010C\u001a\u00020\f2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bC\u0010GJ\u0015\u0010I\u001a\u00020\f2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u0007H\u0016¢\u0006\u0004\bL\u0010\u000eJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PR\"\u0010Q\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010PR\u0018\u0010V\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b]\u0010\u0017¨\u0006^"}, d2 = {"Lcom/zhpan/indicator/base/BaseIndicatorView;", "Landroid/view/View;", "Lcom/zhpan/indicator/base/IIndicator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", ViewProps.POSITION, "", "onPageSelected", "(I)V", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "notifyDataChanged", "()V", "getNormalSlideWidth", "()F", "normalSliderWidth", "setNormalSlideWidth", "(F)V", "getCheckedSlideWidth", "checkedSliderWidth", "setCheckedSlideWidth", "currentPosition", "setCurrentPosition", "getCurrentPosition", "()I", "getIndicatorGap", "indicatorGap", "setIndicatorGap", "normalColor", "setCheckedColor", "getCheckedColor", "setNormalColor", "getSlideProgress", "slideProgress", "setSlideProgress", "getPageSize", "pageSize", "setPageSize", "(I)Lcom/zhpan/indicator/base/BaseIndicatorView;", "selectedColor", "setSliderColor", "(II)Lcom/zhpan/indicator/base/BaseIndicatorView;", "sliderWidth", "setSliderWidth", "(F)Lcom/zhpan/indicator/base/BaseIndicatorView;", "selectedSliderWidth", "(FF)Lcom/zhpan/indicator/base/BaseIndicatorView;", "sliderGap", "setSliderGap", "getSlideMode", "slideMode", "setSlideMode", "indicatorStyle", "setIndicatorStyle", "sliderHeight", "setSliderHeight", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "setupWithViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "(Landroidx/viewpager2/widget/ViewPager2;)V", "", "showIndicatorWhenOneItem", "(Z)V", RemoteConfigConstants.ResponseFieldKey.STATE, "onPageScrollStateChanged", "LVe/a;", "options", "setIndicatorOptions", "(LVe/a;)V", "mIndicatorOptions", "LVe/a;", "getMIndicatorOptions", "()LVe/a;", "setMIndicatorOptions", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "mViewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "Te/a", "mOnPageChangeCallback", "LTe/a;", "getCheckedSliderWidth", "indicator_release"}, k = 1, mv = {1, 4, 0})
public class BaseIndicatorView extends View implements IIndicator {

    @NotNull
    private a mIndicatorOptions;
    private final Te.a mOnPageChangeCallback;
    private ViewPager mViewPager;
    private ViewPager2 mViewPager2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.g(context, "context");
        this.mOnPageChangeCallback = new Te.a(this);
        this.mIndicatorOptions = new a();
    }

    public final int getCheckedColor() {
        return this.mIndicatorOptions.f10334f;
    }

    public final float getCheckedSlideWidth() {
        return this.mIndicatorOptions.f10338j;
    }

    public final float getCheckedSliderWidth() {
        return this.mIndicatorOptions.f10338j;
    }

    public final int getCurrentPosition() {
        return this.mIndicatorOptions.f10339k;
    }

    public final float getIndicatorGap() {
        return this.mIndicatorOptions.f10335g;
    }

    @NotNull
    public final a getMIndicatorOptions() {
        return this.mIndicatorOptions;
    }

    public final float getNormalSlideWidth() {
        return this.mIndicatorOptions.f10337i;
    }

    public final int getPageSize() {
        return this.mIndicatorOptions.f10332d;
    }

    public final int getSlideMode() {
        return this.mIndicatorOptions.f10331c;
    }

    public final float getSlideProgress() {
        return this.mIndicatorOptions.f10340l;
    }

    public void notifyDataChanged() {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this);
            ViewPager viewPager2 = this.mViewPager;
            if (viewPager2 != null) {
                viewPager2.addOnPageChangeListener(this);
            }
            ViewPager viewPager3 = this.mViewPager;
            if (viewPager3 != null && viewPager3.getAdapter() != null) {
                ViewPager viewPager4 = this.mViewPager;
                if (viewPager4 == null) {
                    Intrinsics.l();
                }
                androidx.viewpager.widget.a adapter = viewPager4.getAdapter();
                if (adapter == null) {
                    Intrinsics.l();
                }
                Intrinsics.d(adapter, "mViewPager!!.adapter!!");
                setPageSize(adapter.c());
            }
        }
        ViewPager2 viewPager5 = this.mViewPager2;
        if (viewPager5 != null) {
            viewPager5.unregisterOnPageChangeCallback(this.mOnPageChangeCallback);
            ViewPager2 viewPager6 = this.mViewPager2;
            if (viewPager6 != null) {
                viewPager6.registerOnPageChangeCallback(this.mOnPageChangeCallback);
            }
            ViewPager2 viewPager7 = this.mViewPager2;
            if (viewPager7 != null && viewPager7.getAdapter() != null) {
                ViewPager2 viewPager8 = this.mViewPager2;
                if (viewPager8 == null) {
                    Intrinsics.l();
                }
                RecyclerView.Adapter adapter2 = viewPager8.getAdapter();
                if (adapter2 == null) {
                    Intrinsics.l();
                }
                Intrinsics.d(adapter2, "mViewPager2!!.adapter!!");
                setPageSize(adapter2.getItemCount());
            }
        }
        requestLayout();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (getSlideMode() == 0 || getPageSize() <= 1) {
            return;
        }
        int i7 = this.mIndicatorOptions.f10331c;
        if (i7 == 4 || i7 == 5 || position % getPageSize() != getPageSize() - 1) {
            setCurrentPosition(position);
            setSlideProgress(positionOffset);
        } else if (positionOffset < 0.5d) {
            setCurrentPosition(position);
            setSlideProgress(0.0f);
        } else {
            setCurrentPosition(0);
            setSlideProgress(0.0f);
        }
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        if (getSlideMode() == 0) {
            setCurrentPosition(position);
            setSlideProgress(0.0f);
            invalidate();
        }
    }

    public final void setCheckedColor(@ColorInt int normalColor) {
        this.mIndicatorOptions.f10334f = normalColor;
    }

    public final void setCheckedSlideWidth(@Px float checkedSliderWidth) {
        this.mIndicatorOptions.f10338j = checkedSliderWidth;
    }

    public final void setCurrentPosition(int currentPosition) {
        this.mIndicatorOptions.f10339k = currentPosition;
    }

    public final void setIndicatorGap(float indicatorGap) {
        this.mIndicatorOptions.f10335g = indicatorGap;
    }

    public void setIndicatorOptions(@NotNull a options) {
        Intrinsics.g(options, "options");
        this.mIndicatorOptions = options;
    }

    @NotNull
    public final BaseIndicatorView setIndicatorStyle(int indicatorStyle) {
        this.mIndicatorOptions.f10330b = indicatorStyle;
        return this;
    }

    public final void setMIndicatorOptions(@NotNull a aVar) {
        Intrinsics.g(aVar, "<set-?>");
        this.mIndicatorOptions = aVar;
    }

    public final void setNormalColor(@ColorInt int normalColor) {
        this.mIndicatorOptions.f10333e = normalColor;
    }

    public final void setNormalSlideWidth(float normalSliderWidth) {
        this.mIndicatorOptions.f10337i = normalSliderWidth;
    }

    @NotNull
    public final BaseIndicatorView setPageSize(int pageSize) {
        this.mIndicatorOptions.f10332d = pageSize;
        return this;
    }

    @NotNull
    public final BaseIndicatorView setSlideMode(int slideMode) {
        this.mIndicatorOptions.f10331c = slideMode;
        return this;
    }

    public final void setSlideProgress(float slideProgress) {
        this.mIndicatorOptions.f10340l = slideProgress;
    }

    @NotNull
    public final BaseIndicatorView setSliderColor(@ColorInt int normalColor, @ColorInt int selectedColor) {
        a aVar = this.mIndicatorOptions;
        aVar.f10333e = normalColor;
        aVar.f10334f = selectedColor;
        return this;
    }

    @NotNull
    public final BaseIndicatorView setSliderGap(float sliderGap) {
        this.mIndicatorOptions.f10335g = sliderGap;
        return this;
    }

    @NotNull
    public final BaseIndicatorView setSliderHeight(float sliderHeight) {
        this.mIndicatorOptions.f10336h = sliderHeight;
        return this;
    }

    @NotNull
    public final BaseIndicatorView setSliderWidth(@Px float sliderWidth) {
        a aVar = this.mIndicatorOptions;
        aVar.f10337i = sliderWidth;
        aVar.f10338j = sliderWidth;
        return this;
    }

    public final void setupWithViewPager(@NotNull ViewPager viewPager) {
        Intrinsics.g(viewPager, "viewPager");
        this.mViewPager = viewPager;
        notifyDataChanged();
    }

    public final void showIndicatorWhenOneItem(boolean showIndicatorWhenOneItem) {
        this.mIndicatorOptions.f10341m = showIndicatorWhenOneItem;
    }

    public final void setupWithViewPager(@NotNull ViewPager2 viewPager2) {
        Intrinsics.g(viewPager2, "viewPager2");
        this.mViewPager2 = viewPager2;
        notifyDataChanged();
    }

    @NotNull
    public final BaseIndicatorView setSliderWidth(@Px float normalSliderWidth, @Px float selectedSliderWidth) {
        a aVar = this.mIndicatorOptions;
        aVar.f10337i = normalSliderWidth;
        aVar.f10338j = selectedSliderWidth;
        return this;
    }
}
