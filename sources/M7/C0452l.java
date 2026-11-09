package M7;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.swmansion.rnscreens.ModalScreenViewManager;
import com.swmansion.rnscreens.ScreenContainerViewManager;
import com.swmansion.rnscreens.ScreenContentWrapperManager;
import com.swmansion.rnscreens.ScreenFooterManager;
import com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager;
import com.swmansion.rnscreens.ScreenStackHeaderSubviewManager;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import com.swmansion.rnscreens.ScreensModule;
import com.swmansion.rnscreens.SearchBarManager;
import com.swmansion.rnscreens.gamma.stack.host.StackHostViewManager;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreenViewManager;
import com.swmansion.rnscreens.gamma.tabs.TabScreenViewManager;
import com.swmansion.rnscreens.gamma.tabs.TabsHostViewManager;
import com.swmansion.rnscreens.safearea.SafeAreaViewManager;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: M7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0452l extends BaseReactPackage {
    static {
        new C0451k(null);
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final List createViewManagers(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "reactContext");
        Intrinsics.checkNotNullParameter(context, "reactContext");
        ScreenDummyLayoutHelper screenDummyLayoutHelper = new ScreenDummyLayoutHelper();
        screenDummyLayoutHelper.f25486f = p050d8.b.f35542c.getEMPTY();
        screenDummyLayoutHelper.f25487g = new WeakReference(context);
        try {
            System.loadLibrary("react_codegen_rnscreens");
        } catch (UnsatisfiedLinkError unused) {
        }
        ScreenDummyLayoutHelper.f25480p = new WeakReference(screenDummyLayoutHelper);
        screenDummyLayoutHelper.b(context);
        context.addLifecycleEventListener(screenDummyLayoutHelper);
        LifecycleEventListener lifecycleEventListener = C0443c.f5809a;
        Intrinsics.checkNotNullParameter(context, "context");
        context.addLifecycleEventListener(lifecycleEventListener);
        return C1850q.h(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager(), new TabsHostViewManager(), new TabScreenViewManager(), new SafeAreaViewManager(), new StackHostViewManager(), new StackScreenViewManager());
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final NativeModule getModule(String s3, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(s3, "s");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        if (Intrinsics.c(s3, "RNSModule")) {
            return new ScreensModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new C0450j(0);
    }
}
