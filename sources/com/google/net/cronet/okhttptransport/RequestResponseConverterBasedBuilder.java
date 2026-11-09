package com.google.net.cronet.okhttptransport;

import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.base.Preconditions;
import com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder;
import org.chromium.net.CronetEngine;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class RequestResponseConverterBasedBuilder<SubBuilderT extends RequestResponseConverterBasedBuilder<?, ? extends ObjectBeingBuiltT>, ObjectBeingBuiltT> {
    private static final int DEFAULT_THREAD_POOL_SIZE = 4;
    private final SubBuilderT castedThis;
    private final CronetEngine cronetEngine;
    private int uploadDataProviderExecutorSize = 4;
    private RedirectStrategy redirectStrategy = null;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestResponseConverterBasedBuilder(CronetEngine cronetEngine, Class<SubBuilderT> cls) {
        this.cronetEngine = (CronetEngine) Preconditions.checkNotNull(cronetEngine);
        Preconditions.checkArgument(getClass().equals(cls));
        this.castedThis = this;
    }

    public ObjectBeingBuiltT build() {
        if (this.redirectStrategy == null) {
            this.redirectStrategy = RedirectStrategy.defaultStrategy();
        }
        return build(new RequestResponseConverter(this.cronetEngine, ShadowExecutors.newOptimizedFixedThreadPool(this.uploadDataProviderExecutorSize, "\u200bcom.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder"), RequestBodyConverterImpl.create(ShadowExecutors.newOptimizedCachedThreadPool("\u200bcom.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder")), new ResponseConverter(), this.redirectStrategy));
    }

    public abstract ObjectBeingBuiltT build(RequestResponseConverter requestResponseConverter);

    public final SubBuilderT setRedirectStrategy(RedirectStrategy redirectStrategy) {
        Preconditions.checkNotNull(redirectStrategy);
        this.redirectStrategy = redirectStrategy;
        return this.castedThis;
    }

    public final SubBuilderT setUploadDataProviderExecutorSize(int i7) {
        Preconditions.checkArgument(i7 > 0, "The number of threads must be positive!");
        this.uploadDataProviderExecutorSize = i7;
        return this.castedThis;
    }
}
