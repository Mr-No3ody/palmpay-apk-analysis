package La;

import com.transsnet.palmpay.core.bean.rsp.BindActionRsp;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f5585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BindActionRsp f5586g;

    public k(l lVar, BindActionRsp bindActionRsp) {
        this.f5585f = lVar;
        this.f5586g = bindActionRsp;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f5585f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        l lVar = this.f5585f;
        AddNewCardContract$IView addNewCardContract$IView = (AddNewCardContract$IView) lVar.f27351a;
        if (addNewCardContract$IView != null) {
            addNewCardContract$IView.showLoadingView(false);
        }
        ToastUtils.showLong(message, new Object[0]);
        AddNewCardContract$IView addNewCardContract$IView2 = (AddNewCardContract$IView) lVar.f27351a;
        if (addNewCardContract$IView2 != null) {
            addNewCardContract$IView2.handleBindResult(this.f5586g);
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        User response = (User) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        l lVar = this.f5585f;
        AddNewCardContract$IView addNewCardContract$IView = (AddNewCardContract$IView) lVar.f27351a;
        if (addNewCardContract$IView != null) {
            addNewCardContract$IView.showLoadingView(false);
        }
        AddNewCardContract$IView addNewCardContract$IView2 = (AddNewCardContract$IView) lVar.f27351a;
        if (addNewCardContract$IView2 != null) {
            addNewCardContract$IView2.handleBindResult(this.f5586g);
        }
    }
}
