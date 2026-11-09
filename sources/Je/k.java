package Je;

import android.view.View;
import android.view.ViewStub;
import com.palmpay.lib.ui.picker.picker.date.BaseDatePickerFragment;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4821a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4822b;

    public k(View view) {
        this.f4822b = view;
    }

    public void a(boolean z3) {
        View view = this.f4822b;
        if (view != null) {
            p220oa.h.s(view, z3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f4822b;
        switch (this.f4821a) {
            case 0:
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
                break;
            case 1:
                view2.setClickable(false);
                view2.postDelayed(new X6.a(view2, 7), 2000L);
                break;
            default:
                view2.setClickable(false);
                int i7 = BaseDatePickerFragment.f24513j;
                Calendar.getInstance().getTimeInMillis();
                view2.postDelayed(new X6.a(view2, 8), 2000L);
                break;
        }
    }

    public k(View view, BaseDatePickerFragment baseDatePickerFragment) {
        this.f4822b = view;
    }

    public k(ViewStub viewStub) {
        Intrinsics.checkNotNullParameter(viewStub, "viewStub");
        View viewInflate = viewStub.inflate();
        this.f4822b = viewInflate;
        if (viewInflate != null) {
            viewInflate.findViewById(Ac.e.btnVerify).setOnClickListener(this);
            viewInflate.getRootView().setOnClickListener(this);
        }
    }
}
