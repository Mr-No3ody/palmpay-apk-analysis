package okhttp3;

/* JADX INFO: loaded from: classes4.dex */
public enum W {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f40671b = new V(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40679a;

    W(String str) {
        this.f40679a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f40679a;
    }
}
