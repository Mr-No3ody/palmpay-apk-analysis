package p068ec;

import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36274b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        super(0);
        this.f36273a = i7;
        this.f36274b = buyBundleHomePageActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36273a) {
            case 0:
                return this.f36274b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f36274b.getViewModelStore();
            case 2:
                return this.f36274b.getDefaultViewModelCreationExtras();
            case 3:
                return this.f36274b.getDefaultViewModelProviderFactory();
            case 4:
                return this.f36274b.getViewModelStore();
            case 5:
                return this.f36274b.getDefaultViewModelCreationExtras();
            case 6:
                return this.f36274b.getDefaultViewModelProviderFactory();
            case 7:
                return this.f36274b.getViewModelStore();
            case 8:
                return this.f36274b.getDefaultViewModelCreationExtras();
            case 9:
                return this.f36274b.getDefaultViewModelProviderFactory();
            case 10:
                return this.f36274b.getViewModelStore();
            case 11:
                return this.f36274b.getDefaultViewModelCreationExtras();
            case 12:
                return this.f36274b.getDefaultViewModelProviderFactory();
            case 13:
                return this.f36274b.getViewModelStore();
            default:
                return this.f36274b.getDefaultViewModelCreationExtras();
        }
    }
}
