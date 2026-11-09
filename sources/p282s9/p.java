package p282s9;

import com.transsnet.palmpay.betting.ui.activity.BettingWithdrawHomeActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingWithdrawHomeActivity f42094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(BettingWithdrawHomeActivity bettingWithdrawHomeActivity, int i7) {
        super(0);
        this.f42093a = i7;
        this.f42094b = bettingWithdrawHomeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f42093a) {
            case 0:
                return this.f42094b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f42094b.getViewModelStore();
            default:
                return this.f42094b.getDefaultViewModelCreationExtras();
        }
    }
}
