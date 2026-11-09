package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import C9.C0155w;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolNoLockFragment;
import com.transsnet.palmpay.custom_view.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p220oa.h;
import p221ob.c;
import p355xf.C2131j;
import p355xf.t;
import p382zb.C2168k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcProtocolNoLockFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcProtocolNoLockFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30485j;

    public OcProtocolNoLockFragment() {
        final int i7 = 0;
        this.f30484i = C2131j.b(new Function0(this) { // from class: zb.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolNoLockFragment f44592b;

            {
                this.f44592b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f44592b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.introduce_proto_tv);
                        }
                        return null;
                    default:
                        View view2 = this.f44592b.f27318b;
                        if (view2 != null) {
                            return (Button) view2.findViewById(e.next_bt);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f30485j = C2131j.b(new Function0(this) { // from class: zb.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcProtocolNoLockFragment f44592b;

            {
                this.f44592b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f44592b.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(e.introduce_proto_tv);
                        }
                        return null;
                    default:
                        View view2 = this.f44592b.f27318b;
                        if (view2 != null) {
                            return (Button) view2.findViewById(e.next_bt);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_oc_protocol_no_lock_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        showLoadingDialog(true);
        G.h(c.f40268a).getFinanceData(Boolean.TRUE).k(p298tf.f.f42629b).i(b.a()).subscribe(new C2168k(this, 6));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Context context = getContext();
        if (context != null) {
            ArrayList arrayList = new ArrayList();
            ApplyProtoContent applyProtoContent = new ApplyProtoContent(0, "I've read and agreed to ");
            ApplyProtoContent applyProtoContent2 = new ApplyProtoContent(1, "Flexi Terms & Conditions");
            ApplyProtoContent applyProtoContent3 = new ApplyProtoContent(1, ", ");
            ApplyProtoContent applyProtoContent4 = new ApplyProtoContent(2, "Privacy Policy");
            new ApplyProtoContent(2, ", ");
            new ApplyProtoContent(3, "The 3rd Party Services Authorization & Disclaimer");
            new ApplyProtoContent(6, ", ");
            new ApplyProtoContent(6, "Flexi Cash Terms and Conditions ");
            ApplyProtoContent applyProtoContent5 = new ApplyProtoContent(7, ",  ");
            ApplyProtoContent applyProtoContent6 = new ApplyProtoContent(8, "OneLoop Terms & Privacy Policy ");
            arrayList.add(applyProtoContent);
            arrayList.add(applyProtoContent2);
            arrayList.add(applyProtoContent3);
            arrayList.add(applyProtoContent4);
            arrayList.add(applyProtoContent5);
            arrayList.add(applyProtoContent6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            int length = 0;
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                ApplyProtoContent applyProtoContent7 = (ApplyProtoContent) next;
                spannableStringBuilder.append((CharSequence) applyProtoContent7.content);
                Integer num = applyProtoContent7.clickType;
                if (num == null || num.intValue() != 0) {
                    spannableStringBuilder.setSpan(new C0155w(this, applyProtoContent7, context), length, spannableStringBuilder.length(), 33);
                }
                length = spannableStringBuilder.length() - 1;
            }
            t tVar = this.f30484i;
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                textView.setText(spannableStringBuilder);
            }
            TextView textView2 = (TextView) tVar.getValue();
            if (textView2 != null) {
                textView2.setHighlightColor(context.getColor(p.transparent));
            }
            TextView textView3 = (TextView) tVar.getValue();
            if (textView3 != null) {
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        Button button = (Button) this.f30485j.getValue();
        if (button != null) {
            h.l(new p327vd.c(this, 22), button);
        }
        return 0;
    }
}
