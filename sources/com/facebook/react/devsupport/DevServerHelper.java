package com.facebook.react.devsupport;

import N8.q0;
import Pg.AbstractC0555b;
import Pg.C0557d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.NotificationOnlyHandler;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.util.RNLog;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.L;
import okhttp3.S;
import okhttp3.U;
import okhttp3.X;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u0000 ^2\u00020\u0001:\u0003_`^B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0012J=\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010#J\u0017\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010#J\u001f\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u0010+\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u00106J=\u0010<\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u00108\u001a\u0002072\b\b\u0002\u00104\u001a\u00020\n2\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0014\u0010X\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010SR\u0014\u0010[\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010Z¨\u0006a"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper;", "", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "settings", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "packagerConnectionSettings", "<init>", "(Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;Landroid/content/Context;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;)V", "", "clientId", "Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "commandListener", "", "openPackagerConnection", "(Ljava/lang/String;Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;)V", "closePackagerConnection", "()V", "openInspectorConnection", "disableDebugger", "closeInspectorConnection", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "callback", "Ljava/io/File;", "outputFile", "bundleURL", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "bundleInfo", "Lokhttp3/X;", "requestBuilder", "downloadBundleFromURL", "(Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lokhttp3/X;)V", "jsModulePath", "getDevServerBundleURL", "(Ljava/lang/String;)Ljava/lang/String;", "getDevServerSplitBundleURL", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "isPackagerRunning", "(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V", "mainModuleName", "getSourceMapUrl", "getSourceUrl", "resourcePath", "downloadBundleResourceFromUrlSync", "(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "Lcom/facebook/react/bridge/ReactContext;", "context", "errorMessage", "openDebugger", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;)V", "mainModuleID", "host", "createSplitBundleURL", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/facebook/react/devsupport/DevServerHelper$BundleType;", "type", "", "modulesOnly", "runModule", "createBundleURL", "(Ljava/lang/String;Lcom/facebook/react/devsupport/DevServerHelper$BundleType;Ljava/lang/String;ZZ)Ljava/lang/String;", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "Landroid/content/Context;", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "Lokhttp3/U;", "client", "Lokhttp3/U;", "Lcom/facebook/react/devsupport/BundleDownloader;", "bundleDownloader", "Lcom/facebook/react/devsupport/BundleDownloader;", "Lcom/facebook/react/devsupport/PackagerStatusCheck;", "packagerStatusCheck", "Lcom/facebook/react/devsupport/PackagerStatusCheck;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Ljava/lang/String;", "Lcom/facebook/react/packagerconnection/JSPackagerClient;", "packagerClient", "Lcom/facebook/react/packagerconnection/JSPackagerClient;", "Lcom/facebook/react/devsupport/IInspectorPackagerConnection;", "inspectorPackagerConnection", "Lcom/facebook/react/devsupport/IInspectorPackagerConnection;", "getWebsocketProxyURL", "()Ljava/lang/String;", "websocketProxyURL", "getInspectorDeviceId", "inspectorDeviceId", "getInspectorDeviceUrl", "inspectorDeviceUrl", "getDevMode", "()Z", "devMode", "getJSMinifyMode", "jSMinifyMode", "Companion", "PackagerCommandListener", "BundleType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public class DevServerHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEBUGGER_MSG_DISABLE = "{ \"id\":1,\"method\":\"Debugger.disable\" }";
    private static final int HTTP_CONNECT_TIMEOUT_MS = 5000;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final BundleDownloader bundleDownloader;

    @NotNull
    private final U client;

    @Nullable
    private IInspectorPackagerConnection inspectorPackagerConnection;

    @NotNull
    private final String packageName;

    @Nullable
    private JSPackagerClient packagerClient;

    @NotNull
    private final PackagerConnectionSettings packagerConnectionSettings;

    @NotNull
    private final PackagerStatusCheck packagerStatusCheck;

    @NotNull
    private final DeveloperSettings settings;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$BundleType;", "", "typeID", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeID", "()Ljava/lang/String;", "BUNDLE", "MAP", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum BundleType {
        BUNDLE("bundle"),
        MAP("map");

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.n(values());

        @NotNull
        private final String typeID;

        BundleType(String str) {
            this.typeID = str;
        }

        @NotNull
        public static EnumEntries<BundleType> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getTypeID() {
            return this.typeID;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$Companion;", "", "<init>", "()V", "HTTP_CONNECT_TIMEOUT_MS", "", "DEBUGGER_MSG_DISABLE", "", "getSHA256", "string", "createResourceURL", "host", "resourcePathParam", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createResourceURL(String host, String resourcePathParam) {
            if (y.m(resourcePathParam, "/", false)) {
                p229p2.a.v("ReactNative", "Resource path should not begin with `/`, removing it.");
                resourcePathParam = resourcePathParam.substring(1);
                Intrinsics.checkNotNullExpressionValue(resourcePathParam, "substring(...)");
            }
            return com.airbnb.lottie.model.layer.d.o(new Object[]{host, resourcePathParam}, 2, Locale.US, "http://%s/%s", "format(...)");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getSHA256(String string) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.reset();
                try {
                    Charset charsetForName = Charset.forName(Constants.ENCODING);
                    Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                    byte[] bytes = string.getBytes(charsetForName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    byte[] bArrDigest = messageDigest.digest(bytes);
                    return com.airbnb.lottie.model.layer.d.n(new Object[]{Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19])}, 20, "%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", "format(...)");
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError("This environment doesn't support UTF-8 encoding", e10);
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new AssertionError("Could not get standard SHA-256 algorithm", e11);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "", "onPackagerConnected", "", "onPackagerDisconnected", "onPackagerReloadCommand", "onPackagerDevMenuCommand", "customCommandHandlers", "", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PackagerCommandListener {
        @Nullable
        Map<String, RequestHandler> customCommandHandlers();

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();
    }

    public DevServerHelper(@NotNull DeveloperSettings settings, @NotNull Context applicationContext, @NotNull PackagerConnectionSettings packagerConnectionSettings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(packagerConnectionSettings, "packagerConnectionSettings");
        this.settings = settings;
        this.applicationContext = applicationContext;
        this.packagerConnectionSettings = packagerConnectionSettings;
        S s3 = new S();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        s3.b(5000L, timeUnit);
        s3.e(0L, timeUnit);
        s3.f(0L, timeUnit);
        U u6 = new U(s3);
        this.client = u6;
        this.bundleDownloader = new BundleDownloader(u6);
        this.packagerStatusCheck = new PackagerStatusCheck(u6);
        String packageName = applicationContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.packageName = packageName;
    }

    private final String createBundleURL(String mainModuleID, BundleType type, String host, boolean modulesOnly, boolean runModule) {
        boolean devMode = getDevMode();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.packagerConnectionSettings.getAdditionalOptionsForPackager().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() != 0) {
                sb2.append("&" + key + "=" + Uri.encode(value));
            }
        }
        return com.airbnb.lottie.model.layer.d.o(new Object[]{host, mainModuleID, type.getTypeID(), Boolean.valueOf(devMode), Boolean.valueOf(devMode), Boolean.valueOf(getJSMinifyMode()), this.packageName, modulesOnly ? "true" : "false", runModule ? "true" : "false"}, 9, Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", "format(...)") + (InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "") + ((Object) sb2);
    }

    public static /* synthetic */ String createBundleURL$default(DevServerHelper devServerHelper, String str, BundleType bundleType, String str2, boolean z3, boolean z8, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBundleURL");
        }
        if ((i7 & 4) != 0) {
            str2 = devServerHelper.packagerConnectionSettings.getDebugServerHost();
        }
        String str3 = str2;
        if ((i7 & 8) != 0) {
            z3 = false;
        }
        boolean z10 = z3;
        if ((i7 & 16) != 0) {
            z8 = true;
        }
        return devServerHelper.createBundleURL(str, bundleType, str3, z10, z8);
    }

    private final String createSplitBundleURL(String mainModuleID, String host) {
        return createBundleURL(mainModuleID, BundleType.BUNDLE, host, true, false);
    }

    public static /* synthetic */ void downloadBundleFromURL$default(DevServerHelper devServerHelper, DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo, X x3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadBundleFromURL");
        }
        if ((i7 & 16) != 0) {
            x3 = new X();
        }
        devServerHelper.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, x3);
    }

    private final boolean getDevMode() {
        return this.settings.isJSDevModeEnabled();
    }

    private final String getInspectorDeviceId() {
        return Companion.getSHA256(com.airbnb.lottie.model.layer.d.o(new Object[]{this.packageName, Settings.Secure.getString(this.applicationContext.getContentResolver(), "android_id"), InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"}, 3, Locale.US, "android-%s-%s-%s", "format(...)"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInspectorDeviceUrl() {
        return com.airbnb.lottie.model.layer.d.o(new Object[]{this.packagerConnectionSettings.getDebugServerHost(), Uri.encode(AndroidInfoHelpers.getFriendlyDeviceName()), Uri.encode(this.packageName), Uri.encode(getInspectorDeviceId()), Boolean.valueOf(InspectorFlags.getIsProfilingBuild())}, 5, Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s&profiling=%b", "format(...)");
    }

    private final boolean getJSMinifyMode() {
        return this.settings.isJSMinifyEnabled();
    }

    public final void closeInspectorConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.closeInspectorConnection.1
            @Override // android.os.AsyncTask
            @Deprecated(message = "This class needs to be rewritten to don't use AsyncTasks")
            public Void doInBackground(Void... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                IInspectorPackagerConnection iInspectorPackagerConnection = DevServerHelper.this.inspectorPackagerConnection;
                if (iInspectorPackagerConnection != null) {
                    iInspectorPackagerConnection.closeQuietly();
                }
                DevServerHelper.this.inspectorPackagerConnection = null;
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void closePackagerConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.closePackagerConnection.1
            @Override // android.os.AsyncTask
            @Deprecated(message = "This class needs to be rewritten to don't use AsyncTasks")
            public Void doInBackground(Void... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                JSPackagerClient jSPackagerClient = DevServerHelper.this.packagerClient;
                if (jSPackagerClient != null) {
                    jSPackagerClient.close();
                }
                DevServerHelper.this.packagerClient = null;
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void disableDebugger() {
        IInspectorPackagerConnection iInspectorPackagerConnection = this.inspectorPackagerConnection;
        if (iInspectorPackagerConnection != null) {
            iInspectorPackagerConnection.sendEventToAllConnections(DEBUGGER_MSG_DISABLE);
        }
    }

    @JvmOverloads
    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, @Nullable String str, @Nullable BundleDownloader.BundleInfo bundleInfo) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        downloadBundleFromURL$default(this, callback, outputFile, str, bundleInfo, null, 16, null);
    }

    @Nullable
    public final File downloadBundleResourceFromUrlSync(@NotNull String resourcePath, @NotNull File outputFile) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(resourcePath, "resourcePath");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        String strCreateResourceURL = Companion.createResourceURL(this.packagerConnectionSettings.getDebugServerHost(), resourcePath);
        X x3 = new X();
        x3.k(strCreateResourceURL);
        try {
            e0 e0VarExecute = FirebasePerfOkHttpClient.execute(this.client.newCall(x3.b()));
            try {
                if (!e0VarExecute.isSuccessful() || (h0Var = e0VarExecute.f40734g) == null) {
                    e0VarExecute.close();
                    return null;
                }
                Intrinsics.checkNotNullParameter(outputFile, "file");
                C0557d c0557dJ = AbstractC0555b.j(outputFile);
                try {
                    BufferedSource source = h0Var.source();
                    Intrinsics.e(source);
                    Intrinsics.checkNotNullParameter(source, "source");
                    AbstractC0555b.c(source).readAll(c0557dJ);
                    c0557dJ.close();
                    e0VarExecute.close();
                    return outputFile;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(c0557dJ, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    org.chromium.support_lib_boundary.util.b.o(e0VarExecute, th3);
                    throw th4;
                }
            }
        } catch (Exception e10) {
            p229p2.a.j("ReactNative", "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", resourcePath, outputFile.getAbsolutePath(), e10);
            return null;
        }
        p229p2.a.j("ReactNative", "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", resourcePath, outputFile.getAbsolutePath(), e10);
        return null;
    }

    @NotNull
    public String getDevServerBundleURL(@NotNull String jsModulePath) {
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        return createBundleURL$default(this, jsModulePath, BundleType.BUNDLE, this.packagerConnectionSettings.getDebugServerHost(), false, false, 24, null);
    }

    @NotNull
    public String getDevServerSplitBundleURL(@NotNull String jsModulePath) {
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        return createSplitBundleURL(jsModulePath, this.packagerConnectionSettings.getDebugServerHost());
    }

    @NotNull
    public String getSourceMapUrl(@NotNull String mainModuleName) {
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        return createBundleURL$default(this, mainModuleName, BundleType.MAP, null, false, false, 28, null);
    }

    @NotNull
    public String getSourceUrl(@NotNull String mainModuleName) {
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        return createBundleURL$default(this, mainModuleName, BundleType.BUNDLE, null, false, false, 28, null);
    }

    @NotNull
    public final String getWebsocketProxyURL() {
        return q0.k("ws://", this.packagerConnectionSettings.getDebugServerHost(), "/debugger-proxy?role=client");
    }

    public void isPackagerRunning(@NotNull PackagerStatusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.packagerStatusCheck.run(this.packagerConnectionSettings.getDebugServerHost(), callback);
    }

    public final void openDebugger(@Nullable final ReactContext context, @Nullable final String errorMessage) {
        String strO = com.airbnb.lottie.model.layer.d.o(new Object[]{this.packagerConnectionSettings.getDebugServerHost(), Uri.encode(getInspectorDeviceId())}, 2, Locale.US, "http://%s/open-debugger?device=%s", "format(...)");
        X x3 = new X();
        x3.k(strO);
        x3.g("POST", c0.Companion.create((L) null, ""));
        FirebasePerfOkHttpClient.enqueue(this.client.newCall(x3.b()), new Callback() { // from class: com.facebook.react.devsupport.DevServerHelper.openDebugger.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e10) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                ReactContext reactContext = context;
                String str = errorMessage;
                if (str == null) {
                    str = "openDebugger error";
                }
                RNLog.w(reactContext, str);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, e0 response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
            }
        });
    }

    public final void openInspectorConnection() {
        if (this.inspectorPackagerConnection != null) {
            p229p2.a.v("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.openInspectorConnection.1
                @Override // android.os.AsyncTask
                @Deprecated(message = "This class needs to be rewritten to don't use AsyncTasks")
                public Void doInBackground(Void... params) {
                    Intrinsics.checkNotNullParameter(params, "params");
                    String str = AndroidInfoHelpers.getInspectorHostMetadata(DevServerHelper.this.applicationContext).get("deviceName");
                    if (str == null) {
                        p229p2.a.v("ReactNative", "Could not get device name from Inspector Host Metadata.");
                        return null;
                    }
                    DevServerHelper devServerHelper = DevServerHelper.this;
                    CxxInspectorPackagerConnection cxxInspectorPackagerConnection = new CxxInspectorPackagerConnection(DevServerHelper.this.getInspectorDeviceUrl(), str, DevServerHelper.this.packageName);
                    cxxInspectorPackagerConnection.connect();
                    devServerHelper.inspectorPackagerConnection = cxxInspectorPackagerConnection;
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void openPackagerConnection(@Nullable final String clientId, @NotNull final PackagerCommandListener commandListener) {
        Intrinsics.checkNotNullParameter(commandListener, "commandListener");
        if (this.packagerClient != null) {
            p229p2.a.v("ReactNative", "Packager connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.openPackagerConnection.1
                @Override // android.os.AsyncTask
                @Deprecated(message = "This needs to be rewritten to not use AsyncTasks")
                public Void doInBackground(Void... backgroundParams) {
                    Intrinsics.checkNotNullParameter(backgroundParams, "backgroundParams");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final PackagerCommandListener packagerCommandListener = commandListener;
                    linkedHashMap.put("reload", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$1
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object params) {
                            packagerCommandListener.onPackagerReloadCommand();
                        }
                    });
                    final PackagerCommandListener packagerCommandListener2 = commandListener;
                    linkedHashMap.put("devMenu", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$2
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object params) {
                            packagerCommandListener2.onPackagerDevMenuCommand();
                        }
                    });
                    Map<String, RequestHandler> mapCustomCommandHandlers = commandListener.customCommandHandlers();
                    if (mapCustomCommandHandlers != null) {
                        linkedHashMap.putAll(mapCustomCommandHandlers);
                    }
                    linkedHashMap.putAll(new FileIoHandler().handlers());
                    final PackagerCommandListener packagerCommandListener3 = commandListener;
                    ReconnectingWebSocket.ConnectionCallback connectionCallback = new ReconnectingWebSocket.ConnectionCallback() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$onPackagerConnectedCallback$1
                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onConnected() {
                            packagerCommandListener3.onPackagerConnected();
                        }

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onDisconnected() {
                            packagerCommandListener3.onPackagerDisconnected();
                        }
                    };
                    if (clientId == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    DevServerHelper devServerHelper = this;
                    JSPackagerClient jSPackagerClient = new JSPackagerClient(clientId, this.packagerConnectionSettings, linkedHashMap, connectionCallback);
                    jSPackagerClient.init();
                    devServerHelper.packagerClient = jSPackagerClient;
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @JvmOverloads
    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, @Nullable String bundleURL, @Nullable BundleDownloader.BundleInfo bundleInfo, @NotNull X requestBuilder) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        this.bundleDownloader.downloadBundleFromURL(callback, outputFile, bundleURL, bundleInfo, requestBuilder);
    }
}
