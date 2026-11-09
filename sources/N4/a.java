package N4;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6077b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f6076a = i7;
        this.f6077b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f6076a) {
            case 0:
                return FirebasePerfRegistrar.lambda$getComponents$0((Qualified) this.f6077b, componentContainer);
            default:
                return ((CrashlyticsRegistrar) this.f6077b).buildCrashlytics(componentContainer);
        }
    }
}
