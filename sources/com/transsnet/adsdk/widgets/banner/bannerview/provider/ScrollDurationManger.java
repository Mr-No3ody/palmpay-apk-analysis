package com.transsnet.adsdk.widgets.banner.bannerview.provider;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p074f0.d;
import p233p8.a;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollDurationManger extends LinearLayoutManager {
    private final LinearLayoutManager mParent;
    private final int scrollDuration;

    public ScrollDurationManger(ViewPager2 viewPager2, int scrollDuration, LinearLayoutManager linearLayoutManager) {
        super(viewPager2.getContext(), linearLayoutManager.getOrientation(), false);
        this.scrollDuration = scrollDuration;
        this.mParent = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] extraLayoutSpace) {
        try {
            Method declaredMethod = this.mParent.getClass().getDeclaredMethod("calculateExtraLayoutSpace", state.getClass(), extraLayoutSpace.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.mParent, state, extraLayoutSpace);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
            BannerUtils.log(e10.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull d info) {
        this.mParent.onInitializeAccessibilityNodeInfo(recycler, state, info);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int action, @Nullable Bundle args) {
        return this.mParent.performAccessibilityAction(recycler, state, action, args);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView parent, @NonNull View child, @NonNull Rect rect, boolean immediate, boolean focusedChildVisible) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.setTargetPosition(position);
        startSmoothScroll(aVar);
    }
}
