package com.facebook.react.views.text.frescosupport;

import F2.f;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118hf.a;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB8\b\u0007\u0012!\b\u0002\u0010\u0007\u001a\u001b\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0002\b\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR-\u0010\u0007\u001a\u001b\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001e¨\u0006 "}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Landroid/view/View;", "Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageShadowNode;", "LF2/f;", "Lcom/facebook/imagepipeline/request/d;", "Lkotlin/jvm/JvmSuppressWildcards;", "draweeControllerBuilder", "", "callerContext", "<init>", "(LF2/f;Ljava/lang/Object;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;", "createShadowNodeInstance", "()Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageShadowNode;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "extraData", "", "updateExtraData", "(Landroid/view/View;Ljava/lang/Object;)V", "LF2/f;", "Ljava/lang/Object;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, FrescoBasedReactTextInlineImageShadowNode> {

    @NotNull
    public static final String REACT_CLASS = "RCTTextInlineImage";

    @Nullable
    private final Object callerContext;

    @Nullable
    private final f draweeControllerBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public View createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<FrescoBasedReactTextInlineImageShadowNode> getShadowNodeClass() {
        return FrescoBasedReactTextInlineImageShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull View root, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public FrescoBasedReactTextInlineImageViewManager(@Nullable f fVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(fVar, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public FrescoBasedReactTextInlineImageShadowNode createShadowNodeInstance() {
        f fVar = this.draweeControllerBuilder;
        if (fVar == null) {
            fVar = a.f37380c.get();
        }
        return new FrescoBasedReactTextInlineImageShadowNode(fVar, this.callerContext);
    }

    public /* synthetic */ FrescoBasedReactTextInlineImageViewManager(f fVar, Object obj, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fVar, (i7 & 2) != 0 ? null : obj);
    }

    @JvmOverloads
    public FrescoBasedReactTextInlineImageViewManager(@Nullable f fVar, @Nullable Object obj) {
        this.draweeControllerBuilder = fVar;
        this.callerContext = obj;
    }
}
