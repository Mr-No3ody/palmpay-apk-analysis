package com.zhpan.indicator.base;

import Ve.a;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/zhpan/indicator/base/IIndicator;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "", "notifyDataChanged", "()V", "LVe/a;", "options", "setIndicatorOptions", "(LVe/a;)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public interface IIndicator extends ViewPager.OnPageChangeListener {
    void notifyDataChanged();

    void setIndicatorOptions(@NotNull a options);
}
