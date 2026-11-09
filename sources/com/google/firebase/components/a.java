package com.google.firebase.components;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22899b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f22898a = i7;
        this.f22899b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f22898a) {
            case 0:
                return Component.lambda$of$2(this.f22899b, componentContainer);
            case 1:
                return Component.lambda$intoSet$4(this.f22899b, componentContainer);
            case 2:
                return Component.lambda$intoSet$3(this.f22899b, componentContainer);
            case 3:
                return Component.lambda$of$0(this.f22899b, componentContainer);
            default:
                return Component.lambda$of$1(this.f22899b, componentContainer);
        }
    }
}
