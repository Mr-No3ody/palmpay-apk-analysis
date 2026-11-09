package com.bumptech.glide.load.data;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
interface HttpUrlFetcher$HttpUrlConnectionFactory {
    HttpURLConnection build(URL url) throws IOException;
}
