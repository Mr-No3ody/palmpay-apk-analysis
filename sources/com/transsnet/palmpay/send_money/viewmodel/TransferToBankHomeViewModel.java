package com.transsnet.palmpay.send_money.viewmodel;

import Kd.C0363b1;
import Kd.C0381h1;
import Kd.C0390k1;
import Kd.C0402o1;
import Kd.W0;
import Kd.X0;
import Kd.Y0;
import N8.q0;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.req.TransferToBankHomeRecipientsReq;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBankHomeViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankHomeViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/TransferToBankHomeViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,220:1\n85#2,13:221\n134#2,13:234\n134#2,13:247\n134#2,13:260\n134#2,13:273\n*S KotlinDebug\n*F\n+ 1 TransferToBankHomeViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/TransferToBankHomeViewModel\n*L\n40#1:221,13\n56#1:234,13\n68#1:247,13\n83#1:260,13\n98#1:273,13\n*E\n"})
public final class TransferToBankHomeViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34049g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f34051j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f34052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f34053p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f34054v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToBankHomeViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34047e = new l();
        this.f34048f = new l();
        this.f34049g = new l();
        this.f34050i = new l();
        this.f34051j = new l();
        this.f34052o = new l();
        this.f34053p = new l();
        this.t = new l();
        this.f34054v = new l();
    }

    public final void d(RecipientListResp.RecipientBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        W0 w3 = new W0(data, null);
        l lVar = this.t;
        lVar.f27356m = data;
        Unit unit = Unit.f38893a;
        f.v(this, w3, lVar, 0L);
    }

    public final void e() {
        f.s(this, new X0(1, null), this.f34051j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp] */
    public final void f(RecipientListResp.RecipientBean params) {
        Intrinsics.checkNotNullParameter(params, "params");
        l lVar = this.f34052o;
        lVar.f27356m = params;
        if (SPUtils.get().getBoolean("KEY_SHOW_FASTER_SEND_TO_PALMPAY_DIALOG", true)) {
            f.v(this, new Y0(params, null), lVar, 0L);
            return;
        }
        CommonBeanResult commonBeanResult = new CommonBeanResult();
        commonBeanResult.setRespCode("00000000");
        ?? bankAccountMemberInfoResp = new BankAccountMemberInfoResp();
        bankAccountMemberInfoResp.accountType = BankAccountMemberInfoResp.ACCOUNT_TYPE_OTHER;
        commonBeanResult.data = bankAccountMemberInfoResp;
        b.C(lVar, commonBeanResult);
    }

    public final void g() {
        TransferToBankHomeRecipientsReq transferToBankHomeRecipientsReq = new TransferToBankHomeRecipientsReq();
        transferToBankHomeRecipientsReq.pageNum = 200;
        transferToBankHomeRecipientsReq.pageSize = 1;
        AbstractC0780y.m(V.h(this), null, null, new C0363b1(this.f34048f, q0.y(a.d().i(), "_queryBeneficiaryAllList_", BaseApplication.getCountryLocale()), null, transferToBankHomeRecipientsReq), 3);
    }

    public final void h() {
        AbstractC0780y.m(V.h(this), null, null, new C0381h1(this.f34048f, q0.y(a.d().i(), "_queryHomeFavoriteList_", BaseApplication.getCountryLocale()), null), 3);
    }

    public final void i() {
        AbstractC0780y.m(V.h(this), null, null, new C0390k1(this.f34048f, q0.y(a.d().i(), "_queryHomeRecentlyList_", BaseApplication.getCountryLocale()), null), 3);
    }

    public final void j(Integer num, String str) {
        f.v(this, new C0402o1(str, null), this.f34054v, 0L);
    }
}
