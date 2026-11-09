package p282s9;

import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingHomeActivity f42079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f42080c;

    public /* synthetic */ h(BettingHomeActivity bettingHomeActivity, long j6, int i7) {
        this.f42078a = i7;
        this.f42079b = bettingHomeActivity;
        this.f42080c = j6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f42078a) {
            case 0:
                BettingHomeActivity.s(this.f42079b, this.f42080c);
                break;
            default:
                BettingHomeActivity.s(this.f42079b, this.f42080c);
                break;
        }
        return Unit.f38893a;
    }
}
