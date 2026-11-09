package M7;

import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec;
import fr.greweb.reactnativeviewshot.NativeRNViewShotSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: M7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0450j implements ReactModuleInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5821a;

    public /* synthetic */ C0450j(int i7) {
        this.f5821a = i7;
    }

    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        switch (this.f5821a) {
            case 0:
                HashMap map = new HashMap();
                map.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, true, false, true));
                return map;
            case 1:
                HashMap map2 = new HashMap();
                map2.put(NativeRNViewShotSpec.NAME, new ReactModuleInfo(NativeRNViewShotSpec.NAME, NativeRNViewShotSpec.NAME, false, false, false, true));
                return map2;
            case 2:
                return kotlin.collections.G.c();
            default:
                HashMap map3 = new HashMap();
                map3.put(NativeRNCWebViewModuleSpec.NAME, new ReactModuleInfo(NativeRNCWebViewModuleSpec.NAME, NativeRNCWebViewModuleSpec.NAME, false, false, true, false, true));
                return map3;
        }
    }
}
