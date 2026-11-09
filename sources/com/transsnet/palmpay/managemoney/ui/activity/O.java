package com.transsnet.palmpay.managemoney.ui.activity;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.managemoney.bean.resp.GetStateInfoListResp;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectStateActivity f32138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectStateActivity f32139c;

    public /* synthetic */ O(SelectStateActivity selectStateActivity, SelectStateActivity selectStateActivity2, int i7) {
        this.f32137a = i7;
        this.f32138b = selectStateActivity;
        this.f32139c = selectStateActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32137a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                SelectStateActivity selectStateActivity = this.f32138b;
                if (z3) {
                    selectStateActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    selectStateActivity.showLoadingDialog(false, true);
                    this.f32139c.f32191g = ((GetStateInfoListResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    selectStateActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    selectStateActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                SelectStateActivity selectStateActivity2 = this.f32138b;
                if (z8) {
                    selectStateActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    selectStateActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonResult.isSuccess()) {
                        int i7 = Jc.f.mm_saved_successfully;
                        SelectStateActivity selectStateActivity3 = this.f32139c;
                        ToastUtils.showShort(selectStateActivity3.getString(i7), new Object[0]);
                        selectStateActivity3.m().postDelayed(new S(selectStateActivity3), 1500L);
                    } else if (!TextUtils.isEmpty(commonResult.getRespMsg())) {
                        ToastUtils.showShort(commonResult.getRespMsg(), new Object[0]);
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    selectStateActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    selectStateActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
