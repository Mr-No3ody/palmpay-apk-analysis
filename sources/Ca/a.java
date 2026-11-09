package Ca;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public final List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        F6.d.h("ReactNative", 3, "createNativeModules");
        return C1849p.c(new PPRNBridge(reactContext));
    }

    @Override // com.facebook.react.ReactPackage
    public final List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return z.f38935a;
    }
}
