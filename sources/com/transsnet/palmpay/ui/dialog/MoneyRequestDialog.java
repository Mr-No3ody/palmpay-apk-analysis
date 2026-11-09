package com.transsnet.palmpay.ui.dialog;

import Ab.D;
import Ac.e;
import Ac.f;
import Bc.C;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.bean.LastPayerDataBean;
import com.transsnet.palmpay.core.bean.req.CancelVoucherReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.dialog.MoneyRequestDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p059e1.a;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/MoneyRequestDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;)V", "", "initViews", "()V", "show", "Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;", "getData", "()Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;", "LBc/C;", "binding", "LBc/C;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoneyRequestDialog extends b {

    @Nullable
    private C binding;

    @Nullable
    private final LastPayerDataBean data;

    public MoneyRequestDialog(@Nullable Context context, @Nullable LastPayerDataBean lastPayerDataBean) {
        super(context, f.main_layout_re_request_money_dialog);
        this.data = lastPayerDataBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(MoneyRequestDialog moneyRequestDialog, View view) {
        Postcard postcardBuild = ARouter.getInstance().build("/smorder/detail");
        LastPayerDataBean lastPayerDataBean = moneyRequestDialog.data;
        postcardBuild.withString("orderId", lastPayerDataBean != null ? lastPayerDataBean.orderId : null).navigation();
        moneyRequestDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(MoneyRequestDialog moneyRequestDialog, View view) {
        CancelVoucherReq cancelVoucherReq = new CancelVoucherReq();
        LastPayerDataBean lastPayerDataBean = moneyRequestDialog.data;
        cancelVoucherReq.setOrderId(lastPayerDataBean != null ? lastPayerDataBean.orderId : null);
        cancelVoucherReq.setRole(1);
        ((PayApiService) c.f43141a.f14621b).cancelRequestMoney(cancelVoucherReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(moneyRequestDialog, 2));
    }

    @Nullable
    public final LastPayerDataBean getData() {
        return this.data;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        C c6;
        C c10;
        View viewFindViewById = findViewById(e.rootView);
        int i7 = e.btnAgree;
        Button button = (Button) a.m(i7, viewFindViewById);
        if (button != null) {
            i7 = e.ivAvatar;
            ImageView imageView = (ImageView) a.m(i7, viewFindViewById);
            if (imageView != null) {
                i7 = e.ivClose;
                IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                if (iconicsImageView != null) {
                    i7 = e.ivIcon;
                    ImageView imageView2 = (ImageView) a.m(i7, viewFindViewById);
                    if (imageView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                        i7 = e.tvAmount;
                        TextView textView = (TextView) a.m(i7, viewFindViewById);
                        if (textView != null) {
                            i7 = e.tvDecline;
                            TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                            if (textView2 != null) {
                                i7 = e.tvLater;
                                TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                                if (textView3 != null) {
                                    i7 = e.tvName;
                                    TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                                    if (textView4 != null) {
                                        i7 = e.tvPhone;
                                        IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, viewFindViewById);
                                        if (iconicsTextView != null) {
                                            i7 = e.tvTitle;
                                            TextView textView5 = (TextView) a.m(i7, viewFindViewById);
                                            if (textView5 != null) {
                                                this.binding = new C(constraintLayout, button, imageView, iconicsImageView, imageView2, textView, textView2, textView3, textView4, iconicsTextView, textView5);
                                                showAtCenter(getWindow(), l.dialog_fade_in_out);
                                                C c11 = this.binding;
                                                ImageView imageView3 = c11 != null ? c11.f605c : null;
                                                LastPayerDataBean lastPayerDataBean = this.data;
                                                r0.u1(imageView3, lastPayerDataBean != null ? lastPayerDataBean.senderHeadImage : null, r.cv_avatar_default);
                                                C c12 = this.binding;
                                                if (c12 != null) {
                                                    ImageView imageView4 = c12.f607e;
                                                    LastPayerDataBean lastPayerDataBean2 = this.data;
                                                    imageView4.setVisibility((lastPayerDataBean2 == null || !lastPayerDataBean2.auth) ? 8 : 0);
                                                }
                                                LastPayerDataBean lastPayerDataBean3 = this.data;
                                                if (!TextUtils.isEmpty(lastPayerDataBean3 != null ? lastPayerDataBean3.recipientNickname : null) && (c10 = this.binding) != null) {
                                                    TextView textView6 = c10.f611j;
                                                    LastPayerDataBean lastPayerDataBean4 = this.data;
                                                    textView6.setText((lastPayerDataBean4 != null ? lastPayerDataBean4.recipientNickname : null) + " send you request for money.");
                                                }
                                                LastPayerDataBean lastPayerDataBean5 = this.data;
                                                if (!TextUtils.isEmpty(lastPayerDataBean5 != null ? lastPayerDataBean5.recipientPhone : null) && (c6 = this.binding) != null) {
                                                    IconicsTextView iconicsTextView2 = c6.f612o;
                                                    LastPayerDataBean lastPayerDataBean6 = this.data;
                                                    iconicsTextView2.setText(r0.E0(lastPayerDataBean6 != null ? lastPayerDataBean6.recipientPhone : null));
                                                }
                                                C c13 = this.binding;
                                                if (c13 != null) {
                                                    TextView textView7 = c13.f608f;
                                                    LastPayerDataBean lastPayerDataBean7 = this.data;
                                                    Long l5 = lastPayerDataBean7 != null ? lastPayerDataBean7.amount : null;
                                                    Intrinsics.e(l5);
                                                    textView7.setText(r0.B(l5.longValue(), false));
                                                }
                                                C c14 = this.binding;
                                                if (c14 != null) {
                                                    final int i10 = 0;
                                                    c14.f606d.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.i

                                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                        public final /* synthetic */ MoneyRequestDialog f282b;

                                                        {
                                                            this.f282b = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i10) {
                                                                case 0:
                                                                    this.f282b.dismiss();
                                                                    break;
                                                                case 1:
                                                                    MoneyRequestDialog.initViews$lambda$1(this.f282b, view);
                                                                    break;
                                                                case 2:
                                                                    this.f282b.dismiss();
                                                                    break;
                                                                default:
                                                                    MoneyRequestDialog.initViews$lambda$3(this.f282b, view);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                C c15 = this.binding;
                                                if (c15 != null) {
                                                    final int i11 = 1;
                                                    c15.f604b.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.i

                                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                        public final /* synthetic */ MoneyRequestDialog f282b;

                                                        {
                                                            this.f282b = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i11) {
                                                                case 0:
                                                                    this.f282b.dismiss();
                                                                    break;
                                                                case 1:
                                                                    MoneyRequestDialog.initViews$lambda$1(this.f282b, view);
                                                                    break;
                                                                case 2:
                                                                    this.f282b.dismiss();
                                                                    break;
                                                                default:
                                                                    MoneyRequestDialog.initViews$lambda$3(this.f282b, view);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                C c16 = this.binding;
                                                if (c16 != null) {
                                                    final int i12 = 2;
                                                    c16.f610i.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.i

                                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                        public final /* synthetic */ MoneyRequestDialog f282b;

                                                        {
                                                            this.f282b = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i12) {
                                                                case 0:
                                                                    this.f282b.dismiss();
                                                                    break;
                                                                case 1:
                                                                    MoneyRequestDialog.initViews$lambda$1(this.f282b, view);
                                                                    break;
                                                                case 2:
                                                                    this.f282b.dismiss();
                                                                    break;
                                                                default:
                                                                    MoneyRequestDialog.initViews$lambda$3(this.f282b, view);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                C c17 = this.binding;
                                                if (c17 != null) {
                                                    final int i13 = 3;
                                                    c17.f609g.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.i

                                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                        public final /* synthetic */ MoneyRequestDialog f282b;

                                                        {
                                                            this.f282b = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            switch (i13) {
                                                                case 0:
                                                                    this.f282b.dismiss();
                                                                    break;
                                                                case 1:
                                                                    MoneyRequestDialog.initViews$lambda$1(this.f282b, view);
                                                                    break;
                                                                case 2:
                                                                    this.f282b.dismiss();
                                                                    break;
                                                                default:
                                                                    MoneyRequestDialog.initViews$lambda$3(this.f282b, view);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        if (this.data != null) {
            super.show();
        }
    }
}
