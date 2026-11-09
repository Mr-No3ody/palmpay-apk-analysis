package com.google.firebase.perf.network;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class InstrURLConnectionBase {
    private static final String USER_AGENT_PROPERTY = "User-Agent";
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final HttpURLConnection httpUrlConnection;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private long timeRequestedInMicros = -1;
    private long timeToResponseInitiatedInMicros = -1;
    private final Timer timer;

    public InstrURLConnectionBase(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.httpUrlConnection = httpURLConnection;
        this.networkMetricBuilder = networkRequestMetricBuilder;
        this.timer = timer;
        networkRequestMetricBuilder.setUrl(httpURLConnection.getURL().toString());
    }

    private void updateRequestInfo() {
        if (this.timeRequestedInMicros == -1) {
            this.timer.reset();
            long micros = this.timer.getMicros();
            this.timeRequestedInMicros = micros;
            this.networkMetricBuilder.setRequestStartTimeMicros(micros);
        }
        String requestMethod = getRequestMethod();
        if (requestMethod != null) {
            this.networkMetricBuilder.setHttpMethod(requestMethod);
        } else if (getDoOutput()) {
            this.networkMetricBuilder.setHttpMethod("POST");
        } else {
            this.networkMetricBuilder.setHttpMethod("GET");
        }
    }

    public void addRequestProperty(String str, String str2) {
        this.httpUrlConnection.addRequestProperty(str, str2);
    }

    public void connect() throws IOException {
        if (this.timeRequestedInMicros == -1) {
            this.timer.reset();
            long micros = this.timer.getMicros();
            this.timeRequestedInMicros = micros;
            this.networkMetricBuilder.setRequestStartTimeMicros(micros);
        }
        try {
            this.httpUrlConnection.connect();
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    public void disconnect() {
        this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
        this.networkMetricBuilder.build();
        this.httpUrlConnection.disconnect();
    }

    public boolean equals(Object obj) {
        return this.httpUrlConnection.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.httpUrlConnection.getAllowUserInteraction();
    }

    public int getConnectTimeout() {
        return this.httpUrlConnection.getConnectTimeout();
    }

    public Object getContent() throws IOException {
        updateRequestInfo();
        this.networkMetricBuilder.setHttpResponseCode(this.httpUrlConnection.getResponseCode());
        try {
            Object content = this.httpUrlConnection.getContent();
            if (content instanceof InputStream) {
                this.networkMetricBuilder.setResponseContentType(this.httpUrlConnection.getContentType());
                return new InstrHttpInputStream((InputStream) content, this.networkMetricBuilder, this.timer);
            }
            this.networkMetricBuilder.setResponseContentType(this.httpUrlConnection.getContentType());
            this.networkMetricBuilder.setResponsePayloadBytes(this.httpUrlConnection.getContentLength());
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            this.networkMetricBuilder.build();
            return content;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    public String getContentEncoding() {
        updateRequestInfo();
        return this.httpUrlConnection.getContentEncoding();
    }

    public int getContentLength() {
        updateRequestInfo();
        return this.httpUrlConnection.getContentLength();
    }

    public long getContentLengthLong() {
        updateRequestInfo();
        return this.httpUrlConnection.getContentLengthLong();
    }

    public String getContentType() {
        updateRequestInfo();
        return this.httpUrlConnection.getContentType();
    }

    public long getDate() {
        updateRequestInfo();
        return this.httpUrlConnection.getDate();
    }

    public boolean getDefaultUseCaches() {
        return this.httpUrlConnection.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.httpUrlConnection.getDoInput();
    }

    public boolean getDoOutput() {
        return this.httpUrlConnection.getDoOutput();
    }

    public InputStream getErrorStream() {
        updateRequestInfo();
        try {
            this.networkMetricBuilder.setHttpResponseCode(this.httpUrlConnection.getResponseCode());
        } catch (IOException unused) {
            logger.debug("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.httpUrlConnection.getErrorStream();
        return errorStream != null ? new InstrHttpInputStream(errorStream, this.networkMetricBuilder, this.timer) : errorStream;
    }

    public long getExpiration() {
        updateRequestInfo();
        return this.httpUrlConnection.getExpiration();
    }

    public String getHeaderField(int i7) {
        updateRequestInfo();
        return this.httpUrlConnection.getHeaderField(i7);
    }

    public long getHeaderFieldDate(String str, long j6) {
        updateRequestInfo();
        return this.httpUrlConnection.getHeaderFieldDate(str, j6);
    }

    public int getHeaderFieldInt(String str, int i7) {
        updateRequestInfo();
        return this.httpUrlConnection.getHeaderFieldInt(str, i7);
    }

    public String getHeaderFieldKey(int i7) {
        updateRequestInfo();
        return this.httpUrlConnection.getHeaderFieldKey(i7);
    }

    public long getHeaderFieldLong(String str, long j6) {
        updateRequestInfo();
        return this.httpUrlConnection.getHeaderFieldLong(str, j6);
    }

    public Map<String, List<String>> getHeaderFields() {
        updateRequestInfo();
        return this.httpUrlConnection.getHeaderFields();
    }

    public long getIfModifiedSince() {
        return this.httpUrlConnection.getIfModifiedSince();
    }

    public InputStream getInputStream() throws IOException {
        updateRequestInfo();
        this.networkMetricBuilder.setHttpResponseCode(this.httpUrlConnection.getResponseCode());
        this.networkMetricBuilder.setResponseContentType(this.httpUrlConnection.getContentType());
        try {
            InputStream inputStream = this.httpUrlConnection.getInputStream();
            return inputStream != null ? new InstrHttpInputStream(inputStream, this.networkMetricBuilder, this.timer) : inputStream;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    public boolean getInstanceFollowRedirects() {
        return this.httpUrlConnection.getInstanceFollowRedirects();
    }

    public long getLastModified() {
        updateRequestInfo();
        return this.httpUrlConnection.getLastModified();
    }

    public OutputStream getOutputStream() throws IOException {
        try {
            OutputStream outputStream = this.httpUrlConnection.getOutputStream();
            return outputStream != null ? new InstrHttpOutputStream(outputStream, this.networkMetricBuilder, this.timer) : outputStream;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    public Permission getPermission() throws IOException {
        try {
            return this.httpUrlConnection.getPermission();
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    public int getReadTimeout() {
        return this.httpUrlConnection.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.httpUrlConnection.getRequestMethod();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.httpUrlConnection.getRequestProperties();
    }

    public String getRequestProperty(String str) {
        return this.httpUrlConnection.getRequestProperty(str);
    }

    public int getResponseCode() throws IOException {
        updateRequestInfo();
        if (this.timeToResponseInitiatedInMicros == -1) {
            long durationMicros = this.timer.getDurationMicros();
            this.timeToResponseInitiatedInMicros = durationMicros;
            this.networkMetricBuilder.setTimeToResponseInitiatedMicros(durationMicros);
        }
        try {
            int responseCode = this.httpUrlConnection.getResponseCode();
            this.networkMetricBuilder.setHttpResponseCode(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    public String getResponseMessage() throws IOException {
        updateRequestInfo();
        if (this.timeToResponseInitiatedInMicros == -1) {
            long durationMicros = this.timer.getDurationMicros();
            this.timeToResponseInitiatedInMicros = durationMicros;
            this.networkMetricBuilder.setTimeToResponseInitiatedMicros(durationMicros);
        }
        try {
            String responseMessage = this.httpUrlConnection.getResponseMessage();
            this.networkMetricBuilder.setHttpResponseCode(this.httpUrlConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    public URL getURL() {
        return this.httpUrlConnection.getURL();
    }

    public boolean getUseCaches() {
        return this.httpUrlConnection.getUseCaches();
    }

    public int hashCode() {
        return this.httpUrlConnection.hashCode();
    }

    public void setAllowUserInteraction(boolean z3) {
        this.httpUrlConnection.setAllowUserInteraction(z3);
    }

    public void setChunkedStreamingMode(int i7) {
        this.httpUrlConnection.setChunkedStreamingMode(i7);
    }

    public void setConnectTimeout(int i7) {
        this.httpUrlConnection.setConnectTimeout(i7);
    }

    public void setDefaultUseCaches(boolean z3) {
        this.httpUrlConnection.setDefaultUseCaches(z3);
    }

    public void setDoInput(boolean z3) {
        this.httpUrlConnection.setDoInput(z3);
    }

    public void setDoOutput(boolean z3) {
        this.httpUrlConnection.setDoOutput(z3);
    }

    public void setFixedLengthStreamingMode(int i7) {
        this.httpUrlConnection.setFixedLengthStreamingMode(i7);
    }

    public void setIfModifiedSince(long j6) {
        this.httpUrlConnection.setIfModifiedSince(j6);
    }

    public void setInstanceFollowRedirects(boolean z3) {
        this.httpUrlConnection.setInstanceFollowRedirects(z3);
    }

    public void setReadTimeout(int i7) {
        this.httpUrlConnection.setReadTimeout(i7);
    }

    public void setRequestMethod(String str) throws ProtocolException {
        this.httpUrlConnection.setRequestMethod(str);
    }

    public void setRequestProperty(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.networkMetricBuilder.setUserAgent(str2);
        }
        this.httpUrlConnection.setRequestProperty(str, str2);
    }

    public void setUseCaches(boolean z3) {
        this.httpUrlConnection.setUseCaches(z3);
    }

    public String toString() {
        return this.httpUrlConnection.toString();
    }

    public boolean usingProxy() {
        return this.httpUrlConnection.usingProxy();
    }

    public void setFixedLengthStreamingMode(long j6) {
        this.httpUrlConnection.setFixedLengthStreamingMode(j6);
    }

    public String getHeaderField(String str) {
        updateRequestInfo();
        return this.httpUrlConnection.getHeaderField(str);
    }

    public Object getContent(Class[] clsArr) throws IOException {
        updateRequestInfo();
        this.networkMetricBuilder.setHttpResponseCode(this.httpUrlConnection.getResponseCode());
        try {
            Object content = this.httpUrlConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                this.networkMetricBuilder.setResponseContentType(this.httpUrlConnection.getContentType());
                return new InstrHttpInputStream((InputStream) content, this.networkMetricBuilder, this.timer);
            }
            this.networkMetricBuilder.setResponseContentType(this.httpUrlConnection.getContentType());
            this.networkMetricBuilder.setResponsePayloadBytes(this.httpUrlConnection.getContentLength());
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            this.networkMetricBuilder.build();
            return content;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }
}
