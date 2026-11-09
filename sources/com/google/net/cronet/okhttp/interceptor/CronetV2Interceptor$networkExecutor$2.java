package com.google.net.cronet.okhttp.interceptor;

import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadPoolExecutor;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class CronetV2Interceptor$networkExecutor$2 extends o implements Function0<ThreadPoolExecutor> {
    public static final CronetV2Interceptor$networkExecutor$2 INSTANCE = new CronetV2Interceptor$networkExecutor$2();

    public CronetV2Interceptor$networkExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ThreadPoolExecutor invoke() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        return new ShadowThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 30L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), "\u200bcom.google.net.cronet.okhttp.interceptor.CronetV2Interceptor$networkExecutor$2", true);
    }
}
