package com.transsnet.palmpay.core.dialog;

import Ad.L;
import android.content.Context;
import android.graphics.Color;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.dialog.RemindTimeSelectDialog;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p141j9.C1794b;
import p185ma.m;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002BCB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nR#\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0018\u001a\n \u000e*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001b\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R$\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R.\u0010<\u001a\u0004\u0018\u00010;2\b\u0010,\u001a\u0004\u0018\u00010;8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/RemindTimeSelectDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "chooseClockData", "<init>", "(Landroid/content/Context;Z)V", "", "initViews", "()V", "show", "updateSelectItem", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "cdrt_confirm_tv$delegate", "Lkotlin/Lazy;", "getCdrt_confirm_tv", "()Landroid/widget/TextView;", "cdrt_confirm_tv", "Landroid/widget/ImageView;", "cdtr_close$delegate", "getCdtr_close", "()Landroid/widget/ImageView;", "cdtr_close", "cltr_title_tv$delegate", "getCltr_title_tv", "cltr_title_tv", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "periodTypes", "Ljava/util/ArrayList;", "timeWeeks", "timeMonth", "timeClock", "Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "wheelView", "Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "getWheelView", "()Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "setWheelView", "(Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;)V", "", "value", "modelSelected", "I", "getModelSelected", "()I", "setModelSelected", "(I)V", "dataSelected", "Ljava/lang/String;", "getDataSelected", "()Ljava/lang/String;", "setDataSelected", "(Ljava/lang/String;)V", "mChooseClockData", "Z", "Lcom/transsnet/palmpay/core/dialog/RemindTimeSelectDialog$Callback;", "callBack", "Lcom/transsnet/palmpay/core/dialog/RemindTimeSelectDialog$Callback;", "getCallBack", "()Lcom/transsnet/palmpay/core/dialog/RemindTimeSelectDialog$Callback;", "setCallBack", "(Lcom/transsnet/palmpay/core/dialog/RemindTimeSelectDialog$Callback;)V", "ma/m", "Callback", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemindTimeSelectDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private Callback callBack;

    /* JADX INFO: renamed from: cdrt_confirm_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdrt_confirm_tv;

    /* JADX INFO: renamed from: cdtr_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdtr_close;

    /* JADX INFO: renamed from: cltr_title_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cltr_title_tv;

    @NotNull
    private String dataSelected;
    private boolean mChooseClockData;
    private int modelSelected;

    @NotNull
    private final ArrayList<String> periodTypes;

    @NotNull
    private final ArrayList<String> timeClock;

    @NotNull
    private final ArrayList<String> timeMonth;

    @NotNull
    private final ArrayList<String> timeWeeks;
    public WheelView<String> wheelView;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/RemindTimeSelectDialog$Callback;", "", "onDataSelected", "", "model", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void onDataSelected(int model, @NotNull String data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindTimeSelectDialog(@NotNull Context context, boolean z3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.cdrt_confirm_tv = C2131j.b(new Function0(this) { // from class: ma.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RemindTimeSelectDialog f39610b;

            {
                this.f39610b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return RemindTimeSelectDialog.cdrt_confirm_tv_delegate$lambda$0(this.f39610b);
                    case 1:
                        return RemindTimeSelectDialog.cdtr_close_delegate$lambda$1(this.f39610b);
                    default:
                        return RemindTimeSelectDialog.cltr_title_tv_delegate$lambda$2(this.f39610b);
                }
            }
        });
        final int i10 = 1;
        this.cdtr_close = C2131j.b(new Function0(this) { // from class: ma.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RemindTimeSelectDialog f39610b;

            {
                this.f39610b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return RemindTimeSelectDialog.cdrt_confirm_tv_delegate$lambda$0(this.f39610b);
                    case 1:
                        return RemindTimeSelectDialog.cdtr_close_delegate$lambda$1(this.f39610b);
                    default:
                        return RemindTimeSelectDialog.cltr_title_tv_delegate$lambda$2(this.f39610b);
                }
            }
        });
        final int i11 = 2;
        this.cltr_title_tv = C2131j.b(new Function0(this) { // from class: ma.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RemindTimeSelectDialog f39610b;

            {
                this.f39610b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return RemindTimeSelectDialog.cdrt_confirm_tv_delegate$lambda$0(this.f39610b);
                    case 1:
                        return RemindTimeSelectDialog.cdtr_close_delegate$lambda$1(this.f39610b);
                    default:
                        return RemindTimeSelectDialog.cltr_title_tv_delegate$lambda$2(this.f39610b);
                }
            }
        });
        this.periodTypes = new ArrayList<>();
        this.timeWeeks = new ArrayList<>();
        this.timeMonth = new ArrayList<>();
        this.timeClock = new ArrayList<>();
        String[] strArr = m.f39611a;
        this.modelSelected = 1;
        this.dataSelected = "";
        this.mChooseClockData = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdrt_confirm_tv_delegate$lambda$0(RemindTimeSelectDialog remindTimeSelectDialog) {
        return (TextView) remindTimeSelectDialog.findViewById(p025ba.e.cdrt_confirm_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView cdtr_close_delegate$lambda$1(RemindTimeSelectDialog remindTimeSelectDialog) {
        return (ImageView) remindTimeSelectDialog.findViewById(p025ba.e.cdtr_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cltr_title_tv_delegate$lambda$2(RemindTimeSelectDialog remindTimeSelectDialog) {
        return (TextView) remindTimeSelectDialog.findViewById(p025ba.e.cltr_title_tv);
    }

    private final TextView getCdrt_confirm_tv() {
        return (TextView) this.cdrt_confirm_tv.getValue();
    }

    private final ImageView getCdtr_close() {
        return (ImageView) this.cdtr_close.getValue();
    }

    private final TextView getCltr_title_tv() {
        return (TextView) this.cltr_title_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(RemindTimeSelectDialog remindTimeSelectDialog, int i7, String str) {
        Intrinsics.e(str);
        remindTimeSelectDialog.dataSelected = str;
        remindTimeSelectDialog.getCltr_title_tv().setText(str);
    }

    @Nullable
    public final Callback getCallBack() {
        return this.callBack;
    }

    @NotNull
    public final String getDataSelected() {
        return this.dataSelected;
    }

    public final int getModelSelected() {
        return this.modelSelected;
    }

    @NotNull
    public final WheelView<String> getWheelView() {
        WheelView<String> wheelView = this.wheelView;
        if (wheelView != null) {
            return wheelView;
        }
        Intrinsics.n("wheelView");
        throw null;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_remind_time);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        if (window != null) {
            window.setWindowAnimations(l.dialog_bottom_in_out);
        }
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.width = ScreenUtils.getScreenWidth();
        }
        if (attributes != null) {
            attributes.height = -2;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        if (this.mChooseClockData) {
            this.periodTypes.add("Every Day");
        }
        this.periodTypes.add("Every Week");
        this.periodTypes.add("Every Month");
        dc.b bVar = new dc.b();
        bVar.f35864a = 0;
        bVar.f35866c = Color.parseColor("#95a1ab");
        bVar.f35867d = this.mContext.getResources().getColor(L6.b.ppColorPrimary);
        bVar.f35868e = 18;
        bVar.f35869f = 23;
        bVar.f35865b = this.mContext.getResources().getColor(L6.b.ppColorPrimary);
        setWheelView((WheelView) findViewById(p025ba.e.wheel_view));
        getWheelView().setWheelAdapter(new L(this.mContext, 2, false));
        getWheelView().setWheelSize(3);
        getWheelView().setSkin(dc.a.f35861b);
        getWheelView().setWheelData(this.periodTypes);
        getWheelView().setSelection(0);
        getWheelView().setStyle(bVar);
        getWheelView().setOnWheelItemSelectedListener(new C1794b(this, 13));
        getCdrt_confirm_tv().setOnClickListener(new f(this));
        getCdtr_close().setOnClickListener(new p185ma.e(this, 2));
    }

    public final void setCallBack(@Nullable Callback callback) {
        this.callBack = callback;
    }

    public final void setDataSelected(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataSelected = str;
    }

    public final void setModelSelected(int i7) {
        this.modelSelected = i7;
        String[] strArr = m.f39611a;
        if (i7 == 1) {
            getWheelView().setWheelData(this.periodTypes);
            getCltr_title_tv().setText(this.periodTypes.get(0));
            String str = this.periodTypes.get(0);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            this.dataSelected = str;
            getWheelView().setSelection(0);
            return;
        }
        if (i7 == 2) {
            if (this.timeWeeks.isEmpty()) {
                int length = m.f39611a.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ArrayList<String> arrayList = this.timeWeeks;
                    String[] strArr2 = m.f39611a;
                    arrayList.add(m.f39611a[i10]);
                }
            }
            getWheelView().setWheelData(this.timeWeeks);
            String str2 = this.timeWeeks.get(0);
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            this.dataSelected = str2;
            return;
        }
        if (i7 == 3) {
            if (this.timeMonth.isEmpty()) {
                for (int i11 = 1; i11 < 32; i11++) {
                    this.timeMonth.add(String.valueOf(i11));
                }
            }
            getWheelView().setWheelData(this.timeMonth);
            String str3 = this.timeMonth.get(1);
            Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
            this.dataSelected = str3;
            return;
        }
        if (i7 == 4) {
            if (this.timeClock.isEmpty()) {
                int length2 = m.f39612b.length;
                for (int i12 = 0; i12 < length2; i12++) {
                    ArrayList<String> arrayList2 = this.timeClock;
                    String[] strArr3 = m.f39611a;
                    arrayList2.add(m.f39612b[i12]);
                }
            }
            getWheelView().setWheelData(this.timeClock);
            String str4 = this.timeClock.get(1);
            Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
            this.dataSelected = str4;
        }
    }

    public final void setWheelView(@NotNull WheelView<String> wheelView) {
        Intrinsics.checkNotNullParameter(wheelView, "<set-?>");
        this.wheelView = wheelView;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
    }

    public final void updateSelectItem() {
        getCltr_title_tv().setText(getWheelView().getSelectionItem());
        String selectionItem = getWheelView().getSelectionItem();
        Intrinsics.checkNotNullExpressionValue(selectionItem, "getSelectionItem(...)");
        this.dataSelected = selectionItem;
    }
}
