package p068ec;

import android.text.TextUtils;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.viewmodel.DataBundleRecordHistoryViewModel;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.teller.bean.DataBundleExtraItemInfo;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p025ba.k;
import p130ic.C;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36271c;

    public /* synthetic */ m(l lVar, BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        this.f36269a = i7;
        this.f36270b = lVar;
        this.f36271c = buyBundleHomePageActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36271c;
        l lVar = this.f36270b;
        switch (this.f36269a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        Function0 function0 = (Function0) lVar.f27356m;
                        if (((CommonResult) ((p) it).f27360a).isSuccess()) {
                            KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                            ((DataBundleRecordHistoryViewModel) buyBundleHomePageActivity.f31760v.getValue()).d();
                            if (function0 != null) {
                                function0.invoke();
                            }
                            ToastUtils.showLong(k.core_delete_successfully);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof n)) {
                            throw new p355xf.l();
                        }
                        ((n) it).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        Object obj2 = lVar.f27356m;
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                        String str = (String) obj2;
                        if (commonBeanResult.isSuccess() && commonBeanResult.data != 0 && !TextUtils.isEmpty(str)) {
                            C c6 = (C) buyBundleHomePageActivity.f31755p.getValue();
                            Intrinsics.e(str);
                            T t = commonBeanResult.data;
                            Intrinsics.e(t);
                            c6.e(str, (DataBundleExtraItemInfo) t);
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof n)) {
                            throw new p355xf.l();
                        }
                        ((n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
