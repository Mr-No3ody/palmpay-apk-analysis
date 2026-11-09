package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Network f22823b;

    public /* synthetic */ c(Network network, int i7) {
        this.f22822a = i7;
        this.f22823b = network;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f22822a) {
            case 0:
                return ImmutableNetwork.lambda$sourceNodeFn$0(this.f22823b, obj);
            default:
                return ImmutableNetwork.lambda$targetNodeFn$1(this.f22823b, obj);
        }
    }
}
