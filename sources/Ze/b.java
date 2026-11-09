package Ze;

import M7.C0450j;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;
import com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.reactnativecommunity.webview.RNCWebViewModule;
import com.rnmaps.maps.J;
import fr.greweb.reactnativeviewshot.NativeRNViewShotSpec;
import fr.greweb.reactnativeviewshot.RNViewShotModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends TurboReactPackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11701a;

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        switch (this.f11701a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new RNViewShotModule(reactApplicationContext));
                return arrayList;
            default:
                return super.createNativeModules(reactApplicationContext);
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.f11701a) {
            case 1:
                return Collections.EMPTY_LIST;
            case 2:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new RNCWebViewManager());
                return arrayList;
            default:
                return super.createViewManagers(reactApplicationContext);
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        switch (this.f11701a) {
            case 0:
                if (str.equals(NativeRNViewShotSpec.NAME)) {
                    return new RNViewShotModule(reactApplicationContext);
                }
                return null;
            case 1:
                str.getClass();
                if (str.equals("RNCAsyncStorage")) {
                    return new AsyncStorageModule(reactApplicationContext);
                }
                return null;
            default:
                if (str.equals(NativeRNCWebViewModuleSpec.NAME)) {
                    return new RNCWebViewModule(reactApplicationContext);
                }
                return null;
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        switch (this.f11701a) {
            case 0:
                return new C0450j(1);
            case 1:
                try {
                    return (ReactModuleInfoProvider) Class.forName("com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider").newInstance();
                } catch (ClassNotFoundException unused) {
                    return new J(1);
                } catch (IllegalAccessException e10) {
                    e = e10;
                    throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
                } catch (InstantiationException e11) {
                    e = e11;
                    throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
                }
            default:
                return new C0450j(3);
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    public List getViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.f11701a) {
            case 1:
                return null;
            default:
                return super.getViewManagers(reactApplicationContext);
        }
    }
}
