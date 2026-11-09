package H8;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.F;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, Context context, Continuation continuation) {
        super(2, continuation);
        this.f3754a = str;
        this.f3755b = str2;
        this.f3756c = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f3754a, this.f3755b, this.f3756c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02db  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bb A[Catch: all -> 0x012e, TryCatch #9 {all -> 0x012e, blocks: (B:6:0x00c3, B:8:0x00df, B:12:0x0109, B:27:0x0144, B:99:0x02b4, B:100:0x02b9, B:61:0x0193, B:63:0x01bb, B:64:0x01be, B:69:0x01e8, B:71:0x0200, B:72:0x0203, B:78:0x022b, B:79:0x0230, B:85:0x0258, B:86:0x025d, B:92:0x0286, B:93:0x028b), top: B:112:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01de  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e3 A[PHI: r0 r2
      0x01e3: PHI (r0v41 H8.b) = (r0v20 H8.b), (r0v25 H8.b), (r0v30 H8.b), (r0v35 H8.b), (r0v40 H8.b), (r0v47 H8.b) binds: [B:67:0x01e1, B:75:0x0226, B:82:0x0253, B:89:0x0280, B:96:0x02ae, B:103:0x02de] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r2v24 java.net.HttpURLConnection) = 
      (r2v19 java.net.HttpURLConnection)
      (r2v20 java.net.HttpURLConnection)
      (r2v21 java.net.HttpURLConnection)
      (r2v22 java.net.HttpURLConnection)
      (r2v23 java.net.HttpURLConnection)
      (r2v25 java.net.HttpURLConnection)
     binds: [B:67:0x01e1, B:75:0x0226, B:82:0x0253, B:89:0x0280, B:96:0x02ae, B:103:0x02de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0200 A[Catch: all -> 0x012e, TryCatch #9 {all -> 0x012e, blocks: (B:6:0x00c3, B:8:0x00df, B:12:0x0109, B:27:0x0144, B:99:0x02b4, B:100:0x02b9, B:61:0x0193, B:63:0x01bb, B:64:0x01be, B:69:0x01e8, B:71:0x0200, B:72:0x0203, B:78:0x022b, B:79:0x0230, B:85:0x0258, B:86:0x025d, B:92:0x0286, B:93:0x028b), top: B:112:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0223  */
    /* JADX WARN: Code duplicated, block: B:78:0x022b A[Catch: all -> 0x012e, TRY_ENTER, TryCatch #9 {all -> 0x012e, blocks: (B:6:0x00c3, B:8:0x00df, B:12:0x0109, B:27:0x0144, B:99:0x02b4, B:100:0x02b9, B:61:0x0193, B:63:0x01bb, B:64:0x01be, B:69:0x01e8, B:71:0x0200, B:72:0x0203, B:78:0x022b, B:79:0x0230, B:85:0x0258, B:86:0x025d, B:92:0x0286, B:93:0x028b), top: B:112:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0250  */
    /* JADX WARN: Code duplicated, block: B:85:0x0258 A[Catch: all -> 0x012e, TRY_ENTER, TryCatch #9 {all -> 0x012e, blocks: (B:6:0x00c3, B:8:0x00df, B:12:0x0109, B:27:0x0144, B:99:0x02b4, B:100:0x02b9, B:61:0x0193, B:63:0x01bb, B:64:0x01be, B:69:0x01e8, B:71:0x0200, B:72:0x0203, B:78:0x022b, B:79:0x0230, B:85:0x0258, B:86:0x025d, B:92:0x0286, B:93:0x028b), top: B:112:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:88:0x027d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0286 A[Catch: all -> 0x012e, TRY_ENTER, TryCatch #9 {all -> 0x012e, blocks: (B:6:0x00c3, B:8:0x00df, B:12:0x0109, B:27:0x0144, B:99:0x02b4, B:100:0x02b9, B:61:0x0193, B:63:0x01bb, B:64:0x01be, B:69:0x01e8, B:71:0x0200, B:72:0x0203, B:78:0x022b, B:79:0x0230, B:85:0x0258, B:86:0x025d, B:92:0x0286, B:93:0x028b), top: B:112:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b4 A[Catch: all -> 0x012e, TRY_ENTER, TryCatch #9 {all -> 0x012e, blocks: (B:6:0x00c3, B:8:0x00df, B:12:0x0109, B:27:0x0144, B:99:0x02b4, B:100:0x02b9, B:61:0x0193, B:63:0x01bb, B:64:0x01be, B:69:0x01e8, B:71:0x0200, B:72:0x0203, B:78:0x022b, B:79:0x0230, B:85:0x0258, B:86:0x025d, B:92:0x0286, B:93:0x028b), top: B:112:0x009d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.google.firebase.perf.metrics.Trace] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v32 */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r3;
        ?? r12;
        Trace traceStartTrace;
        HttpURLConnection httpURLConnection;
        String strZ;
        b bVar;
        String strZ2;
        b bVar2;
        String str = "Timeout in getRedirectUrlWithMobileNetwork: ";
        Ef.a aVar = Ef.a.f2423a;
        Ef.a aVar2 = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        a aVar3 = f.f3758b;
        String str2 = this.f3754a;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        aVar3.f3742a = str2;
        String str3 = this.f3755b;
        Intrinsics.checkNotNullParameter(str3, "<set-?>");
        aVar3.f3743b = str3;
        F6.d.h("MTNApi", 3, "Generating authorization URL (HTTPS: false)");
        aVar3.getClass();
        Uri.Builder builderAppendQueryParameter = Uri.parse("http://lb1-api.chenosis.io/smnv/v1/oauth/authorize").buildUpon().appendQueryParameter("client_id", aVar3.f3742a).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", aVar3.f3743b).appendQueryParameter(RemoteConfigConstants.ResponseFieldKey.STATE, "prod").appendQueryParameter("prompt", ViewProps.NONE);
        builderAppendQueryParameter.appendQueryParameter("code_challenge_method", "S256");
        String string = builderAppendQueryParameter.build().toString();
        String str4 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        try {
            try {
                URL url = new URL(string);
                long jCurrentTimeMillis = System.currentTimeMillis();
                F6.d.b("MTNApi", "getRedirectUrlWithMobileNetwork: use default network");
                traceStartTrace = FirebasePerformance.startTrace("MTN_oauth_api");
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    Intrinsics.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    httpURLConnection = (HttpURLConnection) uRLConnection;
                    try {
                        try {
                            httpURLConnection.setInstanceFollowRedirects(false);
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setConnectTimeout(20000);
                            httpURLConnection.setReadTimeout(20000);
                            int responseCode = httpURLConnection.getResponseCode();
                            str = "Timeout in getRedirectUrlWithMobileNetwork: ";
                            try {
                                F6.d.b("MTNApi", "getRedirectUrlWithMobileNetwork Response Code: " + responseCode + " cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                traceStartTrace.putAttribute("code", String.valueOf(responseCode));
                                if (300 > responseCode || responseCode >= 400) {
                                    traceStartTrace.putAttribute("result", "fail");
                                    bVar2 = new b(null, false);
                                } else {
                                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                                    F6.d.b("MTNApi", "getRedirectUrlWithMobileNetwork Location: " + headerField);
                                    traceStartTrace.putAttribute("result", "success");
                                    bVar2 = new b(headerField, false);
                                }
                                traceStartTrace.stop();
                                httpURLConnection.disconnect();
                                return bVar2;
                            } catch (SocketTimeoutException e10) {
                                e = e10;
                                if (traceStartTrace != null) {
                                    traceStartTrace.putAttribute("result", "SocketTimeoutException");
                                }
                                F6.d.b("MTNApi", str + e.getMessage());
                                bVar = new b(null, true);
                                if (traceStartTrace != null) {
                                    traceStartTrace.stop();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return bVar;
                            }
                        } catch (SocketTimeoutException e11) {
                            e = e11;
                            str = "Timeout in getRedirectUrlWithMobileNetwork: ";
                        }
                    } catch (ConnectException e12) {
                        e = e12;
                        if (traceStartTrace != null) {
                            traceStartTrace.putAttribute("result", "ConnectException");
                        }
                        F6.d.b("MTNApi", "Connection failed in getRedirectUrlWithMobileNetwork: " + e.getMessage());
                        bVar = new b(null, true);
                        if (traceStartTrace != null) {
                            traceStartTrace.stop();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return bVar;
                    } catch (SSLHandshakeException e13) {
                        e = e13;
                        if (traceStartTrace != null) {
                            traceStartTrace.putAttribute("result", "SSLHandshakeException");
                        }
                        F6.d.b("MTNApi", "SSL 握手失败: " + e.getMessage());
                        bVar = new b(null, true);
                        if (traceStartTrace != null) {
                            traceStartTrace.stop();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return bVar;
                    } catch (SSLException e14) {
                        e = e14;
                        if (traceStartTrace != null) {
                            traceStartTrace.putAttribute("result", "SSLException");
                        }
                        F6.d.b("MTNApi", "SSL 异常: " + e.getMessage());
                        bVar = new b(null, true);
                        if (traceStartTrace != null) {
                            traceStartTrace.stop();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return bVar;
                    } catch (IOException e15) {
                        e = e15;
                        strZ2 = F.z(99, "IO/" + e.getMessage());
                        if (traceStartTrace != null) {
                            traceStartTrace.putAttribute("result", strZ2);
                        }
                        F6.d.b("MTNApi", "Exception in getRedirectUrlWithMobileNetwork: " + e.getMessage());
                        bVar = new b(null, true);
                        if (traceStartTrace != null) {
                            traceStartTrace.stop();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return bVar;
                    } catch (Exception e16) {
                        e = e16;
                        strZ = F.z(99, e.getClass().getSimpleName() + ":" + e.getMessage());
                        if (traceStartTrace != null) {
                            traceStartTrace.putAttribute("result", strZ);
                        }
                        F6.d.b("MTNApi", "Exception in getRedirectUrlWithMobileNetwork: " + e.getMessage());
                        bVar = new b(null, true);
                        if (traceStartTrace != null) {
                            traceStartTrace.stop();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return bVar;
                    }
                } catch (ConnectException e17) {
                    e = e17;
                    httpURLConnection = null;
                    if (traceStartTrace != null) {
                        traceStartTrace.putAttribute("result", "ConnectException");
                    }
                    F6.d.b("MTNApi", "Connection failed in getRedirectUrlWithMobileNetwork: " + e.getMessage());
                    bVar = new b(null, true);
                    if (traceStartTrace != null) {
                        traceStartTrace.stop();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return bVar;
                } catch (SocketTimeoutException e18) {
                    e = e18;
                    httpURLConnection = null;
                    if (traceStartTrace != null) {
                        traceStartTrace.putAttribute("result", "SocketTimeoutException");
                    }
                    F6.d.b("MTNApi", str + e.getMessage());
                    bVar = new b(null, true);
                    if (traceStartTrace != null) {
                        traceStartTrace.stop();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return bVar;
                } catch (SSLHandshakeException e19) {
                    e = e19;
                    httpURLConnection = null;
                    if (traceStartTrace != null) {
                        traceStartTrace.putAttribute("result", "SSLHandshakeException");
                    }
                    F6.d.b("MTNApi", "SSL 握手失败: " + e.getMessage());
                    bVar = new b(null, true);
                    if (traceStartTrace != null) {
                        traceStartTrace.stop();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return bVar;
                } catch (SSLException e20) {
                    e = e20;
                    httpURLConnection = null;
                    if (traceStartTrace != null) {
                        traceStartTrace.putAttribute("result", "SSLException");
                    }
                    F6.d.b("MTNApi", "SSL 异常: " + e.getMessage());
                    bVar = new b(null, true);
                    if (traceStartTrace != null) {
                        traceStartTrace.stop();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return bVar;
                } catch (IOException e21) {
                    e = e21;
                    httpURLConnection = null;
                    strZ2 = F.z(99, "IO/" + e.getMessage());
                    if (traceStartTrace != null) {
                        traceStartTrace.putAttribute("result", strZ2);
                    }
                    F6.d.b("MTNApi", "Exception in getRedirectUrlWithMobileNetwork: " + e.getMessage());
                    bVar = new b(null, true);
                    if (traceStartTrace != null) {
                        traceStartTrace.stop();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return bVar;
                } catch (Exception e22) {
                    e = e22;
                    httpURLConnection = null;
                    strZ = F.z(99, e.getClass().getSimpleName() + ":" + e.getMessage());
                    if (traceStartTrace != null) {
                        traceStartTrace.putAttribute("result", strZ);
                    }
                    F6.d.b("MTNApi", "Exception in getRedirectUrlWithMobileNetwork: " + e.getMessage());
                    bVar = new b(null, true);
                    if (traceStartTrace != null) {
                        traceStartTrace.stop();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return bVar;
                } catch (Throwable th) {
                    th = th;
                    r12 = traceStartTrace;
                    r3 = 0;
                    if (r12 != 0) {
                        r12.stop();
                    }
                    if (r3 != 0) {
                        r3.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r12 = string;
                r3 = str4;
            }
        } catch (ConnectException e23) {
            e = e23;
            traceStartTrace = null;
        } catch (SocketTimeoutException e24) {
            e = e24;
            traceStartTrace = null;
        } catch (SSLHandshakeException e25) {
            e = e25;
            traceStartTrace = null;
        } catch (SSLException e26) {
            e = e26;
            traceStartTrace = null;
        } catch (IOException e27) {
            e = e27;
            traceStartTrace = null;
        } catch (Exception e28) {
            e = e28;
            traceStartTrace = null;
        } catch (Throwable th3) {
            th = th3;
            r3 = 0;
            r12 = 0;
        }
    }
}
