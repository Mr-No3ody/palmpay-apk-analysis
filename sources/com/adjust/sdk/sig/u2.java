package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f19507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NativeLibHelper f19508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f19509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f19510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f19511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x1 f19512g;

    public u2(Context context, t1 t1Var, NativeLibHelper nativeLibHelper, Map map, Map map2, Map map3) {
        this.f19506a = context;
        this.f19507b = t1Var;
        this.f19508c = nativeLibHelper;
        this.f19509d = map;
        this.f19510e = map2;
        this.f19511f = map3;
        if (map.isEmpty()) {
            throw new IllegalArgumentException("sign: Empty input parameters");
        }
        this.f19512g = new x1(map);
    }

    public final void a() throws Exception {
        byte[] bArrA;
        this.f19512g.a("Signature execution begin: ");
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f19509d);
        f fVar = new f(new String[]{"activity_kind", "client_sdk"});
        while (fVar.hasNext()) {
            String str = (String) fVar.next();
            Object obj = this.f19510e.get(str);
            if (obj == null) {
                throw new IllegalArgumentException(N8.q0.k("sign: ", str, " is null").toString());
            }
            linkedHashMap.put(str, obj);
        }
        if (!"b".equals(this.f19510e.get("a"))) {
            linkedHashMap.put("adj_verification", o3.a(new a0()));
            this.f19512g.a("Signing all the parameters begin: ");
            Context context = this.f19506a;
            d1 d1Var = this.f19507b;
            int i7 = 2;
            while (true) {
                if (i7 <= 0) {
                    bArrA = null;
                    break;
                }
                try {
                    t1 t1Var = (t1) d1Var;
                    t1Var.b(context);
                    bArrA = t1Var.a(context, d3.a(linkedHashMap.toString()));
                    break;
                } catch (s1 unused) {
                    throw new b2("sign: API is less than JellyBean-4-18");
                } catch (Exception e10) {
                    if (!(e10 instanceof UnrecoverableKeyException) && !(e10 instanceof InvalidKeyException)) {
                        Log.e("SignerInstance", "sign: Received an Exception: " + e10.getMessage(), e10);
                        throw e10;
                    }
                    Log.e("SignerInstance", "sign: Received a retriable exception: " + e10.getMessage(), e10);
                    Log.e("SignerInstance", "sign: Attempting retry #" + i7);
                    i7 += -1;
                    ((t1) d1Var).a(context);
                }
            }
            if (i7 == 0) {
                throw new b2("sign: Reached maximum retries");
            }
            this.f19512g.a("Calling native begin: ");
            byte[] bArrA2 = this.f19508c.a(this.f19506a, linkedHashMap, bArrA, Build.VERSION.SDK_INT);
            this.f19512g.a("Calling native end: ");
            if (bArrA2 == null) {
                throw new IllegalArgumentException("sign: Returned a null signature. Exiting...");
            }
            this.f19512g.a("Signing all the parameters end: ");
            try {
                this.f19511f.put("authorization", a(linkedHashMap, bArrA2));
            } catch (Exception e11) {
                Log.e("SignerInstance", "sign: Signature generation failed. Exiting...", e11);
                throw e11;
            }
        }
        this.f19511f.putAll(this.f19509d);
        f fVar2 = new f(new String[]{"network_payload", "endpoint"});
        while (fVar2.hasNext()) {
            String str2 = (String) fVar2.next();
            String str3 = (String) this.f19510e.get(str2);
            if (str3 != null) {
                this.f19511f.put(str2, str3);
            }
        }
        this.f19512g.a("Signature execution end: ");
    }

    public static String a(LinkedHashMap linkedHashMap, byte[] bArr) {
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        Object obj = linkedHashMap.get("adj_signing_id");
        if (obj != null) {
            String str = (String) obj;
            Object obj2 = linkedHashMap.get("headers_id");
            if (obj2 != null) {
                String str2 = (String) obj2;
                Object obj3 = linkedHashMap.get("algorithm");
                if (obj3 != null) {
                    String str3 = (String) obj3;
                    Object obj4 = linkedHashMap.get("native_version");
                    if (obj4 != null) {
                        String str4 = (String) obj4;
                        Object obj5 = linkedHashMap.get("adj_verification");
                        if (obj5 != null) {
                            Locale locale = Locale.US;
                            return String.format(locale, "Signature %s,%s,%s,%s,%s,%s", Arrays.copyOf(new Object[]{String.format(locale, "%s=\"%s\"", Arrays.copyOf(new Object[]{"signature", strEncodeToString}, 2)), String.format(locale, "%s=\"%s\"", Arrays.copyOf(new Object[]{"adj_signing_id", str}, 2)), String.format(locale, "%s=\"%s\"", Arrays.copyOf(new Object[]{"algorithm", str3}, 2)), String.format(locale, "%s=\"%s\"", Arrays.copyOf(new Object[]{"headers_id", str2}, 2)), String.format(locale, "%s=\"%s\"", Arrays.copyOf(new Object[]{"native_version", str4}, 2)), String.format(locale, "%s=\"%s\"", Arrays.copyOf(new Object[]{"adj_verification", (String) obj5}, 2))}, 6));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
