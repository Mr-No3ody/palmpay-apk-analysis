package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Signer implements ISigner {
    public static final t2 Companion = new t2();
    public static final String EXCEPTION_MSG_SDK4 = "This version of Adjust Signature is not compatible with Adjust SDK v4. Please upgrade to SDK v5.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f19415c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeLibHelper f19416a = new NativeLibHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f19417b = new t1();

    @Override // com.adjust.sdk.sig.ISigner
    public synchronized void onResume() {
        try {
            if (f19415c) {
                throw new IllegalStateException("sign: Library received error, it has locked down");
            }
            this.f19416a.a();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "sign: Incorrect library state";
            }
            Log.e("Signer", message);
        } catch (Exception e11) {
            Log.e("Signer", "sign: Unhandled exception: " + e11.getMessage());
        }
    }

    @Override // com.adjust.sdk.sig.ISigner
    public void sign(Context context, Map<String, String> map, String str, String str2) {
        Log.e("Signer", EXCEPTION_MSG_SDK4);
        throw new UnsupportedOperationException(EXCEPTION_MSG_SDK4);
    }

    @Override // com.adjust.sdk.sig.ISigner
    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        try {
            try {
                try {
                    try {
                        if (f19415c) {
                            throw new IllegalStateException("sign: Library received error, it has locked down");
                        }
                        if (context != null) {
                            t1 t1Var = this.f19417b;
                            NativeLibHelper nativeLibHelper = this.f19416a;
                            if (map == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (map2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (map3 != null) {
                                new u2(context, t1Var, nativeLibHelper, map, map2, k3.a(map3)).a();
                                return;
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    } catch (Exception e10) {
                        Log.e("Signer", "sign: Unhandled exception: " + e10.getMessage());
                    }
                } catch (b2 e11) {
                    f19415c = true;
                    String message = e11.getMessage();
                    if (message == null) {
                        message = "sign: Library received error, it has locked down";
                    }
                    Log.e("Signer", message);
                }
            } catch (IllegalStateException e12) {
                String message2 = e12.getMessage();
                if (message2 == null) {
                    message2 = "sign: Incorrect library state";
                }
                Log.e("Signer", message2);
            }
        } catch (IllegalArgumentException e13) {
            String message3 = e13.getMessage();
            if (message3 == null) {
                message3 = "sign: Required parameter is null";
            }
            Log.e("Signer", message3);
        }
    }
}
