package com.palmpay.lib.scanplus.view;

import E.C;
import E.C0211p;
import E.Z;
import E.b0;
import K6.b;
import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0984i0;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.h;
import androidx.camera.view.PreviewView;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.util.concurrent.ListenableFuture;
import com.palmpay.lib.scanplus.code.YuvUtils;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(21)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u000e\u001a\u00020\f2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/scanplus/view/CameraXView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function4;", "Landroidx/camera/core/ImageProxy;", "", "", "", "action", "setOnAnalyzerListener", "(Lkotlin/jvm/functions/Function4;)V", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CameraXView extends FrameLayout {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreviewView f23997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f23998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f23999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f24000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0211p f24001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f24002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f24003g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LifecycleCamera f24004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function4 f24005j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final YuvUtils f24007p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraXView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setOnAnalyzerListener(@Nullable Function4<? super ImageProxy, ? super byte[], ? super Integer, ? super Integer, Unit> action) {
        this.f24005j = action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraXView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        b0 b0VarA = new Z().build();
        Intrinsics.checkNotNullExpressionValue(b0VarA, "Builder().build()");
        this.f24000d = b0VarA;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C0984i0(1));
        C0211p c0211p = new C0211p(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(c0211p, "Builder()\n        .requi…NG_BACK)\n        .build()");
        this.f24001e = c0211p;
        ExecutorService executorServiceNewOptimizedFixedThreadPool = ShadowExecutors.newOptimizedFixedThreadPool(2, "\u200bcom.palmpay.lib.scanplus.view.CameraXView");
        Intrinsics.checkNotNullExpressionValue(executorServiceNewOptimizedFixedThreadPool, "newFixedThreadPool(2)");
        this.f24003g = executorServiceNewOptimizedFixedThreadPool;
        this.f24007p = new YuvUtils();
        PreviewView previewView = new PreviewView(context);
        this.f23997a = previewView;
        addView(previewView, new FrameLayout.LayoutParams(-1, -1));
        ListenableFuture<h> fVar = h.f14527i.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(fVar, "getInstance(context)");
        this.f23998b = fVar;
        post(new b(this, 0));
    }
}
