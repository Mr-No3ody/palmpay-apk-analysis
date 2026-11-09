package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22826c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f22824a = i7;
        this.f22826c = obj;
        this.f22825b = obj2;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f22824a) {
            case 0:
                return ImmutableNetwork.lambda$adjacentNodeFn$2((Network) this.f22826c, this.f22825b, obj);
            default:
                return ImmutableValueGraph.lambda$connectionsOf$0((ValueGraph) this.f22826c, this.f22825b, obj);
        }
    }
}
