package org.sufficientlysecure.htmltextview;

import U2.B;
import android.content.Context;
import com.airbnb.lottie.network.LottieFetchResult;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig$DynamicValueConfig;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.transsnet.palmpay.core.rn.bridge.DatePickerBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.PhotoUploadBridge;
import com.transsnet.palmpay.credit.rnbridge.BackToRnModuleBridge;
import defpackage.PLocationBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements JavaScriptExecutorFactory, IRouterProxy, SimpleProgressiveJpegConfig$DynamicValueConfig, LottieNetworkFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41132a;

    public /* synthetic */ k(int i7) {
        this.f41132a = i7;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41132a) {
            case 5:
                throw new B(11);
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        Intrinsics.checkNotNullParameter("", "debuggerName");
        return new HermesExecutor(HermesExecutor.f21401a.initHybridDefaultConfig(true, ""));
    }

    @Override // com.airbnb.lottie.network.LottieNetworkFetcher
    public LottieFetchResult fetchSync(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new p1.a(httpURLConnection);
    }

    @Override // com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig$DynamicValueConfig
    public int getGoodEnoughScanNumber() {
        return 0;
    }

    @Override // com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig$DynamicValueConfig
    public List getScansToDecode() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41132a) {
            case 5:
                return new PLocationBridge();
            case 6:
                return new DatePickerBridge();
            case 7:
                return new PhotoUploadBridge();
            default:
                return new BackToRnModuleBridge();
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        HermesSamplingProfiler.dumpSampledTraceToFile(filename);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        switch (this.f41132a) {
            case 2:
                return "JSIExecutor+HermesRuntime";
            default:
                return super.toString();
        }
    }
}
