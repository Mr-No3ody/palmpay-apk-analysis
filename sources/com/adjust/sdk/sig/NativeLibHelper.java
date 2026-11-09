package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NativeLibHelper {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e10) {
            Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e10.getMessage());
        }
    }

    private final native void nOnResume();

    private final native byte[] nSign(Context context, Object obj, byte[] bArr, int i7);

    public final byte[] a(Context context, LinkedHashMap linkedHashMap, byte[] bArr, int i7) {
        return nSign(context, linkedHashMap, bArr, i7);
    }

    public final void a() {
        nOnResume();
    }
}
