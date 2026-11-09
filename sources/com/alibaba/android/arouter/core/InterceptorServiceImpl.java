package com.alibaba.android.arouter.core;

import Pa.C0505b;
import android.content.Context;
import androidx.core.provider.m;
import androidx.customview.widget.e;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.thread.CancelableCountDownLatch;
import com.alibaba.android.arouter.utils.MapUtils;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Route(path = "/arouter/service/interceptor")
public class InterceptorServiceImpl implements InterceptorService {
    private static boolean interceptorHasInit;
    private static final Object interceptorInitLock = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static void _execute(int i7, CancelableCountDownLatch cancelableCountDownLatch, Postcard postcard) {
        ArrayList arrayList = b.f20356f;
        if (i7 < arrayList.size()) {
            ((IInterceptor) arrayList.get(i7)).process(postcard, new C0505b(i7, cancelableCountDownLatch, postcard));
        }
    }

    private static void checkInterceptorsInitStatus() {
        synchronized (interceptorInitLock) {
            while (!interceptorHasInit) {
                try {
                    interceptorInitLock.wait(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                } catch (InterruptedException e10) {
                    throw new HandlerException("ARouter::Interceptor init cost too much time error! reason = [" + e10.getMessage() + "]");
                }
            }
        }
    }

    @Override // com.alibaba.android.arouter.facade.service.InterceptorService
    public void doInterceptions(Postcard postcard, InterceptorCallback interceptorCallback) {
        if (!MapUtils.isNotEmpty(b.f20355e)) {
            interceptorCallback.onContinue(postcard);
            return;
        }
        checkInterceptorsInitStatus();
        if (interceptorHasInit) {
            LogisticsCenter.executor.execute(new m(4, postcard, interceptorCallback));
        } else {
            interceptorCallback.onInterrupt(new HandlerException("Interceptors initialization takes too much time."));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        LogisticsCenter.executor.execute(new e(context, 9));
    }
}
