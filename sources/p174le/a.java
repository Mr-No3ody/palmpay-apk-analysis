package p174le;

import Pa.r0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.BalanceAccountInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.main.export.bean.rsp.GuaranteeQueryRsp;
import com.transsnet.palmpay.ui.activity.me.MeBalanceAccountActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p220oa.h;
import p328ve.s;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeBalanceAccountActivity f39348b;

    public /* synthetic */ a(MeBalanceAccountActivity meBalanceAccountActivity, int i7) {
        this.f39347a = i7;
        this.f39348b = meBalanceAccountActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T t;
        List<AccountFlowBean.DataBean.ListBean> list;
        MeBalanceAccountActivity meBalanceAccountActivity;
        s sVar;
        RecyclerView recyclerView;
        EmptyView emptyView;
        TextView textView;
        switch (this.f39347a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        Pair pair = (Pair) ((p) it).f27360a;
                        MeBalanceAccountActivity meBalanceAccountActivity2 = this.f39348b;
                        meBalanceAccountActivity2.f34741f = pair;
                        MeBalanceAccountActivity.m(meBalanceAccountActivity2);
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        ((n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult.isSuccess() && (t = commonBeanResult.data) != 0 && ((GuaranteeQueryRsp) t).guaranteeSuccess) {
                            MeBalanceAccountActivity meBalanceAccountActivity3 = this.f39348b;
                            Bc.o oVar = meBalanceAccountActivity3.f34743i;
                            if (oVar != null) {
                                oVar.f794c.setVisibility(0);
                            }
                            Bc.o oVar2 = meBalanceAccountActivity3.f34743i;
                            if (oVar2 != null) {
                                oVar2.f797f.setVisibility(0);
                            }
                            Bc.o oVar3 = meBalanceAccountActivity3.f34743i;
                            if (oVar3 != null) {
                                oVar3.f798g.setVisibility(8);
                            }
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        ((n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        BalanceAccountInfo balanceAccountInfo = (BalanceAccountInfo) ((p) it3).f27360a;
                        if (balanceAccountInfo.isSuccess()) {
                            BalanceAccountInfo.DataBean data = balanceAccountInfo.getData();
                            if (data != null) {
                                User user = BaseApplication.getInstance().getUser();
                                if (!TextUtils.isEmpty(data.getAccountId())) {
                                    user.setBalanceAccountId(data.getAccountId());
                                    BaseApplication.get().getUserDataSource().getClass();
                                    p156ka.a.c(user);
                                }
                                long availableBalance = data.getAvailableBalance();
                                MeBalanceAccountActivity meBalanceAccountActivity4 = this.f39348b;
                                meBalanceAccountActivity4.f34738c = availableBalance;
                                meBalanceAccountActivity4.f34739d = data.getFrozenBalance();
                                meBalanceAccountActivity4.n();
                                Bc.o oVar4 = meBalanceAccountActivity4.f34743i;
                                if (oVar4 != null) {
                                    oVar4.f803p.setText(r0.B(data.getFrozenBalance(), true));
                                }
                                if (!TextUtils.isEmpty(data.frozenAmountTips)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(data.frozenAmountTips);
                                    if (!TextUtils.isEmpty(data.frozenAmountHighlightTips)) {
                                        String frozenAmountTips = data.frozenAmountTips;
                                        Intrinsics.checkNotNullExpressionValue(frozenAmountTips, "frozenAmountTips");
                                        String frozenAmountHighlightTips = data.frozenAmountHighlightTips;
                                        Intrinsics.checkNotNullExpressionValue(frozenAmountHighlightTips, "frozenAmountHighlightTips");
                                        int iE = StringsKt.E(frozenAmountTips, frozenAmountHighlightTips, 0, false, 6);
                                        spannableStringBuilder.setSpan(new b(data, meBalanceAccountActivity4), iE, data.frozenAmountHighlightTips.length() + iE, 33);
                                        Bc.o oVar5 = meBalanceAccountActivity4.f34743i;
                                        if (oVar5 != null) {
                                            oVar5.f808v.setMovementMethod(LinkMovementMethod.getInstance());
                                        }
                                    }
                                    Bc.o oVar6 = meBalanceAccountActivity4.f34743i;
                                    if (oVar6 != null) {
                                        oVar6.f808v.setText(spannableStringBuilder);
                                    }
                                }
                                MeBalanceAccountActivity.m(meBalanceAccountActivity4);
                            }
                        } else {
                            ToastUtils.showShort(balanceAccountInfo.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof o)) {
                    if (it4 instanceof p) {
                        AccountFlowBean accountFlowBean = (AccountFlowBean) ((p) it4).f27360a;
                        if (accountFlowBean.isSuccess()) {
                            AccountFlowBean.DataBean data2 = accountFlowBean.getData();
                            if (data2 != null && (list = data2.getList()) != null && (sVar = (meBalanceAccountActivity = this.f39348b).f34740e) != null) {
                                sVar.b();
                                sVar.a(list);
                                Bc.o oVar7 = meBalanceAccountActivity.f34743i;
                                if (oVar7 != null && (textView = oVar7.f790Y) != null) {
                                    h.s(textView, sVar.f4985b.size() > 0);
                                }
                                Bc.o oVar8 = meBalanceAccountActivity.f34743i;
                                if (oVar8 != null && (emptyView = oVar8.f793b) != null) {
                                    h.s(emptyView, sVar.f4985b.size() == 0);
                                }
                                Bc.o oVar9 = meBalanceAccountActivity.f34743i;
                                if (oVar9 != null && (recyclerView = oVar9.f782A) != null) {
                                    h.s(recyclerView, sVar.f4985b.size() > 0);
                                }
                            }
                        } else {
                            ToastUtils.showShort(accountFlowBean.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it4 instanceof m)) {
                        if (!(it4 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it4).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
