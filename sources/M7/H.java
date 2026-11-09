package M7;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends LayoutShadowNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f5791a;

    public H(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5791a = context;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.onBeforeLayout(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f5791a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new Dg.a(this, 27));
        }
    }
}
