package com.facebook.react.modules.websocket;

import C0.G;
import N8.q0;
import Pg.m;
import com.adjust.sdk.Constants;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.CustomClientBuilder;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.common.net.HttpHeaders;
import com.google.net.cronet.okhttptransport.CronetNqeKey;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.S;
import okhttp3.U;
import okhttp3.WebSocket;
import okhttp3.X;
import okhttp3.e0;
import okhttp3.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "WebSocketModule")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010(J\u001d\u0010*\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b*\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u0010/R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule;", "Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "eventName", "Lcom/facebook/react/bridge/ReadableMap;", "params", "", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "", "id", "message", "notifyWebSocketFailed", "(ILjava/lang/String;)V", "uri", "getCookie", "(Ljava/lang/String;)Ljava/lang/String;", "invalidate", "()V", "Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "contentHandler", "setContentHandler", "(ILcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;)V", "url", "Lcom/facebook/react/bridge/ReadableArray;", "protocols", "options", "", "socketID", "connect", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D)V", "code", "reason", "close", "(DLjava/lang/String;D)V", "send", "(Ljava/lang/String;D)V", "base64String", "sendBinary", "LPg/m;", "byteString", "(LPg/m;I)V", "ping", "(D)V", "addListener", "(Ljava/lang/String;)V", CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "removeListeners", "", "Lokhttp3/WebSocket;", "webSocketConnections", "Ljava/util/Map;", "contentHandlers", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieHandler", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "Companion", "ContentHandler", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketModule.kt\ncom/facebook/react/modules/websocket/WebSocketModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n*L\n1#1,410:1\n1#2:411\n30#3,3:412\n30#3,3:415\n30#3,3:418\n30#3,3:421\n30#3,3:424\n30#3,3:427\n30#3,3:430\n30#3,3:433\n30#3,3:436\n*S KotlinDebug\n*F\n+ 1 WebSocketModule.kt\ncom/facebook/react/modules/websocket/WebSocketModule\n*L\n227#1:412,3\n232#1:415,3\n254#1:418,3\n259#1:421,3\n281#1:424,3\n286#1:427,3\n308#1:430,3\n313#1:433,3\n331#1:436,3\n*E\n"})
public final class WebSocketModule extends NativeWebSocketModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "WebSocketModule";

    @Nullable
    private static CustomClientBuilder customClientBuilder;

    @NotNull
    private final Map<Integer, ContentHandler> contentHandlers;

    @NotNull
    private final ForwardingCookieHandler cookieHandler;

    @NotNull
    private final Map<Integer, WebSocket> webSocketConnections;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$Companion;", "", "<init>", "()V", "Lokhttp3/S;", "builder", "", "applyCustomBuilder", "(Lokhttp3/S;)V", "", "uri", "getDefaultOrigin", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ccb", "setCustomClientBuilder", "(Lcom/facebook/react/modules/network/CustomClientBuilder;)V", "NAME", "Ljava/lang/String;", "customClientBuilder", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomBuilder(S builder) {
            CustomClientBuilder customClientBuilder = WebSocketModule.customClientBuilder;
            if (customClientBuilder != null) {
                customClientBuilder.apply(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:20:0x0035 A[Catch: URISyntaxException -> 0x0090, TryCatch #0 {URISyntaxException -> 0x0090, blocks: (B:2:0x0000, B:4:0x000b, B:14:0x0027, B:20:0x0035, B:28:0x0051, B:31:0x005a, B:33:0x0079, B:17:0x002e, B:21:0x003a, B:25:0x0046), top: B:37:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x004f  */
        public final String getDefaultOrigin(String uri) {
            String scheme;
            try {
                URI uri2 = new URI(uri);
                String scheme2 = uri2.getScheme();
                if (scheme2 != null) {
                    int iHashCode = scheme2.hashCode();
                    scheme = "http";
                    if (iHashCode != 3804) {
                        if (iHashCode != 118039) {
                            if (iHashCode != 3213448) {
                                if (iHashCode == 99617003 && scheme2.equals(Constants.SCHEME)) {
                                    scheme = uri2.getScheme();
                                } else {
                                    scheme = "";
                                }
                            } else if (scheme2.equals("http")) {
                                scheme = uri2.getScheme();
                            } else {
                                scheme = "";
                            }
                        } else if (scheme2.equals("wss")) {
                            scheme = Constants.SCHEME;
                        } else {
                            scheme = "";
                        }
                    } else if (!scheme2.equals("ws")) {
                        scheme = "";
                    }
                } else {
                    scheme = "";
                }
                if (uri2.getPort() != -1) {
                    String str = String.format("%s://%s:%s", Arrays.copyOf(new Object[]{scheme, uri2.getHost(), Integer.valueOf(uri2.getPort())}, 3));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    return str;
                }
                String str2 = String.format("%s://%s", Arrays.copyOf(new Object[]{scheme, uri2.getHost()}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return str2;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException(q0.k("Unable to set ", uri, " as default origin header"));
            }
        }

        @JvmStatic
        public final void setCustomClientBuilder(@Nullable CustomClientBuilder ccb) {
            WebSocketModule.customClientBuilder = ccb;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "", "", ReactTextInputShadowNode.PROP_TEXT, "Lcom/facebook/react/bridge/WritableMap;", "params", "", "onMessage", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "LPg/m;", "byteString", "(LPg/m;Lcom/facebook/react/bridge/WritableMap;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ContentHandler {
        void onMessage(@NotNull m byteString, @NotNull WritableMap params);

        void onMessage(@NotNull String text, @NotNull WritableMap params);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketModule(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webSocketConnections = new ConcurrentHashMap();
        this.contentHandlers = new ConcurrentHashMap();
        this.cookieHandler = new ForwardingCookieHandler();
    }

    private final String getCookie(String uri) {
        try {
            List<String> list = this.cookieHandler.get(new URI(INSTANCE.getDefaultOrigin(uri)), new HashMap()).get("Cookie");
            List<String> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException unused) {
            throw new IllegalArgumentException(G.o("Unable to get cookie from ", uri));
        } catch (URISyntaxException unused2) {
            throw new IllegalArgumentException(G.o("Unable to get cookie from ", uri));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyWebSocketFailed(int id2, String message) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", id2);
        readableMapBuilder.put("message", message);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String eventName, ReadableMap params) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, params);
        }
    }

    @JvmStatic
    public static final void setCustomClientBuilder(@Nullable CustomClientBuilder customClientBuilder2) {
        INSTANCE.setCustomClientBuilder(customClientBuilder2);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double code, @Nullable String reason, double socketID) {
        int i7 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i7));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) code, reason);
            this.webSocketConnections.remove(Integer.valueOf(i7));
            this.contentHandlers.remove(Integer.valueOf(i7));
        } catch (Exception e10) {
            a.i("ReactNative", "Could not close WebSocket connection for id " + i7, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(@NotNull String url, @Nullable ReadableArray protocols, @Nullable ReadableMap options, double socketID) {
        boolean z3;
        Intrinsics.checkNotNullParameter(url, "url");
        final int i7 = (int) socketID;
        S s3 = new S();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        s3.b(10L, timeUnit);
        s3.f(10L, timeUnit);
        s3.e(0L, TimeUnit.MINUTES);
        INSTANCE.applyCustomBuilder(s3);
        U u6 = new U(s3);
        X x3 = new X();
        x3.j(Object.class, Integer.valueOf(i7));
        x3.k(url);
        String cookie = getCookie(url);
        if (cookie != null) {
            x3.a("Cookie", cookie);
        }
        if (options != null && options.hasKey("headers") && options.getType("headers") == ReadableType.Map) {
            ReadableMap map = options.getMap("headers");
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z3 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String == map.getType(strNextKey)) {
                    if (y.h(strNextKey, "origin", true)) {
                        z3 = true;
                    }
                    String string = map.getString(strNextKey);
                    if (string == null) {
                        throw new IllegalStateException(q0.k("value for name ", strNextKey, " == null").toString());
                    }
                    x3.a(strNextKey, string);
                } else {
                    a.v("ReactNative", "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z3 = false;
        }
        if (!z3) {
            x3.a("origin", INSTANCE.getDefaultOrigin(url));
        }
        if (protocols != null && protocols.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            int size = protocols.size();
            for (int i10 = 0; i10 < size; i10++) {
                String string2 = protocols.getString(i10);
                String string3 = string2 != null ? StringsKt.V(string2).toString() : null;
                if (!(string3 == null || string3.length() == 0) && !StringsKt.A(string3, ",", false)) {
                    sb2.append(string3);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                String string4 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                x3.a(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, string4);
            }
        }
        u6.newWebSocket(x3.b(), new l0() { // from class: com.facebook.react.modules.websocket.WebSocketModule.connect.2
            @Override // okhttp3.l0
            public void onClosed(WebSocket webSocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                int i11 = i7;
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                readableMapBuilder.put("id", i11);
                readableMapBuilder.put("code", code);
                readableMapBuilder.put("reason", reason);
                WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
            }

            @Override // okhttp3.l0
            public void onClosing(WebSocket websocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(websocket, "websocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                websocket.close(code, reason);
            }

            @Override // okhttp3.l0
            public void onFailure(WebSocket webSocket, Throwable t, e0 response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t, "t");
                WebSocketModule.this.notifyWebSocketFailed(i7, t.getMessage());
            }

            @Override // okhttp3.l0
            public void onMessage(WebSocket webSocket, String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                writableMapCreateMap.putInt("id", i7);
                writableMapCreateMap.putString("type", ReactTextInputShadowNode.PROP_TEXT);
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.contentHandlers.get(Integer.valueOf(i7));
                if (contentHandler != null) {
                    contentHandler.onMessage(text, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, text);
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }

            @Override // okhttp3.l0
            public void onOpen(WebSocket webSocket, e0 response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                WebSocketModule.this.webSocketConnections.put(Integer.valueOf(i7), webSocket);
                int i11 = i7;
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                readableMapBuilder.put("id", i11);
                readableMapBuilder.put(CronetNqeKey.KEY_PROTOCOL, response.b(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, ""));
                WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
            }

            @Override // okhttp3.l0
            public void onMessage(WebSocket webSocket, m bytes) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                writableMapCreateMap.putInt("id", i7);
                writableMapCreateMap.putString("type", "binary");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.contentHandlers.get(Integer.valueOf(i7));
                if (contentHandler != null) {
                    contentHandler.onMessage(bytes, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bytes.a());
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }
        });
        u6.f40653a.b().shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<WebSocket> it = this.webSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().close(1001, null);
        }
        this.webSocketConnections.clear();
        this.contentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double socketID) {
        int i7 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i7));
        if (webSocket != null) {
            try {
                webSocket.send(m.f7360e);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i7, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i7);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i7);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i7));
        this.contentHandlers.remove(Integer.valueOf(i7));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(@NotNull String message, double socketID) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i7 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i7));
        if (webSocket != null) {
            try {
                webSocket.send(message);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i7, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i7);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i7);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i7));
        this.contentHandlers.remove(Integer.valueOf(i7));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(@NotNull String base64String, double socketID) {
        Intrinsics.checkNotNullParameter(base64String, "base64String");
        int i7 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i7));
        if (webSocket != null) {
            try {
                m mVarM1deprecated_decodeBase64 = m.f7359d.m1deprecated_decodeBase64(base64String);
                if (mVarM1deprecated_decodeBase64 == null) {
                    throw new IllegalStateException("bytes == null");
                }
                webSocket.send(mVarM1deprecated_decodeBase64);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i7, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("id", i7);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("id", i7);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i7));
        this.contentHandlers.remove(Integer.valueOf(i7));
    }

    public final void setContentHandler(int id2, @Nullable ContentHandler contentHandler) {
        if (contentHandler == null) {
            this.contentHandlers.remove(Integer.valueOf(id2));
        } else {
            this.contentHandlers.put(Integer.valueOf(id2), contentHandler);
        }
    }

    public final void sendBinary(@NotNull m byteString, int id2) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(id2));
        if (webSocket == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("id", id2);
            readableMapBuilder.put("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
            ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
            readableMapBuilder2.put("id", id2);
            readableMapBuilder2.put("code", 0);
            readableMapBuilder2.put("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.webSocketConnections.remove(Integer.valueOf(id2));
            this.contentHandlers.remove(Integer.valueOf(id2));
            return;
        }
        try {
            webSocket.send(byteString);
        } catch (Exception e10) {
            notifyWebSocketFailed(id2, e10.getMessage());
        }
    }
}
