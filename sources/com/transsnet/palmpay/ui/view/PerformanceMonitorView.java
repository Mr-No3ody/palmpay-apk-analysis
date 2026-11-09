package com.transsnet.palmpay.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.android.arouter.utils.Consts;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class PerformanceMonitorView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f35320f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f35321g = new AtomicInteger(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f35322i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f35323j = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35328e;

    public PerformanceMonitorView(@NonNull Context context) {
        super(context);
        this.f35324a = 0L;
        this.f35325b = 0L;
        this.f35327d = 0;
        this.f35328e = 0;
        a();
    }

    private String getStackTrace() {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i7 = 4; i7 < Math.min(stackTrace.length, 15); i7++) {
            StackTraceElement stackTraceElement = stackTrace[i7];
            String className = stackTraceElement.getClassName();
            if (!className.startsWith("android.") && !className.startsWith("androidx.") && !className.startsWith("java.") && !className.startsWith("com.transsnet.palmpay.ui.view.PerformanceMonitorView")) {
                sb2.append("  at ");
                sb2.append(className);
                sb2.append(Consts.DOT);
                sb2.append(stackTraceElement.getMethodName());
                sb2.append("(");
                sb2.append(stackTraceElement.getFileName());
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
                sb2.append(")\n");
            }
        }
        return sb2.toString();
    }

    public final void a() {
        this.f35326c = getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
    }

    public final void b(String str) {
        if (getParent() != null) {
            getParent().getClass();
        }
        getVisibility();
        getWidth();
        getHeight();
        getLeft();
        getTop();
        getRight();
        getBottom();
        if (getAnimation() != null && getAnimation().hasStarted() && !getAnimation().hasEnded()) {
            getAnimation().getClass();
        }
        if (getScrollX() != 0 || getScrollY() != 0) {
            getScrollX();
            getScrollY();
        }
        getChildCount();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            childAt.getClass();
            childAt.getVisibility();
            childAt.getWidth();
            childAt.getHeight();
        }
        if (!str.equals("measure")) {
            str.equals("layout");
        }
        getAnimation();
        if (getScrollX() == 0) {
            getScrollY();
        }
        getChildCount();
        getVisibility();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        System.nanoTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f35325b < 100 && this.f35328e == 0) {
            getStackTrace();
        }
        this.f35325b = jCurrentTimeMillis;
        f35321g.incrementAndGet();
        HashMap map = f35323j;
        map.put(this.f35326c, Integer.valueOf(((Integer) map.getOrDefault(this.f35326c, 0)).intValue() + 1));
        this.f35328e++;
        super.onLayout(z3, i7, i10, i11, i12);
        System.nanoTime();
        if (this.f35328e > 1000) {
            b("layout");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        System.nanoTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f35324a < 100 && this.f35327d == 0) {
            getStackTrace();
        }
        this.f35324a = jCurrentTimeMillis;
        f35320f.incrementAndGet();
        HashMap map = f35322i;
        map.put(this.f35326c, Integer.valueOf(((Integer) map.getOrDefault(this.f35326c, 0)).intValue() + 1));
        this.f35327d++;
        super.onMeasure(i7, i10);
        System.nanoTime();
        if (this.f35327d > 1000) {
            b("measure");
        }
    }

    public PerformanceMonitorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35324a = 0L;
        this.f35325b = 0L;
        this.f35327d = 0;
        this.f35328e = 0;
        a();
    }

    public PerformanceMonitorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f35324a = 0L;
        this.f35325b = 0L;
        this.f35327d = 0;
        this.f35328e = 0;
        a();
    }
}
