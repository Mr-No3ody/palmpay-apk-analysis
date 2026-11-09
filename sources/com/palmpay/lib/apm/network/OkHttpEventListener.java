package com.palmpay.lib.apm.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.net.cronet.okhttptransport.CronetNqeKey;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.D;
import okhttp3.W;
import okhttp3.Y;
import okhttp3.e0;
import p112h6.c;

/* JADX INFO: loaded from: classes3.dex */
public class OkHttpEventListener extends NQEHttpEventListener {
    private static final String METHOD_CALL_END = "callEnd";
    private static final String METHOD_CALL_FAILED = "callFailed";
    private static final String METHOD_CALL_START = "callStart";
    private static final String METHOD_CONNECTION_ACQUIRED = "connectionAcquired";
    private static final String METHOD_CONNECTION_RELEASED = "connectionReleased";
    private static final String METHOD_CONNECT_END = "connectEnd";
    private static final String METHOD_CONNECT_FAILED = "connectFailed";
    private static final String METHOD_CONNECT_START = "connectStart";
    private static final String METHOD_DNS_END = "dnsEnd";
    private static final String METHOD_DNS_START = "dnsStart";
    private static final String METHOD_REQUEST_BODY_END = "requestBodyEnd";
    private static final String METHOD_REQUEST_HEADERS_END = "requestHeadersEnd";
    private static final String METHOD_REQUEST_HEADERS_START = "requestHeadersStart";
    private static final String METHOD_RESPONSE_BODY_END = "responseBodyEnd";
    private static final String METHOD_RESPONSE_BODY_START = "responseBodyStart";
    private static final String METHOD_RESPONSE_FAILED = "responseFailed";
    private static final String METHOD_RESPONSE_HEADERS_END = "responseHeadersEnd";
    private static final String METHOD_RESPONSE_HEADERS_START = "responseHeadersStart";
    private static final String METHOD_SECURE_CONNECT_END = "secureConnectEnd";
    private static final String METHOD_SECURE_CONNECT_START = "secureConnectStart";
    private static final boolean MORE_INFO = false;
    private static final String TAG2 = "OkHttpEventListener";
    private boolean useHttpDns = false;
    private boolean enableNetworkTrace = true;
    private String traceName = "NetworkTrace";
    private Map<String, String> mHostCache = null;
    private HashMap<Integer, c> mTrace = new HashMap<>();

    private String getConnectionInfo(Connection connection) {
        try {
            InetAddress inetAddress = connection.socket().getInetAddress();
            String hostName = inetAddress.getHostName();
            String hostAddress = inetAddress.getHostAddress();
            if (TextUtils.equals(hostName, hostAddress)) {
                return getHost(hostAddress) + "/" + hostAddress;
            }
            saveHost(hostName, hostAddress);
            return hostName + "/" + hostAddress;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private String getHost(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (this.mHostCache == null) {
                    this.mHostCache = new HashMap();
                }
                String str2 = this.mHostCache.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    private void putAttribute(Call call, String str, String str2) {
        c cVar;
        if (this.enableNetworkTrace && (cVar = this.mTrace.get(Integer.valueOf(call.hashCode()))) != null) {
            cVar.b(str, str2);
        }
    }

    private void putMetric(Call call, String str, String str2) {
        long j6;
        c cVar;
        if (this.enableNetworkTrace) {
            if (TextUtils.isEmpty(str2)) {
                j6 = 0;
            } else {
                try {
                    j6 = Long.parseLong(str2);
                } catch (Exception unused) {
                    j6 = 0;
                }
            }
            if (j6 == 0 || (cVar = this.mTrace.get(Integer.valueOf(call.hashCode()))) == null) {
                return;
            }
            cVar.c(str, j6);
        }
    }

    private void saveHost(String str, String str2) {
        try {
            if (this.mHostCache == null) {
                this.mHostCache = new HashMap();
            }
            if (this.mHostCache.size() > 10) {
                this.mHostCache.clear();
            }
            this.mHostCache.put(str2, str);
        } catch (Exception unused) {
        }
    }

    private void trace(Call call, String str) {
        c cVar;
        if (this.enableNetworkTrace) {
            try {
                if (METHOD_CALL_START.equals(str)) {
                    cVar = new c(this, call.request().f40685a.b(), call.request().f40686b);
                    if (this.mTrace.size() > 50) {
                        this.mTrace.clear();
                    }
                    this.mTrace.put(Integer.valueOf(call.hashCode()), cVar);
                } else {
                    cVar = this.mTrace.get(Integer.valueOf(call.hashCode()));
                }
                if (cVar == null || !cVar.e(SystemClock.elapsedRealtime(), str)) {
                    return;
                }
                this.mTrace.remove(cVar);
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void callEnd(Call call) {
        super.callEnd(call);
        trace(call, METHOD_CALL_END);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        trace(call, METHOD_CALL_FAILED);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void callStart(Call call) {
        super.callStart(call);
        trace(call, METHOD_CALL_START);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, W w3) {
        super.connectEnd(call, inetSocketAddress, proxy, w3);
        trace(call, METHOD_CONNECT_END);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, W w3, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, w3, iOException);
        trace(call, METHOD_CONNECT_FAILED);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        trace(call, METHOD_CONNECT_START);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        if (isDebug()) {
            connection.handshake().f40561a.name();
            trace(call, METHOD_CONNECTION_ACQUIRED);
        }
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void connectionReleased(Call call, Connection connection) {
        super.connectionReleased(call, connection);
        try {
            putAttribute(call, CronetNqeKey.KEY_PROTOCOL, connection.protocol().f40679a + "_" + connection.handshake().f40561a.name());
            putAttribute(call, "baseUrl", getConnectionInfo(connection));
            if (isDebug()) {
                trace(call, METHOD_CONNECTION_RELEASED);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        trace(call, METHOD_DNS_END);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        trace(call, METHOD_DNS_START);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void requestBodyEnd(Call call, long j6) {
        super.requestBodyEnd(call, j6);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void requestBodyStart(Call call) {
        super.requestBodyStart(call);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void requestFailed(Call call, IOException iOException) {
        super.requestFailed(call, iOException);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void requestHeadersEnd(Call call, Y y8) {
        super.requestHeadersEnd(call, y8);
        trace(call, METHOD_REQUEST_HEADERS_END);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        trace(call, METHOD_REQUEST_HEADERS_START);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void responseBodyEnd(Call call, long j6) {
        super.responseBodyEnd(call, j6);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void responseBodyStart(Call call) {
        super.responseBodyStart(call);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void responseFailed(Call call, IOException iOException) {
        super.responseFailed(call, iOException);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void responseHeadersEnd(Call call, e0 e0Var) {
        super.responseHeadersEnd(call, e0Var);
        putMetric(call, "serverDuration", e0Var.f40733f.a("bkrt"));
        putAttribute(call, "encryption", TextUtils.isEmpty(e0Var.f40733f.a("X-Response-Encryption")) ? "N" : "Y");
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void responseHeadersStart(Call call) {
        super.responseHeadersStart(call);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void secureConnectEnd(Call call, D d2) {
        super.secureConnectEnd(call, d2);
        trace(call, METHOD_SECURE_CONNECT_END);
    }

    @Override // com.palmpay.lib.apm.network.NQEHttpEventListener, okhttp3.AbstractC1956y
    public void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        trace(call, METHOD_SECURE_CONNECT_START);
    }

    public void setEnableNetworkTrace(boolean z3) {
        this.enableNetworkTrace = z3;
        if (z3) {
            return;
        }
        Iterator<c> it = this.mTrace.values().iterator();
        while (it.hasNext()) {
            it.next().d(false, false);
        }
        this.mTrace.clear();
    }

    public void setTraceName(String str) {
        this.traceName = str;
    }

    public void setUseHttpDns(boolean z3) {
        this.useHttpDns = z3;
    }
}
