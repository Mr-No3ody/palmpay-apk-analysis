package Hd;

import Pa.r0;
import android.view.View;
import com.transsnet.palmpay.send_money.ui.view.kkcar.KkCarQrView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KkCarQrView f3862b;

    public /* synthetic */ a(KkCarQrView kkCarQrView, int i7) {
        this.f3861a = i7;
        this.f3862b = kkCarQrView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function0 function0;
        Function0 function1;
        KkCarQrView kkCarQrView = this.f3862b;
        switch (this.f3861a) {
            case 0:
                int i7 = KkCarQrView.f33948o;
                if (!r0.U0() && (function0 = kkCarQrView.f33951c) != null) {
                    function0.invoke();
                }
                break;
            default:
                int i10 = KkCarQrView.f33948o;
                if (!r0.U0() && kkCarQrView.f33952d != 2 && (function1 = kkCarQrView.f33950b) != null) {
                    function1.invoke();
                }
                break;
        }
    }
}
