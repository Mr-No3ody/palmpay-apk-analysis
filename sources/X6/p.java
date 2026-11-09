package X6;

import com.facebook.react.uimanager.ViewManagerRegistry;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11043b;

    public /* synthetic */ p(int i7, ArrayList arrayList) {
        this.f11042a = i7;
        this.f11043b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11042a) {
            case 0:
                return this.f11043b;
            case 1:
                return ViewManagerRegistry.invalidate$lambda$9(this.f11043b);
            default:
                return ViewManagerRegistry.onTrimMemory$lambda$12(this.f11043b);
        }
    }
}
