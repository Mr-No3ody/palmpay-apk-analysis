package Vb;

import Pa.r0;
import android.view.View;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f10298b;

    public /* synthetic */ j(int i7, View.OnClickListener onClickListener) {
        this.f10297a = i7;
        this.f10298b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f10298b;
        switch (this.f10297a) {
            case 0:
                int i7 = OrderResultAmountStyle1.f31593d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 1:
                int i10 = OrderResultItemModel.f31624w;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            default:
                if (!r0.U0() && onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
        }
    }
}
