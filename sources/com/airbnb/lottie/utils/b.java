package com.airbnb.lottie.utils;

import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b implements LottieLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f20221a = new HashSet();

    @Override // com.airbnb.lottie.LottieLogger
    public final void debug(String str) {
    }

    @Override // com.airbnb.lottie.LottieLogger
    public final void error(String str, Throwable th) {
    }

    @Override // com.airbnb.lottie.LottieLogger
    public final void warning(String str) {
        warning(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public final void debug(String str, Throwable th) {
    }

    @Override // com.airbnb.lottie.LottieLogger
    public final void warning(String str, Throwable th) {
        HashSet hashSet = f20221a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }
}
