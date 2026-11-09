package p220oa;

import Z4.e;
import com.transsnet.palmpay.core.base.IBaseSubscription;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f40251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IBaseView f40252g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f40253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f40254j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f40255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ IBaseSubscription f40256p;

    public d(boolean z3, IBaseView iBaseView, Function1 function1, boolean z8, Function1 function2, IBaseSubscription iBaseSubscription) {
        this.f40251f = z3;
        this.f40252g = iBaseView;
        this.f40253i = function1;
        this.f40254j = z8;
        this.f40255o = function2;
        this.f40256p = iBaseSubscription;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f40256p.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String str) {
        IBaseView iBaseView;
        if (this.f40251f && (iBaseView = this.f40252g) != null) {
            iBaseView.showLoadingDialog(false);
        }
        if (this.f40254j) {
            ToastUtils.showLong(str, new Object[0]);
        }
        this.f40255o.invoke(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        IBaseView iBaseView;
        if (this.f40251f && (iBaseView = this.f40252g) != null) {
            iBaseView.showLoadingDialog(false);
        }
        if (obj instanceof CommonResult) {
            CommonResult commonResult = (CommonResult) obj;
            boolean zIsSuccess = commonResult.isSuccess();
            Function1 function1 = this.f40253i;
            if (zIsSuccess) {
                function1.invoke(obj);
            } else if (this.f40254j) {
                ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
            } else {
                function1.invoke(obj);
            }
        }
    }
}
