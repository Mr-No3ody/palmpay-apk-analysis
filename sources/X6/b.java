package X6;

import C9.V;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends V6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void e(N6.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        setContentView(binding.f6085a);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(L6.i.pp_dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = p377z5.l.k(window.getContext());
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        TextView tvNegative = (TextView) binding.f6087c.f749c;
        Intrinsics.checkNotNullExpressionValue(tvNegative, "tvNegative");
        tvNegative.setOnClickListener(new V(6, tvNegative, this));
        String str = this.f11005c;
        TextView textView = binding.f6088d.f6098c;
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setText(getContext().getString(L6.h.lib_ui_picker_date_dialog_title));
        }
    }
}
