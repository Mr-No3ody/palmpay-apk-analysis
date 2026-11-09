package D5;

import com.BV.LinearGradient.LinearGradientManager;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.chuanyi.ad.AdBannerManager;
import com.chuanyi.ad.MarqueeViewManager;
import com.chuanyi.ad.RNLibAdPlatformModule;
import com.chuanyi.ad.SingleAdViewManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kevinresol.react_native_default_preference.RNDefaultPreferenceModule;
import com.masteratul.exceptionhandler.ReactNativeExceptionHandlerModule;
import com.oblador.vectoricons.VectorIconsModule;
import com.palmpay.rn.scan.ReactScanManager;
import com.reactnativepagerview.PagerViewViewManager;
import com.smallnew.smartassets.RNSmartassetsModule;
import com.transsnet.palmpay.ui.view.CustomReactTextViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import org.reactnative.maskedview.RNCMaskedViewManager;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ReactPackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1593a;

    @Override // com.facebook.react.ReactPackage
    public final List createNativeModules(ReactApplicationContext reactContext) {
        switch (this.f1593a) {
            case 0:
                return Arrays.asList(new RNDefaultPreferenceModule(reactContext));
            case 1:
                return Arrays.asList(new ReactNativeExceptionHandlerModule(reactContext));
            case 2:
                return Collections.EMPTY_LIST;
            case 3:
                return Arrays.asList(new RNLibAdPlatformModule(reactContext));
            case 4:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new VectorIconsModule(reactContext));
                return arrayList;
            case 5:
                return Arrays.asList(new RNSmartassetsModule(reactContext));
            case 6:
                return Collections.EMPTY_LIST;
            case 7:
                return Collections.EMPTY_LIST;
            case 8:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return z.f38935a;
            case 9:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return z.f38935a;
            default:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return z.f38935a;
        }
    }

    @Override // com.facebook.react.ReactPackage
    public final List createViewManagers(ReactApplicationContext reactContext) {
        switch (this.f1593a) {
            case 0:
                return Collections.EMPTY_LIST;
            case 1:
                return Collections.EMPTY_LIST;
            case 2:
                return Arrays.asList(new RNCMaskedViewManager());
            case 3:
                return Arrays.asList(new AdBannerManager(), new MarqueeViewManager(), new SingleAdViewManager());
            case 4:
                return Collections.EMPTY_LIST;
            case 5:
                return Collections.EMPTY_LIST;
            case 6:
                return Collections.singletonList(new LinearGradientManager());
            case 7:
                return Collections.singletonList(new ReactScanManager(reactContext));
            case 8:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return C1849p.c(new LottieAnimationViewManager());
            case 9:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return C1849p.c(new CustomReactTextViewManager());
            default:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return C1849p.c(new PagerViewViewManager());
        }
    }
}
