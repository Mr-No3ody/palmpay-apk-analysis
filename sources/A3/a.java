package A3;

import com.facebook.react.DebugCorePackage;
import com.facebook.react.shell.MainReactPackage;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;

    public /* synthetic */ a(int i7) {
        this.f35a = i7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f35a) {
            case 0:
                return MainReactPackage.viewManagersMap$lambda$2();
            case 1:
                return MainReactPackage.viewManagersMap$lambda$3();
            case 2:
                return MainReactPackage.viewManagersMap$lambda$4();
            case 3:
                return MainReactPackage.viewManagersMap$lambda$5();
            case 4:
                return MainReactPackage.viewManagersMap$lambda$6();
            case 5:
                return MainReactPackage.viewManagersMap$lambda$7();
            case 6:
                return MainReactPackage.viewManagersMap$lambda$8();
            case 7:
                return MainReactPackage.viewManagersMap$lambda$9();
            case 8:
                return MainReactPackage.viewManagersMap$lambda$0();
            case 9:
                return MainReactPackage.viewManagersMap$lambda$10();
            case 10:
                return MainReactPackage.viewManagersMap$lambda$11();
            case 11:
                return MainReactPackage.viewManagersMap$lambda$12();
            case 12:
                return MainReactPackage.viewManagersMap$lambda$13();
            case 13:
                return MainReactPackage.viewManagersMap$lambda$14();
            case 14:
                return MainReactPackage.viewManagersMap$lambda$15();
            case 15:
                return MainReactPackage.viewManagersMap$lambda$16();
            case 16:
                return MainReactPackage.viewManagersMap$lambda$1();
            default:
                return DebugCorePackage.viewManagersMap_delegate$lambda$1$lambda$0();
        }
    }
}
