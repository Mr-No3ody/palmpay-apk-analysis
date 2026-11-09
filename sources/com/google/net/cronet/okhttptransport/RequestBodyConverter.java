package com.google.net.cronet.okhttptransport;

import java.io.IOException;
import okhttp3.c0;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: loaded from: classes3.dex */
interface RequestBodyConverter {
    UploadDataProvider convertRequestBody(c0 c0Var, int i7) throws IOException;
}
