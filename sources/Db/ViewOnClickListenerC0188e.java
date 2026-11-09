package Db;

import android.view.View;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.credit.ui.viewmodel.FlexiCashUnfreezeItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Db.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0188e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Balloon f1804b;

    public /* synthetic */ ViewOnClickListenerC0188e(Balloon balloon, int i7) {
        this.f1803a = i7;
        this.f1804b = balloon;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Balloon this$0 = this.f1804b;
        switch (this.f1803a) {
            case 0:
                int i7 = FlexiCashUnfreezeItem.f30673v;
                this$0.f();
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f25223b.f3073L) {
                    this$0.f();
                }
                break;
        }
    }
}
