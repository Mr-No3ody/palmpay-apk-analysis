package okhttp3;

import com.transsnet.palmpay.aidl.MsgEvent;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: okhttp3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1947o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1946n f40951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Gb.Q f40952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f40953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1947o f40954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1947o f40955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1947o f40956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1947o f40957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1947o f40958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1947o f40959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1947o f40960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1947o f40961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1947o f40962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1947o f40963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1947o f40964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1947o f40965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1947o f40966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1947o f40967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1947o f40968s;
    public static final C1947o t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40969a;

    static {
        C1946n c1946n = new C1946n(null);
        f40951b = c1946n;
        f40952c = new Gb.Q(14);
        f40953d = new LinkedHashMap();
        c1946n.init("SSL_RSA_WITH_NULL_MD5", 1);
        c1946n.init("SSL_RSA_WITH_NULL_SHA", 2);
        c1946n.init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        c1946n.init("SSL_RSA_WITH_RC4_128_MD5", 4);
        c1946n.init("SSL_RSA_WITH_RC4_128_SHA", 5);
        c1946n.init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        c1946n.init("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f40954e = c1946n.init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        c1946n.init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        c1946n.init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        c1946n.init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        c1946n.init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        c1946n.init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        c1946n.init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        c1946n.init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        c1946n.init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        c1946n.init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        c1946n.init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        c1946n.init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        c1946n.init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        c1946n.init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        c1946n.init("TLS_KRB5_WITH_RC4_128_SHA", 32);
        c1946n.init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        c1946n.init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        c1946n.init("TLS_KRB5_WITH_RC4_128_MD5", 36);
        c1946n.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        c1946n.init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        c1946n.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        c1946n.init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f40955f = c1946n.init("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        c1946n.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        c1946n.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        c1946n.init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f40956g = c1946n.init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        c1946n.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        c1946n.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        c1946n.init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        c1946n.init("TLS_RSA_WITH_NULL_SHA256", 59);
        c1946n.init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        c1946n.init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        c1946n.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        c1946n.init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        c1946n.init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        c1946n.init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        c1946n.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", MsgEvent.MSG_EVENT_STOP_FOREGROUND);
        c1946n.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        c1946n.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        c1946n.init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        c1946n.init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        c1946n.init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        c1946n.init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        c1946n.init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        c1946n.init("TLS_PSK_WITH_RC4_128_SHA", 138);
        c1946n.init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        c1946n.init("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        c1946n.init("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        c1946n.init("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f40957h = c1946n.init("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f40958i = c1946n.init("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        c1946n.init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        c1946n.init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        c1946n.init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        c1946n.init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        c1946n.init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        c1946n.init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        c1946n.init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        c1946n.init("TLS_FALLBACK_SCSV", 22016);
        c1946n.init("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        c1946n.init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        c1946n.init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        c1946n.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        c1946n.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        c1946n.init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        c1946n.init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        c1946n.init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        c1946n.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        c1946n.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        c1946n.init("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        c1946n.init("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        c1946n.init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        c1946n.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        c1946n.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        c1946n.init("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        c1946n.init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        c1946n.init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f40959j = c1946n.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f40960k = c1946n.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        c1946n.init("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        c1946n.init("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        c1946n.init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        c1946n.init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        c1946n.init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        c1946n.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        c1946n.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        c1946n.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        c1946n.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        c1946n.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        c1946n.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        c1946n.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        c1946n.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f40961l = c1946n.init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f40962m = c1946n.init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        c1946n.init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        c1946n.init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f40963n = c1946n.init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f40964o = c1946n.init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        c1946n.init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        c1946n.init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        c1946n.init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        c1946n.init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f40965p = c1946n.init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f40966q = c1946n.init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        c1946n.init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        c1946n.init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f40967r = c1946n.init("TLS_AES_128_GCM_SHA256", 4865);
        f40968s = c1946n.init("TLS_AES_256_GCM_SHA384", 4866);
        t = c1946n.init("TLS_CHACHA20_POLY1305_SHA256", 4867);
        c1946n.init("TLS_AES_128_CCM_SHA256", 4868);
        c1946n.init("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public C1947o(String str) {
        this.f40969a = str;
    }

    public final String toString() {
        return this.f40969a;
    }
}
