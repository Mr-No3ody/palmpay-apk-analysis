package fr.greweb.reactnativeviewshot;

import C0.G;
import Ze.a;
import Ze.e;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.utils.Consts;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.rnmaps.maps.MapModule;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class RNViewShotModule extends NativeRNViewShotSpec {
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final Executor executor;
    private final ReactApplicationContext reactContext;

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = ShadowExecutors.newOptimizedCachedThreadPool("\u200bfr.greweb.reactnativeviewshot.RNViewShotModule");
        this.reactContext = reactApplicationContext;
    }

    @NonNull
    private File createTempFile(@NonNull Context context, @NonNull String str, String str2) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        String strO = G.o(Consts.DOT, str);
        return str2 != null ? File.createTempFile(str2, strO, externalCacheDir) : File.createTempFile(TEMP_FILE_PREFIX, strO, externalCacheDir);
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void captureRef(Double d2, ReadableMap readableMap, Promise promise) {
        int i7 = -1;
        int iIntValue = d2 == null ? -1 : d2.intValue();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getResources().getDisplayMetrics();
        String string = readableMap.getString("format");
        boolean z3 = false;
        if (MapModule.SNAPSHOT_FORMAT_JPG.equals(string)) {
            i7 = 0;
        } else if ("webm".equals(string)) {
            i7 = 2;
        } else if (!"raw".equals(string)) {
            i7 = 1;
        }
        double d10 = readableMap.getDouble("quality");
        Integer numValueOf = readableMap.hasKey("width") ? Integer.valueOf(readableMap.getInt("width")) : null;
        Integer numValueOf2 = readableMap.hasKey("height") ? Integer.valueOf(readableMap.getInt("height")) : null;
        String string2 = readableMap.getString("result");
        String string3 = readableMap.hasKey("fileName") ? readableMap.getString("fileName") : null;
        Boolean boolValueOf = Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer"));
        if (readableMap.hasKey("handleGLSurfaceViewOnAndroid") && readableMap.getBoolean("handleGLSurfaceViewOnAndroid")) {
            z3 = true;
        }
        try {
            ((FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2)).addUIBlock(new e(iIntValue, string, i7, d10, numValueOf, numValueOf2, "tmpfile".equals(string2) ? createTempFile(getReactApplicationContext(), string, string3) : null, string2, boolValueOf, getCurrentActivity(), z3, promise, this.executor));
        } catch (Throwable th) {
            Log.e(NativeRNViewShotSpec.NAME, "Failed to snapshot view tag " + iIntValue, th);
            promise.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + iIntValue);
        }
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(Double.valueOf(-1.0d), readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        new a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                file.delete();
            }
        }
    }
}
