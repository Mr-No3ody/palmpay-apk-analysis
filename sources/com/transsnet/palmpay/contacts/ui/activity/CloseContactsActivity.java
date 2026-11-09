package com.transsnet.palmpay.contacts.ui.activity;

import R9.d;
import R9.e;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.contacts.ui.fragment.CloseContactsFragment;
import com.transsnet.palmpay.core.base.h;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/close_contact")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/activity/CloseContactsActivity;", "Lcom/transsnet/palmpay/core/base/h;", "<init>", "()V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CloseContactsActivity extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27162a = true;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_close_contacts_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        p220oa.h.i(this, d.fragmentContainer, new CloseContactsFragment());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        ARouter.getInstance().inject(this);
    }
}
