package Ad;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ad.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC0066m extends com.transsnet.palmpay.custom_view.dialog.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0066m(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setContentView(p159kd.f.sm_dialog_bank_customer_phone);
        this.f234b = (TextView) findViewById(p159kd.e.tv_confirm);
        this.f235c = (TextView) findViewById(p159kd.e.tv_content);
        this.f236d = (TextView) findViewById(p159kd.e.tv_title);
        this.f237e = (ImageView) findViewById(p159kd.e.iv_bank_logo);
        IconicsImageView iconicsImageView = (IconicsImageView) findViewById(p159kd.e.iv_close);
        if (iconicsImageView != null) {
            iconicsImageView.setOnClickListener(new A8.b(this, 4));
        }
    }
}
