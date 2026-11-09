package com.transsnet.palmpay.core.ui.activity;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button;
import android.widget.EditText;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/input_card_pin_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/InputCardPinActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InputCardPinActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f27654c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f27655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f27656b;

    public InputCardPinActivity() {
        final int i7 = 0;
        this.f27655a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputCardPinActivity f27733b;

            {
                this.f27733b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputCardPinActivity inputCardPinActivity = this.f27733b;
                switch (i7) {
                    case 0:
                        int i10 = InputCardPinActivity.f27654c;
                        return (Button) inputCardPinActivity.findViewById(L9.a.pin_next_bt);
                    default:
                        int i11 = InputCardPinActivity.f27654c;
                        return (EditText) inputCardPinActivity.findViewById(L9.a.input_card_pin_et);
                }
            }
        });
        final int i10 = 1;
        this.f27656b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputCardPinActivity f27733b;

            {
                this.f27733b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputCardPinActivity inputCardPinActivity = this.f27733b;
                switch (i10) {
                    case 0:
                        int i11 = InputCardPinActivity.f27654c;
                        return (Button) inputCardPinActivity.findViewById(L9.a.pin_next_bt);
                    default:
                        int i12 = InputCardPinActivity.f27654c;
                        return (EditText) inputCardPinActivity.findViewById(L9.a.input_card_pin_et);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_input_card_pin_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((EditText) this.f27656b.getValue()).addTextChangedListener(new R3.e(this, 12));
        ((Button) this.f27655a.getValue()).setOnClickListener(new Yd.i(this, 25));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        ((EditText) this.f27656b.getValue()).setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
}
