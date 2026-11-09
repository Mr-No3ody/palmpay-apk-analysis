package com.rnmaps.maps;

import com.facebook.react.bridge.Promise;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Promise f24956b;

    public /* synthetic */ n(int i7, Promise promise) {
        this.f24955a = i7;
        this.f24956b = promise;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f24955a) {
            case 0:
                return MapModule.lambda$getMapBoundaries$5(this.f24956b, (MapView) obj);
            default:
                return MapModule.lambda$getCamera$1(this.f24956b, (MapView) obj);
        }
    }
}
