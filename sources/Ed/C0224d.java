package Ed;

import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ed.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0224d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankAccountBeneficiaryFragment f2364b;

    public /* synthetic */ C0224d(BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment, int i7) {
        this.f2363a = i7;
        this.f2364b = bankAccountBeneficiaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2363a) {
            case 0:
                this.f2364b.u().setList(Jd.c.h((List) obj));
                break;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                p220oa.h.y(this.f2364b, it);
                break;
        }
        return Unit.f38893a;
    }
}
