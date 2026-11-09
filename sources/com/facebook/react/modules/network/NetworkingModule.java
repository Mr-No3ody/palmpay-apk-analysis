package com.facebook.react.modules.network;

import Dg.c;
import F1.b;
import Pg.AbstractC0555b;
import Pg.m;
import Pg.q;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import okhttp3.C1952u;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.F;
import okhttp3.Interceptor;
import okhttp3.L;
import okhttp3.M;
import okhttp3.P;
import okhttp3.Q;
import okhttp3.S;
import okhttp3.U;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.h0;
import org.greenrobot.eventbus.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "Networking")
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\b\u0007\u0018\u0000 q2\u00020\u0001:\u0005rstuqB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB#\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000fB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001bH\u0000¢\u0006\u0004\b%\u0010\u001dJ\u0017\u0010(\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001fH\u0000¢\u0006\u0004\b'\u0010!J[\u00106\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u000202H\u0016¢\u0006\u0004\b6\u00107J[\u0010;\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u00109\u001a\u0002082\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u0010:\u001a\u0002082\u0006\u00105\u001a\u000202¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00122\u0006\u0010@\u001a\u00020?H\u0017¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00122\u0006\u0010F\u001a\u00020+H\u0016¢\u0006\u0004\bG\u0010>J#\u0010J\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\u00122\u0006\u00109\u001a\u0002082\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020\u0012H\u0002¢\u0006\u0004\bS\u0010\u0014J\u0017\u0010T\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bT\u0010QJ)\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010U\u001a\u00020-2\u0006\u0010V\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bX\u0010YJ%\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010Z\u001a\u0004\u0018\u00010-2\b\u0010[\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u0002080g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u001b0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00160j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001f0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010lR\u0016\u0010o\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006v"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule;", "Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "defaultUserAgent", "Lokhttp3/U;", "client", "", "Lcom/facebook/react/modules/network/NetworkInterceptorCreator;", "networkInterceptorCreators", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Lokhttp3/U;Ljava/util/List;)V", "context", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Lokhttp3/U;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V", "", "initialize", "()V", "invalidate", "Lcom/facebook/react/modules/network/NetworkingModule$UriHandler;", "handler", "addUriHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$UriHandler;)V", "addUriHandler", "Lcom/facebook/react/modules/network/NetworkingModule$RequestBodyHandler;", "addRequestBodyHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$RequestBodyHandler;)V", "addRequestBodyHandler", "Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;", "addResponseHandler$ReactAndroid_release", "(Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;)V", "addResponseHandler", "removeUriHandler$ReactAndroid_release", "removeUriHandler", "removeRequestBodyHandler$ReactAndroid_release", "removeRequestBodyHandler", "removeResponseHandler$ReactAndroid_release", "removeResponseHandler", FirebaseAnalytics.Param.METHOD, "url", "", "requestIdAsDouble", "Lcom/facebook/react/bridge/ReadableArray;", "headers", "Lcom/facebook/react/bridge/ReadableMap;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "responseType", "", "useIncrementalUpdates", "timeoutAsDouble", "withCredentials", "sendRequest", "(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ)V", "", "requestId", "timeout", "sendRequestInternal", "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZ)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/Callback;", "callback", "clearCookies", "(Lcom/facebook/react/bridge/Callback;)V", "eventName", "addListener", "(Ljava/lang/String;)V", CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "removeListeners", "Lokhttp3/c0;", "requestBody", "wrapRequestBodyWithProgressEmitter", "(Lokhttp3/c0;I)Lokhttp3/c0;", "Lokhttp3/h0;", "responseBody", "readWithProgress", "(ILokhttp3/h0;)V", "addRequest", "(I)V", "removeRequest", "cancelAllRequests", "cancelRequest", "body", "contentType", "Lokhttp3/M;", "constructMultipartBody", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;I)Lokhttp3/M;", "headersArray", "requestData", "Lokhttp3/F;", "extractHeaders", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)Lokhttp3/F;", "Lokhttp3/U;", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieHandler", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "Ljava/lang/String;", "Lcom/facebook/react/modules/network/CookieJarContainer;", "cookieJarContainer", "Lcom/facebook/react/modules/network/CookieJarContainer;", "", "requestIds", "Ljava/util/Set;", "", "requestBodyHandlers", "Ljava/util/List;", "uriHandlers", "responseHandlers", "shuttingDown", "Z", "Companion", "UriHandler", "RequestBodyHandler", "ResponseHandler", "CustomClientBuilder", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingModule.kt\ncom/facebook/react/modules/network/NetworkingModule\n+ 2 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,847:1\n578#2:848\n1#3:849\n*S KotlinDebug\n*F\n+ 1 NetworkingModule.kt\ncom/facebook/react/modules/network/NetworkingModule\n*L\n296#1:848\n*E\n"})
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;

    @NotNull
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";

    @NotNull
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;

    @NotNull
    public static final String NAME = "Networking";

    @NotNull
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";

    @NotNull
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";

    @NotNull
    private static final String REQUEST_BODY_KEY_STRING = "string";

    @NotNull
    private static final String REQUEST_BODY_KEY_URI = "uri";

    @NotNull
    private static final String TAG = "Networking";

    @NotNull
    private static final String USER_AGENT_HEADER_NAME = "user-agent";

    @Nullable
    private static com.facebook.react.modules.network.CustomClientBuilder customClientBuilder;

    @NotNull
    private final U client;

    @NotNull
    private final ForwardingCookieHandler cookieHandler;

    @Nullable
    private CookieJarContainer cookieJarContainer;

    @Nullable
    private final String defaultUserAgent;

    @NotNull
    private final List<RequestBodyHandler> requestBodyHandlers;

    @NotNull
    private final Set<Integer> requestIds;

    @NotNull
    private final List<ResponseHandler> responseHandlers;
    private boolean shuttingDown;

    @NotNull
    private final List<UriHandler> uriHandlers;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$Companion;", "", "<init>", "()V", "Lokhttp3/S;", "builder", "", "applyCustomBuilder", "(Lokhttp3/S;)V", "", "now", "last", "", "shouldDispatch", "(JJ)Z", "Lokhttp3/F;", "headers", "Lcom/facebook/react/bridge/WritableMap;", "translateHeaders", "(Lokhttp3/F;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ccb", "setCustomClientBuilder", "(Lcom/facebook/react/modules/network/CustomClientBuilder;)V", "", "NAME", "Ljava/lang/String;", "TAG", "CONTENT_ENCODING_HEADER_NAME", "CONTENT_TYPE_HEADER_NAME", "REQUEST_BODY_KEY_STRING", "REQUEST_BODY_KEY_URI", "REQUEST_BODY_KEY_FORMDATA", "REQUEST_BODY_KEY_BASE64", "USER_AGENT_HEADER_NAME", "", "CHUNK_TIMEOUT_NS", "I", "MAX_CHUNK_SIZE_BETWEEN_FLUSHES", "customClientBuilder", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomBuilder(S builder) {
            com.facebook.react.modules.network.CustomClientBuilder customClientBuilder = NetworkingModule.customClientBuilder;
            if (customClientBuilder != null) {
                customClientBuilder.apply(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldDispatch(long now, long last) {
            return last + ((long) NetworkingModule.CHUNK_TIMEOUT_NS) < now;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WritableMap translateHeaders(F headers) {
            Bundle bundle = new Bundle();
            int size = headers.size();
            for (int i7 = 0; i7 < size; i7++) {
                String strB = headers.b(i7);
                if (bundle.containsKey(strB)) {
                    bundle.putString(strB, bundle.getString(strB) + ", " + headers.f(i7));
                } else {
                    bundle.putString(strB, headers.f(i7));
                }
            }
            WritableMap writableMapFromBundle = Arguments.fromBundle(bundle);
            Intrinsics.checkNotNullExpressionValue(writableMapFromBundle, "fromBundle(...)");
            return writableMapFromBundle;
        }

        @JvmStatic
        public final void setCustomClientBuilder(@Nullable com.facebook.react.modules.network.CustomClientBuilder ccb) {
            NetworkingModule.customClientBuilder = ccb;
        }

        private Companion() {
        }
    }

    @Deprecated(message = "To be removed in a future release. See\n        https://github.com/facebook/react-native/pull/37798#pullrequestreview-1518338914")
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$CustomClientBuilder;", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CustomClientBuilder extends com.facebook.react.modules.network.CustomClientBuilder {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$RequestBodyHandler;", "", "Lcom/facebook/react/bridge/ReadableMap;", "map", "", "supports", "(Lcom/facebook/react/bridge/ReadableMap;)Z", "", "contentType", "Lokhttp3/c0;", "toRequestBody", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lokhttp3/c0;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RequestBodyHandler {
        boolean supports(@NotNull ReadableMap map);

        @Nullable
        c0 toRequestBody(@NotNull ReadableMap map, @Nullable String contentType);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;", "", "", "responseType", "", "supports", "(Ljava/lang/String;)Z", "Lokhttp3/h0;", "body", "Lcom/facebook/react/bridge/WritableMap;", "toResponseData", "(Lokhttp3/h0;)Lcom/facebook/react/bridge/WritableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResponseHandler {
        boolean supports(@NotNull String responseType);

        @NotNull
        WritableMap toResponseData(@NotNull h0 body) throws IOException;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$UriHandler;", "", "supports", "", NetworkingModule.REQUEST_BODY_KEY_URI, "Landroid/net/Uri;", "responseType", "", RemoteConfigComponent.FETCH_FILE_NAME, "Lcom/facebook/react/bridge/WritableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UriHandler {
        @NotNull
        WritableMap fetch(@NotNull Uri uri) throws IOException;

        boolean supports(@NotNull Uri uri, @NotNull String responseType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(@NotNull ReactApplicationContext reactContext, @Nullable String str, @NotNull U client, @Nullable List<? extends NetworkInterceptorCreator> list) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(client, "client");
        this.cookieHandler = new ForwardingCookieHandler();
        this.requestIds = new HashSet();
        this.requestBodyHandlers = new ArrayList();
        this.uriHandlers = new ArrayList();
        this.responseHandlers = new ArrayList();
        if (list != null) {
            S sA = client.a();
            Iterator<? extends NetworkInterceptorCreator> it = list.iterator();
            while (it.hasNext()) {
                Interceptor interceptor = it.next().create();
                Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                sA.f40618d.add(interceptor);
            }
            client = new U(sA);
        }
        this.client = client;
        CookieJar cookieJar = client.f40663o;
        this.cookieJarContainer = cookieJar instanceof CookieJarContainer ? (CookieJarContainer) cookieJar : null;
        this.defaultUserAgent = str;
    }

    private final synchronized void addRequest(int requestId) {
        this.requestIds.add(Integer.valueOf(requestId));
    }

    private final synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.requestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.requestIds.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void cancelRequest(int requestId) {
        OkHttpCallUtil.cancelTag(this.client, Integer.valueOf(requestId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.facebook.react.bridge.ReadableMap, java.lang.Throwable, okhttp3.M] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final M constructMultipartBody(ReadableArray body, String contentType, int requestId) {
        L l5;
        boolean z3;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        M m7 = new M();
        L lM135deprecated_parse = L.f40589e.m135deprecated_parse(contentType);
        ?? r10 = 0;
        if (lM135deprecated_parse == null) {
            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Invalid media type.", null);
            return null;
        }
        m7.a(lM135deprecated_parse);
        int size = body.size();
        int i7 = 0;
        while (i7 < size) {
            ReadableMap map = body.getMap(i7);
            if (map == null) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Unrecognized FormData part.", r10);
                return r10;
            }
            F fExtractHeaders = extractHeaders(map.getArray("headers"), r10);
            if (fExtractHeaders == null) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Missing or invalid header format for FormData part.", r10);
                return r10;
            }
            String strA = fExtractHeaders.a(CONTENT_TYPE_HEADER_NAME);
            if (strA != null) {
                L lM135deprecated_parse2 = L.f40589e.m135deprecated_parse(strA);
                b bVarD = fExtractHeaders.d();
                bVarD.j(CONTENT_TYPE_HEADER_NAME);
                fExtractHeaders = bVarD.h();
                l5 = lM135deprecated_parse2;
            } else {
                l5 = r10;
            }
            boolean zHasKey = map.hasKey(REQUEST_BODY_KEY_STRING);
            ArrayList arrayList = m7.f40598c;
            if (!zHasKey || map.getString(REQUEST_BODY_KEY_STRING) == null) {
                if (!map.hasKey(REQUEST_BODY_KEY_URI) || map.getString(REQUEST_BODY_KEY_URI) == null) {
                    z3 = false;
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Unrecognized FormData part.", null);
                    Unit unit = Unit.f38893a;
                } else {
                    if (l5 == 0) {
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Binary FormData part needs a content-type header.", null);
                        return null;
                    }
                    String string = map.getString(REQUEST_BODY_KEY_URI);
                    if (string == null) {
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Body must have a valid file uri", null);
                        return null;
                    }
                    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                    InputStream fileInputStream = RequestBodyUtil.getFileInputStream(reactApplicationContext, string);
                    if (fileInputStream == null) {
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Could not retrieve file for uri ".concat(string), null);
                        return null;
                    }
                    c0 body2 = RequestBodyUtil.create(l5, fileInputStream);
                    Intrinsics.checkNotNullParameter(body2, "body");
                    P part = P.f40599c.create(fExtractHeaders, body2);
                    Intrinsics.checkNotNullParameter(part, "part");
                    arrayList.add(part);
                }
                i7++;
                r10 = z3;
            } else {
                String string2 = map.getString(REQUEST_BODY_KEY_STRING);
                if (string2 == null) {
                    string2 = "";
                }
                c0 body3 = c0.Companion.create(l5, string2);
                Intrinsics.checkNotNullParameter(body3, "body");
                P part2 = P.f40599c.create(fExtractHeaders, body3);
                Intrinsics.checkNotNullParameter(part2, "part");
                arrayList.add(part2);
            }
            z3 = false;
            i7++;
            r10 = z3;
        }
        return m7;
    }

    private final F extractHeaders(ReadableArray headersArray, ReadableMap requestData) {
        String str;
        if (headersArray == null) {
            return null;
        }
        b bVar = new b(3);
        int size = headersArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ReadableArray array = headersArray.getArray(i7);
            if (array == null || array.size() != 2) {
                return null;
            }
            String string = array.getString(0);
            if (string != null) {
                string = HeaderUtil.INSTANCE.stripHeaderName(string);
            }
            String string2 = array.getString(1);
            if (string == null || string2 == null) {
                return null;
            }
            bVar.e(string, string2);
        }
        if (bVar.i(USER_AGENT_HEADER_NAME) == null && (str = this.defaultUserAgent) != null) {
            bVar.b(USER_AGENT_HEADER_NAME, str);
        }
        if (requestData == null || !requestData.hasKey(REQUEST_BODY_KEY_STRING)) {
            bVar.j(CONTENT_ENCODING_HEADER_NAME);
        }
        return bVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readWithProgress(int requestId, h0 responseBody) throws IOException {
        long j6;
        Charset charsetA;
        long jContentLength = -1;
        try {
            Intrinsics.f(responseBody, "null cannot be cast to non-null type com.facebook.react.modules.network.ProgressResponseBody");
            ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
            j6 = progressResponseBody.getTotalBytesRead();
            try {
                jContentLength = progressResponseBody.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j6 = -1;
        }
        long j10 = jContentLength;
        long j11 = j6;
        if (responseBody.contentType() == null) {
            charsetA = StandardCharsets.UTF_8;
        } else {
            L lContentType = responseBody.contentType();
            charsetA = lContentType != null ? lContentType.a(StandardCharsets.UTF_8) : null;
            if (charsetA == null) {
                throw new IllegalStateException(("Null character set for Content-Type: " + responseBody.contentType()).toString());
            }
        }
        Intrinsics.e(charsetA);
        ProgressiveStringDecoder progressiveStringDecoder = new ProgressiveStringDecoder(charsetA);
        InputStream inputStreamByteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int i7 = inputStreamByteStream.read(bArr);
                if (i7 == -1) {
                    inputStreamByteStream.close();
                    return;
                } else {
                    int i10 = requestId;
                    ResponseUtil.onIncrementalDataReceived(reactApplicationContextIfActiveOrWarn, i10, progressiveStringDecoder.decodeNext(bArr, i7), j11, j10);
                    requestId = i10;
                }
            }
        } catch (Throwable th) {
            inputStreamByteStream.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void removeRequest(int requestId) {
        this.requestIds.remove(Integer.valueOf(requestId));
    }

    @JvmStatic
    public static final void setCustomClientBuilder(@Nullable com.facebook.react.modules.network.CustomClientBuilder customClientBuilder2) {
        INSTANCE.setCustomClientBuilder(customClientBuilder2);
    }

    private final c0 wrapRequestBodyWithProgressEmitter(c0 requestBody, final int requestId) {
        if (requestBody == null) {
            return null;
        }
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.wrapRequestBodyWithProgressEmitter.1
            private long last = System.nanoTime();

            public final long getLast() {
                return this.last;
            }

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long bytesWritten, long contentLength, boolean done) {
                long jNanoTime = System.nanoTime();
                if (done || NetworkingModule.INSTANCE.shouldDispatch(jNanoTime, this.last)) {
                    ResponseUtil.onDataSend(reactApplicationContextIfActiveOrWarn, requestId, bytesWritten, contentLength);
                    this.last = jNanoTime;
                }
            }

            public final void setLast(long j6) {
                this.last = j6;
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double requestIdAsDouble) {
        int i7 = (int) requestIdAsDouble;
        cancelRequest(i7);
        removeRequest(i7);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(@Nullable String eventName) {
    }

    public final void addRequestBodyHandler$ReactAndroid_release(@NotNull RequestBodyHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.requestBodyHandlers.add(handler);
    }

    public final void addResponseHandler$ReactAndroid_release(@NotNull ResponseHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.responseHandlers.add(handler);
    }

    public final void addUriHandler$ReactAndroid_release(@NotNull UriHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.uriHandlers.add(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.cookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        CookieJarContainer cookieJarContainer = this.cookieJarContainer;
        if (cookieJarContainer != null) {
            cookieJarContainer.setCookieJar(new f(this.cookieHandler));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.shuttingDown = true;
        cancelAllRequests();
        this.cookieHandler.destroy();
        CookieJarContainer cookieJarContainer = this.cookieJarContainer;
        if (cookieJarContainer != null) {
            cookieJarContainer.removeCookieJar();
        }
        this.requestBodyHandlers.clear();
        this.responseHandlers.clear();
        this.uriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double count) {
    }

    public final void removeRequestBodyHandler$ReactAndroid_release(@NotNull RequestBodyHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.requestBodyHandlers.remove(handler);
    }

    public final void removeResponseHandler$ReactAndroid_release(@NotNull ResponseHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.responseHandlers.remove(handler);
    }

    public final void removeUriHandler$ReactAndroid_release(@NotNull UriHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.uriHandlers.remove(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(@NotNull String method, @NotNull String url, double requestIdAsDouble, @Nullable ReadableArray headers, @Nullable ReadableMap data, @NotNull String responseType, boolean useIncrementalUpdates, double timeoutAsDouble, boolean withCredentials) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        int i7 = (int) requestIdAsDouble;
        try {
            sendRequestInternal(method, url, i7, headers, data, responseType, useIncrementalUpdates, (int) timeoutAsDouble, withCredentials);
        } catch (Throwable th) {
            p229p2.a.i("Networking", "Failed to send url request: " + url, th);
            ResponseUtil.onRequestError(getReactApplicationContextIfActiveOrWarn(), i7, th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0250  */
    public final void sendRequestInternal(@NotNull String method, @Nullable String url, final int requestId, @Nullable ReadableArray headers, @Nullable ReadableMap data, @NotNull final String responseType, final boolean useIncrementalUpdates, int timeout, boolean withCredentials) {
        RequestBodyHandler next;
        c0 emptyBody;
        Charset charsetA;
        String str = url;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri uri = Uri.parse(str);
            for (UriHandler uriHandler : this.uriHandlers) {
                Intrinsics.e(uri);
                if (uriHandler.supports(uri, responseType)) {
                    WritableMap writableMapFetch = uriHandler.fetch(uri);
                    ResponseUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, requestId, 200, Arguments.createMap(), str);
                    ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, writableMapFetch);
                    ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId);
                    return;
                }
            }
            try {
                X x3 = new X();
                if (str == null) {
                    str = "";
                }
                x3.k(str);
                if (requestId != 0) {
                    x3.j(Object.class, Integer.valueOf(requestId));
                }
                S sA = this.client.a();
                INSTANCE.applyCustomBuilder(sA);
                if (!withCredentials) {
                    C1952u cookieJar = CookieJar.f40559o0;
                    Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
                    sA.f40624j = cookieJar;
                }
                if (useIncrementalUpdates) {
                    Interceptor interceptor = new Interceptor() { // from class: com.facebook.react.modules.network.NetworkingModule$sendRequestInternal$$inlined$-addNetworkInterceptor$1
                        @Override // okhttp3.Interceptor
                        @NotNull
                        public final e0 intercept(@NotNull Interceptor.Chain chain) throws IOException {
                            Intrinsics.checkNotNullParameter(chain, "chain");
                            e0 e0VarProceed = chain.proceed(chain.request());
                            h0 h0Var = e0VarProceed.f40734g;
                            if (h0Var == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            final String str2 = responseType;
                            final ReactApplicationContext reactApplicationContext = reactApplicationContextIfActiveOrWarn;
                            final int i7 = requestId;
                            ProgressResponseBody progressResponseBody = new ProgressResponseBody(h0Var, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule$sendRequestInternal$1$responseBody$1
                                private long last = System.nanoTime();

                                public final long getLast() {
                                    return this.last;
                                }

                                @Override // com.facebook.react.modules.network.ProgressListener
                                public void onProgress(long bytesWritten, long contentLength, boolean done) {
                                    long jNanoTime = System.nanoTime();
                                    if ((done || NetworkingModule.INSTANCE.shouldDispatch(jNanoTime, this.last)) && !Intrinsics.c(str2, ReactTextInputShadowNode.PROP_TEXT)) {
                                        ResponseUtil.onDataReceivedProgress(reactApplicationContext, i7, bytesWritten, contentLength);
                                        this.last = jNanoTime;
                                    }
                                }

                                public final void setLast(long j6) {
                                    this.last = j6;
                                }
                            });
                            d0 d0VarC = e0VarProceed.c();
                            d0VarC.f40721g = progressResponseBody;
                            return d0VarC.a();
                        }
                    };
                    Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                    sA.f40618d.add(interceptor);
                }
                if (timeout != this.client.f40652Z) {
                    TimeUnit unit = TimeUnit.MILLISECONDS;
                    Intrinsics.checkNotNullParameter(unit, "unit");
                    sA.f40637x = c.b("timeout", timeout, unit);
                }
                U u6 = new U(sA);
                F fExtractHeaders = extractHeaders(headers, data);
                if (fExtractHeaders == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Unrecognized headers format", null);
                    return;
                }
                String strA = fExtractHeaders.a(CONTENT_TYPE_HEADER_NAME);
                String strA2 = fExtractHeaders.a(CONTENT_ENCODING_HEADER_NAME);
                x3.f(fExtractHeaders);
                if (data == null) {
                    next = null;
                    break;
                }
                Iterator<RequestBodyHandler> it = this.requestBodyHandlers.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.supports(data));
                if (data != null) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = method.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.c(lowerCase, "get")) {
                        emptyBody = RequestBodyUtil.getEmptyBody(method);
                    } else {
                        String lowerCase2 = method.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (Intrinsics.c(lowerCase2, "head")) {
                            emptyBody = RequestBodyUtil.getEmptyBody(method);
                        } else if (next != null) {
                            emptyBody = next.toRequestBody(data, strA);
                        } else if (data.hasKey(REQUEST_BODY_KEY_STRING)) {
                            if (strA == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string = data.getString(REQUEST_BODY_KEY_STRING);
                            L lM135deprecated_parse = L.f40589e.m135deprecated_parse(strA);
                            if (RequestBodyUtil.isGzipEncoding(strA2)) {
                                emptyBody = (lM135deprecated_parse == null || string == null) ? null : RequestBodyUtil.createGzip(lM135deprecated_parse, string);
                                if (emptyBody == null) {
                                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Failed to gzip request body", null);
                                    return;
                                }
                            } else {
                                if (lM135deprecated_parse == null) {
                                    charsetA = StandardCharsets.UTF_8;
                                } else {
                                    charsetA = lM135deprecated_parse.a(StandardCharsets.UTF_8);
                                    if (charsetA == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                if (string == null) {
                                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Received request but body was empty", null);
                                    return;
                                }
                                b0 b0Var = c0.Companion;
                                Intrinsics.e(charsetA);
                                byte[] bytes = string.getBytes(charsetA);
                                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                                emptyBody = b0.create$default(b0Var, lM135deprecated_parse, bytes, 0, 0, 12, (Object) null);
                            }
                        } else if (data.hasKey("base64")) {
                            if (strA == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string2 = data.getString("base64");
                            if (string2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            L lM135deprecated_parse2 = L.f40589e.m135deprecated_parse(strA);
                            if (lM135deprecated_parse2 == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Invalid content type specified: ".concat(strA), null);
                                return;
                            }
                            m mVarM1deprecated_decodeBase64 = m.f7359d.m1deprecated_decodeBase64(string2);
                            if (mVarM1deprecated_decodeBase64 == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Request body base64 string was invalid", null);
                                return;
                            }
                            emptyBody = c0.Companion.create(lM135deprecated_parse2, mVarM1deprecated_decodeBase64);
                        } else if (data.hasKey(REQUEST_BODY_KEY_URI)) {
                            if (strA == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string3 = data.getString(REQUEST_BODY_KEY_URI);
                            if (string3 == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Request body URI field was set but null", null);
                                return;
                            }
                            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                            InputStream fileInputStream = RequestBodyUtil.getFileInputStream(reactApplicationContext, string3);
                            if (fileInputStream == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Could not retrieve file for uri ".concat(string3), null);
                                return;
                            }
                            emptyBody = RequestBodyUtil.create(L.f40589e.m135deprecated_parse(strA), fileInputStream);
                        } else if (data.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                            if (strA == null) {
                                strA = "multipart/form-data";
                            }
                            ReadableArray array = data.getArray(REQUEST_BODY_KEY_FORMDATA);
                            if (array == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Received request but form data was empty", null);
                                return;
                            }
                            M mConstructMultipartBody = constructMultipartBody(array, strA, requestId);
                            if (mConstructMultipartBody == null) {
                                return;
                            }
                            ArrayList arrayList = mConstructMultipartBody.f40598c;
                            if (arrayList.isEmpty()) {
                                throw new IllegalStateException("Multipart body must have at least one part.");
                            }
                            emptyBody = new Q(mConstructMultipartBody.f40596a, mConstructMultipartBody.f40597b, c.y(arrayList));
                        } else {
                            emptyBody = RequestBodyUtil.getEmptyBody(method);
                        }
                    }
                } else {
                    emptyBody = RequestBodyUtil.getEmptyBody(method);
                }
                x3.g(method, wrapRequestBodyWithProgressEmitter(emptyBody, requestId));
                addRequest(requestId);
                FirebasePerfOkHttpClient.enqueue(u6.newCall(x3.b()), new okhttp3.Callback() { // from class: com.facebook.react.modules.network.NetworkingModule.sendRequestInternal.2
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException e10) {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(e10, "e");
                        if (NetworkingModule.this.shuttingDown) {
                            return;
                        }
                        NetworkingModule.this.removeRequest(requestId);
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "Error while executing request: ".concat(e10.getClass().getSimpleName());
                        }
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, message, e10);
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, e0 response) throws IOException {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(response, "response");
                        if (NetworkingModule.this.shuttingDown) {
                            return;
                        }
                        NetworkingModule.this.removeRequest(requestId);
                        ReactApplicationContext reactApplicationContext2 = reactApplicationContextIfActiveOrWarn;
                        int i7 = requestId;
                        int i10 = response.f40731d;
                        WritableMap writableMapTranslateHeaders = NetworkingModule.INSTANCE.translateHeaders(response.f40733f);
                        Y y8 = response.f40728a;
                        ResponseUtil.onResponseReceived(reactApplicationContext2, i7, i10, writableMapTranslateHeaders, y8.f40685a.f40587i);
                        try {
                            h0 h0VarCreate = response.f40734g;
                            if (h0VarCreate == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, "Response body is null", null);
                                return;
                            }
                            if ("gzip".equalsIgnoreCase(response.b("Content-Encoding", null))) {
                                q source = new q(h0VarCreate.source());
                                String strB = response.b(HttpHeaders.CONTENT_TYPE, null);
                                L lM135deprecated_parse3 = strB != null ? L.f40589e.m135deprecated_parse(strB) : null;
                                g0 g0Var = h0.Companion;
                                Intrinsics.checkNotNullParameter(source, "source");
                                h0VarCreate = g0Var.create(lM135deprecated_parse3, -1L, AbstractC0555b.c(source));
                            }
                            if (h0VarCreate == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            for (ResponseHandler responseHandler : NetworkingModule.this.responseHandlers) {
                                if (responseHandler.supports(responseType)) {
                                    ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, responseHandler.toResponseData(h0VarCreate));
                                    ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId);
                                    return;
                                }
                            }
                            if (useIncrementalUpdates && Intrinsics.c(responseType, ReactTextInputShadowNode.PROP_TEXT)) {
                                NetworkingModule.this.readWithProgress(requestId, h0VarCreate);
                                ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId);
                                return;
                            }
                            String strString = "";
                            if (Intrinsics.c(responseType, ReactTextInputShadowNode.PROP_TEXT)) {
                                try {
                                    strString = h0VarCreate.string();
                                } catch (IOException e10) {
                                    if (!y.h(y8.f40686b, "HEAD", true)) {
                                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, e10.getMessage(), e10);
                                    }
                                }
                            } else if (Intrinsics.c(responseType, "base64")) {
                                strString = Base64.encodeToString(h0VarCreate.bytes(), 2);
                            }
                            ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, strString);
                            ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId);
                        } catch (IOException e11) {
                            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, e11.getMessage(), e11);
                        }
                    }
                });
            } catch (Exception e10) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, e10.getMessage(), null);
            }
        } catch (IOException e11) {
            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, e11.getMessage(), e11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(@NotNull ReactApplicationContext context, @Nullable String str, @NotNull U client) {
        this(context, str, client, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(@NotNull ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(context, null, OkHttpClientProvider.createClient(applicationContext), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(@NotNull ReactApplicationContext context, @Nullable List<? extends NetworkInterceptorCreator> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(context, null, OkHttpClientProvider.createClient(applicationContext), list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingModule(@NotNull ReactApplicationContext context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(context, str, OkHttpClientProvider.createClient(applicationContext), null);
    }
}
