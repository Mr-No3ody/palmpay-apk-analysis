package p263r4;

import android.content.Context;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import com.flexibank.sdk.customview.model.FlexiBankBaseLayoutLifecycleOwner;
import com.flexibank.sdk.s;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import p215o4.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b implements FlexiBankBaseLayoutLifecycleOwner {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1212w f41564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f41565f;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, int i7) {
        int i10 = s.fb_BaseDialogTheme;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, i7, i10);
        C1212w c1212w = new C1212w(this);
        c1212w.g(EnumC1204n.f17462c);
        this.f41564e = c1212w;
        this.f41565f = new ArrayList();
    }

    @Override // com.flexibank.sdk.customview.model.FlexiBankBaseLayoutLifecycleOwner
    public final void addJob(Job job) {
        this.f41565f.add(job);
    }

    @Override // p215o4.b, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C1212w c1212w = this.f41564e;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17462c);
        }
        for (Job job : this.f41565f) {
            if (job != null && job.isActive()) {
                job.cancel((CancellationException) null);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final AbstractC1205o getLifecycle() {
        return this.f41564e;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        C1212w c1212w = this.f41564e;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17463d);
        }
    }
}
