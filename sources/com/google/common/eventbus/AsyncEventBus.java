package com.google.common.eventbus;

import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(String str, Executor executor) {
        super(str, executor, Dispatcher.legacyAsync(), EventBus.LoggingHandler.INSTANCE);
    }

    public AsyncEventBus(Executor executor, SubscriberExceptionHandler subscriberExceptionHandler) {
        super(GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, executor, Dispatcher.legacyAsync(), subscriberExceptionHandler);
    }

    public AsyncEventBus(Executor executor) {
        super(GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, executor, Dispatcher.legacyAsync(), EventBus.LoggingHandler.INSTANCE);
    }
}
