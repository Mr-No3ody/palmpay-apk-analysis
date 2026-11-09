package com.transsnet.palmpay.ui.activity.bankcard;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.C0106c;
import C0.G;
import Fe.C0258f;
import G1.d;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;
import p132ie.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\f\rB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/bankcard/BankAccountDetailActivity;", "Lcom/transsnet/palmpay/core/base/i;", "LFe/f;", "Landroid/view/View$OnClickListener;", "Lcom/transsnet/palmpay/ui/mvp/contract/BankCardDetailContract$View;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "ie/b", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BankAccountDetailActivity extends i implements View.OnClickListener, BankCardDetailContract.View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34631f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkBankAccountResp.LinkBankAccount f34632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f34633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f34634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0106c f34635e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context, @Nullable LinkBankAccountResp.LinkBankAccount linkBankAccount) {
            Intent intentE = G.e(context, "context", context, BankAccountDetailActivity.class);
            intentE.putExtra("core_extra_bank_account_data", linkBankAccount);
            context.startActivity(intentE);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract.View
    public final void handleSetDefaultCardResult(CommonResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zIsSuccess = result.isSuccess();
        String respMsg = result.getRespMsg();
        t tVar = new t(this);
        if (zIsSuccess) {
            G.u(MessageEvent.EVENT_REFRESH_BANK_CARD_LIST, c.b());
            C0106c c0106c = this.f34635e;
            if (c0106c != null) {
                ((TextView) c0106c.f674g).setVisibility(0);
            }
            b bVar = this.f34633c;
            if (bVar != null) {
                bVar.f37579b.setVisibility(8);
            }
            tVar.b();
            Intrinsics.checkNotNullExpressionValue(tVar, "getSuccessBuilder(...)");
            tVar.c(h.main_bank_account_set_as_default_success_text);
            tVar.f31311j = new p132ie.a(this, 0);
        } else {
            tVar.a();
            Intrinsics.checkNotNullExpressionValue(tVar, "getFailBuilder(...)");
            tVar.f31304c = respMsg;
        }
        tVar.e(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        LinkBankAccountResp.LinkBankAccount linkBankAccount = this.f34632b;
        if (linkBankAccount != null) {
            C0106c c0106c = this.f34635e;
            r0.o1(linkBankAccount.getBankUrl(), c0106c != null ? (ImageView) c0106c.f670c : null);
            C0106c c0106c2 = this.f34635e;
            if (c0106c2 != null) {
                c0106c2.f669b.setText(linkBankAccount.getBankName());
            }
            C0106c c0106c3 = this.f34635e;
            if (c0106c3 != null) {
                ((TextView) c0106c3.f672e).setText(r0.G(linkBankAccount.getBankAccountNo()));
            }
            C0106c c0106c4 = this.f34635e;
            if (c0106c4 != null) {
                ((TextView) c0106c4.f676j).setVisibility(8);
            }
            if (linkBankAccount.getVerifyFlag() != 1) {
                C0106c c0106c5 = this.f34635e;
                if (c0106c5 != null) {
                    ((TextView) c0106c5.f674g).setVisibility(8);
                }
                b bVar = this.f34633c;
                if (bVar != null) {
                    bVar.f37579b.setVisibility(8);
                }
            } else if (linkBankAccount.isDefaultPaymentCard()) {
                C0106c c0106c6 = this.f34635e;
                if (c0106c6 != null) {
                    ((TextView) c0106c6.f674g).setVisibility(0);
                }
                b bVar2 = this.f34633c;
                if (bVar2 != null) {
                    bVar2.f37579b.setVisibility(8);
                }
            } else {
                b bVar3 = this.f34633c;
                if (bVar3 != null) {
                    bVar3.f37579b.setVisibility(0);
                }
                C0106c c0106c7 = this.f34635e;
                if (c0106c7 != null) {
                    ((TextView) c0106c7.f674g).setVisibility(8);
                }
            }
            if (linkBankAccount.getAuthFlag() != 1) {
                C0106c c0106c8 = this.f34635e;
                if (c0106c8 != null) {
                    com.bumptech.glide.b.c(this).e(this).load(linkBankAccount.getBgUrl()).a(new d().x(r.cv_shape_rect_corner_8_bg_gray_padding_lr_12_tb_6)).S((ImageView) c0106c8.f671d);
                }
                b bVar4 = this.f34634d;
                if (bVar4 != null) {
                    bVar4.f37579b.setVisibility(0);
                }
            } else {
                C0106c c0106c9 = this.f34635e;
                if (c0106c9 != null) {
                    ((TextView) c0106c9.f676j).setVisibility(0);
                }
                C0106c c0106c10 = this.f34635e;
                if (c0106c10 != null) {
                    ((TextView) c0106c10.f676j).setText(h.main_bound);
                }
                b bVar5 = this.f34634d;
                if (bVar5 != null) {
                    bVar5.f37579b.setVisibility(8);
                }
            }
            C0106c c0106c11 = this.f34635e;
            if (c0106c11 != null) {
                com.bumptech.glide.b.c(this).e(this).load(linkBankAccount.getBgUrl()).a(new d().x(r.cv_shape_rect_corner_8_bg_gray_padding_lr_12_tb_6)).S((ImageView) c0106c11.f671d);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewM2;
        View viewM3;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_bank_card_detail, (ViewGroup) null, false);
        int i7 = e.bank_content;
        if (((RelativeLayout) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.bank_icon;
            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = e.bank_name;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = e.bank_num;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = e.card_bg;
                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                        if (imageView2 != null && (viewM = p059e1.a.m((i7 = e.layoutAuthentication), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = e.layoutDefault), viewInflate)) != null && (viewM3 = p059e1.a.m((i7 = e.layoutDelete), viewInflate)) != null) {
                            i7 = e.titleBar;
                            if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = e.tvCardType;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    i7 = e.tvDefaultCard;
                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView4 != null) {
                                        i7 = e.tvVerified;
                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView5 != null) {
                                            C0106c c0106c = new C0106c((LinearLayout) viewInflate, imageView, textView, textView2, imageView2, viewM, viewM2, viewM3, textView3, textView4, textView5);
                                            this.f34635e = c0106c;
                                            return c0106c;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new C0258f();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        LinkBankAccountResp.LinkBankAccount linkBankAccount;
        C0258f c0258f;
        super.onActivityResult(i7, i10, intent);
        if (i7 != 100 || i10 != -1 || (linkBankAccount = this.f34632b) == null || (c0258f = (C0258f) this.f27350a) == null) {
            return;
        }
        c0258f.deleteLinkBankAccount(linkBankAccount);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v3) {
        C0258f c0258f;
        Intrinsics.checkNotNullParameter(v3, "v");
        if (v3.getId() == e.layoutAuthentication) {
            LinkBankAccountResp.LinkBankAccount linkBankAccount = this.f34632b;
            if (linkBankAccount != null) {
                ARouter.getInstance().build("/coreImpl/bind_new_bank_account").withBoolean("real_name_auth", true).withParcelable("extra_data", linkBankAccount).navigation();
                return;
            }
            return;
        }
        if (v3.getId() == e.layoutDefault) {
            LinkBankAccountResp.LinkBankAccount linkBankAccount2 = this.f34632b;
            if (linkBankAccount2 == null || (c0258f = (C0258f) this.f27350a) == null) {
                return;
            }
            c0258f.setDefaultPaymentCard(linkBankAccount2.getBankAccountNo(), 1);
            return;
        }
        if (v3.getId() == e.layoutDelete) {
            O6.c cVar = new O6.c(this);
            cVar.e(k.core_title_attention);
            cVar.b(h.main_bank_account_delete_text);
            cVar.c(k.core_cancel, null);
            cVar.d(h.main_delete, new ViewOnClickListenerC1649v(this, 11));
            cVar.g();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        if (this.f34632b == null) {
            Intent intent = getIntent();
            this.f34632b = intent != null ? (LinkBankAccountResp.LinkBankAccount) intent.getParcelableExtra("core_extra_bank_account_data") : null;
        }
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(e.titleBar);
        LinkBankAccountResp.LinkBankAccount linkBankAccount = this.f34632b;
        if (linkBankAccount == null || !linkBankAccount.isDefaultPaymentCard()) {
            ppTitleBar.setTitle(getString(h.main_bank_account));
        } else {
            ppTitleBar.setTitle(getString(h.main_default_payment_bank_card));
        }
        C0106c c0106c = this.f34635e;
        if (c0106c != null) {
            ((TextView) c0106c.f674g).setCompoundDrawablesWithIntrinsicBounds(r.cv_default_acount_small, 0, 0, 0);
        }
        View viewFindViewById = findViewById(e.layoutDefault);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f34633c = new b(viewFindViewById, S6.a.pay_Bankcard, k.core_set_default_payment_account, this);
        View viewFindViewById2 = findViewById(e.layoutAuthentication);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f34634d = new b(viewFindViewById2, S6.a.pay_SecurityOutline, k.core_real_name_authentication, this);
        View viewFindViewById3 = findViewById(e.layoutDelete);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        new b(viewFindViewById3, S6.a.pay_Delete, k.core_remove_bank_account, this).f37580c.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract.View
    public final void showDeleteResult(CommonResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zIsSuccess = result.isSuccess();
        String respMsg = result.getRespMsg();
        t tVar = new t(this);
        if (zIsSuccess) {
            c.b().f(new MessageEvent(MessageEvent.EVENT_REFRESH_BANK_CARD_LIST));
            tVar.b();
            Intrinsics.checkNotNullExpressionValue(tVar, "getSuccessBuilder(...)");
            tVar.c(h.main_bank_account_delete_success_text);
            tVar.f31311j = new p132ie.a(this, 1);
        } else {
            tVar.a();
            Intrinsics.checkNotNullExpressionValue(tVar, "getFailBuilder(...)");
            tVar.f31304c = respMsg;
        }
        tVar.e(true);
    }
}
