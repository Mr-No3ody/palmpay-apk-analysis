package com.transsnet.palmpay.credit.view;

import Bc.C0104a;
import Fb.j;
import Pa.r0;
import Ya.e;
import Ya.f;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.AboutRepaymentCardData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.JumpDetailData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MyAccountData;
import com.transsnet.palmpay.credit.bean.style.AboutRepaymentInformationStyleConfig;
import com.transsnet.palmpay.credit.view.AboutRepaymentInfoView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/view/AboutRepaymentInfoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "style", "", "setViewStyleConfig", "(Ljava/lang/String;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AboutRepaymentInfoView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30711b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0104a f30712a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutRepaymentInfoView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setOrientation(1);
        View viewInflate = View.inflate(context, f.cs_cl_phone_about_repayment_layout, this);
        int i7 = e.IvAddBankCardIcon;
        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = e.IvAddBankCardRight;
            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView2 != null) {
                i7 = e.IvMyAccountCopy;
                ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView3 != null) {
                    i7 = e.IvMyAccountIcon;
                    ImageView imageView4 = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView4 != null) {
                        i7 = e.IvPhoneLockIcon;
                        ImageView imageView5 = (ImageView) p059e1.a.m(i7, viewInflate);
                        if (imageView5 != null) {
                            i7 = e.IvPhoneLockRight;
                            ImageView imageView6 = (ImageView) p059e1.a.m(i7, viewInflate);
                            if (imageView6 != null) {
                                i7 = e.TvAddBankCardTitle;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = e.TvMyAccountTitle;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = e.TvMyAccountValue;
                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            i7 = e.TvPhoneLockTitle;
                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView4 != null) {
                                                i7 = e.tvTitle;
                                                TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView5 != null) {
                                                    this.f30712a = new C0104a(viewInflate, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5);
                                                    if (viewInflate != null) {
                                                        viewInflate.setPadding(CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(12));
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    private final void setViewStyleConfig(String style) {
        AboutRepaymentInformationStyleConfig aboutRepaymentInformationStyleConfig;
        if (style == null || style.length() == 0 || (aboutRepaymentInformationStyleConfig = (AboutRepaymentInformationStyleConfig) l.l(style, "getAboutRepaymentInformationStyleConfig", AboutRepaymentInformationStyleConfig.class)) == null) {
            return;
        }
        C0104a c0104a = this.f30712a;
        j.a(c0104a != null ? c0104a.f660v : null, aboutRepaymentInformationStyleConfig.aboutRepaymentCardBg);
        j.c(c0104a != null ? (TextView) c0104a.f651c : null, aboutRepaymentInformationStyleConfig.aboutRepaymentTitle);
        j.a(c0104a != null ? (ImageView) c0104a.f655g : null, aboutRepaymentInformationStyleConfig.myAccountLeadingIcon);
        j.c(c0104a != null ? c0104a.f659p : null, aboutRepaymentInformationStyleConfig.myAccountTitle);
        j.a(c0104a != null ? (ImageView) c0104a.f654f : null, aboutRepaymentInformationStyleConfig.myAccountTrailingIcon);
        j.a(c0104a != null ? (ImageView) c0104a.f652d : null, aboutRepaymentInformationStyleConfig.addBankCardLeadingIcon);
        j.c(c0104a != null ? (TextView) c0104a.f658o : null, aboutRepaymentInformationStyleConfig.addBankCardTitle);
        j.a(c0104a != null ? (ImageView) c0104a.f653e : null, aboutRepaymentInformationStyleConfig.addBankCardTrailingIcon);
        j.a(c0104a != null ? (ImageView) c0104a.f656i : null, aboutRepaymentInformationStyleConfig.phoneLockLeadingIcon);
        j.c(c0104a != null ? (TextView) c0104a.f650b : null, aboutRepaymentInformationStyleConfig.phoneLockTitle);
        j.a(c0104a != null ? (ImageView) c0104a.f657j : null, aboutRepaymentInformationStyleConfig.phoneLockTrailingIcon);
    }

    public final void a(final AboutRepaymentCardData aboutRepaymentCardData) {
        if (aboutRepaymentCardData == null) {
            return;
        }
        setViewStyleConfig(aboutRepaymentCardData.getItemStyle());
        C0104a c0104a = this.f30712a;
        if (c0104a != null) {
            ((TextView) c0104a.f651c).setText(aboutRepaymentCardData.getTitle());
        }
        ImageView imageView = c0104a != null ? (ImageView) c0104a.f655g : null;
        MyAccountData myAccount = aboutRepaymentCardData.getMyAccount();
        String str = myAccount != null ? myAccount.image : null;
        MyAccountData myAccount2 = aboutRepaymentCardData.getMyAccount();
        r0.q1(imageView, str, myAccount2 != null ? myAccount2.imageDark : null);
        if (c0104a != null) {
            TextView textView = c0104a.f659p;
            MyAccountData myAccount3 = aboutRepaymentCardData.getMyAccount();
            textView.setText(myAccount3 != null ? myAccount3.title : null);
        }
        if (c0104a != null) {
            c0104a.t.setText(String.valueOf(r0.Y(BaseApplication.get().getUser().getPhoneNumber())));
        }
        if (c0104a != null) {
            final int i7 = 0;
            ((ImageView) c0104a.f654f).setOnClickListener(new View.OnClickListener(this) { // from class: Gb.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AboutRepaymentInfoView f3264b;

                {
                    this.f3264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutRepaymentInfoView aboutRepaymentInfoView = this.f3264b;
                    switch (i7) {
                        case 0:
                            int i10 = AboutRepaymentInfoView.f30711b;
                            Object systemService = aboutRepaymentInfoView.getContext().getSystemService("clipboard");
                            Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("account", BaseApplication.get().getUser().getPhoneNumber()));
                            ToastUtils.showLong("Copied to clipboard", new Object[0]);
                            break;
                        default:
                            int i11 = AboutRepaymentInfoView.f30711b;
                            Object systemService2 = aboutRepaymentInfoView.getContext().getSystemService("clipboard");
                            Intrinsics.f(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("account", BaseApplication.get().getUser().getPhoneNumber()));
                            ToastUtils.showLong("Copied to clipboard", new Object[0]);
                            break;
                    }
                }
            });
        }
        if (c0104a != null) {
            final int i10 = 1;
            c0104a.t.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AboutRepaymentInfoView f3264b;

                {
                    this.f3264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutRepaymentInfoView aboutRepaymentInfoView = this.f3264b;
                    switch (i10) {
                        case 0:
                            int i11 = AboutRepaymentInfoView.f30711b;
                            Object systemService = aboutRepaymentInfoView.getContext().getSystemService("clipboard");
                            Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("account", BaseApplication.get().getUser().getPhoneNumber()));
                            ToastUtils.showLong("Copied to clipboard", new Object[0]);
                            break;
                        default:
                            int i12 = AboutRepaymentInfoView.f30711b;
                            Object systemService2 = aboutRepaymentInfoView.getContext().getSystemService("clipboard");
                            Intrinsics.f(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("account", BaseApplication.get().getUser().getPhoneNumber()));
                            ToastUtils.showLong("Copied to clipboard", new Object[0]);
                            break;
                    }
                }
            });
        }
        ImageView imageView2 = c0104a != null ? (ImageView) c0104a.f654f : null;
        MyAccountData myAccount4 = aboutRepaymentCardData.getMyAccount();
        String str2 = myAccount4 != null ? myAccount4.icon : null;
        MyAccountData myAccount5 = aboutRepaymentCardData.getMyAccount();
        r0.q1(imageView2, str2, myAccount5 != null ? myAccount5.iconDark : null);
        ImageView imageView3 = c0104a != null ? (ImageView) c0104a.f652d : null;
        JumpDetailData addBankCard = aboutRepaymentCardData.getAddBankCard();
        String str3 = addBankCard != null ? addBankCard.image : null;
        JumpDetailData addBankCard2 = aboutRepaymentCardData.getAddBankCard();
        r0.q1(imageView3, str3, addBankCard2 != null ? addBankCard2.imageDark : null);
        if (c0104a != null) {
            TextView textView2 = (TextView) c0104a.f658o;
            JumpDetailData addBankCard3 = aboutRepaymentCardData.getAddBankCard();
            textView2.setText(addBankCard3 != null ? addBankCard3.title : null);
        }
        ImageView imageView4 = c0104a != null ? (ImageView) c0104a.f653e : null;
        JumpDetailData addBankCard4 = aboutRepaymentCardData.getAddBankCard();
        String str4 = addBankCard4 != null ? addBankCard4.icon : null;
        JumpDetailData addBankCard5 = aboutRepaymentCardData.getAddBankCard();
        r0.q1(imageView4, str4, addBankCard5 != null ? addBankCard5.iconDark : null);
        ImageView imageView5 = c0104a != null ? (ImageView) c0104a.f656i : null;
        JumpDetailData aboutPhoneLock = aboutRepaymentCardData.getAboutPhoneLock();
        String str5 = aboutPhoneLock != null ? aboutPhoneLock.image : null;
        JumpDetailData aboutPhoneLock2 = aboutRepaymentCardData.getAboutPhoneLock();
        r0.q1(imageView5, str5, aboutPhoneLock2 != null ? aboutPhoneLock2.imageDark : null);
        if (c0104a != null) {
            TextView textView3 = (TextView) c0104a.f650b;
            JumpDetailData aboutPhoneLock3 = aboutRepaymentCardData.getAboutPhoneLock();
            textView3.setText(aboutPhoneLock3 != null ? aboutPhoneLock3.title : null);
        }
        ImageView imageView6 = c0104a != null ? (ImageView) c0104a.f657j : null;
        JumpDetailData aboutPhoneLock4 = aboutRepaymentCardData.getAboutPhoneLock();
        String str6 = aboutPhoneLock4 != null ? aboutPhoneLock4.icon : null;
        JumpDetailData aboutPhoneLock5 = aboutRepaymentCardData.getAboutPhoneLock();
        r0.q1(imageView6, str6, aboutPhoneLock5 != null ? aboutPhoneLock5.iconDark : null);
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: Gb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutRepaymentCardData aboutRepaymentCardData2 = aboutRepaymentCardData;
                switch (i11) {
                    case 0:
                        int i12 = AboutRepaymentInfoView.f30711b;
                        JumpDetailData addBankCard6 = aboutRepaymentCardData2.getAddBankCard();
                        String str7 = addBankCard6 != null ? addBankCard6.jumpPath : null;
                        JumpDetailData addBankCard7 = aboutRepaymentCardData2.getAddBankCard();
                        String str8 = addBankCard7 != null ? addBankCard7.jumpType : null;
                        JumpDetailData addBankCard8 = aboutRepaymentCardData2.getAddBankCard();
                        Pa.F.f(str7, str8, addBankCard8 != null ? addBankCard8.jumpParams : null);
                        break;
                    default:
                        int i13 = AboutRepaymentInfoView.f30711b;
                        JumpDetailData aboutPhoneLock6 = aboutRepaymentCardData2.getAboutPhoneLock();
                        String str9 = aboutPhoneLock6 != null ? aboutPhoneLock6.jumpPath : null;
                        JumpDetailData aboutPhoneLock7 = aboutRepaymentCardData2.getAboutPhoneLock();
                        String str10 = aboutPhoneLock7 != null ? aboutPhoneLock7.jumpType : null;
                        JumpDetailData aboutPhoneLock8 = aboutRepaymentCardData2.getAboutPhoneLock();
                        Pa.F.f(str9, str10, aboutPhoneLock8 != null ? aboutPhoneLock8.jumpParams : null);
                        break;
                }
            }
        };
        if (c0104a != null) {
            ((TextView) c0104a.f658o).setOnClickListener(onClickListener);
        }
        if (c0104a != null) {
            ((ImageView) c0104a.f653e).setOnClickListener(onClickListener);
        }
        final int i12 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: Gb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutRepaymentCardData aboutRepaymentCardData2 = aboutRepaymentCardData;
                switch (i12) {
                    case 0:
                        int i13 = AboutRepaymentInfoView.f30711b;
                        JumpDetailData addBankCard6 = aboutRepaymentCardData2.getAddBankCard();
                        String str7 = addBankCard6 != null ? addBankCard6.jumpPath : null;
                        JumpDetailData addBankCard7 = aboutRepaymentCardData2.getAddBankCard();
                        String str8 = addBankCard7 != null ? addBankCard7.jumpType : null;
                        JumpDetailData addBankCard8 = aboutRepaymentCardData2.getAddBankCard();
                        Pa.F.f(str7, str8, addBankCard8 != null ? addBankCard8.jumpParams : null);
                        break;
                    default:
                        int i14 = AboutRepaymentInfoView.f30711b;
                        JumpDetailData aboutPhoneLock6 = aboutRepaymentCardData2.getAboutPhoneLock();
                        String str9 = aboutPhoneLock6 != null ? aboutPhoneLock6.jumpPath : null;
                        JumpDetailData aboutPhoneLock7 = aboutRepaymentCardData2.getAboutPhoneLock();
                        String str10 = aboutPhoneLock7 != null ? aboutPhoneLock7.jumpType : null;
                        JumpDetailData aboutPhoneLock8 = aboutRepaymentCardData2.getAboutPhoneLock();
                        Pa.F.f(str9, str10, aboutPhoneLock8 != null ? aboutPhoneLock8.jumpParams : null);
                        break;
                }
            }
        };
        if (c0104a != null) {
            ((TextView) c0104a.f650b).setOnClickListener(onClickListener2);
        }
        if (c0104a != null) {
            ((ImageView) c0104a.f657j).setOnClickListener(onClickListener2);
        }
    }
}
