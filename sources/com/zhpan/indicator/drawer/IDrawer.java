package com.zhpan.indicator.drawer;

import Ue.b;
import android.graphics.Canvas;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00060\u000eR\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/zhpan/indicator/drawer/IDrawer;", "", "", "changed", "", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "LUe/b;", "LUe/c;", "onMeasure", "(II)LUe/b;", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public interface IDrawer {
    void onDraw(@NotNull Canvas canvas);

    void onLayout(boolean changed, int left, int top2, int right, int bottom);

    @NotNull
    b onMeasure(int widthMeasureSpec, int heightMeasureSpec);
}
