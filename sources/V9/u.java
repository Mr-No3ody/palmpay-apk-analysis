package V9;

import W9.C0726g;
import android.text.TextUtils;
import com.transsnet.palmpay.contacts.ui.activity.FindInviteFriendsActivity;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FindInviteFriendsActivity f10222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FindInviteFriendsActivity f10223c;

    public /* synthetic */ u(FindInviteFriendsActivity findInviteFriendsActivity, FindInviteFriendsActivity findInviteFriendsActivity2, int i7) {
        this.f10221a = i7;
        this.f10222b = findInviteFriendsActivity;
        this.f10223c = findInviteFriendsActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10221a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                FindInviteFriendsActivity findInviteFriendsActivity = this.f10222b;
                if (z3) {
                    findInviteFriendsActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    findInviteFriendsActivity.showLoadingDialog(false, true);
                    ArrayList arrayList = (ArrayList) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    FindInviteFriendsActivity findInviteFriendsActivity2 = this.f10223c;
                    ArrayList arrayList2 = findInviteFriendsActivity2.f27215e;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    C0726g c0726g = findInviteFriendsActivity2.f27213c;
                    if (c0726g != null) {
                        c0726g.b();
                    }
                    C0726g c0726g2 = findInviteFriendsActivity2.f27213c;
                    if (c0726g2 != null) {
                        c0726g2.a(arrayList);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    findInviteFriendsActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    findInviteFriendsActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                FindInviteFriendsActivity findInviteFriendsActivity3 = this.f10222b;
                if (z8) {
                    findInviteFriendsActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    findInviteFriendsActivity3.showLoadingDialog(false, true);
                    CommonStringResult commonStringResult = (CommonStringResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (!TextUtils.isEmpty(commonStringResult.data)) {
                        int i7 = R9.f.ct_share_to_invite_s;
                        FindInviteFriendsActivity findInviteFriendsActivity4 = this.f10223c;
                        com.facebook.imagepipeline.nativecode.b.D(findInviteFriendsActivity4, findInviteFriendsActivity4.getString(i7, findInviteFriendsActivity4.f27216f, commonStringResult.data));
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    findInviteFriendsActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    findInviteFriendsActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                }
                return Unit.f38893a;
        }
    }
}
