package Wd;

import com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Wd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0728b extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseBillerActivity f10749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0728b(BaseBillerActivity baseBillerActivity, int i7) {
        super(0);
        this.f10748a = i7;
        this.f10749b = baseBillerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10748a) {
            case 0:
                return this.f10749b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f10749b.getViewModelStore();
            default:
                return this.f10749b.getDefaultViewModelCreationExtras();
        }
    }
}
