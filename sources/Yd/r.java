package Yd;

import N8.d0;
import Uc.C0665k;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.transsnet.palmpay.teller.bean.AddFavoriteReq;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.DelFavoriteReq;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Kb.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11360g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f11361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p103gf.a f11362j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f11363o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, View view) {
        super(sVar, view);
        this.f11363o = sVar;
        EnumC2132k enumC2132k = EnumC2132k.f43971c;
        this.f11357d = C2131j.a(enumC2132k, new C0665k(view, 19));
        this.f11358e = C2131j.a(enumC2132k, new C0665k(view, 20));
        this.f11359f = C2131j.a(enumC2132k, new C0665k(view, 21));
        this.f11360g = C2131j.a(enumC2132k, new C0665k(view, 22));
        this.f11361i = C2131j.a(enumC2132k, new C0665k(view, 23));
        this.f11362j = new p103gf.a();
        a(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(boolean z3) {
        View view = (View) this.f11360g.getValue();
        if (view != null) {
            view.setVisibility(z3 ? 0 : 8);
        }
        ImageView imageView = (ImageView) this.f11357d.getValue();
        if (imageView != null) {
            imageView.setVisibility(z3 ? 8 : 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        Intrinsics.f(tag, "null cannot be cast to non-null type com.transsnet.palmpay.teller.bean.PaymentItemBean");
        PaymentItemBean paymentItemBean = (PaymentItemBean) tag;
        boolean z3 = paymentItemBean.myFavorite;
        s sVar = this.f11363o;
        if (z3) {
            view.setSelected(false);
            int i7 = paymentItemBean.f34134id;
            String str = paymentItemBean.paymentItemId;
            d(true);
            DelFavoriteReq delFavoriteReq = new DelFavoriteReq();
            delFavoriteReq.collectType = 1;
            delFavoriteReq.f34133id = i7;
            delFavoriteReq.paymentItemId = str;
            ((IApiTellerService) Qd.a.f7847a.f8871b).delFavorite(delFavoriteReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new d0(this, sVar, str));
            return;
        }
        view.setSelected(true);
        AddFavoriteReq addFavoriteReq = new AddFavoriteReq();
        addFavoriteReq.categoryId = paymentItemBean.categoryId;
        addFavoriteReq.categoryName = paymentItemBean.categoryName;
        addFavoriteReq.paymentItemName = paymentItemBean.paymentItemName;
        addFavoriteReq.billerId = paymentItemBean.billerId;
        addFavoriteReq.billerName = paymentItemBean.billerName;
        if (TextUtils.isEmpty(paymentItemBean.institutionLogo)) {
            BillerListItemBean billerListItemBean = sVar.f11368j;
            addFavoriteReq.icon = billerListItemBean != null ? billerListItemBean.getInstitutionLogo() : null;
        } else {
            addFavoriteReq.icon = paymentItemBean.institutionLogo;
        }
        if (TextUtils.isEmpty(addFavoriteReq.billerName)) {
            BillerListItemBean billerListItemBean2 = sVar.f11368j;
            addFavoriteReq.billerName = billerListItemBean2 != null ? billerListItemBean2.getBillerName() : null;
        }
        String str2 = paymentItemBean.customerField1;
        addFavoriteReq.customerField1 = str2;
        if (TextUtils.isEmpty(str2)) {
            BillerListItemBean billerListItemBean3 = sVar.f11368j;
            addFavoriteReq.customerField1 = billerListItemBean3 != null ? billerListItemBean3.getCustomerField1() : null;
        }
        addFavoriteReq.amount = paymentItemBean.amount;
        addFavoriteReq.paymentItemId = paymentItemBean.paymentItemId;
        d(true);
        ((IApiTellerService) Qd.a.f7847a.f8871b).addFavorite(addFavoriteReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new d0(this, 1, sVar, addFavoriteReq));
    }
}
