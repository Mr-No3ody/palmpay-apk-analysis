package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.rnmaps.maps.MapModule;
import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1348m extends P {
    @Override // com.facebook.imagepipeline.producers.P
    public final p109h3.e b(com.facebook.imagepipeline.request.d dVar) {
        boolean zEquals;
        byte[] bytes;
        String string = dVar.getSourceUri().toString();
        if (!string.substring(0, 5).equals("data:")) {
            throw new IllegalArgumentException();
        }
        int iIndexOf = string.indexOf(44);
        String strSubstring = string.substring(iIndexOf + 1, string.length());
        String strSubstring2 = string.substring(0, iIndexOf);
        if (strSubstring2.contains(";")) {
            String[] strArrSplit = strSubstring2.split(";");
            zEquals = strArrSplit[strArrSplit.length - 1].equals(MapModule.SNAPSHOT_RESULT_BASE64);
        } else {
            zEquals = false;
        }
        if (zEquals) {
            bytes = Base64.decode(strSubstring, 0);
        } else {
            String strDecode = Uri.decode(strSubstring);
            strDecode.getClass();
            bytes = strDecode.getBytes();
        }
        return a(bytes.length, new ByteArrayInputStream(bytes));
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final String c() {
        return "DataFetchProducer";
    }
}
