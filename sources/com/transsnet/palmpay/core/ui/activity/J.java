package com.transsnet.palmpay.core.ui.activity;

import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.fragment.app.DialogFragment;
import com.transsnet.palmpay.ui.activity.RateAppActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f27658b;

    public /* synthetic */ J(DialogFragment dialogFragment, int i7) {
        this.f27657a = i7;
        this.f27658b = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent event) {
        DialogFragment dialogFragment = this.f27658b;
        switch (this.f27657a) {
            case 0:
                CoreReceiptShareActivity.ReceiptFragment receiptFragment = (CoreReceiptShareActivity.ReceiptFragment) dialogFragment;
                if (i7 != 4 || event.getAction() != 1) {
                    return false;
                }
                receiptFragment.dismissAllowingStateLoss();
                if (receiptFragment.getActivity() != null) {
                    receiptFragment.getActivity().finish();
                }
                return true;
            default:
                RateAppActivity.RateFragment.a aVar = RateAppActivity.RateFragment.f34562d;
                Intrinsics.checkNotNullParameter(event, "event");
                if (i7 != 4 || event.getAction() != 1) {
                    return false;
                }
                RateAppActivity.RateFragment rateFragment = (RateAppActivity.RateFragment) dialogFragment;
                rateFragment.dismissAllowingStateLoss();
                androidx.fragment.app.E activity = rateFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return true;
        }
    }
}
