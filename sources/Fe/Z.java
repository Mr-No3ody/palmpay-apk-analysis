package Fe;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.webkit.WebViewCompat$WebViewStartUpCallback;
import androidx.webkit.WebViewStartUpResult;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.splash.SplashAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.WebViewInitTask;
import com.transsnet.palmpay.util.ImageUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Z implements ObservableOnSubscribe, Function, WebViewCompat$WebViewStartUpCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2757b;

    public /* synthetic */ Z(String str, int i7) {
        this.f2756a = i7;
        this.f2757b = str;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        switch (this.f2756a) {
            case 1:
                return AdManager.lambda$preloadSingleAd$6(this.f2757b, (Boolean) obj);
            default:
                return SplashAdView.lambda$downloadSplashImg$11(this.f2757b, (Boolean) obj);
        }
    }

    @Override // androidx.webkit.WebViewCompat$WebViewStartUpCallback
    public void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        WebViewInitTask.prewarmWebViewPlanA$lambda$2(this.f2757b, webViewStartUpResult);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) throws Exception {
        Bitmap bitmap;
        String str = this.f2757b;
        switch (this.f2756a) {
            case 0:
                String avatar = BaseApplication.getInstance().getUser().getAvatar();
                int dimensionPixelOffset = BaseApplication.getContext().getResources().getDimensionPixelOffset(com.transsnet.palmpay.custom_view.q.dp175);
                int dimensionPixelOffset2 = BaseApplication.getContext().getResources().getDimensionPixelOffset(com.transsnet.palmpay.custom_view.q.dp45);
                if (TextUtils.isEmpty(avatar)) {
                    bitmap = null;
                } else {
                    try {
                        bitmap = (Bitmap) com.bumptech.glide.b.e(BaseApplication.getContext()).b().load(avatar).a((G1.d) new G1.d().d()).f0(dimensionPixelOffset2, dimensionPixelOffset2).get();
                    } catch (Exception e10) {
                        F6.d.c("b0", "generateQrcodeImg subscribe: ", e10);
                        bitmap = null;
                    }
                }
                if (bitmap == null) {
                    bitmap = ImageUtils.getBitmap(com.transsnet.palmpay.custom_view.r.cv_avatar_default, dimensionPixelOffset2, dimensionPixelOffset2);
                }
                observableEmitter.onNext(J3.a.i(str, dimensionPixelOffset, dimensionPixelOffset, bitmap));
                observableEmitter.onComplete();
                break;
            default:
                SplashAdView.lambda$downloadSplashImg$9(str, observableEmitter);
                break;
        }
    }
}
