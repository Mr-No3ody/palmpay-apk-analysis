package Ha;

import com.transsnet.palmpay.core.ui.dialog.UssdDialingDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UssdDialingDialog f3785b;

    public /* synthetic */ j(UssdDialingDialog ussdDialingDialog, int i7) {
        this.f3784a = i7;
        this.f3785b = ussdDialingDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3784a) {
            case 0:
                return UssdDialingDialog.startCountdown$lambda$3(this.f3785b);
            case 1:
                return UssdDialingDialog.tv_second_delegate$lambda$0(this.f3785b);
            default:
                return UssdDialingDialog.cpi_countdown_delegate$lambda$1(this.f3785b);
        }
    }
}
