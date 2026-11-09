package com.airbnb.lottie;

import android.content.Context;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import java.io.File;

/* JADX INFO: renamed from: com.airbnb.lottie.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1311c implements LottieNetworkCacheProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f19856a;

    @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
    public final File getCacheDir() {
        return new File(this.f19856a.getCacheDir(), "lottie_network_cache");
    }
}
