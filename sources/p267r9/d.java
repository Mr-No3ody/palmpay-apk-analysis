package p267r9;

import C0.G;
import Ca.a;
import Ca.f;
import Pa.AbstractC0520q;
import android.text.TextUtils;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.PackageList;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.codepush.react.CodePush;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.base.ShellApplication;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends DefaultReactNativeHost {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41652b;

    public d(ShellApplication shellApplication) {
        super(shellApplication);
        this.f41651a = true;
        this.f41652b = true;
    }

    @Override // com.facebook.react.ReactNativeHost
    public final String getBundleAssetName() {
        return CodePushConstants.DEFAULT_JS_BUNDLE_NAME;
    }

    @Override // com.facebook.react.ReactNativeHost
    public final String getJSBundleFile() {
        String jSBundleFile = CodePush.getJSBundleFile();
        F6.d.h("ReactNative", 3, G.o("getBizJSBundle ", jSBundleFile));
        return TextUtils.isEmpty(jSBundleFile) ? "assets://index.android.bundle" : jSBundleFile;
    }

    @Override // com.facebook.react.ReactNativeHost
    public final String getJSMainModuleName() {
        return FirebaseAnalytics.Param.INDEX;
    }

    @Override // com.facebook.react.ReactNativeHost
    public final JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        try {
            BaseApplication baseApplication = BaseApplication.get();
            Intrinsics.checkNotNullExpressionValue(baseApplication, "get(...)");
            f.a(baseApplication);
            HermesExecutor.f21401a.loadLibrary();
            return new k(2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.facebook.react.ReactNativeHost
    public final List getPackages() {
        ArrayList<ReactPackage> packages = new PackageList(this).getPackages();
        Intrinsics.checkNotNullExpressionValue(packages, "getPackages(...)");
        ArrayList arrayListZ = CollectionsKt.Z(packages);
        arrayListZ.add(new a());
        if (AbstractC0520q.f7141g && "23106RN0DA".equalsIgnoreCase(AbstractC0520q.f7136b)) {
            arrayListZ.add(new D5.a(9));
        }
        return arrayListZ;
    }

    @Override // com.facebook.react.ReactNativeHost
    public final boolean getUseDeveloperSupport() {
        return false;
    }

    @Override // com.facebook.react.defaults.DefaultReactNativeHost
    public final boolean isHermesEnabled() {
        return this.f41652b;
    }

    @Override // com.facebook.react.defaults.DefaultReactNativeHost
    public final boolean isNewArchEnabled() {
        return this.f41651a;
    }
}
