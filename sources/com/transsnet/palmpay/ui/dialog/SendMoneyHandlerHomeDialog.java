package com.transsnet.palmpay.ui.dialog;

import Ac.e;
import Ae.q;
import Ae.t;
import Pa.i0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.ui.dialog.SendMoneyHandlerHomeDialog;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0012\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001d\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R#\u0010 \u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R#\u0010%\u001a\n \u0015*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$R#\u0010(\u001a\n \u0015*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010$¨\u0006)"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/SendMoneyHandlerHomeDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/transsnet/palmpay/core/bean/req/ShareAccountDetailReq;", "req", "", "queryJumpParams", "(Lcom/transsnet/palmpay/core/bean/req/ShareAccountDetailReq;)V", "initViews", "()V", "", "type", "accountNo", "nickName", "headerUrl", "fillData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "text3$delegate", "Lkotlin/Lazy;", "getText3", "()Landroid/widget/TextView;", "text3", "text2$delegate", "getText2", "text2", "text1$delegate", "getText1", "text1", "Landroid/widget/ImageView;", "header$delegate", "getHeader", "()Landroid/widget/ImageView;", "header", "close$delegate", "getClose", "close", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SendMoneyHandlerHomeDialog extends b {

    /* JADX INFO: renamed from: close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy close;

    /* JADX INFO: renamed from: header$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy header;

    /* JADX INFO: renamed from: text1$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy text1;

    /* JADX INFO: renamed from: text2$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy text2;

    /* JADX INFO: renamed from: text3$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy text3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMoneyHandlerHomeDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.text3 = C2131j.b(new Function0(this) { // from class: Ae.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendMoneyHandlerHomeDialog f304b;

            {
                this.f304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return SendMoneyHandlerHomeDialog.text3_delegate$lambda$0(this.f304b);
                    case 1:
                        return SendMoneyHandlerHomeDialog.text2_delegate$lambda$1(this.f304b);
                    case 2:
                        return SendMoneyHandlerHomeDialog.text1_delegate$lambda$2(this.f304b);
                    case 3:
                        return SendMoneyHandlerHomeDialog.header_delegate$lambda$3(this.f304b);
                    default:
                        return SendMoneyHandlerHomeDialog.close_delegate$lambda$4(this.f304b);
                }
            }
        });
        final int i10 = 1;
        this.text2 = C2131j.b(new Function0(this) { // from class: Ae.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendMoneyHandlerHomeDialog f304b;

            {
                this.f304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return SendMoneyHandlerHomeDialog.text3_delegate$lambda$0(this.f304b);
                    case 1:
                        return SendMoneyHandlerHomeDialog.text2_delegate$lambda$1(this.f304b);
                    case 2:
                        return SendMoneyHandlerHomeDialog.text1_delegate$lambda$2(this.f304b);
                    case 3:
                        return SendMoneyHandlerHomeDialog.header_delegate$lambda$3(this.f304b);
                    default:
                        return SendMoneyHandlerHomeDialog.close_delegate$lambda$4(this.f304b);
                }
            }
        });
        final int i11 = 2;
        this.text1 = C2131j.b(new Function0(this) { // from class: Ae.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendMoneyHandlerHomeDialog f304b;

            {
                this.f304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return SendMoneyHandlerHomeDialog.text3_delegate$lambda$0(this.f304b);
                    case 1:
                        return SendMoneyHandlerHomeDialog.text2_delegate$lambda$1(this.f304b);
                    case 2:
                        return SendMoneyHandlerHomeDialog.text1_delegate$lambda$2(this.f304b);
                    case 3:
                        return SendMoneyHandlerHomeDialog.header_delegate$lambda$3(this.f304b);
                    default:
                        return SendMoneyHandlerHomeDialog.close_delegate$lambda$4(this.f304b);
                }
            }
        });
        final int i12 = 3;
        this.header = C2131j.b(new Function0(this) { // from class: Ae.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendMoneyHandlerHomeDialog f304b;

            {
                this.f304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return SendMoneyHandlerHomeDialog.text3_delegate$lambda$0(this.f304b);
                    case 1:
                        return SendMoneyHandlerHomeDialog.text2_delegate$lambda$1(this.f304b);
                    case 2:
                        return SendMoneyHandlerHomeDialog.text1_delegate$lambda$2(this.f304b);
                    case 3:
                        return SendMoneyHandlerHomeDialog.header_delegate$lambda$3(this.f304b);
                    default:
                        return SendMoneyHandlerHomeDialog.close_delegate$lambda$4(this.f304b);
                }
            }
        });
        final int i13 = 4;
        this.close = C2131j.b(new Function0(this) { // from class: Ae.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendMoneyHandlerHomeDialog f304b;

            {
                this.f304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SendMoneyHandlerHomeDialog.text3_delegate$lambda$0(this.f304b);
                    case 1:
                        return SendMoneyHandlerHomeDialog.text2_delegate$lambda$1(this.f304b);
                    case 2:
                        return SendMoneyHandlerHomeDialog.text1_delegate$lambda$2(this.f304b);
                    case 3:
                        return SendMoneyHandlerHomeDialog.header_delegate$lambda$3(this.f304b);
                    default:
                        return SendMoneyHandlerHomeDialog.close_delegate$lambda$4(this.f304b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView close_delegate$lambda$4(SendMoneyHandlerHomeDialog sendMoneyHandlerHomeDialog) {
        return (ImageView) sendMoneyHandlerHomeDialog.findViewById(e.close);
    }

    private final ImageView getClose() {
        return (ImageView) this.close.getValue();
    }

    private final ImageView getHeader() {
        return (ImageView) this.header.getValue();
    }

    private final TextView getText1() {
        return (TextView) this.text1.getValue();
    }

    private final TextView getText2() {
        return (TextView) this.text2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getText3() {
        return (TextView) this.text3.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView header_delegate$lambda$3(SendMoneyHandlerHomeDialog sendMoneyHandlerHomeDialog) {
        return (ImageView) sendMoneyHandlerHomeDialog.findViewById(e.header);
    }

    private final void queryJumpParams(ShareAccountDetailReq req) {
        V v3 = V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new t(req, this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView text1_delegate$lambda$2(SendMoneyHandlerHomeDialog sendMoneyHandlerHomeDialog) {
        return (TextView) sendMoneyHandlerHomeDialog.findViewById(e.text1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView text2_delegate$lambda$1(SendMoneyHandlerHomeDialog sendMoneyHandlerHomeDialog) {
        return (TextView) sendMoneyHandlerHomeDialog.findViewById(e.text2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView text3_delegate$lambda$0(SendMoneyHandlerHomeDialog sendMoneyHandlerHomeDialog) {
        return (TextView) sendMoneyHandlerHomeDialog.findViewById(e.text3);
    }

    public final void fillData(@Nullable String type, @Nullable String accountNo, @Nullable String nickName, @Nullable String headerUrl) {
        if (i0.X(getContext())) {
            TextView text1 = getText1();
            if (text1 != null) {
                if (nickName == null) {
                    nickName = "";
                }
                text1.setText("Transfer to ".concat(nickName));
            }
            TextView text2 = getText2();
            if (text2 != null) {
                text2.setText(PhoneBaseNumberUtils.INSTANCE.formatMobileNumber(accountNo == null ? "" : accountNo, false));
            }
            r0.R1(getText2(), "fonts/PalmPayNum-Bold.ttf");
            ImageView header = getHeader();
            if (headerUrl == null) {
                headerUrl = "";
            }
            r0.m1(headerUrl, header);
            if (BaseApplication.hasLogin()) {
                if (accountNo == null) {
                    accountNo = "";
                }
                queryJumpParams(new ShareAccountDetailReq(type, accountNo));
            } else {
                TextView text3 = getText3();
                if (text3 != null) {
                    text3.setOnClickListener(new q(type, accountNo, 0));
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(Ac.f.main_dialog_send_money_handler_home);
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(32.0f);
        }
        if (attributes != null) {
            attributes.height = -2;
        }
        setCancelable(false);
        getClose().setOnClickListener(new A8.b(this, 12));
    }
}
