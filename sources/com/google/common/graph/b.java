package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22821b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f22820a = i7;
        this.f22821b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f22820a) {
            case 0:
                return DirectedGraphConnections.lambda$incidentEdgeIterator$0(this.f22821b, obj);
            case 1:
                return EndpointPair.ordered(this.f22821b, obj);
            case 2:
                return DirectedGraphConnections.lambda$incidentEdgeIterator$2(this.f22821b, (DirectedGraphConnections.NodeConnection) obj);
            default:
                return EndpointPair.unordered(this.f22821b, obj);
        }
    }
}
