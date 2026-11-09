package p041ce;

import Pd.d;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ReactYogaConfigProvider;
import com.facebook.react.uimanager.YogaNodePool;
import com.google.api.Service;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.sessions.SessionData;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import com.palmpay.lib.webview.cache.match.ResourceMatcherManager;
import com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher;
import com.palmpay.lib.webview.cache.service.base.WebCacheFileRepoDelegate;
import com.palmpay.lib.webview.cache.service.impl.FileRepo;
import com.palmpay.lib.webview.container.PPWebActivity;
import com.transsnet.adsdk.BatchAdManager;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.config.b;
import com.transsnet.palmpay.core.ui.activity.FlexiPayOneClickOpenActivity;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import com.transsnet.palmpay.teller.ui.view.ModelBillerMoreService;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t9.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18955a;

    public /* synthetic */ o(int i7) {
        this.f18955a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18955a) {
            case 0:
                int i7 = ModelAvailableCouponAndPointItem.f34329i;
                return Unit.f38893a;
            case 1:
                int i10 = ModelBillerMoreService.f34338e;
                return new j(d.qt_item_biller_service_banner, null);
            case 2:
                return Pattern.compile("[-/ ]");
            case 3:
                return DebugCorePackage.viewManagersMap_delegate$lambda$1();
            case 4:
                return UiThreadUtil.mainHandler_delegate$lambda$0();
            case 5:
                return ReactYogaConfigProvider.yogaConfig_delegate$lambda$1();
            case 6:
                return YogaNodePool.pool_delegate$lambda$0();
            case 7:
                return CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
            case 8:
                return CrashlyticsWorkers.Companion.checkNotMainThread$lambda$0();
            case 9:
                return CrashlyticsWorkers.Companion.checkBlockingThread$lambda$1();
            case 10:
                return SessionData._childSerializers$_anonymous_();
            case 11:
                return WebCacheConstant.applicationScope_delegate$lambda$0();
            case 12:
                return WebCacheConstant.ioDispatcher_delegate$lambda$1();
            case 13:
                return WebCacheConstant.mainDispatcher_delegate$lambda$2();
            case 14:
                return ResourceMatcherManager.defaultMatcherClassList_delegate$lambda$0();
            case 15:
                return ResourceMatcherManager.interceptorList_delegate$lambda$1();
            case 16:
                return ResourceMatcherManager.fallbackInterceptorList_delegate$lambda$2();
            case 17:
                return PreloadHtmlMatcher.fileRepo_delegate$lambda$0();
            case 18:
                return WebCacheFileRepoDelegate.netDelegate_delegate$lambda$0();
            case 19:
                return FileRepo.rootDirPath_delegate$lambda$0();
            case 20:
                return PPWebActivity.mUiHandler_delegate$lambda$0();
            case 21:
                return BatchAdManager.batchMap_delegate$lambda$0();
            case 22:
                return InterstitialAdView.mNoShowList_delegate$lambda$0();
            case 23:
                return InterstitialAdView.mAppNoShowList_delegate$lambda$1();
            case 24:
                return SingleAdView.mNoShowList_delegate$lambda$0();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return SingleAdView.extras_delegate$lambda$1();
            case 26:
                return BannerAdView.mAdData_delegate$lambda$0();
            case 27:
                return BannerAdView.extras_delegate$lambda$1();
            case 28:
                return b.f27370a;
            default:
                int i11 = FlexiPayOneClickOpenActivity.f27632e;
                int screenWidth = ScreenUtils.getScreenWidth();
                int screenHeight = ScreenUtils.getScreenHeight();
                if (screenWidth <= 0 || screenHeight <= 0) {
                    return null;
                }
                return screenWidth + "x" + screenHeight;
        }
    }
}
