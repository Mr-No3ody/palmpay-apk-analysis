package com.palmpay.lib.apm.network.bean;

import N8.q0;
import com.google.net.cronet.okhttptransport.CronetNqeKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JC\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010L\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010I\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0002\u0010XJ\b\u0010Y\u001a\u00020&H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001a\u0010.\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001a\u00104\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001a\u00107\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\u001a\u0010:\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001a\u0010@\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001a\u0010C\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u001a\u0010F\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\bR\u001e\u0010I\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\bJ\u0010\u0011\"\u0004\bK\u0010\u0013R\u001e\u0010L\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\bM\u0010\u0011\"\u0004\bN\u0010\u0013R\u001a\u0010O\u001a\u00020PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006Z"}, d2 = {"Lcom/palmpay/lib/apm/network/bean/NQEMetrics;", "", "()V", "connectEndTime", "", "getConnectEndTime", "()J", "setConnectEndTime", "(J)V", "connectStartTime", "getConnectStartTime", "setConnectStartTime", "dnsEndTime", "getDnsEndTime", "setDnsEndTime", "dnsRTT", "getDnsRTT", "()Ljava/lang/Long;", "setDnsRTT", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "dnsStartTime", "getDnsStartTime", "setDnsStartTime", "elapsedTime", "getElapsedTime", "setElapsedTime", CronetNqeKey.KEY_HTTP_RTT, "getHttpRTT", "setHttpRTT", "isNormalRequest", "", "()Z", "setNormalRequest", "(Z)V", "isSuccessed", "setSuccessed", CronetNqeKey.KEY_PROTOCOL, "", "getProtocol", "()Ljava/lang/String;", "setProtocol", "(Ljava/lang/String;)V", "requestBodyEndTime", "getRequestBodyEndTime", "setRequestBodyEndTime", "requestBodyStartTime", "getRequestBodyStartTime", "setRequestBodyStartTime", "requestHeadersStartTime", "getRequestHeadersStartTime", "setRequestHeadersStartTime", "responseBodyEnd", "getResponseBodyEnd", "setResponseBodyEnd", "responseBodyEndTime", "getResponseBodyEndTime", "setResponseBodyEndTime", "responseBodyStartTime", "getResponseBodyStartTime", "setResponseBodyStartTime", "responseHeadersEndTime", "getResponseHeadersEndTime", "setResponseHeadersEndTime", "responseHeadersStartTime", "getResponseHeadersStartTime", "setResponseHeadersStartTime", "secureConnectEndTime", "getSecureConnectEndTime", "setSecureConnectEndTime", "secureConnectStartTime", "getSecureConnectStartTime", "setSecureConnectStartTime", "tlsRTT", "getTlsRTT", "setTlsRTT", CronetNqeKey.KEY_TRANSPORT_RTT, "getTransportRTT", "setTransportRTT", "type", "", "getType", "()I", "setType", "(I)V", "setCalculateData", "", "networkSuccessStatus", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;J)V", "toString", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NQEMetrics {
    private long connectEndTime;
    private long connectStartTime;
    private long dnsEndTime;

    @Nullable
    private Long dnsRTT;
    private long dnsStartTime;
    private long elapsedTime;

    @Nullable
    private Long httpRTT;
    private boolean isNormalRequest;
    private boolean isSuccessed;

    @Nullable
    private String protocol;
    private long requestBodyEndTime;
    private long requestBodyStartTime;
    private long requestHeadersStartTime;
    private boolean responseBodyEnd;
    private long responseBodyEndTime;
    private long responseBodyStartTime;
    private long responseHeadersEndTime;
    private long responseHeadersStartTime;
    private long secureConnectEndTime;
    private long secureConnectStartTime;

    @Nullable
    private Long tlsRTT;

    @Nullable
    private Long transportRTT;
    private int type;

    public final long getConnectEndTime() {
        return this.connectEndTime;
    }

    public final long getConnectStartTime() {
        return this.connectStartTime;
    }

    public final long getDnsEndTime() {
        return this.dnsEndTime;
    }

    @Nullable
    public final Long getDnsRTT() {
        return this.dnsRTT;
    }

    public final long getDnsStartTime() {
        return this.dnsStartTime;
    }

    public final long getElapsedTime() {
        return this.elapsedTime;
    }

    @Nullable
    public final Long getHttpRTT() {
        return this.httpRTT;
    }

    @Nullable
    public final String getProtocol() {
        return this.protocol;
    }

    public final long getRequestBodyEndTime() {
        return this.requestBodyEndTime;
    }

    public final long getRequestBodyStartTime() {
        return this.requestBodyStartTime;
    }

    public final long getRequestHeadersStartTime() {
        return this.requestHeadersStartTime;
    }

    public final boolean getResponseBodyEnd() {
        return this.responseBodyEnd;
    }

    public final long getResponseBodyEndTime() {
        return this.responseBodyEndTime;
    }

    public final long getResponseBodyStartTime() {
        return this.responseBodyStartTime;
    }

    public final long getResponseHeadersEndTime() {
        return this.responseHeadersEndTime;
    }

    public final long getResponseHeadersStartTime() {
        return this.responseHeadersStartTime;
    }

    public final long getSecureConnectEndTime() {
        return this.secureConnectEndTime;
    }

    public final long getSecureConnectStartTime() {
        return this.secureConnectStartTime;
    }

    @Nullable
    public final Long getTlsRTT() {
        return this.tlsRTT;
    }

    @Nullable
    public final Long getTransportRTT() {
        return this.transportRTT;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isNormalRequest, reason: from getter */
    public final boolean getIsNormalRequest() {
        return this.isNormalRequest;
    }

    /* JADX INFO: renamed from: isSuccessed, reason: from getter */
    public final boolean getIsSuccessed() {
        return this.isSuccessed;
    }

    public final void setCalculateData(boolean networkSuccessStatus, @Nullable Long httpRTT, @Nullable Long transportRTT, @Nullable Long dnsRTT, @Nullable Long tlsRTT, long elapsedTime) {
        this.isSuccessed = networkSuccessStatus;
        this.httpRTT = httpRTT;
        this.transportRTT = transportRTT;
        this.dnsRTT = dnsRTT;
        this.tlsRTT = tlsRTT;
        this.elapsedTime = elapsedTime;
    }

    public final void setConnectEndTime(long j6) {
        this.connectEndTime = j6;
    }

    public final void setConnectStartTime(long j6) {
        this.connectStartTime = j6;
    }

    public final void setDnsEndTime(long j6) {
        this.dnsEndTime = j6;
    }

    public final void setDnsRTT(@Nullable Long l5) {
        this.dnsRTT = l5;
    }

    public final void setDnsStartTime(long j6) {
        this.dnsStartTime = j6;
    }

    public final void setElapsedTime(long j6) {
        this.elapsedTime = j6;
    }

    public final void setHttpRTT(@Nullable Long l5) {
        this.httpRTT = l5;
    }

    public final void setNormalRequest(boolean z3) {
        this.isNormalRequest = z3;
    }

    public final void setProtocol(@Nullable String str) {
        this.protocol = str;
    }

    public final void setRequestBodyEndTime(long j6) {
        this.requestBodyEndTime = j6;
    }

    public final void setRequestBodyStartTime(long j6) {
        this.requestBodyStartTime = j6;
    }

    public final void setRequestHeadersStartTime(long j6) {
        this.requestHeadersStartTime = j6;
    }

    public final void setResponseBodyEnd(boolean z3) {
        this.responseBodyEnd = z3;
    }

    public final void setResponseBodyEndTime(long j6) {
        this.responseBodyEndTime = j6;
    }

    public final void setResponseBodyStartTime(long j6) {
        this.responseBodyStartTime = j6;
    }

    public final void setResponseHeadersEndTime(long j6) {
        this.responseHeadersEndTime = j6;
    }

    public final void setResponseHeadersStartTime(long j6) {
        this.responseHeadersStartTime = j6;
    }

    public final void setSecureConnectEndTime(long j6) {
        this.secureConnectEndTime = j6;
    }

    public final void setSecureConnectStartTime(long j6) {
        this.secureConnectStartTime = j6;
    }

    public final void setSuccessed(boolean z3) {
        this.isSuccessed = z3;
    }

    public final void setTlsRTT(@Nullable Long l5) {
        this.tlsRTT = l5;
    }

    public final void setTransportRTT(@Nullable Long l5) {
        this.transportRTT = l5;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    @NotNull
    public String toString() {
        String str = this.type == 0 ? "okhttp" : "cronet";
        boolean z3 = this.isSuccessed;
        Long l5 = this.httpRTT;
        Long l6 = this.transportRTT;
        Long l8 = this.dnsRTT;
        Long l10 = this.tlsRTT;
        String str2 = this.protocol;
        long j6 = this.elapsedTime;
        StringBuilder sb2 = new StringBuilder("NQEMetrics(type=");
        sb2.append(str);
        sb2.append(", isSuccessed=");
        sb2.append(z3);
        sb2.append(", httpRTT=");
        q0.w(sb2, l5, ", transportRTT=", l6, ", dnsRTT=");
        q0.w(sb2, l8, ", tlsRTT=", l10, ", protocol=");
        sb2.append(str2);
        sb2.append(", elapsedTime=");
        sb2.append(j6);
        sb2.append(")");
        return sb2.toString();
    }
}
