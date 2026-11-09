package org.chromium.net;

import N8.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ICronetEngineBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f41022d = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f41023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41024b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICronetEngineBuilder f41025c;

    public c(ICronetEngineBuilder iCronetEngineBuilder) {
        this.f41025c = iCronetEngineBuilder;
    }

    public static JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(q0.k("Failed adding a default object for key [", str, "]"), e10);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z3, Date date) {
        this.f41025c.addPublicKeyPins(str, set, z3, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i7, int i10) {
        this.f41025c.addQuicHint(str, i7, i10);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        JSONObject jSONObject = this.f41023a;
        ArrayList arrayList = this.f41024b;
        ICronetEngineBuilder iCronetEngineBuilder = this.f41025c;
        if (jSONObject == null && arrayList.isEmpty()) {
            return iCronetEngineBuilder.build();
        }
        if (this.f41023a == null) {
            this.f41023a = new JSONObject();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((ExperimentalOptionsTranslatingCronetEngineBuilder$ExperimentalOptionsPatch) it.next()).applyTo(this.f41023a);
            } catch (JSONException e10) {
                throw new IllegalStateException("Unable to apply JSON patch!", e10);
            }
        }
        iCronetEngineBuilder.setExperimentalOptions(this.f41023a.toString());
        return iCronetEngineBuilder.build();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z3) {
        this.f41025c.enableBrotli(z3);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z3) {
        this.f41025c.enableHttp2(z3);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i7, long j6) {
        this.f41025c.enableHttpCache(i7, j6);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z3) {
        this.f41025c.enableNetworkQualityEstimator(z3);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z3) {
        this.f41025c.enablePublicKeyPinningBypassForLocalTrustAnchors(z3);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z3) {
        this.f41025c.enableQuic(z3);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z3) {
        this.f41025c.enableSdch(z3);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.f41025c.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        return f41022d;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f41025c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(1)) {
            iCronetEngineBuilder.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }
        this.f41024b.add(new b(connectionMigrationOptions, 1));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setDnsOptions(DnsOptions dnsOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f41025c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(2)) {
            iCronetEngineBuilder.setDnsOptions(dnsOptions);
            return this;
        }
        this.f41024b.add(new b(dnsOptions, 0));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        if (str == null || str.isEmpty()) {
            this.f41023a = null;
            return this;
        }
        try {
            this.f41023a = new JSONObject(str);
            return this;
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Experimental options parsing failed", e10);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.f41025c.setLibraryLoader(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f41025c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(3)) {
            iCronetEngineBuilder.setQuicOptions(quicOptions);
            return this;
        }
        this.f41024b.add(new b(quicOptions, 2));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.f41025c.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i7) {
        this.f41025c.setThreadPriority(i7);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f41025c.setUserAgent(str);
        return this;
    }
}
