package com.pp.faceguard.traffic;

import androidx.camera.video.u;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p024b9.g;

/* JADX INFO: loaded from: classes3.dex */
public final class CapturingHttpURLConnection extends HttpURLConnection {
    private final HttpURLConnection delegate;
    private final AtomicBoolean emitted;
    private final ByteArrayOutputStream requestBody;
    private final Map<String, List<String>> requestHeaders;
    private String requestMethod;
    private final ByteArrayOutputStream responseBody;
    private final TrafficEventSink sink;
    private final long startedAtMs;

    public CapturingHttpURLConnection(HttpURLConnection httpURLConnection, TrafficEventSink trafficEventSink) {
        super(httpURLConnection.getURL());
        this.requestBody = new ByteArrayOutputStream();
        this.responseBody = new ByteArrayOutputStream();
        this.emitted = new AtomicBoolean();
        this.startedAtMs = System.currentTimeMillis();
        this.requestHeaders = new LinkedHashMap();
        this.delegate = httpURLConnection;
        this.sink = trafficEventSink;
        this.requestMethod = httpURLConnection.getRequestMethod();
    }

    private InputStream captureResponse(InputStream inputStream) {
        return new CapturingInputStream(inputStream, this.responseBody, new g(this, 26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitOnce() {
        int responseCode;
        if (this.emitted.compareAndSet(false, true)) {
            try {
                responseCode = this.delegate.getResponseCode();
            } catch (IOException unused) {
                responseCode = -1;
            }
            this.sink.accept(new TrafficEvent(FaceGuardTraffic.getDeviceId(), this.delegate.getURL().toString(), this.requestMethod, this.requestHeaders, this.requestBody.toByteArray(), firstHeader(HttpHeaders.CONTENT_TYPE), responseCode, this.delegate.getHeaderFields(), this.responseBody.toByteArray(), this.delegate.getHeaderField(HttpHeaders.CONTENT_TYPE), Math.max(0L, System.currentTimeMillis() - this.startedAtMs)));
        }
    }

    private String firstHeader(String str) {
        List<String> list = this.requestHeaders.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) u.e(1, list);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.delegate.addRequestProperty(str, str2);
        List<String> arrayList = this.requestHeaders.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(str2);
        this.requestHeaders.put(str, arrayList);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.delegate.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.delegate.disconnect();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.delegate.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.delegate.getContent();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.delegate.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.delegate.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.delegate.getContentType();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.delegate.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.delegate.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        InputStream errorStream = this.delegate.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        return captureResponse(errorStream);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.delegate.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i7) {
        return this.delegate.getHeaderFieldKey(i7);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.delegate.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return captureResponse(this.delegate.getInputStream());
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.delegate.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return new CapturingOutputStream(this.delegate.getOutputStream(), this.requestBody);
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.delegate.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.requestMethod;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.delegate.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.delegate.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.delegate.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.delegate.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.delegate.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.delegate.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i7) {
        this.delegate.setConnectTimeout(i7);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z3) {
        this.delegate.setDoInput(z3);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z3) {
        this.delegate.setDoOutput(z3);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z3) {
        this.delegate.setInstanceFollowRedirects(z3);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i7) {
        this.delegate.setReadTimeout(i7);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.delegate.setRequestMethod(str);
        this.requestMethod = str;
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.delegate.setRequestProperty(str, str2);
        this.requestHeaders.put(str, new ArrayList(Collections.singletonList(str2)));
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z3) {
        this.delegate.setUseCaches(z3);
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.delegate.usingProxy();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.delegate.getContent(clsArr);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i7) {
        return this.delegate.getHeaderField(i7);
    }
}
