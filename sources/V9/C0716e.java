package V9;

import Pa.r0;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.transsnet.palmpay.contacts.bean.req.AddRelationShipReq;
import com.transsnet.palmpay.contacts.bean.resp.CheckUserByNumberRsp;
import com.transsnet.palmpay.contacts.bean.resp.QueryRelationShipResp;
import com.transsnet.palmpay.contacts.ui.activity.AddNewFaveActivity;
import com.transsnet.palmpay.contacts.ui.dialog.AddLinkFaveNotPPUserDialog;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: V9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0716e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddNewFaveActivity f10196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddNewFaveActivity f10197c;

    public /* synthetic */ C0716e(AddNewFaveActivity addNewFaveActivity, AddNewFaveActivity addNewFaveActivity2, int i7) {
        this.f10195a = i7;
        this.f10196b = addNewFaveActivity;
        this.f10197c = addNewFaveActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Editable text;
        Editable text2;
        AddNewFaveActivity addNewFaveActivity = this.f10197c;
        AddNewFaveActivity addNewFaveActivity2 = this.f10196b;
        switch (this.f10195a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    addNewFaveActivity2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    AddNewFaveActivity.m(addNewFaveActivity, (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a);
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    addNewFaveActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    AddNewFaveActivity.m(addNewFaveActivity, (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    addNewFaveActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        QueryRelationShipResp queryRelationShipResp = (QueryRelationShipResp) commonBeanResult.data;
                        if (queryRelationShipResp != null) {
                            Bc.i iVar = addNewFaveActivity.f27145j;
                            if (iVar != null) {
                                ((EditText) iVar.f726d).setText(queryRelationShipResp.uniqueName);
                            }
                            Bc.i iVar2 = addNewFaveActivity.f27145j;
                            if (iVar2 != null) {
                                ((EditText) iVar2.f727e).setText(queryRelationShipResp.remark);
                            }
                            int iQ = r0.q(queryRelationShipResp.relationship);
                            if (addNewFaveActivity.f27139c != iQ) {
                                addNewFaveActivity.o(false);
                                addNewFaveActivity.f27139c = iQ;
                                addNewFaveActivity.o(true);
                            }
                        }
                    } else {
                        p220oa.h.x(addNewFaveActivity, commonBeanResult.getRespMsg());
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it3).getClass();
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof com.transsnet.palmpay.core.base.o) {
                    addNewFaveActivity2.showLoadingDialog(true, true);
                } else if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                    if (commonBeanResult2.isSuccess()) {
                        QueryRelationShipResp queryRelationShipResp2 = (QueryRelationShipResp) commonBeanResult2.data;
                        if (queryRelationShipResp2 == null || (str = queryRelationShipResp2.relationship) == null) {
                            str = "";
                        }
                        Intrinsics.checkNotNullParameter(str, "<set-?>");
                        addNewFaveActivity.f27144i = str;
                    } else {
                        p220oa.h.x(addNewFaveActivity, commonBeanResult2.getRespMsg());
                    }
                } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it4).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5 instanceof com.transsnet.palmpay.core.base.o) {
                    addNewFaveActivity2.showLoadingDialog(true, true);
                } else if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                    if (!commonBeanResult3.isSuccess()) {
                        p220oa.h.x(addNewFaveActivity, commonBeanResult3.getRespMsg());
                    } else if (((CheckUserByNumberRsp) commonBeanResult3.data).memberUser) {
                        int i7 = AddNewFaveActivity.f27138o;
                        String strN = addNewFaveActivity.n();
                        String phoneNumber = BaseApplication.get().getUser().getPhoneNumber();
                        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber(...)");
                        if (StringsKt.A(phoneNumber, strN, false)) {
                            ToastUtils.showLong(addNewFaveActivity.getString(R9.f.ct_cannot_bind_self), new Object[0]);
                        } else if (TextUtils.isEmpty(addNewFaveActivity.f27142f)) {
                            AddRelationShipReq req = new AddRelationShipReq();
                            req.phone = addNewFaveActivity.n();
                            req.relationship = String.valueOf(addNewFaveActivity.f27139c);
                            Bc.i iVar3 = addNewFaveActivity.f27145j;
                            req.remark = (iVar3 == null || (text2 = ((EditText) iVar3.f727e).getText()) == null) ? null : text2.toString();
                            Bc.i iVar4 = addNewFaveActivity.f27145j;
                            req.uniqueName = (iVar4 == null || (text = ((EditText) iVar4.f726d).getText()) == null) ? null : text.toString();
                            req.firstSource = addNewFaveActivity.f27143g;
                            PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) addNewFaveActivity.l();
                            if (palmPayFriendsViewModel != null) {
                                Intrinsics.checkNotNullParameter(req, "req");
                                p140j8.f.s(palmPayFriendsViewModel, new Z9.d(req, null), palmPayFriendsViewModel.f27303f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                        } else {
                            addNewFaveActivity.p();
                        }
                    } else {
                        new AddLinkFaveNotPPUserDialog(addNewFaveActivity, new C0717f(addNewFaveActivity)).show();
                    }
                } else if (it5 instanceof com.transsnet.palmpay.core.base.m) {
                    addNewFaveActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    addNewFaveActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it5).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
